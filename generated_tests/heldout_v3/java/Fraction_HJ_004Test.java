import org.joda.time.DateTimeField;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.DateTimeFieldType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeFormatterBuilderFractionTest {

    @Test
    public void testParseInto_ValidDigits() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "12345";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, text, position);

        assertEquals(5, result);
        assertEquals(1234, bucket.getSavedField(DateTimeFieldType.millisOfSecond()));
    }

    @Test
    public void testParseInto_LeadingNonDigit() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "abc123";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, text, position);

        assertEquals(~position, result);
    }

    @Test
    public void testParseInto_EmptyInput() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, text, position);

        assertEquals(~position, result);
    }

    @Test
    public void testParseInto_ExceedingMaxValue() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "9999999999"; // Exceeds Integer.MAX_VALUE
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, text, position);

        assertEquals(~position, result);
    }

    @Test
    public void testParseInto_BoundaryCondition() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null, null);
        CharSequence text = "1000"; // Exactly at the boundary
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, text, position);

        assertEquals(4, result);
        assertEquals(100, bucket.getSavedField(DateTimeFieldType.millisOfSecond()));
    }
}