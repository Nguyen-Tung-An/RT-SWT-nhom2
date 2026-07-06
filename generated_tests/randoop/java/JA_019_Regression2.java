import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_019_Regression2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1001");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138101677L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1002");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138127134L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1003");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138125029L);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1004");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138134694L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1005");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1006");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6726684025d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138118549L + "'", long1 == 1783138118549L);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1007");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138101533L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672471447d + "'", double1 == 2461225.672471447d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1008");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138118134L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672663588d + "'", double1 == 2461225.672663588d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1009");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138124731L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1010");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138122846L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672718125d + "'", double1 == 2461225.672718125d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1011");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        java.lang.Class<?> wildcardClass12 = chronology11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1012");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138110443L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1013");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138129371L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1014");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "1) test1014(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138136000L + "'", long4 == 1783138136000L);
// flaky "1) test1014(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138136000L + "'", long7 == 1783138136000L);
// flaky "1) test1014(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138136000L + "'", long8 == 1783138136000L);
// flaky "1) test1014(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138136000L + "'", long9 == 1783138136000L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1015");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138125971L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1016");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138124745L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1017");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138128281L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1018");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (-1));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1019");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138129339L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1020");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138103444L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672493565d + "'", double1 == 2461225.672493565d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1021");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1022");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138117003L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672650498d + "'", double1 == 2461225.672650498d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1023");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138115060L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1025");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1026");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1027");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1028");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass7 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "2) test1028(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138136315L + "'", long5 == 1783138136315L);
// flaky "2) test1028(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138136315L + "'", long6 == 1783138136315L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1029");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118933L);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1030");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1031");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "3) test1031(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138136417L + "'", long7 == 1783138136417L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1032");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1033");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138132919L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1035");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass11 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1036");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        java.lang.Class<?> wildcardClass17 = readableInterval16.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1037");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138127342L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1038");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1040");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1041");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1042");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138120865L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726951967d + "'", double1 == 2461225.6726951967d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1043");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138106748L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1044");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1045");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        java.lang.Class<?> wildcardClass12 = readableInterval11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1046");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1047");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1048");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "4) test1048(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138136920L + "'", long2 == 1783138136920L);
// flaky "3) test1048(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138136920L + "'", long5 == 1783138136920L);
// flaky "2) test1048(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138136920L + "'", long6 == 1783138136920L);
// flaky "2) test1048(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138136920L + "'", long9 == 1783138136920L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1049");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138129136L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1050");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138121714L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1051");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1052");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138099335L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1053");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1054");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138099080L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724430555d + "'", double1 == 2461225.6724430555d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1055");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138134519L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1056");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138124029L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1057");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138120415L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726899883d + "'", double1 == 2461225.6726899883d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1058");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672678623d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138119433L + "'", long1 == 1783138119433L);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1059");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138126244L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1060");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType12);
        java.lang.Class<?> wildcardClass14 = periodType12.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1061");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1062");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138133406L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1063");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1064");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138125629L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1065");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138110107L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1066");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138135518L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1067");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-210866673600000L));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1068");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6726074885d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138113287L + "'", long1 == 1783138113287L);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1069");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1070");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138124628L);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1071");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138130213L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728033912d + "'", double1 == 2461225.6728033912d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1072");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672446007d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138099334L + "'", long1 == 1783138099334L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1073");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1074");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138130379L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1075");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138119600L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1076");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1077");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "5) test1077(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138137726L + "'", long2 == 1783138137726L);
// flaky "4) test1077(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138137726L + "'", long4 == 1783138137726L);
// flaky "3) test1077(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138137726L + "'", long5 == 1783138137726L);
// flaky "3) test1077(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138137726L + "'", long6 == 1783138137726L);
// flaky "1) test1077(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138137726L + "'", long8 == 1783138137726L);
// flaky "1) test1077(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138137726L + "'", long10 == 1783138137726L);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1078");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138131589L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1079");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1080");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138131589L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1081");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138120724L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1082");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138134694L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728552547d + "'", double1 == 2461225.6728552547d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1083");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138136315L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1084");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138114042L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1085");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1086");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1087");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138125345L);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1088");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672511979d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138105034L + "'", long1 == 1783138105034L);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1089");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6726348493d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138115650L + "'", long1 == 1783138115650L);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1090");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.500000116d + "'", double1 == 2440587.500000116d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1091");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1092");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1093");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1094");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long12 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "6) test1094(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138138193L + "'", long2 == 1783138138193L);
// flaky "5) test1094(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138138193L + "'", long5 == 1783138138193L);
// flaky "4) test1094(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138138193L + "'", long6 == 1783138138193L);
// flaky "4) test1094(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138138193L + "'", long10 == 1783138138193L);
// flaky "2) test1094(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138138193L + "'", long12 == 1783138138193L);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1095");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138121031L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672697118d + "'", double1 == 2461225.672697118d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1096");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1097");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1098");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138101677L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1099");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000006016d + "'", double1 == 2440587.5000006016d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1100");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138123629L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727271876d + "'", double1 == 2461225.6727271876d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1101");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long15 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "7) test1101(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138138344L + "'", long2 == 1783138138344L);
// flaky "6) test1101(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138138344L + "'", long6 == 1783138138344L);
// flaky "5) test1101(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138138344L + "'", long7 == 1783138138344L);
// flaky "5) test1101(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138138344L + "'", long10 == 1783138138344L);
// flaky "3) test1101(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138138344L + "'", long11 == 1783138138344L);
// flaky "2) test1101(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138138344L + "'", long12 == 1783138138344L);
// flaky "1) test1101(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1783138138344L + "'", long15 == 1783138138344L);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1102");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138120865L);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1103");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138105034L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1104");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138121331L);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1105");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138137453L);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1106");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138136671L);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1107");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138133595L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728425347d + "'", double1 == 2461225.6728425347d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1108");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138117323L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1109");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1110");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866673600000L) + "'", long1 == (-210866673600000L));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1111");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138097453L);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1112");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1113");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass8 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1114");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1115");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(106754431755L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1116");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138134581L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1117");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1118");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType12);
        org.joda.time.PeriodType periodType14 = org.joda.time.DateTimeUtils.getPeriodType(periodType13);
        java.lang.Class<?> wildcardClass15 = periodType14.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1119");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138124345L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1120");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass12 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1122");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1123");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138131405L);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1124");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138115967L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672638507d + "'", double1 == 2461225.672638507d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1125");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138124578L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1126");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138101917L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672475891d + "'", double1 == 2461225.672475891d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1127");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1128");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "8) test1128(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138139031L + "'", long2 == 1783138139031L);
// flaky "7) test1128(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138139031L + "'", long4 == 1783138139031L);
// flaky "6) test1128(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138139031L + "'", long8 == 1783138139031L);
// flaky "6) test1128(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138139031L + "'", long9 == 1783138139031L);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1129");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1130");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "9) test1130(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138139074L + "'", long4 == 1783138139074L);
// flaky "8) test1130(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138139074L + "'", long5 == 1783138139074L);
// flaky "7) test1130(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138139074L + "'", long7 == 1783138139074L);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1131");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass11 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1132");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "10) test1132(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138139142L + "'", long4 == 1783138139142L);
// flaky "9) test1132(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138139142L + "'", long9 == 1783138139142L);
// flaky "8) test1132(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138139142L + "'", long10 == 1783138139142L);
// flaky "7) test1132(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138139142L + "'", long11 == 1783138139142L);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        java.lang.Class<?> wildcardClass14 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1134");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1135");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1136");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138111869L);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1137");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        long long1 = millisProvider0.getMillis();
        long long2 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass3 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "11) test1137(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138139245L + "'", long1 == 1783138139245L);
// flaky "10) test1137(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138139245L + "'", long2 == 1783138139245L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1138");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672672824d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138118931L + "'", long1 == 1783138118931L);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1139");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1140");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "12) test1140(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138139291L + "'", long4 == 1783138139291L);
// flaky "11) test1140(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138139291L + "'", long5 == 1783138139291L);
// flaky "9) test1140(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138139291L + "'", long6 == 1783138139291L);
// flaky "8) test1140(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138139291L + "'", long8 == 1783138139291L);
// flaky "4) test1140(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138139291L + "'", long9 == 1783138139291L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1141");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        java.lang.Class<?> wildcardClass16 = readableInterval14.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1142");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        java.lang.Class<?> wildcardClass11 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1143");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138139291L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6729084607d + "'", double1 == 2461225.6729084607d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1144");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "13) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138139379L + "'", long2 == 1783138139379L);
// flaky "12) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138139379L + "'", long4 == 1783138139379L);
// flaky "10) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138139379L + "'", long5 == 1783138139379L);
// flaky "9) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138139379L + "'", long6 == 1783138139379L);
// flaky "5) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138139379L + "'", long9 == 1783138139379L);
// flaky "3) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138139379L + "'", long10 == 1783138139379L);
// flaky "2) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138139379L + "'", long11 == 1783138139379L);
// flaky "1) test1144(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138139379L + "'", long12 == 1783138139379L);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1145");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138115650L);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1146");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138132951L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672835081d + "'", double1 == 2461225.672835081d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1147");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        java.lang.Class<?> wildcardClass13 = periodType11.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1148");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1149");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1150");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1151");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138124095L);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1152");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138138431L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1153");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138113754L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1155");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1156");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1157");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138108169L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1158");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "14) test1158(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138139799L + "'", long2 == 1783138139799L);
// flaky "13) test1158(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138139799L + "'", long3 == 1783138139799L);
// flaky "11) test1158(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138139799L + "'", long5 == 1783138139799L);
// flaky "10) test1158(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138139799L + "'", long7 == 1783138139799L);
// flaky "6) test1158(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138139799L + "'", long8 == 1783138139799L);
// flaky "4) test1158(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138139799L + "'", long10 == 1783138139799L);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1159");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138135585L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728655673d + "'", double1 == 2461225.6728655673d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1160");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1161");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138126011L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1162");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "15) test1162(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138139928L + "'", long2 == 1783138139928L);
// flaky "14) test1162(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138139928L + "'", long3 == 1783138139928L);
// flaky "12) test1162(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138139928L + "'", long7 == 1783138139928L);
// flaky "11) test1162(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138139928L + "'", long8 == 1783138139928L);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1163");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672693079d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138120682L + "'", long1 == 1783138120682L);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1164");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138126976L);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1165");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1166");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass8 = chronology5.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1167");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6726978933d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138121097L + "'", long1 == 1783138121097L);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1168");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138117535L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1169");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138132919L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728347107d + "'", double1 == 2461225.6728347107d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1170");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1171");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672679213d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138119483L + "'", long1 == 1783138119483L);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1172");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "16) test1172(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138140210L + "'", long2 == 1783138140210L);
// flaky "15) test1172(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138140210L + "'", long3 == 1783138140210L);
// flaky "13) test1172(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138140210L + "'", long4 == 1783138140210L);
// flaky "12) test1172(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138140210L + "'", long5 == 1783138140210L);
// flaky "7) test1172(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138140210L + "'", long7 == 1783138140210L);
// flaky "5) test1172(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138140210L + "'", long8 == 1783138140210L);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1173");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1174");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1175");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138124335L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1176");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1177");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138131589L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1178");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass10 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1179");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138129404L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727940277d + "'", double1 == 2461225.6727940277d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1180");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138119400L);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1181");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725892015d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138111707L + "'", long1 == 1783138111707L);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1182");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1183");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "17) test1183(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138140414L + "'", long2 == 1783138140414L);
// flaky "16) test1183(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138140414L + "'", long4 == 1783138140414L);
// flaky "14) test1183(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138140414L + "'", long5 == 1783138140414L);
// flaky "13) test1183(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138140414L + "'", long7 == 1783138140414L);
// flaky "8) test1183(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138140414L + "'", long9 == 1783138140414L);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1184");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138126121L);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1185");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "18) test1185(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138140470L + "'", long2 == 1783138140470L);
// flaky "17) test1185(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138140470L + "'", long5 == 1783138140470L);
// flaky "15) test1185(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138140470L + "'", long6 == 1783138140470L);
// flaky "14) test1185(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138140470L + "'", long8 == 1783138140470L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1186");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138119516L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1187");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138122043L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672708831d + "'", double1 == 2461225.672708831d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1188");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1190");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass6 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1191");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138130554L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1192");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long13 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "19) test1192(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138140620L + "'", long2 == 1783138140620L);
// flaky "18) test1192(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138140620L + "'", long5 == 1783138140620L);
// flaky "16) test1192(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138140620L + "'", long6 == 1783138140620L);
// flaky "15) test1192(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138140620L + "'", long10 == 1783138140620L);
// flaky "9) test1192(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138140620L + "'", long13 == 1783138140620L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1193");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass8 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1194");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass12 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "20) test1194(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138140653L + "'", long2 == 1783138140653L);
// flaky "19) test1194(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138140653L + "'", long4 == 1783138140653L);
// flaky "17) test1194(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138140653L + "'", long9 == 1783138140653L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1195");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1196");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138126121L);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1197");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138098502L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1198");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138136833L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1199");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        long long7 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "21) test1199(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138140745L + "'", long5 == 1783138140745L);
// flaky "20) test1199(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138140745L + "'", long6 == 1783138140745L);
// flaky "18) test1199(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138140745L + "'", long7 == 1783138140745L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1200");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1201");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        long long13 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass14 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "22) test1201(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138140808L + "'", long4 == 1783138140808L);
// flaky "21) test1201(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138140808L + "'", long7 == 1783138140808L);
// flaky "19) test1201(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138140808L + "'", long9 == 1783138140808L);
// flaky "16) test1201(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138140808L + "'", long11 == 1783138140808L);
// flaky "10) test1201(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138140808L + "'", long12 == 1783138140808L);
// flaky "6) test1201(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138140808L + "'", long13 == 1783138140808L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1202");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass10 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "23) test1202(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138140824L + "'", long2 == 1783138140824L);
// flaky "22) test1202(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138140824L + "'", long4 == 1783138140824L);
// flaky "20) test1202(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138140824L + "'", long5 == 1783138140824L);
// flaky "17) test1202(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138140824L + "'", long6 == 1783138140824L);
// flaky "11) test1202(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138140824L + "'", long9 == 1783138140824L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1203");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1204");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(106754431755L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2441823L + "'", long1 == 2441823L);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1205");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138126536L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1206");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210862267200000L) + "'", long1 == (-210862267200000L));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1207");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1208");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "24) test1208(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138141026L + "'", long2 == 1783138141026L);
// flaky "23) test1208(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138141026L + "'", long7 == 1783138141026L);
// flaky "21) test1208(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138141026L + "'", long8 == 1783138141026L);
// flaky "18) test1208(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138141026L + "'", long9 == 1783138141026L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1209");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1210");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1211");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1212");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138131288L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1213");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1214");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1215");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138129537L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1216");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123187L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1218");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1219");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138141141L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1220");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1221");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1222");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138134519L);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1223");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass9 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "25) test1223(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138141399L + "'", long2 == 1783138141399L);
// flaky "24) test1223(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138141399L + "'", long3 == 1783138141399L);
// flaky "22) test1223(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138141399L + "'", long4 == 1783138141399L);
// flaky "19) test1223(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138141399L + "'", long5 == 1783138141399L);
// flaky "12) test1223(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138141399L + "'", long6 == 1783138141399L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1224");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138128820L);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1225");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138122264L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727113887d + "'", double1 == 2461225.6727113887d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1226");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138139142L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1227");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType12);
        org.joda.time.PeriodType periodType14 = org.joda.time.DateTimeUtils.getPeriodType(periodType13);
        org.joda.time.PeriodType periodType15 = org.joda.time.DateTimeUtils.getPeriodType(periodType13);
        java.lang.Class<?> wildcardClass16 = periodType13.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1228");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138138193L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1229");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(106754431755L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2441823.083700868d + "'", double1 == 2441823.083700868d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1230");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138128820L);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1231");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138137453L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1232");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138136671L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728781364d + "'", double1 == 2461225.6728781364d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1233");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1234");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138120981L);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1235");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138129921L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728000115d + "'", double1 == 2461225.6728000115d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1236");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        long long13 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "26) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138141786L + "'", long2 == 1783138141786L);
// flaky "25) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138141786L + "'", long4 == 1783138141786L);
// flaky "23) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138141786L + "'", long5 == 1783138141786L);
// flaky "20) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138141786L + "'", long6 == 1783138141786L);
// flaky "13) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138141786L + "'", long9 == 1783138141786L);
// flaky "7) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138141786L + "'", long10 == 1783138141786L);
// flaky "3) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138141786L + "'", long11 == 1783138141786L);
// flaky "2) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138141786L + "'", long12 == 1783138141786L);
// flaky "1) test1236(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138141786L + "'", long13 == 1783138141786L);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1237");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138137726L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1238");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138134901L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1239");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1240");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138139612L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6729121758d + "'", double1 == 2461225.6729121758d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1241");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long11 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "27) test1241(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138141952L + "'", long4 == 1783138141952L);
// flaky "26) test1241(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138141952L + "'", long7 == 1783138141952L);
// flaky "24) test1241(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138141952L + "'", long8 == 1783138141952L);
// flaky "21) test1241(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138141952L + "'", long9 == 1783138141952L);
// flaky "14) test1241(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138141952L + "'", long11 == 1783138141952L);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1242");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1243");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "28) test1243(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138141992L + "'", long4 == 1783138141992L);
// flaky "27) test1243(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138141992L + "'", long6 == 1783138141992L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1244");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138105501L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725173728d + "'", double1 == 2461225.6725173728d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1246");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        java.lang.Class<?> wildcardClass10 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1247");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210865896000000L) + "'", long1 == (-210865896000000L));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1248");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138110070L);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1249");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1250");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138133172L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728376388d + "'", double1 == 2461225.6728376388d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1251");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1252");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138133172L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1253");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1254");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138106447L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672528322d + "'", double1 == 2461225.672528322d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1255");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "29) test1255(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138142231L + "'", long2 == 1783138142231L);
// flaky "28) test1255(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138142231L + "'", long6 == 1783138142231L);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1256");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138117535L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726566553d + "'", double1 == 2461225.6726566553d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1257");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138130353L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728050117d + "'", double1 == 2461225.6728050117d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1258");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138139074L);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1259");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138136833L);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1260");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138140620L);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1261");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1262");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1263");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "30) test1263(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138142370L + "'", long5 == 1783138142370L);
// flaky "29) test1263(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138142370L + "'", long8 == 1783138142370L);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1264");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138139928L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6729158335d + "'", double1 == 2461225.6729158335d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1265");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1266");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass10 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1267");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138114555L);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1268");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1269");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114555L);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1270");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138120065L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726859375d + "'", double1 == 2461225.6726859375d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1271");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        java.lang.Class<?> wildcardClass12 = periodType10.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1272");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138127214L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727686804d + "'", double1 == 2461225.6727686804d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1273");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138132919L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1274");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        java.lang.Class<?> wildcardClass13 = readableInterval12.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1275");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1276");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1277");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138098831L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1278");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1279");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1280");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1281");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "31) test1281(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138142878L + "'", long2 == 1783138142878L);
// flaky "30) test1281(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138142878L + "'", long4 == 1783138142878L);
// flaky "25) test1281(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138142878L + "'", long5 == 1783138142878L);
// flaky "22) test1281(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138142878L + "'", long7 == 1783138142878L);
// flaky "15) test1281(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138142878L + "'", long9 == 1783138142878L);
// flaky "8) test1281(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138142878L + "'", long10 == 1783138142878L);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1282");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138127214L);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1283");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1284");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1285");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1286");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138135568L);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1287");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138141141L);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1288");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1289");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138130637L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1290");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138098436L);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1291");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138126121L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.67275603d + "'", double1 == 2461225.67275603d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1292");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-43200000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440587L + "'", long1 == 2440587L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1293");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long12 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "32) test1293(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138143175L + "'", long2 == 1783138143175L);
// flaky "31) test1293(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138143175L + "'", long4 == 1783138143175L);
// flaky "26) test1293(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138143175L + "'", long5 == 1783138143175L);
// flaky "23) test1293(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138143175L + "'", long6 == 1783138143175L);
// flaky "16) test1293(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138143175L + "'", long9 == 1783138143175L);
// flaky "9) test1293(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138143175L + "'", long10 == 1783138143175L);
// flaky "4) test1293(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138143175L + "'", long12 == 1783138143175L);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1294");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.67273875d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138124628L + "'", long1 == 1783138124628L);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1295");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(readableInterval14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1296");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1298");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138139325L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1299");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass9 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1300");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672474421d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138101789L + "'", long1 == 1783138101789L);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1301");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass9 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1302");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672835081d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138132950L + "'", long1 == 1783138132950L);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1303");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long12 = millisProvider0.getMillis();
        long long13 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass14 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "33) test1303(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138143432L + "'", long4 == 1783138143432L);
// flaky "32) test1303(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138143432L + "'", long8 == 1783138143432L);
// flaky "27) test1303(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138143432L + "'", long10 == 1783138143432L);
// flaky "24) test1303(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138143432L + "'", long12 == 1783138143432L);
// flaky "17) test1303(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138143432L + "'", long13 == 1783138143432L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1304");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138139213L);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1305");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        long long1 = millisProvider0.getMillis();
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "34) test1305(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138143464L + "'", long1 == 1783138143464L);
// flaky "33) test1305(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138143464L + "'", long2 == 1783138143464L);
// flaky "28) test1305(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138143464L + "'", long7 == 1783138143464L);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1306");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass14 = chronology13.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1307");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1308");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138139031L);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1309");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1310");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1311");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1312");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1313");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138135114L);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1314");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1315");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138136517L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728763543d + "'", double1 == 2461225.6728763543d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1316");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672493565d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138103444L + "'", long1 == 1783138103444L);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1317");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1318");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138140824L);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1319");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long11 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "35) test1319(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138143817L + "'", long2 == 1783138143817L);
// flaky "34) test1319(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138143817L + "'", long3 == 1783138143817L);
// flaky "29) test1319(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138143817L + "'", long9 == 1783138143817L);
// flaky "25) test1319(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138143817L + "'", long11 == 1783138143817L);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1320");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1321");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "36) test1321(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138143859L + "'", long2 == 1783138143859L);
// flaky "35) test1321(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138143859L + "'", long5 == 1783138143859L);
// flaky "30) test1321(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138143859L + "'", long7 == 1783138143859L);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1322");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138125971L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672754294d + "'", double1 == 2461225.672754294d);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1323");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672644317d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138116469L + "'", long1 == 1783138116469L);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1324");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(97L);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1325");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "37) test1325(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138143943L + "'", long2 == 1783138143943L);
// flaky "36) test1325(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138143943L + "'", long9 == 1783138143943L);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1326");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138140470L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6729221065d + "'", double1 == 2461225.6729221065d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1327");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138110868L);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1328");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass9 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1329");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138121315L);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1330");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1331");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1332");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1333");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        java.lang.Class<?> wildcardClass11 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1334");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138131295L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1335");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1336");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "38) test1336(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138144203L + "'", long2 == 1783138144203L);
// flaky "37) test1336(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138144203L + "'", long3 == 1783138144203L);
// flaky "31) test1336(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138144203L + "'", long4 == 1783138144203L);
// flaky "26) test1336(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138144203L + "'", long5 == 1783138144203L);
// flaky "18) test1336(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138144203L + "'", long6 == 1783138144203L);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1337");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138117323L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1338");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138128072L);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1339");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass8 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1340");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1341");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138141992L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1342");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138129973L);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1343");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123479L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1344");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138131712L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1345");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138141575L);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1346");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138129973L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1347");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1348");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138122531L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1349");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1350");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138124578L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672738171d + "'", double1 == 2461225.672738171d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1351");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138134901L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728576506d + "'", double1 == 2461225.6728576506d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1352");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1353");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass14 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1354");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138106158L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1355");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138143943L);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1356");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138103317L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672492095d + "'", double1 == 2461225.672492095d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1357");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1358");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138140922L);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1359");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138131288L);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1360");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1361");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        long long7 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "39) test1361(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138144737L + "'", long2 == 1783138144737L);
// flaky "38) test1361(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138144737L + "'", long3 == 1783138144737L);
// flaky "32) test1361(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138144737L + "'", long4 == 1783138144737L);
// flaky "27) test1361(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138144737L + "'", long6 == 1783138144737L);
// flaky "19) test1361(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138144737L + "'", long7 == 1783138144737L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1362");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long11 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long13 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "40) test1362(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138144768L + "'", long2 == 1783138144768L);
// flaky "39) test1362(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138144768L + "'", long3 == 1783138144768L);
// flaky "33) test1362(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138144768L + "'", long5 == 1783138144768L);
// flaky "28) test1362(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138144768L + "'", long8 == 1783138144768L);
// flaky "20) test1362(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138144768L + "'", long9 == 1783138144768L);
// flaky "10) test1362(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138144768L + "'", long11 == 1783138144768L);
// flaky "5) test1362(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138144768L + "'", long13 == 1783138144768L);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1363");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138138193L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1364");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138142153L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1365");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138122236L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1366");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1367");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1368");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138127278L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1369");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138123646L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672727384d + "'", double1 == 2461225.672727384d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1370");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1371");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138130637L);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1372");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1373");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "41) test1373(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138144993L + "'", long2 == 1783138144993L);
// flaky "40) test1373(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138144993L + "'", long3 == 1783138144993L);
// flaky "34) test1373(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138144993L + "'", long5 == 1783138144993L);
// flaky "29) test1373(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138144993L + "'", long7 == 1783138144993L);
// flaky "21) test1373(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138144993L + "'", long9 == 1783138144993L);
// flaky "11) test1373(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138144993L + "'", long10 == 1783138144993L);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1374");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType14 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType15 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1375");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138126552L);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1376");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138122180L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1377");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        java.lang.Class<?> wildcardClass13 = periodType11.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1378");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1379");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1380");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass10 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "42) test1380(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138145219L + "'", long2 == 1783138145219L);
// flaky "41) test1380(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138145219L + "'", long4 == 1783138145219L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1381");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1382");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1383");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138135518L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728647915d + "'", double1 == 2461225.6728647915d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1384");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138116237L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672641632d + "'", double1 == 2461225.672641632d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1385");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1386");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1387");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass8 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1388");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138135162L);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1389");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1390");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1391");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1392");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1393");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass6 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "43) test1393(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138145575L + "'", long2 == 1783138145575L);
// flaky "42) test1393(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138145575L + "'", long5 == 1783138145575L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1394");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1395");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType14 = org.joda.time.DateTimeUtils.getPeriodType(periodType13);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1396");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138129703L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1397");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass8 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1398");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138136377L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672874734d + "'", double1 == 2461225.672874734d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1399");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138115903L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1400");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138140824L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1401");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, readableInstant1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1402");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1403");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138108671L);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1404");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138129136L);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1405");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1406");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "44) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138145872L + "'", long2 == 1783138145872L);
// flaky "43) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138145872L + "'", long4 == 1783138145872L);
// flaky "35) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138145872L + "'", long5 == 1783138145872L);
// flaky "30) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138145872L + "'", long7 == 1783138145872L);
// flaky "22) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138145872L + "'", long8 == 1783138145872L);
// flaky "12) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138145872L + "'", long9 == 1783138145872L);
// flaky "6) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138145872L + "'", long10 == 1783138145872L);
// flaky "3) test1406(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138145872L + "'", long11 == 1783138145872L);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1407");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "45) test1407(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138145893L + "'", long2 == 1783138145893L);
// flaky "44) test1407(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138145893L + "'", long3 == 1783138145893L);
// flaky "36) test1407(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138145893L + "'", long5 == 1783138145893L);
// flaky "31) test1407(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138145893L + "'", long7 == 1783138145893L);
// flaky "23) test1407(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138145893L + "'", long8 == 1783138145893L);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1408");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1409");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1410");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType12);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1411");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(2441823L);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1412");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "46) test1412(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138146005L + "'", long2 == 1783138146005L);
// flaky "45) test1412(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138146005L + "'", long8 == 1783138146005L);
// flaky "37) test1412(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138146005L + "'", long9 == 1783138146005L);
// flaky "32) test1412(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138146005L + "'", long10 == 1783138146005L);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1413");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138105035L);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1414");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1415");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1416");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138140447L);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1417");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138127278L);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1418");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138117323L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726542013d + "'", double1 == 2461225.6726542013d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1419");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138139031L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1420");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1421");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1422");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1423");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1424");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(readableInterval13);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1425");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1426");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        long long13 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "47) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138146291L + "'", long2 == 1783138146291L);
// flaky "46) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138146291L + "'", long3 == 1783138146291L);
// flaky "38) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138146291L + "'", long5 == 1783138146291L);
// flaky "33) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138146291L + "'", long8 == 1783138146291L);
// flaky "24) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138146291L + "'", long9 == 1783138146291L);
// flaky "13) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138146291L + "'", long11 == 1783138146291L);
// flaky "7) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138146291L + "'", long12 == 1783138146291L);
// flaky "4) test1426(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138146291L + "'", long13 == 1783138146291L);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1427");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138115967L);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1428");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType14 = org.joda.time.DateTimeUtils.getPeriodType(periodType13);
        org.joda.time.PeriodType periodType15 = org.joda.time.DateTimeUtils.getPeriodType(periodType14);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1429");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1430");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "48) test1430(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138146355L + "'", long2 == 1783138146355L);
// flaky "47) test1430(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138146355L + "'", long4 == 1783138146355L);
// flaky "39) test1430(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138146355L + "'", long5 == 1783138146355L);
// flaky "34) test1430(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138146355L + "'", long6 == 1783138146355L);
// flaky "25) test1430(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138146355L + "'", long9 == 1783138146355L);
// flaky "14) test1430(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138146355L + "'", long10 == 1783138146355L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1431");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1432");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672524977d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138106158L + "'", long1 == 1783138106158L);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1433");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass6 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "49) test1433(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138146425L + "'", long2 == 1783138146425L);
// flaky "48) test1433(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138146425L + "'", long3 == 1783138146425L);
// flaky "40) test1433(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138146425L + "'", long4 == 1783138146425L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1434");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        java.lang.Class<?> wildcardClass12 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1435");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138115967L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1436");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        java.lang.Class<?> wildcardClass11 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1437");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138123996L);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1438");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672770162d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138127342L + "'", long1 == 1783138127342L);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1439");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "50) test1439(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138146530L + "'", long2 == 1783138146530L);
// flaky "49) test1439(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138146530L + "'", long5 == 1783138146530L);
// flaky "41) test1439(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138146530L + "'", long6 == 1783138146530L);
// flaky "35) test1439(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138146530L + "'", long10 == 1783138146530L);
// flaky "26) test1439(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138146530L + "'", long11 == 1783138146530L);
// flaky "15) test1439(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138146530L + "'", long12 == 1783138146530L);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1440");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138135568L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1441");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123946L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1442");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass6 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1443");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1444");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1445");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(readableInterval13);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1446");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138101789L);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1447");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138129905L);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1448");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass13 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "51) test1448(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138146704L + "'", long2 == 1783138146704L);
// flaky "50) test1448(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138146704L + "'", long3 == 1783138146704L);
// flaky "42) test1448(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138146704L + "'", long5 == 1783138146704L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1449");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138120165L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1450");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138113636L);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1451");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1452");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138129371L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1453");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1454");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1455");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138138193L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728957524d + "'", double1 == 2461225.6728957524d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1456");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1457");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118434L);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1458");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138142153L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1459");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass12 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "52) test1459(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138146927L + "'", long2 == 1783138146927L);
// flaky "51) test1459(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138146927L + "'", long5 == 1783138146927L);
// flaky "43) test1459(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138146927L + "'", long6 == 1783138146927L);
// flaky "36) test1459(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138146927L + "'", long10 == 1783138146927L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1460");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138104773L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725089466d + "'", double1 == 2461225.6725089466d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1461");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1462");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138142878L);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1463");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType14 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1464");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1465");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138138344L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1466");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1467");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass10 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1468");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "53) test1468(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138147055L + "'", long2 == 1783138147055L);
// flaky "52) test1468(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138147055L + "'", long3 == 1783138147055L);
// flaky "44) test1468(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138147055L + "'", long5 == 1783138147055L);
// flaky "37) test1468(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138147055L + "'", long8 == 1783138147055L);
// flaky "27) test1468(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138147055L + "'", long9 == 1783138147055L);
// flaky "16) test1468(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138147055L + "'", long11 == 1783138147055L);
// flaky "8) test1468(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138147055L + "'", long12 == 1783138147055L);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1469");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725173728d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138105501L + "'", long1 == 1783138105501L);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1470");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138113636L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1471");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138119516L);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1472");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138138305L);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1473");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138144737L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1474");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1475");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1476");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138140210L);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1477");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass10 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1478");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138144203L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6729653124d + "'", double1 == 2461225.6729653124d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1479");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138133367L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672839896d + "'", double1 == 2461225.672839896d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1480");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        java.lang.Class<?> wildcardClass14 = periodType13.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1481");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1482");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1483");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1484");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1485");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1486");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138127775L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1487");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass11 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1488");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138142878L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6729499768d + "'", double1 == 2461225.6729499768d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1489");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long12 = millisProvider0.getMillis();
        long long13 = millisProvider0.getMillis();
        long long14 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "54) test1489(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138147454L + "'", long4 == 1783138147454L);
// flaky "53) test1489(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138147454L + "'", long8 == 1783138147454L);
// flaky "45) test1489(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138147454L + "'", long10 == 1783138147454L);
// flaky "38) test1489(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138147454L + "'", long12 == 1783138147454L);
// flaky "28) test1489(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138147454L + "'", long13 == 1783138147454L);
// flaky "17) test1489(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1783138147454L + "'", long14 == 1783138147454L);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1490");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(readableInterval17);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1491");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass13 = chronology12.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1492");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "55) test1492(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138147520L + "'", long3 == 1783138147520L);
// flaky "54) test1492(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138147520L + "'", long5 == 1783138147520L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1493");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138132666L);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1494");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138108529L);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1495");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1496");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138144737L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672971493d + "'", double1 == 2461225.672971493d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1497");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "56) test1497(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138147619L + "'", long2 == 1783138147619L);
// flaky "55) test1497(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138147619L + "'", long5 == 1783138147619L);
// flaky "46) test1497(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138147619L + "'", long6 == 1783138147619L);
// flaky "39) test1497(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138147619L + "'", long8 == 1783138147619L);
// flaky "29) test1497(JA_019_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138147619L + "'", long9 == 1783138147619L);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1498");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138108529L);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1499");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression2.test1500");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138137453L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728871875d + "'", double1 == 2461225.6728871875d);
    }
}
