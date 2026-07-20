package org.jfree.chart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StandardChartThemeTest {

    @Test
    void testApplyToTextTitle() {
        StandardChartTheme theme = new StandardChartTheme("TestTheme");
        TextTitle title = new TextTitle("Sample Title");
        theme.applyToTitle(title);
        assertEquals(theme.largeFont, title.getFont());
        assertEquals(theme.subtitlePaint, title.getPaint());
    }

    @Test
    void testApplyToLegendTitleWithBackgroundPaint() {
        StandardChartTheme theme = new StandardChartTheme("TestTheme");
        LegendTitle title = new LegendTitle("Sample Legend");
        title.setBackgroundPaint(java.awt.Color.RED);
        theme.applyToTitle(title);
        assertEquals(theme.legendBackgroundPaint, title.getBackgroundPaint());
        assertEquals(theme.regularFont, title.getItemFont());
        assertEquals(theme.legendItemPaint, title.getItemPaint());
    }

    @Test
    void testApplyToLegendTitleWithoutBackgroundPaint() {
        StandardChartTheme theme = new StandardChartTheme("TestTheme");
        LegendTitle title = new LegendTitle("Sample Legend");
        title.setBackgroundPaint(null);
        theme.applyToTitle(title);
        assertNull(title.getBackgroundPaint());
        assertEquals(theme.regularFont, title.getItemFont());
        assertEquals(theme.legendItemPaint, title.getItemPaint());
    }

    @Test
    void testApplyToPaintScaleLegend() {
        StandardChartTheme theme = new StandardChartTheme("TestTheme");
        PaintScaleLegend title = new PaintScaleLegend();
        title.setBackgroundPaint(java.awt.Color.BLUE);
        ValueAxis axis = new ValueAxis("Sample Axis");
        title.setAxis(axis);
        theme.applyToTitle(title);
        assertEquals(theme.legendBackgroundPaint, title.getBackgroundPaint());
        assertEquals(theme.largeFont, title.getFont());
        assertNotNull(axis);
    }

    @Test
    void testApplyToCompositeTitle() {
        StandardChartTheme theme = new StandardChartTheme("TestTheme");
        CompositeTitle compositeTitle = new CompositeTitle();
        TextTitle textTitle = new TextTitle("Composite Title");
        compositeTitle.add(textTitle);
        theme.applyToTitle(compositeTitle);
        assertEquals(theme.largeFont, textTitle.getFont());
        assertEquals(theme.subtitlePaint, textTitle.getPaint());
    }
}