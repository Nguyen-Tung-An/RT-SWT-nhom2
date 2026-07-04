import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_009_Regression2 {

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
            System.out.format("%n%s%n", "JA_009_Regression2.test1001");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset((-28799968L));
        long long8 = dateTimeZone2.convertUTCToLocal((-28799966L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28739966L) + "'", long8 == (-28739966L));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1002");
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
        java.lang.String str48 = dateTimeZone14.getShortName((long) (byte) 10);
        java.lang.String str49 = dateTimeZone14.getID();
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
// flaky "1) test1002(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-59965L) + "'", long42 == (-59965L));
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTC" + "'", str49, "UTC");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1003");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone2.getName((-1L));
        int int8 = dateTimeZone2.getStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1004");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = false; // flaky "2) test1004(JA_009_Regression2)": dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int15 = dateTimeZone0.getOffset((-59902L));
        java.lang.String str16 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "1) test1004(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "1) test1004(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "1) test1004(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "1) test1004(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
// flaky "1) test1004(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1005");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str13 = dateTimeZone2.toString();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone2.isLocalDateTimeGap(localDateTime14);
        long long17 = dateTimeZone2.nextTransition(10L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1007");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        long long13 = dateTimeZone2.convertLocalToUTC(100L, false);
        java.lang.Class<?> wildcardClass14 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59900L) + "'", long13 == (-59900L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1008");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        java.lang.String str13 = dateTimeZone2.getShortName((long) 1);
        long long15 = dateTimeZone2.convertUTCToLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone2.getOffset(readableInstant16);
        int int19 = dateTimeZone2.getOffsetFromLocal((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60001L + "'", long15 == 60001L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1009");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 10, true);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone7.isLocalDateTimeGap(localDateTime9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getName(10L, locale12);
        long long16 = dateTimeZone7.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str20 = dateTimeZone19.toString();
        long long23 = dateTimeZone19.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        long long26 = dateTimeZone19.convertUTCToLocal(0L);
        java.lang.String str28 = dateTimeZone19.getShortName((long) (short) 100);
        long long30 = dateTimeZone7.getMillisKeepLocal(dateTimeZone19, (long) 60000);
        long long32 = dateTimeZone7.convertUTCToLocal((-28979900L));
        java.lang.String str34 = dateTimeZone7.getShortName((long) (-1));
        long long36 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 5520010L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone2.getName(3600031L, locale38);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-60001L) + "'", long16 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-60001L) + "'", long23 == (-60001L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 60000L + "'", long26 == 60000L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60000L + "'", long30 == 60000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-28919900L) + "'", long32 == (-28919900L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5520010L + "'", long36 == 5520010L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1010");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone5.convertUTCToLocal(60010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str12 = dateTimeZone11.toString();
        java.lang.String str14 = dateTimeZone11.getName((long) (short) 0);
        java.lang.String str16 = dateTimeZone11.getName(0L);
        java.lang.String str17 = dateTimeZone11.getID();
        java.lang.String str19 = dateTimeZone11.getNameKey((-59999L));
        java.lang.String str21 = dateTimeZone11.getName(22020000L);
        java.lang.String str23 = dateTimeZone11.getNameKey(22020000L);
        long long25 = dateTimeZone11.convertUTCToLocal((long) 0);
        long long27 = dateTimeZone5.getMillisKeepLocal(dateTimeZone11, (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60010L + "'", long7 == 60010L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60000L + "'", long25 == 60000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-60001L) + "'", long27 == (-60001L));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1011");
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
        int int47 = dateTimeZone30.getOffset((-59948L));
        int int49 = dateTimeZone30.getOffsetFromLocal((-120001L));
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60000 + "'", int47 == 60000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60000 + "'", int49 == 60000);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1012");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        long long9 = dateTimeZone1.nextTransition(60010L);
        java.lang.String str11 = dateTimeZone1.getShortName(32280098L);
        java.lang.String str13 = dateTimeZone1.getName((-28979901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60010L + "'", long9 == 60010L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1013");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        long long12 = dateTimeZone0.adjustOffset((long) 1, true);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getShortName((long) (short) 1, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName(5520010L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1014");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset(52L);
        java.lang.String str13 = dateTimeZone0.getNameKey((-179900L));
        long long17 = dateTimeZone0.convertLocalToUTC(60001L, true, (long) 'a');
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone0.getOffset(readableInstant18);
        int int21 = dateTimeZone0.getStandardOffset((-179969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1015");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        boolean boolean10 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        boolean boolean12 = dateTimeZone5.isStandardOffset(32400000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1016");
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
        long long21 = dateTimeZone2.convertLocalToUTC(20L, true);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 20L + "'", long21 == 20L);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1017");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        long long10 = dateTimeZone1.nextTransition(22020000L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(60035L, locale14);
        long long17 = dateTimeZone1.previousTransition((-119968L));
        long long20 = dateTimeZone1.adjustOffset((-3599902L), true);
        long long22 = dateTimeZone1.convertUTCToLocal(3480097L);
        long long24 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-119968L) + "'", long17 == (-119968L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3599902L) + "'", long20 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-119903L) + "'", long22 == (-119903L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599900L) + "'", long24 == (-3599900L));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1018");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1019");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        java.lang.String str15 = dateTimeZone7.getID();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1020");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime1 = null;
        boolean boolean2 = dateTimeZone0.isLocalDateTimeGap(localDateTime1);
        java.lang.String str3 = dateTimeZone0.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((long) 4200000, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1021");
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
        int int18 = dateTimeZone11.getOffsetFromLocal((long) 5700000);
        int int20 = dateTimeZone11.getOffsetFromLocal(60100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        java.lang.String str22 = dateTimeZone11.toString();
        java.lang.String str24 = dateTimeZone11.getName(28740001L);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1022");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.Object obj6 = null;
        boolean boolean7 = dateTimeZone2.equals(obj6);
        long long9 = dateTimeZone2.convertUTCToLocal((long) (byte) 100);
        java.util.TimeZone timeZone10 = dateTimeZone2.toTimeZone();
        java.lang.Class<?> wildcardClass11 = timeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60100L + "'", long9 == 60100L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        java.lang.String str7 = dateTimeZone1.getNameKey(120000L);
        int int9 = dateTimeZone1.getStandardOffset(54L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1025");
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
        long long19 = dateTimeZone2.adjustOffset((long) (byte) 10, false);
        long long23 = dateTimeZone2.convertLocalToUTC((long) 32, false, 60010L);
        int int25 = dateTimeZone2.getOffset((-28799932L));
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1026");
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
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone5.isLocalDateTimeGap(localDateTime31);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1027");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long8 = dateTimeZone4.nextTransition(0L);
        long long10 = dateTimeZone4.previousTransition(28800010L);
        boolean boolean12 = dateTimeZone4.isStandardOffset((-28859965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28800010L + "'", long10 == 28800010L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long10 = dateTimeZone4.convertLocalToUTC((long) (-1), false, 22020000L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName(1L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((long) 0, locale15);
        boolean boolean18 = dateTimeZone11.equals((java.lang.Object) '#');
        long long20 = dateTimeZone11.convertUTCToLocal((long) 1);
        boolean boolean21 = dateTimeZone4.equals((java.lang.Object) long20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone4.getShortName((-3659903L), locale23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60001L + "'", long20 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1030");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((-59999L), false);
        long long13 = dateTimeZone2.convertUTCToLocal(34L);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-119999L) + "'", long11 == (-119999L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60034L + "'", long13 == 60034L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1031");
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
        java.util.TimeZone timeZone27 = dateTimeZone2.toTimeZone();
        java.lang.String str28 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28859900L) + "'", long26 == (-28859900L));
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.lang.String str4 = dateTimeZone1.toString();
        long long6 = dateTimeZone1.nextTransition((-60001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1033");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long11 = dateTimeZone9.convertUTCToLocal(22080000L);
        java.lang.Class<?> wildcardClass12 = dateTimeZone9.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22080000L + "'", long11 == 22080000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1034");
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
        boolean boolean26 = dateTimeZone14.isFixed();
        java.lang.String str28 = dateTimeZone14.getNameKey(5760000L);
        java.util.TimeZone timeZone29 = dateTimeZone14.toTimeZone();
        int int31 = dateTimeZone14.getOffset(32400002L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-119936L) + "'", long25 == (-119936L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60000 + "'", int31 == 60000);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1035");
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
        long long16 = dateTimeZone0.adjustOffset((-25199900L), false);
        long long19 = dateTimeZone0.adjustOffset(31920000L, true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName(1L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone20.getShortName(0L, locale24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone20.getOffset(readableInstant26);
        boolean boolean28 = dateTimeZone20.isFixed();
        long long31 = dateTimeZone20.convertLocalToUTC((long) 10, true);
        java.lang.String str33 = dateTimeZone20.getNameKey(60097L);
        boolean boolean34 = dateTimeZone0.equals((java.lang.Object) dateTimeZone20);
        boolean boolean36 = dateTimeZone20.equals((java.lang.Object) 21599999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.032" + "'", str13, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 31920000L + "'", long19 == 31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.032" + "'", str22, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.032" + "'", str25, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-22L) + "'", long31 == (-22L));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1036");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone0.getID();
        long long10 = dateTimeZone0.nextTransition(5700001L);
        java.lang.String str11 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5700001L + "'", long10 == 5700001L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.032" + "'", str11, "+00:00:00.032");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-6720000), 4200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1038");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-119936L) + "'", long25 == (-119936L));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1039");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str7 = dateTimeZone2.getName(28800000L);
        java.lang.String str9 = dateTimeZone2.getNameKey((-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long10 = dateTimeZone4.convertLocalToUTC((long) (-1), false, 22020000L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName(1L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((long) 0, locale15);
        boolean boolean18 = dateTimeZone11.equals((java.lang.Object) '#');
        long long20 = dateTimeZone11.convertUTCToLocal((long) 1);
        boolean boolean21 = dateTimeZone4.equals((java.lang.Object) long20);
        int int23 = dateTimeZone4.getStandardOffset((-59999L));
        boolean boolean24 = dateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.032" + "'", str13, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.032" + "'", str16, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 33L + "'", long20 == 33L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1041");
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
        int int22 = dateTimeZone2.getOffset((-59903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.032" + "'", str7, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.032" + "'", str10, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1042");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) ' ');
        java.lang.String str4 = dateTimeZone2.getShortName((-28799965L));
        java.lang.String str5 = dateTimeZone2.getID();
        java.lang.Class<?> wildcardClass6 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:32" + "'", str4, "+01:32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:32" + "'", str5, "+01:32");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1043");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        long long13 = dateTimeZone2.convertUTCToLocal(100L);
        int int15 = dateTimeZone2.getStandardOffset((-6779900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-6719900L) + "'", long13 == (-6719900L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6720000) + "'", int15 == (-6720000));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1044");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition((long) (byte) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName(0L, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str18 = dateTimeZone17.toString();
        java.lang.String str20 = dateTimeZone17.getName((long) (short) 0);
        java.lang.String str22 = dateTimeZone17.getName(0L);
        java.lang.String str23 = dateTimeZone17.getID();
        java.lang.String str25 = dateTimeZone17.getNameKey((-59999L));
        boolean boolean26 = dateTimeZone2.equals((java.lang.Object) (-59999L));
        boolean boolean28 = dateTimeZone2.equals((java.lang.Object) 42L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1045");
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
        boolean boolean15 = dateTimeZone2.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:10");
        boolean boolean3 = dateTimeZone1.isStandardOffset((-28799966L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1047");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        long long10 = dateTimeZone0.previousTransition((long) (byte) 10);
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getShortName(60000L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1048");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str5 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1050");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        long long5 = dateTimeZone2.convertLocalToUTC(3480097L, true);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-719903L) + "'", long5 == (-719903L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1051");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        boolean boolean10 = dateTimeZone0.isFixed();
        long long14 = dateTimeZone0.convertLocalToUTC((-32399969L), true, (-3719902L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-32459969L) + "'", long14 == (-32459969L));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1052");
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
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone0.getOffset(readableInstant22);
        java.lang.Class<?> wildcardClass24 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1053");
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
        long long18 = dateTimeZone1.adjustOffset((-59965L), true);
        long long20 = dateTimeZone1.previousTransition((-119968L));
        boolean boolean22 = dateTimeZone1.isStandardOffset((-3599902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-119968L) + "'", long20 == (-119968L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1054");
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
        long long19 = dateTimeZone0.nextTransition((-119903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-119903L) + "'", long19 == (-119903L));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1055");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.lang.Class<?> wildcardClass4 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1056");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.lang.String str3 = dateTimeZone0.toString();
        long long7 = dateTimeZone0.convertLocalToUTC((-28800032L), false, 3660032L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28860032L) + "'", long7 == (-28860032L));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1057");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 1);
        long long5 = dateTimeZone0.nextTransition((-28979901L));
        long long7 = dateTimeZone0.convertUTCToLocal((-28739964L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coordinated Universal Time" + "'", str3, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-28979901L) + "'", long5 == (-28979901L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28739964L) + "'", long7 == (-28739964L));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1058");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long14 = dateTimeZone0.adjustOffset(100L, false);
        long long16 = dateTimeZone0.convertUTCToLocal(28800052L);
        long long20 = dateTimeZone0.convertLocalToUTC(98L, false, (-2L));
        java.lang.Class<?> wildcardClass21 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "3) test1058(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "2) test1058(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "2) test1058(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
// flaky "2) test1058(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 28800051L + "'", long16 == 28800051L);
// flaky "2) test1058(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1059");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        long long6 = dateTimeZone2.convertUTCToLocal(1L);
        boolean boolean7 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60001L + "'", long6 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1060");
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
        java.lang.String str22 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1061");
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
        long long18 = dateTimeZone0.adjustOffset(21960000L, false);
        int int20 = dateTimeZone0.getStandardOffset((-59947L));
        boolean boolean21 = dateTimeZone0.isFixed();
        long long24 = dateTimeZone0.adjustOffset((-120001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21960000L + "'", long18 == 21960000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-120001L) + "'", long24 == (-120001L));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1062");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        java.lang.String str8 = dateTimeZone5.getName((long) (short) 0);
        long long10 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (-10260000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10320000L) + "'", long10 == (-10320000L));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1063");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        int int10 = dateTimeZone2.getOffset((long) (short) 100);
        java.lang.String str12 = dateTimeZone2.getShortName(0L);
        boolean boolean14 = dateTimeZone2.isStandardOffset(60000L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 32);
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTimeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1064");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60097L, locale4);
        java.lang.Object obj6 = null;
        boolean boolean7 = dateTimeZone2.equals(obj6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:10" + "'", str5, "+01:10");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1065");
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
        java.lang.String str23 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        long long18 = dateTimeZone0.convertLocalToUTC((long) 32, true);
        boolean boolean19 = dateTimeZone0.isFixed();
        long long21 = dateTimeZone0.nextTransition(60010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59968L) + "'", long18 == (-59968L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60010L + "'", long21 == 60010L);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1067");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName(3540097L, locale5);
        long long8 = dateTimeZone2.previousTransition(36060000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36060000L + "'", long8 == 36060000L);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1068");
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
        java.lang.String str24 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-59969L) + "'", long23 == (-59969L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1069");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(60000L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getShortName((-6719900L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1070");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        long long9 = dateTimeZone2.convertLocalToUTC((long) 10, false, (-119900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59990L) + "'", long9 == (-59990L));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset((long) (byte) -1);
        long long9 = dateTimeZone1.convertLocalToUTC(51L, false, (-28799968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1072");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        boolean boolean5 = dateTimeZone1.isFixed();
        boolean boolean7 = dateTimeZone1.isStandardOffset((-28919900L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getShortName((long) (byte) 1, locale11);
        java.lang.String str14 = dateTimeZone9.getNameKey((-28919900L));
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone9.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone9.getOffsetFromLocal((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone9.getOffset(readableInstant19);
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.String str22 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3600000) + "'", int20 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1073");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        int int6 = dateTimeZone1.getOffset((-2L));
        long long9 = dateTimeZone1.adjustOffset((-1L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1074");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone5.nextTransition(28740132L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28740132L + "'", long7 == 28740132L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        int int6 = dateTimeZone1.getOffset((-60001L));
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone8.isLocalDateTimeGap(localDateTime10);
        java.util.TimeZone timeZone12 = dateTimeZone8.toTimeZone();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        java.lang.String str15 = dateTimeZone1.getShortName(7200098L);
        boolean boolean17 = dateTimeZone1.isStandardOffset(31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        long long10 = dateTimeZone1.nextTransition((-28740000L));
        java.lang.String str12 = dateTimeZone1.getShortName((-32399969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28740000L) + "'", long10 == (-28740000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1077");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1078");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        int int13 = dateTimeZone2.getStandardOffset(60035L);
        java.lang.String str15 = dateTimeZone2.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1079");
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
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str18 = dateTimeZone17.toString();
        long long21 = dateTimeZone17.convertLocalToUTC((long) (-1), false);
        java.lang.String str22 = dateTimeZone17.getID();
        long long24 = dateTimeZone17.nextTransition(100L);
        boolean boolean25 = dateTimeZone17.isFixed();
        int int27 = dateTimeZone17.getStandardOffset((long) (short) -1);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, 3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "4) test1079(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28799999L + "'", long14 == 28799999L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-60001L) + "'", long21 == (-60001L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3539999L + "'", long29 == 3539999L);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1080");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        long long6 = dateTimeZone0.adjustOffset((-28859900L), true);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int11 = dateTimeZone9.getOffsetFromLocal((long) 25200000);
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5700000);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.032' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-28859900L) + "'", long6 == (-28859900L));
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5699968L + "'", long13 == 5699968L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1081");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        java.lang.String str13 = dateTimeZone0.getName((-1080032L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "5) test1081(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "3) test1081(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "3) test1081(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "3) test1081(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1082");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        java.lang.String str6 = dateTimeZone1.getID();
        int int8 = dateTimeZone1.getOffsetFromLocal(60032L);
        long long10 = dateTimeZone1.nextTransition((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "6) test1082(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
// flaky "4) test1082(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
// flaky "4) test1082(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long3 = dateTimeZone1.previousTransition(60034L);
        java.lang.String str4 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60034L + "'", long3 == 60034L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1084");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(5699968L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1085");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        int int4 = dateTimeZone2.getOffset((long) 28800000);
        int int6 = dateTimeZone2.getStandardOffset(52L);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
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
        long long25 = dateTimeZone8.convertUTCToLocal((long) 'a');
        long long27 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, 3540010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky "7) test1085(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
// flaky "5) test1085(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "5) test1085(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNull(str18);
// flaky "4) test1085(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str23);
// flaky "3) test1085(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 96L + "'", long25 == 96L);
// flaky "2) test1085(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3600011L + "'", long27 == 3600011L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1086");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.convertUTCToLocal((-32339968L));
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone14.isLocalDateTimeGap(localDateTime15);
        boolean boolean17 = dateTimeZone14.isFixed();
        java.lang.String str19 = dateTimeZone14.getName(0L);
        long long21 = dateTimeZone2.getMillisKeepLocal(dateTimeZone14, 28680100L);
        java.lang.String str22 = dateTimeZone14.toString();
        boolean boolean23 = dateTimeZone14.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-32279968L) + "'", long10 == (-32279968L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coordinated Universal Time" + "'", str19, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28740100L + "'", long21 == 28740100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1087");
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
        java.lang.String str14 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone17.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str23 = dateTimeZone22.toString();
        java.lang.String str25 = dateTimeZone22.getName((long) (short) 0);
        java.lang.String str27 = dateTimeZone22.getName(0L);
        long long29 = dateTimeZone17.getMillisKeepLocal(dateTimeZone22, (long) (short) 1);
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone17, (long) (short) 1);
        int int33 = dateTimeZone17.getStandardOffset((-36059948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-59999L) + "'", long29 == (-59999L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 60001L + "'", long31 == 60001L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1088");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.nextTransition((-59900L));
        long long13 = dateTimeZone2.convertLocalToUTC(0L, false, 5640001L);
        long long16 = dateTimeZone2.convertLocalToUTC(6779999L, false);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone2.getName(35580042L, locale18);
        long long21 = dateTimeZone2.previousTransition((-3659901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59900L) + "'", long9 == (-59900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60000L) + "'", long13 == (-60000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 6719999L + "'", long16 == 6719999L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3659901L) + "'", long21 == (-3659901L));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1089");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getName(28740032L);
        int int14 = dateTimeZone2.getStandardOffset(22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1090");
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
        long long19 = dateTimeZone2.convertLocalToUTC((long) 10, true);
        long long22 = dateTimeZone2.convertLocalToUTC((-59900L), false);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-59900L) + "'", long22 == (-59900L));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1091");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        long long11 = dateTimeZone2.convertLocalToUTC(54L, true, (-32399969L));
        int int13 = dateTimeZone2.getOffsetFromLocal(5640001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1092");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.String str7 = dateTimeZone2.getShortName((long) 5700000);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone2.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1093");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        int int3 = dateTimeZone0.getOffsetFromLocal(53L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(28740000L, locale5);
        int int8 = dateTimeZone0.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1094");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) "Indochina Time");
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1095");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str14 = dateTimeZone2.getNameKey(22020000L);
        long long16 = dateTimeZone2.convertUTCToLocal((long) 0);
        java.lang.String str18 = dateTimeZone2.getNameKey(28740032L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-6720000), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1097");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long13 = dateTimeZone0.previousTransition(60001L);
        java.lang.String str14 = dateTimeZone0.toString();
        int int16 = dateTimeZone0.getOffsetFromLocal((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60001L + "'", long9 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60001L + "'", long13 == 60001L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1098");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC((-119968L), false);
        java.lang.String str12 = dateTimeZone2.toString();
        java.lang.String str14 = dateTimeZone2.getName((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-119968L) + "'", long11 == (-119968L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1099");
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
        boolean boolean27 = dateTimeZone14.isStandardOffset(5700000L);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1100");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(21960000L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long15 = dateTimeZone13.nextTransition(53L);
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) dateTimeZone13);
        java.lang.String str17 = dateTimeZone13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "8) test1101(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
// flaky "6) test1101(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
// flaky "6) test1101(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53L + "'", long15 == 53L);
// flaky "5) test1101(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1102");
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
        boolean boolean19 = dateTimeZone0.isStandardOffset(32400000L);
        boolean boolean21 = dateTimeZone0.isStandardOffset((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "9) test1102(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
// flaky "7) test1102(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
// flaky "7) test1102(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "6) test1102(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+01:35" + "'", str11, "+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky "4) test1102(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:35" + "'", str13, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1103");
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
        long long26 = dateTimeZone1.convertUTCToLocal((-28979900L));
        java.lang.String str28 = dateTimeZone1.getShortName((long) (-1));
        long long30 = dateTimeZone1.previousTransition((long) (short) 0);
        java.lang.String str32 = dateTimeZone1.getNameKey(5520010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "10) test1103(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "8) test1103(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
// flaky "8) test1103(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5700000L + "'", long24 == 5700000L);
// flaky "7) test1103(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-23279900L) + "'", long26 == (-23279900L));
// flaky "5) test1103(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+01:35" + "'", str28, "+01:35");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1104");
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
        int int25 = dateTimeZone1.getStandardOffset((-28979900L));
        long long27 = dateTimeZone1.convertUTCToLocal((-179934L));
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3600000) + "'", int25 == (-3600000));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3779934L) + "'", long27 == (-3779934L));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1105");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long3 = dateTimeZone1.nextTransition(22020000L);
        java.lang.String str5 = dateTimeZone1.getName((-59900L));
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 22020000L + "'", long3 == 22020000L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1106");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        long long13 = dateTimeZone0.adjustOffset((long) (short) 100, false);
        int int15 = dateTimeZone0.getOffset((-32399969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1107");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone2.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        boolean boolean13 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1108");
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
        long long19 = dateTimeZone2.convertUTCToLocal((-28740000L));
        long long22 = dateTimeZone2.adjustOffset((-28740000L), false);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone2.getShortName(28800035L, locale24);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-28740000L) + "'", long19 == (-28740000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-28740000L) + "'", long22 == (-28740000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1109");
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
        java.lang.String str25 = dateTimeZone0.getShortName(6779999L);
        long long28 = dateTimeZone0.adjustOffset(3660032L, false);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3660032L + "'", long28 == 3660032L);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.convertLocalToUTC(5700001L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.convertUTCToLocal(1L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone7.getShortName((long) (byte) 10, locale11);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        boolean boolean19 = dateTimeZone16.isFixed();
        long long21 = dateTimeZone7.getMillisKeepLocal(dateTimeZone16, (-28859900L));
        java.lang.String str22 = dateTimeZone7.toString();
        long long24 = dateTimeZone7.convertUTCToLocal((-28740000L));
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) long24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getShortName((-39599902L), locale27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5640001L + "'", long4 == 5640001L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28919900L) + "'", long21 == (-28919900L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-28740000L) + "'", long24 == (-28740000L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) '#');
        java.lang.String str11 = dateTimeZone8.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28799966L) + "'", long10 == (-28799966L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+08:00" + "'", str11, "+08:00");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1112");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1113");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey((long) (-3600000));
        long long7 = dateTimeZone2.nextTransition(6720002L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6720002L + "'", long7 == 6720002L);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1114");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        java.lang.String str11 = dateTimeZone2.getName((-59901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1115");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        boolean boolean8 = dateTimeZone2.isFixed();
        boolean boolean9 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName(1L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone12.getShortName(0L, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone12.getName((long) '4', locale19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone12.getName(53L, locale22);
        int int25 = dateTimeZone12.getOffset((long) 25200000);
        boolean boolean26 = dateTimeZone2.equals((java.lang.Object) dateTimeZone12);
        java.lang.String str28 = dateTimeZone12.getNameKey(28800000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1116");
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
        int int20 = dateTimeZone1.getOffset(60100L);
        int int22 = dateTimeZone1.getOffset((-3659903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long9 = dateTimeZone4.convertLocalToUTC(28799999L, true);
        int int11 = dateTimeZone4.getOffsetFromLocal(5699968L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28799999L + "'", long9 == 28799999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1118");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        long long13 = dateTimeZone2.convertLocalToUTC(100L, false);
        long long16 = dateTimeZone2.adjustOffset((long) 4200000, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59900L) + "'", long13 == (-59900L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4200000L + "'", long16 == 4200000L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1119");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long14 = dateTimeZone2.convertLocalToUTC((-59968L), false);
        boolean boolean15 = dateTimeZone2.isFixed();
        int int17 = dateTimeZone2.getStandardOffset(5699968L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone2.getShortName(60097L, locale19);
        java.lang.String str22 = dateTimeZone2.getShortName(3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-119968L) + "'", long14 == (-119968L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1120");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        java.lang.String str27 = dateTimeZone26.getID();
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) str27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long33 = dateTimeZone30.adjustOffset((long) (byte) 10, false);
        java.lang.String str34 = dateTimeZone30.getID();
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone30.getOffset(readableInstant35);
        long long40 = dateTimeZone30.convertLocalToUTC((-28859900L), false, (long) (short) 100);
        boolean boolean41 = dateTimeZone0.equals((java.lang.Object) (-28859900L));
        java.util.TimeZone timeZone42 = dateTimeZone0.toTimeZone();
        long long44 = dateTimeZone0.previousTransition((long) (-3600000));
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28680100L + "'", long23 == 28680100L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:10" + "'", str27, "+01:10");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60000 + "'", int36 == 60000);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-28919900L) + "'", long40 == (-28919900L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-3600000L) + "'", long44 == (-3600000L));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str14 = dateTimeZone0.getID();
        java.lang.String str16 = dateTimeZone0.getName((long) 10);
        java.util.TimeZone timeZone17 = dateTimeZone0.toTimeZone();
        long long19 = dateTimeZone0.nextTransition(32400001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32400001L + "'", long19 == 32400001L);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1122");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.convertLocalToUTC(5700001L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.convertUTCToLocal(1L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone7.getShortName((long) (byte) 10, locale11);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        boolean boolean19 = dateTimeZone16.isFixed();
        long long21 = dateTimeZone7.getMillisKeepLocal(dateTimeZone16, (-28859900L));
        java.lang.String str22 = dateTimeZone7.toString();
        long long24 = dateTimeZone7.convertUTCToLocal((-28740000L));
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) long24);
        boolean boolean26 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5640001L + "'", long4 == 5640001L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28919900L) + "'", long21 == (-28919900L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-28740000L) + "'", long24 == (-28740000L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1123");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) ' ');
        java.lang.String str4 = dateTimeZone2.getShortName((-28799965L));
        java.lang.String str5 = dateTimeZone2.getID();
        java.lang.String str7 = dateTimeZone2.getName(5400000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:32" + "'", str4, "+01:32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:32" + "'", str5, "+01:32");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:32" + "'", str7, "+01:32");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1124");
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
        int int24 = dateTimeZone10.getOffset((-28859900L));
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60000 + "'", int24 == 60000);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1125");
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
        long long18 = dateTimeZone1.adjustOffset((-59965L), true);
        long long20 = dateTimeZone1.previousTransition((long) (byte) 1);
        int int22 = dateTimeZone1.getStandardOffset(28860010L);
        long long24 = dateTimeZone1.convertUTCToLocal((-25199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25139900L) + "'", long24 == (-25139900L));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1126");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-59990L), false, 53L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long9 = dateTimeZone0.convertLocalToUTC(60010L, true, (long) 32);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        long long13 = dateTimeZone0.previousTransition(32340097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-59990L) + "'", long4 == (-59990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60010L + "'", long9 == 60010L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32340097L + "'", long13 == 32340097L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1127");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        java.lang.String str12 = dateTimeZone0.getShortName((-28799969L));
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1128");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long11 = dateTimeZone0.previousTransition((-1L));
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) 10);
        int int15 = dateTimeZone0.getOffset(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1129");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        boolean boolean10 = dateTimeZone0.isFixed();
        int int12 = dateTimeZone0.getStandardOffset(22020000L);
        long long14 = dateTimeZone0.convertUTCToLocal((long) 10);
        long long17 = dateTimeZone0.adjustOffset(53L, true);
        long long19 = dateTimeZone0.nextTransition(97L);
        java.lang.Class<?> wildcardClass20 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 53L + "'", long17 == 53L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1130");
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
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone2.getOffset(readableInstant21);
        long long24 = dateTimeZone2.previousTransition((long) (short) 10);
        long long27 = dateTimeZone2.adjustOffset((-29820032L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-29820032L) + "'", long27 == (-29820032L));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1131");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName(32L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1133");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = dateTimeZone0.isFixed();
        long long10 = dateTimeZone0.nextTransition((-28740000L));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "11) test1133(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:10" + "'", str2, "+01:10");
// flaky "9) test1133(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:10" + "'", str5, "+01:10");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28740000L) + "'", long10 == (-28740000L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1134");
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
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone2.getShortName((long) 5700000, locale18);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone2.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone2.getShortName((-1020032L), locale23);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky "12) test1134(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:10" + "'", str8, "+01:10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5700000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1136");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1137");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-180001L), locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone2.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1138");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone2.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1139");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getShortName((long) 28800000);
        long long8 = dateTimeZone2.convertLocalToUTC((long) (byte) 10, true, (long) 60000);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone10.adjustOffset(3600097L, true);
        int int15 = dateTimeZone10.getStandardOffset(28800051L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600097L + "'", long13 == 3600097L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1140");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        long long9 = dateTimeZone1.nextTransition(60010L);
        long long11 = dateTimeZone1.previousTransition(51L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60010L + "'", long9 == 60010L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 51L + "'", long11 == 51L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1141");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName(97L, locale17);
        java.lang.Class<?> wildcardClass19 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1142");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        boolean boolean12 = dateTimeZone0.isFixed();
        long long14 = dateTimeZone0.previousTransition(28680100L);
        java.lang.String str16 = dateTimeZone0.getShortName((-28739964L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28680100L + "'", long14 == 28680100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1143");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str14 = dateTimeZone0.getID();
        java.lang.String str16 = dateTimeZone0.getName((long) 10);
        java.util.TimeZone timeZone17 = dateTimeZone0.toTimeZone();
        java.lang.String str19 = dateTimeZone0.getNameKey((-59969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.previousTransition((-3659999L));
        long long6 = dateTimeZone1.nextTransition((-10320000L));
        int int8 = dateTimeZone1.getOffset((-23279900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3659999L) + "'", long4 == (-3659999L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-10320000L) + "'", long6 == (-10320000L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36000000 + "'", int8 == 36000000);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1145");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getName((-59902L), locale16);
        java.lang.String str19 = dateTimeZone0.getNameKey((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1146");
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
        long long18 = dateTimeZone0.nextTransition((-3719902L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3719902L) + "'", long18 == (-3719902L));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1147");
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
        int int20 = dateTimeZone2.getOffset(10L);
        java.lang.String str22 = dateTimeZone2.getShortName(100L);
        java.lang.String str24 = dateTimeZone2.getName(29400000L);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinated Universal Time" + "'", str24, "Coordinated Universal Time");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1148");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.lang.String str3 = dateTimeZone1.getShortName(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1149");
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
        java.lang.String str14 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1150");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) '4');
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean5 = dateTimeZone2.equals((java.lang.Object) nameProvider4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:52" + "'", str3, "+00:52");
        org.junit.Assert.assertNotNull(nameProvider4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1151");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        long long9 = dateTimeZone0.previousTransition((-60001L));
        long long11 = dateTimeZone0.convertUTCToLocal((long) (byte) -1);
        long long14 = dateTimeZone0.adjustOffset(3600031L, true);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str17 = dateTimeZone15.getShortName(1L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone15.getName((long) 0, locale19);
        boolean boolean22 = dateTimeZone15.equals((java.lang.Object) (byte) 100);
        boolean boolean23 = dateTimeZone0.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 59999L + "'", long11 == 59999L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600031L + "'", long14 == 3600031L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1153");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        long long13 = dateTimeZone0.previousTransition((-59900L));
        long long15 = dateTimeZone0.previousTransition((-25199900L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59900L) + "'", long13 == (-59900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25199900L) + "'", long15 == (-25199900L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1154");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean13 = dateTimeZone0.isStandardOffset((long) (byte) 0);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getName((long) 52, locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getShortName((-120001L), locale18);
        java.lang.String str21 = dateTimeZone0.getNameKey(32340098L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1155");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone0.getOffset(readableInstant25);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1156");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getShortName((long) 28800000);
        long long8 = dateTimeZone2.convertLocalToUTC((long) (byte) 10, true, (long) 60000);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1157");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset(52L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str13 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1158");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1159");
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
        long long19 = dateTimeZone2.adjustOffset((long) (byte) 10, false);
        java.lang.String str20 = dateTimeZone2.toString();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1160");
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
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) (short) -1);
        long long31 = dateTimeZone1.previousTransition((-3659902L));
        java.lang.String str33 = dateTimeZone1.getName(60036L);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-3659902L) + "'", long31 == (-3659902L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        long long11 = dateTimeZone2.convertUTCToLocal((-28799966L));
        long long14 = dateTimeZone2.convertLocalToUTC((-1080032L), true);
        java.lang.String str16 = dateTimeZone2.getName(30L);
        long long19 = dateTimeZone2.adjustOffset((-28740000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28799966L) + "'", long11 == (-28799966L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1080032L) + "'", long14 == (-1080032L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-28740000L) + "'", long19 == (-28740000L));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        long long10 = dateTimeZone1.nextTransition(22020000L);
        long long13 = dateTimeZone1.convertLocalToUTC(0L, false);
        long long17 = dateTimeZone1.convertLocalToUTC((-3659903L), false, 53L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-59903L) + "'", long17 == (-59903L));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1163");
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
        int int16 = dateTimeZone2.getStandardOffset(5460000L);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1164");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.lang.String str4 = dateTimeZone0.getName((-119900L));
        boolean boolean5 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1165");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) ' ');
        java.lang.String str4 = dateTimeZone2.getShortName((-28799965L));
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        long long8 = dateTimeZone2.convertUTCToLocal(5639968L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:32" + "'", str4, "+01:32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5520000 + "'", int6 == 5520000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 11159968L + "'", long8 == 11159968L);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1166");
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
        java.lang.String str33 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str37 = dateTimeZone36.toString();
        long long40 = dateTimeZone36.convertLocalToUTC((long) (-1), false);
        java.lang.String str41 = dateTimeZone36.getID();
        long long43 = dateTimeZone36.nextTransition(100L);
        boolean boolean44 = dateTimeZone36.isFixed();
        int int46 = dateTimeZone36.getStandardOffset((long) (short) -1);
        long long49 = dateTimeZone36.adjustOffset((long) '4', false);
        java.lang.String str51 = dateTimeZone36.getShortName(0L);
        java.lang.String str52 = dateTimeZone36.getID();
        boolean boolean53 = dateTimeZone0.equals((java.lang.Object) str52);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-60001L) + "'", long40 == (-60001L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:01" + "'", str41, "+00:01");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60000 + "'", int46 == 60000);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 52L + "'", long49 == 52L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:01" + "'", str51, "+00:01");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:01" + "'", str52, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1167");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long13 = dateTimeZone2.previousTransition((-120001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-120001L) + "'", long13 == (-120001L));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1168");
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
        long long27 = dateTimeZone18.convertLocalToUTC((long) '4', false);
        long long30 = dateTimeZone18.convertLocalToUTC((-28800000L), true);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str34 = dateTimeZone33.toString();
        long long37 = dateTimeZone33.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        long long40 = dateTimeZone33.convertUTCToLocal(0L);
        long long42 = dateTimeZone18.getMillisKeepLocal(dateTimeZone33, (long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 20L + "'", long27 == 20L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-28800032L) + "'", long30 == (-28800032L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-60001L) + "'", long37 == (-60001L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 60000L + "'", long40 == 60000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-59969L) + "'", long42 == (-59969L));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1169");
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
        boolean boolean36 = dateTimeZone0.isFixed();
        boolean boolean37 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone38 = dateTimeZone0.toTimeZone();
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone0.getOffset(readableInstant39);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60000 + "'", int40 == 60000);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1170");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        boolean boolean8 = dateTimeZone2.isFixed();
        java.lang.String str9 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.lang.String str2 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1172");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        java.lang.String str13 = dateTimeZone2.getNameKey(52L);
        long long15 = dateTimeZone2.convertUTCToLocal((-10320000L));
        java.lang.String str16 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10260000L) + "'", long15 == (-10260000L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC((-119968L), false);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone2.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-119968L) + "'", long11 == (-119968L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1174");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean13 = dateTimeZone0.isStandardOffset((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1175");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName(1L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName(0L, locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getName((long) '4', locale25);
        java.lang.String str28 = dateTimeZone18.getNameKey((long) '4');
        int int30 = dateTimeZone18.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        java.lang.String str33 = dateTimeZone18.getNameKey(1L);
        long long36 = dateTimeZone18.adjustOffset((long) (short) 0, true);
        int int38 = dateTimeZone18.getStandardOffset((-59900L));
        java.lang.String str40 = dateTimeZone18.getName((long) 28800000);
        long long43 = dateTimeZone18.adjustOffset((long) 10, false);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone18.getShortName((long) '#', locale45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone18.getOffset(readableInstant47);
        boolean boolean49 = dateTimeZone0.equals((java.lang.Object) readableInstant47);
        int int51 = dateTimeZone0.getOffset((-179902L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60000 + "'", int30 == 60000);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60000 + "'", int38 == 60000);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:01" + "'", str40, "+00:01");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:01" + "'", str46, "+00:01");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60000 + "'", int48 == 60000);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 60000 + "'", int51 == 60000);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1177");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean4 = dateTimeZone1.isStandardOffset((-28919900L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.convertUTCToLocal(1L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone7.getName((long) '#', locale11);
        java.lang.String str14 = dateTimeZone7.getName((long) 28800000);
        long long16 = dateTimeZone7.convertUTCToLocal((-59900L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone7.getName((long) 60000, locale18);
        long long21 = dateTimeZone7.previousTransition((long) 60000);
        long long23 = dateTimeZone7.previousTransition(42L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone7.getOffset(readableInstant24);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-28919899L));
        java.lang.String str29 = dateTimeZone1.getShortName(60035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59900L) + "'", long16 == (-59900L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coordinated Universal Time" + "'", str19, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60000L + "'", long21 == 60000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 42L + "'", long23 == 42L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-28859899L) + "'", long27 == (-28859899L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1178");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset(60052L);
        java.lang.String str7 = dateTimeZone1.getNameKey(28800010L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1179");
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
        java.lang.String str26 = dateTimeZone2.getID();
        java.util.TimeZone timeZone27 = dateTimeZone2.toTimeZone();
        long long30 = dateTimeZone2.convertLocalToUTC(5699968L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5639968L + "'", long30 == 5639968L);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1180");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-59903L), locale8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1181");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59948L));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1182");
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
        long long24 = dateTimeZone6.nextTransition(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22020000L + "'", long15 == 22020000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3600000) + "'", int17 == (-3600000));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600030L + "'", long22 == 3600030L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1183");
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
        java.lang.String str48 = dateTimeZone14.getName(59905L);
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 36L + "'", long42 == 36L);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Coordinated Universal Time" + "'", str48, "Coordinated Universal Time");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1184");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str4 = dateTimeZone2.toString();
        java.lang.String str6 = dateTimeZone2.getName((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long11 = dateTimeZone9.nextTransition(22020000L);
        java.lang.String str13 = dateTimeZone9.getName((long) (byte) 10);
        java.lang.String str15 = dateTimeZone9.getNameKey(53L);
        java.util.TimeZone timeZone16 = dateTimeZone9.toTimeZone();
        boolean boolean17 = dateTimeZone2.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.032" + "'", str13, "+00:00:00.032");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1185");
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
        java.util.TimeZone timeZone26 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
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
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1186");
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
        boolean boolean34 = dateTimeZone15.isFixed();
        java.lang.String str36 = dateTimeZone15.getName((-59980L));
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1187");
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
        long long37 = dateTimeZone27.nextTransition((-32399968L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-32399968L) + "'", long37 == (-32399968L));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1188");
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
        int int26 = dateTimeZone0.getOffsetFromLocal(60002L);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1189");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long13 = dateTimeZone0.convertUTCToLocal((long) 32);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        int int17 = dateTimeZone0.getOffsetFromLocal(28680100L);
        long long19 = dateTimeZone0.convertUTCToLocal((-25199900L));
        boolean boolean21 = dateTimeZone0.isStandardOffset(5700033L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60001L + "'", long9 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60032L + "'", long13 == 60032L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25139900L) + "'", long19 == (-25139900L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1190");
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
        long long18 = dateTimeZone11.nextTransition((long) 25200000);
        int int20 = dateTimeZone11.getStandardOffset((-60001L));
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(52);
        boolean boolean23 = dateTimeZone11.equals((java.lang.Object) dateTimeZone22);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25200000L + "'", long18 == 25200000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1191");
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
        boolean boolean36 = dateTimeZone0.isFixed();
        boolean boolean37 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone38 = dateTimeZone0.toTimeZone();
        int int40 = dateTimeZone0.getOffset(21960000L);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60000 + "'", int40 == 60000);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset((long) (byte) -1);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffset(25200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1193");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) "Indochina Time");
        int int7 = dateTimeZone1.getOffsetFromLocal((-32339968L));
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((long) 100, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1194");
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
        int int25 = dateTimeZone2.getOffset(60000L);
        long long27 = dateTimeZone2.previousTransition(21659999L);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 21659999L + "'", long27 == 21659999L);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        java.lang.String str8 = dateTimeZone7.getID();
        int int10 = dateTimeZone7.getOffset((-3719902L));
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, 9360000L);
        java.util.TimeZone timeZone13 = dateTimeZone7.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:10" + "'", str8, "+01:10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4200000 + "'", int10 == 4200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5159999L + "'", long12 == 5159999L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+01:10");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1196");
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
        long long20 = dateTimeZone2.adjustOffset((-28979901L), true);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-28979901L) + "'", long20 == (-28979901L));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1197");
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
        int int20 = dateTimeZone2.getOffset(10L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone2.getShortName((long) 60000, locale22);
        java.util.TimeZone timeZone24 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        long long30 = dateTimeZone25.convertLocalToUTC(34L, false, 7200098L);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 34L + "'", long30 == 34L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1198");
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
        long long45 = dateTimeZone30.adjustOffset(60052L, false);
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
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 60052L + "'", long45 == 60052L);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1199");
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
        java.lang.Class<?> wildcardClass34 = dateTimeZone21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1200");
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
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        boolean boolean19 = dateTimeZone18.isFixed();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone18.getName(0L, locale21);
        long long24 = dateTimeZone18.convertUTCToLocal((-28919900L));
        long long26 = dateTimeZone18.previousTransition(28800000L);
        boolean boolean27 = dateTimeZone0.equals((java.lang.Object) long26);
        boolean boolean29 = dateTimeZone0.isStandardOffset(21600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60001L + "'", long13 == 60001L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-28919900L) + "'", long24 == (-28919900L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 28800000L + "'", long26 == 28800000L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1201");
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
        long long27 = dateTimeZone18.convertLocalToUTC((long) '4', false);
        long long30 = dateTimeZone18.convertLocalToUTC((-28800000L), true);
        java.lang.String str31 = dateTimeZone18.toString();
        boolean boolean32 = dateTimeZone18.isFixed();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 20L + "'", long27 == 20L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-28800032L) + "'", long30 == (-28800032L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.032" + "'", str31, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1202");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int5 = dateTimeZone2.getOffsetFromLocal(5699968L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        java.lang.String str14 = dateTimeZone10.getNameKey((long) (-1));
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone10, (long) 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36000000L + "'", long16 == 36000000L);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long9 = dateTimeZone6.adjustOffset(0L, false);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) 0);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) str11);
        int int14 = dateTimeZone1.getOffset(21959968L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        java.lang.String str24 = dateTimeZone22.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getShortName(1L);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone25.getShortName(0L, locale29);
        int int32 = dateTimeZone25.getOffsetFromLocal(1L);
        java.lang.String str34 = dateTimeZone25.getName((long) 25200000);
        int int36 = dateTimeZone25.getOffsetFromLocal((long) (short) -1);
        java.lang.String str38 = dateTimeZone25.getShortName((long) (byte) -1);
        long long40 = dateTimeZone25.previousTransition((-59999L));
        boolean boolean42 = dateTimeZone25.isStandardOffset(28800000L);
        boolean boolean43 = dateTimeZone22.equals((java.lang.Object) 28800000L);
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, (long) (-6720000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60000 + "'", int32 == 60000);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60000 + "'", int36 == 60000);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:01" + "'", str38, "+00:01");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-59999L) + "'", long40 == (-59999L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-6720000L) + "'", long45 == (-6720000L));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        java.lang.String str4 = dateTimeZone1.toString();
        int int6 = dateTimeZone1.getOffsetFromLocal(5700001L);
        int int8 = dateTimeZone1.getOffsetFromLocal((-36059948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1205");
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
        long long24 = dateTimeZone0.convertLocalToUTC((-25199900L), true);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-25259900L) + "'", long24 == (-25259900L));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1206");
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
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone2.getShortName(60036L, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone2.getShortName((-59969L), locale26);
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1207");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName(3540097L, locale5);
        int int8 = dateTimeZone2.getStandardOffset(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        boolean boolean11 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1208");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        long long14 = dateTimeZone2.nextTransition(60001L);
        long long16 = dateTimeZone2.previousTransition((-1L));
        java.lang.String str17 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60001L + "'", long14 == 60001L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1209");
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
        java.lang.String str37 = dateTimeZone26.getName((-32339968L));
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1210");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long10 = dateTimeZone4.convertLocalToUTC((long) (-1), false, 22020000L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName(1L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((long) 0, locale15);
        boolean boolean18 = dateTimeZone11.equals((java.lang.Object) '#');
        long long20 = dateTimeZone11.convertUTCToLocal((long) 1);
        boolean boolean21 = dateTimeZone4.equals((java.lang.Object) long20);
        int int23 = dateTimeZone4.getStandardOffset((-59999L));
        java.lang.String str24 = dateTimeZone4.toString();
        java.lang.String str26 = dateTimeZone4.getName(28800011L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60001L + "'", long20 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coordinated Universal Time" + "'", str26, "Coordinated Universal Time");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1212");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        int int4 = dateTimeZone2.getOffsetFromLocal((-3659965L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1213");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal(31920000L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName(1L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getShortName(0L, locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone5.getName((long) '4', locale12);
        java.lang.String str15 = dateTimeZone5.getNameKey((long) '4');
        int int17 = dateTimeZone5.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName(1L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getShortName(0L, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone19.getName((long) '4', locale26);
        java.lang.String str29 = dateTimeZone19.getNameKey((long) '4');
        int int31 = dateTimeZone19.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        java.lang.String str34 = dateTimeZone19.getNameKey(1L);
        long long36 = dateTimeZone5.getMillisKeepLocal(dateTimeZone19, (long) (short) -1);
        long long39 = dateTimeZone5.convertLocalToUTC((-59900L), true);
        long long43 = dateTimeZone5.convertLocalToUTC(0L, true, 28740000L);
        long long45 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60000 + "'", int31 == 60000);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-119900L) + "'", long39 == (-119900L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-60000L) + "'", long43 == (-60000L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 35940000L + "'", long45 == 35940000L);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1214");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        java.util.TimeZone timeZone11 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.convertUTCToLocal((-28800000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-28740000L) + "'", long14 == (-28740000L));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1215");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        int int14 = dateTimeZone0.getStandardOffset(60052L);
        long long17 = dateTimeZone0.convertLocalToUTC((-1080032L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1140032L) + "'", long17 == (-1140032L));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1216");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        long long5 = dateTimeZone2.convertLocalToUTC(3480097L, true);
        long long7 = dateTimeZone2.convertUTCToLocal((long) 25200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal((-32399968L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-719903L) + "'", long5 == (-719903L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 29400000L + "'", long7 == 29400000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28199968L) + "'", long10 == (-28199968L));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1218");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        java.lang.String str13 = dateTimeZone2.getShortName((long) 1);
        long long15 = dateTimeZone2.convertUTCToLocal((long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str18 = dateTimeZone2.getShortName(21600000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60001L + "'", long15 == 60001L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1219");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName(21660000L);
        int int5 = dateTimeZone1.getOffsetFromLocal((-28680000L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(28800035L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1220");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1221");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) 10);
        long long5 = dateTimeZone1.previousTransition(0L);
        int int7 = dateTimeZone1.getOffset(31920000L);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1223");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long14 = dateTimeZone0.adjustOffset(100L, false);
        long long17 = dateTimeZone0.adjustOffset(30L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5700001L + "'", long9 == 5700001L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 30L + "'", long17 == 30L);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1224");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1225");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName((-28799900L), locale4);
        long long8 = dateTimeZone2.adjustOffset((-3599999L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599999L) + "'", long8 == (-3599999L));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1226");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long9 = dateTimeZone6.convertLocalToUTC((-22L), false);
        long long13 = dateTimeZone6.convertLocalToUTC((-22L), true, 120000L);
        long long15 = dateTimeZone6.previousTransition(96L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-22L) + "'", long9 == (-22L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-22L) + "'", long13 == (-22L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 96L + "'", long15 == 96L);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1227");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(10L, locale6);
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getNameKey((-28919900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1228");
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
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone2.getOffset(readableInstant23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:35" + "'", str16, "+01:35");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:35" + "'", str21, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60000 + "'", int24 == 60000);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1229");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        long long15 = dateTimeZone0.previousTransition((long) (-6720000));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59948L) + "'", long13 == (-59948L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-6720000L) + "'", long15 == (-6720000L));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1230");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone0.getOffset(readableInstant17);
        boolean boolean20 = dateTimeZone0.isStandardOffset(28740010L);
        long long23 = dateTimeZone0.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1231");
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
        java.lang.String str49 = dateTimeZone14.getName(100L, locale48);
        java.lang.String str50 = dateTimeZone14.getID();
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-59965L) + "'", long42 == (-59965L));
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Coordinated Universal Time" + "'", str49, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1232");
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
        long long43 = dateTimeZone0.convertLocalToUTC((long) (-3600000), true, 5700000L);
        java.lang.String str45 = dateTimeZone0.getName((long) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-60001L) + "'", long29 == (-60001L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-59900L) + "'", long38 == (-59900L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3660000L) + "'", long43 == (-3660000L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:01" + "'", str45, "+00:01");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1233");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        long long10 = dateTimeZone0.previousTransition((long) (byte) 10);
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1234");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        int int3 = dateTimeZone0.getOffsetFromLocal(53L);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str6 = dateTimeZone4.getShortName(1L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone4.getShortName(0L, locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone4.getName((long) '4', locale11);
        boolean boolean14 = dateTimeZone4.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone4.isLocalDateTimeGap(localDateTime15);
        boolean boolean17 = dateTimeZone4.isFixed();
        long long19 = dateTimeZone4.previousTransition(100L);
        int int21 = dateTimeZone4.getOffset((long) (short) 10);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        long long16 = dateTimeZone6.adjustOffset(0L, true);
        long long18 = dateTimeZone6.nextTransition(0L);
        int int20 = dateTimeZone6.getStandardOffset(120000L);
        java.lang.String str22 = dateTimeZone6.getName((long) '#');
        long long25 = dateTimeZone6.convertLocalToUTC((long) 25200000, true);
        java.lang.Class<?> wildcardClass26 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59969L) + "'", long13 == (-59969L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25140000L + "'", long25 == 25140000L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1236");
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
        java.lang.String str25 = dateTimeZone13.getShortName((long) (short) 0);
        long long27 = dateTimeZone13.convertUTCToLocal((-60032L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-59969L) + "'", long23 == (-59969L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-32L) + "'", long27 == (-32L));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1237");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        long long11 = dateTimeZone1.nextTransition((-59999L));
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59900L) + "'", long9 == (-59900L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59999L) + "'", long11 == (-59999L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1238");
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
        java.lang.Class<?> wildcardClass26 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1239");
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
        java.lang.String str32 = dateTimeZone0.getName(98L);
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
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1240");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.previousTransition(1L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1242");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1243");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long10 = dateTimeZone4.convertLocalToUTC((long) (-1), false, 22020000L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getShortName(1L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((long) 0, locale15);
        boolean boolean18 = dateTimeZone11.equals((java.lang.Object) '#');
        long long20 = dateTimeZone11.convertUTCToLocal((long) 1);
        boolean boolean21 = dateTimeZone4.equals((java.lang.Object) long20);
        int int23 = dateTimeZone4.getStandardOffset((-59999L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        boolean boolean30 = dateTimeZone28.isStandardOffset((long) (short) 0);
        long long32 = dateTimeZone28.nextTransition(0L);
        long long34 = dateTimeZone28.previousTransition(28800010L);
        long long36 = dateTimeZone4.getMillisKeepLocal(dateTimeZone28, 28800051L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60001L + "'", long20 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 28800010L + "'", long34 == 28800010L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 28800051L + "'", long36 == 28800051L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1245");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        int int4 = dateTimeZone2.getStandardOffset((-6779900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1246");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        long long12 = dateTimeZone0.adjustOffset((long) 1, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone15.convertUTCToLocal(1L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone15.getName((long) '#', locale19);
        boolean boolean22 = dateTimeZone15.isStandardOffset((-59999L));
        boolean boolean23 = dateTimeZone15.isFixed();
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone15.getName((-60000L), locale25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str29 = dateTimeZone27.getShortName(1L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone27.getShortName(0L, locale31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone27.getName((long) '4', locale34);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone27.getName((long) (short) -1, locale37);
        int int40 = dateTimeZone27.getOffset((long) 100);
        boolean boolean41 = dateTimeZone15.equals((java.lang.Object) dateTimeZone27);
        java.lang.String str43 = dateTimeZone27.getShortName(97L);
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone27.isLocalDateTimeGap(localDateTime44);
        long long47 = dateTimeZone0.getMillisKeepLocal(dateTimeZone27, 20L);
        long long50 = dateTimeZone27.convertLocalToUTC((long) '#', true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coordinated Universal Time" + "'", str20, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coordinated Universal Time" + "'", str26, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:01" + "'", str38, "+00:01");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60000 + "'", int40 == 60000);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:01" + "'", str43, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 20L + "'", long47 == 20L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-59965L) + "'", long50 == (-59965L));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1247");
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
        java.lang.String str19 = dateTimeZone14.getShortName((long) (byte) 1);
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-6720000));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(5639968L, locale3);
        boolean boolean6 = dateTimeZone1.isStandardOffset(32400001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:52" + "'", str4, "-01:52");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        long long10 = dateTimeZone1.nextTransition(22020000L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(60035L, locale14);
        long long17 = dateTimeZone1.previousTransition((-119968L));
        long long20 = dateTimeZone1.adjustOffset((-3599902L), true);
        long long22 = dateTimeZone1.convertUTCToLocal(3480097L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName(1L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone23.getShortName(0L, locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone23.getName((long) '4', locale30);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone23.getName((long) (short) -1, locale33);
        long long36 = dateTimeZone1.getMillisKeepLocal(dateTimeZone23, (-59968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-119968L) + "'", long17 == (-119968L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3599902L) + "'", long20 == (-3599902L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-119903L) + "'", long22 == (-119903L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-3719968L) + "'", long36 == (-3719968L));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1250");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        int int12 = dateTimeZone2.getStandardOffset((long) (short) -1);
        long long15 = dateTimeZone2.adjustOffset((long) '4', false);
        java.lang.String str16 = dateTimeZone2.toString();
        long long18 = dateTimeZone2.nextTransition((-28800032L));
        boolean boolean19 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-28800032L) + "'", long18 == (-28800032L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1251");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1252");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long4 = dateTimeZone1.adjustOffset((-28680000L), false);
        long long7 = dateTimeZone1.adjustOffset(67L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-28680000L) + "'", long4 == (-28680000L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 67L + "'", long7 == 67L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1253");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.lang.String str8 = dateTimeZone1.getShortName((-28859900L));
        int int10 = dateTimeZone1.getOffset((-60001L));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        long long14 = dateTimeZone1.convertUTCToLocal(36060000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36120000L + "'", long14 == 36120000L);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1254");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean15 = dateTimeZone2.equals((java.lang.Object) dateTimeZone14);
        java.lang.String str16 = dateTimeZone14.toString();
        int int18 = dateTimeZone14.getStandardOffset(68L);
        java.lang.String str19 = dateTimeZone14.getID();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1255");
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
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone0.getName((-1L), locale34);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1256");
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
        long long22 = dateTimeZone1.nextTransition(28680100L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.convertUTCToLocal(1L);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone25.getShortName((long) (byte) 10, locale29);
        long long33 = dateTimeZone25.adjustOffset((-28799900L), false);
        long long35 = dateTimeZone25.previousTransition((long) 1);
        boolean boolean37 = dateTimeZone25.isStandardOffset((-119903L));
        boolean boolean38 = dateTimeZone1.equals((java.lang.Object) boolean37);
        java.lang.String str40 = dateTimeZone1.getShortName((-39179968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-59965L) + "'", long20 == (-59965L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 28680100L + "'", long22 == 28680100L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-28799900L) + "'", long33 == (-28799900L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1257");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        int int9 = dateTimeZone0.getOffset(0L);
        java.lang.String str10 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1258");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (long) 25200000);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21660000L + "'", long14 == 21660000L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1259");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long3 = dateTimeZone1.nextTransition(22020000L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str10 = dateTimeZone9.toString();
        long long13 = dateTimeZone9.convertLocalToUTC((long) (-1), false);
        long long15 = dateTimeZone6.getMillisKeepLocal(dateTimeZone9, (long) 28800000);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        boolean boolean19 = dateTimeZone6.equals((java.lang.Object) dateTimeZone18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone18.getOffset(readableInstant20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getShortName((long) 'a', locale23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone18.getOffset(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone18.getOffset(readableInstant27);
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str33 = dateTimeZone32.toString();
        java.lang.String str35 = dateTimeZone32.getNameKey(10L);
        long long38 = dateTimeZone32.convertLocalToUTC(52L, true);
        long long40 = dateTimeZone32.nextTransition((-59900L));
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone32.isLocalDateTimeGap(localDateTime41);
        long long44 = dateTimeZone1.getMillisKeepLocal(dateTimeZone32, 60001L);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str48 = dateTimeZone47.toString();
        java.lang.String str50 = dateTimeZone47.getName((long) (short) 0);
        java.lang.String str52 = dateTimeZone47.getName(0L);
        java.lang.String str53 = dateTimeZone47.getID();
        long long55 = dateTimeZone47.nextTransition((long) (byte) 0);
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone47.getShortName(0L, locale57);
        java.lang.String str59 = dateTimeZone47.getID();
        boolean boolean61 = dateTimeZone47.isStandardOffset(0L);
        boolean boolean62 = dateTimeZone32.equals((java.lang.Object) boolean61);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 22020000L + "'", long3 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60001L) + "'", long13 == (-60001L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22020000L + "'", long15 == 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-59948L) + "'", long38 == (-59948L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-59900L) + "'", long40 == (-59900L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 33L + "'", long44 == 33L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:01" + "'", str48, "+00:01");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:01" + "'", str50, "+00:01");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:01" + "'", str52, "+00:01");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:01" + "'", str53, "+00:01");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:01" + "'", str58, "+00:01");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:01" + "'", str59, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1260");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str6 = dateTimeZone2.toString();
        long long8 = dateTimeZone2.previousTransition((-39599902L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-39599902L) + "'", long8 == (-39599902L));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1261");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str14 = dateTimeZone0.getID();
        java.lang.String str16 = dateTimeZone0.getName((long) 10);
        java.util.TimeZone timeZone17 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName(1L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName(0L, locale22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone18.getOffset(readableInstant24);
        boolean boolean26 = dateTimeZone18.isFixed();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone18.getShortName((long) 32, locale28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int33 = dateTimeZone31.getOffsetFromLocal((long) 100);
        java.lang.String str35 = dateTimeZone31.getName((-28799900L));
        long long37 = dateTimeZone31.previousTransition((-59903L));
        java.lang.String str38 = dateTimeZone31.getID();
        long long40 = dateTimeZone18.getMillisKeepLocal(dateTimeZone31, (-59903L));
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str44 = dateTimeZone43.toString();
        long long47 = dateTimeZone43.convertLocalToUTC((long) (-1), false);
        java.lang.String str48 = dateTimeZone43.getID();
        long long50 = dateTimeZone43.nextTransition(100L);
        boolean boolean51 = dateTimeZone43.isFixed();
        int int53 = dateTimeZone43.getStandardOffset((long) (short) -1);
        long long56 = dateTimeZone43.convertLocalToUTC(100L, true);
        boolean boolean57 = dateTimeZone18.equals((java.lang.Object) true);
        long long61 = dateTimeZone18.convertLocalToUTC((long) (-3600000), true, 5700000L);
        boolean boolean62 = dateTimeZone0.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-59903L) + "'", long37 == (-59903L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-00:00:00.001" + "'", str38, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:01" + "'", str44, "+00:01");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-60001L) + "'", long47 == (-60001L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:01" + "'", str48, "+00:01");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60000 + "'", int53 == 60000);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-59900L) + "'", long56 == (-59900L));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-3660000L) + "'", long61 == (-3660000L));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1262");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean12 = dateTimeZone2.isFixed();
        int int14 = dateTimeZone2.getOffset((-32399969L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1263");
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
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone14.getOffset(readableInstant21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone14.getName((-32339968L), locale24);
        java.lang.String str27 = dateTimeZone14.getShortName(36L);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coordinated Universal Time" + "'", str25, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(4200000L, locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1265");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        long long14 = dateTimeZone2.adjustOffset(22080000L, false);
        java.lang.String str15 = dateTimeZone2.getID();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone2.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 22080000L + "'", long14 == 22080000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1266");
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
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone52.getName((long) (short) 1, locale54);
        java.lang.String str57 = dateTimeZone52.getShortName(0L);
        long long60 = dateTimeZone52.convertLocalToUTC((long) (short) 100, true);
        long long62 = dateTimeZone52.nextTransition((-59999L));
        java.util.Locale locale64 = null;
        java.lang.String str65 = dateTimeZone52.getName((long) (byte) 100, locale64);
        int int67 = dateTimeZone52.getOffset((long) (short) 10);
        long long69 = dateTimeZone28.getMillisKeepLocal(dateTimeZone52, 3480097L);
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
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:01" + "'", str40, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60000 + "'", int44 == 60000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60000 + "'", int46 == 60000);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:01" + "'", str48, "+00:01");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-28740000L) + "'", long50 == (-28740000L));
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:01" + "'", str55, "+00:01");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:01" + "'", str57, "+00:01");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-59900L) + "'", long60 == (-59900L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-59999L) + "'", long62 == (-59999L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:01" + "'", str65, "+00:01");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 60000 + "'", int67 == 60000);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 3480097L + "'", long69 == 3480097L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1267");
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
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str21 = dateTimeZone20.toString();
        java.lang.String str23 = dateTimeZone20.getName((long) (short) 0);
        long long26 = dateTimeZone20.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone20.isLocalDateTimeGap(localDateTime27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone20.getOffset(readableInstant29);
        boolean boolean31 = dateTimeZone1.equals((java.lang.Object) readableInstant29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-60000L) + "'", long26 == (-60000L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60000 + "'", int30 == 60000);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1268");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone2 = dateTimeZone0.toTimeZone();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((-28799899L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1269");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-28799900L), locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey(60052L);
        int int9 = dateTimeZone1.getOffset((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3600000) + "'", int9 == (-3600000));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1270");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        int int9 = dateTimeZone2.getStandardOffset((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long12 = dateTimeZone2.previousTransition((-180001L));
        java.lang.String str14 = dateTimeZone2.getName(28800001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-180001L) + "'", long12 == (-180001L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1271");
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
        java.lang.String str18 = dateTimeZone2.getNameKey(3660031L);
        int int20 = dateTimeZone2.getStandardOffset(21659999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1272");
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
        int int31 = dateTimeZone8.getOffset(60001L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName(1L);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone32.getName((long) 0, locale36);
        boolean boolean39 = dateTimeZone32.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = dateTimeZone32.getOffset(readableInstant40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getShortName(1L);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone42.getShortName(0L, locale46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        int int49 = dateTimeZone42.getOffset(readableInstant48);
        long long51 = dateTimeZone32.getMillisKeepLocal(dateTimeZone42, (long) (short) 10);
        long long53 = dateTimeZone42.convertUTCToLocal(28800010L);
        boolean boolean54 = dateTimeZone8.equals((java.lang.Object) long53);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60000 + "'", int41 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:01" + "'", str44, "+00:01");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:01" + "'", str47, "+00:01");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60000 + "'", int49 == 60000);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 28860010L + "'", long53 == 28860010L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1273");
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
        long long18 = dateTimeZone1.adjustOffset((-59965L), true);
        long long20 = dateTimeZone1.previousTransition((long) (byte) 1);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getShortName((-32279968L), locale22);
        long long25 = dateTimeZone1.nextTransition(21960001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 21960001L + "'", long25 == 21960001L);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1274");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        boolean boolean10 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1275");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long11 = dateTimeZone0.previousTransition((-1L));
        long long13 = dateTimeZone0.previousTransition((-60000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60000L) + "'", long13 == (-60000L));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1276");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60035L + "'", long15 == 60035L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1277");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        int int10 = dateTimeZone2.getOffset((long) (short) 100);
        java.lang.String str12 = dateTimeZone2.getShortName(0L);
        int int14 = dateTimeZone2.getOffset(0L);
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
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1278");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        boolean boolean8 = dateTimeZone2.isFixed();
        boolean boolean9 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        java.lang.String str12 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1279");
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
        long long21 = dateTimeZone0.convertLocalToUTC((-120001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-60022L) + "'", long18 == (-60022L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-180001L) + "'", long21 == (-180001L));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1280");
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
        int int44 = dateTimeZone2.getOffset((long) 100);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone2.getName(54L, locale46);
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:01" + "'", str47, "+00:01");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1281");
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
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone0.isLocalDateTimeGap(localDateTime20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone0.getName(3480097L, locale23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone0.getOffset(readableInstant25);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59999L) + "'", long16 == (-59999L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1282");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-28799969L), locale11);
        java.lang.String str13 = dateTimeZone1.getID();
        boolean boolean15 = dateTimeZone1.isStandardOffset((-119900L));
        java.lang.String str17 = dateTimeZone1.getName(32400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59900L) + "'", long9 == (-59900L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1283");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        int int6 = dateTimeZone1.getOffset((-2L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) (short) 0);
        java.lang.String str14 = dateTimeZone11.toString();
        java.lang.String str16 = dateTimeZone11.getName((long) (byte) 10);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) str16);
        long long21 = dateTimeZone1.convertLocalToUTC((-120001L), false, (long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long24 = dateTimeZone1.convertUTCToLocal(28800051L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-180001L) + "'", long21 == (-180001L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 28860051L + "'", long24 == 28860051L);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1284");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (byte) 0);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) (byte) -1, locale9);
        long long12 = dateTimeZone1.nextTransition((-28799900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-28799900L) + "'", long12 == (-28799900L));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1285");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        long long10 = dateTimeZone0.previousTransition((-28799900L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName((long) 3600000, locale12);
        java.lang.String str15 = dateTimeZone0.getNameKey(0L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName((-28799901L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28799900L) + "'", long10 == (-28799900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1286");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        long long14 = dateTimeZone2.nextTransition(60001L);
        java.util.TimeZone timeZone15 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60001L + "'", long14 == 60001L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1287");
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
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 1);
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTimeZone17);
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
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1288");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 10);
        java.lang.String str4 = dateTimeZone2.getName((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:10" + "'", str4, "+01:10");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1289");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        java.lang.String str15 = dateTimeZone1.getNameKey(5400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59969L) + "'", long13 == (-59969L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1290");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getNameKey(5639968L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1291");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        int int6 = dateTimeZone2.getOffsetFromLocal((-28800032L));
        long long8 = dateTimeZone2.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getName(60001L);
        java.lang.String str6 = dateTimeZone1.getNameKey((-2L));
        long long8 = dateTimeZone1.previousTransition((-719903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+08:00" + "'", str4, "+08:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-719903L) + "'", long8 == (-719903L));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1293");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (short) -1, locale10);
        long long14 = dateTimeZone0.adjustOffset((-119900L), true);
        long long16 = dateTimeZone0.convertUTCToLocal((-119903L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getShortName((-6719900L), locale18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-119900L) + "'", long14 == (-119900L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59903L) + "'", long16 == (-59903L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1294");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        boolean boolean3 = dateTimeZone0.isStandardOffset(5640001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1295");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        boolean boolean8 = dateTimeZone2.isFixed();
        boolean boolean9 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getShortName(1L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone12.getShortName(0L, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone12.getName((long) '4', locale19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone12.getName(53L, locale22);
        int int25 = dateTimeZone12.getOffset((long) 25200000);
        boolean boolean26 = dateTimeZone2.equals((java.lang.Object) dateTimeZone12);
        java.util.TimeZone timeZone27 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1296");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str13 = dateTimeZone2.toString();
        java.lang.String str14 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1297");
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
        boolean boolean23 = dateTimeZone0.isStandardOffset((-32459969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-119903L) + "'", long18 == (-119903L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1298");
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
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone0.isLocalDateTimeGap(localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getShortName(1L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone29.getShortName(0L, locale33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone29.getName((long) '4', locale36);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone29.getName((long) (short) -1, locale39);
        int int42 = dateTimeZone29.getOffset((long) 100);
        java.lang.String str44 = dateTimeZone29.getShortName(60034L);
        boolean boolean45 = dateTimeZone0.equals((java.lang.Object) str44);
        long long49 = dateTimeZone0.convertLocalToUTC(11L, true, 36120000L);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:01" + "'", str40, "+00:01");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60000 + "'", int42 == 60000);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:01" + "'", str44, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-59989L) + "'", long49 == (-59989L));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1299");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        long long11 = dateTimeZone2.convertUTCToLocal((-28799966L));
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getName((long) (short) 1, locale15);
        long long20 = dateTimeZone13.convertLocalToUTC((-28799900L), true, (long) '#');
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone13.getName((long) 28800000, locale22);
        java.lang.Class<?> wildcardClass24 = dateTimeZone13.getClass();
        boolean boolean25 = dateTimeZone2.equals((java.lang.Object) dateTimeZone13);
        long long27 = dateTimeZone2.previousTransition(7200098L);
        boolean boolean28 = dateTimeZone2.isFixed();
        int int30 = dateTimeZone2.getStandardOffset(35L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28799966L) + "'", long11 == (-28799966L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-28859900L) + "'", long20 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 7200098L + "'", long27 == 7200098L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1300");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        long long16 = dateTimeZone6.adjustOffset(0L, true);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone6.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59969L) + "'", long13 == (-59969L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1301");
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
        java.util.TimeZone timeZone18 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-59965L) + "'", long12 == (-59965L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 28680100L + "'", long17 == 28680100L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1303");
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
        long long18 = dateTimeZone1.adjustOffset((-59965L), true);
        java.lang.String str19 = dateTimeZone1.toString();
        long long21 = dateTimeZone1.nextTransition((-28859965L));
        long long24 = dateTimeZone1.convertLocalToUTC((long) (-3600000), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28859965L) + "'", long21 == (-28859965L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3660000L) + "'", long24 == (-3660000L));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1304");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone5.convertUTCToLocal(60010L);
        boolean boolean9 = dateTimeZone5.isStandardOffset((long) 100);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60010L + "'", long7 == 60010L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1305");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1306");
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
        long long18 = dateTimeZone1.adjustOffset((-59965L), true);
        java.lang.String str19 = dateTimeZone1.toString();
        long long21 = dateTimeZone1.nextTransition((-28859965L));
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getName((-59990L), locale23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone1.getOffset(readableInstant25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28859965L) + "'", long21 == (-28859965L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1307");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-59903L), locale8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        int int12 = dateTimeZone1.getOffsetFromLocal((-28739966L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1308");
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
        int int31 = dateTimeZone8.getStandardOffset(0L);
        int int33 = dateTimeZone8.getOffsetFromLocal((-32L));
        java.util.TimeZone timeZone34 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        int int37 = dateTimeZone35.getOffset((long) (short) 100);
        long long39 = dateTimeZone35.nextTransition(60054L);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 60054L + "'", long39 == 60054L);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1309");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1310");
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
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 5520000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 5520000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1312");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean4 = dateTimeZone1.isStandardOffset((-28919900L));
        long long8 = dateTimeZone1.convertLocalToUTC((-22L), false, (long) '4');
        long long10 = dateTimeZone1.convertUTCToLocal(59999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60022L) + "'", long8 == (-60022L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 119999L + "'", long10 == 119999L);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1313");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) "Indochina Time");
        int int7 = dateTimeZone1.getOffset((-28919900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1314");
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
        long long19 = dateTimeZone0.convertLocalToUTC(52L, true);
        java.lang.String str21 = dateTimeZone0.getName((-179900L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str25 = dateTimeZone24.toString();
        long long28 = dateTimeZone24.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        java.lang.String str30 = dateTimeZone24.getID();
        long long33 = dateTimeZone24.convertLocalToUTC((long) 'a', false);
        boolean boolean35 = dateTimeZone24.isStandardOffset((long) 100);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone24.getShortName(0L, locale37);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone24, (-2L));
        java.util.TimeZone timeZone41 = dateTimeZone24.toTimeZone();
        java.lang.Class<?> wildcardClass42 = dateTimeZone24.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59999L) + "'", long16 == (-59999L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59948L) + "'", long19 == (-59948L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-60001L) + "'", long28 == (-60001L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-59903L) + "'", long33 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:01" + "'", str38, "+00:01");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-2L) + "'", long40 == (-2L));
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1315");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(100L);
        int int7 = dateTimeZone2.getStandardOffset((-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1316");
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
        int int19 = dateTimeZone14.getStandardOffset(5400000L);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1317");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1318");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.convertUTCToLocal((-32339968L));
        int int12 = dateTimeZone2.getOffset((-3659902L));
        java.lang.String str14 = dateTimeZone2.getNameKey(97L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-32279968L) + "'", long10 == (-32279968L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1319");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        boolean boolean10 = dateTimeZone0.isFixed();
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (byte) 0);
        long long15 = dateTimeZone0.adjustOffset((long) '#', true);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        int int19 = dateTimeZone0.getStandardOffset(5639967L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1320");
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
        long long52 = dateTimeZone14.adjustOffset(100L, true);
        int int54 = dateTimeZone14.getStandardOffset((-3719902L));
        org.joda.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = dateTimeZone14.isLocalDateTimeGap(localDateTime55);
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeZone14.getName((-32339968L), locale58);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 60052L + "'", long33 == 60052L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:01" + "'", str41, "+00:01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:01" + "'", str42, "+00:01");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:01" + "'", str46, "+00:01");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 60001L + "'", long48 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 60000 + "'", int54 == 60000);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:01" + "'", str59, "+00:01");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1321");
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
        long long23 = dateTimeZone0.convertLocalToUTC(32400000L, false, 5700001L);
        long long25 = dateTimeZone0.convertUTCToLocal((-3600001L));
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32340000L + "'", long23 == 32340000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3540001L) + "'", long25 == (-3540001L));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1322");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        long long8 = dateTimeZone2.convertLocalToUTC(52L, true);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59948L) + "'", long8 == (-59948L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1323");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str13 = dateTimeZone12.toString();
        long long16 = dateTimeZone12.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        java.lang.String str18 = dateTimeZone12.getID();
        long long21 = dateTimeZone12.convertLocalToUTC((long) 'a', false);
        boolean boolean23 = dateTimeZone12.isStandardOffset((long) 100);
        boolean boolean25 = dateTimeZone12.isStandardOffset((long) (short) 0);
        java.lang.String str26 = dateTimeZone12.getID();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone28.isLocalDateTimeGap(localDateTime30);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone28.getName(10L, locale33);
        long long37 = dateTimeZone28.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str41 = dateTimeZone40.toString();
        long long44 = dateTimeZone40.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        long long47 = dateTimeZone40.convertUTCToLocal(0L);
        java.lang.String str49 = dateTimeZone40.getShortName((long) (short) 100);
        long long51 = dateTimeZone28.getMillisKeepLocal(dateTimeZone40, (long) 60000);
        boolean boolean52 = dateTimeZone12.equals((java.lang.Object) dateTimeZone40);
        int int54 = dateTimeZone40.getOffset(52L);
        java.util.TimeZone timeZone55 = dateTimeZone40.toTimeZone();
        boolean boolean56 = dateTimeZone1.equals((java.lang.Object) timeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        long long59 = dateTimeZone57.previousTransition(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-60001L) + "'", long16 == (-60001L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-59903L) + "'", long21 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-60001L) + "'", long37 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:01" + "'", str41, "+00:01");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-60001L) + "'", long44 == (-60001L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 60000L + "'", long47 == 60000L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:01" + "'", str49, "+00:01");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 60000L + "'", long51 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 60000 + "'", int54 == 60000);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 36000000L + "'", long59 == 36000000L);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1324");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean23 = dateTimeZone13.equals((java.lang.Object) dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60034L + "'", long19 == 60034L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1325");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getShortName((long) 'a');
        java.lang.String str9 = dateTimeZone1.getID();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(0L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1327");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        java.lang.String str13 = dateTimeZone2.toString();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone2.isLocalDateTimeGap(localDateTime14);
        java.util.TimeZone timeZone16 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1328");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        long long16 = dateTimeZone6.adjustOffset(0L, true);
        long long18 = dateTimeZone6.nextTransition(0L);
        int int20 = dateTimeZone6.getStandardOffset(120000L);
        java.lang.String str22 = dateTimeZone6.getName((long) '#');
        long long25 = dateTimeZone6.convertLocalToUTC((long) 25200000, true);
        long long27 = dateTimeZone6.previousTransition(5760000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59969L) + "'", long13 == (-59969L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25140000L + "'", long25 == 25140000L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 5760000L + "'", long27 == 5760000L);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1329");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str9 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long6 = dateTimeZone3.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-28800000L) + "'", long6 == (-28800000L));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1331");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.convertUTCToLocal(1L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone12.getShortName((long) (byte) 10, locale16);
        boolean boolean18 = dateTimeZone0.equals((java.lang.Object) (byte) 10);
        long long21 = dateTimeZone0.convertLocalToUTC(10L, true);
        long long24 = dateTimeZone0.adjustOffset((-179935L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-59990L) + "'", long21 == (-59990L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-179935L) + "'", long24 == (-179935L));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1332");
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
        long long16 = dateTimeZone0.adjustOffset((-25199900L), false);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getName(29400000L, locale18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone0.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1333");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str7 = dateTimeZone2.getName(28800000L);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int11 = dateTimeZone9.getStandardOffset(28740001L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1334");
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
        boolean boolean23 = dateTimeZone0.isFixed();
        java.lang.Class<?> wildcardClass24 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1335");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        java.lang.String str15 = dateTimeZone0.getNameKey((-3659965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59948L) + "'", long13 == (-59948L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1336");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        boolean boolean10 = dateTimeZone2.equals((java.lang.Object) (-28799968L));
        long long12 = dateTimeZone2.nextTransition(31L);
        boolean boolean13 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 31L + "'", long12 == 31L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1337");
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
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        java.lang.String str19 = dateTimeZone17.getShortName((-28739964L));
        boolean boolean21 = dateTimeZone17.isStandardOffset(5700000L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, 2L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone2.getShortName((-28859932L), locale25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
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
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:52" + "'", str19, "-01:52");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 6720002L + "'", long23 == 6720002L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1338");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int5 = dateTimeZone2.getOffsetFromLocal(5699968L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone2.getShortName(28800051L);
        int int11 = dateTimeZone2.getOffset((long) 28800000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1339");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str14 = dateTimeZone0.getID();
        java.lang.String str16 = dateTimeZone0.getName((long) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone0.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1340");
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
        java.lang.String str17 = dateTimeZone2.getName((long) (short) 0, locale16);
        long long19 = dateTimeZone2.previousTransition((-28859965L));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone2.getName(5759968L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-28859965L) + "'", long19 == (-28859965L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1341");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        long long14 = dateTimeZone0.convertLocalToUTC(0L, true);
        long long17 = dateTimeZone0.convertLocalToUTC((-119969L), false);
        int int19 = dateTimeZone0.getOffsetFromLocal(5700000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-60000L) + "'", long14 == (-60000L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-179969L) + "'", long17 == (-179969L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1342");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone0.getStandardOffset((-59899L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1343");
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
        java.lang.String str19 = dateTimeZone2.getName(51L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean26 = dateTimeZone24.isStandardOffset((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone29.getShortName(3540097L, locale32);
        boolean boolean34 = dateTimeZone24.equals((java.lang.Object) str33);
        long long36 = dateTimeZone2.getMillisKeepLocal(dateTimeZone24, (-179900L));
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
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-119900L) + "'", long36 == (-119900L));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1344");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.convertUTCToLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60100L + "'", long9 == 60100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1345");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long10 = dateTimeZone6.convertLocalToUTC((long) 10, true, (long) (short) 10);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 10, true);
        java.util.TimeZone timeZone14 = dateTimeZone6.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1346");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        long long10 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (-179966L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-179966L) + "'", long10 == (-179966L));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1347");
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
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.getID();
        boolean boolean28 = dateTimeZone25.isStandardOffset((-28919900L));
        long long32 = dateTimeZone25.convertLocalToUTC((-22L), false, (long) '4');
        boolean boolean33 = dateTimeZone2.equals((java.lang.Object) '4');
        java.lang.String str35 = dateTimeZone2.getShortName((long) '#');
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
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-60022L) + "'", long32 == (-60022L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:01" + "'", str35, "+00:01");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1348");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.String str9 = dateTimeZone1.getShortName((-179969L));
        long long12 = dateTimeZone1.adjustOffset(59905L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 59905L + "'", long12 == 59905L);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1349");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (short) -1, locale10);
        long long14 = dateTimeZone0.adjustOffset((-119900L), true);
        long long16 = dateTimeZone0.convertUTCToLocal((-119903L));
        long long18 = dateTimeZone0.convertUTCToLocal(28740132L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-119900L) + "'", long14 == (-119900L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59903L) + "'", long16 == (-59903L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 28800132L + "'", long18 == 28800132L);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1350");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean11 = dateTimeZone2.isStandardOffset(10L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getName((-25199900L), locale13);
        long long18 = dateTimeZone2.convertLocalToUTC((long) 5700000, true, 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5700000L + "'", long18 == 5700000L);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1351");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = dateTimeZone0.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName(22020000L, locale10);
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "13) test1351(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "10) test1351(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "9) test1351(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky "8) test1351(JA_009_Regression2)":         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1352");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int5 = dateTimeZone3.getOffsetFromLocal((-28859900L));
        int int7 = dateTimeZone3.getOffset((-59969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1353");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        long long11 = dateTimeZone1.nextTransition((-59999L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) (byte) 100, locale13);
        java.lang.String str15 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "14) test1353(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
// flaky "11) test1353(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
// flaky "10) test1353(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59999L) + "'", long11 == (-59999L));
// flaky "9) test1353(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
// flaky "6) test1353(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1354");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        long long7 = dateTimeZone1.adjustOffset((-59947L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59947L) + "'", long7 == (-59947L));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1355");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone0.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "15) test1355(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "12) test1355(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "11) test1355(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "10) test1355(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "7) test1355(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "3) test1355(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
// flaky "1) test1355(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
// flaky "1) test1355(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1356");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone4.convertUTCToLocal(1L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone4.getName((long) '#', locale8);
        boolean boolean11 = dateTimeZone4.isStandardOffset((-59999L));
        boolean boolean12 = dateTimeZone4.isFixed();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (-59999L));
        int int16 = dateTimeZone4.getOffset(54L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3659999L) + "'", long14 == (-3659999L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1357");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (byte) 1, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "16) test1357(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "13) test1357(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1358");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        int int13 = dateTimeZone5.getStandardOffset((-1L));
        java.util.TimeZone timeZone14 = dateTimeZone5.toTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long19 = dateTimeZone16.adjustOffset((long) (byte) 10, false);
        java.lang.String str20 = dateTimeZone16.getID();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone16.getOffset(readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str31 = dateTimeZone30.toString();
        java.lang.String str33 = dateTimeZone30.getName((long) (short) 0);
        java.lang.String str35 = dateTimeZone30.getName(0L);
        long long37 = dateTimeZone25.getMillisKeepLocal(dateTimeZone30, (long) (short) 1);
        int int39 = dateTimeZone25.getStandardOffset((long) 1);
        long long42 = dateTimeZone25.convertLocalToUTC((long) 10, true);
        long long44 = dateTimeZone16.getMillisKeepLocal(dateTimeZone25, (long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str47 = dateTimeZone45.getShortName(1L);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone45.getShortName(0L, locale49);
        int int52 = dateTimeZone45.getOffsetFromLocal(1L);
        java.lang.String str54 = dateTimeZone45.getName((long) 25200000);
        int int56 = dateTimeZone45.getOffsetFromLocal((long) (short) -1);
        java.lang.String str58 = dateTimeZone45.getShortName((long) (byte) -1);
        long long60 = dateTimeZone45.previousTransition(60052L);
        long long62 = dateTimeZone25.getMillisKeepLocal(dateTimeZone45, 21960000L);
        boolean boolean63 = dateTimeZone5.equals((java.lang.Object) 21960000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
// flaky "17) test1358(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
// flaky "14) test1358(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
// flaky "12) test1358(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone45);
// flaky "11) test1358(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTC" + "'", str47, "UTC");
// flaky "8) test1358(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
// flaky "4) test1358(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
// flaky "2) test1358(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Coordinated Universal Time" + "'", str54, "Coordinated Universal Time");
// flaky "2) test1358(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
// flaky "1) test1358(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "UTC" + "'", str58, "UTC");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 60052L + "'", long60 == 60052L);
// flaky "1) test1358(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 21960000L + "'", long62 == 21960000L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1359");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str6 = dateTimeZone4.getName((-32219968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+08:00" + "'", str6, "+08:00");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1360");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59999L));
        java.lang.String str12 = dateTimeZone2.getName(22020000L);
        long long15 = dateTimeZone2.adjustOffset((-120001L), false);
        java.lang.Class<?> wildcardClass16 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-120001L) + "'", long15 == (-120001L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1362");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone4.adjustOffset((-22L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-22L) + "'", long7 == (-22L));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1363");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1364");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        long long14 = dateTimeZone0.convertLocalToUTC(0L, true);
        long long17 = dateTimeZone0.adjustOffset((long) (byte) -1, true);
        java.util.TimeZone timeZone18 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "18) test1364(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "15) test1364(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "13) test1364(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "12) test1364(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "9) test1364(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(timeZone18);
// flaky "5) test1364(JA_009_Regression2)":         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1365");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "19) test1365(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
// flaky "16) test1365(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
// flaky "14) test1365(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "13) test1365(JA_009_Regression2)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
// flaky "10) test1365(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1366");
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
        int int27 = dateTimeZone14.getStandardOffset((-28799899L));
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1367");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.lang.String str8 = dateTimeZone1.getShortName((-28859900L));
        boolean boolean10 = dateTimeZone1.isStandardOffset(60034L);
        boolean boolean12 = dateTimeZone1.isStandardOffset(28739999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "20) test1367(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
// flaky "17) test1367(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
// flaky "15) test1367(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1368");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getOffset(22080000L);
        long long12 = dateTimeZone1.adjustOffset(5700033L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "21) test1368(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "18) test1368(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5700033L + "'", long12 == 5700033L);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1369");
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
        long long52 = dateTimeZone14.adjustOffset(100L, true);
        boolean boolean53 = dateTimeZone14.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "22) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "19) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "16) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "14) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "11) test1369(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "6) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "3) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
// flaky "3) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
// flaky "2) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
// flaky "2) test1369(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "1) test1369(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
// flaky "1) test1369(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:01" + "'", str41, "+00:01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:01" + "'", str42, "+00:01");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:01" + "'", str46, "+00:01");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 60001L + "'", long48 == 60001L);
// flaky "1) test1369(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1370");
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
        long long22 = dateTimeZone10.convertLocalToUTC(32400000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "23) test1370(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "20) test1370(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "17) test1370(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "15) test1370(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky "12) test1370(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "7) test1370(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
// flaky "4) test1370(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32400000L + "'", long22 == 32400000L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1371");
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
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone18.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getName((long) (short) 0);
        java.lang.String str28 = dateTimeZone23.getName(0L);
        long long30 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) (short) 1);
        java.lang.String str32 = dateTimeZone18.getNameKey((-59999L));
        long long35 = dateTimeZone18.adjustOffset((long) (byte) 10, false);
        long long39 = dateTimeZone18.convertLocalToUTC((long) 32, false, 60010L);
        java.lang.String str41 = dateTimeZone18.getShortName(60032L);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int45 = dateTimeZone43.getOffsetFromLocal((long) 100);
        java.lang.String str47 = dateTimeZone43.getName((-28799900L));
        long long49 = dateTimeZone43.previousTransition((-59903L));
        java.lang.String str50 = dateTimeZone43.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        boolean boolean52 = dateTimeZone18.equals((java.lang.Object) dateTimeZone43);
        long long54 = dateTimeZone0.getMillisKeepLocal(dateTimeZone43, (long) 36000000);
        long long57 = dateTimeZone0.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "24) test1371(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "21) test1371(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "18) test1371(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "16) test1371(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "13) test1371(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "8) test1371(JA_009_Regression2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-59999L) + "'", long30 == (-59999L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-00:00:00.001" + "'", str47, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-59903L) + "'", long49 == (-59903L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-00:00:00.001" + "'", str50, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "5) test1371(JA_009_Regression2)":         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 36000001L + "'", long54 == 36000001L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1372");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        boolean boolean10 = dateTimeZone0.isFixed();
        long long13 = dateTimeZone0.convertLocalToUTC((long) '#', true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36L + "'", long13 == 36L);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1373");
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
        long long16 = dateTimeZone0.adjustOffset((-25199900L), false);
        boolean boolean18 = dateTimeZone0.isStandardOffset(120000L);
        java.lang.String str20 = dateTimeZone0.getShortName(0L);
        int int22 = dateTimeZone0.getOffsetFromLocal((-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1374");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        boolean boolean8 = dateTimeZone2.isFixed();
        boolean boolean9 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone2.getName((-36059948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1375");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 32);
        long long4 = dateTimeZone2.previousTransition((-179868L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-179868L) + "'", long4 == (-179868L));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1376");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone3.adjustOffset(0L, false);
        int int8 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone3.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1377");
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
        java.lang.String str15 = dateTimeZone0.toString();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        int int19 = dateTimeZone0.getStandardOffset((-3659901L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1378");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 10, true);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str8 = dateTimeZone7.getID();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone7.isLocalDateTimeGap(localDateTime9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getName(10L, locale12);
        long long16 = dateTimeZone7.adjustOffset((-60001L), true);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str20 = dateTimeZone19.toString();
        long long23 = dateTimeZone19.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        long long26 = dateTimeZone19.convertUTCToLocal(0L);
        java.lang.String str28 = dateTimeZone19.getShortName((long) (short) 100);
        long long30 = dateTimeZone7.getMillisKeepLocal(dateTimeZone19, (long) 60000);
        long long32 = dateTimeZone7.convertUTCToLocal((-28979900L));
        java.lang.String str34 = dateTimeZone7.getShortName((long) (-1));
        long long36 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, 5520010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-60001L) + "'", long16 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-60001L) + "'", long23 == (-60001L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 60000L + "'", long26 == 60000L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-28979901L) + "'", long32 == (-28979901L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 5580011L + "'", long36 == 5580011L);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1379");
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
        java.lang.String str17 = dateTimeZone0.getShortName(4200000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1380");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-59990L), false, 53L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName(1L, locale7);
        long long12 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false, 21660000L);
        boolean boolean14 = dateTimeZone0.isStandardOffset((-25139900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-59990L) + "'", long4 == (-59990L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1381");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-28799969L), locale11);
        java.lang.String str13 = dateTimeZone1.getID();
        boolean boolean15 = dateTimeZone1.isStandardOffset((-119900L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(36L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1382");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(1L, locale3);
        long long7 = dateTimeZone1.adjustOffset((long) (short) 0, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+08:00" + "'", str4, "+08:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1383");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        boolean boolean12 = dateTimeZone0.isStandardOffset(28740010L);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone0.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1384");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        long long10 = dateTimeZone2.adjustOffset((-28799900L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long14 = dateTimeZone2.convertLocalToUTC((-36059948L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28799900L) + "'", long10 == (-28799900L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-36059948L) + "'", long14 == (-36059948L));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1385");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1386");
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
        long long28 = dateTimeZone0.convertLocalToUTC(28680100L, true, (long) 32);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28680100L + "'", long28 == 28680100L);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1387");
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
        java.lang.Class<?> wildcardClass22 = dateTimeZone10.getClass();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28800010L + "'", long21 == 28800010L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1388");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName((long) (byte) -1, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1389");
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
        long long26 = dateTimeZone14.convertLocalToUTC((-119970L), false, 5580010L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-119970L) + "'", long26 == (-119970L));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1390");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName(1L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName(0L, locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getName((long) '4', locale25);
        java.lang.String str28 = dateTimeZone18.getNameKey((long) '4');
        int int30 = dateTimeZone18.getOffsetFromLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        java.lang.String str33 = dateTimeZone18.getNameKey(1L);
        long long36 = dateTimeZone18.adjustOffset((long) (short) 0, true);
        int int38 = dateTimeZone18.getStandardOffset((-59900L));
        java.lang.String str40 = dateTimeZone18.getName((long) 28800000);
        long long43 = dateTimeZone18.adjustOffset((long) 10, false);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone18.getShortName((long) '#', locale45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone18.getOffset(readableInstant47);
        boolean boolean49 = dateTimeZone0.equals((java.lang.Object) readableInstant47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str52 = dateTimeZone50.getShortName(1L);
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone50.getShortName(0L, locale54);
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone50.getName((long) '4', locale57);
        boolean boolean59 = dateTimeZone50.isFixed();
        java.lang.String str61 = dateTimeZone50.getShortName((-60001L));
        java.lang.String str62 = dateTimeZone50.toString();
        java.lang.String str63 = dateTimeZone50.toString();
        long long65 = dateTimeZone0.getMillisKeepLocal(dateTimeZone50, 60000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coordinated Universal Time" + "'", str26, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Coordinated Universal Time" + "'", str40, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTC" + "'", str55, "UTC");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Coordinated Universal Time" + "'", str58, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "UTC" + "'", str61, "UTC");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTC" + "'", str62, "UTC");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "UTC" + "'", str63, "UTC");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 60000L + "'", long65 == 60000L);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1391");
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
        boolean boolean36 = dateTimeZone0.isFixed();
        boolean boolean37 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone38 = dateTimeZone0.toTimeZone();
        boolean boolean40 = dateTimeZone0.isStandardOffset(36060000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60000L) + "'", long22 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5639968L + "'", long25 == 5639968L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60034L + "'", long35 == 60034L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1392");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-59903L), locale8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        int int12 = dateTimeZone1.getStandardOffset((long) (short) 0);
        long long14 = dateTimeZone1.convertUTCToLocal((-32279968L));
        long long16 = dateTimeZone1.nextTransition((-28859932L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-32279968L) + "'", long14 == (-32279968L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-28859932L) + "'", long16 == (-28859932L));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1393");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone6.convertUTCToLocal((long) (short) 0);
        java.util.TimeZone timeZone9 = dateTimeZone6.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1394");
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
        java.lang.Class<?> wildcardClass18 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1395");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.nextTransition((-1L));
        long long6 = dateTimeZone1.convertLocalToUTC(28800010L, false);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long13 = dateTimeZone9.convertLocalToUTC(5460000L, false, 5759968L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200010L + "'", long6 == 25200010L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1860000L + "'", long13 == 1860000L);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1396");
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
        int int18 = dateTimeZone0.getOffsetFromLocal((-32339968L));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str22 = dateTimeZone21.toString();
        java.lang.String str24 = dateTimeZone21.getName((long) (short) 0);
        java.lang.String str26 = dateTimeZone21.getName(0L);
        java.lang.String str27 = dateTimeZone21.getID();
        long long29 = dateTimeZone21.nextTransition(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long33 = dateTimeZone21.convertLocalToUTC((-59968L), false);
        boolean boolean34 = dateTimeZone21.isFixed();
        boolean boolean35 = dateTimeZone0.equals((java.lang.Object) dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-119968L) + "'", long33 == (-119968L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1397");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertUTCToLocal((long) '4');
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass11 = timeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 51L + "'", long9 == 51L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-60001L), locale4);
        long long7 = dateTimeZone1.convertUTCToLocal(0L);
        int int9 = dateTimeZone1.getOffset(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(60036L, true);
        long long14 = dateTimeZone1.convertUTCToLocal((-59969L));
        java.lang.String str16 = dateTimeZone1.getName((-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60036L + "'", long12 == 60036L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59969L) + "'", long14 == (-59969L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1399");
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
        long long22 = dateTimeZone2.convertUTCToLocal((-59999L));
        java.lang.String str23 = dateTimeZone2.toString();
        long long27 = dateTimeZone2.convertLocalToUTC(60003L, true, 31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3L + "'", long27 == 3L);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1400");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition(60052L);
        java.lang.Class<?> wildcardClass16 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60052L + "'", long15 == 60052L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1401");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        int int8 = dateTimeZone1.getStandardOffset(60000L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1402");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        boolean boolean16 = dateTimeZone2.equals((java.lang.Object) 0);
        boolean boolean17 = dateTimeZone2.isFixed();
        long long19 = dateTimeZone2.nextTransition(0L);
        long long21 = dateTimeZone2.previousTransition((-119903L));
        long long23 = dateTimeZone2.convertUTCToLocal((long) 60000);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone2.getShortName(22020001L, locale25);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-119903L) + "'", long21 == (-119903L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60000L + "'", long23 == 60000L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1403");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        boolean boolean12 = dateTimeZone5.isFixed();
        long long16 = dateTimeZone5.convertLocalToUTC(33L, true, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59967L) + "'", long16 == (-59967L));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1404");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (short) -1, locale10);
        long long13 = dateTimeZone0.convertUTCToLocal((-59969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59970L) + "'", long13 == (-59970L));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1405");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str8 = dateTimeZone7.toString();
        java.lang.String str10 = dateTimeZone7.getName((long) (short) 0);
        java.lang.String str12 = dateTimeZone7.getName(0L);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) (short) 1);
        boolean boolean16 = dateTimeZone2.equals((java.lang.Object) 0);
        boolean boolean17 = dateTimeZone2.isFixed();
        boolean boolean19 = dateTimeZone2.isStandardOffset(22020000L);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1406");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        long long9 = dateTimeZone2.adjustOffset(5639967L, true);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5639967L + "'", long9 == 5639967L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1407");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 10);
        boolean boolean3 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1408");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean27 = dateTimeZone1.isStandardOffset((long) (-1));
        java.lang.String str29 = dateTimeZone1.getShortName(5700000L);
        boolean boolean31 = dateTimeZone1.isStandardOffset(28680100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1409");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        java.lang.String str14 = dateTimeZone6.toString();
        java.lang.String str15 = dateTimeZone6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1410");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int17 = dateTimeZone0.getOffset(36000001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1411");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int4 = dateTimeZone0.getOffsetFromLocal((-59948L));
        int int6 = dateTimeZone0.getOffsetFromLocal(25200000L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getName((long) 0, locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (byte) 10);
        java.lang.String str15 = dateTimeZone14.getID();
        int int17 = dateTimeZone14.getOffset((-3719902L));
        long long19 = dateTimeZone8.getMillisKeepLocal(dateTimeZone14, 9360000L);
        java.lang.String str21 = dateTimeZone14.getShortName((-60002L));
        long long23 = dateTimeZone14.previousTransition((-6779900L));
        long long25 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (-3719968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:10" + "'", str15, "+01:10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4200000 + "'", int17 == 4200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5159999L + "'", long19 == 5159999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+01:10" + "'", str21, "+01:10");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-6779900L) + "'", long23 == (-6779900L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-7919968L) + "'", long25 == (-7919968L));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1412");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone2.getOffset(readableInstant4);
        int int7 = dateTimeZone2.getOffsetFromLocal((-10320000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1413");
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
        long long19 = dateTimeZone0.convertUTCToLocal((long) 5700000);
        java.lang.String str21 = dateTimeZone0.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5700000L + "'", long19 == 5700000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 5700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1415");
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
        long long25 = dateTimeZone0.adjustOffset(53L, true);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone0.getName((-3540001L), locale27);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 53L + "'", long25 == 53L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coordinated Universal Time" + "'", str28, "Coordinated Universal Time");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1416");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getShortName((long) 'a');
        long long11 = dateTimeZone1.convertLocalToUTC((-119968L), true);
        int int13 = dateTimeZone1.getStandardOffset((-28859900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-119967L) + "'", long11 == (-119967L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1417");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str14 = dateTimeZone0.getID();
        java.lang.String str16 = dateTimeZone0.getName((long) 10);
        java.util.TimeZone timeZone17 = dateTimeZone0.toTimeZone();
        long long19 = dateTimeZone0.previousTransition(32400000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32400000L + "'", long19 == 32400000L);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1418");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long7 = dateTimeZone1.previousTransition((-59903L));
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59903L) + "'", long7 == (-59903L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1419");
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
        long long19 = dateTimeZone0.convertLocalToUTC(52L, true);
        java.lang.String str21 = dateTimeZone0.getName((-179900L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str25 = dateTimeZone24.toString();
        long long28 = dateTimeZone24.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        java.lang.String str30 = dateTimeZone24.getID();
        long long33 = dateTimeZone24.convertLocalToUTC((long) 'a', false);
        boolean boolean35 = dateTimeZone24.isStandardOffset((long) 100);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone24.getShortName(0L, locale37);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone24, (-2L));
        java.util.TimeZone timeZone41 = dateTimeZone24.toTimeZone();
        int int43 = dateTimeZone24.getOffsetFromLocal((-119999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinated Universal Time" + "'", str21, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-60001L) + "'", long28 == (-60001L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-59903L) + "'", long33 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:01" + "'", str38, "+00:01");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-60002L) + "'", long40 == (-60002L));
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60000 + "'", int43 == 60000);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1420");
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
        long long17 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        long long21 = dateTimeZone0.convertLocalToUTC((-119936L), false, (-119965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59990L) + "'", long11 == (-59990L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-179936L) + "'", long21 == (-179936L));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1421");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        boolean boolean15 = dateTimeZone2.isStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone2.getID();
        java.lang.String str18 = dateTimeZone2.getName((-32459899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1422");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName(53L, locale10);
        boolean boolean12 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1423");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str8 = dateTimeZone6.getShortName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName(0L, locale10);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 32);
        int int15 = dateTimeZone6.getOffsetFromLocal((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59969L) + "'", long13 == (-59969L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1424");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1425");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.previousTransition(1L);
        java.lang.String str6 = dateTimeZone2.getShortName(32340097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1426");
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
        java.lang.String str22 = dateTimeZone2.getName(32340097L);
        long long25 = dateTimeZone2.convertLocalToUTC((long) '4', false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-59948L) + "'", long25 == (-59948L));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1427");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.nextTransition((-1L));
        long long6 = dateTimeZone1.convertLocalToUTC(28800010L, false);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone10.adjustOffset((long) (byte) 10, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long16 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (-6720000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200010L + "'", long6 == 25200010L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3180000L) + "'", long16 == (-3180000L));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1428");
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
        int int13 = dateTimeZone4.getStandardOffset((-3719902L));
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1429");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 10);
        long long5 = dateTimeZone2.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1430");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1431");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long3 = dateTimeZone1.nextTransition(22020000L);
        java.lang.String str5 = dateTimeZone1.getName((long) (byte) 10);
        long long8 = dateTimeZone1.adjustOffset((-60000L), true);
        long long10 = dateTimeZone1.previousTransition(60010L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((long) 0, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 22020000L + "'", long3 == 22020000L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60010L + "'", long10 == 60010L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.032" + "'", str13, "+00:00:00.032");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1432");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1433");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long4 = dateTimeZone2.nextTransition((-3599902L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3599902L) + "'", long4 == (-3599902L));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1434");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean4 = dateTimeZone3.isFixed();
        boolean boolean5 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1435");
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
        java.lang.String str20 = dateTimeZone2.getNameKey((-119903L));
        java.lang.String str22 = dateTimeZone2.getName((-119900L));
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone2.getName(97L, locale24);
        long long27 = dateTimeZone2.nextTransition((-28919899L));
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-28919899L) + "'", long27 == (-28919899L));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1436");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str7 = dateTimeZone2.getName(28800000L);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName((-28739964L), locale11);
        java.lang.String str13 = dateTimeZone9.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1437");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        long long17 = dateTimeZone0.nextTransition((-3659902L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3659902L) + "'", long17 == (-3659902L));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1438");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        long long10 = dateTimeZone1.nextTransition(22020000L);
        long long13 = dateTimeZone1.convertLocalToUTC(0L, false);
        boolean boolean15 = dateTimeZone1.isStandardOffset((long) 10);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1439");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        int int23 = dateTimeZone21.getOffset((-179903L));
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1440");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) "Indochina Time");
        boolean boolean8 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1441");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName((-60032L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1443");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) 32, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1444");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        java.lang.String str11 = dateTimeZone0.toString();
        java.lang.String str12 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1445");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1446");
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
        long long22 = dateTimeZone1.nextTransition(28680100L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long27 = dateTimeZone25.convertUTCToLocal(1L);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone25.getShortName((long) (byte) 10, locale29);
        long long33 = dateTimeZone25.adjustOffset((-28799900L), false);
        long long35 = dateTimeZone25.previousTransition((long) 1);
        boolean boolean37 = dateTimeZone25.isStandardOffset((-119903L));
        boolean boolean38 = dateTimeZone1.equals((java.lang.Object) boolean37);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 28680100L + "'", long22 == 28680100L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-28799900L) + "'", long33 == (-28799900L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1447");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        long long13 = dateTimeZone2.convertLocalToUTC(100L, false);
        long long15 = dateTimeZone2.previousTransition((-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59900L) + "'", long13 == (-59900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59948L) + "'", long15 == (-59948L));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1448");
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
        java.lang.String str16 = dateTimeZone0.getShortName((-1080032L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 100);
        long long22 = dateTimeZone18.previousTransition(100L);
        java.lang.String str23 = dateTimeZone18.toString();
        java.lang.String str25 = dateTimeZone18.getShortName((long) 'a');
        long long28 = dateTimeZone18.convertLocalToUTC((-119968L), true);
        long long30 = dateTimeZone0.getMillisKeepLocal(dateTimeZone18, 3540097L);
        java.lang.Class<?> wildcardClass31 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-119967L) + "'", long28 == (-119967L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600098L + "'", long30 == 3600098L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1449");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        java.lang.String str6 = dateTimeZone2.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(3540097L, locale8);
        int int11 = dateTimeZone2.getOffsetFromLocal(1L);
        java.lang.String str13 = dateTimeZone2.getNameKey((-719903L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1450");
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
        java.lang.String str25 = dateTimeZone16.getShortName((long) (-1));
        java.lang.String str27 = dateTimeZone16.getNameKey((-60022L));
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1451");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        boolean boolean10 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.getShortName(60000L);
        java.lang.String str14 = dateTimeZone2.getShortName(28680100L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone2.getOffset(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone2.getOffset(readableInstant17);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone2.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1452");
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
        int int20 = dateTimeZone2.getOffset(10L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone2.getShortName((long) 60000, locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone2.getName((-6719900L), locale25);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coordinated Universal Time" + "'", str26, "Coordinated Universal Time");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1453");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long7 = dateTimeZone1.previousTransition((-59903L));
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getShortName((long) 25200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getOffset((-59967L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59903L) + "'", long7 == (-59903L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1454");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        boolean boolean20 = dateTimeZone1.isStandardOffset((-28919901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28799899L) + "'", long8 == (-28799899L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1455");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        int int4 = dateTimeZone2.getOffsetFromLocal(53L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-6720000) + "'", int4 == (-6720000));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1456");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        int int13 = dateTimeZone0.getOffset((-59965L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1457");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        long long5 = dateTimeZone2.convertLocalToUTC(22020000L, false);
        long long9 = dateTimeZone2.convertLocalToUTC(59999L, true, (long) (short) 1);
        int int11 = dateTimeZone2.getStandardOffset((-25139900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28740000L + "'", long5 == 28740000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 6779999L + "'", long9 == 6779999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-6720000) + "'", int11 == (-6720000));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1458");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '#');
        int int4 = dateTimeZone2.getStandardOffset(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean6 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        boolean boolean12 = dateTimeZone8.isStandardOffset(5700001L);
        long long15 = dateTimeZone8.convertLocalToUTC((-59948L), false);
        int int17 = dateTimeZone8.getOffsetFromLocal((long) (short) 1);
        long long19 = dateTimeZone8.previousTransition((long) 60000);
        boolean boolean20 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5700000 + "'", int4 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59948L) + "'", long15 == (-59948L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60000L + "'", long19 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-6720000));
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) (byte) 100);
        int int7 = dateTimeZone2.getOffsetFromLocal(21960000L);
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) 10);
        long long11 = dateTimeZone2.convertUTCToLocal(5580010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6719990L) + "'", long9 == (-6719990L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5580010L + "'", long11 == 5580010L);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1460");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        int int6 = dateTimeZone1.getOffset((-60001L));
        java.lang.String str7 = dateTimeZone1.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((-22L), locale9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getName((long) (short) 0);
        java.lang.String str18 = dateTimeZone13.getName(0L);
        java.lang.String str19 = dateTimeZone13.getID();
        int int21 = dateTimeZone13.getOffset((long) (short) 100);
        java.lang.String str23 = dateTimeZone13.getShortName(0L);
        boolean boolean25 = dateTimeZone13.isStandardOffset(60000L);
        boolean boolean26 = dateTimeZone1.equals((java.lang.Object) 60000L);
        long long28 = dateTimeZone1.convertUTCToLocal((-28799968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-28799968L) + "'", long28 == (-28799968L));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1461");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        java.lang.String str15 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str17 = dateTimeZone0.getShortName(99L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+01:35" + "'", str9, "+01:35");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5700000 + "'", int11 == 5700000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:35" + "'", str13, "+01:35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:35" + "'", str15, "+01:35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:35" + "'", str17, "+01:35");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1462");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1463");
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
        long long19 = dateTimeZone2.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone2.getName((long) '4');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone2.getShortName(53L, locale23);
        long long27 = dateTimeZone2.convertLocalToUTC(132L, false);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinated Universal Time" + "'", str21, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 132L + "'", long27 == 132L);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1464");
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
        long long23 = dateTimeZone1.convertUTCToLocal((-28859899L));
        java.lang.String str25 = dateTimeZone1.getShortName(3L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:35" + "'", str4, "+01:35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5700000 + "'", int11 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-32459899L) + "'", long23 == (-32459899L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-01:00" + "'", str25, "-01:00");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1465");
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
        java.lang.String str34 = dateTimeZone0.toString();
        long long37 = dateTimeZone0.adjustOffset((-3719968L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5700000 + "'", int12 == 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:35" + "'", str16, "+01:35");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:35" + "'", str19, "+01:35");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:35" + "'", str22, "+01:35");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5700000 + "'", int26 == 5700000);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5700000 + "'", int33 == 5700000);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:35" + "'", str34, "+01:35");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3719968L) + "'", long37 == (-3719968L));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1466");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (long) 25200000);
        int int16 = dateTimeZone12.getOffsetFromLocal(3600097L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone12.getShortName((long) 5520000, locale18);
        long long21 = dateTimeZone12.convertUTCToLocal((-179969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-5700000L) + "'", long8 == (-5700000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5700000 + "'", int10 == 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 27300000L + "'", long14 == 27300000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3600000 + "'", int16 == 3600000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3420031L + "'", long21 == 3420031L);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1467");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:35" + "'", str4, "+01:35");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:35" + "'", str6, "+01:35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1468");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        boolean boolean10 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        java.lang.String str12 = dateTimeZone5.getName(28800052L);
        long long14 = dateTimeZone5.convertUTCToLocal(9L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60009L + "'", long14 == 60009L);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1469");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (byte) 0);
        int int9 = dateTimeZone1.getStandardOffset(60032L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int12 = dateTimeZone1.getOffset((-3600001L));
        long long14 = dateTimeZone1.nextTransition((-119970L));
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5700000 + "'", int9 == 5700000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5700000 + "'", int12 == 5700000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-119970L) + "'", long14 == (-119970L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+01:35");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1470");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        long long9 = dateTimeZone0.previousTransition((-60001L));
        long long13 = dateTimeZone0.convertLocalToUTC(28800010L, false, (-59969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5700000 + "'", int7 == 5700000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 23100010L + "'", long13 == 23100010L);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1471");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        long long8 = dateTimeZone2.convertLocalToUTC(52L, true);
        long long10 = dateTimeZone2.nextTransition((-59900L));
        java.lang.String str11 = dateTimeZone2.toString();
        int int13 = dateTimeZone2.getOffset((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59948L) + "'", long8 == (-59948L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59900L) + "'", long10 == (-59900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1472");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str6 = dateTimeZone2.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName(99L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1473");
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
        long long17 = dateTimeZone0.convertUTCToLocal((long) 60000);
        long long19 = dateTimeZone0.nextTransition((-28799968L));
        long long22 = dateTimeZone0.adjustOffset(0L, true);
        java.lang.String str24 = dateTimeZone0.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:35" + "'", str8, "+01:35");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5700000 + "'", int12 == 5700000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:35" + "'", str13, "+01:35");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5700000 + "'", int15 == 5700000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5760000L + "'", long17 == 5760000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-28799968L) + "'", long19 == (-28799968L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:35" + "'", str24, "+01:35");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1474");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.Class<?> wildcardClass6 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1475");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59948L));
        java.lang.String str11 = dateTimeZone2.getID();
        int int13 = dateTimeZone2.getOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1476");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long14 = dateTimeZone0.adjustOffset(100L, false);
        long long17 = dateTimeZone0.convertLocalToUTC((-39599901L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:35" + "'", str5, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5700001L + "'", long9 == 5700001L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-45299901L) + "'", long17 == (-45299901L));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1477");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        int int6 = dateTimeZone1.getOffset((-60001L));
        java.lang.String str7 = dateTimeZone1.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(0L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinated Universal Time" + "'", str10, "Coordinated Universal Time");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1478");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        long long6 = dateTimeZone2.convertUTCToLocal(1L);
        boolean boolean8 = dateTimeZone2.isStandardOffset((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60001L + "'", long6 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1479");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        int int6 = dateTimeZone1.getOffset((-2L));
        boolean boolean8 = dateTimeZone1.isStandardOffset(22020001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5700000 + "'", int6 == 5700000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1480");
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
        long long26 = dateTimeZone1.convertUTCToLocal((-28979900L));
        java.lang.String str28 = dateTimeZone1.getShortName((long) (-1));
        long long30 = dateTimeZone1.previousTransition((long) (short) 0);
        long long32 = dateTimeZone1.convertUTCToLocal((-119969L));
        java.lang.String str33 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:35" + "'", str2, "+01:35");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5700000L + "'", long24 == 5700000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-23279900L) + "'", long26 == (-23279900L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+01:35" + "'", str28, "+01:35");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5580031L + "'", long32 == 5580031L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+01:35" + "'", str33, "+01:35");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1481");
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
        long long22 = dateTimeZone2.convertUTCToLocal((-59999L));
        java.lang.String str23 = dateTimeZone2.toString();
        boolean boolean24 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1482");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition((long) (byte) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName(0L, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getShortName(3540097L, locale16);
        java.lang.String str19 = dateTimeZone2.getName((-1140032L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1483");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean10 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone0.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1484");
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
        long long29 = dateTimeZone0.adjustOffset((-60000L), false);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone0.getShortName(100L, locale31);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-60000L) + "'", long29 == (-60000L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1485");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) -1);
        long long15 = dateTimeZone0.previousTransition((-59999L));
        long long18 = dateTimeZone0.convertLocalToUTC((long) 32, true);
        java.lang.String str20 = dateTimeZone0.getNameKey(27300000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59999L) + "'", long15 == (-59999L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59968L) + "'", long18 == (-59968L));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1486");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-3719968L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1487");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        long long8 = dateTimeZone1.convertLocalToUTC((-28799900L), true, (-119903L));
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        int int12 = dateTimeZone1.getOffset((-60032L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1488");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        long long10 = dateTimeZone1.nextTransition(22020000L);
        long long13 = dateTimeZone1.adjustOffset((-28859900L), false);
        long long15 = dateTimeZone1.previousTransition((-59990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-28859900L) + "'", long13 == (-28859900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59990L) + "'", long15 == (-59990L));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1489");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getOffset(22080000L);
        int int11 = dateTimeZone1.getOffset(0L);
        int int13 = dateTimeZone1.getOffsetFromLocal(60036L);
        java.lang.String str14 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1490");
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
        long long26 = dateTimeZone1.convertUTCToLocal((-28979900L));
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str30 = dateTimeZone29.toString();
        long long33 = dateTimeZone29.convertLocalToUTC((long) (-1), false);
        java.lang.String str34 = dateTimeZone29.getID();
        long long36 = dateTimeZone29.nextTransition(100L);
        boolean boolean37 = dateTimeZone29.isFixed();
        java.util.TimeZone timeZone38 = dateTimeZone29.toTimeZone();
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) timeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60000L + "'", long24 == 60000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28919900L) + "'", long26 == (-28919900L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-60001L) + "'", long33 == (-60001L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1491");
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
        long long26 = dateTimeZone1.convertUTCToLocal((-28979900L));
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str30 = dateTimeZone29.toString();
        long long33 = dateTimeZone29.convertLocalToUTC((long) (-1), false);
        java.lang.String str34 = dateTimeZone29.getID();
        long long36 = dateTimeZone29.nextTransition(100L);
        boolean boolean37 = dateTimeZone29.isFixed();
        java.util.TimeZone timeZone38 = dateTimeZone29.toTimeZone();
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) timeZone38);
        boolean boolean40 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60000L + "'", long24 == 60000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28919900L) + "'", long26 == (-28919900L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-60001L) + "'", long33 == (-60001L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1492");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        int int6 = dateTimeZone2.getStandardOffset(22020000L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName(1L);
        java.lang.String str11 = dateTimeZone7.getName((-119900L));
        long long13 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (-23279900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-23279900L) + "'", long13 == (-23279900L));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1493");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        int int6 = dateTimeZone1.getOffset((-60001L));
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.getID();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone8.isLocalDateTimeGap(localDateTime10);
        java.util.TimeZone timeZone12 = dateTimeZone8.toTimeZone();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1494");
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
        long long19 = dateTimeZone0.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName(1L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone20.getName((long) 0, locale24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone20.getOffset(readableInstant26);
        long long29 = dateTimeZone20.previousTransition((-60001L));
        long long31 = dateTimeZone20.nextTransition((long) (-3600000));
        long long33 = dateTimeZone0.getMillisKeepLocal(dateTimeZone20, (long) 32);
        java.lang.String str35 = dateTimeZone20.getNameKey(6720002L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59999L) + "'", long16 == (-59999L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59948L) + "'", long19 == (-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-60001L) + "'", long29 == (-60001L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-3600000L) + "'", long31 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1495");
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
        java.util.TimeZone timeZone27 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1496");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1497");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        int int12 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        long long16 = dateTimeZone0.convertLocalToUTC(0L, true, 60010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-60000L) + "'", long16 == (-60000L));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1498");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition((long) (byte) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName(0L, locale12);
        java.lang.String str14 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) 10);
        long long5 = dateTimeZone1.previousTransition(0L);
        int int7 = dateTimeZone1.getOffset(31920000L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_009_Regression2.test1500");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str15 = dateTimeZone13.getShortName(1L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone13.getName((long) 0, locale17);
        boolean boolean20 = dateTimeZone13.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone13.getOffset(readableInstant21);
        boolean boolean24 = dateTimeZone13.isStandardOffset(52L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone13.isLocalDateTimeGap(localDateTime25);
        java.lang.String str28 = dateTimeZone13.getNameKey((long) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean30 = dateTimeZone2.equals((java.lang.Object) dateTimeZone13);
        java.lang.String str32 = dateTimeZone2.getName((-119967L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
    }
}
