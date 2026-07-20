import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.QuoteMode;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CSVFormatTest {

    @Test
    public void testPrintWithQuotesNoQuotes() throws Exception {
        CSVFormat instance = (CSVFormat) CSVFormat.class.getDeclaredConstructor().newInstance();
        Field quoteModeField = CSVFormat.class.getDeclaredField("quoteMode");
        quoteModeField.setAccessible(true);
        quoteModeField.set(instance, QuoteMode.NONE);

        Method m = CSVFormat.class.getDeclaredMethod("printWithQuotes", Reader.class, Appendable.class);
        m.setAccessible(true);

        StringReader reader = new StringReader("test");
        StringWriter writer = new StringWriter();
        m.invoke(instance, reader, writer);

        assertEquals("test", writer.toString());
    }

    @Test
    public void testPrintWithQuotesWithQuotes() throws Exception {
        CSVFormat instance = (CSVFormat) CSVFormat.class.getDeclaredConstructor().newInstance();
        Field quoteModeField = CSVFormat.class.getDeclaredField("quoteMode");
        quoteModeField.setAccessible(true);
        quoteModeField.set(instance, QuoteMode.MINIMAL);
        
        Field quoteCharField = CSVFormat.class.getDeclaredField("quoteChar");
        quoteCharField.setAccessible(true);
        quoteCharField.set(instance, '"');

        Field escapeCharField = CSVFormat.class.getDeclaredField("escapeChar");
        escapeCharField.setAccessible(true);
        escapeCharField.set(instance, '\\');

        Method m = CSVFormat.class.getDeclaredMethod("printWithQuotes", Reader.class, Appendable.class);
        m.setAccessible(true);

        StringReader reader = new StringReader("test \"quoted\" text");
        StringWriter writer = new StringWriter();
        m.invoke(instance, reader, writer);

        assertEquals("\"test \\\"quoted\\\" text\"", writer.toString());
    }

    @Test
    public void testPrintWithQuotesWithEscapeCharacter() throws Exception {
        CSVFormat instance = (CSVFormat) CSVFormat.class.getDeclaredConstructor().newInstance();
        Field quoteModeField = CSVFormat.class.getDeclaredField("quoteMode");
        quoteModeField.setAccessible(true);
        quoteModeField.set(instance, QuoteMode.MINIMAL);
        
        Field quoteCharField = CSVFormat.class.getDeclaredField("quoteChar");
        quoteCharField.setAccessible(true);
        quoteCharField.set(instance, '"');

        Field escapeCharField = CSVFormat.class.getDeclaredField("escapeChar");
        escapeCharField.setAccessible(true);
        escapeCharField.set(instance, '\\');

        Method m = CSVFormat.class.getDeclaredMethod("printWithQuotes", Reader.class, Appendable.class);
        m.setAccessible(true);

        StringReader reader = new StringReader("test \"quoted\" text with escape \\");
        StringWriter writer = new StringWriter();
        m.invoke(instance, reader, writer);

        assertEquals("\"test \\\"quoted\\\" text with escape \\\\\"", writer.toString());
    }

    @Test
    public void testPrintWithQuotesEmptyInput() throws Exception {
        CSVFormat instance = (CSVFormat) CSVFormat.class.getDeclaredConstructor().newInstance();
        Field quoteModeField = CSVFormat.class.getDeclaredField("quoteMode");
        quoteModeField.setAccessible(true);
        quoteModeField.set(instance, QuoteMode.MINIMAL);
        
        Field quoteCharField = CSVFormat.class.getDeclaredField("quoteChar");
        quoteCharField.setAccessible(true);
        quoteCharField.set(instance, '"');

        Method m = CSVFormat.class.getDeclaredMethod("printWithQuotes", Reader.class, Appendable.class);
        m.setAccessible(true);

        StringReader reader = new StringReader("");
        StringWriter writer = new StringWriter();
        m.invoke(instance, reader, writer);

        assertEquals("\"\"", writer.toString());
    }

    @Test
    public void testPrintWithQuotesNullReader() throws Exception {
        CSVFormat instance = (CSVFormat) CSVFormat.class.getDeclaredConstructor().newInstance();
        Field quoteModeField = CSVFormat.class.getDeclaredField("quoteMode");
        quoteModeField.setAccessible(true);
        quoteModeField.set(instance, QuoteMode.MINIMAL);
        
        Field quoteCharField = CSVFormat.class.getDeclaredField("quoteChar");
        quoteCharField.setAccessible(true);
        quoteCharField.set(instance, '"');

        Method m = CSVFormat.class.getDeclaredMethod("printWithQuotes", Reader.class, Appendable.class);
        m.setAccessible(true);

        StringWriter writer = new StringWriter();
        assertThrows(NullPointerException.class, () -> m.invoke(instance, null, writer));
    }
}