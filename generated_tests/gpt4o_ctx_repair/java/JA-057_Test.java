package org.jfree.chart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.PaintScaleLegend;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.plot.ValueAxis;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.Block;
import java.awt.Font;
import java.awt.Paint;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardChartThemeTest {
    private StandardChartTheme theme;
    private Font largeFont;
    private Paint subtitlePaint;
    private Paint legendBackgroundPaint;
    private Font regularFont;
    private Paint legendItemPaint;

    @BeforeEach
    void setUp() {
        theme = new StandardChartTheme("TestTheme");
        largeFont = new Font("Arial", Font.PLAIN, 12);
        subtitlePaint = mock(Paint.class);
        legendBackgroundPaint = mock(Paint.class);
        regularFont = new Font("Arial", Font.PLAIN, 10);
        legendItemPaint = mock(Paint.class);
        
        theme.setLargeFont(largeFont);
        theme.setSubtitlePaint(subtitlePaint);
        theme.setLegendBackgroundPaint(legendBackgroundPaint);
        theme.setRegularFont(regularFont);
        theme.setLegendItemPaint(legendItemPaint);
    }

    @Test
    void testApplyToTitle_TextTitle() {
        TextTitle title = new TextTitle("Sample Title");
        theme.applyToTitle(title);
        assertEquals(largeFont, title.getFont());
        assertEquals(subtitlePaint, title.getPaint());
    }

    @Test
    void testApplyToTitle_LegendTitle_WithBackgroundPaint() {
        LegendTitle legendTitle = mock(LegendTitle.class);
        when(legendTitle.getBackgroundPaint()).thenReturn(mock(Paint.class));
        theme.applyToTitle(legendTitle);
        verify(legendTitle).setBackgroundPaint(legendBackgroundPaint);
        verify(legendTitle).setItemFont(regularFont);
        verify(legendTitle).setItemPaint(legendItemPaint);
    }

    @Test
    void testApplyToTitle_LegendTitle_WithoutBackgroundPaint() {
        LegendTitle legendTitle = mock(LegendTitle.class);
        when(legendTitle.getBackgroundPaint()).thenReturn(null);
        theme.applyToTitle(legendTitle);
        verify(legendTitle, never()).setBackgroundPaint(any());
        verify(legendTitle).setItemFont(regularFont);
        verify(legendTitle).setItemPaint(legendItemPaint);
    }

    @Test
    void testApplyToTitle_PaintScaleLegend() {
        PaintScaleLegend paintScaleLegend = mock(PaintScaleLegend.class);
        when(paintScaleLegend.getAxis()).thenReturn(mock(ValueAxis.class));
        theme.applyToTitle(paintScaleLegend);
        verify(paintScaleLegend).setBackgroundPaint(legendBackgroundPaint);
        verify(paintScaleLegend.getAxis()).ifPresent(axis -> theme.applyToValueAxis(axis));
    }

    @Test
    void testApplyToTitle_CompositeTitle() {
        CompositeTitle compositeTitle = mock(CompositeTitle.class);
        BlockContainer container = mock(BlockContainer.class);
        when(compositeTitle.getContainer()).thenReturn(container);
        Block block = mock(Title.class);
        when(container.getBlocks()).thenReturn(new Block[]{block});
        theme.applyToTitle(compositeTitle);
        verify(theme).applyToTitle((Title) block);
    }
}