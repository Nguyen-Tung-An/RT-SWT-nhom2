package org.jfree.data.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinuteTest {

    @Test
    void testEquals_SameReference() {
        Minute minute = new Minute(30, new Hour(1));
        assertTrue(minute.equals(minute));
    }

    @Test
    void testEquals_NullObject() {
        Minute minute = new Minute(30, new Hour(1));
        assertFalse(minute.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        Minute minute = new Minute(30, new Hour(1));
        String notAMinute = "Not a Minute";
        assertFalse(minute.equals(notAMinute));
    }

    @Test
    void testEquals_DifferentMinute() {
        Minute minute1 = new Minute(30, new Hour(1));
        Minute minute2 = new Minute(45, new Hour(1));
        assertFalse(minute1.equals(minute2));
    }

    @Test
    void testEquals_DifferentHour() {
        Minute minute1 = new Minute(30, new Hour(1));
        Minute minute2 = new Minute(30, new Hour(2));
        assertFalse(minute1.equals(minute2));
    }

    @Test
    void testEquals_SameMinuteAndHour() {
        Minute minute1 = new Minute(30, new Hour(1));
        Minute minute2 = new Minute(30, new Hour(1));
        assertTrue(minute1.equals(minute2));
    }
}