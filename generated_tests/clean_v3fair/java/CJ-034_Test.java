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
    void testEquals_SameInstance() {
        TestInterval interval = new TestInterval(1000, 2000, null);
        assertTrue(interval.equals(interval));
    }

    @Test
    void testEquals_NullObject() {
        TestInterval interval = new TestInterval(1000, 2000, null);
        assertFalse(interval.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        TestInterval interval = new TestInterval(1000, 2000, null);
        assertFalse(interval.equals("Not an interval"));
    }

    @Test
    void testEquals_DifferentStartMillis() {
        TestInterval interval1 = new TestInterval(1000, 2000, null);
        TestInterval interval2 = new TestInterval(2000, 2000, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentEndMillis() {
        TestInterval interval1 = new TestInterval(1000, 2000, null);
        TestInterval interval2 = new TestInterval(1000, 3000, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentChronology() {
        TestInterval interval1 = new TestInterval(1000, 2000, null);
        TestInterval interval2 = new TestInterval(1000, 2000, Chronology.getISOCronology());
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_SameValues() {
        TestInterval interval1 = new TestInterval(1000, 2000, null);
        TestInterval interval2 = new TestInterval(1000, 2000, null);
        assertTrue(interval1.equals(interval2));
    }
}