import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_051_Regression0 {

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
            System.out.format("%n%s%n", "JA_051_Regression0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0003");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.Class<?> wildcardClass1 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0004");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0005");
        java.lang.String str0 = org.joda.time.DateTimeZone.DEFAULT_TZ_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org/joda/time/tz/data" + "'", str0, "org/joda/time/tz/data");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ICT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ICT' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0007");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0008");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        long long10 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ICT" + "'", str2, "ICT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Indochina Time" + "'", str5, "Indochina Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25200000 + "'", int7 == 25200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28799900L) + "'", long10 == (-28799900L));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0011");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(28800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0016");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.Class<?> wildcardClass5 = timeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0017");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.Class<?> wildcardClass3 = timeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Asia/Ho_Chi_Minh");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0019");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getShortName((long) 100, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "1) test0019(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "1) test0019(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "1) test0019(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "1) test0019(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "1) test0019(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
// flaky "1) test0019(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Coordinated Universal Time' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0023");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        boolean boolean10 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        long long12 = dateTimeZone5.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0025");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0026");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(0L);
        java.lang.String str11 = dateTimeZone2.getShortName((long) (short) 100);
        long long13 = dateTimeZone2.previousTransition((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0030");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-59990L));
        boolean boolean20 = dateTimeZone0.isStandardOffset((long) 32);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59948L) + "'", long13 == (-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59990L) + "'", long18 == (-59990L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0031");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone0.nextTransition((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0032");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        long long17 = dateTimeZone2.adjustOffset((-28859900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-28859900L) + "'", long17 == (-28859900L));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Indochina Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Indochina Time' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long4 = dateTimeZone1.convertLocalToUTC((-59903L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3540097L + "'", long4 == 3540097L);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0035");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        long long5 = dateTimeZone1.previousTransition((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0039");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (short) -1, locale10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0041");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        java.lang.String str16 = dateTimeZone2.getNameKey((-59999L));
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        long long19 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, (long) '#');
        long long23 = dateTimeZone2.convertLocalToUTC((-22L), false, 10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59965L) + "'", long19 == (-59965L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-22L) + "'", long23 == (-22L));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0042");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str14 = dateTimeZone0.getID();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName((-59965L), locale16);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone0.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0043");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long12 = dateTimeZone1.convertLocalToUTC((long) 100, false, (long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "2) test0043(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
// flaky "2) test0043(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
// flaky "2) test0043(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "2) test0043(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0044");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        int int16 = dateTimeZone2.getStandardOffset((long) 1);
        java.lang.Class<?> wildcardClass17 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0046");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        long long9 = dateTimeZone2.convertLocalToUTC((long) (short) 10, true, (long) (byte) 0);
        java.lang.Class<?> wildcardClass10 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59990L) + "'", long9 == (-59990L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long3 = dateTimeZone1.previousTransition((long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60000L + "'", long3 == 60000L);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long7 = dateTimeZone1.previousTransition((-59903L));
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59903L) + "'", long7 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0050");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone2.toTimeZone();
        java.lang.Class<?> wildcardClass12 = timeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.convertLocalToUTC((-28799900L), true, (long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199900L) + "'", long5 == (-25199900L));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0052");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        boolean boolean9 = dateTimeZone0.isStandardOffset((long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "3) test0052(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "3) test0052(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0054");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        boolean boolean10 = dateTimeZone0.isFixed();
        int int12 = dateTimeZone0.getStandardOffset(22020000L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName((long) (byte) 10, locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "4) test0054(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "4) test0054(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
// flaky "3) test0054(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "3) test0054(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "2) test0054(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "2) test0054(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinated Universal Time" + "'", str15, "Coordinated Universal Time");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0055");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.convertLocalToUTC((long) ' ', true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59968L) + "'", long10 == (-59968L));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0058");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("org/joda/time/tz/data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'org/joda/time/tz/data' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0060");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) "Asia/Ho_Chi_Minh");
        java.lang.String str5 = dateTimeZone2.toString();
        java.lang.String str6 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0061");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        int int14 = dateTimeZone0.getStandardOffset(60052L);
        boolean boolean15 = dateTimeZone0.isFixed();
        java.lang.String str17 = dateTimeZone0.getShortName((-28799900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "5) test0061(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "5) test0061(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "4) test0061(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "4) test0061(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "3) test0061(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "3) test0061(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "1) test0061(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 1, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0063");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        java.lang.Class<?> wildcardClass16 = dateTimeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0064");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.lang.Class<?> wildcardClass4 = nameProvider0.getClass();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0065");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) "Asia/Ho_Chi_Minh");
        java.lang.Class<?> wildcardClass5 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0067");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(0L);
        java.lang.String str11 = dateTimeZone2.getShortName((long) (short) 100);
        long long13 = dateTimeZone2.convertUTCToLocal(97L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60097L + "'", long13 == 60097L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, (long) 100);
        boolean boolean18 = dateTimeZone12.isStandardOffset(60000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60100L + "'", long16 == 60100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0071");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(60000L);
        long long14 = dateTimeZone2.previousTransition(10L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getStandardOffset(28680100L);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0074");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) '#');
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60035L + "'", long3 == 60035L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0075");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "6) test0075(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "6) test0075(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0076");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        boolean boolean10 = dateTimeZone0.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(28800000L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "7) test0076(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "7) test0076(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "5) test0076(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "5) test0076(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0077");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        int int16 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long20 = dateTimeZone18.nextTransition(22020000L);
        java.lang.String str22 = dateTimeZone18.getName((long) (byte) 10);
        long long24 = dateTimeZone2.getMillisKeepLocal(dateTimeZone18, (long) (byte) 10);
        java.lang.Class<?> wildcardClass25 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 22020000L + "'", long20 == 22020000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.032" + "'", str22, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-22L) + "'", long24 == (-22L));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str3 = dateTimeZone1.getNameKey(52L);
        int int5 = dateTimeZone1.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(22020000L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0080");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        java.lang.String str6 = dateTimeZone2.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(0L, locale8);
        java.lang.String str11 = dateTimeZone2.getName((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0082");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.lang.String str24 = dateTimeZone14.getNameKey((long) '4');
        int int26 = dateTimeZone14.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str29 = dateTimeZone14.getNameKey(1L);
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (long) (short) -1);
        long long34 = dateTimeZone0.convertLocalToUTC((-59900L), true);
        boolean boolean36 = dateTimeZone0.isStandardOffset(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-119900L) + "'", long34 == (-119900L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0083");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) "Asia/Ho_Chi_Minh");
        java.lang.String str5 = dateTimeZone2.toString();
        java.lang.Class<?> wildcardClass6 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0084");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.String str7 = dateTimeZone2.getName(10L);
        java.lang.String str9 = dateTimeZone2.getName((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0085");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0086");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone7.toString();
        int int10 = dateTimeZone7.getOffsetFromLocal(53L);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-119900L) + "'", long12 == (-119900L));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0087");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        long long15 = dateTimeZone0.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) 0, locale6);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        boolean boolean13 = dateTimeZone2.isStandardOffset(52L);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 52L);
        boolean boolean15 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getShortName(1L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone16.getName((long) 0, locale20);
        java.lang.String str22 = dateTimeZone16.toString();
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) dateTimeZone16);
        int int25 = dateTimeZone16.getOffset(28800010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0089");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0090");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(10L, locale6);
        long long10 = dateTimeZone1.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str14 = dateTimeZone13.toString();
        long long17 = dateTimeZone13.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long20 = dateTimeZone13.convertUTCToLocal(0L);
        java.lang.String str22 = dateTimeZone13.getShortName((long) (short) 100);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) 60000);
        int int26 = dateTimeZone13.getStandardOffset((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str14 = dateTimeZone0.getID();
        int int16 = dateTimeZone0.getOffsetFromLocal((long) 28800000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0092");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0093");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone11, (-28859900L));
        java.lang.String str17 = dateTimeZone2.toString();
        java.lang.Class<?> wildcardClass18 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-28919900L) + "'", long16 == (-28919900L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0095");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        int int14 = dateTimeZone0.getStandardOffset(60052L);
        long long16 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0096");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '#');
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0099");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        boolean boolean21 = dateTimeZone0.equals((java.lang.Object) (-59999L));
        java.lang.String str22 = dateTimeZone0.toString();
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass24 = timeZone23.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "8) test0099(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "8) test0099(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "6) test0099(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "6) test0099(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky "4) test0099(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "4) test0099(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "2) test0099(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "1) test0099(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0100");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getStandardOffset(1L);
        long long11 = dateTimeZone1.nextTransition((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "9) test0100(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "9) test0100(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0101");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        int int13 = dateTimeZone5.getStandardOffset((-1L));
        java.lang.String str15 = dateTimeZone5.getNameKey((long) 100);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone5.getShortName((-28979900L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0102");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.String str7 = dateTimeZone2.getName(10L);
        java.lang.String str8 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0103");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        long long7 = dateTimeZone2.nextTransition((long) 28800000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28800000L + "'", long7 == 28800000L);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0104");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.util.TimeZone timeZone8 = dateTimeZone6.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0105");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(10L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "10) test0105(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "10) test0105(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "7) test0105(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "7) test0105(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0106");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        int int13 = dateTimeZone0.getOffset((-59965L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "11) test0106(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "11) test0106(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "8) test0106(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "8) test0106(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "5) test0106(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0107");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        boolean boolean10 = dateTimeZone0.isFixed();
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean14 = dateTimeZone0.isFixed();
        boolean boolean15 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "12) test0107(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "12) test0107(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "9) test0107(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "9) test0107(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        long long16 = dateTimeZone1.adjustOffset((long) 60000, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky "13) test0109(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky "13) test0109(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "10) test0109(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0110");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset(60052L);
        java.lang.String str7 = dateTimeZone1.getNameKey(28800010L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 60000);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0112");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        int int16 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long20 = dateTimeZone18.nextTransition(22020000L);
        java.lang.String str22 = dateTimeZone18.getName((long) (byte) 10);
        long long24 = dateTimeZone2.getMillisKeepLocal(dateTimeZone18, (long) (byte) 10);
        java.lang.String str26 = dateTimeZone18.getShortName((-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 22020000L + "'", long20 == 22020000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.032" + "'", str22, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-22L) + "'", long24 == (-22L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.032" + "'", str26, "+00:00:00.032");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0114");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        java.lang.String str6 = dateTimeZone0.toString();
        long long8 = dateTimeZone0.nextTransition((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0115");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        java.lang.String str13 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        java.lang.Class<?> wildcardClass16 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0116");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        java.lang.String str6 = dateTimeZone1.getNameKey(60032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0119");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int17 = dateTimeZone2.getStandardOffset((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5700000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0122");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str11 = dateTimeZone0.getID();
        boolean boolean13 = dateTimeZone0.isStandardOffset(60052L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        boolean boolean23 = dateTimeZone14.isFixed();
        java.lang.String str25 = dateTimeZone14.getShortName((-60001L));
        int int27 = dateTimeZone14.getOffset((-59965L));
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) (-59965L));
        java.lang.String str30 = dateTimeZone0.getName(0L);
        long long33 = dateTimeZone0.adjustOffset(0L, false);
        long long35 = dateTimeZone0.convertUTCToLocal((-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coordinated Universal Time" + "'", str30, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-59900L) + "'", long35 == (-59900L));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0123");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.previousTransition(1L);
        java.lang.Class<?> wildcardClass5 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0125");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-28859900L), true, (long) 0);
        long long7 = dateTimeZone0.convertLocalToUTC((-60000L), false);
        long long10 = dateTimeZone0.convertLocalToUTC((-60000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-28859900L) + "'", long4 == (-28859900L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-60000L) + "'", long7 == (-60000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60000L) + "'", long10 == (-60000L));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0127");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName((-60000L), locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone14.getName((long) (short) -1, locale24);
        int int27 = dateTimeZone14.getOffset((long) 100);
        boolean boolean28 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        boolean boolean29 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone30, (-119900L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "14) test0127(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
// flaky "14) test0127(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
// flaky "11) test0127(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
// flaky "10) test0127(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
// flaky "6) test0127(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
// flaky "5) test0127(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "3) test0127(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-179900L) + "'", long32 == (-179900L));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0128");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "15) test0128(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
// flaky "15) test0128(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
// flaky "12) test0128(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
// flaky "11) test0128(JA_051_Regression0)":         org.junit.Assert.assertNull(str10);
// flaky "7) test0128(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5700000 + "'", int12 == 5700000);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset(60052L);
        java.lang.String str7 = dateTimeZone1.getNameKey(28800010L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 60000);
        long long11 = dateTimeZone1.previousTransition((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0131");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-59990L), false, 53L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName(1L, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-59990L) + "'", long4 == (-59990L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0133");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        java.lang.Class<?> wildcardClass12 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0134");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getName((long) (short) 0);
        java.lang.String str18 = dateTimeZone13.getName(0L);
        long long20 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (long) (short) 1);
        int int22 = dateTimeZone8.getStandardOffset((long) 1);
        long long25 = dateTimeZone8.convertLocalToUTC((long) 10, true);
        java.lang.String str27 = dateTimeZone8.getName((long) '4');
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 22020000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "16) test0134(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-59999L) + "'", long20 == (-59999L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coordinated Universal Time" + "'", str27, "Coordinated Universal Time");
// flaky "16) test0134(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 22080000L + "'", long29 == 22080000L);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        int int8 = dateTimeZone1.getStandardOffset(60000L);
        boolean boolean9 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Positive hours must not have negative minutes: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0137");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getNameKey(1L);
        long long18 = dateTimeZone0.adjustOffset((long) (short) 0, true);
        int int20 = dateTimeZone0.getStandardOffset((-59900L));
        java.lang.String str22 = dateTimeZone0.getName((long) 28800000);
        long long25 = dateTimeZone0.adjustOffset((long) 10, false);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone0.getShortName((long) '#', locale27);
        long long30 = dateTimeZone0.previousTransition((-59903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "17) test0137(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "17) test0137(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "13) test0137(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "12) test0137(JA_051_Regression0)":         org.junit.Assert.assertNull(str10);
// flaky "8) test0137(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
// flaky "6) test0137(JA_051_Regression0)":         org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky "4) test0137(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
// flaky "2) test0137(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
// flaky "1) test0137(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-59903L) + "'", long30 == (-59903L));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0139");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        boolean boolean21 = dateTimeZone0.equals((java.lang.Object) (-59999L));
        long long23 = dateTimeZone0.nextTransition(28680100L);
        long long26 = dateTimeZone0.adjustOffset((-22L), false);
        long long28 = dateTimeZone0.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28680100L + "'", long23 == 28680100L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-22L) + "'", long26 == (-22L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0140");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        java.lang.String str33 = dateTimeZone30.getName((long) (short) 0);
        java.lang.String str35 = dateTimeZone30.getName(0L);
        long long37 = dateTimeZone25.getMillisKeepLocal(dateTimeZone30, (long) (short) 1);
        java.lang.String str39 = dateTimeZone25.getNameKey((-59999L));
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        long long42 = dateTimeZone25.getMillisKeepLocal(dateTimeZone40, (long) '#');
        java.util.TimeZone timeZone43 = dateTimeZone25.toTimeZone();
        java.lang.String str44 = dateTimeZone25.toString();
        long long46 = dateTimeZone14.getMillisKeepLocal(dateTimeZone25, (long) (short) -1);
        java.lang.Class<?> wildcardClass47 = dateTimeZone25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-59999L) + "'", long37 == (-59999L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        long long9 = dateTimeZone2.previousTransition(5700032L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5700032L + "'", long9 == 5700032L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0142");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        int int12 = dateTimeZone2.getStandardOffset((long) (short) -1);
        long long15 = dateTimeZone2.adjustOffset((long) '4', false);
        java.lang.String str17 = dateTimeZone2.getShortName(0L);
        int int19 = dateTimeZone2.getStandardOffset(5700001L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0143");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        boolean boolean10 = dateTimeZone7.isStandardOffset((-28919900L));
        boolean boolean11 = dateTimeZone2.equals((java.lang.Object) boolean10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getShortName((long) 'a', locale13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0144");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.nextTransition((-59999L));
        long long11 = dateTimeZone2.previousTransition(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59999L) + "'", long9 == (-59999L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0145");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str4 = dateTimeZone2.toString();
        int int6 = dateTimeZone2.getStandardOffset(34L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.adjustOffset(32L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0147");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        long long19 = dateTimeZone0.convertLocalToUTC((long) (short) -1, true);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone0.getName(28680100L, locale21);
        long long25 = dateTimeZone0.convertLocalToUTC(22080000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-60001L) + "'", long19 == (-60001L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 22020000L + "'", long25 == 22020000L);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0148");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = dateTimeZone0.isFixed();
        long long15 = dateTimeZone0.previousTransition(100L);
        int int17 = dateTimeZone0.getStandardOffset((-28799969L));
        boolean boolean19 = dateTimeZone0.isStandardOffset((-59900L));
        boolean boolean20 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0149");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str4 = dateTimeZone2.toString();
        int int6 = dateTimeZone2.getOffsetFromLocal((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0150");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone10.convertLocalToUTC(35L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59965L) + "'", long13 == (-59965L));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0151");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((long) '4', locale13);
        boolean boolean16 = dateTimeZone6.equals((java.lang.Object) (short) 100);
        java.lang.String str17 = dateTimeZone6.getID();
        boolean boolean19 = dateTimeZone6.isStandardOffset(60052L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone6.getOffset(readableInstant20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone23.isLocalDateTimeGap(localDateTime25);
        long long30 = dateTimeZone23.convertLocalToUTC((long) (byte) 0, true, 0L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone23.getOffset(readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long36 = dateTimeZone23.getMillisKeepLocal(dateTimeZone34, (long) 25200000);
        long long38 = dateTimeZone6.getMillisKeepLocal(dateTimeZone34, (-28799968L));
        boolean boolean39 = dateTimeZone2.equals((java.lang.Object) long38);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-60000L) + "'", long30 == (-60000L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60000 + "'", int32 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 21660000L + "'", long36 == 21660000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-32339968L) + "'", long38 == (-32339968L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0152");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        long long24 = dateTimeZone14.convertUTCToLocal((-119903L));
        long long27 = dateTimeZone14.convertLocalToUTC(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-119903L) + "'", long24 == (-119903L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0153");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long14 = dateTimeZone10.convertLocalToUTC(97L, true, (-28919900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59903L) + "'", long14 == (-59903L));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0156");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(60000L);
        long long14 = dateTimeZone2.previousTransition(5700032L);
        java.lang.String str16 = dateTimeZone2.getName((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5700032L + "'", long14 == 5700032L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0159");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        java.lang.String str16 = dateTimeZone2.getNameKey((-59999L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str23 = dateTimeZone22.toString();
        long long26 = dateTimeZone22.convertLocalToUTC((long) (-1), false);
        long long28 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        boolean boolean32 = dateTimeZone19.equals((java.lang.Object) dateTimeZone31);
        boolean boolean33 = dateTimeZone2.equals((java.lang.Object) boolean32);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone2.getShortName(1L, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-60001L) + "'", long26 == (-60001L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 22020000L + "'", long28 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0160");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        long long19 = dateTimeZone0.convertLocalToUTC((long) (short) -1, true);
        java.lang.String str21 = dateTimeZone0.getShortName((long) 1);
        long long24 = dateTimeZone0.convertLocalToUTC((long) 28800000, true);
        java.lang.String str26 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "18) test0160(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "18) test0160(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "14) test0160(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "13) test0160(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
// flaky "9) test0160(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "7) test0160(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone16);
// flaky "5) test0160(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
// flaky "3) test0160(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky "2) test0160(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
// flaky "1) test0160(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 28800000L + "'", long24 == 28800000L);
// flaky "1) test0160(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str15 = dateTimeZone0.getShortName((long) (byte) 100);
        int int17 = dateTimeZone0.getOffsetFromLocal((-60001L));
        int int19 = dateTimeZone0.getOffsetFromLocal((long) 1);
        java.lang.Class<?> wildcardClass20 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "19) test0161(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "19) test0161(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "15) test0161(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "14) test0161(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
// flaky "10) test0161(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "8) test0161(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
// flaky "6) test0161(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "4) test0161(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "3) test0161(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0162");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        boolean boolean10 = dateTimeZone7.isStandardOffset((-28919900L));
        boolean boolean11 = dateTimeZone2.equals((java.lang.Object) boolean10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getShortName((long) 'a', locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getName((long) 0, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky "20) test0162(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0163");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        boolean boolean10 = dateTimeZone0.isFixed();
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int15 = dateTimeZone0.getStandardOffset((-59969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "21) test0163(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "20) test0163(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "16) test0163(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "15) test0163(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "11) test0163(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0165");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.Class<?> wildcardClass11 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0166");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        long long11 = dateTimeZone1.nextTransition((-59999L));
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        java.lang.String str15 = dateTimeZone1.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59900L) + "'", long9 == (-59900L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59999L) + "'", long11 == (-59999L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0167");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName((-60000L), locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone14.getName((long) (short) -1, locale24);
        int int27 = dateTimeZone14.getOffset((long) 100);
        boolean boolean28 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        java.lang.String str30 = dateTimeZone14.getShortName(97L);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone14.isLocalDateTimeGap(localDateTime31);
        int int34 = dateTimeZone14.getOffsetFromLocal(21660000L);
        int int36 = dateTimeZone14.getStandardOffset(3480097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60000 + "'", int34 == 60000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60000 + "'", int36 == 60000);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0169");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long12 = dateTimeZone1.adjustOffset((-119900L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-119900L) + "'", long12 == (-119900L));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0170");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName((-60000L), locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone14.getName((long) (short) -1, locale24);
        int int27 = dateTimeZone14.getOffset((long) 100);
        boolean boolean28 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        java.lang.String str30 = dateTimeZone14.getShortName(97L);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone14.isLocalDateTimeGap(localDateTime31);
        int int34 = dateTimeZone14.getOffsetFromLocal(21660000L);
        java.lang.String str36 = dateTimeZone14.getShortName((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60000 + "'", int34 == 60000);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0171");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        long long14 = dateTimeZone0.adjustOffset((long) '4', false);
        long long16 = dateTimeZone0.convertUTCToLocal((-59900L));
        long long18 = dateTimeZone0.convertUTCToLocal((-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0172");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getNameKey((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str15 = dateTimeZone14.toString();
        java.lang.String str17 = dateTimeZone14.getName((long) (short) 0);
        java.lang.String str19 = dateTimeZone14.getName(0L);
        long long21 = dateTimeZone14.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long25 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-59968L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone14.getName((long) '#', locale27);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-59968L) + "'", long25 == (-59968L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str3 = dateTimeZone2.getID();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName((long) (byte) 10, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0174");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getShortName((long) 'a');
        long long11 = dateTimeZone1.convertLocalToUTC((-119968L), true);
        long long14 = dateTimeZone1.adjustOffset((long) (-3600000), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-119967L) + "'", long11 == (-119967L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3600000L) + "'", long14 == (-3600000L));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0176");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone4.toString();
        long long9 = dateTimeZone4.previousTransition((long) 60000);
        java.lang.String str10 = dateTimeZone4.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0177");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        long long7 = dateTimeZone1.convertUTCToLocal((-28919900L));
        int int9 = dateTimeZone1.getOffset((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "22) test0177(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "21) test0177(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28919901L) + "'", long7 == (-28919901L));
// flaky "17) test0177(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0178");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone2.getID();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone18.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getName(10L, locale23);
        long long27 = dateTimeZone18.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        long long34 = dateTimeZone30.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        long long37 = dateTimeZone30.convertUTCToLocal(0L);
        java.lang.String str39 = dateTimeZone30.getShortName((long) (short) 100);
        long long41 = dateTimeZone18.getMillisKeepLocal(dateTimeZone30, (long) 60000);
        boolean boolean42 = dateTimeZone2.equals((java.lang.Object) dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime43 = null;
        boolean boolean44 = dateTimeZone30.isLocalDateTimeGap(localDateTime43);
        long long46 = dateTimeZone30.nextTransition((-119903L));
        java.lang.String str47 = dateTimeZone30.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-60001L) + "'", long27 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-60001L) + "'", long34 == (-60001L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60000L + "'", long37 == 60000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60000L + "'", long41 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-119903L) + "'", long46 == (-119903L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:01" + "'", str47, "+00:01");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0179");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = dateTimeZone0.isFixed();
        long long15 = dateTimeZone0.previousTransition(100L);
        int int17 = dateTimeZone0.getOffset((long) (short) 10);
        long long19 = dateTimeZone0.nextTransition((long) 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5700000L + "'", long19 == 5700000L);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0180");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 10, locale4);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0181");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        int int10 = dateTimeZone2.getOffset((long) (short) 100);
        java.lang.String str12 = dateTimeZone2.getShortName(0L);
        boolean boolean14 = dateTimeZone2.isStandardOffset(60000L);
        java.lang.String str15 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0182");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        int int4 = dateTimeZone2.getOffset((long) 28800000);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        int int6 = dateTimeZone1.getOffset((-60001L));
        int int8 = dateTimeZone1.getOffset(5699968L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0184");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (short) -1, locale10);
        long long14 = dateTimeZone0.adjustOffset((-119900L), true);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(0L, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "23) test0184(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "22) test0184(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "18) test0184(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "16) test0184(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-119900L) + "'", long14 == (-119900L));
// flaky "12) test0184(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0185");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0187");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.Class<?> wildcardClass16 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0188");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str15 = dateTimeZone14.toString();
        long long18 = dateTimeZone14.convertLocalToUTC((long) (-1), false);
        java.lang.String str19 = dateTimeZone14.getID();
        long long21 = dateTimeZone14.nextTransition(100L);
        boolean boolean22 = dateTimeZone14.isFixed();
        long long24 = dateTimeZone14.nextTransition((-59965L));
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (long) (-3600000));
        long long29 = dateTimeZone14.convertLocalToUTC((long) 5700000, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "24) test0188(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "23) test0188(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "19) test0188(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "17) test0188(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-60001L) + "'", long18 == (-60001L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-59965L) + "'", long24 == (-59965L));
// flaky "13) test0188(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3660000L) + "'", long26 == (-3660000L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5640000L + "'", long29 == 5640000L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0190");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.nextTransition((-59999L));
        java.lang.Class<?> wildcardClass10 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59999L) + "'", long9 == (-59999L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0192");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        long long24 = dateTimeZone14.convertUTCToLocal((-119903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str27 = dateTimeZone14.getShortName((-28799948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-119903L) + "'", long24 == (-119903L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) 0, locale6);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        boolean boolean13 = dateTimeZone2.isStandardOffset(52L);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 52L);
        long long16 = dateTimeZone1.previousTransition((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0194");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset(52L);
        java.lang.String str13 = dateTimeZone0.getNameKey((-179900L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getName((long) 0, locale18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone14.getOffset(readableInstant20);
        int int23 = dateTimeZone14.getOffsetFromLocal(0L);
        boolean boolean24 = dateTimeZone14.isFixed();
        int int26 = dateTimeZone14.getStandardOffset(22020000L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone14.getName((long) (byte) 10, locale28);
        long long32 = dateTimeZone14.convertLocalToUTC((-59903L), true);
        boolean boolean33 = dateTimeZone0.equals((java.lang.Object) long32);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coordinated Universal Time" + "'", str19, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coordinated Universal Time" + "'", str29, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-59903L) + "'", long32 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0195");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName((-60000L), locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone14.getName((long) (short) -1, locale24);
        int int27 = dateTimeZone14.getOffset((long) 100);
        boolean boolean28 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        java.lang.String str30 = dateTimeZone14.getShortName(97L);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone14.isLocalDateTimeGap(localDateTime31);
        java.lang.Class<?> wildcardClass33 = dateTimeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coordinated Universal Time" + "'", str25, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0196");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        java.lang.String str13 = dateTimeZone2.getNameKey(52L);
        long long17 = dateTimeZone2.convertLocalToUTC((long) 0, false, (-3659902L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60000L) + "'", long17 == (-60000L));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0198");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.lang.Class<?> wildcardClass4 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone4.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getShortName((long) (short) 1, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0200");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0201");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        long long19 = dateTimeZone0.convertLocalToUTC((long) (short) -1, true);
        java.lang.String str21 = dateTimeZone0.getShortName((long) 1);
        long long24 = dateTimeZone0.adjustOffset(60097L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-60001L) + "'", long19 == (-60001L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60097L + "'", long24 == 60097L);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0202");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(10L, locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-119968L), locale9);
        long long13 = dateTimeZone1.convertLocalToUTC(22020000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21960000L + "'", long13 == 21960000L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0203");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str13 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getName((long) 0, locale18);
        boolean boolean21 = dateTimeZone14.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone14.getOffset(readableInstant22);
        java.lang.Class<?> wildcardClass24 = dateTimeZone14.getClass();
        boolean boolean25 = dateTimeZone2.equals((java.lang.Object) wildcardClass24);
        boolean boolean26 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "25) test0203(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
// flaky "24) test0203(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "20) test0203(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        long long15 = dateTimeZone6.previousTransition(0L);
        int int17 = dateTimeZone6.getStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky "26) test0204(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "25) test0204(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "21) test0204(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky "18) test0204(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) 0, locale6);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        boolean boolean13 = dateTimeZone2.isStandardOffset(52L);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 52L);
        boolean boolean15 = dateTimeZone1.isFixed();
        java.lang.String str16 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "27) test0205(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
// flaky "26) test0205(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "22) test0205(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0206");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getNameKey(1L);
        long long18 = dateTimeZone0.adjustOffset((long) (short) 0, true);
        long long20 = dateTimeZone0.nextTransition(60000L);
        boolean boolean21 = dateTimeZone0.isFixed();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone0.getShortName(97L, locale23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "28) test0206(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "27) test0206(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "23) test0206(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
// flaky "19) test0206(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "14) test0206(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0207");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getNameKey(1L);
        long long18 = dateTimeZone0.adjustOffset((long) (short) 0, true);
        long long20 = dateTimeZone0.nextTransition(60000L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone0.getOffset(readableInstant21);
        java.lang.Class<?> wildcardClass23 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "29) test0207(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "28) test0207(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "24) test0207(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
// flaky "20) test0207(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
// flaky "15) test0207(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long3 = dateTimeZone1.previousTransition(59999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 59999L + "'", long3 == 59999L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0209");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
// flaky "30) test0209(JA_051_Regression0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "29) test0209(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky "25) test0209(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0210");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        long long19 = dateTimeZone0.convertLocalToUTC((long) (short) -1, true);
        int int21 = dateTimeZone0.getStandardOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-60001L) + "'", long19 == (-60001L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0211");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName((long) 32, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 100);
        java.lang.String str17 = dateTimeZone13.getName((-28799900L));
        long long19 = dateTimeZone13.previousTransition((-59903L));
        java.lang.String str20 = dateTimeZone13.getID();
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (-59903L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone13.isLocalDateTimeGap(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0212");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        java.lang.String str5 = dateTimeZone1.getID();
        long long8 = dateTimeZone1.adjustOffset((-59903L), true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(28740000L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59903L) + "'", long8 == (-59903L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0215");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getName((long) (short) 0);
        java.lang.String str18 = dateTimeZone13.getName(0L);
        long long20 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (long) (short) 1);
        int int22 = dateTimeZone8.getStandardOffset((long) 1);
        long long25 = dateTimeZone8.convertLocalToUTC((long) 10, true);
        java.lang.String str27 = dateTimeZone8.getName((long) '4');
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 22020000L);
        java.lang.String str31 = dateTimeZone8.getName(60000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-59999L) + "'", long20 == (-59999L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coordinated Universal Time" + "'", str27, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 22080000L + "'", long29 == 22080000L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coordinated Universal Time" + "'", str31, "Coordinated Universal Time");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0216");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getStandardOffset(60001L);
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone1.equals(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 60000);
        int int5 = dateTimeZone1.getStandardOffset(34L);
        long long7 = dateTimeZone1.convertUTCToLocal(28740000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28740032L + "'", long7 == 28740032L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0218");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        boolean boolean10 = dateTimeZone7.isStandardOffset((-28919900L));
        boolean boolean11 = dateTimeZone2.equals((java.lang.Object) boolean10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getShortName((long) 'a', locale13);
        boolean boolean16 = dateTimeZone2.isStandardOffset((-59968L));
        int int18 = dateTimeZone2.getOffset((-28799948L));
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone2.getOffset(readableInstant19);
        java.lang.String str22 = dateTimeZone2.getShortName(60100L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        boolean boolean29 = dateTimeZone27.isStandardOffset((long) (short) 0);
        long long31 = dateTimeZone27.nextTransition(0L);
        long long33 = dateTimeZone27.previousTransition(28800010L);
        long long35 = dateTimeZone2.getMillisKeepLocal(dateTimeZone27, 10L);
        java.lang.String str37 = dateTimeZone2.getName(1L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky "31) test0218(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 28800010L + "'", long33 == 28800010L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60010L + "'", long35 == 60010L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0219");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long8 = dateTimeZone4.nextTransition(0L);
        long long10 = dateTimeZone4.previousTransition(28800010L);
        int int12 = dateTimeZone4.getStandardOffset((-28979900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28800010L + "'", long10 == 28800010L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0220");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        long long12 = dateTimeZone2.convertUTCToLocal((-28919900L));
        java.lang.String str13 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-28919900L) + "'", long12 == (-28919900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0221");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC(3600000L, false);
        long long14 = dateTimeZone2.adjustOffset((long) 5700000, true);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getShortName((long) 100, locale16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5700000L + "'", long14 == 5700000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0222");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        long long6 = dateTimeZone1.nextTransition(52L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(21660000L, locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
// flaky "32) test0222(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
// flaky "30) test0222(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0223");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        int int6 = dateTimeZone1.getStandardOffset(3480097L);
        long long8 = dateTimeZone1.previousTransition((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0224");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        boolean boolean6 = dateTimeZone1.isFixed();
        int int8 = dateTimeZone1.getOffset(60034L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "33) test0224(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "31) test0224(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0225");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getStandardOffset(1L);
        int int11 = dateTimeZone1.getStandardOffset((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0227");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        java.lang.String str9 = dateTimeZone2.getName((long) 28800000);
        java.lang.Class<?> wildcardClass10 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0229");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone0.getName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((long) (short) 0);
        boolean boolean16 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0230");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        long long14 = dateTimeZone0.adjustOffset((long) '4', false);
        long long16 = dateTimeZone0.convertUTCToLocal((-59900L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long20 = dateTimeZone0.getMillisKeepLocal(dateTimeZone18, 35L);
        int int22 = dateTimeZone0.getStandardOffset((-3659999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60036L + "'", long20 == 60036L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long7 = dateTimeZone1.previousTransition((-59903L));
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName(1L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone8.getShortName(0L, locale12);
        int int15 = dateTimeZone8.getOffsetFromLocal(1L);
        java.lang.String str17 = dateTimeZone8.getName((long) 25200000);
        int int19 = dateTimeZone8.getOffsetFromLocal((long) (short) -1);
        java.lang.String str21 = dateTimeZone8.getShortName((long) (byte) -1);
        long long23 = dateTimeZone8.previousTransition((-59999L));
        long long26 = dateTimeZone8.convertLocalToUTC((long) 32, true);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) 32);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone1.getName((-59900L), locale29);
        long long34 = dateTimeZone1.convertLocalToUTC(21960000L, false, (long) 28800000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59903L) + "'", long7 == (-59903L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-59999L) + "'", long23 == (-59999L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-59968L) + "'", long26 == (-59968L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21960001L + "'", long34 == 21960001L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0232");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(60000L);
        long long14 = dateTimeZone2.previousTransition(10L);
        long long16 = dateTimeZone2.nextTransition(22020000L);
        int int18 = dateTimeZone2.getOffsetFromLocal(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 22020000L + "'", long16 == 22020000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0233");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone10.getName((long) '4', locale17);
        boolean boolean19 = dateTimeZone10.isFixed();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long24 = dateTimeZone22.convertUTCToLocal(1L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone22.getShortName((long) (byte) 10, locale26);
        boolean boolean28 = dateTimeZone10.equals((java.lang.Object) (byte) 10);
        long long31 = dateTimeZone10.convertLocalToUTC(10L, true);
        java.lang.String str32 = dateTimeZone10.toString();
        long long34 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, 3600031L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-59990L) + "'", long31 == (-59990L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3600031L + "'", long34 == 3600031L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0234");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName((-59969L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0236");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long4 = dateTimeZone1.convertUTCToLocal(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 42L + "'", long4 == 42L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0237");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        int int4 = dateTimeZone2.getOffset((long) 28800000);
        java.lang.Class<?> wildcardClass5 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0240");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0241");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (short) -1, locale10);
        java.lang.String str13 = dateTimeZone0.getName((-59965L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0242");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str13 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getName((long) 0, locale18);
        boolean boolean21 = dateTimeZone14.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone14.getOffset(readableInstant22);
        java.lang.Class<?> wildcardClass24 = dateTimeZone14.getClass();
        boolean boolean25 = dateTimeZone2.equals((java.lang.Object) wildcardClass24);
        long long27 = dateTimeZone2.previousTransition((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "34) test0242(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
// flaky "32) test0242(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "26) test0242(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0243");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "35) test0243(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "33) test0243(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "27) test0243(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "21) test0243(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
// flaky "16) test0243(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59948L) + "'", long13 == (-59948L));
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "9) test0243(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0244");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey((long) (-3600000));
        java.lang.Class<?> wildcardClass6 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0245");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        long long14 = dateTimeZone0.convertLocalToUTC(0L, true);
        long long16 = dateTimeZone0.convertUTCToLocal(35L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "36) test0245(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "34) test0245(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "28) test0245(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "22) test0245(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
// flaky "17) test0245(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-60000L) + "'", long14 == (-60000L));
// flaky "10) test0245(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60035L + "'", long16 == 60035L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0246");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        boolean boolean12 = dateTimeZone0.isFixed();
        java.lang.String str14 = dateTimeZone0.getName((-119968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "37) test0246(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "35) test0246(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "29) test0246(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "23) test0246(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "18) test0246(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0247");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone2.getID();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone18.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getName(10L, locale23);
        long long27 = dateTimeZone18.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        long long34 = dateTimeZone30.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        long long37 = dateTimeZone30.convertUTCToLocal(0L);
        java.lang.String str39 = dateTimeZone30.getShortName((long) (short) 100);
        long long41 = dateTimeZone18.getMillisKeepLocal(dateTimeZone30, (long) 60000);
        boolean boolean42 = dateTimeZone2.equals((java.lang.Object) dateTimeZone30);
        int int44 = dateTimeZone30.getOffset(52L);
        java.util.TimeZone timeZone45 = dateTimeZone30.toTimeZone();
        java.lang.String str47 = dateTimeZone30.getName(32400000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-60001L) + "'", long27 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-60001L) + "'", long34 == (-60001L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60000L + "'", long37 == 60000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60000L + "'", long41 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60000 + "'", int44 == 60000);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:01" + "'", str47, "+00:01");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:52");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0249");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        java.lang.String str9 = dateTimeZone2.getName((long) 28800000);
        long long11 = dateTimeZone2.convertUTCToLocal((-59900L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getName((long) 60000, locale13);
        long long16 = dateTimeZone2.previousTransition((long) 60000);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone2.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone2.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59900L) + "'", long11 == (-59900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0250");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (-1));
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0251");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        long long8 = dateTimeZone2.convertLocalToUTC(52L, true);
        java.lang.String str10 = dateTimeZone2.getShortName((-25199900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59948L) + "'", long8 == (-59948L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0253");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.Object obj6 = null;
        boolean boolean7 = dateTimeZone2.equals(obj6);
        long long9 = dateTimeZone2.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60100L + "'", long9 == 60100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0254");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 1);
        java.lang.String str4 = dateTimeZone2.getName((-28919901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:01" + "'", str4, "+10:01");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        int int6 = dateTimeZone1.getOffset((-60001L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-59990L), locale8);
        long long11 = dateTimeZone1.previousTransition((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0257");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str11 = dateTimeZone0.getID();
        boolean boolean13 = dateTimeZone0.isStandardOffset(60052L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        boolean boolean23 = dateTimeZone14.isFixed();
        java.lang.String str25 = dateTimeZone14.getShortName((-60001L));
        int int27 = dateTimeZone14.getOffset((-59965L));
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) (-59965L));
        long long31 = dateTimeZone0.convertLocalToUTC((long) 25200000, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 25140000L + "'", long31 == 25140000L);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 28800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0259");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) 0, locale6);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        boolean boolean13 = dateTimeZone2.isStandardOffset(52L);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 52L);
        boolean boolean15 = dateTimeZone1.isFixed();
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0261");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 60000);
        int int5 = dateTimeZone1.getStandardOffset(34L);
        int int7 = dateTimeZone1.getOffsetFromLocal((-59968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0263");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        boolean boolean19 = dateTimeZone14.isStandardOffset((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int3 = dateTimeZone1.getOffset(34L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0265");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        java.lang.String str3 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0267");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) (short) 100, locale4);
        boolean boolean6 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0268");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone4.toString();
        java.lang.String str9 = dateTimeZone4.getName(2L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0269");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getName(97L);
        long long13 = dateTimeZone0.nextTransition((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60001L) + "'", long13 == (-60001L));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0270");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-59990L), false, 53L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long7 = dateTimeZone0.convertUTCToLocal(32400000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-59990L) + "'", long4 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32400000L + "'", long7 == 32400000L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0271");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) "Indochina Time");
        int int7 = dateTimeZone1.getOffsetFromLocal((-32339968L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-59990L), locale9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getName((long) (short) 0);
        java.lang.String str18 = dateTimeZone13.getName(0L);
        java.lang.String str19 = dateTimeZone13.getID();
        boolean boolean21 = dateTimeZone13.equals((java.lang.Object) (-28799968L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (-59969L));
        long long26 = dateTimeZone1.convertLocalToUTC((long) '#', true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-119969L) + "'", long23 == (-119969L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0272");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        java.lang.String str33 = dateTimeZone30.getName((long) (short) 0);
        java.lang.String str35 = dateTimeZone30.getName(0L);
        long long37 = dateTimeZone25.getMillisKeepLocal(dateTimeZone30, (long) (short) 1);
        java.lang.String str39 = dateTimeZone25.getNameKey((-59999L));
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        long long42 = dateTimeZone25.getMillisKeepLocal(dateTimeZone40, (long) '#');
        java.util.TimeZone timeZone43 = dateTimeZone25.toTimeZone();
        java.lang.String str44 = dateTimeZone25.toString();
        long long46 = dateTimeZone14.getMillisKeepLocal(dateTimeZone25, (long) (short) -1);
        java.lang.String str47 = dateTimeZone25.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-59999L) + "'", long37 == (-59999L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTC" + "'", str47, "UTC");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0275");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.lang.Class<?> wildcardClass7 = nameProvider0.getClass();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.032");
        java.lang.String str3 = dateTimeZone1.getName((-119968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.032" + "'", str3, "+00:00:00.032");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0277");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset(5699968L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0278");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition(60052L);
        java.lang.String str16 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60052L + "'", long15 == 60052L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0279");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0280");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getNameKey((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        java.lang.String str16 = dateTimeZone13.toString();
        java.util.TimeZone timeZone17 = dateTimeZone13.toTimeZone();
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, 34L);
        boolean boolean20 = dateTimeZone13.isFixed();
        int int22 = dateTimeZone13.getOffset((-32339968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "38) test0280(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "36) test0280(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "30) test0280(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
// flaky "24) test0280(JA_051_Regression0)":         org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
// flaky "19) test0280(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60034L + "'", long19 == 60034L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0281");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        boolean boolean21 = dateTimeZone0.equals((java.lang.Object) (-59999L));
        java.lang.String str22 = dateTimeZone0.toString();
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        int int25 = dateTimeZone0.getStandardOffset((-119900L));
        int int27 = dateTimeZone0.getStandardOffset((-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "39) test0281(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "37) test0281(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "31) test0281(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "25) test0281(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
// flaky "20) test0281(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "11) test0281(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "7) test0281(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "5) test0281(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
// flaky "4) test0281(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
// flaky "2) test0281(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0282");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone4.toString();
        long long9 = dateTimeZone4.previousTransition((long) 60000);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone4.getName((-3600000L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0283");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long3 = dateTimeZone1.nextTransition(22020000L);
        java.lang.String str5 = dateTimeZone1.getName((long) (byte) 10);
        java.lang.String str7 = dateTimeZone1.getNameKey(53L);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.032' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 22020000L + "'", long3 == 22020000L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0284");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        long long24 = dateTimeZone14.convertUTCToLocal((-119903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.Class<?> wildcardClass26 = dateTimeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-119903L) + "'", long24 == (-119903L));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0285");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-28799900L), true, (long) '#');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) 28800000, locale10);
        long long13 = dateTimeZone1.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28799900L) + "'", long8 == (-28799900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0286");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.Object obj6 = null;
        boolean boolean7 = dateTimeZone2.equals(obj6);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0287");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        long long3 = dateTimeZone1.convertUTCToLocal((-119900L));
        long long7 = dateTimeZone1.convertLocalToUTC(60000L, false, (long) (-3600000));
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28680100L + "'", long3 == 28680100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28740000L) + "'", long7 == (-28740000L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+08:00" + "'", str8, "+08:00");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0288");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.nextTransition((-59900L));
        boolean boolean10 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59900L) + "'", long9 == (-59900L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0289");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName((-60000L), locale12);
        int int15 = dateTimeZone2.getOffset(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0290");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) -1);
        long long7 = dateTimeZone0.nextTransition(32L);
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0291");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        long long6 = dateTimeZone2.convertLocalToUTC((long) 25200000, false, (long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 31920000L + "'", long6 == 31920000L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0292");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long9 = dateTimeZone6.convertLocalToUTC(31L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59969L) + "'", long9 == (-59969L));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0293");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) (byte) 1, locale8);
        java.lang.String str11 = dateTimeZone6.getNameKey((-28919900L));
        int int13 = dateTimeZone6.getOffset((-28919900L));
        long long15 = dateTimeZone6.nextTransition(22020000L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone6.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getShortName(60035L, locale19);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 31L);
        long long24 = dateTimeZone1.nextTransition((-119968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22020000L + "'", long15 == 22020000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3600000) + "'", int17 == (-3600000));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3660031L + "'", long22 == 3660031L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-119968L) + "'", long24 == (-119968L));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0294");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        int int10 = dateTimeZone2.getOffset((long) (short) 100);
        java.lang.String str12 = dateTimeZone2.getShortName(0L);
        java.lang.String str13 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0296");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone2.getID();
        boolean boolean17 = dateTimeZone2.isFixed();
        long long19 = dateTimeZone2.nextTransition((-28859965L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-28859965L) + "'", long19 == (-28859965L));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0298");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        java.lang.String str13 = dateTimeZone0.toString();
        long long15 = dateTimeZone0.convertUTCToLocal((long) '#');
        boolean boolean16 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60035L + "'", long15 == 60035L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0299");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        java.lang.Class<?> wildcardClass15 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0300");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone0.getName((long) (byte) -1);
        boolean boolean15 = dateTimeZone0.isStandardOffset((-119903L));
        java.lang.String str17 = dateTimeZone0.getShortName((-3600000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0302");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        long long21 = dateTimeZone0.previousTransition(0L);
        java.lang.String str23 = dateTimeZone0.getNameKey((long) (short) 1);
        long long26 = dateTimeZone0.adjustOffset(0L, true);
        boolean boolean28 = dateTimeZone0.isStandardOffset(21960001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0303");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-28799900L), true, (long) '#');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) 28800000, locale10);
        long long13 = dateTimeZone1.previousTransition(0L);
        int int15 = dateTimeZone1.getStandardOffset(32400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0304");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        int int7 = dateTimeZone1.getOffsetFromLocal(3600097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0305");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass10 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0306");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        int int10 = dateTimeZone2.getOffset((long) (short) 100);
        java.lang.String str12 = dateTimeZone2.getShortName(5700001L);
        int int14 = dateTimeZone2.getStandardOffset((-59903L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0307");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (byte) -1);
        long long4 = dateTimeZone2.previousTransition(32L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0308");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-28799969L), locale11);
        java.lang.String str14 = dateTimeZone1.getName(97L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "40) test0308(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
// flaky "38) test0308(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
// flaky "32) test0308(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky "26) test0308(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
// flaky "21) test0308(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0309");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC(21660000L, true, (-179900L));
        int int13 = dateTimeZone2.getStandardOffset(100L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21600000L + "'", long11 == 21600000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0311");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Class<?> wildcardClass11 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "41) test0311(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "39) test0311(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "33) test0311(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "27) test0311(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0312");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((-22L), locale10);
        int int13 = dateTimeZone0.getOffset((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "42) test0312(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "40) test0312(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "34) test0312(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "28) test0312(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
// flaky "22) test0312(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0313");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.String str7 = dateTimeZone2.getName(10L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 28800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0315");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0316");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        long long9 = dateTimeZone0.convertUTCToLocal(52L);
        java.lang.String str11 = dateTimeZone0.getShortName(3540097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60052L + "'", long9 == 60052L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0317");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        boolean boolean18 = dateTimeZone0.isStandardOffset((-28859900L));
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0318");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        int int16 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long20 = dateTimeZone18.nextTransition(22020000L);
        java.lang.String str22 = dateTimeZone18.getName((long) (byte) 10);
        long long24 = dateTimeZone2.getMillisKeepLocal(dateTimeZone18, (long) (byte) 10);
        long long27 = dateTimeZone2.adjustOffset(60034L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 22020000L + "'", long20 == 22020000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.032" + "'", str22, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-22L) + "'", long24 == (-22L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60034L + "'", long27 == 60034L);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5520000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5520000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0320");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName(53L, locale10);
        int int13 = dateTimeZone0.getOffset((long) 25200000);
        long long15 = dateTimeZone0.convertUTCToLocal((-119968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59968L) + "'", long15 == (-59968L));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0321");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(0L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone2.getName((-60001L), locale11);
        java.lang.String str13 = dateTimeZone2.toString();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone2.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0322");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        java.lang.String str2 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+08:00" + "'", str2, "+08:00");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0323");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        long long12 = dateTimeZone2.nextTransition((-59965L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName(60035L, locale14);
        long long18 = dateTimeZone2.adjustOffset((-119968L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-59965L) + "'", long12 == (-59965L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-119968L) + "'", long18 == (-119968L));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0324");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        long long12 = dateTimeZone2.nextTransition((-59965L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName(60035L, locale14);
        long long17 = dateTimeZone2.previousTransition(28680100L);
        java.lang.String str19 = dateTimeZone2.getName((-119999L));
        long long23 = dateTimeZone2.convertLocalToUTC((long) (-1), true, (-60001L));
        long long25 = dateTimeZone2.convertUTCToLocal((-59999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-59965L) + "'", long12 == (-59965L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 28680100L + "'", long17 == 28680100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-60001L) + "'", long23 == (-60001L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0325");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        java.lang.String str9 = dateTimeZone2.getName((long) 28800000);
        long long11 = dateTimeZone2.convertUTCToLocal((-59900L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getName((long) 60000, locale13);
        long long16 = dateTimeZone2.previousTransition((long) 60000);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone2.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone2.getOffsetFromLocal((-119900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59900L) + "'", long11 == (-59900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0326");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        long long25 = dateTimeZone14.adjustOffset((long) '#', true);
        long long27 = dateTimeZone14.previousTransition((-28859900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-28859900L) + "'", long27 == (-28859900L));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0328");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        long long16 = dateTimeZone6.adjustOffset(0L, true);
        int int18 = dateTimeZone6.getOffset((-28919900L));
        int int20 = dateTimeZone6.getOffsetFromLocal((-25199900L));
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone6.getShortName((-59968L), locale22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59969L) + "'", long13 == (-59969L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0329");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        int int8 = dateTimeZone1.getStandardOffset(60000L);
        int int10 = dateTimeZone1.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0330");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        boolean boolean10 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        int int12 = dateTimeZone2.getStandardOffset((-59969L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6720000) + "'", int12 == (-6720000));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        long long11 = dateTimeZone8.previousTransition((long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60000L + "'", long11 == 60000L);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0332");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        int int12 = dateTimeZone2.getStandardOffset((long) (short) -1);
        long long15 = dateTimeZone2.adjustOffset((long) '4', false);
        java.lang.String str17 = dateTimeZone2.getShortName(0L);
        java.lang.String str18 = dateTimeZone2.getID();
        java.lang.String str19 = dateTimeZone2.getID();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone2.getShortName(5700000L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0333");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0334");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(60000L);
        long long14 = dateTimeZone2.previousTransition(5700032L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5700032L + "'", long14 == 5700032L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0335");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-59990L), locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone1.getShortName((long) 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0336");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str3 = dateTimeZone1.getNameKey(52L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(60035L, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0337");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-6720000), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0339");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0340");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        long long24 = dateTimeZone14.convertUTCToLocal((-119903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long27 = dateTimeZone14.nextTransition((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-119903L) + "'", long24 == (-119903L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0341");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.lang.String str19 = dateTimeZone14.getNameKey((-59903L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0342");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str3 = dateTimeZone2.getID();
        java.lang.String str4 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0343");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        int int13 = dateTimeZone5.getOffset(10L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str17 = dateTimeZone16.toString();
        long long20 = dateTimeZone16.convertLocalToUTC((long) (-1), false);
        java.lang.String str21 = dateTimeZone16.getID();
        long long23 = dateTimeZone16.nextTransition(100L);
        boolean boolean24 = dateTimeZone16.isFixed();
        long long28 = dateTimeZone16.convertLocalToUTC(28800010L, false, (long) (short) 1);
        long long30 = dateTimeZone5.getMillisKeepLocal(dateTimeZone16, 60036L);
        int int32 = dateTimeZone5.getOffsetFromLocal((-60022L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-60001L) + "'", long20 == (-60001L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28740010L + "'", long28 == 28740010L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60036L + "'", long30 == 60036L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60000 + "'", int32 == 60000);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0344");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone10.convertLocalToUTC((-3719902L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3779902L) + "'", long13 == (-3779902L));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0345");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0346");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        java.lang.String str3 = dateTimeZone2.getID();
        boolean boolean5 = dateTimeZone2.isStandardOffset((-3659902L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:10" + "'", str3, "+01:10");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0347");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.convertUTCToLocal(1L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone13.getShortName((long) (byte) 10, locale17);
        java.lang.String str19 = dateTimeZone13.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str24 = dateTimeZone22.getNameKey(0L);
        boolean boolean25 = dateTimeZone13.equals((java.lang.Object) 0L);
        long long27 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, 22020000L);
        long long29 = dateTimeZone10.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 22080000L + "'", long27 == 22080000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 60000L + "'", long29 == 60000L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0348");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        int int13 = dateTimeZone5.getOffset(10L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str17 = dateTimeZone16.toString();
        long long20 = dateTimeZone16.convertLocalToUTC((long) (-1), false);
        java.lang.String str21 = dateTimeZone16.getID();
        long long23 = dateTimeZone16.nextTransition(100L);
        boolean boolean24 = dateTimeZone16.isFixed();
        long long28 = dateTimeZone16.convertLocalToUTC(28800010L, false, (long) (short) 1);
        long long30 = dateTimeZone5.getMillisKeepLocal(dateTimeZone16, 60036L);
        java.lang.Class<?> wildcardClass31 = dateTimeZone16.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-60001L) + "'", long20 == (-60001L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28740010L + "'", long28 == 28740010L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60036L + "'", long30 == 60036L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0349");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        java.lang.String str16 = dateTimeZone2.getNameKey((-59999L));
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        long long19 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, (long) '#');
        java.util.TimeZone timeZone20 = dateTimeZone2.toTimeZone();
        java.lang.String str21 = dateTimeZone2.toString();
        java.lang.String str22 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0350");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0351");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName(3540097L, locale5);
        int int8 = dateTimeZone2.getStandardOffset(100L);
        java.lang.String str10 = dateTimeZone2.getShortName(32L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0352");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        java.lang.String str6 = dateTimeZone0.toString();
        boolean boolean7 = dateTimeZone0.isFixed();
        long long11 = dateTimeZone0.convertLocalToUTC(20L, false, 5640000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "43) test0352(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "41) test0352(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "35) test0352(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "29) test0352(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59980L) + "'", long11 == (-59980L));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0353");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone2.getID();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone18.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getName(10L, locale23);
        long long27 = dateTimeZone18.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        long long34 = dateTimeZone30.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        long long37 = dateTimeZone30.convertUTCToLocal(0L);
        java.lang.String str39 = dateTimeZone30.getShortName((long) (short) 100);
        long long41 = dateTimeZone18.getMillisKeepLocal(dateTimeZone30, (long) 60000);
        boolean boolean42 = dateTimeZone2.equals((java.lang.Object) dateTimeZone30);
        int int44 = dateTimeZone30.getOffset(52L);
        java.util.TimeZone timeZone45 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        int int48 = dateTimeZone30.getOffsetFromLocal(0L);
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone30.getName(28799999L, locale50);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-60001L) + "'", long27 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-60001L) + "'", long34 == (-60001L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60000L + "'", long37 == 60000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60000L + "'", long41 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60000 + "'", int44 == 60000);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60000 + "'", int48 == 60000);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:01" + "'", str51, "+00:01");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0354");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28800000 + "'", int3 == 28800000);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0355");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        int int5 = dateTimeZone1.getStandardOffset(7200097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0356");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        java.lang.String str13 = dateTimeZone0.getName((-1080032L));
        long long16 = dateTimeZone0.adjustOffset(60034L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60001L + "'", long9 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60034L + "'", long16 == 60034L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0357");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getNameKey((-28799968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0358");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Positive hours must not have negative minutes: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0360");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((long) '4', locale13);
        boolean boolean15 = dateTimeZone6.isFixed();
        java.lang.String str17 = dateTimeZone6.getShortName((-60001L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str19 = dateTimeZone18.toString();
        boolean boolean20 = dateTimeZone6.equals((java.lang.Object) dateTimeZone18);
        long long23 = dateTimeZone6.adjustOffset(100L, true);
        boolean boolean24 = dateTimeZone2.equals((java.lang.Object) long23);
        long long26 = dateTimeZone2.previousTransition((-28859900L));
        boolean boolean28 = dateTimeZone2.isStandardOffset((-28739964L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky "44) test0360(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky "42) test0360(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "36) test0360(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "30) test0360(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "23) test0360(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28859900L) + "'", long26 == (-28859900L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0361");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        int int11 = dateTimeZone0.getOffset((-28919900L));
        boolean boolean12 = dateTimeZone0.isFixed();
        long long16 = dateTimeZone0.convertLocalToUTC((long) (short) 1, false, 52L);
        java.lang.String str17 = dateTimeZone0.getID();
        java.util.TimeZone timeZone18 = dateTimeZone0.toTimeZone();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getShortName((-28919901L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "45) test0361(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "43) test0361(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
// flaky "37) test0361(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "31) test0361(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "24) test0361(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "12) test0361(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
// flaky "8) test0361(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "6) test0361(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
// flaky "5) test0361(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0362");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone0.getName((long) (byte) -1);
        int int15 = dateTimeZone0.getOffset((-59902L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "46) test0362(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "44) test0362(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "38) test0362(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "32) test0362(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "25) test0362(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
// flaky "13) test0362(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0363");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        int int9 = dateTimeZone0.getOffset(0L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getShortName((long) (short) 1, locale11);
        int int14 = dateTimeZone0.getOffset(60100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "47) test0363(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "45) test0363(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "39) test0363(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "33) test0363(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky "26) test0363(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0364");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        boolean boolean5 = dateTimeZone4.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone4.getName(0L, locale7);
        long long10 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (-59990L));
        int int12 = dateTimeZone2.getStandardOffset((long) (-1));
        long long14 = dateTimeZone2.nextTransition((-1L));
        int int16 = dateTimeZone2.getOffsetFromLocal((-119969L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "48) test0364(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "46) test0364(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0365");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((long) '4', locale13);
        boolean boolean15 = dateTimeZone6.isFixed();
        java.lang.String str17 = dateTimeZone6.getShortName((-60001L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str19 = dateTimeZone18.toString();
        boolean boolean20 = dateTimeZone6.equals((java.lang.Object) dateTimeZone18);
        long long23 = dateTimeZone6.adjustOffset(100L, true);
        boolean boolean24 = dateTimeZone2.equals((java.lang.Object) long23);
        long long26 = dateTimeZone2.previousTransition((-28859900L));
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone2.getName(60000L, locale28);
        long long32 = dateTimeZone2.convertLocalToUTC((-6719900L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky "49) test0365(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky "47) test0365(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "40) test0365(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "34) test0365(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "27) test0365(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28859900L) + "'", long26 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-6779900L) + "'", long32 == (-6779900L));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0366");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        java.util.TimeZone timeZone10 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0367");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int3 = dateTimeZone1.getOffset(34L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-59947L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0368");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((long) ' ', locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0369");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) 0, locale6);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        boolean boolean13 = dateTimeZone2.isStandardOffset(52L);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 52L);
        boolean boolean15 = dateTimeZone1.isFixed();
        java.lang.String str17 = dateTimeZone1.getShortName(21660000L);
        boolean boolean18 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+08:00" + "'", str4, "+08:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+08:00" + "'", str7, "+08:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28800000 + "'", int11 == 28800000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0370");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-59990L));
        boolean boolean20 = dateTimeZone14.isStandardOffset((-2L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+08:00" + "'", str2, "+08:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28800000 + "'", int7 == 28800000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+08:00" + "'", str9, "+08:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-28799948L) + "'", long13 == (-28799948L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+08:00" + "'", str16, "+08:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59990L) + "'", long18 == (-59990L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0371");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) '4');
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.Class<?> wildcardClass4 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:52" + "'", str3, "+00:52");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0373");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass4 = timeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0374");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone4.toString();
        java.lang.String str9 = dateTimeZone4.getName((long) (byte) 10);
        boolean boolean10 = dateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone4.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getShortName((long) 'a');
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((long) 4200000, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0376");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        java.lang.String str7 = dateTimeZone2.getName(25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0377");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        long long7 = dateTimeZone1.convertLocalToUTC((-179903L), false, 98L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-179935L) + "'", long7 == (-179935L));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0378");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        boolean boolean10 = dateTimeZone0.isFixed();
        int int12 = dateTimeZone0.getStandardOffset(22020000L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName((long) (byte) 10, locale14);
        long long18 = dateTimeZone0.convertLocalToUTC((-22L), false);
        boolean boolean19 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinated Universal Time" + "'", str15, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-22L) + "'", long18 == (-22L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0379");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.lang.Class<?> wildcardClass12 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0380");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone2.getID();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone18.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getName(10L, locale23);
        long long27 = dateTimeZone18.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        long long34 = dateTimeZone30.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        long long37 = dateTimeZone30.convertUTCToLocal(0L);
        java.lang.String str39 = dateTimeZone30.getShortName((long) (short) 100);
        long long41 = dateTimeZone18.getMillisKeepLocal(dateTimeZone30, (long) 60000);
        boolean boolean42 = dateTimeZone2.equals((java.lang.Object) dateTimeZone30);
        int int44 = dateTimeZone30.getOffset(52L);
        java.lang.Class<?> wildcardClass45 = dateTimeZone30.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-60001L) + "'", long27 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-60001L) + "'", long34 == (-60001L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60000L + "'", long37 == 60000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60000L + "'", long41 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60000 + "'", int44 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0381");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0382");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long8 = dateTimeZone4.nextTransition(0L);
        long long10 = dateTimeZone4.previousTransition(28800010L);
        int int12 = dateTimeZone4.getOffset((-59965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28800010L + "'", long10 == 28800010L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0383");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.convertUTCToLocal(1L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone13.getShortName((long) (byte) 10, locale17);
        java.lang.String str19 = dateTimeZone13.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str24 = dateTimeZone22.getNameKey(0L);
        boolean boolean25 = dateTimeZone13.equals((java.lang.Object) 0L);
        long long27 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, 22020000L);
        long long29 = dateTimeZone10.previousTransition((-6719900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 22080000L + "'", long27 == 22080000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-6719900L) + "'", long29 == (-6719900L));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0384");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName((long) 32, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 100);
        java.lang.String str17 = dateTimeZone13.getName((-28799900L));
        long long19 = dateTimeZone13.previousTransition((-59903L));
        java.lang.String str20 = dateTimeZone13.getID();
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (-59903L));
        boolean boolean24 = dateTimeZone0.equals((java.lang.Object) "+10:01");
        long long27 = dateTimeZone0.convertLocalToUTC(31L, false);
        boolean boolean29 = dateTimeZone0.isStandardOffset((-28979901L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "50) test0384(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "48) test0384(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "41) test0384(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "35) test0384(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
// flaky "28) test0384(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-59903L) + "'", long22 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "14) test0384(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0385");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        long long14 = dateTimeZone2.adjustOffset(22080000L, false);
        java.lang.String str16 = dateTimeZone2.getName((-59999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 22080000L + "'", long14 == 22080000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0386");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        long long14 = dateTimeZone2.nextTransition(60001L);
        long long16 = dateTimeZone2.convertUTCToLocal(0L);
        int int18 = dateTimeZone2.getOffsetFromLocal(52L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone21.convertUTCToLocal(1L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone21.getShortName((long) (byte) 10, locale25);
        int int28 = dateTimeZone21.getStandardOffset((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.lang.String str31 = dateTimeZone21.getShortName((-3660000L));
        long long33 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, (-28859900L));
        java.lang.String str34 = dateTimeZone21.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60001L + "'", long14 == 60001L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-28799900L) + "'", long33 == (-28799900L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0387");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition(11L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0389");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName(53L, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean14 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone15 = dateTimeZone13.toTimeZone();
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) dateTimeZone13);
        java.lang.Class<?> wildcardClass17 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0390");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        java.lang.String str13 = dateTimeZone0.getName((-1080032L));
        java.lang.String str14 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0391");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        long long14 = dateTimeZone2.convertLocalToUTC(28800010L, false, (long) (short) 1);
        java.lang.Class<?> wildcardClass15 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28740010L + "'", long14 == 28740010L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0392");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str14 = dateTimeZone0.getID();
        java.lang.String str16 = dateTimeZone0.getNameKey((-60002L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0393");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0394");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-59990L));
        java.lang.String str20 = dateTimeZone14.getNameKey(120000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "51) test0394(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "49) test0394(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "42) test0394(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "36) test0394(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "29) test0394(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "15) test0394(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59990L) + "'", long18 == (-59990L));
// flaky "9) test0394(JA_051_Regression0)":         org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0395");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        java.lang.Object obj21 = null;
        boolean boolean22 = dateTimeZone14.equals(obj21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        java.lang.String str33 = dateTimeZone30.getName((long) (short) 0);
        java.lang.String str35 = dateTimeZone30.getName(0L);
        long long37 = dateTimeZone25.getMillisKeepLocal(dateTimeZone30, (long) (short) 1);
        java.lang.String str39 = dateTimeZone25.getNameKey((-59999L));
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        long long42 = dateTimeZone25.getMillisKeepLocal(dateTimeZone40, (long) '#');
        java.util.TimeZone timeZone43 = dateTimeZone25.toTimeZone();
        java.lang.String str44 = dateTimeZone25.toString();
        long long46 = dateTimeZone14.getMillisKeepLocal(dateTimeZone25, (long) (short) -1);
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone14.getName(35L, locale48);
        java.lang.Class<?> wildcardClass50 = dateTimeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-59999L) + "'", long37 == (-59999L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
// flaky "52) test0395(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 36L + "'", long42 == 36L);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Coordinated Universal Time" + "'", str49, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0396");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        java.lang.String str13 = dateTimeZone0.toString();
        long long15 = dateTimeZone0.convertUTCToLocal((long) '#');
        boolean boolean17 = dateTimeZone0.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "53) test0396(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "50) test0396(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "43) test0396(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "37) test0396(JA_051_Regression0)":         org.junit.Assert.assertNull(str10);
// flaky "30) test0396(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "16) test0396(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "10) test0396(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 34L + "'", long15 == 34L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0397");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getNameKey((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str15 = dateTimeZone14.toString();
        java.lang.String str17 = dateTimeZone14.getName((long) (short) 0);
        java.lang.String str19 = dateTimeZone14.getName(0L);
        long long21 = dateTimeZone14.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long25 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-59968L));
        long long27 = dateTimeZone0.previousTransition(97L);
        long long29 = dateTimeZone0.nextTransition((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "54) test0397(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "51) test0397(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "44) test0397(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky "38) test0397(JA_051_Regression0)":         org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "31) test0397(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-119969L) + "'", long25 == (-119969L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0398");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str17 = dateTimeZone16.toString();
        java.lang.String str19 = dateTimeZone16.getName((long) (short) 0);
        long long22 = dateTimeZone16.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone23 = dateTimeZone16.toTimeZone();
        long long25 = dateTimeZone0.getMillisKeepLocal(dateTimeZone16, 5699968L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str29 = dateTimeZone28.toString();
        java.lang.String str31 = dateTimeZone28.getNameKey(100L);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str34 = dateTimeZone33.getID();
        boolean boolean36 = dateTimeZone33.isStandardOffset((-28919900L));
        boolean boolean37 = dateTimeZone28.equals((java.lang.Object) boolean36);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone28.getShortName((long) 'a', locale39);
        boolean boolean42 = dateTimeZone28.isStandardOffset((-59968L));
        int int44 = dateTimeZone28.getOffset((-28799948L));
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone28.getOffset(readableInstant45);
        java.lang.String str48 = dateTimeZone28.getShortName(60100L);
        long long50 = dateTimeZone16.getMillisKeepLocal(dateTimeZone28, (-28740000L));
        long long54 = dateTimeZone28.convertLocalToUTC(60032L, true, (-119967L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "55) test0398(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "52) test0398(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "45) test0398(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "39) test0398(JA_051_Regression0)":         org.junit.Assert.assertNull(str10);
// flaky "32) test0398(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60000L) + "'", long22 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
// flaky "17) test0398(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5639967L + "'", long25 == 5639967L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
// flaky "11) test0398(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:01" + "'", str40, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60000 + "'", int44 == 60000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60000 + "'", int46 == 60000);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:01" + "'", str48, "+00:01");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-28740000L) + "'", long50 == (-28740000L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0399");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        java.lang.String str4 = dateTimeZone2.getShortName((-28739964L));
        int int6 = dateTimeZone2.getOffsetFromLocal((-28800032L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:52" + "'", str4, "-01:52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6720000) + "'", int6 == (-6720000));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0400");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long13 = dateTimeZone0.previousTransition(60001L);
        java.lang.String str14 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone0.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "56) test0400(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "53) test0400(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "46) test0400(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60001L + "'", long13 == 60001L);
// flaky "40) test0400(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0401");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        long long12 = dateTimeZone0.adjustOffset((long) 1, true);
        java.lang.String str13 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "57) test0401(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "54) test0401(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "47) test0401(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
// flaky "41) test0401(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0402");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long14 = dateTimeZone0.adjustOffset(100L, false);
        long long16 = dateTimeZone0.nextTransition((long) 25200000);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getName((-3719902L), locale18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "58) test0402(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "55) test0402(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "48) test0402(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
// flaky "42) test0402(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0403");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        int int13 = dateTimeZone5.getStandardOffset((-1L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone5.getShortName(32L, locale15);
        long long20 = dateTimeZone5.convertLocalToUTC((long) 100, false, 5640000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-59900L) + "'", long20 == (-59900L));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0404");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) 0, locale6);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        boolean boolean13 = dateTimeZone2.isStandardOffset(52L);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 52L);
        java.lang.String str16 = dateTimeZone1.getName((long) '#');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getName(59999L, locale18);
        int int21 = dateTimeZone1.getStandardOffset((-3719902L));
        long long23 = dateTimeZone1.convertUTCToLocal((long) (-6720000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "59) test0404(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "56) test0404(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "49) test0404(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-10320000L) + "'", long23 == (-10320000L));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0405");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        int int8 = dateTimeZone1.getOffset((-59990L));
        boolean boolean10 = dateTimeZone1.isStandardOffset((-28979900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "60) test0405(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "57) test0405(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
// flaky "50) test0405(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0406");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getName((long) (short) 0);
        java.lang.String str18 = dateTimeZone13.getName(0L);
        long long20 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (long) (short) 1);
        int int22 = dateTimeZone8.getStandardOffset((long) 1);
        long long25 = dateTimeZone8.convertLocalToUTC((long) 10, true);
        java.lang.String str27 = dateTimeZone8.getName((long) '4');
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 22020000L);
        java.lang.String str31 = dateTimeZone1.getShortName(28800001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "61) test0406(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-59999L) + "'", long20 == (-59999L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coordinated Universal Time" + "'", str27, "Coordinated Universal Time");
// flaky "58) test0406(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 22080000L + "'", long29 == 22080000L);
// flaky "51) test0406(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0407");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-59947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "62) test0407(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "59) test0407(JA_051_Regression0)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0408");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getName(97L);
        long long13 = dateTimeZone0.nextTransition(3540097L);
        boolean boolean14 = dateTimeZone0.isFixed();
        long long16 = dateTimeZone0.previousTransition(28799999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "63) test0408(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "60) test0408(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "52) test0408(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
// flaky "43) test0408(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540097L + "'", long13 == 3540097L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 28799999L + "'", long16 == 28799999L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0409");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        long long9 = dateTimeZone2.nextTransition((-60022L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60022L) + "'", long9 == (-60022L));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0410");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-3599902L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0411");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str11 = dateTimeZone0.getID();
        boolean boolean13 = dateTimeZone0.isStandardOffset(60052L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone17.isLocalDateTimeGap(localDateTime19);
        long long24 = dateTimeZone17.convertLocalToUTC((long) (byte) 0, true, 0L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone17.getOffset(readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long30 = dateTimeZone17.getMillisKeepLocal(dateTimeZone28, (long) 25200000);
        long long32 = dateTimeZone0.getMillisKeepLocal(dateTimeZone28, (-28799968L));
        java.lang.String str34 = dateTimeZone28.getShortName((-28799900L));
        long long36 = dateTimeZone28.convertUTCToLocal(28800001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-00:00:00.001" + "'", str18, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 21599999L + "'", long30 == 21599999L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-32399969L) + "'", long32 == (-32399969L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:00" + "'", str34, "+01:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32400001L + "'", long36 == 32400001L);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0412");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        int int11 = dateTimeZone0.getOffset((-28919900L));
        long long15 = dateTimeZone0.convertLocalToUTC(3660031L, true, 120000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3660032L + "'", long15 == 3660032L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0414");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        java.lang.String str10 = dateTimeZone0.toString();
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0415");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        int int3 = dateTimeZone1.getStandardOffset((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0416");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        java.lang.String str6 = dateTimeZone1.toString();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        java.lang.String str11 = dateTimeZone8.getNameKey(60001L);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) 60001L);
        long long14 = dateTimeZone1.convertUTCToLocal((long) 28800000);
        long long16 = dateTimeZone1.nextTransition((-28799948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28799999L + "'", long14 == 28799999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-28799948L) + "'", long16 == (-28799948L));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0417");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        int int10 = dateTimeZone2.getOffset((long) (short) 100);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        boolean boolean13 = dateTimeZone12.isFixed();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone12.getName(0L, locale15);
        java.lang.String str18 = dateTimeZone12.getNameKey((long) (byte) 0);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone12.getName((long) (byte) -1, locale20);
        boolean boolean22 = dateTimeZone2.equals((java.lang.Object) str21);
        boolean boolean23 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "64) test0417(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
// flaky "61) test0417(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
// flaky "53) test0417(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinated Universal Time" + "'", str21, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0418");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getOffset(22080000L);
        int int11 = dateTimeZone1.getOffset(0L);
        long long15 = dateTimeZone1.convertLocalToUTC(32L, false, 5639967L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "65) test0418(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "62) test0418(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "54) test0418(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "44) test0418(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0420");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        long long12 = dateTimeZone0.adjustOffset((long) 1, true);
        java.lang.String str13 = dateTimeZone0.getID();
        int int15 = dateTimeZone0.getOffset(5639968L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "66) test0420(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "63) test0420(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "55) test0420(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
// flaky "45) test0420(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
// flaky "33) test0420(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0423");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long13 = dateTimeZone0.convertUTCToLocal((long) 32);
        boolean boolean14 = dateTimeZone0.isFixed();
        long long16 = dateTimeZone0.previousTransition((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "67) test0423(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "64) test0423(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "56) test0423(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "46) test0423(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0425");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        boolean boolean8 = dateTimeZone2.isFixed();
        long long12 = dateTimeZone2.convertLocalToUTC((-119903L), false, (long) (-3600000));
        int int14 = dateTimeZone2.getOffset((-60022L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-179903L) + "'", long12 == (-179903L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0426");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        boolean boolean21 = dateTimeZone0.equals((java.lang.Object) (-59999L));
        java.lang.String str22 = dateTimeZone0.toString();
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null; // flaky "68) test0426(JA_051_Regression0)": org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "65) test0426(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "57) test0426(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "47) test0426(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "34) test0426(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky "18) test0426(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "12) test0426(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "7) test0426(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "6) test0426(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
// flaky "3) test0426(JA_051_Regression0)":         org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0427");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.lang.String str24 = dateTimeZone14.getNameKey((long) '4');
        int int26 = dateTimeZone14.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str29 = dateTimeZone14.getNameKey(1L);
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (long) (short) -1);
        int int33 = dateTimeZone0.getOffset((-60001L));
        boolean boolean34 = dateTimeZone0.isFixed();
        long long36 = dateTimeZone0.nextTransition((-59902L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "69) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "66) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "58) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "48) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "35) test0427(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "19) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "13) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
// flaky "8) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
// flaky "7) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
// flaky "4) test0427(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "2) test0427(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
// flaky "1) test0427(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-59902L) + "'", long36 == (-59902L));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.lang.String str24 = dateTimeZone14.getNameKey((long) '4');
        int int26 = dateTimeZone14.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str29 = dateTimeZone14.getNameKey(1L);
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (long) (short) -1);
        java.lang.String str33 = dateTimeZone0.getName((long) 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "70) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "67) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "59) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "49) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "36) test0428(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "20) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "14) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
// flaky "9) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
// flaky "8) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
// flaky "5) test0428(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "3) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
// flaky "2) test0428(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Coordinated Universal Time" + "'", str33, "Coordinated Universal Time");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0429");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        int int13 = dateTimeZone0.getOffset((-59965L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName(1L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName(0L, locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getName((long) '4', locale25);
        boolean boolean28 = dateTimeZone18.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone18.isLocalDateTimeGap(localDateTime29);
        java.lang.String str32 = dateTimeZone18.getName((-59990L));
        java.lang.String str33 = dateTimeZone18.toString();
        long long35 = dateTimeZone17.getMillisKeepLocal(dateTimeZone18, 5699968L);
        boolean boolean36 = dateTimeZone0.equals((java.lang.Object) 5699968L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "71) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "68) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "60) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "50) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "37) test0429(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "21) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
// flaky "15) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
// flaky "10) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coordinated Universal Time" + "'", str26, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "9) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coordinated Universal Time" + "'", str32, "Coordinated Universal Time");
// flaky "6) test0429(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
// flaky "4) test0429(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1020032L) + "'", long35 == (-1020032L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0431");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((long) 'a', locale19);
        long long22 = dateTimeZone14.previousTransition(10L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone14.getShortName(21599999L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0432");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        int int5 = dateTimeZone1.getStandardOffset((-179969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "72) test0432(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
// flaky "69) test0432(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0433");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertUTCToLocal((long) '4');
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        int int12 = dateTimeZone1.getOffsetFromLocal((-119903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 51L + "'", long9 == 51L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0434");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int22 = dateTimeZone0.getOffsetFromLocal((long) '4');
        boolean boolean24 = dateTimeZone0.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0436");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        java.lang.String str24 = dateTimeZone14.getNameKey((long) '4');
        int int26 = dateTimeZone14.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str29 = dateTimeZone14.getNameKey(1L);
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (long) (short) -1);
        long long33 = dateTimeZone14.convertUTCToLocal(52L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str37 = dateTimeZone36.toString();
        java.lang.String str39 = dateTimeZone36.getName((long) (short) 0);
        java.lang.String str41 = dateTimeZone36.getName(0L);
        java.lang.String str42 = dateTimeZone36.getID();
        java.lang.String str44 = dateTimeZone36.getNameKey((-59999L));
        java.lang.String str46 = dateTimeZone36.getName(22020000L);
        long long48 = dateTimeZone36.nextTransition(60001L);
        boolean boolean49 = dateTimeZone14.equals((java.lang.Object) dateTimeZone36);
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone14.getOffset(readableInstant50);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 51L + "'", long33 == 51L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:01" + "'", str41, "+00:01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:01" + "'", str42, "+00:01");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:01" + "'", str46, "+00:01");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 60001L + "'", long48 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0437");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        boolean boolean8 = dateTimeZone2.isFixed();
        long long12 = dateTimeZone2.convertLocalToUTC((-119903L), false, (long) (-3600000));
        java.lang.Class<?> wildcardClass13 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-179903L) + "'", long12 == (-179903L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0438");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        boolean boolean10 = dateTimeZone0.isFixed();
        boolean boolean11 = dateTimeZone0.isFixed();
        long long15 = dateTimeZone0.convertLocalToUTC((-179935L), true, 28860010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-179934L) + "'", long15 == (-179934L));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(4200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0440");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long7 = dateTimeZone1.previousTransition((-59903L));
        java.lang.String str8 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59903L) + "'", long7 == (-59903L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0441");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long7 = dateTimeZone1.previousTransition((-59903L));
        int int9 = dateTimeZone1.getOffset((-59903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59903L) + "'", long7 == (-59903L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0442");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (byte) 0);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) (byte) -1, locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-59990L), locale12);
        int int15 = dateTimeZone1.getOffset((-179900L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-1080032L));
        long long19 = dateTimeZone1.convertUTCToLocal(54L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 53L + "'", long19 == 53L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0443");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset(52L);
        java.lang.String str13 = dateTimeZone0.getNameKey((-179900L));
        java.lang.String str15 = dateTimeZone0.getNameKey(6720002L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0444");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long14 = dateTimeZone0.adjustOffset(100L, false);
        long long16 = dateTimeZone0.nextTransition((long) 25200000);
        java.lang.Class<?> wildcardClass17 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str4 = dateTimeZone0.getName((-59999L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str7 = dateTimeZone6.getID();
        int int9 = dateTimeZone6.getOffsetFromLocal(60010L);
        java.lang.String str11 = dateTimeZone6.getNameKey(5639968L);
        boolean boolean12 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0446");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(0L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0447");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getName(60001L);
        java.lang.String str6 = dateTimeZone1.getNameKey((-2L));
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+08:00" + "'", str4, "+08:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0448");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 10, true);
        int int7 = dateTimeZone2.getOffset(28740010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0449");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str13 = dateTimeZone2.toString();
        long long15 = dateTimeZone2.previousTransition(32400001L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32400001L + "'", long15 == 32400001L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0450");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(5520000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0451");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(5699968L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0452");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        long long14 = dateTimeZone2.convertLocalToUTC(28800010L, false, (long) (short) 1);
        java.lang.String str15 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28740010L + "'", long14 == 28740010L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0453");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        boolean boolean10 = dateTimeZone7.isStandardOffset((-28919900L));
        boolean boolean11 = dateTimeZone2.equals((java.lang.Object) boolean10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getShortName((long) 'a', locale13);
        java.lang.String str16 = dateTimeZone2.getName(21599999L);
        java.lang.Class<?> wildcardClass17 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky "73) test0453(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0454");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.lang.String str9 = dateTimeZone0.getNameKey(5699968L);
        long long11 = dateTimeZone0.convertUTCToLocal((-120000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "74) test0454(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "70) test0454(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "61) test0454(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "51) test0454(JA_051_Regression0)":         org.junit.Assert.assertNull(str9);
// flaky "38) test0454(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-120001L) + "'", long11 == (-120001L));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0455");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0456");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        java.lang.String str9 = dateTimeZone7.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        int int17 = dateTimeZone10.getOffsetFromLocal(1L);
        java.lang.String str19 = dateTimeZone10.getName((long) 25200000);
        int int21 = dateTimeZone10.getOffsetFromLocal((long) (short) -1);
        java.lang.String str23 = dateTimeZone10.getShortName((long) (byte) -1);
        long long25 = dateTimeZone10.previousTransition((-59999L));
        boolean boolean27 = dateTimeZone10.isStandardOffset(28800000L);
        boolean boolean28 = dateTimeZone7.equals((java.lang.Object) 28800000L);
        java.lang.String str29 = dateTimeZone7.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "75) test0456(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "71) test0456(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "62) test0456(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "52) test0456(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
// flaky "39) test0456(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
// flaky "22) test0456(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-59999L) + "'", long25 == (-59999L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0457");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((long) '4', locale13);
        boolean boolean15 = dateTimeZone6.isFixed();
        java.lang.String str17 = dateTimeZone6.getShortName((-60001L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str19 = dateTimeZone18.toString();
        boolean boolean20 = dateTimeZone6.equals((java.lang.Object) dateTimeZone18);
        long long23 = dateTimeZone6.adjustOffset(100L, true);
        boolean boolean24 = dateTimeZone2.equals((java.lang.Object) long23);
        boolean boolean26 = dateTimeZone2.isStandardOffset(120000L);
        long long29 = dateTimeZone2.adjustOffset((long) 0, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky "76) test0457(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "72) test0457(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "63) test0457(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "53) test0457(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "40) test0457(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0458");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getNameKey(1L);
        long long18 = dateTimeZone0.adjustOffset((long) (short) 0, true);
        int int20 = dateTimeZone0.getStandardOffset((-59900L));
        java.lang.String str22 = dateTimeZone0.getName((long) 28800000);
        long long24 = dateTimeZone0.previousTransition(0L);
        long long27 = dateTimeZone0.adjustOffset((-28739964L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "77) test0458(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "73) test0458(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "64) test0458(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "54) test0458(JA_051_Regression0)":         org.junit.Assert.assertNull(str10);
// flaky "41) test0458(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "23) test0458(JA_051_Regression0)":         org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky "16) test0458(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky "11) test0458(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-28739964L) + "'", long27 == (-28739964L));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(0L, locale6);
        int int9 = dateTimeZone2.getOffsetFromLocal(1L);
        java.lang.String str11 = dateTimeZone2.getName((long) 25200000);
        int int13 = dateTimeZone2.getOffsetFromLocal((long) (short) -1);
        java.lang.String str15 = dateTimeZone2.getShortName((long) (byte) -1);
        java.lang.String str16 = dateTimeZone2.getID();
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone2.isLocalDateTimeGap(localDateTime17);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) '#');
        java.lang.String str21 = dateTimeZone2.toString();
        int int23 = dateTimeZone2.getOffsetFromLocal(21599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "78) test0459(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
// flaky "74) test0459(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
// flaky "65) test0459(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky "55) test0459(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "42) test0459(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "24) test0459(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "17) test0459(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "12) test0459(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36L + "'", long20 == 36L);
// flaky "10) test0459(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
// flaky "7) test0459(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0460");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        java.lang.String str12 = dateTimeZone0.toString();
        java.lang.String str13 = dateTimeZone0.toString();
        boolean boolean15 = dateTimeZone0.isStandardOffset((long) 52);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "79) test0460(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "75) test0460(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "66) test0460(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "56) test0460(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "43) test0460(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "25) test0460(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0461");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.String str7 = dateTimeZone2.getName(10L);
        java.lang.String str8 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0462");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0463");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        java.util.TimeZone timeZone20 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getNameKey((long) (-3600000));
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone23, (long) (byte) -1);
        long long31 = dateTimeZone10.convertLocalToUTC((-119969L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "80) test0463(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "76) test0463(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "67) test0463(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "57) test0463(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "44) test0463(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "26) test0463(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "18) test0463(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertNull(str26);
// flaky "13) test0463(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-60002L) + "'", long28 == (-60002L));
// flaky "11) test0463(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-119968L) + "'", long31 == (-119968L));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0464");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str9 = dateTimeZone1.getShortName((-28799968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0465");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean11 = dateTimeZone2.isStandardOffset(32400000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0466");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        int int9 = dateTimeZone2.getStandardOffset((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int12 = dateTimeZone2.getOffset((long) 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0467");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-59990L));
        long long20 = dateTimeZone14.previousTransition(3540097L);
        long long22 = dateTimeZone14.previousTransition((-32219968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59990L) + "'", long18 == (-59990L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3540097L + "'", long20 == 3540097L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-32219968L) + "'", long22 == (-32219968L));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0468");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        long long15 = dateTimeZone6.previousTransition(0L);
        java.lang.String str17 = dateTimeZone6.getShortName(31L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0469");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getNameKey(1L);
        long long18 = dateTimeZone0.adjustOffset((long) (short) 0, true);
        int int20 = dateTimeZone0.getStandardOffset((-59900L));
        java.lang.String str22 = dateTimeZone0.getName((long) 28800000);
        long long24 = dateTimeZone0.previousTransition(0L);
        java.lang.String str25 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0470");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str7 = dateTimeZone2.getShortName(28800010L);
        long long10 = dateTimeZone2.adjustOffset((-22L), false);
        int int12 = dateTimeZone2.getOffset((-1080032L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-22L) + "'", long10 == (-22L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0471");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName((-6719900L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0472");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone2.getID();
        boolean boolean17 = dateTimeZone2.isFixed();
        int int19 = dateTimeZone2.getOffsetFromLocal((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 28800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0474");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str11 = dateTimeZone0.getID();
        boolean boolean13 = dateTimeZone0.isStandardOffset(60052L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone17.isLocalDateTimeGap(localDateTime19);
        long long24 = dateTimeZone17.convertLocalToUTC((long) (byte) 0, true, 0L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone17.getOffset(readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long30 = dateTimeZone17.getMillisKeepLocal(dateTimeZone28, (long) 25200000);
        long long32 = dateTimeZone0.getMillisKeepLocal(dateTimeZone28, (-28799968L));
        int int34 = dateTimeZone28.getOffsetFromLocal(60001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60000L) + "'", long24 == (-60000L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 21660000L + "'", long30 == 21660000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-32339968L) + "'", long32 == (-32339968L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3600000 + "'", int34 == 3600000);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0475");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        long long14 = dateTimeZone2.convertLocalToUTC((-28919900L), true);
        long long17 = dateTimeZone2.convertLocalToUTC(6779999L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-28979900L) + "'", long14 == (-28979900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 6719999L + "'", long17 == 6719999L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0476");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str11 = dateTimeZone0.getID();
        boolean boolean13 = dateTimeZone0.isStandardOffset(60052L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone14.getName((long) '4', locale21);
        boolean boolean23 = dateTimeZone14.isFixed();
        java.lang.String str25 = dateTimeZone14.getShortName((-60001L));
        int int27 = dateTimeZone14.getOffset((-59965L));
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) (-59965L));
        java.lang.String str30 = dateTimeZone0.getName((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str32 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str36 = dateTimeZone35.toString();
        java.lang.String str38 = dateTimeZone35.getNameKey(100L);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str41 = dateTimeZone40.getID();
        boolean boolean43 = dateTimeZone40.isStandardOffset((-28919900L));
        boolean boolean44 = dateTimeZone35.equals((java.lang.Object) boolean43);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone35.getShortName((long) 'a', locale46);
        boolean boolean49 = dateTimeZone35.isStandardOffset((-59968L));
        int int51 = dateTimeZone35.getOffset((-28799948L));
        boolean boolean52 = dateTimeZone35.isFixed();
        long long54 = dateTimeZone0.getMillisKeepLocal(dateTimeZone35, 6719999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:01" + "'", str41, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:01" + "'", str47, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 60000 + "'", int51 == 60000);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 6719999L + "'", long54 == 6719999L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0477");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0478");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        java.lang.String str16 = dateTimeZone2.getNameKey((-59999L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str23 = dateTimeZone22.toString();
        long long26 = dateTimeZone22.convertLocalToUTC((long) (-1), false);
        long long28 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        boolean boolean32 = dateTimeZone19.equals((java.lang.Object) dateTimeZone31);
        boolean boolean33 = dateTimeZone2.equals((java.lang.Object) boolean32);
        long long36 = dateTimeZone2.adjustOffset(5640001L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-60001L) + "'", long26 == (-60001L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 22020000L + "'", long28 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5640001L + "'", long36 == 5640001L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0479");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str14 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName(1L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone15.getShortName(0L, locale19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone15.getName((long) '4', locale22);
        java.lang.String str25 = dateTimeZone15.getNameKey((long) '4');
        int int27 = dateTimeZone15.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.lang.String str29 = dateTimeZone15.getID();
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone15.getShortName((-59965L), locale31);
        boolean boolean33 = dateTimeZone0.equals((java.lang.Object) dateTimeZone15);
        java.util.TimeZone timeZone34 = dateTimeZone15.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0480");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getShortName(1L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName(0L, locale14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) (short) 10);
        int int21 = dateTimeZone0.getOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone0.getOffset(readableInstant22);
        long long26 = dateTimeZone0.adjustOffset((-10320000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-10320000L) + "'", long26 == (-10320000L));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(5700000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0483");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) '#');
        java.lang.String str5 = dateTimeZone1.getName((long) (byte) 0);
        java.lang.String str7 = dateTimeZone1.getShortName((long) 28800000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-3599902L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName(6719999L, locale12);
        java.lang.String str15 = dateTimeZone1.getName((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60035L + "'", long3 == 60035L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0484");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0485");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str3 = dateTimeZone0.getID();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(60001L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0486");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        long long14 = dateTimeZone2.convertLocalToUTC((-28919900L), true);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getShortName(32400001L, locale16);
        boolean boolean18 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-28979900L) + "'", long14 == (-28979900L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0487");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        long long8 = dateTimeZone2.nextTransition(60034L);
        boolean boolean10 = dateTimeZone2.isStandardOffset(98L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName(60035L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60034L + "'", long8 == 60034L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0488");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        java.lang.String str11 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0489");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        long long9 = dateTimeZone2.convertLocalToUTC((long) (short) 10, true, (long) (byte) 0);
        long long12 = dateTimeZone2.adjustOffset(5639967L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59990L) + "'", long9 == (-59990L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5639967L + "'", long12 == 5639967L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0490");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str13 = dateTimeZone2.toString();
        long long16 = dateTimeZone2.convertLocalToUTC((-28740000L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-28800000L) + "'", long16 == (-28800000L));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0491");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.nextTransition((-59999L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59999L) + "'", long9 == (-59999L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0492");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.previousTransition((-3659999L));
        java.lang.String str6 = dateTimeZone1.getNameKey(28740010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3659999L) + "'", long4 == (-3659999L));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0493");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        long long14 = dateTimeZone2.nextTransition(60001L);
        long long16 = dateTimeZone2.convertUTCToLocal(0L);
        int int18 = dateTimeZone2.getOffsetFromLocal(52L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long23 = dateTimeZone21.convertUTCToLocal(1L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone21.getShortName((long) (byte) 10, locale25);
        int int28 = dateTimeZone21.getStandardOffset((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.lang.String str31 = dateTimeZone21.getShortName((-3660000L));
        long long33 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, (-28859900L));
        int int35 = dateTimeZone21.getStandardOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60001L + "'", long14 == 60001L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-28799900L) + "'", long33 == (-28799900L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0494");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        int int16 = dateTimeZone2.getStandardOffset((long) 1);
        long long18 = dateTimeZone2.convertUTCToLocal((long) '4');
        long long21 = dateTimeZone2.adjustOffset(53L, false);
        long long23 = dateTimeZone2.previousTransition(3600031L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59999L) + "'", long14 == (-59999L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 53L + "'", long21 == 53L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3600031L + "'", long23 == 3600031L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4200000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0496");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        boolean boolean11 = dateTimeZone1.isStandardOffset((-59903L));
        boolean boolean12 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "81) test0496(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
// flaky "77) test0496(JA_051_Regression0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
// flaky "68) test0496(JA_051_Regression0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "58) test0496(JA_051_Regression0)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0497");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        long long6 = dateTimeZone0.adjustOffset((-28859900L), true);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-28859900L) + "'", long6 == (-28859900L));
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0498");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        java.lang.String str10 = dateTimeZone0.toString();
        long long13 = dateTimeZone0.convertLocalToUTC((-28799965L), true);
        boolean boolean14 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-28799965L) + "'", long13 == (-28799965L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0499");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str14 = dateTimeZone0.getID();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone0.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.TimeZone timeZone18 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_051_Regression0.test0500");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        java.lang.String str9 = dateTimeZone2.getName((long) 28800000);
        long long11 = dateTimeZone2.convertUTCToLocal((-59900L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getName((long) 60000, locale13);
        long long16 = dateTimeZone2.previousTransition((long) 60000);
        long long19 = dateTimeZone2.adjustOffset((-59948L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59900L) + "'", long11 == (-59900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59948L) + "'", long19 == (-59948L));
    }
}
