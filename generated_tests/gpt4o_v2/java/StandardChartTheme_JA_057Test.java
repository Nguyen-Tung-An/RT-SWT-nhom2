import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.PaintScaleLegend;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardChartThemeTest {

    private StandardChartTheme theme;

    @BeforeEach
    void setUp() {
        theme = new StandardChartTheme();
    }

    @Test
    void testApplyToTextTitle() {
        TextTitle title = new TextTitle("Sample Title");
        theme.applyToTitle(title);
        assertEquals(theme.largeFont, title.getFont());
        assertEquals(theme.subtitlePaint, title.getPaint());
    }

    @Test
    void testApplyToLegendTitleWithBackgroundPaint() {
        LegendTitle legendTitle = new LegendTitle();
        legendTitle.setBackgroundPaint(new java.awt.Color(255, 255, 255));
        theme.applyToTitle(legendTitle);
        assertEquals(theme.legendBackgroundPaint, legendTitle.getBackgroundPaint());
        assertEquals(theme.regularFont, legendTitle.getItemFont());
        assertEquals(theme.legendItemPaint, legendTitle.getItemPaint());
    }

    @Test
    void testApplyToLegendTitleWithoutBackgroundPaint() {
        LegendTitle legendTitle = new LegendTitle();
        legendTitle.setBackgroundPaint(null);
        theme.applyToTitle(legendTitle);
        assertNull(legendTitle.getBackgroundPaint());
        assertEquals(theme.regularFont, legendTitle.getItemFont());
        assertEquals(theme.legendItemPaint, legendTitle.getItemPaint());
    }

    @Test
    void testApplyToPaintScaleLegendWithAxis() {
        PaintScaleLegend paintScaleLegend = new PaintScaleLegend();
        paintScaleLegend.setBackgroundPaint(theme.legendBackgroundPaint);
        ValueAxis axis = new ValueAxis("Axis");
        paintScaleLegend.setAxis(axis);
        theme.applyToTitle(paintScaleLegend);
        assertEquals(theme.legendBackgroundPaint, paintScaleLegend.getBackgroundPaint());
        assertNotNull(paintScaleLegend.getAxis());
    }

    @Test
    void testApplyToPaintScaleLegendWithoutAxis() {
        PaintScaleLegend paintScaleLegend = new PaintScaleLegend();
        paintScaleLegend.setBackgroundPaint(theme.legendBackgroundPaint);
        paintScaleLegend.setAxis(null);
        theme.applyToTitle(paintScaleLegend);
        assertEquals(theme.legendBackgroundPaint, paintScaleLegend.getBackgroundPaint());
        assertNull(paintScaleLegend.getAxis());
    }

    @Test
    void testApplyToCompositeTitle() {
        CompositeTitle compositeTitle = new CompositeTitle();
        BlockContainer container = new BlockContainer();
        TextTitle title1 = new TextTitle("Title 1");
        TextTitle title2 = new TextTitle("Title 2");
        container.add(title1);
        container.add(title2);
        compositeTitle.setContainer(container);
        theme.applyToTitle(compositeTitle);
        assertEquals(theme.largeFont, title1.getFont());
        assertEquals(theme.subtitlePaint, title1.getPaint());
        assertEquals(theme.largeFont, title2.getFont());
        assertEquals(theme.subtitlePaint, title2.getPaint());
    }
}