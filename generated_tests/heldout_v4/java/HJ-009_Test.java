package org.jfree.chart.renderer.xy;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.RectangleEdge;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.assertTrue;

class XYLineAndShapeRendererTest {

    @Test
    void testDrawPrimaryLineAsPath_ValidData() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
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
        Mockito.when(state.getLastItemIndex()).thenReturn(0);
        Mockito.when(state.isLastPointGood()).thenReturn(false);

        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        Mockito.verify(state).setLastPointGood(true);
        Mockito.verify(state).seriesPath.moveTo(50.0f, 50.0f);
        Mockito.verify(g2).draw(Mockito.any());
    }

    @Test
    void testDrawPrimaryLineAsPath_NaNData() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYItemRendererState state = Mockito.mock(XYItemRendererState.class);
        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        XYPlot plot = Mockito.mock(XYPlot.class);
        XYDataset dataset = Mockito.mock(XYDataset.class);
        ValueAxis domainAxis = Mockito.mock(ValueAxis.class);
        ValueAxis rangeAxis = Mockito.mock(ValueAxis.class);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        Mockito.when(dataset.getXValue(0, 0)).thenReturn(Double.NaN);
        Mockito.when(dataset.getYValue(0, 0)).thenReturn(Double.NaN);
        Mockito.when(domainAxis.valueToJava2D(Double.NaN, dataArea, RectangleEdge.BOTTOM)).thenReturn(Double.NaN);
        Mockito.when(rangeAxis.valueToJava2D(Double.NaN, dataArea, RectangleEdge.LEFT)).thenReturn(Double.NaN);
        Mockito.when(state.getLastItemIndex()).thenReturn(0);
        
        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        Mockito.verify(state).setLastPointGood(false);
    }

    @Test
    void testDrawPrimaryLineAsPath_LastItem() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
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
        Mockito.when(state.getLastItemIndex()).thenReturn(0);
        Mockito.when(state.isLastPointGood()).thenReturn(true);

        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        Mockito.verify(state).seriesPath.lineTo(50.0f, 50.0f);
        Mockito.verify(g2).draw(Mockito.any());
    }

    @Test
    void testDrawPrimaryLineAsPath_HorizontalOrientation() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
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
        Mockito.when(state.getLastItemIndex()).thenReturn(0);
        Mockito.when(state.isLastPointGood()).thenReturn(false);
        Mockito.when(plot.getOrientation()).thenReturn(PlotOrientation.HORIZONTAL);

        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        Mockito.verify(state).seriesPath.moveTo(50.0f, 50.0f);
        Mockito.verify(state).setLastPointGood(true);
    }
}