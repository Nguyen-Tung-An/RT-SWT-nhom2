import org.jfree.data.statistics.HistogramBin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HistogramBinTest {

    @Test
    void testEqualsWithSameObject() {
        HistogramBin bin = new HistogramBin(1.0, 2.0);
        assertTrue(bin.equals(bin), "An object should equal itself");
    }

    @Test
    void testEqualsWithNull() {
        HistogramBin bin = new HistogramBin(1.0, 2.0);
        assertFalse(bin.equals(null), "An object should not equal null");
    }

    @Test
    void testEqualsWithDifferentClass() {
        HistogramBin bin = new HistogramBin(1.0, 2.0);
        String differentClassObject = "Not a HistogramBin";
        assertFalse(bin.equals(differentClassObject), "An object should not equal an instance of a different class");
    }

    @Test
    void testEqualsWithDifferentValues() {
        HistogramBin bin1 = new HistogramBin(1.0, 2.0);
        HistogramBin bin2 = new HistogramBin(2.0, 3.0);
        assertFalse(bin1.equals(bin2), "Different HistogramBins should not be equal");
    }

    @Test
    void testEqualsWithSameValues() {
        HistogramBin bin1 = new HistogramBin(1.0, 2.0);
        HistogramBin bin2 = new HistogramBin(1.0, 2.0);
        assertTrue(bin1.equals(bin2), "HistogramBins with the same values should be equal");
    }

    @Test
    void testEqualsWithDifferentBinCounts() {
        HistogramBin bin1 = new HistogramBin(1.0, 2.0, 5);
        HistogramBin bin2 = new HistogramBin(1.0, 2.0, 10);
        assertFalse(bin1.equals(bin2), "HistogramBins with the same range but different counts should not be equal");
    }
}