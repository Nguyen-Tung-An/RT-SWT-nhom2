import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_019_Regression1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0501");
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
        java.lang.Class<?> wildcardClass10 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0502");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138119363L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0503");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138109706L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0504");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138121148L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0505");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138107022L);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0506");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138101790L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0507");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138099567L);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0508");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138101417L);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0509");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138102616L);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0510");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138119916L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672684213d + "'", double1 == 2461225.672684213d);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0511");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138119400L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0512");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725119906d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138105035L + "'", long1 == 1783138105035L);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0513");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138118717L);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0514");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-106749550580L));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0515");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass8 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0516");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0517");
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
        java.lang.Class<?> wildcardClass10 = periodType9.getClass();
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0518");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass7 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "1) test0518(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138121714L + "'", long2 == 1783138121714L);
// flaky "1) test0518(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138121714L + "'", long4 == 1783138121714L);
// flaky "1) test0518(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138121714L + "'", long5 == 1783138121714L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0519");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114455L);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0520");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0521");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138113225L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0522");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0523");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138115225L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0524");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114930L);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0525");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138117483L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672656053d + "'", double1 == 2461225.672656053d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0526");
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
        java.lang.Class<?> wildcardClass14 = readableInterval13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0527");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138105035L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672511979d + "'", double1 == 2461225.672511979d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0528");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138119500L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672679398d + "'", double1 == 2461225.672679398d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0529");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138119233L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0530");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
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
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0531");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1L);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0532");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138114367L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672619988d + "'", double1 == 2461225.672619988d);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0533");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0534");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114472L);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0535");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138117409L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0536");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0537");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138116469L);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0538");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6726265047d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138114930L + "'", long1 == 1783138114930L);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0539");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138120382L);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0541");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138115651L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0542");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138119363L);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0543");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138120049L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0544");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass8 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0545");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138120740L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0546");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138119916L);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0547");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0548");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672637766d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138115903L + "'", long1 == 1783138115903L);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0549");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138102915L);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0550");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(2461226L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.528486412d + "'", double1 == 2440587.528486412d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0551");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
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
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0552");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138112844L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0553");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210863995200000L) + "'", long1 == (-210863995200000L));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0554");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138108917L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725569097d + "'", double1 == 2461225.6725569097d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0556");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology7);
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0557");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118932L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0558");
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
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0559");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 100);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0560");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0561");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
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
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0562");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138118434L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0563");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138121098L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726978933d + "'", double1 == 2461225.6726978933d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0564");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138117323L);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0565");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138115903L);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0566");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138118517L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0567");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138120316L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0568");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-106749550580L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0570");
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
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0571");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0572");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass8 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0573");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138119484L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0574");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138120724L);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0575");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass10 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "2) test0575(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138123362L + "'", long2 == 1783138123362L);
// flaky "2) test0575(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138123362L + "'", long3 == 1783138123362L);
// flaky "2) test0575(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138123362L + "'", long5 == 1783138123362L);
// flaky "1) test0575(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138123362L + "'", long7 == 1783138123362L);
// flaky "1) test0575(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138123362L + "'", long8 == 1783138123362L);
// flaky "1) test0575(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138123362L + "'", long9 == 1783138123362L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0576");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138120981L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0577");
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
        java.lang.Class<?> wildcardClass10 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0578");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114869L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0579");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0580");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0581");
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
        java.lang.Class<?> wildcardClass10 = dateTimeZone8.getClass();
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0582");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138113754L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0583");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138111459L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0584");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138105145L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0585");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138101366L);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0586");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138121881L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672706956d + "'", double1 == 2461225.672706956d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0587");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0588");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138121881L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0589");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass7 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0590");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138108917L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0591");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138123479L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0592");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672706956d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138121881L + "'", long1 == 1783138121881L);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0593");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0594");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138120415L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0595");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0596");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138123731L);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0597");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118717L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0598");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138110107L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0599");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "3) test0599(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138123946L + "'", long5 == 1783138123946L);
// flaky "3) test0599(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138123946L + "'", long6 == 1783138123946L);
// flaky "3) test0599(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138123946L + "'", long8 == 1783138123946L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0600");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138120165L);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0601");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138107796L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0602");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138121166L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0603");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138103317L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0604");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "4) test0604(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138124095L + "'", long2 == 1783138124095L);
// flaky "4) test0604(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138124095L + "'", long3 == 1783138124095L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0605");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138121714L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0606");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138106158L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0607");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138121148L);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0608");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138118932L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0609");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138117148L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672652176d + "'", double1 == 2461225.672652176d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0610");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        java.lang.Class<?> wildcardClass3 = chronology2.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0611");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138107464L);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0612");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138122180L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672710417d + "'", double1 == 2461225.672710417d);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0613");
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
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
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
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0614");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0615");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138120740L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0616");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138117483L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0617");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114556L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0618");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-9223372036854775808L));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0619");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138104955L);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0620");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138105035L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0621");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138098502L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0622");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0623");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0624");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138099567L);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0625");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 100);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0626");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138118550L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726684025d + "'", double1 == 2461225.6726684025d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0627");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138118351L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726660994d + "'", double1 == 2461225.6726660994d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0628");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-106749550580L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2439351.972794213d + "'", double1 == 2439351.972794213d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0629");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138121548L);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0630");
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
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "5) test0630(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138124731L + "'", long2 == 1783138124731L);
// flaky "5) test0630(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138124731L + "'", long5 == 1783138124731L);
// flaky "4) test0630(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138124731L + "'", long6 == 1783138124731L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0631");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138107022L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0632");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0633");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138113225L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672606771d + "'", double1 == 2461225.672606771d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0634");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114472L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0635");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "6) test0635(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138124861L + "'", long4 == 1783138124861L);
// flaky "6) test0635(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138124861L + "'", long7 == 1783138124861L);
// flaky "5) test0635(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138124861L + "'", long8 == 1783138124861L);
// flaky "2) test0635(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138124861L + "'", long10 == 1783138124861L);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0636");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138123187L);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0637");
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
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
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
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0638");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass6 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0639");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138124095L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0640");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138124345L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0641");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138116397L);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0642");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass7 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0643");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138121082L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0644");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123906L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0645");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(97L);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0646");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138116469L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0647");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138117483L);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0648");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0649");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138123313L);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0650");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(2461226L);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0651");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.Class<?> wildcardClass14 = dateTimeZone10.getClass();
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0652");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138121614L);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0653");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0654");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672478403d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138102134L + "'", long1 == 1783138102134L);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0655");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123996L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0656");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0657");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(10.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210865896000000L) + "'", long1 == (-210865896000000L));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0658");
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
        java.lang.Class<?> wildcardClass12 = readableInterval6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0659");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(1.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866673600000L) + "'", long1 == (-210866673600000L));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0660");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6726778126d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138119363L + "'", long1 == 1783138119363L);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0661");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0662");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138122236L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0663");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology7);
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0664");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138122043L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0665");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138105035L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0666");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0667");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138117356L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672654583d + "'", double1 == 2461225.672654583d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0668");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        long long13 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass14 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "7) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138125971L + "'", long2 == 1783138125971L);
// flaky "7) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138125971L + "'", long3 == 1783138125971L);
// flaky "6) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138125971L + "'", long5 == 1783138125971L);
// flaky "3) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138125971L + "'", long7 == 1783138125971L);
// flaky "2) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138125971L + "'", long10 == 1783138125971L);
// flaky "2) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138125971L + "'", long11 == 1783138125971L);
// flaky "1) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138125971L + "'", long12 == 1783138125971L);
// flaky "1) test0668(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138125971L + "'", long13 == 1783138125971L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0669");
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
        java.lang.Class<?> wildcardClass12 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "8) test0669(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138126011L + "'", long4 == 1783138126011L);
// flaky "8) test0669(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138126011L + "'", long8 == 1783138126011L);
// flaky "7) test0669(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138126011L + "'", long10 == 1783138126011L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0670");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(10L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0671");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138108672L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672554074d + "'", double1 == 2461225.672554074d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0672");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138119233L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0673");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138117535L);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0674");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2440587.5000011576d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0675");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass12 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "9) test0675(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138126174L + "'", long4 == 1783138126174L);
// flaky "9) test0675(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138126174L + "'", long10 == 1783138126174L);
// flaky "8) test0675(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138126174L + "'", long11 == 1783138126174L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0676");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138122043L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone8.getClass();
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0678");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass9 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "10) test0678(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138126342L + "'", long2 == 1783138126342L);
// flaky "10) test0678(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138126342L + "'", long8 == 1783138126342L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0679");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138104955L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0680");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "11) test0680(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138126374L + "'", long5 == 1783138126374L);
// flaky "11) test0680(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138126374L + "'", long7 == 1783138126374L);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0681");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0682");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0683");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((-1.0674955057980064E11d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0684");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138123329L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672723715d + "'", double1 == 2461225.672723715d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0685");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138106158L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0686");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass5 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "12) test0686(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138126536L + "'", long3 == 1783138126536L);
// flaky "12) test0686(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138126536L + "'", long4 == 1783138126536L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0687");
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
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass12 = chronology8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0688");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138124262L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0689");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138120415L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0690");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138124545L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0691");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138102766L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0692");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0693");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 106754431755L + "'", long1 == 106754431755L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0694");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138121548L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727031018d + "'", double1 == 2461225.6727031018d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0695");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0696");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0697");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114740L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0698");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0699");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0700");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "13) test0700(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138126976L + "'", long2 == 1783138126976L);
// flaky "13) test0700(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138126976L + "'", long4 == 1783138126976L);
// flaky "9) test0700(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138126976L + "'", long5 == 1783138126976L);
// flaky "4) test0700(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138126976L + "'", long7 == 1783138126976L);
// flaky "3) test0700(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138126976L + "'", long8 == 1783138126976L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0701");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138115651L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0702");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0703");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138122846L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0704");
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
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0705");
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
        java.lang.Class<?> wildcardClass13 = dateTimeZone9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0706");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0707");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725524305d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138108529L + "'", long1 == 1783138108529L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0708");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0709");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-106749550580L));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0710");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "14) test0710(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138127278L + "'", long4 == 1783138127278L);
// flaky "14) test0710(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138127278L + "'", long7 == 1783138127278L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0711");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(32L);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0712");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-210865896000000L));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0713");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0714");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-106749550580L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2439352L + "'", long1 == 2439352L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0715");
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
        org.joda.time.PeriodType periodType14 = org.joda.time.DateTimeUtils.getPeriodType(periodType12);
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0716");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138117148L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0717");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0718");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138114455L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0719");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138124628L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.67273875d + "'", double1 == 2461225.67273875d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0720");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138127134L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0721");
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
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology9);
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
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0722");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138127342L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672770162d + "'", double1 == 2461225.672770162d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0723");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138122180L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0724");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138124428L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0725");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0726");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138117849L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0727");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118351L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0728");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138121881L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0729");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138123457L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672725197d + "'", double1 == 2461225.672725197d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0730");
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
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0731");
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
        java.lang.Class<?> wildcardClass10 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0732");
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
        long long10 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "15) test0732(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138127907L + "'", long2 == 1783138127907L);
// flaky "15) test0732(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138127907L + "'", long4 == 1783138127907L);
// flaky "10) test0732(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138127907L + "'", long10 == 1783138127907L);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0733");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(2440587L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0734");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138118617L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0735");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138126374L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0736");
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
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass13 = chronology9.getClass();
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
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0737");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "16) test0737(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138128072L + "'", long2 == 1783138128072L);
// flaky "16) test0737(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138128072L + "'", long4 == 1783138128072L);
// flaky "11) test0737(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138128072L + "'", long6 == 1783138128072L);
// flaky "5) test0737(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138128072L + "'", long8 == 1783138128072L);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0738");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138124528L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727375924d + "'", double1 == 2461225.6727375924d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0739");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138109706L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0740");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138108672L);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0741");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0742");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138121131L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726982757d + "'", double1 == 2461225.6726982757d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0743");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138127907L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727767014d + "'", double1 == 2461225.6727767014d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0744");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138125971L);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0745");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672554074d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138108671L + "'", long1 == 1783138108671L);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0746");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0747");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138112874L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0748");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672676308d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138119233L + "'", long1 == 1783138119233L);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0749");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0750");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone8.getClass();
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0751");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138115651L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0752");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0753");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138121031L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0754");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 1);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0755");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138108530L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0756");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138123479L);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0757");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138125009L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0758");
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0759");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138119500L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0760");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138127134L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0761");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138107796L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0762");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138110070L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0763");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138111459L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0764");
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
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "17) test0764(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138128820L + "'", long2 == 1783138128820L);
// flaky "17) test0764(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138128820L + "'", long4 == 1783138128820L);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0765");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 106754431755L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0766");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138126502L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0767");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0768");
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
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0769");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138120682L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672693079d + "'", double1 == 2461225.672693079d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0770");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138126552L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727610184d + "'", double1 == 2461225.6727610184d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0771");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0772");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138124428L);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0773");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138115026L);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0774");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0775");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118667L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0776");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138117409L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0777");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672513252d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138105144L + "'", long1 == 1783138105144L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0778");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138124196L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0779");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138119400L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0780");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138116509L);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0781");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118550L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0782");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138123646L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0783");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138124745L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672740104d + "'", double1 == 2461225.672740104d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0784");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        long long7 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "18) test0784(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138129339L + "'", long2 == 1783138129339L);
// flaky "18) test0784(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138129339L + "'", long6 == 1783138129339L);
// flaky "12) test0784(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138129339L + "'", long7 == 1783138129339L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0785");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138126536L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0786");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138129404L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0787");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass10 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0788");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138127214L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0789");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138126342L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672758588d + "'", double1 == 2461225.672758588d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0790");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0791");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138114556L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672622176d + "'", double1 == 2461225.672622176d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0792");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138121181L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0793");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138125009L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0794");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138118932L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672672824d + "'", double1 == 2461225.672672824d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0795");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138118667L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0796");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138123329L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0797");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138127907L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0798");
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
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
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
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0799");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0800");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138126536L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727608335d + "'", double1 == 2461225.6727608335d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0801");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138099335L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0802");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123313L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0803");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        long long12 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long14 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "19) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138129905L + "'", long2 == 1783138129905L);
// flaky "19) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138129905L + "'", long3 == 1783138129905L);
// flaky "13) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138129905L + "'", long5 == 1783138129905L);
// flaky "6) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138129905L + "'", long7 == 1783138129905L);
// flaky "4) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138129905L + "'", long10 == 1783138129905L);
// flaky "3) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138129905L + "'", long11 == 1783138129905L);
// flaky "2) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138129905L + "'", long12 == 1783138129905L);
// flaky "2) test0803(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1783138129905L + "'", long14 == 1783138129905L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0804");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138123946L);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0805");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0806");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0807");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138107463L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0808");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138108169L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0809");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138128281L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0810");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (-1));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0811");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
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
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0812");
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
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0813");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138113636L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0814");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0815");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass7 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "20) test0815(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138130379L + "'", long5 == 1783138130379L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0816");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0817");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass4 = chronology2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0818");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass9 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0819");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138123996L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0820");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138120049L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0821");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0822");
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
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass11 = periodType10.getClass();
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0823");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138118134L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0824");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass7 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "21) test0824(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138130554L + "'", long2 == 1783138130554L);
// flaky "20) test0824(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138130554L + "'", long3 == 1783138130554L);
// flaky "14) test0824(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138130554L + "'", long5 == 1783138130554L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0825");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138127775L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0826");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138120599L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672692118d + "'", double1 == 2461225.672692118d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0827");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138126374L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727589583d + "'", double1 == 2461225.6727589583d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0828");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672622176d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138114555L + "'", long1 == 1783138114555L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0829");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-210866673600000L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0830");
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
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
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
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0831");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138128072L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0832");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0833");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0834");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138112874L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0835");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866673600000L) + "'", long1 == (-210866673600000L));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0836");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138117483L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0837");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138120740L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0838");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138126976L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672765926d + "'", double1 == 2461225.672765926d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0839");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138114869L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0840");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138119433L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672678623d + "'", double1 == 2461225.672678623d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0841");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138104773L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0842");
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
        java.lang.Class<?> wildcardClass10 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0843");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone6.getClass();
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0844");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, readableInstant1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0845");
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
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
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
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0846");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138129136L);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0847");
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
        long long10 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "22) test0847(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138131288L + "'", long4 == 1783138131288L);
// flaky "21) test0847(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138131288L + "'", long7 == 1783138131288L);
// flaky "15) test0847(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138131288L + "'", long8 == 1783138131288L);
// flaky "7) test0847(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138131288L + "'", long9 == 1783138131288L);
// flaky "5) test0847(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138131288L + "'", long10 == 1783138131288L);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0848");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000011227d + "'", double1 == 2440587.5000011227d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0849");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138121914L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672707338d + "'", double1 == 2461225.672707338d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0850");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138121564L);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0851");
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
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "23) test0851(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138131355L + "'", long2 == 1783138131355L);
// flaky "22) test0851(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138131355L + "'", long4 == 1783138131355L);
// flaky "16) test0851(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138131355L + "'", long9 == 1783138131355L);
// flaky "8) test0851(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138131355L + "'", long10 == 1783138131355L);
// flaky "6) test0851(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138131355L + "'", long11 == 1783138131355L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0852");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138126502L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.67276044d + "'", double1 == 2461225.67276044d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0853");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0854");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138130053L);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0855");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0856");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138129537L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0857");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138130705L);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0858");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0859");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138102616L);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0860");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123731L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0861");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass7 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0862");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138119363L);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0863");
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
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass11 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "24) test0863(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138131712L + "'", long4 == 1783138131712L);
// flaky "23) test0863(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138131712L + "'", long8 == 1783138131712L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0864");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138123457L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0865");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138121331L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727005905d + "'", double1 == 2461225.6727005905d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0866");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138124428L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672736435d + "'", double1 == 2461225.672736435d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0867");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-210863995200000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0868");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138126976L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0869");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672710417d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138122180L + "'", long1 == 1783138122180L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0870");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 2440587L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-43200000L) + "'", long1 == (-43200000L));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0871");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138131355L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0872");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138121131L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0873");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138130213L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0874");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138118134L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0875");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138116237L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0876");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass7 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0877");
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
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
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
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0878");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138122595L);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0879");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138127542L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0880");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0881");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114555L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0882");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138099567L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0883");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138108169L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0884");
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
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0885");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0886");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0887");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114042L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0888");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138115225L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672629919d + "'", double1 == 2461225.672629919d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0889");
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
        long long12 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "25) test0889(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138132420L + "'", long2 == 1783138132420L);
// flaky "24) test0889(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138132420L + "'", long3 == 1783138132420L);
// flaky "17) test0889(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138132420L + "'", long5 == 1783138132420L);
// flaky "9) test0889(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138132420L + "'", long12 == 1783138132420L);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0890");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "26) test0890(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138132438L + "'", long2 == 1783138132438L);
// flaky "25) test0890(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138132438L + "'", long3 == 1783138132438L);
// flaky "18) test0890(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138132438L + "'", long4 == 1783138132438L);
// flaky "10) test0890(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138132438L + "'", long5 == 1783138132438L);
// flaky "7) test0890(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138132438L + "'", long6 == 1783138132438L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0891");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138129404L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0892");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138105144L);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0893");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass9 = periodType6.getClass();
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0894");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0895");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138112874L);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0896");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass9 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "27) test0896(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138132666L + "'", long2 == 1783138132666L);
// flaky "26) test0896(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138132666L + "'", long4 == 1783138132666L);
// flaky "19) test0896(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138132666L + "'", long6 == 1783138132666L);
// flaky "11) test0896(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138132666L + "'", long8 == 1783138132666L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0897");
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
        java.lang.Class<?> wildcardClass14 = readableInterval9.getClass();
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0898");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0899");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138113225L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0900");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0901");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138124731L);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0902");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138121098L);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0903");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "28) test0903(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138132919L + "'", long2 == 1783138132919L);
// flaky "27) test0903(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138132919L + "'", long3 == 1783138132919L);
// flaky "20) test0903(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138132919L + "'", long6 == 1783138132919L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0904");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138102939L);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0905");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866673600000L) + "'", long1 == (-210866673600000L));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0906");
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
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone13);
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
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0907");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass7 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0908");
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
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval17);
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
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0909");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0910");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672436366d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138098502L + "'", long1 == 1783138098502L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0911");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138129537L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0912");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138127214L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0913");
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
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
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
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0914");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138108529L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0915");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        long long8 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "29) test0915(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138133351L + "'", long2 == 1783138133351L);
// flaky "28) test0915(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138133351L + "'", long7 == 1783138133351L);
// flaky "21) test0915(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138133351L + "'", long8 == 1783138133351L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0916");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long11 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "30) test0916(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138133367L + "'", long2 == 1783138133367L);
// flaky "29) test0916(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138133367L + "'", long6 == 1783138133367L);
// flaky "22) test0916(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138133367L + "'", long7 == 1783138133367L);
// flaky "12) test0916(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138133367L + "'", long9 == 1783138133367L);
// flaky "8) test0916(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138133367L + "'", long11 == 1783138133367L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0917");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138127086L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0918");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        long long7 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long9 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "31) test0918(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138133406L + "'", long2 == 1783138133406L);
// flaky "30) test0918(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138133406L + "'", long3 == 1783138133406L);
// flaky "23) test0918(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138133406L + "'", long5 == 1783138133406L);
// flaky "13) test0918(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138133406L + "'", long6 == 1783138133406L);
// flaky "9) test0918(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138133406L + "'", long7 == 1783138133406L);
// flaky "4) test0918(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138133406L + "'", long9 == 1783138133406L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0919");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass6 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0920");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0921");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138113409L);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0922");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0923");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0924");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138126502L);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0925");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138129136L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672790926d + "'", double1 == 2461225.672790926d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0926");
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
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology11);
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
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0927");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138126552L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0928");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0929");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138132919L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0930");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138124528L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0931");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138119500L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0932");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138109374L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672562199d + "'", double1 == 2461225.672562199d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0933");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138131295L);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0934");
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
        java.lang.Class<?> wildcardClass11 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "32) test0934(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138133921L + "'", long2 == 1783138133921L);
// flaky "31) test0934(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138133921L + "'", long6 == 1783138133921L);
// flaky "24) test0934(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138133921L + "'", long7 == 1783138133921L);
// flaky "14) test0934(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138133921L + "'", long10 == 1783138133921L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0935");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138114555L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0936");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass6 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0937");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138122531L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0938");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138104832L);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0939");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138103317L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0940");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138128354L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672781875d + "'", double1 == 2461225.672781875d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0941");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass7 = chronology3.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0942");
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
        java.lang.Class<?> wildcardClass10 = readableInterval5.getClass();
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0943");
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
        java.lang.Class<?> wildcardClass15 = dateTimeZone13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0944");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138132420L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0945");
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
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0946");
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
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "33) test0946(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138134276L + "'", long4 == 1783138134276L);
// flaky "32) test0946(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138134276L + "'", long7 == 1783138134276L);
// flaky "25) test0946(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138134276L + "'", long9 == 1783138134276L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0947");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass9 = chronology6.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0948");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138127907L);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0949");
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
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0950");
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
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0951");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138118717L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726703355d + "'", double1 == 2461225.6726703355d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0952");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138121031L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0953");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass8 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0954");
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0955");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(2439352L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0956");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-210863995200000L));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0957");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "34) test0957(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138134519L + "'", long2 == 1783138134519L);
// flaky "33) test0957(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138134519L + "'", long3 == 1783138134519L);
// flaky "26) test0957(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138134519L + "'", long5 == 1783138134519L);
// flaky "15) test0957(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138134519L + "'", long6 == 1783138134519L);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0958");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0959");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138131656L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6728200926d + "'", double1 == 2461225.6728200926d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0960");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672758588d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138126342L + "'", long1 == 1783138126342L);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0961");
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
        java.lang.Class<?> wildcardClass12 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "35) test0961(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138134694L + "'", long2 == 1783138134694L);
// flaky "34) test0961(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138134694L + "'", long4 == 1783138134694L);
// flaky "27) test0961(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138134694L + "'", long5 == 1783138134694L);
// flaky "16) test0961(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138134694L + "'", long6 == 1783138134694L);
// flaky "10) test0961(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138134694L + "'", long9 == 1783138134694L);
// flaky "5) test0961(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138134694L + "'", long10 == 1783138134694L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0962");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0963");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138132594L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0964");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138127542L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0965");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138106018L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0966");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138118351L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0967");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138123362L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0968");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2440587.5282475464d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0969");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138118517L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0970");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "36) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138134901L + "'", long2 == 1783138134901L);
// flaky "35) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138134901L + "'", long3 == 1783138134901L);
// flaky "28) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138134901L + "'", long5 == 1783138134901L);
// flaky "17) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138134901L + "'", long6 == 1783138134901L);
// flaky "11) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138134901L + "'", long8 == 1783138134901L);
// flaky "6) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138134901L + "'", long9 == 1783138134901L);
// flaky "3) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138134901L + "'", long10 == 1783138134901L);
// flaky "3) test0970(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138134901L + "'", long11 == 1783138134901L);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0971");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0972");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0973");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138127662L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6727738655d + "'", double1 == 2461225.6727738655d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0974");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
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
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0975");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138130133L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0976");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0977");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0978");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138119484L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0979");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138110107L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672570683d + "'", double1 == 2461225.672570683d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0980");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0981");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138116509L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.67264478d + "'", double1 == 2461225.67264478d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0982");
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
        java.lang.Class<?> wildcardClass13 = dateTimeZone12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0983");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138128294L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0984");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138125945L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0985");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138119600L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0986");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0987");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0988");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138125029L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0989");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138101677L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724731135d + "'", double1 == 2461225.6724731135d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0990");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138117409L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672655197d + "'", double1 == 2461225.672655197d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0991");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138123646L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0992");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138124731L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672739942d + "'", double1 == 2461225.672739942d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0993");
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
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long15 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "37) test0993(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138135585L + "'", long4 == 1783138135585L);
// flaky "36) test0993(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138135585L + "'", long7 == 1783138135585L);
// flaky "29) test0993(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138135585L + "'", long9 == 1783138135585L);
// flaky "18) test0993(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138135585L + "'", long11 == 1783138135585L);
// flaky "12) test0993(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1783138135585L + "'", long12 == 1783138135585L);
// flaky "7) test0993(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1783138135585L + "'", long13 == 1783138135585L);
// flaky "4) test0993(JA_019_Regression1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1783138135585L + "'", long15 == 1783138135585L);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0994");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138126668L);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0995");
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
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        java.lang.Class<?> wildcardClass17 = chronology15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0996");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138119484L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672679213d + "'", double1 == 2461225.672679213d);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0997");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138133921L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0998");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138121914L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test0999");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138114455L);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression1.test1000");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138129921L);
    }
}
