import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryLineAnnotationTest {

    @Test
    void testEquals_SameInstance() {
        CategoryLineAnnotation annotation = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        assertTrue(annotation.equals(annotation));
    }

    @Test
    void testEquals_DifferentClass() {
        CategoryLineAnnotation annotation = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        assertFalse(annotation.equals("Not a CategoryLineAnnotation"));
    }

    @Test
    void testEquals_NullObject() {
        CategoryLineAnnotation annotation = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        assertFalse(annotation.equals(null));
    }

    @Test
    void testEquals_DifferentCategory1() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category2", 1.0, "Category2", 2.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentValue1() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 2.0, "Category2", 2.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentCategory2() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category3", 2.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentValue2() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 3.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentPaint() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, new Object(), null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentStroke() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, new Object());
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, new Object());
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_SameValues() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        assertTrue(annotation1.equals(annotation2));
    }
}