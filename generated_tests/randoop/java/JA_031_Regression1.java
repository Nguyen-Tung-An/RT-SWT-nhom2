import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_031_Regression1 {

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
            System.out.format("%n%s%n", "JA_031_Regression1.test0501");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        int int3 = dateTimeZone1.getOffset(34L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-59947L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((long) ' ', locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0503");
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0504");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+08:00" + "'", str2, "+08:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+08:00" + "'", str8, "+08:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28800000 + "'", int11 == 28800000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+08:00" + "'", str16, "+08:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-119967L) + "'", long28 == (-119967L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32340098L + "'", long30 == 32340098L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0505");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0506");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) '4');
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.Class<?> wildcardClass4 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:52" + "'", str3, "+00:52");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(32400000L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0509");
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0510");
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0511");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-32279968L) + "'", long14 == (-32279968L));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0512");
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0513");
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0514");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 25200000);
        long long7 = dateTimeZone1.convertLocalToUTC((-179903L), false, 98L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-179935L) + "'", long7 == (-179935L));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0515");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0516");
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0517");
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0518");
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0519");
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0520");
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0521");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 53L + "'", long19 == 53L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
// flaky "1) test0521(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-60001L) + "'", long29 == (-60001L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-3600000L) + "'", long31 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0522");
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
// flaky "2) test0522(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "2) test0522(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "2) test0522(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "2) test0522(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
// flaky "2) test0522(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-59903L) + "'", long22 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "2) test0522(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0523");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-32339968L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+08:00" + "'", str4, "+08:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+08:00" + "'", str7, "+08:00");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0524");
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0525");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0526");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition(11L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0527");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 25200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0528");
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0529");
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0530");
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
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0531");
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0532");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        long long6 = dateTimeZone1.nextTransition(52L);
        java.lang.String str8 = dateTimeZone1.getNameKey((-28740000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0533");
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0534");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0535");
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
// flaky "3) test0535(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "3) test0535(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "3) test0535(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "3) test0535(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "3) test0535(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "3) test0535(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59990L) + "'", long18 == (-59990L));
// flaky "2) test0535(JA_031_Regression1)":         org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0536");
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
// flaky "4) test0536(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 36L + "'", long42 == 36L);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Coordinated Universal Time" + "'", str49, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0537");
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
// flaky "5) test0537(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "4) test0537(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "4) test0537(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "4) test0537(JA_031_Regression1)":         org.junit.Assert.assertNull(str10);
// flaky "4) test0537(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "4) test0537(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
// flaky "3) test0537(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 34L + "'", long15 == 34L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0538");
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
// flaky "6) test0538(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "5) test0538(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "5) test0538(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky "5) test0538(JA_031_Regression1)":         org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "5) test0538(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-119969L) + "'", long25 == (-119969L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0539");
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
// flaky "7) test0539(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "6) test0539(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "6) test0539(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "6) test0539(JA_031_Regression1)":         org.junit.Assert.assertNull(str10);
// flaky "6) test0539(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60000L) + "'", long22 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
// flaky "5) test0539(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5639967L + "'", long25 == 5639967L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
// flaky "4) test0539(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0540");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        java.lang.String str4 = dateTimeZone2.getShortName((-28739964L));
        int int6 = dateTimeZone2.getOffsetFromLocal((-28800032L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:52" + "'", str4, "-01:52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6720000) + "'", int6 == (-6720000));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0541");
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
        int int24 = dateTimeZone2.getStandardOffset(3540097L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky "8) test0541(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60000 + "'", int24 == 60000);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0542");
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
// flaky "9) test0542(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "7) test0542(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "7) test0542(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60001L + "'", long13 == 60001L);
// flaky "7) test0542(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0543");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "10) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "8) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "8) test0543(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky "8) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
// flaky "7) test0543(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "6) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
// flaky "5) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
// flaky "2) test0543(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
// flaky "2) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
// flaky "2) test0543(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
// flaky "1) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-59999L) + "'", long29 == (-59999L));
        org.junit.Assert.assertNotNull(timeZone30);
// flaky "1) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
// flaky "1) test0543(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
// flaky "1) test0543(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-00:00:00.001" + "'", str35, "-00:00:00.001");
// flaky "1) test0543(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 28800001L + "'", long38 == 28800001L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-28979901L) + "'", long40 == (-28979901L));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0544");
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
// flaky "11) test0544(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "9) test0544(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "9) test0544(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
// flaky "9) test0544(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0545");
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
// flaky "12) test0545(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "10) test0545(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "10) test0545(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 25200000L + "'", long16 == 25200000L);
// flaky "10) test0545(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0546");
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
        long long28 = dateTimeZone1.convertLocalToUTC(22020000L, false, 25140000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "13) test0546(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "11) test0546(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
// flaky "11) test0546(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
// flaky "11) test0546(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 22020001L + "'", long28 == 22020001L);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0547");
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0548");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-10320000L) + "'", long23 == (-10320000L));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0549");
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
        long long24 = dateTimeZone14.nextTransition(59999L);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 59999L + "'", long24 == 59999L);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0550");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        int int8 = dateTimeZone1.getOffset((-59990L));
        boolean boolean10 = dateTimeZone1.isStandardOffset((-28979900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0551");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0552");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-59947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0553");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str3 = dateTimeZone1.getNameKey(52L);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        int int7 = dateTimeZone4.getOffsetFromLocal((long) (byte) 100);
        long long10 = dateTimeZone4.adjustOffset((-28859900L), true);
        java.util.TimeZone timeZone11 = dateTimeZone4.toTimeZone();
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, 3540097L);
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
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0554");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540097L + "'", long13 == 3540097L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 28799999L + "'", long16 == 28799999L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0555");
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0556");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        java.lang.String str13 = dateTimeZone5.getName(5700032L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0557");
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0558");
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0559");
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0561");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((-28799965L));
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-28799965L) + "'", long4 == (-28799965L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0562");
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0563");
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
        long long22 = dateTimeZone0.convertLocalToUTC((-28799900L), true);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone0.getShortName(28740100L, locale24);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-28799899L) + "'", long22 == (-28799899L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0564");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName(21660000L);
        int int5 = dateTimeZone1.getOffsetFromLocal((-28680000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        int int3 = dateTimeZone1.getStandardOffset((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0566");
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0567");
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
// flaky "14) test0567(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
// flaky "12) test0567(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
// flaky "12) test0567(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinated Universal Time" + "'", str21, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0568");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        int int9 = dateTimeZone1.getOffset(22080000L);
        int int11 = dateTimeZone1.getOffset(0L);
        long long15 = dateTimeZone1.convertLocalToUTC(32L, false, 5639967L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "15) test0568(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "13) test0568(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "13) test0568(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "12) test0568(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0569");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(25200000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 25200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0570");
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
// flaky "16) test0570(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "14) test0570(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "14) test0570(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
// flaky "13) test0570(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
// flaky "8) test0570(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0572");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0573");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone5.convertUTCToLocal(60010L);
        boolean boolean9 = dateTimeZone5.isStandardOffset((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60010L + "'", long7 == 60010L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0574");
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
// flaky "17) test0574(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "15) test0574(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "15) test0574(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "14) test0574(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0575");
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
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0577");
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0578");
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
        org.joda.time.DateTimeZone dateTimeZone24 = null; // flaky "18) test0578(JA_031_Regression1)": org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "16) test0578(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "16) test0578(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "15) test0578(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "9) test0578(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky "7) test0578(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "6) test0578(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "3) test0578(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky "3) test0578(JA_031_Regression1)":         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
// flaky "3) test0578(JA_031_Regression1)":         org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0579");
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
// flaky "19) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "17) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "17) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "16) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "10) test0579(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "8) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "7) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
// flaky "4) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
// flaky "4) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
// flaky "4) test0579(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "2) test0579(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
// flaky "2) test0579(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-59902L) + "'", long36 == (-59902L));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0580");
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
        long long28 = dateTimeZone0.convertLocalToUTC((-59968L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "20) test0580(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "18) test0580(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "18) test0580(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "17) test0580(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
// flaky "11) test0580(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "9) test0580(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "8) test0580(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
// flaky "5) test0580(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-59968L) + "'", long28 == (-59968L));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0581");
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
// flaky "21) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "19) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "19) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky "18) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
// flaky "12) test0581(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "10) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
// flaky "9) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
// flaky "6) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
// flaky "5) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
// flaky "5) test0581(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "3) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
// flaky "3) test0581(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Coordinated Universal Time" + "'", str33, "Coordinated Universal Time");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0582");
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
// flaky "22) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "20) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "20) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "19) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "13) test0582(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "11) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
// flaky "10) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
// flaky "7) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coordinated Universal Time" + "'", str26, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "6) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coordinated Universal Time" + "'", str32, "Coordinated Universal Time");
// flaky "6) test0582(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
// flaky "4) test0582(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1020032L) + "'", long35 == (-1020032L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0584");
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0585");
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
        long long21 = dateTimeZone0.adjustOffset((long) (byte) 0, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "23) test0585(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "21) test0585(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "21) test0585(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "20) test0585(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "14) test0585(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0586");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getShortName((-1L));
        int int5 = dateTimeZone1.getStandardOffset((-179969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "24) test0586(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
// flaky "22) test0586(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0587");
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0588");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long4 = dateTimeZone1.nextTransition(22020000L);
        java.lang.String str5 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 22020000L + "'", long4 == 22020000L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0591");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        long long4 = dateTimeZone1.adjustOffset((-28680000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-28680000L) + "'", long4 == (-28680000L));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0592");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        java.lang.String str11 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0593");
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
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60000 + "'", int24 == 60000);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0594");
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0595");
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0596");
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0597");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(4200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0598");
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0599");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        java.lang.String str7 = dateTimeZone4.toString();
        long long9 = dateTimeZone4.previousTransition((long) 60000);
        long long13 = dateTimeZone4.convertLocalToUTC(0L, false, 5760000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0600");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0601");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0602");
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0603");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0604");
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0605");
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0606");
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0607");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0608");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+07:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0609");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0610");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long5 = dateTimeZone2.convertLocalToUTC((long) 10, true);
        int int7 = dateTimeZone2.getOffset(28740010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0611");
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0612");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(5520000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0613");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(5699968L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0614");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "25) test0614(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky "23) test0614(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
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
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0615");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.nextTransition((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 28800000, false, (-1020032L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 25200000L + "'", long7 == 25200000L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0616");
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0617");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "26) test0617(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "24) test0617(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-60001L) + "'", long17 == (-60001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
// flaky "22) test0617(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "21) test0617(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-00:00:00.001" + "'", str29, "-00:00:00.001");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0618");
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
// flaky "27) test0618(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0619");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.lang.String str9 = dateTimeZone0.getNameKey(5699968L);
        long long11 = dateTimeZone0.convertUTCToLocal((-120000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "28) test0619(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "25) test0619(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "23) test0619(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky "22) test0619(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-120001L) + "'", long11 == (-120001L));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0621");
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
        long long18 = dateTimeZone11.nextTransition((long) (short) 100);
        java.lang.String str20 = dateTimeZone11.getShortName(42L);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0622");
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
        long long21 = dateTimeZone0.previousTransition((-28799899L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "29) test0622(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "26) test0622(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "24) test0622(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky "23) test0622(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28799899L) + "'", long21 == (-28799899L));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0623");
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
// flaky "30) test0623(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "27) test0623(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "25) test0623(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "24) test0623(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
// flaky "15) test0623(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
// flaky "12) test0623(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-00:00:00.001" + "'", str23, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-59999L) + "'", long25 == (-59999L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0624");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "31) test0624(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "28) test0624(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "26) test0624(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
// flaky "25) test0624(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky "16) test0624(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0625");
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
// flaky "32) test0625(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
// flaky "29) test0625(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "27) test0625(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "26) test0625(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "17) test0625(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0626");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(10L, locale6);
        java.lang.String str8 = dateTimeZone1.getID();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "33) test0626(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "30) test0626(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
// flaky "28) test0626(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "27) test0626(JA_031_Regression1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0627");
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
// flaky "34) test0627(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "31) test0627(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "29) test0627(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
// flaky "28) test0627(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky "18) test0627(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky "13) test0627(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-28739964L) + "'", long27 == (-28739964L));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0628");
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
// flaky "35) test0628(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
// flaky "32) test0628(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
// flaky "30) test0628(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky "29) test0628(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "19) test0628(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky "14) test0628(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "11) test0628(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "8) test0628(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36L + "'", long20 == 36L);
// flaky "7) test0628(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
// flaky "7) test0628(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0629");
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
// flaky "36) test0629(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "33) test0629(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "31) test0629(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "30) test0629(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
// flaky "20) test0629(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "15) test0629(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0630");
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
        java.lang.String str21 = dateTimeZone1.toString();
        boolean boolean23 = dateTimeZone1.isStandardOffset(54L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "37) test0630(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
// flaky "34) test0630(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
// flaky "32) test0630(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
// flaky "31) test0630(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0631");
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0632");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0633");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "38) test0633(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "35) test0633(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "33) test0633(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "32) test0633(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "21) test0633(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "16) test0633(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
// flaky "12) test0633(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32400001L + "'", long23 == 32400001L);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0634");
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
// flaky "39) test0634(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "36) test0634(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "34) test0634(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "33) test0634(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
// flaky "22) test0634(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
// flaky "17) test0634(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky "13) test0634(JA_031_Regression1)":         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertNull(str26);
// flaky "9) test0634(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-60002L) + "'", long28 == (-60002L));
// flaky "8) test0634(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-119968L) + "'", long31 == (-119968L));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0635");
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0636");
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0637");
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0638");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0639");
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0640");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0641");
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0642");
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0643");
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0644");
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 28800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0646");
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0647");
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0648");
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0649");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0650");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0651");
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0652");
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0654");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(5700000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0655");
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0657");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0658");
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
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0659");
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0660");
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0661");
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0662");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        int int9 = dateTimeZone2.getStandardOffset((-28919900L));
        java.lang.String str11 = dateTimeZone2.getNameKey((-3600000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0663");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0664");
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0665");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone2.getName(60036L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0666");
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0667");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName(3540097L, locale5);
        int int8 = dateTimeZone2.getStandardOffset(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        long long12 = dateTimeZone2.previousTransition(3480097L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3480097L + "'", long12 == 3480097L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0668");
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0669");
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0670");
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4200000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0672");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone0.getID();
        long long10 = dateTimeZone0.nextTransition(5700001L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName(0L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "40) test0672(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "37) test0672(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
// flaky "35) test0672(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky "34) test0672(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5700001L + "'", long10 == 5700001L);
// flaky "23) test0672(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0673");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) 10);
        long long5 = dateTimeZone1.previousTransition(0L);
        int int7 = dateTimeZone1.getOffset(31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0674");
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
// flaky "41) test0674(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
// flaky "38) test0674(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
// flaky "36) test0674(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky "35) test0674(JA_031_Regression1)":         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0675");
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0676");
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0677");
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0678");
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

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0679");
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
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getShortName(1L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone16.getShortName(0L, locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone16.getName((long) '4', locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getName((long) (short) -1, locale26);
        int int29 = dateTimeZone16.getOffset((long) 100);
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (-28859900L));
        java.lang.String str32 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28799900L) + "'", long8 == (-28799900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinated Universal Time" + "'", str24, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coordinated Universal Time" + "'", str27, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-28859900L) + "'", long31 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0680");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-28799900L), locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey(60052L);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0681");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC(3600000L, false);
        java.lang.String str13 = dateTimeZone2.getName((long) '4');
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone2.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0682");
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
        java.lang.String str24 = dateTimeZone0.getShortName((long) 25200000);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone0.getName((-59902L), locale26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3659902L) + "'", long22 == (-3659902L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-01:00" + "'", str24, "-01:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0683");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str22 = dateTimeZone21.toString();
        java.lang.String str24 = dateTimeZone21.getName((long) (short) 0);
        java.lang.String str26 = dateTimeZone21.getName(0L);
        java.lang.String str27 = dateTimeZone21.getID();
        long long29 = dateTimeZone21.nextTransition(0L);
        java.lang.String str30 = dateTimeZone21.getID();
        long long33 = dateTimeZone21.adjustOffset(22080000L, false);
        java.lang.String str35 = dateTimeZone21.getNameKey(98L);
        boolean boolean36 = dateTimeZone1.equals((java.lang.Object) str35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199900L) + "'", long8 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 22080000L + "'", long33 == 22080000L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0684");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(28800000L, locale4);
        java.lang.String str6 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0685");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0686");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean4 = dateTimeZone1.isStandardOffset((-59968L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forID("+08");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 60035L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28739964L) + "'", long9 == (-28739964L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0687");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        java.lang.String str7 = dateTimeZone2.getName(10L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getName((long) 1, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0688");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str7 = dateTimeZone2.getName(28800000L);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName((-28739964L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0690");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+08:00" + "'", str2, "+08:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 28800000 + "'", int10 == 28800000);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0691");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC(21660000L, true, (-179900L));
        long long13 = dateTimeZone2.previousTransition((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21600000L + "'", long11 == 21600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0692");
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
        java.lang.String str23 = dateTimeZone2.getID();
        java.lang.String str25 = dateTimeZone2.getName((-119999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+08:00" + "'", str8, "+08:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0693");
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
        java.lang.String str24 = dateTimeZone0.getID();
        long long26 = dateTimeZone0.previousTransition((long) 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+08:00" + "'", str2, "+08:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 28800000 + "'", int9 == 28800000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+08:00" + "'", str12, "+08:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+08:00" + "'", str15, "+08:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28800000 + "'", int17 == 28800000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+08:00" + "'", str22, "+08:00");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+08:00" + "'", str24, "+08:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5700000L + "'", long26 == 5700000L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0694");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        boolean boolean10 = dateTimeZone2.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0695");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long11 = dateTimeZone1.convertLocalToUTC((-28859900L), false, (long) (short) 100);
        long long13 = dateTimeZone1.convertUTCToLocal((-59902L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28919900L) + "'", long11 == (-28919900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0696");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffsetFromLocal((long) '#');
        java.lang.String str3 = dateTimeZone0.toString();
        long long5 = dateTimeZone0.nextTransition((-28799948L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((-119999L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-28799948L) + "'", long5 == (-28799948L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0697");
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
        java.lang.Class<?> wildcardClass18 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0698");
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
        int int28 = dateTimeZone0.getOffset((long) (short) 0);
        int int30 = dateTimeZone0.getStandardOffset((-120001L));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60000 + "'", int28 == 60000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60000 + "'", int30 == 60000);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0699");
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
        long long26 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3600097L + "'", long26 == 3600097L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0700");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        long long14 = dateTimeZone2.convertLocalToUTC(32340098L, true, 51L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32280098L + "'", long14 == 32280098L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0701");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone1.getShortName((-60000L));
        int int7 = dateTimeZone1.getOffset(21960000L);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0702");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (-119968L));
        long long14 = dateTimeZone0.adjustOffset(100L, false);
        java.lang.String str15 = dateTimeZone0.toString();
        long long17 = dateTimeZone0.previousTransition(22080000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599999L) + "'", long9 == (-3599999L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 22080000L + "'", long17 == 22080000L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0703");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone2.getName(3600031L);
        boolean boolean10 = dateTimeZone2.isStandardOffset((-28799900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0704");
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
        long long27 = dateTimeZone18.convertLocalToUTC((-179934L), false);
        long long30 = dateTimeZone18.convertLocalToUTC(5760000L, true);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-179966L) + "'", long27 == (-179966L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5759968L + "'", long30 == 5759968L);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0705");
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
        int int32 = dateTimeZone16.getOffsetFromLocal(60097L);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0706");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset(60052L);
        java.lang.String str7 = dateTimeZone1.getNameKey(28800010L);
        long long10 = dateTimeZone1.adjustOffset(5639968L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5639968L + "'", long10 == 5639968L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0707");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean6 = dateTimeZone2.isStandardOffset(22020000L);
        boolean boolean8 = dateTimeZone2.isStandardOffset(33L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0708");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0709");
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
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone14.getOffset(readableInstant27);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0710");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0711");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3600000) + "'", int12 == (-3600000));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-119968L) + "'", long17 == (-119968L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3600000) + "'", int19 == (-3600000));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0713");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 1);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getStandardOffset((-59999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0714");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        long long9 = dateTimeZone2.adjustOffset(5639967L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5639967L + "'", long9 == 5639967L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0715");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) -1);
        long long7 = dateTimeZone0.nextTransition(32L);
        int int9 = dateTimeZone0.getOffset(6779999L);
        long long12 = dateTimeZone0.convertLocalToUTC((-28799965L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-28799965L) + "'", long12 == (-28799965L));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0716");
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
        long long22 = dateTimeZone0.convertLocalToUTC((-28799900L), true);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone0.getOffset(readableInstant23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "42) test0716(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "39) test0716(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
// flaky "37) test0716(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky "36) test0716(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "24) test0716(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-28799901L) + "'", long22 == (-28799901L));
// flaky "18) test0716(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0717");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Positive hours must not have negative minutes: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0718");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0719");
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
        java.lang.String str23 = dateTimeZone0.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "43) test0719(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "40) test0719(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "38) test0719(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky "37) test0719(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
// flaky "25) test0719(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
// flaky "19) test0719(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0720");
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
        java.util.TimeZone timeZone35 = dateTimeZone20.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "44) test0720(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
// flaky "41) test0720(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
// flaky "39) test0720(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "38) test0720(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "26) test0720(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 31920000L + "'", long19 == 31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky "20) test0720(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
// flaky "14) test0720(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
// flaky "10) test0720(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "9) test0720(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9L + "'", long31 == 9L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0721");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0722");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(0L, locale4);
        long long7 = dateTimeZone1.convertUTCToLocal((-28919900L));
        long long9 = dateTimeZone1.previousTransition(28800000L);
        long long11 = dateTimeZone1.nextTransition((-119900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "45) test0722(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
// flaky "42) test0722(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28919899L) + "'", long7 == (-28919899L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28800000L + "'", long9 == 28800000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-119900L) + "'", long11 == (-119900L));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0723");
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
        int int33 = dateTimeZone8.getOffsetFromLocal((-10320000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "46) test0723(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
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
// flaky "43) test0723(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 22020001L + "'", long29 == 22020001L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0724");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getShortName(0L, locale15);
        long long20 = dateTimeZone2.convertLocalToUTC(25200000L, true, 32L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone2.getShortName((-25199900L), locale22);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25140000L + "'", long20 == 25140000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0725");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, false);
        int int6 = dateTimeZone1.getOffset((-60001L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-59990L), locale8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        boolean boolean12 = dateTimeZone11.isFixed();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone11.getName(0L, locale14);
        long long17 = dateTimeZone11.convertUTCToLocal((-28919900L));
        java.lang.String str19 = dateTimeZone11.getNameKey(60001L);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-179903L));
        java.lang.String str23 = dateTimeZone1.getName(31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-28859900L) + "'", long17 == (-28859900L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-239903L) + "'", long21 == (-239903L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0726");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getShortName(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getShortName(0L, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getName((long) '4', locale10);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone3.isLocalDateTimeGap(localDateTime14);
        java.lang.String str17 = dateTimeZone3.getName((-59990L));
        java.lang.String str18 = dateTimeZone3.toString();
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, 5699968L);
        java.lang.String str21 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str25 = dateTimeZone24.toString();
        java.lang.String str27 = dateTimeZone24.getName((long) (short) 0);
        java.lang.String str29 = dateTimeZone24.getName(0L);
        boolean boolean30 = dateTimeZone24.isFixed();
        java.lang.String str31 = dateTimeZone24.toString();
        long long33 = dateTimeZone2.getMillisKeepLocal(dateTimeZone24, (-32399968L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1080032L) + "'", long20 == (-1080032L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:52" + "'", str21, "-01:52");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-39179968L) + "'", long33 == (-39179968L));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0727");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-28859900L), true, (long) 0);
        int int6 = dateTimeZone0.getOffset((-28799965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-28919900L) + "'", long4 == (-28919900L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0728");
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
        java.lang.String str21 = dateTimeZone0.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0729");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long9 = dateTimeZone4.convertLocalToUTC(28799999L, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone4.getName(60001L, locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone4.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28799999L + "'", long9 == 28799999L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0730");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        long long6 = dateTimeZone0.adjustOffset((-28859900L), true);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int11 = dateTimeZone9.getOffsetFromLocal((long) 25200000);
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5700000);
        boolean boolean15 = dateTimeZone0.equals((java.lang.Object) (-28919901L));
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0731");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        int int6 = dateTimeZone1.getStandardOffset(3480097L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0732");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(25200000);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25200000 + "'", int3 == 25200000);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0733");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone2.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0734");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        long long9 = dateTimeZone1.nextTransition(60010L);
        java.lang.String str10 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.nextTransition(3600000L);
        long long14 = dateTimeZone1.previousTransition(28800010L);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "47) test0734(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60010L + "'", long9 == 60010L);
// flaky "44) test0734(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28800010L + "'", long14 == 28800010L);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky "40) test0734(JA_031_Regression1)":         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(28800000, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 28800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0736");
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
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0737");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone4 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        int int8 = dateTimeZone6.getStandardOffset(120000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0738");
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
        java.lang.String str18 = dateTimeZone2.getID();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0739");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0740");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getName(97L);
        long long13 = dateTimeZone0.nextTransition(3540097L);
        java.lang.String str14 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540097L + "'", long13 == 3540097L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0741");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(1L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+08:00" + "'", str4, "+08:00");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0742");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone0.convertUTCToLocal((-28979900L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getName(21660000L, locale15);
        long long18 = dateTimeZone0.convertUTCToLocal((-10320000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-28919900L) + "'", long13 == (-28919900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10260000L) + "'", long18 == (-10260000L));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0743");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(0L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone2.getName((-60001L), locale11);
        java.lang.String str13 = dateTimeZone2.toString();
        long long17 = dateTimeZone2.convertLocalToUTC((-3599965L), false, 22020000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3659965L) + "'", long17 == (-3659965L));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0744");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((-60001L), locale4);
        long long8 = dateTimeZone1.adjustOffset((long) 0, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0745");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str10 = dateTimeZone9.toString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone9.getShortName(3540097L, locale12);
        boolean boolean14 = dateTimeZone4.equals((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0746");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) '#');
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28799966L) + "'", long10 == (-28799966L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0747");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        int int10 = dateTimeZone7.getOffsetFromLocal((long) (byte) 100);
        long long13 = dateTimeZone7.convertLocalToUTC((long) 25200000, true);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) dateTimeZone7);
        int int16 = dateTimeZone1.getOffsetFromLocal(3600031L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25200000L + "'", long13 == 25200000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0748");
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
        long long35 = dateTimeZone0.nextTransition((-28799900L));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60000 + "'", int33 == 60000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-28799900L) + "'", long35 == (-28799900L));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0749");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(5520000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5520000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0750");
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
        java.lang.Class<?> wildcardClass21 = dateTimeZone2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0751");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        long long9 = dateTimeZone0.convertUTCToLocal((long) 1);
        boolean boolean10 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60001L + "'", long9 == 60001L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0752");
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
        int int28 = dateTimeZone14.getOffsetFromLocal(2L);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0753");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int7 = dateTimeZone5.getOffset((long) 32);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0754");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        long long13 = dateTimeZone0.convertLocalToUTC((long) '4', true, (long) 60000);
        long long17 = dateTimeZone0.convertLocalToUTC((long) 28800000, true, 60035L);
        long long20 = dateTimeZone0.convertLocalToUTC(28800052L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "48) test0754(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "45) test0754(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "41) test0754(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "39) test0754(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
// flaky "27) test0754(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
// flaky "21) test0754(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 28800000L + "'", long17 == 28800000L);
// flaky "15) test0754(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 28800052L + "'", long20 == 28800052L);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0755");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long8 = dateTimeZone1.convertLocalToUTC(5700032L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5700033L + "'", long8 == 5700033L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0756");
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
        java.lang.String str18 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "49) test0756(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "46) test0756(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "42) test0756(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "40) test0756(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
// flaky "28) test0756(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "22) test0756(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
// flaky "16) test0756(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "11) test0756(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0757");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.lang.String str8 = dateTimeZone1.getShortName((-28859900L));
        int int10 = dateTimeZone1.getOffset((-60001L));
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "50) test0757(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
// flaky "47) test0757(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
// flaky "43) test0757(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky "41) test0757(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "29) test0757(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0758");
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
        long long25 = dateTimeZone4.convertUTCToLocal((long) 100);
        java.lang.Class<?> wildcardClass26 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky "51) test0758(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
// flaky "48) test0758(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "44) test0758(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0759");
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
        java.lang.String str15 = dateTimeZone0.getNameKey(53L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "52) test0759(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky "49) test0759(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky "45) test0759(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28799900L) + "'", long10 == (-28799900L));
// flaky "42) test0759(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
// flaky "30) test0759(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0760");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        long long6 = dateTimeZone2.convertUTCToLocal(1L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60001L + "'", long6 == 60001L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0761");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str7 = dateTimeZone2.getName(28800000L);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0762");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) (byte) 10);
        int int6 = dateTimeZone1.getStandardOffset((-6779900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0763");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getShortName(0L, locale15);
        long long20 = dateTimeZone2.convertLocalToUTC(25200000L, true, 32L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone2.getName((-3599999L), locale22);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25140000L + "'", long20 == 25140000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0764");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getShortName((-60000L), locale20);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone0.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0765");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-59990L), locale8);
        boolean boolean10 = dateTimeZone1.isFixed();
        long long12 = dateTimeZone1.nextTransition(21660000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21660000L + "'", long12 == 21660000L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0766");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-59969L) + "'", long32 == (-59969L));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0767");
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
        java.lang.String str16 = dateTimeZone12.getShortName(9L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0768");
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0769");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone6.convertUTCToLocal(32340098L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32400098L + "'", long8 == 32400098L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0770");
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
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone14.getShortName(60100L, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59948L) + "'", long13 == (-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59990L) + "'", long18 == (-59990L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3540097L + "'", long20 == 3540097L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0771");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0772");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal(31920000L);
        int int6 = dateTimeZone2.getOffsetFromLocal((-3660000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0773");
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
        java.lang.String str41 = dateTimeZone0.getName((long) (byte) 100);
        int int43 = dateTimeZone0.getOffset(5700032L);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:01" + "'", str41, "+00:01");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60000 + "'", int43 == 60000);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0774");
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
        java.lang.String str26 = dateTimeZone2.getShortName((-32339968L), locale25);
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0775");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.convertLocalToUTC(5700001L, false);
        int int6 = dateTimeZone1.getStandardOffset((-179966L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5640001L + "'", long4 == 5640001L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0776");
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
        boolean boolean17 = dateTimeZone1.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0777");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long3 = dateTimeZone1.previousTransition(32400001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32400001L + "'", long3 == 32400001L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0778");
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
        java.lang.String str47 = dateTimeZone2.getShortName(28860010L, locale46);
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0779");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:52");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0780");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false, 10L);
        long long7 = dateTimeZone1.nextTransition((long) 1);
        long long9 = dateTimeZone1.nextTransition(60010L);
        java.lang.String str10 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.nextTransition(3600000L);
        long long14 = dateTimeZone1.previousTransition(28800010L);
        int int16 = dateTimeZone1.getOffset(33L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-59990L) + "'", long5 == (-59990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60010L + "'", long9 == 60010L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28800010L + "'", long14 == 28800010L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0781");
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
        java.lang.String str20 = dateTimeZone2.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0782");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.getID();
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0783");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
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
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0784");
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
        long long24 = dateTimeZone13.previousTransition((-119999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3659902L) + "'", long22 == (-3659902L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-119999L) + "'", long24 == (-119999L));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0785");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-28799969L), locale11);
        int int14 = dateTimeZone1.getOffset((-120001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600100L + "'", long9 == 3600100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3600000) + "'", int14 == (-3600000));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0786");
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
        long long19 = dateTimeZone2.convertUTCToLocal(54L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60054L + "'", long19 == 60054L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0787");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        long long10 = dateTimeZone0.previousTransition((long) (byte) 10);
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        java.lang.String str12 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0788");
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
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0789");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        boolean boolean12 = dateTimeZone0.isStandardOffset(28740010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0790");
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
        java.lang.String str17 = dateTimeZone1.getShortName((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0791");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        long long3 = dateTimeZone1.convertUTCToLocal((-119900L));
        long long7 = dateTimeZone1.convertLocalToUTC(60000L, false, (long) (-3600000));
        java.lang.String str9 = dateTimeZone1.getName((-119900L));
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 1, locale13);
        java.lang.String str16 = dateTimeZone11.getNameKey((-28919900L));
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone11.isLocalDateTimeGap(localDateTime17);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 0L);
        long long24 = dateTimeZone1.convertLocalToUTC((-6719900L), false, 97L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28680100L + "'", long3 == 28680100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28740000L) + "'", long7 == (-28740000L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+08:00" + "'", str9, "+08:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32400000L + "'", long20 == 32400000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-35519900L) + "'", long24 == (-35519900L));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0792");
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
        long long27 = dateTimeZone18.convertLocalToUTC((-179934L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-179966L) + "'", long27 == (-179966L));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0793");
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
        long long16 = dateTimeZone1.convertLocalToUTC((-119968L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-32L) + "'", long8 == (-32L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.032" + "'", str13, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-120000L) + "'", long16 == (-120000L));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0794");
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
        java.lang.String str51 = dateTimeZone28.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60000L) + "'", long22 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5640000L + "'", long25 == 5640000L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.032" + "'", str34, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:01" + "'", str40, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60000 + "'", int44 == 60000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60000 + "'", int46 == 60000);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:01" + "'", str48, "+00:01");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-28740000L) + "'", long50 == (-28740000L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:01" + "'", str51, "+00:01");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0795");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0796");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) '#');
        java.lang.String str5 = dateTimeZone1.getName((long) (byte) 0);
        java.lang.String str7 = dateTimeZone1.getShortName((long) 28800000);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName((long) (short) 1, locale11);
        java.lang.String str14 = dateTimeZone9.getNameKey((long) 32);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) 100);
        long long18 = dateTimeZone1.nextTransition((-1L));
        boolean boolean20 = dateTimeZone1.isStandardOffset(3660031L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 67L + "'", long3 == 67L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.032" + "'", str7, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.032" + "'", str12, "+00:00:00.032");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0797");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        long long6 = dateTimeZone2.convertUTCToLocal(1L);
        java.lang.String str8 = dateTimeZone2.getName(60001L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.convertUTCToLocal(1L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getShortName((long) (byte) 10, locale15);
        java.lang.String str17 = dateTimeZone11.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone20.getOffset(readableInstant21);
        boolean boolean23 = dateTimeZone20.isFixed();
        long long25 = dateTimeZone11.getMillisKeepLocal(dateTimeZone20, (-28859900L));
        java.lang.String str26 = dateTimeZone11.toString();
        long long28 = dateTimeZone11.convertUTCToLocal((-28740000L));
        long long31 = dateTimeZone11.adjustOffset((-28740000L), false);
        boolean boolean32 = dateTimeZone2.equals((java.lang.Object) long31);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60001L + "'", long6 == 60001L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-28919900L) + "'", long25 == (-28919900L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-28740000L) + "'", long28 == (-28740000L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-28740000L) + "'", long31 == (-28740000L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0798");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        long long12 = dateTimeZone0.adjustOffset((long) 1, true);
        long long15 = dateTimeZone0.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-32L) + "'", long15 == (-32L));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0799");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.convertUTCToLocal(1L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str16 = dateTimeZone15.toString();
        java.lang.String str18 = dateTimeZone15.getName((long) (short) 0);
        java.lang.String str20 = dateTimeZone15.getName(0L);
        long long22 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) (short) 1);
        int int24 = dateTimeZone10.getStandardOffset((long) 1);
        long long27 = dateTimeZone10.convertLocalToUTC((long) 10, true);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str32 = dateTimeZone30.getShortName(1L);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone30.getShortName(0L, locale34);
        int int37 = dateTimeZone30.getOffsetFromLocal(1L);
        java.lang.String str39 = dateTimeZone30.getName((long) 25200000);
        int int41 = dateTimeZone30.getOffsetFromLocal((long) (short) -1);
        java.lang.String str43 = dateTimeZone30.getShortName((long) (byte) -1);
        long long45 = dateTimeZone30.previousTransition(60052L);
        long long47 = dateTimeZone10.getMillisKeepLocal(dateTimeZone30, 21960000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-59999L) + "'", long22 == (-59999L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 132L + "'", long29 == 132L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.032" + "'", str32, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.032" + "'", str35, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.032" + "'", str39, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.032" + "'", str43, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 60052L + "'", long45 == 60052L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 21959968L + "'", long47 == 21959968L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0800");
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
        long long29 = dateTimeZone0.convertLocalToUTC(100L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.032" + "'", str12, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.032" + "'", str15, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 68L + "'", long29 == 68L);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0801");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0802");
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
        long long29 = dateTimeZone0.convertLocalToUTC(60035L, true, (-2L));
        int int31 = dateTimeZone0.getOffsetFromLocal(60001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.032" + "'", str12, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.032" + "'", str15, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.032" + "'", str22, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 60003L + "'", long29 == 60003L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0803");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName(3540097L, locale5);
        int int8 = dateTimeZone2.getStandardOffset(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone2.getOffset(readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean19 = dateTimeZone2.equals((java.lang.Object) timeZone12);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone2.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0804");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.032" + "'", str11, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-32L) + "'", long14 == (-32L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0805");
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
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        long long48 = dateTimeZone45.convertLocalToUTC(22020000L, false);
        long long52 = dateTimeZone45.convertLocalToUTC(59999L, true, (long) (short) 1);
        long long54 = dateTimeZone0.getMillisKeepLocal(dateTimeZone45, 28860010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.032" + "'", str12, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.032" + "'", str15, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28680100L + "'", long23 == 28680100L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+01:10" + "'", str27, "+01:10");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.032" + "'", str34, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-28859932L) + "'", long40 == (-28859932L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 28740000L + "'", long48 == 28740000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 6779999L + "'", long52 == 6779999L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 35580042L + "'", long54 == 35580042L);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0806");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone0.getID();
        long long10 = dateTimeZone0.nextTransition(5700001L);
        long long12 = dateTimeZone0.convertUTCToLocal((-179900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.032" + "'", str2, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5700001L + "'", long10 == 5700001L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-179868L) + "'", long12 == (-179868L));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0807");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int4 = dateTimeZone0.getOffsetFromLocal((-59948L));
        int int6 = dateTimeZone0.getOffset((-60001L));
        long long9 = dateTimeZone0.adjustOffset((-59948L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59948L) + "'", long9 == (-59948L));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0808");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        long long13 = dateTimeZone0.previousTransition((-59900L));
        int int15 = dateTimeZone0.getOffset((long) 28800000);
        long long17 = dateTimeZone0.previousTransition(51L);
        java.util.TimeZone timeZone18 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59900L) + "'", long13 == (-59900L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 51L + "'", long17 == 51L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0810");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28800010L + "'", long28 == 28800010L);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0811");
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
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone2.getName((-32219968L), locale35);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-22L) + "'", long32 == (-22L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0812");
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
        int int35 = dateTimeZone2.getStandardOffset((long) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0813");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        long long10 = dateTimeZone1.previousTransition(52L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone1.nextTransition((-59969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59969L) + "'", long14 == (-59969L));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0814");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        boolean boolean5 = dateTimeZone4.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone4.getName(0L, locale7);
        long long10 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (-59990L));
        java.lang.String str12 = dateTimeZone4.getName((-59999L));
        java.util.TimeZone timeZone13 = dateTimeZone4.toTimeZone();
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
        long long31 = dateTimeZone14.previousTransition((-32399968L));
        boolean boolean32 = dateTimeZone4.equals((java.lang.Object) dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-32399968L) + "'", long31 == (-32399968L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0815");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long3 = dateTimeZone1.convertUTCToLocal(28740100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28740132L + "'", long3 == 28740132L);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0816");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        java.lang.String str6 = dateTimeZone1.getName((-60022L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName(28739999L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0817");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        boolean boolean8 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0818");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.String str9 = dateTimeZone1.getShortName((-179969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5520000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5520000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0820");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(10L, locale6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset(21599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0821");
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
        java.lang.String str25 = dateTimeZone2.getShortName(60032L);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int29 = dateTimeZone27.getOffsetFromLocal((long) 100);
        java.lang.String str31 = dateTimeZone27.getName((-28799900L));
        long long33 = dateTimeZone27.previousTransition((-59903L));
        java.lang.String str34 = dateTimeZone27.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        boolean boolean36 = dateTimeZone2.equals((java.lang.Object) dateTimeZone27);
        int int38 = dateTimeZone27.getOffsetFromLocal((-32219968L));
        long long40 = dateTimeZone27.previousTransition(28740010L);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-59903L) + "'", long33 == (-59903L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-00:00:00.001" + "'", str34, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 28740010L + "'", long40 == 28740010L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0822");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long5 = dateTimeZone1.previousTransition(100L);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getShortName((long) 'a');
        int int10 = dateTimeZone1.getOffsetFromLocal((-3659965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0823");
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
        java.lang.String str22 = dateTimeZone2.getName((-28799899L), locale21);
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0824");
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
        long long27 = dateTimeZone18.convertLocalToUTC((-179934L), false);
        java.lang.String str29 = dateTimeZone18.getNameKey((-3659902L));
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-179966L) + "'", long27 == (-179966L));
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0825");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName(1L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getShortName(0L, locale23);
        int int26 = dateTimeZone19.getOffsetFromLocal(1L);
        java.lang.String str28 = dateTimeZone19.getName((long) 25200000);
        long long30 = dateTimeZone19.previousTransition((-1L));
        long long32 = dateTimeZone19.previousTransition((-60000L));
        java.lang.String str33 = dateTimeZone19.getID();
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 20L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59901L) + "'", long16 == (-59901L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-00:00:00.001" + "'", str24, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-60000L) + "'", long32 == (-60000L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-00:00:00.001" + "'", str33, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 20L + "'", long35 == 20L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0826");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0827");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset((-28680000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-28680000L) + "'", long5 == (-28680000L));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0828");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str9 = dateTimeZone0.getName((long) 25200000);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        long long13 = dateTimeZone0.previousTransition((-59900L));
        int int15 = dateTimeZone0.getOffset((long) 28800000);
        java.lang.String str16 = dateTimeZone0.getID();
        java.lang.String str17 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59900L) + "'", long13 == (-59900L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0829");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.lang.Object obj2 = null;
        boolean boolean3 = dateTimeZone1.equals(obj2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(3540010L, locale6);
        int int9 = dateTimeZone1.getOffset((-32339968L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0830");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        boolean boolean10 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0831");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.001" + "'", str19, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0832");
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
        java.lang.String str22 = dateTimeZone0.getID();
        java.lang.String str23 = dateTimeZone0.getID();
        int int25 = dateTimeZone0.getStandardOffset(53L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59904L) + "'", long18 == (-59904L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.001" + "'", str23, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0833");
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
        long long36 = dateTimeZone20.convertUTCToLocal(3660031L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 31920000L + "'", long19 == 31920000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9L + "'", long31 == 9L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3660032L + "'", long36 == 3660032L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0834");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 100);
        long long22 = dateTimeZone18.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName(1L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone23.getShortName(0L, locale27);
        long long30 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) 32);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone23, (long) ' ');
        int int34 = dateTimeZone1.getOffsetFromLocal((-179966L));
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone1.getOffset(readableInstant35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28799901L) + "'", long8 == (-28799901L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 30L + "'", long30 == 30L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0835");
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
        java.lang.String str17 = dateTimeZone12.getName((long) 0, locale16);
        boolean boolean19 = dateTimeZone12.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone12.getOffset(readableInstant20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str24 = dateTimeZone22.getShortName(1L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone22.getShortName(0L, locale26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone22.getOffset(readableInstant28);
        long long31 = dateTimeZone12.getMillisKeepLocal(dateTimeZone22, (long) (short) 10);
        int int33 = dateTimeZone12.getOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone12.getOffset(readableInstant34);
        long long37 = dateTimeZone12.convertUTCToLocal((-3659902L));
        java.lang.String str39 = dateTimeZone12.getNameKey((long) 60000);
        boolean boolean40 = dateTimeZone2.equals((java.lang.Object) str39);
        int int42 = dateTimeZone2.getStandardOffset((long) 52);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.001" + "'", str27, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3659901L) + "'", long37 == (-3659901L));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60000 + "'", int42 == 60000);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0836");
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
        java.lang.String str24 = dateTimeZone0.getName((-179935L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.001" + "'", str12, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0837");
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
        long long22 = dateTimeZone0.convertLocalToUTC(32340098L, true, 5639967L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32340097L + "'", long22 == 32340097L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0838");
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
        java.lang.String str18 = dateTimeZone2.getNameKey((long) 10);
        long long21 = dateTimeZone2.adjustOffset((-119999L), false);
        long long23 = dateTimeZone2.convertUTCToLocal((long) 3600000);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-119999L) + "'", long21 == (-119999L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3600000L + "'", long23 == 3600000L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0839");
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
        int int22 = dateTimeZone2.getStandardOffset(68L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0840");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0841");
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
        java.lang.String str22 = dateTimeZone0.getID();
        boolean boolean24 = dateTimeZone0.isStandardOffset((-6719900L));
        long long26 = dateTimeZone0.convertUTCToLocal(28740000L);
        long long29 = dateTimeZone0.convertLocalToUTC(32400001L, true);
        java.lang.String str30 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59904L) + "'", long18 == (-59904L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 28740001L + "'", long26 == 28740001L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32400000L + "'", long29 == 32400000L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.001" + "'", str30, "+00:00:00.001");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0842");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getShortName((-60000L), locale20);
        int int23 = dateTimeZone0.getOffsetFromLocal((-119900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0843");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        java.lang.String str5 = dateTimeZone1.getID();
        long long8 = dateTimeZone1.adjustOffset((-59903L), true);
        java.lang.String str10 = dateTimeZone1.getNameKey(5640000L);
        int int12 = dateTimeZone1.getOffsetFromLocal(5639967L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59903L) + "'", long8 == (-59903L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0844");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        long long10 = dateTimeZone2.adjustOffset((-28799900L), false);
        java.lang.String str12 = dateTimeZone2.getShortName(0L);
        boolean boolean13 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28799900L) + "'", long10 == (-28799900L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0845");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0846");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) -1);
        java.lang.String str7 = dateTimeZone0.getNameKey((-179903L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(10L, locale9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinated Universal Time" + "'", str10, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0847");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) 10);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0848");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        int int13 = dateTimeZone0.getStandardOffset((-28799969L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0849");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) (byte) 10, false);
        long long6 = dateTimeZone1.nextTransition(52L);
        long long8 = dateTimeZone1.nextTransition((-179934L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-179934L) + "'", long8 == (-179934L));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0850");
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
        long long18 = dateTimeZone0.adjustOffset((-59965L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0851");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.lang.String str8 = dateTimeZone1.getShortName((-28859900L));
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0852");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone2.getShortName((-59965L), locale24);
        int int27 = dateTimeZone2.getOffsetFromLocal(5700000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0853");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffset((-32399968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0854");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone4.convertLocalToUTC((-60001L), false);
        long long10 = dateTimeZone4.convertLocalToUTC((-59969L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-60001L) + "'", long7 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59969L) + "'", long10 == (-59969L));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0855");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) ' ');
        java.lang.String str4 = dateTimeZone2.getShortName((-28799965L));
        java.lang.String str5 = dateTimeZone2.getID();
        long long7 = dateTimeZone2.convertUTCToLocal((long) (byte) 10);
        long long9 = dateTimeZone2.previousTransition((-28799969L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:32" + "'", str4, "+01:32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:32" + "'", str5, "+01:32");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5520010L + "'", long7 == 5520010L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28799969L) + "'", long9 == (-28799969L));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0856");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        java.lang.String str9 = dateTimeZone1.getID();
        int int11 = dateTimeZone1.getOffset((-32339968L));
        java.lang.String str13 = dateTimeZone1.getShortName((long) 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "53) test0856(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "50) test0856(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
// flaky "46) test0856(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
// flaky "43) test0856(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
// flaky "31) test0856(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0857");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0858");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) (short) 0);
        long long9 = dateTimeZone4.convertLocalToUTC(28799999L, true);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone4.getName(60001L, locale11);
        int int14 = dateTimeZone4.getOffsetFromLocal((long) 5700000);
        java.lang.Class<?> wildcardClass15 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28799999L + "'", long9 == 28799999L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0859");
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
        long long22 = dateTimeZone11.convertUTCToLocal((-28859932L));
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-28799932L) + "'", long22 == (-28799932L));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0860");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        int int13 = dateTimeZone2.getStandardOffset(60035L);
        java.lang.String str15 = dateTimeZone2.getNameKey((-179969L));
        boolean boolean16 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0861");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 100);
        long long22 = dateTimeZone18.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getShortName(1L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone23.getShortName(0L, locale27);
        long long30 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) 32);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone23, (long) ' ');
        boolean boolean33 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "54) test0861(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "51) test0861(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
// flaky "47) test0861(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky "44) test0861(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
// flaky "32) test0861(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
// flaky "23) test0861(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-59969L) + "'", long30 == (-59969L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0862");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        int int9 = dateTimeZone0.getOffsetFromLocal(0L);
        boolean boolean10 = dateTimeZone0.isFixed();
        int int12 = dateTimeZone0.getStandardOffset(22020000L);
        java.lang.String str14 = dateTimeZone0.getName(28860010L);
        java.lang.String str15 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "55) test0862(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "52) test0862(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "48) test0862(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "45) test0862(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "33) test0862(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
// flaky "24) test0862(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
// flaky "17) test0862(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0863");
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
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone1.isLocalDateTimeGap(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky "56) test0863(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "53) test0863(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
// flaky "49) test0863(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
// flaky "46) test0863(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
// flaky "34) test0863(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
// flaky "25) test0863(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
// flaky "18) test0863(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "12) test0863(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-59965L) + "'", long20 == (-59965L));
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0864");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        long long11 = dateTimeZone1.nextTransition((-59999L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((long) (byte) 100, locale13);
        int int16 = dateTimeZone1.getOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "57) test0864(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "54) test0864(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
// flaky "50) test0864(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59900L) + "'", long9 == (-59900L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59999L) + "'", long11 == (-59999L));
// flaky "47) test0864(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
// flaky "35) test0864(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0865");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        java.lang.String str11 = dateTimeZone2.getShortName(21600000L);
        java.lang.String str13 = dateTimeZone2.getShortName((-28859900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0866");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        java.lang.String str9 = dateTimeZone0.getNameKey((-60022L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "58) test0866(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "55) test0866(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0867");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "59) test0867(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "56) test0867(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "51) test0867(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "48) test0867(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
// flaky "36) test0867(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "26) test0867(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:01" + "'", str20, "+00:01");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0868");
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
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky "60) test0868(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "57) test0868(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
// flaky "52) test0868(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "49) test0868(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky "37) test0868(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28859900L) + "'", long26 == (-28859900L));
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0869");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        long long6 = dateTimeZone1.nextTransition(3600097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "61) test0869(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600097L + "'", long6 == 3600097L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0870");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        java.lang.String str7 = dateTimeZone2.getID();
        long long9 = dateTimeZone2.nextTransition(100L);
        boolean boolean10 = dateTimeZone2.isFixed();
        long long14 = dateTimeZone2.convertLocalToUTC(28800010L, false, (long) (short) 1);
        long long16 = dateTimeZone2.previousTransition((-60022L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28740010L + "'", long14 == 28740010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-60022L) + "'", long16 == (-60022L));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0871");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0872");
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
        int int36 = dateTimeZone0.getOffsetFromLocal(5700032L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "62) test0872(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "58) test0872(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "53) test0872(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
// flaky "50) test0872(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "38) test0872(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
// flaky "27) test0872(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
// flaky "19) test0872(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertNull(str24);
// flaky "13) test0872(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
// flaky "10) test0872(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60000 + "'", int33 == 60000);
// flaky "8) test0872(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
// flaky "5) test0872(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60000 + "'", int36 == 60000);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0873");
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
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0874");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.nextTransition((-59900L));
        long long13 = dateTimeZone2.convertLocalToUTC(0L, false, 5640001L);
        long long16 = dateTimeZone2.convertLocalToUTC(6779999L, false);
        int int18 = dateTimeZone2.getStandardOffset((-29820032L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59900L) + "'", long9 == (-59900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60000L) + "'", long13 == (-60000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 6719999L + "'", long16 == 6719999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0875");
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
        int int22 = dateTimeZone2.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str24 = dateTimeZone2.getName((long) 4200000);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinated Universal Time" + "'", str24, "Coordinated Universal Time");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0876");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36000000 + "'", int3 == 36000000);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0877");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Positive hours must not have negative minutes: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0878");
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
        java.lang.Class<?> wildcardClass27 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0879");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        boolean boolean8 = dateTimeZone0.isFixed();
        long long10 = dateTimeZone0.nextTransition((-28740000L));
        long long13 = dateTimeZone0.convertLocalToUTC((long) 5520000, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28740000L) + "'", long10 == (-28740000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5460000L + "'", long13 == 5460000L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0880");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(0L);
        boolean boolean11 = dateTimeZone2.isStandardOffset((-22L));
        long long13 = dateTimeZone2.nextTransition(34L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60000L + "'", long9 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 34L + "'", long13 == 34L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0881");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0882");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertLocalToUTC((-59903L), true, (long) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(25140000L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-119903L) + "'", long6 == (-119903L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0883");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str6 = dateTimeZone5.toString();
        long long9 = dateTimeZone5.convertLocalToUTC((long) (-1), false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 28800000);
        int int13 = dateTimeZone5.getStandardOffset((-1L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone5.getShortName(32L, locale15);
        java.lang.String str18 = dateTimeZone5.getNameKey(35580042L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60001L) + "'", long9 == (-60001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 22020000L + "'", long11 == 22020000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0884");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        int int7 = dateTimeZone0.getOffsetFromLocal(1L);
        java.lang.String str8 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0885");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0886");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str4 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.nextTransition(54L);
        int int8 = dateTimeZone2.getOffsetFromLocal(3480097L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 54L + "'", long6 == 54L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0887");
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
        java.lang.String str23 = dateTimeZone2.getID();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0888");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.lang.String str8 = dateTimeZone1.getShortName((-28859900L));
        boolean boolean10 = dateTimeZone1.isStandardOffset(60034L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        java.lang.String str15 = dateTimeZone12.toString();
        java.util.TimeZone timeZone16 = dateTimeZone12.toTimeZone();
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        long long19 = dateTimeZone12.convertUTCToLocal(3600097L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.001" + "'", str6, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600097L + "'", long19 == 3600097L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0889");
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
        int int16 = dateTimeZone2.getStandardOffset(5760000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0890");
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
        java.lang.String str22 = dateTimeZone0.getID();
        long long26 = dateTimeZone0.convertLocalToUTC((-119969L), true, 0L);
        java.lang.String str28 = dateTimeZone0.getName(32400002L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59904L) + "'", long18 == (-59904L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.001" + "'", str21, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-119970L) + "'", long26 == (-119970L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.001" + "'", str28, "+00:00:00.001");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0891");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.001" + "'", str8, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0892");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59903L) + "'", long19 == (-59903L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-59901L) + "'", long22 == (-59901L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-60001L) + "'", long29 == (-60001L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-59900L) + "'", long38 == (-59900L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3600001L) + "'", long43 == (-3600001L));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0893");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertLocalToUTC((-1L), true);
        long long13 = dateTimeZone2.convertLocalToUTC(100L, false);
        java.lang.String str14 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60001L) + "'", long10 == (-60001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59900L) + "'", long13 == (-59900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0894");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) '4');
        java.lang.String str12 = dateTimeZone0.getShortName((-59904L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0895");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getName((-1080032L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0896");
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
        long long27 = dateTimeZone1.convertLocalToUTC(5760000L, true, (-59965L));
        java.lang.String str29 = dateTimeZone1.getShortName((-6719900L));
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9360000L + "'", long27 == 9360000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-01:00" + "'", str29, "-01:00");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0897");
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
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone14.getShortName((-28919900L), locale28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-60001L) + "'", long18 == (-60001L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-59965L) + "'", long24 == (-59965L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3600000L) + "'", long26 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:01" + "'", str29, "+00:01");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0898");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        java.lang.String str11 = dateTimeZone2.getID();
        long long14 = dateTimeZone2.adjustOffset(22080000L, false);
        java.lang.String str15 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 22080000L + "'", long14 == 22080000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0899");
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
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0900");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getName((-28740000L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinated Universal Time" + "'", str10, "Coordinated Universal Time");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0901");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getShortName(0L, locale15);
        long long20 = dateTimeZone2.convertLocalToUTC(25200000L, true, 32L);
        java.lang.String str22 = dateTimeZone2.getNameKey((long) 28800000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25140000L + "'", long20 == 25140000L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0902");
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
        long long34 = dateTimeZone0.convertLocalToUTC(7200097L, true, 25140000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "63) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
// flaky "59) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
// flaky "54) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "51) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky "39) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
// flaky "28) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
// flaky "20) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "14) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
// flaky "11) test0902(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "9) test0902(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-00:00:00.001" + "'", str30, "-00:00:00.001");
// flaky "6) test0902(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 7200098L + "'", long34 == 7200098L);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0903");
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
        long long22 = dateTimeZone11.convertLocalToUTC(5700000L, false, 32400000L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5640000L + "'", long22 == 5640000L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0904");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.previousTransition(33L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 33L + "'", long3 == 33L);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0905");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 1);
        java.lang.String str8 = dateTimeZone1.getNameKey(20L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "64) test0905(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "60) test0905(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0906");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone5.convertUTCToLocal(60010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60010L + "'", long7 == 60010L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0907");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getName((-28799965L), locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName((-59990L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coordinated Universal Time" + "'", str17, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coordinated Universal Time" + "'", str20, "Coordinated Universal Time");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0908");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        java.lang.String str8 = dateTimeZone1.getShortName((-28859900L));
        long long12 = dateTimeZone1.convertLocalToUTC((-3599902L), false, (-35519900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599902L) + "'", long12 == (-3599902L));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0909");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0910");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '#');
        int int4 = dateTimeZone2.getStandardOffset(0L);
        long long6 = dateTimeZone2.nextTransition(7200098L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5700000 + "'", int4 == 5700000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7200098L + "'", long6 == 7200098L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0912");
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
        long long19 = dateTimeZone6.previousTransition(6719999L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone6.getName(5759968L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 6719999L + "'", long19 == 6719999L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0913");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long5 = dateTimeZone1.convertLocalToUTC((-3599902L), false, 0L);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 25200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-39599902L) + "'", long5 == (-39599902L));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0914");
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
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone14.getName((-179969L), locale18);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coordinated Universal Time" + "'", str19, "Coordinated Universal Time");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0915");
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
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0916");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-6720000), 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0917");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal(60010L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0918");
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
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0919");
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
        long long26 = dateTimeZone0.nextTransition((-119999L));
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone0.getName((-59965L), locale28);
        java.lang.String str30 = dateTimeZone0.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-119999L) + "'", long26 == (-119999L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coordinated Universal Time" + "'", str29, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0920");
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
        long long22 = dateTimeZone12.convertLocalToUTC(5699968L, false, (-22L));
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone12.getOffset(readableInstant23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-28919900L) + "'", long18 == (-28919900L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5699968L + "'", long22 == 5699968L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0921");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-25199900L) + "'", long16 == (-25199900L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coordinated Universal Time" + "'", str19, "Coordinated Universal Time");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0922");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        java.lang.String str12 = dateTimeZone0.toString();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone0.getName((long) (-6720000));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0923");
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
        long long38 = dateTimeZone0.convertLocalToUTC(0L, true, 28740000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coordinated Universal Time" + "'", str22, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-59900L) + "'", long34 == (-59900L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0924");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.String str10 = dateTimeZone2.getNameKey((-59948L));
        java.lang.String str11 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0925");
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
        boolean boolean41 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "65) test0925(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "61) test0925(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "55) test0925(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
// flaky "52) test0925(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
// flaky "40) test0925(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "29) test0925(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59999L) + "'", long16 == (-59999L));
// flaky "21) test0925(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59948L) + "'", long19 == (-59948L));
// flaky "15) test0925(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:01" + "'", str25, "+00:01");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-60001L) + "'", long28 == (-60001L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-59903L) + "'", long33 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:01" + "'", str38, "+00:01");
// flaky "12) test0925(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-2L) + "'", long40 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0926");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(28800000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getName(60001L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-3719902L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+08:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+08:00" + "'", str4, "+08:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+08:00" + "'", str7, "+08:00");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0927");
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
        long long19 = dateTimeZone12.adjustOffset(28800052L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60100L + "'", long16 == 60100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 28800052L + "'", long19 == 28800052L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0928");
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
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0929");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getNameKey(10L);
        java.lang.String str6 = dateTimeZone2.toString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(0L, locale8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0930");
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
        boolean boolean22 = dateTimeZone11.isStandardOffset(3660031L);
        int int24 = dateTimeZone11.getOffsetFromLocal(31L);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60000 + "'", int24 == 60000);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0931");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-59999L));
        long long11 = dateTimeZone2.convertUTCToLocal((-28799966L));
        java.util.TimeZone timeZone12 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28799966L) + "'", long11 == (-28799966L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0932");
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
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone1.getShortName((-32339968L), locale40);
        long long43 = dateTimeZone1.nextTransition(9360000L);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9360000L + "'", long43 == 9360000L);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0933");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        int int9 = dateTimeZone2.getStandardOffset((-28919900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long12 = dateTimeZone2.previousTransition((-180001L));
        long long15 = dateTimeZone2.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-180001L) + "'", long12 == (-180001L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0934");
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
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone12.getOffset(readableInstant27);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coordinated Universal Time" + "'", str20, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0935");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(22020001L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0936");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone0.convertLocalToUTC((-59990L), false, 53L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long9 = dateTimeZone0.convertLocalToUTC(60010L, true, (long) 32);
        boolean boolean11 = dateTimeZone0.isStandardOffset(3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-59990L) + "'", long4 == (-59990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60010L + "'", long9 == 60010L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0937");
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
        java.lang.String str47 = dateTimeZone14.getID();
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone14.getName((-179969L), locale49);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Coordinated Universal Time" + "'", str50, "Coordinated Universal Time");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0938");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        long long12 = dateTimeZone0.adjustOffset((long) 1, true);
        long long14 = dateTimeZone0.nextTransition(5639969L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5639969L + "'", long14 == 5639969L);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0939");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        long long10 = dateTimeZone0.previousTransition((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getName((long) (short) 0);
        java.lang.String str18 = dateTimeZone13.getName(0L);
        java.lang.String str19 = dateTimeZone13.getID();
        java.lang.String str21 = dateTimeZone13.getNameKey((-59999L));
        java.lang.String str23 = dateTimeZone13.getName(22020000L);
        long long25 = dateTimeZone13.nextTransition(60001L);
        long long27 = dateTimeZone13.convertUTCToLocal(0L);
        int int29 = dateTimeZone13.getOffsetFromLocal(52L);
        java.lang.String str31 = dateTimeZone13.getNameKey((-119903L));
        java.lang.String str33 = dateTimeZone13.getName((-119900L));
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60001L + "'", long25 == 60001L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60000L + "'", long27 == 60000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60000 + "'", int29 == 60000);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-59999L) + "'", long35 == (-59999L));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0940");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long9 = dateTimeZone2.convertUTCToLocal(30L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60030L + "'", long9 == 60030L);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0941");
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
        int int21 = dateTimeZone2.getStandardOffset((-59969L));
        java.lang.String str23 = dateTimeZone2.getShortName((-119999L));
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone2.getShortName((long) (-1), locale25);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0942");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        java.lang.String str6 = dateTimeZone1.getNameKey((-28919900L));
        int int8 = dateTimeZone1.getOffset((-28919900L));
        long long10 = dateTimeZone1.nextTransition(22020000L);
        long long13 = dateTimeZone1.adjustOffset((-28859900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22020000L + "'", long10 == 22020000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-28859900L) + "'", long13 == (-28859900L));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0943");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        long long8 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str13 = dateTimeZone12.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0944");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, 0L);
        boolean boolean9 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0945");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone3.isLocalDateTimeGap(localDateTime4);
        boolean boolean6 = dateTimeZone3.isFixed();
        java.lang.String str8 = dateTimeZone3.getName(0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone3.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0946");
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
        int int16 = dateTimeZone2.getOffset(51L);
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0947");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) '#', locale6);
        java.lang.String str9 = dateTimeZone2.getName((long) 28800000);
        long long11 = dateTimeZone2.convertUTCToLocal((-59900L));
        java.lang.String str13 = dateTimeZone2.getNameKey((long) 1);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((-35519900L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59900L) + "'", long11 == (-59900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0948");
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
        java.lang.String str15 = dateTimeZone12.getID();
        java.lang.String str17 = dateTimeZone12.getNameKey(60034L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0949");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0950");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.previousTransition((-3659999L));
        long long7 = dateTimeZone1.convertLocalToUTC((-59948L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3659999L) + "'", long4 == (-3659999L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-36059948L) + "'", long7 == (-36059948L));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0951");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59965L) + "'", long18 == (-59965L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0952");
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
        java.lang.String str23 = dateTimeZone0.getID();
        long long26 = dateTimeZone0.convertLocalToUTC(25200000L, false);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 25140000L + "'", long26 == 25140000L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0953");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        long long9 = dateTimeZone2.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        boolean boolean13 = dateTimeZone2.isStandardOffset((-28979900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0954");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean4 = dateTimeZone2.isStandardOffset(3540097L);
        int int6 = dateTimeZone2.getOffset(60010L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName((-59903L), locale8);
        int int11 = dateTimeZone2.getOffset(21600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0955");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((-60002L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0956");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getNameKey(60001L);
        long long6 = dateTimeZone1.nextTransition(35L);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, false, (-59901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60000L) + "'", long10 == (-60000L));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0957");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5700000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 5700000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0958");
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
        long long23 = dateTimeZone0.previousTransition((-119968L));
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-119968L) + "'", long23 == (-119968L));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0959");
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
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0960");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        int int5 = dateTimeZone1.getOffset((long) (byte) -1);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (short) 0);
        long long10 = dateTimeZone1.adjustOffset(3540097L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3540097L + "'", long10 == 3540097L);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0961");
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
        java.lang.Class<?> wildcardClass25 = dateTimeZone18.getClass();
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0962");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition((long) (byte) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName(0L, locale12);
        java.lang.String str14 = dateTimeZone2.getID();
        boolean boolean16 = dateTimeZone2.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0963");
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
        java.lang.String str26 = dateTimeZone2.getName((long) '#');
        java.lang.String str28 = dateTimeZone2.getShortName((-28799969L));
        long long30 = dateTimeZone2.nextTransition(60054L);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:01" + "'", str26, "+00:01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60054L + "'", long30 == 60054L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0964");
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
        int int46 = dateTimeZone2.getStandardOffset((-39179968L));
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60000 + "'", int46 == 60000);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0965");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        java.lang.String str5 = dateTimeZone1.getName((-28799900L));
        long long7 = dateTimeZone1.previousTransition((-59903L));
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getShortName((long) 25200000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59903L) + "'", long7 == (-59903L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0966");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) 0, locale4);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) (byte) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone0.getNameKey((long) (-1));
        boolean boolean13 = dateTimeZone0.isStandardOffset((long) (byte) 0);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone15.convertUTCToLocal((long) '#');
        java.lang.String str19 = dateTimeZone15.getName((long) (byte) 0);
        java.lang.String str21 = dateTimeZone15.getShortName((long) 28800000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, 3660032L);
        java.lang.String str26 = dateTimeZone15.getNameKey((-3659965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 34L + "'", long17 == 34L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3660032L + "'", long24 == 3660032L);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0967");
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
        java.lang.String str22 = dateTimeZone0.getID();
        boolean boolean24 = dateTimeZone0.isStandardOffset((-6719900L));
        long long26 = dateTimeZone0.convertUTCToLocal(28740000L);
        java.lang.String str27 = dateTimeZone0.toString();
        long long31 = dateTimeZone0.convertLocalToUTC((-39599902L), false, 21960000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-59902L) + "'", long18 == (-59902L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 28739999L + "'", long26 == 28739999L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-39599901L) + "'", long31 == (-39599901L));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0968");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0969");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str12 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0970");
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
        boolean boolean18 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0971");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (short) -1, locale10);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone0.convertUTCToLocal(2L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60002L + "'", long15 == 60002L);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0972");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21660000L + "'", long14 == 21660000L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0973");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean4 = dateTimeZone1.isStandardOffset((-59968L));
        long long8 = dateTimeZone1.convertLocalToUTC(60000L, false, 3660032L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.001" + "'", str2, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 59999L + "'", long8 == 59999L);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0974");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getName((long) (short) 0);
        java.lang.String str7 = dateTimeZone2.getName(0L);
        java.lang.String str8 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.nextTransition((long) (byte) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName(0L, locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        int int17 = dateTimeZone15.getOffsetFromLocal((long) 60000);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone15.isLocalDateTimeGap(localDateTime18);
        long long21 = dateTimeZone2.getMillisKeepLocal(dateTimeZone15, (-119967L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-59999L) + "'", long21 == (-59999L));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0975");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0976");
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
        java.lang.String str18 = dateTimeZone2.getNameKey((-28739964L));
        int int20 = dateTimeZone2.getStandardOffset((-3600000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0977");
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
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        int int16 = dateTimeZone1.getStandardOffset(120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "66) test0977(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "62) test0977(JA_031_Regression1)":         org.junit.Assert.assertNull(str7);
// flaky "56) test0977(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
// flaky "53) test0977(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky "41) test0977(JA_031_Regression1)":         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:01");
// flaky "30) test0977(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0978");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(1L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(0L, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) '4', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        java.lang.String str11 = dateTimeZone0.getShortName((-60001L));
        boolean boolean12 = dateTimeZone0.isFixed();
        java.lang.String str13 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "67) test0978(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "63) test0978(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "57) test0978(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "54) test0978(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "42) test0978(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0979");
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
        java.lang.String str29 = dateTimeZone10.getShortName(68L);
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0980");
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
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0981");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long4 = dateTimeZone2.convertUTCToLocal(1L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.convertLocalToUTC(3600000L, false);
        java.lang.String str13 = dateTimeZone2.getName((long) '4');
        java.util.TimeZone timeZone14 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0982");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(60001L, locale4);
        java.lang.String str6 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0983");
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
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "68) test0983(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "64) test0983(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "58) test0983(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "55) test0983(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59990L) + "'", long11 == (-59990L));
// flaky "43) test0983(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
// flaky "31) test0983(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0984");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 1, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-28799900L), true, (long) '#');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) 28800000, locale10);
        long long13 = dateTimeZone1.previousTransition(0L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "69) test0984(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:01" + "'", str4, "+00:01");
// flaky "65) test0984(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28859900L) + "'", long8 == (-28859900L));
// flaky "59) test0984(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky "56) test0984(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0985");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getShortName(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getShortName(0L, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone3.getName((long) '4', locale10);
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone3.isLocalDateTimeGap(localDateTime14);
        java.lang.String str17 = dateTimeZone3.getName((-59990L));
        java.lang.String str18 = dateTimeZone3.toString();
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, 5699968L);
        int int22 = dateTimeZone3.getOffsetFromLocal(21959968L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky "70) test0985(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "66) test0985(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky "60) test0985(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "57) test0985(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
// flaky "44) test0985(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
// flaky "32) test0985(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1080032L) + "'", long20 == (-1080032L));
// flaky "22) test0985(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0986");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:35");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0987");
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
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone0.getShortName((long) 25200000, locale23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "71) test0987(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky "67) test0987(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky "61) test0987(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "58) test0987(JA_031_Regression1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-59990L) + "'", long21 == (-59990L));
// flaky "45) test0987(JA_031_Regression1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0988");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone2.getNameKey((long) (-1));
        java.lang.Object obj7 = null;
        boolean boolean8 = dateTimeZone2.equals(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0989");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+08");
        long long3 = dateTimeZone1.convertUTCToLocal((-119900L));
        long long7 = dateTimeZone1.convertLocalToUTC(60000L, false, (long) (-3600000));
        java.lang.String str9 = dateTimeZone1.getName((-119900L));
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 1, locale13);
        java.lang.String str16 = dateTimeZone11.getNameKey((-28919900L));
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone11.isLocalDateTimeGap(localDateTime17);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 0L);
        boolean boolean21 = dateTimeZone1.isFixed();
        long long23 = dateTimeZone1.previousTransition((-59902L));
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone1.getName((-3600000L), locale25);
        int int28 = dateTimeZone1.getOffset((-22L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28680100L + "'", long3 == 28680100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28740000L) + "'", long7 == (-28740000L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+08:00" + "'", str9, "+08:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32400000L + "'", long20 == 32400000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-59902L) + "'", long23 == (-59902L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+08:00" + "'", str26, "+08:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 28800000 + "'", int28 == 28800000);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0990");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long9 = dateTimeZone1.convertUTCToLocal((long) '4');
        long long11 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(60032L, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 51L + "'", long9 == 51L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0991");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        boolean boolean13 = dateTimeZone2.isStandardOffset((long) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getShortName(0L, locale15);
        long long20 = dateTimeZone2.convertLocalToUTC(25200000L, true, 32L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone2.getShortName(32340098L, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59903L) + "'", long11 == (-59903L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 25140000L + "'", long20 == 25140000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0992");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.previousTransition((-3659999L));
        long long7 = dateTimeZone1.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3659999L) + "'", long4 == (-3659999L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0993");
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
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long20 = dateTimeZone17.convertLocalToUTC((-1020032L), true);
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
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1080032L) + "'", long20 == (-1080032L));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0994");
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
        int int15 = dateTimeZone0.getOffset((-59902L));
        int int17 = dateTimeZone0.getStandardOffset(28680100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0995");
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
        long long28 = dateTimeZone14.convertLocalToUTC(21960000L, true);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 21960000L + "'", long28 == 21960000L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0996");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.nextTransition((-1L));
        long long5 = dateTimeZone1.previousTransition(60054L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60054L + "'", long5 == 60054L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0997");
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
        int int23 = dateTimeZone0.getOffsetFromLocal((-28800032L));
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 53L + "'", long21 == 53L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0998");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        boolean boolean5 = dateTimeZone1.isFixed();
        boolean boolean7 = dateTimeZone1.isStandardOffset((-28919900L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test0999");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_031_Regression1.test1000");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.convertLocalToUTC((long) (-1), false);
        long long8 = dateTimeZone2.nextTransition(60034L);
        boolean boolean10 = dateTimeZone2.isStandardOffset(98L);
        int int12 = dateTimeZone2.getOffsetFromLocal(28800010L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getShortName(28740010L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60034L + "'", long8 == 60034L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }
}
