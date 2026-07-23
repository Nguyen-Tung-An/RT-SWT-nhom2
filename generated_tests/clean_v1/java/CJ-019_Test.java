package org.joda.time.chrono;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LimitChronologyTest {

    private final LimitChronology limitChronology = LimitChronology.getInstance(null, null, null);

    @Test
    void testWithZone_NullZone() {
        Chronology result = limitChronology.withZone(null);
        assertNotNull(result);
        assertEquals(DateTimeZone.getDefault(), result.getZone());
    }

    @Test
    void testWithZone_SameZone() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Chronology result = limitChronology.withZone(zone);
        assertSame(limitChronology, result);
    }

    @Test
    void testWithZone_UTCWithNonNulliWithUTC() {
        DateTimeZone zone = DateTimeZone.UTC;
        LimitChronology expectedChrono = LimitChronology.getInstance(null, null, null);
        limitChronology.iWithUTC = expectedChrono; // Simulate existing iWithUTC
        Chronology result = limitChronology.withZone(zone);
        assertSame(expectedChrono, result);
    }

    @Test
    void testWithZone_LowerLimitNotNull() {
        DateTime lowerLimit = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        limitChronology.iLowerLimit = lowerLimit;
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Chronology result = limitChronology.withZone(zone);
        assertNotNull(result);
        assertNotEquals(lowerLimit, limitChronology.iLowerLimit);
    }

    @Test
    void testWithZone_UpperLimitNotNull() {
        DateTime upperLimit = new DateTime(2020, 12, 31, 0, 0, DateTimeZone.UTC);
        limitChronology.iUpperLimit = upperLimit;
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Chronology result = limitChronology.withZone(zone);
        assertNotNull(result);
        assertNotEquals(upperLimit, limitChronology.iUpperLimit);
    }
}