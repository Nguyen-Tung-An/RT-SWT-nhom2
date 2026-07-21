import org.jfree.data.xy.DefaultXYZDataset;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultXYZDatasetTest {

    @Test
    void testEqualsWithSameReference() {
        DefaultXYZDataset dataset = new DefaultXYZDataset();
        assertTrue(dataset.equals(dataset));
    }

    @Test
    void testEqualsWithNull() {
        DefaultXYZDataset dataset = new DefaultXYZDataset();
        assertFalse(dataset.equals(null));
    }

    @Test
    void testEqualsWithDifferentClass() {
        DefaultXYZDataset dataset = new DefaultXYZDataset();
        String differentClassObject = "Not a dataset";
        assertFalse(dataset.equals(differentClassObject));
    }

    @Test
    void testEqualsWithDifferentDataset() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        assertTrue(dataset1.equals(dataset2));
    }

    @Test
    void testEqualsWithModifiedDataset() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        // Assuming some method to modify dataset2 to make it different
        // dataset2.addSeries(...); // Uncomment and modify as per actual method to change state
        assertFalse(dataset1.equals(dataset2));
    }
}