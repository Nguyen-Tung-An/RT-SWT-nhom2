import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeZoneTest {

    @Test
    public void testGetOffsetFromLocal_DSTTransitionPositiveOffset() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instantLocal = 1615708800000L; // March 15, 2021, 12:00:00 PM (EST)
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(-18000000, expectedOffset); // Expected offset in milliseconds
    }

    @Test
    public void testGetOffsetFromLocal_DSTTransitionNegativeOffset() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instantLocal = 1615687200000L; // March 14, 2021, 12:00:00 PM (EST)
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(-18000000, expectedOffset); // Expected offset in milliseconds
    }

    @Test
    public void testGetOffsetFromLocal_BeforeDSTTransition() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instantLocal = 1615705200000L; // March 15, 2021, 11:00:00 AM (EST)
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(-18000000, expectedOffset); // Expected offset in milliseconds
    }

    @Test
    public void testGetOffsetFromLocal_AfterDSTTransition() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instantLocal = 1615708800000L; // March 15, 2021, 12:00:00 PM (EDT)
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(-14400000, expectedOffset); // Expected offset in milliseconds
    }

    @Test
    public void testGetOffsetFromLocal_ExactTransitionTime() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instantLocal = 1615699200000L; // March 14, 2021, 2:00:00 AM (EST)
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(-18000000, expectedOffset); // Expected offset in milliseconds
    }

    @Test
    public void testGetOffsetFromLocal_NegativeInstant() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instantLocal = -1L; // Just before epoch
        int expectedOffset = zone.getOffsetFromLocal(instantLocal);
        assertEquals(-18000000, expectedOffset); // Expected offset in milliseconds
    }
}