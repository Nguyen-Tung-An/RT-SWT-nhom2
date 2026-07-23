package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondsTest {
    @Test
    void testSeconds_Zero() {
        assertSame(Seconds.ZERO, Seconds.seconds(0));
    }

    @Test
    void testSeconds_One() {
        assertSame(Seconds.ONE, Seconds.seconds(1));
    }

    @Test
    void testSeconds_Two() {
        assertSame(Seconds.TWO, Seconds.seconds(2));
    }

    @Test
    void testSeconds_Three() {
        assertSame(Seconds.THREE, Seconds.seconds(3));
    }

    @Test
    void testSeconds_MaxValue() {
        assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE));
    }

    @Test
    void testSeconds_MinValue() {
        assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE));
    }

    @Test
    void testSeconds_NegativeValue() {
        assertNotSame(Seconds.ZERO, Seconds.seconds(-1));
        assertNotSame(Seconds.ZERO, Seconds.seconds(-10));
    }

    @Test
    void testSeconds_ArbitraryValue() {
        Seconds result = Seconds.seconds(5);
        assertNotNull(result);
        assertEquals(5, result.getSeconds());
    }
}