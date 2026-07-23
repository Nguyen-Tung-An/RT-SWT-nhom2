package org.joda.time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondsTest {

    @Test
    void testSecondsZero() {
        Seconds result = Seconds.seconds(0);
        assertEquals(Seconds.ZERO, result);
    }

    @Test
    void testSecondsOne() {
        Seconds result = Seconds.seconds(1);
        assertEquals(Seconds.ONE, result);
    }

    @Test
    void testSecondsTwo() {
        Seconds result = Seconds.seconds(2);
        assertEquals(Seconds.TWO, result);
    }

    @Test
    void testSecondsThree() {
        Seconds result = Seconds.seconds(3);
        assertEquals(Seconds.THREE, result);
    }

    @Test
    void testSecondsMaxValue() {
        Seconds result = Seconds.seconds(Integer.MAX_VALUE);
        assertEquals(Seconds.MAX_VALUE, result);
    }

    @Test
    void testSecondsMinValue() {
        Seconds result = Seconds.seconds(Integer.MIN_VALUE);
        assertEquals(Seconds.MIN_VALUE, result);
    }

    @Test
    void testSecondsNegativeValue() {
        int negativeValue = -5;
        Seconds result = Seconds.seconds(negativeValue);
        assertEquals(new Seconds(negativeValue), result);
    }

    @Test
    void testSecondsLargePositiveValue() {
        int largeValue = 100;
        Seconds result = Seconds.seconds(largeValue);
        assertEquals(new Seconds(largeValue), result);
    }
}