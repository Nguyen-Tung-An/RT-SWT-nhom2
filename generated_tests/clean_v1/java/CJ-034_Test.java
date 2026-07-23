package org.joda.time.base;

import org.joda.time.ReadableInterval;
import org.joda.time.Interval;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractIntervalTest {

    private class TestInterval extends AbstractInterval {
        private final long startMillis;
        private final long endMillis;
        private final Chronology chronology;

        public TestInterval(long startMillis, long endMillis, Chronology chronology) {
            this.startMillis = startMillis;
            this.endMillis = endMillis;
            this.chronology = chronology;
        }

        @Override
        public long getStartMillis() {
            return startMillis;
        }

        @Override
        public long getEndMillis() {
            return endMillis;
        }

        @Override
        public Chronology getChronology() {
            return chronology;
        }
    }

    @Test
    void testEquals_SameReference() {
        TestInterval interval = new TestInterval(0, 10, null);
        assertTrue(interval.equals(interval));
    }

    @Test
    void testEquals_DifferentType() {
        TestInterval interval = new TestInterval(0, 10, null);
        assertFalse(interval.equals("Not an interval"));
    }

    @Test
    void testEquals_EqualIntervals() {
        TestInterval interval1 = new TestInterval(0, 10, null);
        TestInterval interval2 = new TestInterval(0, 10, null);
        assertTrue(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentStartMillis() {
        TestInterval interval1 = new TestInterval(0, 10, null);
        TestInterval interval2 = new TestInterval(1, 10, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentEndMillis() {
        TestInterval interval1 = new TestInterval(0, 10, null);
        TestInterval interval2 = new TestInterval(0, 11, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentChronology() {
        TestInterval interval1 = new TestInterval(0, 10, null);
        TestInterval interval2 = new TestInterval(0, 10, Chronology.getISOCronology());
        assertFalse(interval1.equals(interval2));
    }
}