package org.jfree.chart.renderer.xy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.*;

public class XYLineAndShapeRendererTest {

    @Test
    void testDrawPrimaryLineAsPath_LastPointGood() {
        XYItemRendererState state = Mockito.mock(XYItemRendererState.class);
        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        XYPlot plot = Mockito.mock(XYPlot.class);
        XYDataset dataset = Mockito.mock(XYDataset.class);
        ValueAxis domainAxis = Mockito.mock(ValueAxis.class);
        ValueAxis rangeAxis = Mockito.mock(ValueAxis.class);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        Mockito.when(dataset.getXValue(0, 0)).thenReturn(1.0);
        Mockito.when(dataset.getYValue(0, 0)).thenReturn(1.0);
        Mockito.when(domainAxis.valueToJava2D(1.0, dataArea, RectangleEdge.BOTTOM)).thenReturn(50.0);
        Mockito.when(rangeAxis.valueToJava2D(1.0, dataArea, RectangleEdge.LEFT)).thenReturn(50.0);
        Mockito.when(state.isLastPointGood()).thenReturn(true);
        Mockito.when(state.getLastItemIndex()).thenReturn(0);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        Mockito.verify(state).setLastPointGood(true);
        Mockito.verify(g2).draw(Mockito.any());
    }

    @Test
    void testDrawPrimaryLineAsPath_LastPointNotGood() {
        XYItemRendererState state = Mockito.mock(XYItemRendererState.class);
        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        XYPlot plot = Mockito.mock(XYPlot.class);
        XYDataset dataset = Mockito.mock(XYDataset.class);
        ValueAxis domainAxis = Mockito.mock(ValueAxis.class);
        ValueAxis rangeAxis = Mockito.mock(ValueAxis.class);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        Mockito.when(dataset.getXValue(0, 0)).thenReturn(1.0);
        Mockito.when(dataset.getYValue(0, 0)).thenReturn(1.0);
        Mockito.when(domainAxis.valueToJava2D(1.0, dataArea, RectangleEdge.BOTTOM)).thenReturn(Double.NaN);
        Mockito.when(rangeAxis.valueToJava2D(1.0, dataArea, RectangleEdge.LEFT)).thenReturn(Double.NaN);
        Mockito.when(state.isLastPointGood()).thenReturn(false);
        Mockito.when(state.getLastItemIndex()).thenReturn(0);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        Mockito.verify(state).setLastPointGood(false);
        Mockito.verify(g2, Mockito.never()).draw(Mockito.any());
    }

    @Test
    void testDrawPrimaryLineAsPath_HorizontalOrientation() {
        XYItemRendererState state = Mockito.mock(XYItemRendererState.class);
        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        XYPlot plot = Mockito.mock(XYPlot.class);
        XYDataset dataset = Mockito.mock(XYDataset.class);
        ValueAxis domainAxis = Mockito.mock(ValueAxis.class);
        ValueAxis rangeAxis = Mockito.mock(ValueAxis.class);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        Mockito.when(dataset.getXValue(0, 0)).thenReturn(1.0);
        Mockito.when(dataset.getYValue(0, 0)).thenReturn(1.0);
        Mockito.when(domainAxis.valueToJava2D(1.0, dataArea, RectangleEdge.BOTTOM)).thenReturn(50.0);
        Mockito.when(rangeAxis.valueToJava2D(1.0, dataArea, RectangleEdge.LEFT)).thenReturn(50.0);
        Mockito.when(state.isLastPointGood()).thenReturn(true);
        Mockito.when(state.getLastItemIndex()).thenReturn(0);
        Mockito.when(plot.getOrientation()).thenReturn(PlotOrientation.HORIZONTAL);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        Mockito.verify(state).setLastPointGood(true);
        Mockito.verify(g2).draw(Mockito.any());
    }
}