import org.jfree.data.statistics.HistogramBin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HistogramBinTest {

    @Test
    void testEquals_NullObject() {
        HistogramBin bin1 = new HistogramBin(0.0, 1.0, 5);
        assertFalse(bin1.equals(null));
    }

    @Test
    void testEquals_SameInstance() {
        HistogramBin bin1 = new HistogramBin(0.0, 1.0, 5);
        assertTrue(bin1.equals(bin1));
    }

    @Test
    void testEquals_DifferentClass() {
        HistogramBin bin1 = new HistogramBin(0.0, 1.0, 5);
        String notABin = "Not a HistogramBin";
        assertFalse(bin1.equals(notABin));
    }

    @Test
    void testEquals_SameValues() {
        HistogramBin bin1 = new HistogramBin(0.0, 1.0, 5);
        HistogramBin bin2 = new HistogramBin(0.0, 1.0, 5);
        assertTrue(bin1.equals(bin2));
    }

    @Test
    void testEquals_DifferentStartBoundary() {
        HistogramBin bin1 = new HistogramBin(0.0, 1.0, 5);
        HistogramBin bin2 = new HistogramBin(0.1, 1.0, 5);
        assertFalse(bin1.equals(bin2));
    }

    @Test
    void testEquals_DifferentEndBoundary() {
        HistogramBin bin1 = new HistogramBin(0.0, 1.0, 5);
        HistogramBin bin2 = new HistogramBin(0.0, 1.1, 5);
        assertFalse(bin1.equals(bin2));
    }

    @Test
    void testEquals_DifferentCount() {
        HistogramBin bin1 = new HistogramBin(0.0, 1.0, 5);
        HistogramBin bin2 = new HistogramBin(0.0, 1.0, 10);
        assertFalse(bin1.equals(bin2));
    }
}