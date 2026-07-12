package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PeriodTest {

    @Test
    void testFieldDifference_NullStart() {
        ReadablePartial end = mock(ReadablePartial.class);
        assertThrows(IllegalArgumentException.class, () -> Period.fieldDifference(null, end));
    }

    @Test
    void testFieldDifference_NullEnd() {
        ReadablePartial start = mock(ReadablePartial.class);
        assertThrows(IllegalArgumentException.class, () -> Period.fieldDifference(start, null));
    }

    @Test
    void testFieldDifference_DifferentSizes() {
        ReadablePartial start = mock(ReadablePartial.class);
        ReadablePartial end = mock(ReadablePartial.class);
        when(start.size()).thenReturn(2);
        when(end.size()).thenReturn(3);
        assertThrows(IllegalArgumentException.class, () -> Period.fieldDifference(start, end));
    }

    @Test
    void testFieldDifference_DifferentFieldTypes() {
        ReadablePartial start = mock(ReadablePartial.class);
        ReadablePartial end = mock(ReadablePartial.class);
        when(start.size()).thenReturn(2);
        when(end.size()).thenReturn(2);
        when(start.getFieldType(0)).thenReturn(DurationFieldType.years());
        when(end.getFieldType(0)).thenReturn(DurationFieldType.months());
        assertThrows(IllegalArgumentException.class, () -> Period.fieldDifference(start, end));
    }

    @Test
    void testFieldDifference_OverlappingFields() {
        ReadablePartial start = mock(ReadablePartial.class);
        ReadablePartial end = mock(ReadablePartial.class);
        when(start.size()).thenReturn(2);
        when(end.size()).thenReturn(2);
        when(start.getFieldType(0)).thenReturn(DurationFieldType.years());
        when(start.getFieldType(1)).thenReturn(DurationFieldType.years());
        when(end.getFieldType(0)).thenReturn(DurationFieldType.years());
        when(end.getFieldType(1)).thenReturn(DurationFieldType.years());
        assertThrows(IllegalArgumentException.class, () -> Period.fieldDifference(start, end));
    }

    @Test
    void testFieldDifference_ValidInput() {
        ReadablePartial start = mock(ReadablePartial.class);
        ReadablePartial end = mock(ReadablePartial.class);
        when(start.size()).thenReturn(2);
        when(end.size()).thenReturn(2);
        when(start.getFieldType(0)).thenReturn(DurationFieldType.years());
        when(start.getFieldType(1)).thenReturn(DurationFieldType.months());
        when(end.getFieldType(0)).thenReturn(DurationFieldType.years());
        when(end.getFieldType(1)).thenReturn(DurationFieldType.months());
        when(start.getValue(0)).thenReturn(1);
        when(start.getValue(1)).thenReturn(5);
        when(end.getValue(0)).thenReturn(2);
        when(end.getValue(1)).thenReturn(10);
        
        Period result = Period.fieldDifference(start, end);
        assertNotNull(result);
        assertEquals(1, result.getYears());
        assertEquals(5, result.getMonths());
    }
}