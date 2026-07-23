package org.jfree.data.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinuteTest {
    @Test
    void testEquals_SameInstance() {
        Minute minute = new Minute(10, 5);
        assertTrue(minute.equals(minute));
    }

    @Test
    void testEquals_DifferentType() {
        Minute minute = new Minute(10, 5);
        assertFalse(minute.equals("Not a Minute"));
    }

    @Test
    void testEquals_DifferentMinutes() {
        Minute minute1 = new Minute(10, 5);
        Minute minute2 = new Minute(15, 5);
        assertFalse(minute1.equals(minute2));
    }

    @Test
    void testEquals_DifferentHours() {
        Minute minute1 = new Minute(10, 5);
        Minute minute2 = new Minute(10, 6);
        assertFalse(minute1.equals(minute2));
    }

    @Test
    void testEquals_SameMinuteAndHour() {
        Minute minute1 = new Minute(10, 5);
        Minute minute2 = new Minute(10, 5);
        assertTrue(minute1.equals(minute2));
    }
}