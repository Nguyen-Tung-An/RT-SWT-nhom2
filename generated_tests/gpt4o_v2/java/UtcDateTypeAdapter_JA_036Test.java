import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.google.gson.typeadapters.UtcDateTypeAdapter;

class UtcDateTypeAdapterTest {

    @Test
    void testParseInt_ValidInput() {
        int result = UtcDateTypeAdapter.parseInt("12345", 0, 5);
        assertEquals(12345, result);
    }

    @Test
    void testParseInt_LeadingZeros() {
        int result = UtcDateTypeAdapter.parseInt("000123", 0, 6);
        assertEquals(123, result);
    }

    @Test
    void testParseInt_EmptyString() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("", 0, 0);
        });
    }

    @Test
    void testParseInt_NegativeIndex() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("123", -1, 3);
        });
    }

    @Test
    void testParseInt_EndIndexGreaterThanLength() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("123", 0, 4);
        });
    }

    @Test
    void testParseInt_BeginIndexGreaterThanEndIndex() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("123", 2, 1);
        });
    }

    @Test
    void testParseInt_InvalidCharacter() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("12a34", 0, 5);
        });
    }

    @Test
    void testParseInt_SingleDigit() {
        int result = UtcDateTypeAdapter.parseInt("7", 0, 1);
        assertEquals(7, result);
    }

    @Test
    void testParseInt_Zero() {
        int result = UtcDateTypeAdapter.parseInt("0", 0, 1);
        assertEquals(0, result);
    }
}