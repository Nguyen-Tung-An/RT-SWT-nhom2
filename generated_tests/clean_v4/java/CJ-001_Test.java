import org.jfree.chart.plot.compass.MeterNeedle;
import org.junit.jupiter.api.Test;
import java.awt.Paint;
import java.awt.Color;
import static org.junit.jupiter.api.Assertions.*;

class MeterNeedleTest {

    @Test
    void testEquals_SameInstance() {
        MeterNeedle needle = new MeterNeedle();
        assertTrue(needle.equals(needle));
    }

    @Test
    void testEquals_DifferentClass() {
        MeterNeedle needle = new MeterNeedle();
        String notAMeterNeedle = "Not a MeterNeedle";
        assertFalse(needle.equals(notAMeterNeedle));
    }

    @Test
    void testEquals_NullObject() {
        MeterNeedle needle = new MeterNeedle();
        assertFalse(needle.equals(null));
    }

    @Test
    void testEquals_DifferentOutlinePaint() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.BLUE, Color.GREEN, Color.BLUE);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentOutlineStroke() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, null, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.RED, new Object(), Color.BLUE);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentFillPaint() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.RED, Color.GREEN, Color.YELLOW);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentHighlightPaint() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.RED, Color.GREEN, Color.RED);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentSize() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        needle1.size = 5;
        needle2.size = 10;
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentRotateX() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        needle1.rotateX = 1;
        needle2.rotateX = 2;
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentRotateY() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        needle1.rotateY = 1;
        needle2.rotateY = 2;
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_SameProperties() {
        MeterNeedle needle1 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        MeterNeedle needle2 = new MeterNeedle(Color.RED, Color.GREEN, Color.BLUE);
        assertTrue(needle1.equals(needle2));
    }
}