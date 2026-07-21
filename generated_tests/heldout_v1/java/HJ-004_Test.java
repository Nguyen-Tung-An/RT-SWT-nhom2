package org.joda.time.format;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void testParseInto_ValidDigits() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        Fraction fraction = new Fraction(DateTimeFieldType.millisOfSecond(), 3);
        int result = fraction.parseInto(bucket, "123", 0);
        assertEquals(3, result);
        assertEquals(123, bucket.getSavedField(DateTimeFieldType.millisOfSecond()));
    }

    @Test
    void testParseInto_EmptyString() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        Fraction fraction = new Fraction(DateTimeFieldType.millisOfSecond(), 3);
        int result = fraction.parseInto(bucket, "", 0);
        assertEquals(~0, result);
    }

    @Test
    void testParseInto_NonDigitCharacter() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        Fraction fraction = new Fraction(DateTimeFieldType.millisOfSecond(), 3);
        int result = fraction.parseInto(bucket, "12a34", 0);
        assertEquals(2, result);
        assertEquals(120, bucket.getSavedField(DateTimeFieldType.millisOfSecond()));
    }

    @Test
    void testParseInto_ExceedsIntegerMaxValue() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        Fraction fraction = new Fraction(DateTimeFieldType.millisOfSecond(), 3);
        int result = fraction.parseInto(bucket, "9999999999", 0);
        assertEquals(~0, result);
    }

    @Test
    void testParseInto_LeadingZeros() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(0, null);
        Fraction fraction = new Fraction(DateTimeFieldType.millisOfSecond(), 3);
        int result = fraction.parseInto(bucket, "000123", 0);
        assertEquals(6, result);
        assertEquals(123, bucket.getSavedField(DateTimeFieldType.millisOfSecond()));
    }
}