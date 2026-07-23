import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.jfree.data.statistics.HistogramBin;

class HistogramBinTest {

    @Test
    void testEqualsWithNull() {
        HistogramBin bin = new HistogramBin(1.0, 2.0);
        assertFalse(bin.equals(null));
    }

    @Test
    void testEqualsWithSameInstance() {
        HistogramBin bin = new HistogramBin(1.0, 2.0);
        assertTrue(bin.equals(bin));
    }

    @Test
    void testEqualsWithDifferentType() {
        HistogramBin bin = new HistogramBin(1.0, 2.0);
        String notABin = "Not a HistogramBin";
        assertFalse(bin.equals(notABin));
    }

    @Test
    void testEqualsWithDifferentBoundaries() {
        HistogramBin bin1 = new HistogramBin(1.0, 2.0);
        HistogramBin bin2 = new HistogramBin(1.0, 3.0);
        assertFalse(bin1.equals(bin2));
    }

    @Test
    void testEqualsWithDifferentCount() {
        HistogramBin bin1 = new HistogramBin(1.0, 2.0);
        HistogramBin bin2 = new HistogramBin(1.0, 2.0);
        bin1.count = 5; // Assuming count is accessible for testing
        bin2.count = 10; // Assuming count is accessible for testing
        assertFalse(bin1.equals(bin2));
    }

    @Test
    void testEqualsWithSameValues() {
        HistogramBin bin1 = new HistogramBin(1.0, 2.0);
        HistogramBin bin2 = new HistogramBin(1.0, 2.0);
        bin1.count = 5; // Assuming count is accessible for testing
        bin2.count = 5; // Assuming count is accessible for testing
        assertTrue(bin1.equals(bin2));
    }
}