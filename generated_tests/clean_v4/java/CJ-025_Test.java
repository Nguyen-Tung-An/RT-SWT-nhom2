import org.jfree.data.statistics.MeanAndStandardDeviation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeanAndStandardDeviationTest {

    @Test
    public void testEquals_SameReference() {
        MeanAndStandardDeviation msd = new MeanAndStandardDeviation(5.0, 2.0);
        assertTrue(msd.equals(msd));
    }

    @Test
    public void testEquals_DifferentType() {
        MeanAndStandardDeviation msd = new MeanAndStandardDeviation(5.0, 2.0);
        String notMeanAndStandardDeviation = "Not a MeanAndStandardDeviation";
        assertFalse(msd.equals(notMeanAndStandardDeviation));
    }

    @Test
    public void testEquals_NullObject() {
        MeanAndStandardDeviation msd = new MeanAndStandardDeviation(5.0, 2.0);
        assertFalse(msd.equals(null));
    }

    @Test
    public void testEquals_DifferentMean() {
        MeanAndStandardDeviation msd1 = new MeanAndStandardDeviation(5.0, 2.0);
        MeanAndStandardDeviation msd2 = new MeanAndStandardDeviation(6.0, 2.0);
        assertFalse(msd1.equals(msd2));
    }

    @Test
    public void testEquals_DifferentStandardDeviation() {
        MeanAndStandardDeviation msd1 = new MeanAndStandardDeviation(5.0, 2.0);
        MeanAndStandardDeviation msd2 = new MeanAndStandardDeviation(5.0, 3.0);
        assertFalse(msd1.equals(msd2));
    }

    @Test
    public void testEquals_SameValues() {
        MeanAndStandardDeviation msd1 = new MeanAndStandardDeviation(5.0, 2.0);
        MeanAndStandardDeviation msd2 = new MeanAndStandardDeviation(5.0, 2.0);
        assertTrue(msd1.equals(msd2));
    }
}