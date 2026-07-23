import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.stream.JsonToken;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonTreeReaderTest {

    @Test
    void testNextDoubleWithNumber() throws IOException {
        JsonElement element = new JsonPrimitive(3.14);
        JsonTreeReader reader = new JsonTreeReader(element);
        double result = reader.nextDouble();
        assertEquals(3.14, result);
    }

    @Test
    void testNextDoubleWithStringNumber() throws IOException {
        JsonElement element = new JsonPrimitive("2.71");
        JsonTreeReader reader = new JsonTreeReader(element);
        double result = reader.nextDouble();
        assertEquals(2.71, result);
    }

    @Test
    void testNextDoubleThrowsIllegalStateExceptionOnInvalidToken() {
        JsonElement element = new JsonPrimitive(true);
        JsonTreeReader reader = new JsonTreeReader(element);
        IllegalStateException exception = assertThrows(IllegalStateException.class, reader::nextDouble);
        assertEquals("Expected NUMBER but was BOOLEAN at path $", exception.getMessage());
    }

    @Test
    void testNextDoubleThrowsMalformedJsonExceptionOnNaN() {
        JsonElement element = new JsonPrimitive(Double.NaN);
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        MalformedJsonException exception = assertThrows(MalformedJsonException.class, reader::nextDouble);
        assertEquals("JSON forbids NaN and infinities: NaN", exception.getMessage());
    }

    @Test
    void testNextDoubleThrowsMalformedJsonExceptionOnInfinity() {
        JsonElement element = new JsonPrimitive(Double.POSITIVE_INFINITY);
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(false);
        MalformedJsonException exception = assertThrows(MalformedJsonException.class, reader::nextDouble);
        assertEquals("JSON forbids NaN and infinities: Infinity", exception.getMessage());
    }

    @Test
    void testNextDoubleWithNegativeInfinity() throws IOException {
        JsonElement element = new JsonPrimitive(Double.NEGATIVE_INFINITY);
        JsonTreeReader reader = new JsonTreeReader(element);
        reader.setLenient(true);
        double result = reader.nextDouble();
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }
}