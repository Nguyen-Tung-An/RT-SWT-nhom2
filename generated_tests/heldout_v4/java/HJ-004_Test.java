import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateTimeFormatterBuilderFractionTest {

    @Test
    public void testParseInto_ValidInput() {
        DateTimeFieldType fieldType = DateTimeFieldType.millisOfSecond();
        DateTimeFormatterBuilder.Fraction fraction = new DateTimeFormatterBuilder.Fraction(fieldType, 1, 3);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "123";
        int position = 0;

        int result = fraction.parseInto(bucket, text, position);

        assertEquals(3, result);
    }

    @Test
    public void testParseInto_EmptyInput() {
        DateTimeFieldType fieldType = DateTimeFieldType.millisOfSecond();
        DateTimeFormatterBuilder.Fraction fraction = new DateTimeFormatterBuilder.Fraction(fieldType, 1, 3);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "";
        int position = 0;

        int result = fraction.parseInto(bucket, text, position);

        assertEquals(~position, result);
    }

    @Test
    public void testParseInto_NonNumericInput() {
        DateTimeFieldType fieldType = DateTimeFieldType.millisOfSecond();
        DateTimeFormatterBuilder.Fraction fraction = new DateTimeFormatterBuilder.Fraction(fieldType, 1, 3);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "abc";
        int position = 0;

        int result = fraction.parseInto(bucket, text, position);

        assertEquals(~position, result);
    }

    @Test
    public void testParseInto_ExceedingMaxDigits() {
        DateTimeFieldType fieldType = DateTimeFieldType.millisOfSecond();
        DateTimeFormatterBuilder.Fraction fraction = new DateTimeFormatterBuilder.Fraction(fieldType, 1, 2);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "12345";
        int position = 0;

        int result = fraction.parseInto(bucket, text, position);

        assertEquals(2, result);
    }

    @Test
    public void testParseInto_ValueExceedsIntegerMaxValue() {
        DateTimeFieldType fieldType = DateTimeFieldType.millisOfSecond();
        DateTimeFormatterBuilder.Fraction fraction = new DateTimeFormatterBuilder.Fraction(fieldType, 1, 3);
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "9999999999"; // This will exceed Integer.MAX_VALUE
        int position = 0;

        int result = fraction.parseInto(bucket, text, position);

        assertEquals(~position, result);
    }
}