package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    private final DateTimeZone zone = DateTimeZone.forID("UTC");

    @Test
    void testGetOffsetFromLocal_NearDSTBoundary_PositiveOffset() {
        long instantLocal = 1622505600000L; // Example timestamp near a DST transition
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_NearDSTBoundary_NegativeOffset() {
        long instantLocal = 1622509200000L; // Example timestamp near a DST transition
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_StandardTime() {
        long instantLocal = 1622505600000L; // Example timestamp in standard time
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    void testGetOffsetFromLocal_StandardTime_PreviousTransition() {
        long instantLocal = 1622505600000L; // Example timestamp in standard time
        int offset = zone.getOffsetFromLocal(instantLocal);
        long prevTransition = zone.previousTransition(instantLocal);
        assertTrue(prevTransition < instantLocal);
        assertEquals(offset, zone.getOffset(prevTransition));
    }

    @Test
    void testGetOffsetFromLocal_StandardTime_NextTransition() {
        long instantLocal = 1622505600000L; // Example timestamp in standard time
        int offset = zone.getOffsetFromLocal(instantLocal);
        long nextTransition = zone.nextTransition(instantLocal);
        assertTrue(nextTransition > instantLocal);
        assertEquals(offset, zone.getOffset(nextTransition));
    }
}