package org.jfree.chart;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class StandardChartThemeTest {

    @Test
    void testApplyToTitle_TextTitle() {
        StandardChartTheme theme = new StandardChartTheme();
        TextTitle title = mock(TextTitle.class);
        theme.largeFont = mock(Font.class);
        theme.subtitlePaint = mock(Paint.class);
        
        theme.applyToTitle(title);
        
        verify(title).setFont(theme.largeFont);
        verify(title).setPaint(theme.subtitlePaint);
    }

    @Test
    void testApplyToTitle_LegendTitle_WithBackgroundPaint() {
        StandardChartTheme theme = new StandardChartTheme();
        LegendTitle title = mock(LegendTitle.class);
        theme.legendBackgroundPaint = mock(Paint.class);
        theme.regularFont = mock(Font.class);
        theme.legendItemPaint = mock(Paint.class);
        
        when(title.getBackgroundPaint()).thenReturn(mock(Paint.class));
        theme.applyToTitle(title);
        
        verify(title).setBackgroundPaint(theme.legendBackgroundPaint);
        verify(title).setItemFont(theme.regularFont);
        verify(title).setItemPaint(theme.legendItemPaint);
    }

    @Test
    void testApplyToTitle_LegendTitle_WithoutBackgroundPaint() {
        StandardChartTheme theme = new StandardChartTheme();
        LegendTitle title = mock(LegendTitle.class);
        theme.regularFont = mock(Font.class);
        theme.legendItemPaint = mock(Paint.class);
        
        when(title.getBackgroundPaint()).thenReturn(null);
        theme.applyToTitle(title);
        
        verify(title, never()).setBackgroundPaint(any());
        verify(title).setItemFont(theme.regularFont);
        verify(title).setItemPaint(theme.legendItemPaint);
    }

    @Test
    void testApplyToTitle_PaintScaleLegend_WithAxis() {
        StandardChartTheme theme = new StandardChartTheme();
        PaintScaleLegend title = mock(PaintScaleLegend.class);
        theme.legendBackgroundPaint = mock(Paint.class);
        
        when(title.getAxis()).thenReturn(mock(ValueAxis.class));
        theme.applyToTitle(title);
        
        verify(title).setBackgroundPaint(theme.legendBackgroundPaint);
        verify(title.getAxis()).setBackgroundPaint(any());
    }

    @Test
    void testApplyToTitle_PaintScaleLegend_WithoutAxis() {
        StandardChartTheme theme = new StandardChartTheme();
        PaintScaleLegend title = mock(PaintScaleLegend.class);
        theme.legendBackgroundPaint = mock(Paint.class);
        
        when(title.getAxis()).thenReturn(null);
        theme.applyToTitle(title);
        
        verify(title).setBackgroundPaint(theme.legendBackgroundPaint);
        verify(title.getAxis(), never()).setBackgroundPaint(any());
    }

    @Test
    void testApplyToTitle_CompositeTitle() {
        StandardChartTheme theme = new StandardChartTheme();
        CompositeTitle title = mock(CompositeTitle.class);
        BlockContainer container = mock(BlockContainer.class);
        Block block = mock(TextTitle.class);
        
        when(title.getContainer()).thenReturn(container);
        when(container.getBlocks()).thenReturn(new Block[]{block});
        
        theme.applyToTitle(title);
        
        verify(theme).applyToTitle(block);
    }
}