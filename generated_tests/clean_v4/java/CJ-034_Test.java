import org.joda.time.base.AbstractInterval;
import org.joda.time.ReadableInterval;
import org.joda.time.Interval;
import org.joda.time.DateTime;
import org.joda.time.Chronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractIntervalTest {

    private class TestInterval extends AbstractInterval {
        private final long startMillis;
        private final long endMillis;
        private final Chronology chronology;

        protected TestInterval(long startMillis, long endMillis, Chronology chronology) {
            super();
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
        TestInterval interval = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        assertTrue(interval.equals(interval));
    }

    @Test
    void testEquals_DifferentType() {
        TestInterval interval = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        assertFalse(interval.equals("Not an interval"));
    }

    @Test
    void testEquals_Null() {
        TestInterval interval = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        assertFalse(interval.equals(null));
    }

    @Test
    void testEquals_DifferentStartMillis() {
        TestInterval interval1 = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        TestInterval interval2 = new TestInterval(1500L, 2000L, ISOChronology.getInstance());
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentEndMillis() {
        TestInterval interval1 = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        TestInterval interval2 = new TestInterval(1000L, 2500L, ISOChronology.getInstance());
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentChronology() {
        TestInterval interval1 = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        TestInterval interval2 = new TestInterval(1000L, 2000L, Chronology.getISOCronology());
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_SameValues() {
        TestInterval interval1 = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        TestInterval interval2 = new TestInterval(1000L, 2000L, ISOChronology.getInstance());
        assertTrue(interval1.equals(interval2));
    }
}