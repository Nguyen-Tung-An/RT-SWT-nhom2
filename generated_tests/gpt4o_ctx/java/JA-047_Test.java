package org.jfree.chart.annotations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Paint;
import java.awt.Stroke;

public class CategoryLineAnnotationTest {

    @Test
    void testEquals_SameInstance() {
        CategoryLineAnnotation annotation = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, null);
        assertTrue(annotation.equals(annotation));
    }

    @Test
    void testEquals_DifferentClass() {
        CategoryLineAnnotation annotation = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, null);
        assertFalse(annotation.equals("Not a CategoryLineAnnotation"));
    }

    @Test
    void testEquals_DifferentCategory1() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("C", 1.0, "B", 2.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentValue1() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("A", 3.0, "B", 2.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentCategory2() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("A", 1.0, "C", 2.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentValue2() {
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("A", 1.0, "B", 3.0, null, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentPaint() {
        Paint paint1 = new java.awt.Color(255, 0, 0);
        Paint paint2 = new java.awt.Color(0, 255, 0);
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, paint1, null);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, paint2, null);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_DifferentStroke() {
        Stroke stroke1 = new java.awt.BasicStroke(1.0f);
        Stroke stroke2 = new java.awt.BasicStroke(2.0f);
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, stroke1);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, null, stroke2);
        assertFalse(annotation1.equals(annotation2));
    }

    @Test
    void testEquals_SameValues() {
        Paint paint = new java.awt.Color(255, 0, 0);
        Stroke stroke = new java.awt.BasicStroke(1.0f);
        CategoryLineAnnotation annotation1 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, paint, stroke);
        CategoryLineAnnotation annotation2 = new CategoryLineAnnotation("A", 1.0, "B", 2.0, paint, stroke);
        assertTrue(annotation1.equals(annotation2));
    }
}