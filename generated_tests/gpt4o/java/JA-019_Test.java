package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DateTimeUtilsTest {

    @Test
    void testIsContiguous_NullPartial() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeUtils.isContiguous(null);
        });
        assertEquals("Partial must not be null", exception.getMessage());
    }

    @Test
    void testIsContiguous_ContiguousFields() {
        ReadablePartial partial = mock(ReadablePartial.class);
        DateTimeField field1 = mock(DateTimeField.class);
        DateTimeField field2 = mock(DateTimeField.class);
        DurationFieldType type = DurationFieldType.seconds();

        when(partial.size()).thenReturn(2);
        when(partial.getField(0)).thenReturn(field1);
        when(partial.getField(1)).thenReturn(field2);
        when(field1.getRangeDurationField()).thenReturn(mock(DurationField.class));
        when(field1.getDurationField()).thenReturn(mock(DurationField.class));
        when(field2.getRangeDurationField()).thenReturn(mock(DurationField.class));
        when(field2.getDurationField()).thenReturn(mock(DurationField.class));
        when(field1.getDurationField().getType()).thenReturn(type);
        when(field2.getDurationField().getType()).thenReturn(type);

        assertTrue(DateTimeUtils.isContiguous(partial));
    }

    @Test
    void testIsContiguous_NonContiguousFields() {
        ReadablePartial partial = mock(ReadablePartial.class);
        DateTimeField field1 = mock(DateTimeField.class);
        DateTimeField field2 = mock(DateTimeField.class);
        DurationFieldType type1 = DurationFieldType.seconds();
        DurationFieldType type2 = DurationFieldType.minutes();

        when(partial.size()).thenReturn(2);
        when(partial.getField(0)).thenReturn(field1);
        when(partial.getField(1)).thenReturn(field2);
        when(field1.getRangeDurationField()).thenReturn(mock(DurationField.class));
        when(field1.getDurationField()).thenReturn(mock(DurationField.class));
        when(field2.getRangeDurationField()).thenReturn(mock(DurationField.class));
        when(field2.getDurationField()).thenReturn(mock(DurationField.class));
        when(field1.getDurationField().getType()).thenReturn(type1);
        when(field2.getDurationField().getType()).thenReturn(type2);

        assertFalse(DateTimeUtils.isContiguous(partial));
    }
}