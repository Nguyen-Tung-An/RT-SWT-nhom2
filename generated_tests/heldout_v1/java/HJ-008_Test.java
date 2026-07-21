package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeadersTest {
    private final Headers headers = new Headers();

    @Test
    void testHandleNull_InputEqualsNullString_StrictQuoteMode() {
        headers.reusableToken.isQuoted = true;
        headers.format.setNullString("NULL");
        assertNull(headers.handleNull("NULL"));
    }

    @Test
    void testHandleNull_InputEqualsNullString_NonStrictQuoteMode() {
        headers.reusableToken.isQuoted = true;
        headers.format.setNullString("NULL");
        headers.setStrictQuoteMode(false);
        assertEquals("NULL", headers.handleNull("NULL"));
    }

    @Test
    void testHandleNull_InputEqualsNullString_NonQuoted() {
        headers.reusableToken.isQuoted = false;
        headers.format.setNullString("NULL");
        assertNull(headers.handleNull("NULL"));
    }

    @Test
    void testHandleNull_InputIsEmpty_NullStringIsNull_StrictQuoteMode() {
        headers.reusableToken.isQuoted = false;
        headers.format.setNullString(null);
        headers.setStrictQuoteMode(true);
        assertNull(headers.handleNull(""));
    }

    @Test
    void testHandleNull_InputIsEmpty_NullStringIsNull_NonStrictQuoteMode() {
        headers.reusableToken.isQuoted = false;
        headers.format.setNullString(null);
        headers.setStrictQuoteMode(false);
        assertEquals("", headers.handleNull(""));
    }

    @Test
    void testHandleNull_InputIsNotNullString() {
        headers.reusableToken.isQuoted = false;
        headers.format.setNullString("NULL");
        assertEquals("SomeValue", headers.handleNull("SomeValue"));
    }
}