import org.joda.time.field.BaseDateTimeField;
import org.joda.time.DateTimeFieldType;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDateTimeFieldTest {

    private class TestBaseDateTimeField extends BaseDateTimeField {
        private final int maxValue;

        protected TestBaseDateTimeField(DateTimeFieldType type, int maxValue) {
            super(type);
            this.maxValue = maxValue;
        }

        @Override
        public int getMaximumValue() {
            return maxValue;
        }
    }

    @Test
    public void testGetMaximumTextLength_LessThan10() {
        BaseDateTimeField instance = new TestBaseDateTimeField(DateTimeFieldType.dateTime(), 5);
        assertEquals(1, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    public void testGetMaximumTextLength_Between10And100() {
        BaseDateTimeField instance = new TestBaseDateTimeField(DateTimeFieldType.dateTime(), 50);
        assertEquals(2, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    public void testGetMaximumTextLength_Between100And1000() {
        BaseDateTimeField instance = new TestBaseDateTimeField(DateTimeFieldType.dateTime(), 500);
        assertEquals(3, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    public void testGetMaximumTextLength_Exactly1000() {
        BaseDateTimeField instance = new TestBaseDateTimeField(DateTimeFieldType.dateTime(), 1000);
        assertEquals(4, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    public void testGetMaximumTextLength_NegativeValue() {
        BaseDateTimeField instance = new TestBaseDateTimeField(DateTimeFieldType.dateTime(), -1);
        assertEquals(2, instance.getMaximumTextLength(Locale.ENGLISH));
    }
}