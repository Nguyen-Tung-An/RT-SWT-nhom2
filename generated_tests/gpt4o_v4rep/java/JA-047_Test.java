import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.junit.jupiter.api.Test;

import java.awt.Paint;
import java.awt.Stroke;

import static org.junit.jupiter.api.Assertions.*;

class CategoryLineAnnotationTest {

    @Test
    void testEquals_SameObject() {
        CategoryLineAnnotation annotation = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, null);
        assertTrue(annotation.equals(annotation));
    }

    @Test
    void testEquals_DifferentType() {
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
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category3", 1.0, "Category2", 2.0, null, null);
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
        Paint paint1 = new Paint() {};
        Paint paint2 = new Paint() {};
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, paint1, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, paint2, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentStroke() {
        Stroke stroke1 = new Stroke() {};
        Stroke stroke2 = new Stroke() {};
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, stroke1);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, null, stroke2);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_SameValues() {
        Paint paint = new Paint() {};
        Stroke stroke = new Stroke() {};
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, paint, stroke);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("Category1", 1.0, "Category2", 2.0, paint, stroke);
        assertTrue(annotation1.equals(annotation2));
    }
}