package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    private final DateTimeZone dateTimeZone = DateTimeZone.forID("UTC"); // Example timezone

    @Test
    void testGetOffsetFromLocal_DSTBoundary() {
        long instantLocal = 1622505600000L; // Example timestamp near a DST transition
        int expectedOffset = dateTimeZone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, dateTimeZone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_NegativeOffset() {
        long instantLocal = -1622505600000L; // Example timestamp with negative offset
        int expectedOffset = dateTimeZone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, dateTimeZone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_PositiveOffset() {
        long instantLocal = 1622505600000L; // Example timestamp with positive offset
        int expectedOffset = dateTimeZone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, dateTimeZone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_ExactTransition() {
        long instantLocal = 1622509200000L; // Example timestamp exactly at a transition
        int expectedOffset = dateTimeZone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, dateTimeZone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_BeforeTransition() {
        long instantLocal = 1622505600000L; // Example timestamp before a transition
        int expectedOffset = dateTimeZone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, dateTimeZone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_AfterTransition() {
        long instantLocal = 1622512800000L; // Example timestamp after a transition
        int expectedOffset = dateTimeZone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, dateTimeZone.getOffsetFromLocal(instantLocal));
    }
}