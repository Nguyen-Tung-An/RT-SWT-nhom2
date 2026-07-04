import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_019_Regression0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0001");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.size()\" because \"m\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0002");
        long long0 = org.joda.time.DateTimeUtils.currentTimeMillis();
// flaky "1) test0002(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1783138097453L + "'", long0 == 1783138097453L);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0003");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0004");
        org.joda.time.ReadableDuration readableDuration0 = null;
        long long1 = org.joda.time.DateTimeUtils.getDurationMillis(readableDuration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0005");
        org.joda.time.ReadableInstant readableInstant0 = null;
        long long1 = org.joda.time.DateTimeUtils.getInstantMillis(readableInstant0);
// flaky "2) test0005(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138097687L + "'", long1 == 1783138097687L);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0006");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866760000000L) + "'", long1 == (-210866760000000L));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0007");
        org.joda.time.ReadablePartial readablePartial0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.joda.time.DateTimeUtils.isContiguous(readablePartial0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0008");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        java.lang.Class<?> wildcardClass2 = chronology1.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0009");
        org.joda.time.DateTimeUtils.setCurrentMillisSystem();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0010");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210863736000000L) + "'", long1 == (-210863736000000L));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0011");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormatSymbols dateFormatSymbols1 = org.joda.time.DateTimeUtils.getDateFormatSymbols(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0012");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) -1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0013");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210865896000000L) + "'", long1 == (-210865896000000L));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0014");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866760000000L) + "'", long1 == (-210866760000000L));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0015");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0016");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The MillisProvider must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0017");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-1L));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0018");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-210866760000000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0019");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.4999999884d + "'", double1 == 2440587.4999999884d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0020");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0021");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.4999999884d + "'", double1 == 2440587.4999999884d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0022");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        java.lang.Class<?> wildcardClass2 = periodType1.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0024");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0025");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866846400000L) + "'", long1 == (-210866846400000L));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0026");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210863995200000L) + "'", long1 == (-210863995200000L));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0027");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass4 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "3) test0027(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138099080L + "'", long2 == 1783138099080L);
// flaky "1) test0027(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138099080L + "'", long3 == 1783138099080L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0028");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866673600000L) + "'", long1 == (-210866673600000L));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0030");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0031");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210858379200000L) + "'", long1 == (-210858379200000L));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0032");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.500000116d + "'", double1 == 2440587.500000116d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0033");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-210866846400000L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0034");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        java.lang.Class<?> wildcardClass1 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0035");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0036");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000011576d + "'", double1 == 2440587.5000011576d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0037");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138099335L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672446007d + "'", double1 == 2461225.672446007d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0038");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5d + "'", double1 == 2440587.5d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0039");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-210866846400000L));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0040");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866760000000L) + "'", long1 == (-210866760000000L));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0041");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866760000000L) + "'", long1 == (-210866760000000L));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0042");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.500000116d + "'", double1 == 2440587.500000116d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0043");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 'a');
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0044");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000000116d + "'", double1 == 2440587.5000000116d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0045");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-210863736000000L));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0046");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(10L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0047");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0048");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138098831L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0049");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
        java.lang.Class<?> wildcardClass3 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0050");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000011576d + "'", double1 == 2440587.5000011576d);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0051");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-210863995200000L));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0052");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440587L + "'", long1 == 2440587L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0053");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        java.lang.Class<?> wildcardClass4 = periodType1.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0054");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) '4');
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0055");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-210865896000000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0056");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138098502L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672436366d + "'", double1 == 2461225.672436366d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0057");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 100);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0058");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138098436L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724356017d + "'", double1 == 2461225.6724356017d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0059");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.500000116d + "'", double1 == 2440587.500000116d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0060");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138099080L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0061");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-210863736000000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0062");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 100.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210858120000000L) + "'", long1 == (-210858120000000L));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0063");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138098502L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0064");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138099816L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0065");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, readableInstant1);
        java.lang.Class<?> wildcardClass3 = chronology2.getClass();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0066");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) '4');
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0067");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass5 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "4) test0067(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138100983L + "'", long2 == 1783138100983L);
// flaky "2) test0067(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138100983L + "'", long3 == 1783138100983L);
// flaky "1) test0067(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138100983L + "'", long4 == 1783138100983L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0068");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0069");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138099934L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0070");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138098831L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0071");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.50000037d + "'", double1 == 2440587.50000037d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0072");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5d + "'", double1 == 2440587.5d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0074");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.4999999884d + "'", double1 == 2440587.4999999884d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0076");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-210863995200000L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0077");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(0L);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0078");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0079");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440587L + "'", long1 == 2440587L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0080");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138100983L);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0081");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2440587.5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0082");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass5 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "5) test0082(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138101917L + "'", long4 == 1783138101917L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0083");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        java.lang.Class<?> wildcardClass4 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0084");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138101417L);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0085");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0086");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 'a');
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0087");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass4 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0088");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138101417L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0089");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138097453L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0090");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) '#');
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0091");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) ' ');
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0092");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138100967L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0093");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(2440588L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0094");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass4 = chronology2.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0095");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0096");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138101917L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0097");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0098");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-210858379200000L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0099");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138098831L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724401736d + "'", double1 == 2461225.6724401736d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0100");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138099335L);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0101");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(2440587L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0102");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 100);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0103");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138102134L);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0104");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0105");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138099816L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0106");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138102939L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0107");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138099335L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0108");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0109");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138102616L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724839816d + "'", double1 == 2461225.6724839816d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0110");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210865896000000L) + "'", long1 == (-210865896000000L));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0111");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138097687L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672426933d + "'", double1 == 2461225.672426933d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0112");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0113");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0114");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0115");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 0.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866760000000L) + "'", long1 == (-210866760000000L));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0117");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(100.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210858120000000L) + "'", long1 == (-210858120000000L));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0118");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138098436L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0119");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138097453L);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0120");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        java.lang.Class<?> wildcardClass5 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0121");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass4 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0122");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-210866673600000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0123");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138100582L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724604396d + "'", double1 == 2461225.6724604396d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0124");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138103444L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0125");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology5.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0126");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138104955L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0127");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        java.lang.Class<?> wildcardClass3 = chronology2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0128");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138102939L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0129");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass8 = readableInterval1.getClass();
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0130");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138104676L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672507824d + "'", double1 == 2461225.672507824d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0131");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(100L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0132");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0133");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138105247L);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0134");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138104676L);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0135");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-210866760000000L));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0136");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-210858120000000L));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0137");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(2440588L);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0138");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(0L);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0139");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0140");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass6 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "6) test0140(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138106158L + "'", long2 == 1783138106158L);
// flaky "3) test0140(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138106158L + "'", long4 == 1783138106158L);
// flaky "2) test0140(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138106158L + "'", long5 == 1783138106158L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0141");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138105247L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672514433d + "'", double1 == 2461225.672514433d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0142");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass8 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0143");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138100967L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672464896d + "'", double1 == 2461225.672464896d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0144");
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
        java.lang.Class<?> wildcardClass10 = periodType8.getClass();
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0145");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138101677L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0146");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0147");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass3 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0148");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0149");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138104832L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725096297d + "'", double1 == 2461225.6725096297d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0150");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0151");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138101533L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0152");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-210858120000000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0153");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138104955L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725110533d + "'", double1 == 2461225.6725110533d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0154");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138104955L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0155");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138101790L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0156");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0157");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210858120000000L) + "'", long1 == (-210858120000000L));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0158");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138099568L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0159");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138106748L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0160");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0161");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 10.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210865896000000L) + "'", long1 == (-210865896000000L));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0162");
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
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0163");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138100983L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0164");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138104773L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0165");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-9223372036854775808L));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0166");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138101917L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0167");
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
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0168");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138099816L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672451574d + "'", double1 == 2461225.672451574d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0169");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138101366L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0170");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass8 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0171");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "7) test0171(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138108297L + "'", long2 == 1783138108297L);
// flaky "4) test0171(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138108297L + "'", long3 == 1783138108297L);
// flaky "3) test0171(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138108297L + "'", long5 == 1783138108297L);
// flaky "1) test0171(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138108297L + "'", long6 == 1783138108297L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0172");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138105036L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0173");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138101533L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0174");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138106018L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0175");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-210866846400000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0176");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0177");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138102915L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0178");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138104773L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0179");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0180");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138108530L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725524305d + "'", double1 == 2461225.6725524305d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0181");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138102766L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0182");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0183");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138106447L);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0184");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) -1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0185");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000011576d + "'", double1 == 2440587.5000011576d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0186");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210858120000000L) + "'", long1 == (-210858120000000L));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0187");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass4 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0188");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138101790L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672474421d + "'", double1 == 2461225.672474421d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0189");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138101533L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0190");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0191");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0192");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-210866846400000L));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0193");
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
        java.lang.Class<?> wildcardClass10 = chronology7.getClass();
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0194");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725110533d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138104955L + "'", long1 == 1783138104955L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0195");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138106748L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725318055d + "'", double1 == 2461225.6725318055d);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0196");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138098436L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0197");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138105036L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0200");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138106158L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0201");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0202");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138109777L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0203");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "8) test0203(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138110070L + "'", long5 == 1783138110070L);
// flaky "5) test0203(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138110070L + "'", long6 == 1783138110070L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0204");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-210863736000000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0205");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass5 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0206");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((-1.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866846400000L) + "'", long1 == (-210866846400000L));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0207");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138100581L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724604284d + "'", double1 == 2461225.6724604284d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0208");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass5 = chronology3.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0209");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866846400000L) + "'", long1 == (-210866846400000L));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0210");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138106158L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672524977d + "'", double1 == 2461225.672524977d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0211");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0212");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138101366L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0213");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138100582L);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0214");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866673600000L) + "'", long1 == (-210866673600000L));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0215");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138107464L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725400924d + "'", double1 == 2461225.6725400924d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0216");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138106018L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0217");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2440587.4999999884d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0218");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0219");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass9 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0220");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866846400000L) + "'", long1 == (-210866846400000L));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0221");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000011576d + "'", double1 == 2440587.5000011576d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0222");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138100582L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0223");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0224");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138101790L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0225");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 100);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0226");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass9 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0227");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138108530L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0228");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138105145L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672513252d + "'", double1 == 2461225.672513252d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0229");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138105036L);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0230");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138110025L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0232");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138100983L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0233");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(35L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0234");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0235");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138109706L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672566042d + "'", double1 == 2461225.672566042d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0236");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138102939L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.67248772d + "'", double1 == 2461225.67248772d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0237");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 100);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0238");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138109374L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0239");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138108917L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0240");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138100582L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0241");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138110868L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0242");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138107022L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672534977d + "'", double1 == 2461225.672534977d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0243");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138101917L);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0244");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-210865896000000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0245");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-210865896000000L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0246");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-1L));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0247");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138109777L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0248");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass9 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0249");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138099816L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0250");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138099568L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0251");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210858120000000L) + "'", long1 == (-210858120000000L));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0252");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(100L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0253");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6724604396d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138100581L + "'", long1 == 1783138100581L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0254");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000000116d + "'", double1 == 2440587.5000000116d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0255");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138099934L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0256");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(9223372036854775807L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0257");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138109777L);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0258");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138108575L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0259");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725096297d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138104832L + "'", long1 == 1783138104832L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0260");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-210865896000000L));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0261");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0262");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725400924d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138107463L + "'", long1 == 1783138107463L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0263");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138112618L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0264");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-210863995200000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0265");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0266");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138107464L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0267");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138098831L);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0268");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "9) test0268(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138113409L + "'", long2 == 1783138113409L);
// flaky "6) test0268(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138113409L + "'", long6 == 1783138113409L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0269");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138111869L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672591076d + "'", double1 == 2461225.672591076d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0270");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138110070L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725702547d + "'", double1 == 2461225.6725702547d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0271");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138112844L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0272");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138110868L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0273");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138099568L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724487036d + "'", double1 == 2461225.6724487036d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0274");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass7 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0275");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.50000037d + "'", double1 == 2440587.50000037d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0276");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138104773L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0277");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-210866673600000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0278");
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
        java.lang.Class<?> wildcardClass10 = readableInterval8.getClass();
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0279");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138110025L);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0280");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138110025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725697336d + "'", double1 == 2461225.6725697336d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0281");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138111707L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725892015d + "'", double1 == 2461225.6725892015d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0282");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138105247L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0283");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138100967L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0284");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138105036L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725119906d + "'", double1 == 2461225.6725119906d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0285");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0286");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-210866846400000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0287");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138108672L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0288");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0289");
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
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0290");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        java.lang.Class<?> wildcardClass1 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0291");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138112874L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0292");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138110443L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672574572d + "'", double1 == 2461225.672574572d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0293");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(97.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210858379200000L) + "'", long1 == (-210858379200000L));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0294");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0295");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114455L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0296");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138107463L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0297");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672534977d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138107022L + "'", long1 == 1783138107022L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0298");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass7 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "10) test0298(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138115060L + "'", long2 == 1783138115060L);
// flaky "7) test0298(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138115060L + "'", long3 == 1783138115060L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0299");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0300");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138107796L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672543935d + "'", double1 == 2461225.672543935d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0301");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0302");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass9 = dateTimeZone6.getClass();
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0303");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6725702547d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138110070L + "'", long1 == 1783138110070L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0304");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138109932L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0305");
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
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0306");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138101417L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0307");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0308");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138102939L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0309");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138108137L);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0310");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(2440588L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0311");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0312");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138111869L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0313");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138110443L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0315");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138099934L);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0316");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138115060L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0317");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass9 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "11) test0317(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138115903L + "'", long2 == 1783138115903L);
// flaky "8) test0317(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138115903L + "'", long5 == 1783138115903L);
// flaky "4) test0317(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138115903L + "'", long6 == 1783138115903L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0318");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138104832L);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0319");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114556L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0320");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-210866673600000L));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0321");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138097453L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6724242247d + "'", double1 == 2461225.6724242247d);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0322");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138111707L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0323");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000000116d + "'", double1 == 2440587.5000000116d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0324");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138109706L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0325");
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
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0326");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138109374L);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0327");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138114042L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672616227d + "'", double1 == 2461225.672616227d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0328");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(9223372036854775807L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0329");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138113409L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0330");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass5 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "12) test0330(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138116397L + "'", long2 == 1783138116397L);
// flaky "9) test0330(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138116397L + "'", long3 == 1783138116397L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0331");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(32L);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0332");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long7 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "13) test0332(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138116469L + "'", long2 == 1783138116469L);
// flaky "10) test0332(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138116469L + "'", long3 == 1783138116469L);
// flaky "5) test0332(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138116469L + "'", long5 == 1783138116469L);
// flaky "2) test0332(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138116469L + "'", long7 == 1783138116469L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0333");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass7 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0334");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138114472L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0335");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114899L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0336");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138113287L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726074885d + "'", double1 == 2461225.6726074885d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0337");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138097453L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0338");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210863736000000L) + "'", long1 == (-210863736000000L));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0339");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138113287L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0340");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.4999999884d + "'", double1 == 2440587.4999999884d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0341");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138105145L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0342");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0343");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0344");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138108530L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0345");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138115060L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0346");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000011227d + "'", double1 == 2440587.5000011227d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0347");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138113287L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0348");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138102766L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0349");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138097687L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0350");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138116509L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0351");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138105145L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0352");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0353");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (-210858120000000L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0354");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138108297L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0355");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138107463L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0356");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138114930L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0357");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138110107L);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0358");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114930L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0359");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass5 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "14) test0359(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138117409L + "'", long2 == 1783138117409L);
// flaky "11) test0359(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138117409L + "'", long4 == 1783138117409L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0360");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0361");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "15) test0361(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138117535L + "'", long2 == 1783138117535L);
// flaky "12) test0361(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138117535L + "'", long4 == 1783138117535L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0362");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.672574572d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138110443L + "'", long1 == 1783138110443L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0363");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138109932L);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0364");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138106018L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0365");
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
        java.lang.Class<?> wildcardClass10 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0366");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138109932L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725686574d + "'", double1 == 2461225.6725686574d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0367");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-210866760000000L));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0368");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138117409L);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0369");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138108672L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0370");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138106748L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0371");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138109777L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6725668632d + "'", double1 == 2461225.6725668632d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0372");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138099568L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0373");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0374");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        java.lang.Class<?> wildcardClass5 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0376");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138099816L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0377");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138113287L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0378");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138099080L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0379");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2440587.5000011227d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0380");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114869L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0381");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138117356L);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0382");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138099568L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0383");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-210858120000000L));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0384");
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
        java.lang.Class<?> wildcardClass11 = readableInterval6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0385");
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
        java.lang.Class<?> wildcardClass11 = chronology8.getClass();
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0386");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138117356L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0387");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5d + "'", double1 == 2440587.5d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0389");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass9 = chronology7.getClass();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0390");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138105036L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0391");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138117849L);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0392");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138114367L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0393");
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
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0394");
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
        long long10 = millisProvider0.getMillis();
        long long11 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "16) test0394(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138118434L + "'", long2 == 1783138118434L);
// flaky "13) test0394(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138118434L + "'", long6 == 1783138118434L);
// flaky "6) test0394(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138118434L + "'", long7 == 1783138118434L);
// flaky "3) test0394(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138118434L + "'", long9 == 1783138118434L);
// flaky "1) test0394(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138118434L + "'", long10 == 1783138118434L);
// flaky "1) test0394(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1783138118434L + "'", long11 == 1783138118434L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0395");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(2440587L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0396");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118134L);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0397");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114042L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0398");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138114367L);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0399");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0400");
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
        java.lang.Class<?> wildcardClass12 = periodType8.getClass();
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0401");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass9 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0402");
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
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0403");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138114367L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0404");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0405");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long10 = millisProvider0.getMillis();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "17) test0405(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138118667L + "'", long2 == 1783138118667L);
// flaky "14) test0405(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138118667L + "'", long4 == 1783138118667L);
// flaky "7) test0405(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138118667L + "'", long5 == 1783138118667L);
// flaky "4) test0405(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138118667L + "'", long6 == 1783138118667L);
// flaky "2) test0405(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1783138118667L + "'", long10 == 1783138118667L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0406");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138111707L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0407");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(2461226L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0408");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138115903L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672637766d + "'", double1 == 2461225.672637766d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0409");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0410");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone7.getClass();
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0411");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138112844L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0412");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0413");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138104832L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0414");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138115967L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0415");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5d + "'", double1 == 2440587.5d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0416");
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0417");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138116469L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0418");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138105145L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0419");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0420");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass9 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0421");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(2440587L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5282475348d + "'", double1 == 2440587.5282475348d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0422");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138112844L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0423");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138116237L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0424");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138114930L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726265047d + "'", double1 == 2461225.6726265047d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0425");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) -1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0426");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(2440588L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5282475464d + "'", double1 == 2440587.5282475464d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0427");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138118550L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0428");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138108137L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0429");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138116397L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0430");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass7 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0431");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138118800L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0432");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass6 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0433");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138119233L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672676308d + "'", double1 == 2461225.672676308d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0434");
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
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0435");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "18) test0435(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138119363L + "'", long2 == 1783138119363L);
// flaky "15) test0435(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138119363L + "'", long4 == 1783138119363L);
// flaky "8) test0435(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138119363L + "'", long5 == 1783138119363L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0436");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138100581L);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0437");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138102915L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672487442d + "'", double1 == 2461225.672487442d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0439");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6724487036d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138099567L + "'", long1 == 1783138099567L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0440");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        long long3 = millisProvider0.getMillis();
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "19) test0440(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138119516L + "'", long2 == 1783138119516L);
// flaky "16) test0440(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138119516L + "'", long3 == 1783138119516L);
// flaky "9) test0440(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138119516L + "'", long4 == 1783138119516L);
// flaky "5) test0440(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138119516L + "'", long5 == 1783138119516L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0441");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0442");
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
        java.lang.Class<?> wildcardClass10 = readableInterval5.getClass();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0443");
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
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0445");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0446");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138100581L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0447");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138115225L);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0448");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138113754L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726128934d + "'", double1 == 2461225.6726128934d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0449");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138109374L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0450");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-210866760000000L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0451");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138118434L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0452");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.500000405d + "'", double1 == 2440587.500000405d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0453");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138102134L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672478403d + "'", double1 == 2461225.672478403d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0454");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass4 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "20) test0454(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138119916L + "'", long2 == 1783138119916L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0455");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138115651L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726348493d + "'", double1 == 2461225.6726348493d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0456");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138116469L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672644317d + "'", double1 == 2461225.672644317d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0457");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(35L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0458");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long2 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        long long5 = millisProvider0.getMillis();
        long long6 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "21) test0458(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138120049L + "'", long2 == 1783138120049L);
// flaky "17) test0458(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138120049L + "'", long4 == 1783138120049L);
// flaky "10) test0458(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138120049L + "'", long5 == 1783138120049L);
// flaky "6) test0458(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1783138120049L + "'", long6 == 1783138120049L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0459");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138111707L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0460");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138120065L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0461");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber((-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-106749550580L) + "'", long1 == (-106749550580L));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0463");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138101533L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0464");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138118933L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726728356d + "'", double1 == 2461225.6726728356d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0465");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0466");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138117483L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0467");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138100967L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0469");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138106447L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0470");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0471");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138114556L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0472");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(32.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210863995200000L) + "'", long1 == (-210863995200000L));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0473");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138097687L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0474");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138120065L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0475");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0476");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138119363L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.6726778126d + "'", double1 == 2461225.6726778126d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0477");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138119433L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0478");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138100983L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0479");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) '#');
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0480");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0481");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        java.lang.Class<?> wildcardClass8 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "22) test0481(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138120740L + "'", long4 == 1783138120740L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0482");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210866846400000L) + "'", long1 == (-210866846400000L));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0483");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-210863736000000L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0484");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138101790L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0485");
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
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology8);
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
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0486");
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
        java.lang.Class<?> wildcardClass11 = readableInterval6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0487");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0488");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138103444L);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0489");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay(2461225.6726728356d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1783138118932L + "'", long1 == 1783138118932L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0490");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138120218L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0491");
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
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "23) test0491(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1783138121031L + "'", long2 == 1783138121031L);
// flaky "18) test0491(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1783138121031L + "'", long3 == 1783138121031L);
// flaky "11) test0491(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1783138121031L + "'", long5 == 1783138121031L);
// flaky "7) test0491(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1783138121031L + "'", long7 == 1783138121031L);
// flaky "3) test0491(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138121031L + "'", long8 == 1783138121031L);
// flaky "2) test0491(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138121031L + "'", long9 == 1783138121031L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0492");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(1783138100983L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2461225.672465081d + "'", double1 == 2461225.672465081d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0493");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0674955057980064E11d) + "'", double1 == (-1.0674955057980064E11d));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0494");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 1783138118351L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0495");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(1783138107796L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2461226L + "'", long1 == 2461226L);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0496");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long4 = millisProvider0.getMillis();
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
        long long8 = millisProvider0.getMillis();
        long long9 = millisProvider0.getMillis();
        java.lang.Class<?> wildcardClass10 = millisProvider0.getClass();
        org.junit.Assert.assertNotNull(millisProvider0);
// flaky "24) test0496(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1783138121098L + "'", long4 == 1783138121098L);
// flaky "19) test0496(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1783138121098L + "'", long8 == 1783138121098L);
// flaky "12) test0496(JA_019_Regression0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1783138121098L + "'", long9 == 1783138121098L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0497");
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
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0498");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1783138108297L);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0499");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1783138119600L);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_019_Regression0.test0500");
        long long1 = org.joda.time.DateTimeUtils.toJulianDayNumber(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2440588L + "'", long1 == 2440588L);
    }
}
