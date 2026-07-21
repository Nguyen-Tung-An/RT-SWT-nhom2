import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeFormatterBuilderFractionTest {

    @Test
    public void testParseInto_ValidFraction() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        CharSequence input = "0.123";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, input, position);

        assertEquals(0.123, bucket.getFraction(), 0.001);
        assertEquals(5, result);
    }

    @Test
    public void testParseInto_EmptyInput() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        CharSequence input = "";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, input, position);

        assertEquals(0.0, bucket.getFraction(), 0.001);
        assertEquals(-1, result);
    }

    @Test
    public void testParseInto_InvalidFraction() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        CharSequence input = "abc";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, input, position);

        assertEquals(0.0, bucket.getFraction(), 0.001);
        assertEquals(-1, result);
    }

    @Test
    public void testParseInto_NegativeFraction() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        CharSequence input = "-0.456";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, input, position);

        assertEquals(-0.456, bucket.getFraction(), 0.001);
        assertEquals(5, result);
    }

    @Test
    public void testParseInto_BoundaryFraction() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        CharSequence input = "1.0";
        int position = 0;

        int result = new DateTimeFormatterBuilder.Fraction().parseInto(bucket, input, position);

        assertEquals(1.0, bucket.getFraction(), 0.001);
        assertEquals(3, result);
    }
}