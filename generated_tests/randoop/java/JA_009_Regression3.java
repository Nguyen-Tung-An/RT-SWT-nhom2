import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_009_Regression3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1501");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1502");
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
        long long18 = dateTimeZone0.convertLocalToUTC((-59903L), true);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getShortName((-59999L), locale20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long26 = dateTimeZone24.convertUTCToLocal(1L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone24.getShortName((long) (byte) 10, locale28);
        long long32 = dateTimeZone24.adjustOffset((-28799900L), false);
        java.lang.String str34 = dateTimeZone24.getShortName(0L);
        boolean boolean35 = dateTimeZone24.isFixed();
        boolean boolean36 = dateTimeZone0.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-119903L) + "'", long18 == (-119903L));
// flaky "1) test1502(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-28799900L) + "'", long32 == (-28799900L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1503");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = false; // flaky "2) test1503(JA_009_Regression3)": dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone1.getName(5639969L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "2) test1503(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "2) test1503(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1504");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str16 = dateTimeZone14.getShortName(1L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getShortName(0L, locale18);
        int int21 = dateTimeZone14.getOffsetFromLocal(1L);
        java.lang.String str23 = dateTimeZone14.getName((long) 25200000);
        int int25 = dateTimeZone14.getOffsetFromLocal((long) (short) -1);
        java.lang.String str27 = dateTimeZone14.getShortName((long) (byte) -1);
        long long29 = dateTimeZone14.previousTransition((-59999L));
        java.util.TimeZone timeZone30 = dateTimeZone14.toTimeZone();
        long long33 = dateTimeZone14.convertLocalToUTC((long) (short) -1, true);
        java.lang.String str35 = dateTimeZone14.getShortName((long) 1);
        long long38 = dateTimeZone14.convertLocalToUTC((long) 28800000, true);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-28979901L));
        java.lang.String str42 = dateTimeZone14.getNameKey(3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "3) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "3) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "3) test1504(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "2) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
// flaky "2) test1504(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59948L) + "'", long13 == (-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "2) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
// flaky "2) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
// flaky "2) test1504(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
// flaky "2) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-59999L) + "'", long29 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone30);
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:01");
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-60001L) + "'", long33 == (-60001L));
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 28740000L + "'", long38 == 28740000L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-28979901L) + "'", long40 == (-28979901L));
// flaky "1) test1504(JA_009_Regression3)":         org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1505");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        long long12 = dateTimeZone2.nextTransition((-59965L));
        long long14 = dateTimeZone2.convertUTCToLocal((long) (short) 10);
        java.lang.String str16 = dateTimeZone2.getNameKey((-28799901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-59965L) + "'", long12 == (-59965L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60010L + "'", long14 == 60010L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1506");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-28799900L), true, (long) '#');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) 28800000, locale10);
        long long13 = dateTimeZone1.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = false; // flaky "4) test1506(JA_009_Regression3)": dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long18 = dateTimeZone1.adjustOffset((-59965L), true);
        long long20 = dateTimeZone1.previousTransition((-119968L));
        java.lang.String str21 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "4) test1506(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "4) test1506(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
// flaky "3) test1506(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
// flaky "3) test1506(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
// flaky "3) test1506(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-119968L) + "'", long20 == (-119968L));
// flaky "3) test1506(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1507");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-59990L), locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        int int13 = dateTimeZone1.getStandardOffset((-179969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "5) test1507(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
// flaky "5) test1507(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "5) test1507(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
// flaky "4) test1507(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
// flaky "4) test1507(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1508");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int26 = dateTimeZone0.getOffset((-28799932L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "6) test1508(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "6) test1508(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "6) test1508(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "5) test1508(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
// flaky "5) test1508(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "4) test1508(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
// flaky "4) test1508(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky "3) test1508(JA_009_Regression3)":         org.junit.Assert.assertNull(str23);
// flaky "3) test1508(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1509");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        java.lang.String str13 = dateTimeZone0.toString();
        int int15 = dateTimeZone0.getStandardOffset((-59900L));
        java.lang.String str17 = dateTimeZone0.getNameKey(25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "7) test1509(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "7) test1509(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "7) test1509(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "6) test1509(JA_009_Regression3)":         org.junit.Assert.assertNull(str10);
// flaky "6) test1509(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
// flaky "5) test1509(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
// flaky "5) test1509(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
// flaky "4) test1509(JA_009_Regression3)":         org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1510");
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
        long long21 = dateTimeZone10.convertUTCToLocal(28800010L);
        int int23 = dateTimeZone10.getStandardOffset((-60022L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        boolean boolean26 = dateTimeZone10.equals((java.lang.Object) dateTimeZone25);
        java.lang.String str27 = dateTimeZone25.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "8) test1510(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "8) test1510(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "8) test1510(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "7) test1510(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
// flaky "7) test1510(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "6) test1510(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
// flaky "6) test1510(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28860010L + "'", long21 == 28860010L);
// flaky "5) test1510(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1512");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getName((-28859932L));
        java.lang.String str17 = dateTimeZone0.getName(98L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "9) test1512(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "9) test1512(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "9) test1512(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "8) test1512(JA_009_Regression3)":         org.junit.Assert.assertNull(str10);
// flaky "8) test1512(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
// flaky "7) test1512(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "7) test1512(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        int int3 = dateTimeZone1.getOffsetFromLocal((-32399968L));
        java.lang.String str5 = dateTimeZone1.getNameKey(5640000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1514");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getName(25200010L, locale20);
        long long23 = dateTimeZone0.nextTransition((-179934L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "10) test1514(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "10) test1514(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "10) test1514(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "9) test1514(JA_009_Regression3)":         org.junit.Assert.assertNull(str10);
// flaky "9) test1514(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
// flaky "8) test1514(JA_009_Regression3)":         org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky "8) test1514(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
// flaky "6) test1514(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-179934L) + "'", long23 == (-179934L));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1515");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        java.lang.String str9 = dateTimeZone0.getNameKey((-60022L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "11) test1515(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "11) test1515(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "11) test1515(JA_009_Regression3)":         org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1516");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long11 = dateTimeZone0.previousTransition((-1L));
        long long13 = dateTimeZone0.previousTransition((-60000L));
        java.lang.String str14 = dateTimeZone0.getID();
        long long17 = dateTimeZone0.adjustOffset(21599999L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "12) test1516(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "12) test1516(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "12) test1516(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "10) test1516(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
// flaky "10) test1516(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
// flaky "9) test1516(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60000L) + "'", long13 == (-60000L));
// flaky "9) test1516(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21599999L + "'", long17 == 21599999L);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1517");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((long) (-1), locale7);
        java.lang.String str9 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1518");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) "Asia/Ho_Chi_Minh");
        long long6 = dateTimeZone2.convertUTCToLocal((-1020032L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1020032L) + "'", long6 == (-1020032L));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(32400000L, locale5);
        long long8 = dateTimeZone1.nextTransition(5640000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5640000L + "'", long8 == 5640000L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1520");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        boolean boolean5 = dateTimeZone1.isStandardOffset(5700001L);
        long long8 = dateTimeZone1.convertLocalToUTC((-59948L), false);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59948L) + "'", long8 == (-59948L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1521");
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
        java.lang.String str19 = dateTimeZone0.toString();
        long long21 = dateTimeZone0.convertUTCToLocal(60000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "13) test1521(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "13) test1521(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "13) test1521(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "11) test1521(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
// flaky "11) test1521(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
// flaky "10) test1521(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "10) test1521(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59999L) + "'", long16 == (-59999L));
// flaky "7) test1521(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "4) test1521(JA_009_Regression3)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:01");
// flaky "2) test1521(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
// flaky "2) test1521(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 120000L + "'", long21 == 120000L);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) 10);
        long long5 = dateTimeZone1.previousTransition(0L);
        int int7 = dateTimeZone1.getOffset(31920000L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getShortName(1L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone8.getShortName(0L, locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone8.getName((long) '4', locale15);
        java.lang.String str18 = dateTimeZone8.getNameKey((long) '4');
        int int20 = dateTimeZone8.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.lang.String str23 = dateTimeZone8.getNameKey(1L);
        long long26 = dateTimeZone8.adjustOffset((long) (short) 0, true);
        long long28 = dateTimeZone8.nextTransition(60000L);
        boolean boolean29 = dateTimeZone8.isFixed();
        long long31 = dateTimeZone8.convertUTCToLocal(59905L);
        long long33 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "14) test1522(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
// flaky "14) test1522(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
// flaky "14) test1522(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
// flaky "12) test1522(JA_009_Regression3)":         org.junit.Assert.assertNull(str18);
// flaky "12) test1522(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
// flaky "11) test1522(JA_009_Regression3)":         org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky "11) test1522(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60000L + "'", long28 == 60000L);
// flaky "8) test1522(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "5) test1522(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 119905L + "'", long31 == 119905L);
// flaky "3) test1522(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 7140100L + "'", long33 == 7140100L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1523");
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
        long long18 = dateTimeZone2.previousTransition(42L);
        int int20 = dateTimeZone2.getStandardOffset(21960000L);
        long long23 = dateTimeZone2.adjustOffset(60009L, true);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 42L + "'", long18 == 42L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60009L + "'", long23 == 60009L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1524");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone0.getName((-60001L), locale24);
        java.lang.String str26 = dateTimeZone0.getID();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone0.getName((-119967L), locale28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "15) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "15) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "15) test1524(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "13) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
// flaky "13) test1524(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
// flaky "12) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
// flaky "12) test1524(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone16);
// flaky "9) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:01");
// flaky "6) test1524(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-60001L) + "'", long19 == (-60001L));
// flaky "4) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
// flaky "3) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
// flaky "2) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
// flaky "2) test1524(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1525");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 60000);
        java.lang.String str5 = dateTimeZone1.getShortName((-28799968L));
        java.lang.String str7 = dateTimeZone1.getShortName(5700001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.032" + "'", str7, "+00:00:00.032");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1526");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-28799900L), true, (long) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "16) test1526(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "16) test1526(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
// flaky "16) test1526(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1527");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone12.toString();
        boolean boolean14 = dateTimeZone0.equals((java.lang.Object) dateTimeZone12);
        long long17 = dateTimeZone0.adjustOffset(100L, true);
        long long21 = dateTimeZone0.convertLocalToUTC(53L, true, (long) 25200000);
        int int23 = dateTimeZone0.getStandardOffset(1860000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "17) test1527(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "17) test1527(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "17) test1527(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "14) test1527(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "14) test1527(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "13) test1527(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
// flaky "13) test1527(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-59947L) + "'", long21 == (-59947L));
// flaky "10) test1527(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1528");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        java.lang.String str8 = dateTimeZone7.getID();
        int int10 = dateTimeZone7.getOffset((-3719902L));
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 9360000L);
        java.lang.String str14 = dateTimeZone7.getShortName((-60002L));
        long long16 = dateTimeZone7.previousTransition((-6779900L));
        java.lang.String str18 = dateTimeZone7.getName(28799999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:10" + "'", str8, "+01:10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4200000 + "'", int10 == 4200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5159999L + "'", long12 == 5159999L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:10" + "'", str14, "+01:10");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-6779900L) + "'", long16 == (-6779900L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:10" + "'", str18, "+01:10");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1529");
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
        boolean boolean18 = false; // flaky "18) test1529(JA_009_Regression3)": dateTimeZone2.isLocalDateTimeGap(localDateTime17);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) '#');
        int int22 = dateTimeZone1.getOffset((-3599999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "18) test1529(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "18) test1529(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
// flaky "15) test1529(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
// flaky "15) test1529(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
// flaky "14) test1529(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
// flaky "14) test1529(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "11) test1529(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "7) test1529(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-59965L) + "'", long20 == (-59965L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1530");
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
        long long25 = dateTimeZone0.adjustOffset(10L, false);
        java.lang.String str26 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "19) test1530(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "19) test1530(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "19) test1530(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "16) test1530(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
// flaky "16) test1530(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "15) test1530(JA_009_Regression3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "15) test1530(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
// flaky "12) test1530(JA_009_Regression3)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1531");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str7 = dateTimeZone2.getName(28800000L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str11 = dateTimeZone10.toString();
        long long14 = dateTimeZone10.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str16 = dateTimeZone10.getID();
        long long19 = dateTimeZone10.convertLocalToUTC((long) 'a', false);
        boolean boolean21 = dateTimeZone10.isStandardOffset((long) 100);
        boolean boolean23 = dateTimeZone10.isStandardOffset((long) (short) 0);
        java.lang.String str24 = dateTimeZone10.getID();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.getID();
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone26.isLocalDateTimeGap(localDateTime28);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone26.getName(10L, locale31);
        long long35 = dateTimeZone26.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str39 = dateTimeZone38.toString();
        long long42 = dateTimeZone38.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        long long45 = dateTimeZone38.convertUTCToLocal(0L);
        java.lang.String str47 = dateTimeZone38.getShortName((long) (short) 100);
        long long49 = dateTimeZone26.getMillisKeepLocal(dateTimeZone38, (long) 60000);
        boolean boolean50 = dateTimeZone10.equals((java.lang.Object) dateTimeZone38);
        int int52 = dateTimeZone38.getOffset(52L);
        java.util.TimeZone timeZone53 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        long long56 = dateTimeZone2.getMillisKeepLocal(dateTimeZone38, 3540097L);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        java.lang.String str60 = dateTimeZone58.getShortName((-1L));
        long long64 = dateTimeZone58.convertLocalToUTC(3540097L, false, (long) (byte) 100);
        long long66 = dateTimeZone58.nextTransition((-59947L));
        long long68 = dateTimeZone2.getMillisKeepLocal(dateTimeZone58, 31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-60001L) + "'", long14 == (-60001L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-60001L) + "'", long35 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-60001L) + "'", long42 == (-60001L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 60000L + "'", long45 == 60000L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:01" + "'", str47, "+00:01");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 60000L + "'", long49 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 60000 + "'", int52 == 60000);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3540097L + "'", long56 == 3540097L);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:01" + "'", str60, "+00:01");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 3480097L + "'", long64 == 3480097L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-59947L) + "'", long66 == (-59947L));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 31920000L + "'", long68 == 31920000L);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1532");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey((long) (-3600000));
        long long8 = dateTimeZone2.adjustOffset((-28919900L), true);
        int int10 = dateTimeZone2.getOffset((-3779902L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28919900L) + "'", long8 == (-28919900L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1533");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(60000L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone2.getOffset(readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int18 = dateTimeZone16.getOffsetFromLocal((long) 100);
        long long21 = dateTimeZone16.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone16.getShortName(1L, locale24);
        boolean boolean27 = dateTimeZone16.isStandardOffset(21539999L);
        boolean boolean28 = dateTimeZone2.equals((java.lang.Object) dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 53L + "'", long21 == 53L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1534");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) '#');
        java.lang.String str5 = dateTimeZone1.getName((long) (byte) 0);
        java.lang.String str7 = dateTimeZone1.getShortName((long) 28800000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getNameKey((-3599902L));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 34L + "'", long3 == 34L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1535");
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
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone10.isLocalDateTimeGap(localDateTime21);
        java.lang.String str24 = dateTimeZone10.getNameKey((-59970L));
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1536");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str14 = dateTimeZone2.getNameKey(22020000L);
        long long16 = dateTimeZone2.convertUTCToLocal((long) 0);
        java.lang.Class<?> wildcardClass17 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1537");
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
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone0.isLocalDateTimeGap(localDateTime17);
        long long21 = dateTimeZone0.convertLocalToUTC(28740132L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28740133L + "'", long21 == 28740133L);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1538");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        long long6 = dateTimeZone2.convertUTCToLocal(1L);
        int int8 = dateTimeZone2.getOffset(36060000L);
        java.lang.String str9 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60001L + "'", long6 == 60001L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1539");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (byte) 0);
        int int9 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getNameKey(22080000L);
        long long13 = dateTimeZone1.nextTransition((-3180000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3180000L) + "'", long13 == (-3180000L));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1540");
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
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str36 = dateTimeZone34.getShortName(1L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone34.getName((long) 0, locale38);
        boolean boolean41 = dateTimeZone34.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone34.getOffset(readableInstant42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str46 = dateTimeZone44.getShortName(1L);
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone44.getShortName(0L, locale48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone44.getOffset(readableInstant50);
        long long53 = dateTimeZone34.getMillisKeepLocal(dateTimeZone44, (long) (short) 10);
        int int55 = dateTimeZone34.getOffset((long) (-1));
        long long57 = dateTimeZone34.previousTransition((-119968L));
        long long59 = dateTimeZone15.getMillisKeepLocal(dateTimeZone34, 100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-00:00:00.001" + "'", str39, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-00:00:00.001" + "'", str46, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-00:00:00.001" + "'", str49, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L + "'", long53 == 10L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-119968L) + "'", long57 == (-119968L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1541");
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
        java.lang.String str17 = dateTimeZone1.getNameKey(5639968L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1542");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        boolean boolean10 = dateTimeZone0.isFixed();
        boolean boolean11 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1543");
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
        java.lang.String str21 = dateTimeZone14.getID();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1545");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.lang.String str4 = dateTimeZone0.getNameKey((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) (byte) 1);
        java.lang.String str9 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1546");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        boolean boolean13 = dateTimeZone0.isStandardOffset(32460052L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1547");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset(60052L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(53L, locale7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-3540001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1549");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC(3600000L, false);
        java.lang.String str13 = dateTimeZone2.getName((long) '4');
        java.lang.String str15 = dateTimeZone2.getShortName((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str19 = dateTimeZone17.getNameKey(10L);
        java.lang.String str20 = dateTimeZone17.getID();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str23 = dateTimeZone21.getShortName(1L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone21.getName((long) 0, locale25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone21.getOffset(readableInstant27);
        int int30 = dateTimeZone21.getOffsetFromLocal(0L);
        boolean boolean31 = dateTimeZone21.isFixed();
        int int33 = dateTimeZone21.getStandardOffset(22020000L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone21.getName((long) (byte) 10, locale35);
        long long39 = dateTimeZone21.convertLocalToUTC((-59903L), true);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone21.getShortName((-59999L), locale41);
        java.lang.String str43 = dateTimeZone21.getID();
        boolean boolean45 = dateTimeZone21.isStandardOffset((-6719900L));
        long long47 = dateTimeZone21.convertUTCToLocal(28740000L);
        long long50 = dateTimeZone21.convertLocalToUTC(32400001L, true);
        long long52 = dateTimeZone21.previousTransition((-28799969L));
        long long54 = dateTimeZone17.getMillisKeepLocal(dateTimeZone21, 36120000L);
        long long56 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, (-60002L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.001" + "'", str20, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-00:00:00.001" + "'", str36, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-59902L) + "'", long39 == (-59902L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-00:00:00.001" + "'", str42, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-00:00:00.001" + "'", str43, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 28739999L + "'", long47 == 28739999L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32400002L + "'", long50 == 32400002L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-28799969L) + "'", long52 == (-28799969L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 36120002L + "'", long54 == 36120002L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-60003L) + "'", long56 == (-60003L));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1550");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) "Asia/Ho_Chi_Minh");
        int int6 = dateTimeZone2.getStandardOffset((-3659902L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1551");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(0L);
        boolean boolean11 = dateTimeZone2.isStandardOffset((-22L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone2.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1552");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        boolean boolean5 = dateTimeZone1.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((-119967L), locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getShortName(1L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getName((long) 0, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone9.getOffset(readableInstant15);
        long long18 = dateTimeZone9.previousTransition((-60001L));
        long long20 = dateTimeZone9.convertUTCToLocal((long) (byte) -1);
        java.lang.Class<?> wildcardClass21 = dateTimeZone9.getClass();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-60001L) + "'", long18 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 59999L + "'", long20 == 59999L);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1553");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        long long6 = dateTimeZone1.nextTransition(52L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(21660000L, locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-28800000L), locale11);
        int int14 = dateTimeZone1.getStandardOffset(5520010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1554");
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
        long long18 = dateTimeZone2.previousTransition(42L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int22 = dateTimeZone20.getOffsetFromLocal((long) 100);
        java.lang.String str24 = dateTimeZone20.getName((-28799900L));
        long long26 = dateTimeZone20.previousTransition((-59903L));
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName(1L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone27.getShortName(0L, locale31);
        int int34 = dateTimeZone27.getOffsetFromLocal(1L);
        java.lang.String str36 = dateTimeZone27.getName((long) 25200000);
        int int38 = dateTimeZone27.getOffsetFromLocal((long) (short) -1);
        java.lang.String str40 = dateTimeZone27.getShortName((long) (byte) -1);
        long long42 = dateTimeZone27.previousTransition((-59999L));
        long long45 = dateTimeZone27.convertLocalToUTC((long) 32, true);
        boolean boolean46 = dateTimeZone20.equals((java.lang.Object) 32);
        boolean boolean48 = dateTimeZone20.equals((java.lang.Object) (short) -1);
        boolean boolean49 = dateTimeZone2.equals((java.lang.Object) boolean48);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 42L + "'", long18 == 42L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-59903L) + "'", long26 == (-59903L));
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60000 + "'", int34 == 60000);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60000 + "'", int38 == 60000);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:01" + "'", str40, "+00:01");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-59999L) + "'", long42 == (-59999L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-59968L) + "'", long45 == (-59968L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1555");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 28800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1556");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone4.toString();
        java.lang.String str9 = dateTimeZone4.getName((long) (byte) 10);
        boolean boolean10 = dateTimeZone4.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        int int16 = dateTimeZone13.getOffsetFromLocal((long) (byte) 100);
        int int18 = dateTimeZone13.getOffsetFromLocal(21960000L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone13.getOffset(readableInstant19);
        long long22 = dateTimeZone12.getMillisKeepLocal(dateTimeZone13, 28800001L);
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
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 28800001L + "'", long22 == 28800001L);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1557");
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
        int int24 = dateTimeZone0.getOffset((long) (short) 10);
        int int26 = dateTimeZone0.getOffset((long) 5520000);
        long long28 = dateTimeZone0.nextTransition(28800010L);
        boolean boolean29 = dateTimeZone0.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60000 + "'", int24 == 60000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28800010L + "'", long28 == 28800010L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1558");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1559");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60100L + "'", long3 == 60100L);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1560");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        long long11 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str12 = dateTimeZone0.getID();
        int int14 = dateTimeZone0.getStandardOffset((-35519900L));
        java.lang.String str16 = dateTimeZone0.getNameKey((-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59990L) + "'", long11 == (-59990L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1561");
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
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone0.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone0.getOffset(22020001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59999L) + "'", long16 == (-59999L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1562");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        java.lang.String str13 = dateTimeZone2.getShortName((long) 1);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getShortName((long) '#', locale15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone2.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1563");
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
        boolean boolean16 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        int int20 = dateTimeZone1.getOffset((-28919901L));
        java.lang.String str22 = dateTimeZone1.getShortName(32L);
        long long24 = dateTimeZone1.convertUTCToLocal((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3540000L) + "'", long24 == (-3540000L));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1564");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName(1L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getName((long) 0, locale9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone5.getOffset(readableInstant11);
        int int14 = dateTimeZone5.getOffsetFromLocal(0L);
        boolean boolean15 = dateTimeZone5.isFixed();
        int int17 = dateTimeZone5.getStandardOffset(22020000L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone5.getName((long) (byte) 10, locale19);
        long long23 = dateTimeZone5.convertLocalToUTC((-59903L), true);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone5.getShortName((-59999L), locale25);
        java.lang.String str27 = dateTimeZone5.getID();
        boolean boolean29 = dateTimeZone5.isStandardOffset((-6719900L));
        long long31 = dateTimeZone5.convertUTCToLocal(28740000L);
        long long34 = dateTimeZone5.convertLocalToUTC(32400001L, true);
        long long36 = dateTimeZone5.previousTransition((-28799969L));
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 36120000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-119903L) + "'", long23 == (-119903L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 28800000L + "'", long31 == 28800000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32340001L + "'", long34 == 32340001L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-28799969L) + "'", long36 == (-28799969L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 36060001L + "'", long38 == 36060001L);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1565");
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
        long long21 = dateTimeZone10.convertUTCToLocal(28800010L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        boolean boolean27 = dateTimeZone26.isFixed();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone26.getName(0L, locale29);
        long long32 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (-59990L));
        int int34 = dateTimeZone24.getOffset((-28800000L));
        long long36 = dateTimeZone10.getMillisKeepLocal(dateTimeZone24, (-32L));
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone24.getName(25200010L, locale38);
        long long42 = dateTimeZone24.convertLocalToUTC((-59948L), false);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28860010L + "'", long21 == 28860010L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-59990L) + "'", long32 == (-59990L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60000 + "'", int34 == 60000);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-32L) + "'", long36 == (-32L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-119948L) + "'", long42 == (-119948L));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1566");
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
        long long18 = dateTimeZone12.previousTransition((-28919900L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60100L + "'", long16 == 60100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-28919900L) + "'", long18 == (-28919900L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1567");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        java.lang.String str13 = dateTimeZone5.getName(5700032L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone5.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1568");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        long long6 = dateTimeZone2.convertUTCToLocal(1L);
        long long8 = dateTimeZone2.nextTransition((long) 28800000);
        long long10 = dateTimeZone2.previousTransition((-60002L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60001L + "'", long6 == 60001L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28800000L + "'", long8 == 28800000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60002L) + "'", long10 == (-60002L));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1569");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1570");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str13 = dateTimeZone11.getNameKey(0L);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) 0L);
        java.lang.String str16 = dateTimeZone2.getShortName(28800001L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone2.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1571");
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
        java.lang.String str29 = dateTimeZone10.getShortName((-179969L));
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1572");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getOffset(22080000L);
        int int11 = dateTimeZone1.getOffset(0L);
        int int13 = dateTimeZone1.getOffsetFromLocal(60036L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1573");
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
        long long21 = dateTimeZone10.convertUTCToLocal(28800010L);
        int int23 = dateTimeZone10.getStandardOffset((-60022L));
        int int25 = dateTimeZone10.getOffsetFromLocal(3600000L);
        long long27 = dateTimeZone10.nextTransition((-3600000L));
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28860010L + "'", long21 == 28860010L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3600000L) + "'", long27 == (-3600000L));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1574");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '#');
        int int4 = dateTimeZone2.getStandardOffset(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long7 = dateTimeZone2.previousTransition(31L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5700000 + "'", int4 == 5700000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 31L + "'", long7 == 31L);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1575");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getName((long) 0, locale9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        int int16 = dateTimeZone13.getOffset((-3719902L));
        long long18 = dateTimeZone7.getMillisKeepLocal(dateTimeZone13, 9360000L);
        java.lang.String str20 = dateTimeZone13.getShortName((-60002L));
        long long22 = dateTimeZone13.previousTransition((-6779900L));
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone13.getShortName((-120000L), locale24);
        long long27 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 5520000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:10" + "'", str14, "+01:10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4200000 + "'", int16 == 4200000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5159999L + "'", long18 == 5159999L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:10" + "'", str20, "+01:10");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-6779900L) + "'", long22 == (-6779900L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+01:10" + "'", str25, "+01:10");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1380000L + "'", long27 == 1380000L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        long long10 = dateTimeZone1.nextTransition(22020000L);
        long long13 = dateTimeZone1.adjustOffset((-28859900L), false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-28859900L) + "'", long13 == (-28859900L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3600000) + "'", int15 == (-3600000));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1577");
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
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str26 = dateTimeZone25.toString();
        long long29 = dateTimeZone25.convertLocalToUTC((long) (-1), false);
        java.lang.String str30 = dateTimeZone25.getID();
        long long32 = dateTimeZone25.nextTransition(100L);
        boolean boolean33 = dateTimeZone25.isFixed();
        int int35 = dateTimeZone25.getStandardOffset((long) (short) -1);
        long long38 = dateTimeZone25.convertLocalToUTC(100L, true);
        boolean boolean39 = dateTimeZone0.equals((java.lang.Object) true);
        java.lang.String str41 = dateTimeZone0.getNameKey(42L);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        long long48 = dateTimeZone45.adjustOffset(0L, false);
        java.lang.String str50 = dateTimeZone45.getNameKey((long) 0);
        java.util.TimeZone timeZone51 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        boolean boolean53 = dateTimeZone0.equals((java.lang.Object) timeZone51);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5640098L + "'", long22 == 5640098L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-60001L) + "'", long29 == (-60001L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-59900L) + "'", long38 == (-59900L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1578");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC(3600000L, false);
        java.lang.String str13 = dateTimeZone2.getName((long) '4');
        java.lang.String str15 = dateTimeZone2.getShortName((long) (byte) 100);
        boolean boolean16 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1579");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition((long) (byte) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName(0L, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone2.getOffset(readableInstant15);
        long long18 = dateTimeZone2.convertUTCToLocal(5760000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5820000L + "'", long18 == 5820000L);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1580");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1581");
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
        java.lang.String str24 = dateTimeZone0.getNameKey(5520010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1582");
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
        int int21 = dateTimeZone1.getOffset((-35519900L));
        int int23 = dateTimeZone1.getOffset((-25139900L));
        boolean boolean25 = dateTimeZone1.isStandardOffset(60003L);
        java.lang.String str27 = dateTimeZone1.getName((-7919968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3600000) + "'", int23 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-6719990L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1584");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName(1L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone26.getShortName(0L, locale30);
        int int33 = dateTimeZone26.getOffsetFromLocal(1L);
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone26, 60034L);
        java.lang.String str37 = dateTimeZone0.getNameKey((long) 100);
        java.lang.String str39 = dateTimeZone0.getName(5700001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60000L) + "'", long22 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5699968L + "'", long25 == 5699968L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60000 + "'", int33 == 60000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60034L + "'", long35 == 60034L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1585");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        long long15 = dateTimeZone0.convertUTCToLocal((long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getShortName(1L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone16.getShortName(0L, locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone16.getName((long) '4', locale23);
        java.lang.String str26 = dateTimeZone16.getNameKey((long) '4');
        int int28 = dateTimeZone16.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        java.lang.String str31 = dateTimeZone16.getNameKey(1L);
        long long33 = dateTimeZone16.previousTransition((-32399968L));
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone16, (-59970L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59948L) + "'", long13 == (-59948L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 28860000L + "'", long15 == 28860000L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60000 + "'", int28 == 60000);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-32399968L) + "'", long33 == (-32399968L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-59970L) + "'", long35 == (-59970L));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1586");
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
        boolean boolean18 = dateTimeZone0.isStandardOffset((-59947L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1587");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC(3600000L, false);
        java.lang.String str13 = dateTimeZone2.getName((long) '4');
        java.lang.String str15 = dateTimeZone2.getNameKey(3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1588");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        int int13 = dateTimeZone0.getOffset((-59965L));
        int int15 = dateTimeZone0.getStandardOffset(28799999L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long21 = dateTimeZone17.convertLocalToUTC((-3599902L), false, 0L);
        java.lang.String str23 = dateTimeZone17.getNameKey((long) 25200000);
        boolean boolean24 = dateTimeZone17.isFixed();
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone17, 20L);
        boolean boolean27 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-39599902L) + "'", long21 == (-39599902L));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-35939980L) + "'", long26 == (-35939980L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1589");
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
        long long17 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone0.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60097L + "'", long17 == 60097L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1590");
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
        long long47 = dateTimeZone30.adjustOffset(10L, false);
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
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1591");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName(1L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone26.getShortName(0L, locale30);
        int int33 = dateTimeZone26.getOffsetFromLocal(1L);
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone26, 60034L);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone26.getShortName(119905L, locale37);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60000L) + "'", long22 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5699968L + "'", long25 == 5699968L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60000 + "'", int33 == 60000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60034L + "'", long35 == 60034L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:01" + "'", str38, "+00:01");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1592");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str4 = dateTimeZone2.getShortName(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(0L, locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getName((long) '4', locale9);
        boolean boolean12 = dateTimeZone2.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone2.isLocalDateTimeGap(localDateTime13);
        boolean boolean15 = dateTimeZone2.isFixed();
        long long17 = dateTimeZone2.previousTransition(100L);
        int int19 = dateTimeZone2.getStandardOffset((-28799969L));
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) dateTimeZone2);
        int int22 = dateTimeZone1.getOffset((-3599902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3600000) + "'", int22 == (-3600000));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1593");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str3 = dateTimeZone1.getNameKey(52L);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) (byte) 100);
        long long10 = dateTimeZone4.adjustOffset((-28859900L), true);
        java.util.TimeZone timeZone11 = dateTimeZone4.toTimeZone();
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, 3540097L);
        long long16 = dateTimeZone1.convertLocalToUTC(5400000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28859900L) + "'", long10 == (-28859900L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540097L + "'", long13 == 3540097L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5400000L + "'", long16 == 5400000L);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1594");
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
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((-60001L), locale15);
        java.lang.String str18 = dateTimeZone2.getShortName(60009L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1595");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str13 = dateTimeZone11.getNameKey(0L);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) 0L);
        int int16 = dateTimeZone2.getOffsetFromLocal(97L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone2.getShortName(120000L, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.TimeZone timeZone21 = dateTimeZone2.toTimeZone();
        long long24 = dateTimeZone2.convertLocalToUTC((-60032L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60032L) + "'", long24 == (-60032L));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1596");
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
        long long51 = dateTimeZone14.nextTransition((-28799900L));
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone14.getShortName((-179934L), locale53);
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Coordinated Universal Time" + "'", str49, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-28799900L) + "'", long51 == (-28799900L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1597");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        int int9 = dateTimeZone2.getStandardOffset((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long12 = dateTimeZone2.previousTransition((-180001L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getShortName((-28799966L), locale14);
        int int17 = dateTimeZone2.getStandardOffset(32L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-180001L) + "'", long12 == (-180001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1598");
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
        int int18 = dateTimeZone1.getOffset(28800052L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName(1L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getShortName(0L, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone19.getName((long) '4', locale26);
        boolean boolean28 = dateTimeZone19.isFixed();
        java.lang.String str30 = dateTimeZone19.getShortName((-60001L));
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone31.toString();
        boolean boolean33 = dateTimeZone19.equals((java.lang.Object) dateTimeZone31);
        long long36 = dateTimeZone19.adjustOffset(100L, true);
        long long40 = dateTimeZone19.convertLocalToUTC(53L, true, (long) 25200000);
        java.util.TimeZone timeZone41 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) timeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coordinated Universal Time" + "'", str27, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 53L + "'", long40 == 53L);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1599");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset(52L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        java.lang.String str15 = dateTimeZone0.getNameKey((long) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int18 = dateTimeZone0.getOffset(97L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1600");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        int int9 = dateTimeZone2.getStandardOffset((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long12 = dateTimeZone2.previousTransition((-180001L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getShortName((-28799966L), locale14);
        java.lang.String str16 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-180001L) + "'", long12 == (-180001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1601");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        long long3 = dateTimeZone1.convertUTCToLocal((-119900L));
        long long7 = dateTimeZone1.convertLocalToUTC(60000L, false, (long) (-3600000));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28680100L + "'", long3 == 28680100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28740000L) + "'", long7 == (-28740000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1602");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) ' ');
        java.lang.String str4 = dateTimeZone2.getShortName((-28799965L));
        java.lang.String str5 = dateTimeZone2.getID();
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(7200098L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:32" + "'", str4, "+01:32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:32" + "'", str5, "+01:32");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 7200098L + "'", long10 == 7200098L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression3.test1603");
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
        long long25 = dateTimeZone2.adjustOffset(28740001L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinated Universal Time" + "'", str21, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 28740001L + "'", long25 == 28740001L);
    }
}
