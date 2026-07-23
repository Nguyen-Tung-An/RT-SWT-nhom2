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
        assertEquals(limitChronology, result);
    }

    @Test
    void testWithZone_SameZone() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Chronology result = limitChronology.withZone(zone);
        assertNotNull(result);
        assertEquals(limitChronology, result);
    }

    @Test
    void testWithZone_UTCZone() {
        DateTimeZone zone = DateTimeZone.UTC;
        Chronology result = limitChronology.withZone(zone);
        assertNotNull(result);
        assertNotEquals(limitChronology, result);
    }

    @Test
    void testWithZone_DifferentZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Chronology result = limitChronology.withZone(zone);
        assertNotNull(result);
        assertNotEquals(limitChronology, result);
    }

    @Test
    void testWithZone_LowerLimitNotNull() {
        DateTime lowerLimit = new DateTime(2000, 1, 1, 0, 0, DateTimeZone.UTC);
        LimitChronology chronoWithLowerLimit = LimitChronology.getInstance(null, lowerLimit, null);
        Chronology result = chronoWithLowerLimit.withZone(DateTimeZone.forID("America/New_York"));
        assertNotNull(result);
    }

    @Test
    void testWithZone_UpperLimitNotNull() {
        DateTime upperLimit = new DateTime(2020, 1, 1, 0, 0, DateTimeZone.UTC);
        LimitChronology chronoWithUpperLimit = LimitChronology.getInstance(null, null, upperLimit);
        Chronology result = chronoWithUpperLimit.withZone(DateTimeZone.forID("America/New_York"));
        assertNotNull(result);
    }
}