import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_039_Regression2 {

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
            System.out.format("%n%s%n", "JA_039_Regression2.test1001");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.plusMonths(0);
        org.joda.time.Period period15 = period13.plusMonths((int) '#');
        org.joda.time.Period period17 = period13.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType18 = period13.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) -1, periodType18, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5, periodType18);
        org.joda.time.Weeks weeks22 = period21.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(weeks22);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1002");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        int int2 = period1.getMinutes();
        org.joda.time.Period period4 = period1.minusYears((-11));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1003");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period9.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.Period period23 = period17.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.Period period30 = period21.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.PeriodType periodType31 = period29.getPeriodType();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.Period period36 = period35.normalizedStandard();
        org.joda.time.Period period38 = period35.plusMinutes((int) ' ');
        org.joda.time.Period period39 = period38.normalizedStandard();
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) period39);
        org.joda.time.format.PeriodFormatter periodFormatter41 = null;
        java.lang.String str42 = period40.toString(periodFormatter41);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant59, readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = period61.toDurationFrom(readableInstant62);
        org.joda.time.Period period65 = period61.plusMonths(0);
        org.joda.time.Period period67 = period65.plusMonths((int) '#');
        org.joda.time.Period period69 = period65.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType70 = period65.getPeriodType();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((long) (short) -1, periodType70, chronology71);
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant52, (org.joda.time.ReadableDuration) duration57, periodType70);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (short) 100, periodType70, chronology74);
        org.joda.time.Period period76 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType70);
        org.joda.time.Period period77 = new org.joda.time.Period((java.lang.Object) str42, periodType70);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((java.lang.Object) duration13, periodType70, chronology78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(10L, periodType70, chronology80);
        boolean boolean82 = period1.equals((java.lang.Object) chronology80);
        java.lang.String str83 = period1.toString();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT32M" + "'", str42, "PT32M");
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "PT0.010S" + "'", str83, "PT0.010S");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(100L, chronology1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period12 = period6.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period6.withYears(10);
        org.joda.time.Period period15 = period2.plus((org.joda.time.ReadablePeriod) period6);
        int int16 = period2.getMonths();
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1005");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) -1, periodType28, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType28);
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 10, periodType28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period2, periodType28, chronology33);
        org.joda.time.Period period36 = period34.minusMinutes(10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.MutablePeriod mutablePeriod50 = period49.toMutablePeriod();
        org.joda.time.Period period51 = period45.plus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant52, readableInstant53, periodType54);
        org.joda.time.Period period57 = period55.plusMonths((int) '4');
        org.joda.time.Period period58 = period49.withFields((org.joda.time.ReadablePeriod) period57);
        org.joda.time.PeriodType periodType59 = period57.getPeriodType();
        org.joda.time.Period period60 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType59);
        org.joda.time.Period period61 = new org.joda.time.Period((long) 'a', (long) 10, periodType59);
        org.joda.time.Period period62 = new org.joda.time.Period((long) (short) 100, 100L, periodType59);
        org.joda.time.Period period63 = period34.withPeriodType(periodType59);
        org.joda.time.Period period65 = period34.plusYears((int) (byte) 100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(mutablePeriod50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1006");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT1H0.010S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1007");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = period2.normalizedStandard(periodType8);
        org.joda.time.Period period11 = period9.minusMonths((int) ' ');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1008");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        org.joda.time.Period period30 = period24.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType33);
        org.joda.time.Period period36 = period34.plusMonths((int) '4');
        org.joda.time.Period period37 = period28.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.PeriodType periodType38 = period36.getPeriodType();
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType38);
        org.joda.time.Period period40 = new org.joda.time.Period(100, (int) '4', 10, 0, (int) (short) 1, (int) ' ', (int) (short) 0, (int) (byte) 10, periodType38);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11, periodType38);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant42);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1009");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '4');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1010");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        int int2 = period1.size();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period1.toDurationFrom(readableInstant3);
        int int5 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1011");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period13 = period3.minusWeeks((int) (short) -1);
        java.lang.String str14 = period3.toString();
        org.joda.time.Period period16 = org.joda.time.Period.months((int) (short) 100);
        org.joda.time.Period period18 = period16.minusSeconds((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType20 = period16.getFieldType((int) (byte) 0);
        int int21 = period3.get(durationFieldType20);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        org.joda.time.Period period32 = period26.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.Period period39 = period30.withFields((org.joda.time.ReadablePeriod) period38);
        org.joda.time.PeriodType periodType40 = period38.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType40);
        org.joda.time.Period period42 = new org.joda.time.Period((java.lang.Object) period3, periodType40);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.097S" + "'", str14, "PT0.097S");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1012");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, (long) (byte) 100);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1013");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT1M36.988S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1014");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period8.minusMonths(1);
        org.joda.time.Period period12 = period8.withSeconds((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1015");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-11), (long) (-97), periodType2);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1016");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.plusDays((int) ' ');
        org.joda.time.Period period11 = period7.minusMinutes(0);
        org.joda.time.Period period12 = period7.normalizedStandard();
        int int13 = period7.getWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1017");
        org.joda.time.Period period8 = new org.joda.time.Period(97, 100, 1, (int) (short) 0, (int) (short) 0, (-100), 1, (int) (short) 0);
        org.joda.time.Period period10 = period8.withMonths((int) '4');
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1018");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.Period period5 = period1.minusYears((int) '#');
        int int6 = period5.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1019");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) -1);
        org.joda.time.Period period3 = period1.plusMinutes(10);
        org.joda.time.Period period5 = period3.plusHours(0);
        org.joda.time.Period period7 = period5.withMinutes((int) '#');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1020");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.Period period31 = period27.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) -1, periodType32, chronology33);
        org.joda.time.Period period35 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType32);
        org.joda.time.Period period36 = period35.toPeriod();
        org.joda.time.Period period37 = period11.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period39 = period37.withYears(0);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1021");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Days days6 = period3.toStandardDays();
        org.joda.time.Period period8 = period3.plusSeconds((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period3.toDurationFrom(readableInstant9);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1022");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.Period period35 = period33.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType41 = period39.getFieldType((int) (byte) 0);
        int int42 = period35.indexOf(durationFieldType41);
        int int43 = period27.get(durationFieldType41);
        org.joda.time.Period period45 = period17.withField(durationFieldType41, (int) (short) 0);
        boolean boolean46 = period10.isSupported(durationFieldType41);
        org.joda.time.Weeks weeks47 = period10.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(weeks47);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1023");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 'a', periodType2, chronology3);
        org.joda.time.Period period6 = period4.withMinutes(0);
        int int7 = period4.getMillis();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period10.plusMinutes((int) ' ');
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period14);
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = period15.toString(periodFormatter16);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (short) -1, periodType45, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration32, periodType45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (short) 100, periodType45, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType45);
        org.joda.time.Period period52 = new org.joda.time.Period((java.lang.Object) str17, periodType45);
        org.joda.time.Period period53 = period4.minus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.Period period54 = period52.toPeriod();
        org.joda.time.Period period56 = period52.minusMonths(100);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period52.toDurationFrom(readableInstant57);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationFrom(readableInstant65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant68, readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = period70.toDurationFrom(readableInstant71);
        org.joda.time.Period period74 = period70.plusMonths(0);
        org.joda.time.Period period76 = period74.plusMonths((int) '#');
        org.joda.time.Period period78 = period74.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType79 = period74.getPeriodType();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) (short) -1, periodType79, chronology80);
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration66, periodType79);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType79, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration58, periodType79);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT32M" + "'", str17, "PT32M");
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(periodType79);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1024");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period5 = org.joda.time.Period.millis((int) ' ');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period24 = period18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.Period period30 = period28.plusMonths((int) '4');
        org.joda.time.Period period31 = period22.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType32 = period30.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType32);
        org.joda.time.Period period34 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType32);
        org.joda.time.Period period35 = period5.normalizedStandard(periodType32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology38);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) str40);
        org.joda.time.Period period43 = period41.plusSeconds((int) 'a');
        org.joda.time.Period period45 = period41.plusYears((int) (byte) 0);
        org.joda.time.Period period47 = period41.withMonths(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.Period period51 = period50.normalizedStandard();
        org.joda.time.Period period53 = period50.plusMinutes((int) ' ');
        org.joda.time.Period period54 = period53.normalizedStandard();
        org.joda.time.Period period56 = period54.minusSeconds((int) '#');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant57, readableInstant58);
        org.joda.time.Period period60 = period59.normalizedStandard();
        org.joda.time.Period period62 = period59.plusMinutes((int) ' ');
        org.joda.time.Period period63 = period62.normalizedStandard();
        org.joda.time.Period period64 = new org.joda.time.Period((java.lang.Object) period63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant66, readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period68.toDurationFrom(readableInstant69);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant72, readableInstant73);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Duration duration76 = period74.toDurationFrom(readableInstant75);
        org.joda.time.Period period78 = period74.plusMonths(0);
        org.joda.time.Period period80 = period78.plusMonths((int) '#');
        org.joda.time.Period period82 = period78.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType83 = period78.getPeriodType();
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((long) (short) -1, periodType83, chronology84);
        org.joda.time.Period period86 = new org.joda.time.Period(readableInstant65, (org.joda.time.ReadableDuration) duration70, periodType83);
        org.joda.time.Period period87 = period64.withPeriodType(periodType83);
        org.joda.time.Period period88 = period54.normalizedStandard(periodType83);
        org.joda.time.Period period89 = period41.normalizedStandard(periodType83);
        org.joda.time.Period period90 = period5.withPeriodType(periodType83);
        org.joda.time.Period period91 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType83);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period92 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT-0.011S" + "'", str40, "PT-0.011S");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period90);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1025");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        int int9 = period8.getSeconds();
        java.lang.String str10 = period8.toString();
        org.joda.time.Period period12 = period8.minusMonths((int) (byte) 10);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P35M" + "'", str10, "P35M");
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1026");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusHours((-1));
        int int14 = period13.getMinutes();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1027");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.format.PeriodFormatter periodFormatter6 = null;
        java.lang.String str7 = mutablePeriod5.toString(periodFormatter6);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT-0.002S" + "'", str7, "PT-0.002S");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1028");
        org.joda.time.Period period1 = org.joda.time.Period.days(100);
        org.joda.time.Period period3 = period1.withMonths((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1029");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        int int15 = period10.getHours();
        org.joda.time.Weeks weeks16 = period10.toStandardWeeks();
        org.joda.time.Period period18 = period10.plusHours(8);
        org.joda.time.Period period20 = period10.minusMinutes(8);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period10, chronology21);
        org.joda.time.Duration duration23 = period10.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, readableInstant24);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration23);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1030");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 100);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1031");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Period period3 = period1.minusWeeks((int) (short) 10);
        org.joda.time.Period period5 = period3.minusSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1032");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = period1.minusHours((int) (byte) 10);
        org.joda.time.Period period5 = period3.minusDays(100);
        org.joda.time.Period period7 = period5.minusDays((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1033");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = period1.minusHours((int) (byte) 10);
        org.joda.time.Period period5 = period3.minusDays(100);
        org.joda.time.Period period7 = period5.withMonths((int) ' ');
        org.joda.time.Period period9 = period7.minusHours((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours10 = period9.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1034");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        int int6 = period5.getSeconds();
        org.joda.time.Period period8 = period5.withHours(100);
        int int9 = period5.getDays();
        org.joda.time.Period period11 = period5.plusMinutes((-68));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1035");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        int int11 = period6.getWeeks();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = period6.normalizedStandard(periodType12);
        org.joda.time.Period period14 = period3.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period16 = period14.plusHours((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter17 = null;
        java.lang.String str18 = period16.toString(periodFormatter17);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT1H-0.068S" + "'", str18, "PT1H-0.068S");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1036");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Period period14 = period3.withField(durationFieldType12, 1);
        org.joda.time.Duration duration15 = period3.toStandardDuration();
        org.joda.time.Period period17 = period3.minusSeconds((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1037");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, 1L, chronology3);
        org.joda.time.Period period6 = org.joda.time.Period.years(8);
        org.joda.time.Period period7 = period4.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period11 = period9.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Period period17 = period15.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.DurationFieldType durationFieldType23 = period21.getFieldType((int) (byte) 0);
        int int24 = period17.indexOf(durationFieldType23);
        org.joda.time.Period period26 = period9.withFieldAdded(durationFieldType23, 1);
        org.joda.time.Period period28 = period26.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.Period period35 = period33.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.Period period41 = period39.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.DurationFieldType durationFieldType47 = period45.getFieldType((int) (byte) 0);
        int int48 = period41.indexOf(durationFieldType47);
        int int49 = period33.get(durationFieldType47);
        org.joda.time.Period period51 = period28.withFieldAdded(durationFieldType47, (int) (short) 0);
        int int52 = period7.indexOf(durationFieldType47);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = period7.toDurationTo(readableInstant53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(duration54);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1038");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1039");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) (byte) 1);
        org.joda.time.Period period4 = period2.minusYears(1);
        org.joda.time.Period period6 = period4.withMillis(100);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1040");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology13);
        java.lang.String str15 = period14.toString();
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) str15);
        org.joda.time.Period period18 = period16.plusSeconds((int) 'a');
        org.joda.time.Period period20 = period16.plusYears((int) (byte) 0);
        org.joda.time.Period period22 = period16.withMonths(0);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 'a', periodType24, chronology25);
        org.joda.time.Period period28 = period26.withMinutes(0);
        org.joda.time.Period period30 = period28.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod31 = period28.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        org.joda.time.Period period40 = period38.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period38.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period38.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.Period period56 = period54.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, readableInstant58, periodType59);
        org.joda.time.DurationFieldType durationFieldType62 = period60.getFieldType((int) (byte) 0);
        int int63 = period56.indexOf(durationFieldType62);
        int int64 = period48.get(durationFieldType62);
        org.joda.time.Period period66 = period38.withField(durationFieldType62, (int) (short) 0);
        int int67 = mutablePeriod31.indexOf(durationFieldType62);
        int int68 = period22.get(durationFieldType62);
        int int69 = period8.get(durationFieldType62);
        int int70 = period8.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType72 = period8.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT-0.011S" + "'", str15, "PT-0.011S");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-11), chronology1);
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Period period9 = period7.withMinutes(0);
        org.joda.time.Period period11 = period9.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod12 = period9.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period19.toDurationFrom(readableInstant22);
        org.joda.time.Period period25 = period19.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.Period period31 = period29.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.Period period37 = period35.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.DurationFieldType durationFieldType43 = period41.getFieldType((int) (byte) 0);
        int int44 = period37.indexOf(durationFieldType43);
        int int45 = period29.get(durationFieldType43);
        org.joda.time.Period period47 = period19.withField(durationFieldType43, (int) (short) 0);
        int int48 = mutablePeriod12.indexOf(durationFieldType43);
        org.joda.time.Period period50 = period3.withField(durationFieldType43, (int) (short) 0);
        int int51 = period50.getYears();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = period2.minusMillis((int) (short) 10);
        org.joda.time.Period period6 = period2.minusSeconds((int) (short) 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1043");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period15 = period13.minusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.withWeeks((int) (short) -1);
        org.joda.time.Period period18 = period7.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = period7.minusHours((-68));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1044");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        org.joda.time.Period period4 = org.joda.time.Period.hours(1);
        org.joda.time.Period period6 = period4.plusMinutes((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Period period12 = period9.plusMinutes((int) ' ');
        org.joda.time.Period period13 = period12.normalizedStandard();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = period14.toString(periodFormatter15);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Period period39 = period35.plusMonths(0);
        org.joda.time.Period period41 = period39.plusMonths((int) '#');
        org.joda.time.Period period43 = period39.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType44 = period39.getPeriodType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) -1, periodType44, chronology45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration31, periodType44);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (short) 100, periodType44, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType44);
        org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) str16, periodType44);
        org.joda.time.Period period53 = period51.minusWeeks(100);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableInstant55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationFrom(readableInstant57);
        org.joda.time.Period period60 = period56.plusMonths(0);
        org.joda.time.Period period62 = period60.plusMonths((int) '#');
        org.joda.time.Period period64 = period60.plusMinutes((int) (short) 100);
        org.joda.time.Period period66 = period64.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType68 = period64.getFieldType((int) (byte) 0);
        org.joda.time.Period period70 = period53.withField(durationFieldType68, 100);
        org.joda.time.Period period72 = period6.withField(durationFieldType68, (int) (byte) 1);
        org.joda.time.Period period74 = period0.withField(durationFieldType68, 97);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT32M" + "'", str16, "PT32M");
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1045");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-31));
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period4 = period1.multipliedBy(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.withHours((-1));
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1046");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        int int9 = period8.getSeconds();
        java.lang.String str10 = period8.toString();
        org.joda.time.Period period12 = period8.minusMonths(8);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P35M" + "'", str10, "P35M");
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1047");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-68));
        int int2 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1048");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.DurationFieldType durationFieldType11 = period9.getFieldType((int) (byte) 0);
        int int12 = period5.indexOf(durationFieldType11);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.Period period18 = period16.withMinutes(0);
        int int19 = period16.getMillis();
        org.joda.time.Period period20 = period5.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period22 = period5.plusWeeks(10);
        org.joda.time.Period period24 = period22.plusWeeks((int) (byte) 100);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1049");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1050");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology4);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) str6);
        org.joda.time.Period period9 = period7.plusSeconds((int) 'a');
        org.joda.time.Period period11 = period9.plusWeeks((int) (short) 10);
        org.joda.time.Period period13 = period9.minusMillis((int) (byte) 1);
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology17);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) str19);
        org.joda.time.Period period22 = period20.plusSeconds((int) 'a');
        org.joda.time.Period period24 = period20.plusYears((int) (byte) 0);
        org.joda.time.Period period26 = period20.withMonths(0);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', periodType28, chronology29);
        org.joda.time.Period period32 = period30.withMinutes(0);
        org.joda.time.Period period34 = period32.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod35 = period32.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period42.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period42.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.Period period54 = period52.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.Period period60 = period58.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.DurationFieldType durationFieldType66 = period64.getFieldType((int) (byte) 0);
        int int67 = period60.indexOf(durationFieldType66);
        int int68 = period52.get(durationFieldType66);
        org.joda.time.Period period70 = period42.withField(durationFieldType66, (int) (short) 0);
        int int71 = mutablePeriod35.indexOf(durationFieldType66);
        int int72 = period26.get(durationFieldType66);
        boolean boolean73 = period14.isSupported(durationFieldType66);
        int int74 = period1.indexOf(durationFieldType66);
        org.joda.time.Days days75 = period1.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-0.011S" + "'", str6, "PT-0.011S");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT-0.011S" + "'", str19, "PT-0.011S");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(days75);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1051");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        int int23 = period21.getMillis();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period21);
        java.lang.Object obj27 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 'a', periodType31, chronology32);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 'a', periodType35, chronology36);
        org.joda.time.Hours hours38 = period37.toStandardHours();
        org.joda.time.Period period39 = period33.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period41 = period33.withYears(10);
        org.joda.time.Period period42 = period41.toPeriod();
        org.joda.time.Period period44 = period41.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period55.plusMonths(0);
        org.joda.time.Period period61 = period59.plusMonths((int) '#');
        org.joda.time.Period period63 = period59.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType64 = period59.getPeriodType();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) (short) -1, periodType64, chronology65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration51, periodType64);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) (byte) 0, periodType64, chronology68);
        org.joda.time.Period period70 = period44.normalizedStandard(periodType64);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(0L, (long) 8, periodType64, chronology71);
        org.joda.time.Period period73 = new org.joda.time.Period(obj27, periodType64);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) '#', (long) 1, periodType64, chronology74);
        org.joda.time.Period period76 = period18.withPeriodType(periodType64);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Duration duration78 = period76.toDurationTo(readableInstant77);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(duration78);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1052");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Weeks weeks7 = period5.toStandardWeeks();
        org.joda.time.Period period9 = period5.withMillis((int) (short) 10);
        org.joda.time.Period period11 = period9.plusHours((int) (byte) 10);
        org.joda.time.Period period12 = period9.toPeriod();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1053");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period8.withMonths((int) (byte) 0);
        org.joda.time.Period period14 = period8.plusWeeks((int) (byte) 1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology17);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) str19);
        org.joda.time.Period period22 = period20.plusSeconds((int) 'a');
        org.joda.time.Period period24 = period22.plusWeeks((int) (short) 10);
        org.joda.time.Period period26 = period22.minusMillis((int) (byte) 1);
        org.joda.time.Period period27 = period8.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period36.toDurationFrom(readableInstant39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant58, readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        org.joda.time.Period period64 = period60.plusMonths(0);
        org.joda.time.Period period66 = period64.plusMonths((int) '#');
        org.joda.time.Period period68 = period64.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType69 = period64.getPeriodType();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (short) -1, periodType69, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration56, periodType69);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (short) 100, periodType69, chronology73);
        org.joda.time.Period period75 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType69);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration40, periodType69);
        org.joda.time.Period period77 = period26.withPeriodType(periodType69);
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType69);
        org.joda.time.Period period80 = period78.withHours((int) (short) 1);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT-0.011S" + "'", str19, "PT-0.011S");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period80);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1054");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period5.withMonths(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period17 = period14.plusMinutes((int) ' ');
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period18.minusSeconds((int) '#');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.Period period24 = period23.normalizedStandard();
        org.joda.time.Period period26 = period23.plusMinutes((int) ' ');
        org.joda.time.Period period27 = period26.normalizedStandard();
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) period27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.Period period46 = period42.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType47 = period42.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (short) -1, periodType47, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration34, periodType47);
        org.joda.time.Period period51 = period28.withPeriodType(periodType47);
        org.joda.time.Period period52 = period18.normalizedStandard(periodType47);
        org.joda.time.Period period53 = period5.normalizedStandard(periodType47);
        org.joda.time.Period period55 = period5.plusHours((-31));
        org.joda.time.Period period56 = period55.negated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1055");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days9 = period8.toStandardDays();
        int int10 = period8.getSeconds();
        org.joda.time.Period period12 = period8.minusWeeks((int) (short) 10);
        int int13 = period12.getMonths();
        org.joda.time.Period period15 = period12.withHours(0);
        org.joda.time.Period period17 = period12.withMinutes((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1056");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        org.joda.time.Period period34 = period9.withMonths((-1));
        org.joda.time.Period period36 = period9.plusMonths((int) (byte) 10);
        org.joda.time.Period period37 = period9.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int39 = period9.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1057");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((-1), 0, (int) (short) 100, 0);
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1058");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.Period period3 = period1.minusSeconds((int) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1059");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1060");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.Period period16 = period14.plusMonths((int) '4');
        org.joda.time.Period period17 = period8.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = period16.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType18);
        org.joda.time.Period period21 = period19.plusWeeks((int) (byte) 10);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1061");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(0L, periodType10, chronology11);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1062");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1063");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1064");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period12 = period10.withMinutes(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1065");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.Period period14 = period12.plusSeconds((-31));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1066");
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(10L, (long) (short) 0, periodType5, chronology6);
        org.joda.time.Period period9 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.Hours hours14 = period13.toStandardHours();
        org.joda.time.Period period16 = period13.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.DurationFieldType durationFieldType22 = period20.getFieldType((int) (byte) 0);
        org.joda.time.Period period24 = period13.withField(durationFieldType22, 1);
        boolean boolean25 = period9.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.Period period31 = period29.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.DurationFieldType durationFieldType37 = period35.getFieldType((int) (byte) 0);
        int int38 = period31.indexOf(durationFieldType37);
        org.joda.time.Period period40 = period9.withFieldAdded(durationFieldType37, (int) (short) 0);
        int int41 = period7.get(durationFieldType37);
        org.joda.time.PeriodType periodType42 = period7.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 8, periodType42, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 1, 10L, periodType42, chronology45);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(periodType42);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1067");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = period2.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1068");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.Period period3 = period1.withSeconds(8);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period1.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) period1);
        org.joda.time.Period period8 = period1.plusDays((-100));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1069");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusWeeks(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1070");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.plusMinutes((int) ' ');
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.Period period9 = period7.minusSeconds((int) '#');
        org.joda.time.Period period11 = period7.minusYears((int) (short) 100);
        org.joda.time.Period period13 = period7.minusMillis((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        org.joda.time.Period period28 = period22.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.Period period34 = period32.plusMonths((int) '4');
        org.joda.time.Period period35 = period26.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.PeriodType periodType36 = period34.getPeriodType();
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType36);
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', (long) 10, periodType36);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration15, periodType36);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1071");
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.Period period16 = period12.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType17, chronology18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.Period period32 = period28.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType33 = period28.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType33, chronology34);
        org.joda.time.Period period36 = period19.withPeriodType(periodType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (-100), (long) 100, periodType33, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period((long) 0, (long) 1, periodType33);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1072");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration8, periodType21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 0, periodType21, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType21);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        int int29 = period27.getMillis();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1073");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.plusMinutes((-1));
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period11.plusMinutes((int) ' ');
        org.joda.time.Duration duration15 = period11.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.Period period36 = period32.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType37 = period32.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) -1, periodType37, chronology38);
        org.joda.time.Period period40 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType37);
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 10, periodType37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) period11, periodType37, chronology42);
        org.joda.time.Period period44 = period6.withPeriodType(periodType37);
        org.joda.time.Period period46 = period44.withSeconds((int) (short) -1);
        int int47 = period44.getYears();
        org.joda.time.Minutes minutes48 = period44.toStandardMinutes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(minutes48);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1074");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        java.lang.Object obj26 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 'a', periodType30, chronology31);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', periodType34, chronology35);
        org.joda.time.Hours hours37 = period36.toStandardHours();
        org.joda.time.Period period38 = period32.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period40 = period32.withYears(10);
        org.joda.time.Period period41 = period40.toPeriod();
        org.joda.time.Period period43 = period40.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.Period period58 = period54.plusMonths(0);
        org.joda.time.Period period60 = period58.plusMonths((int) '#');
        org.joda.time.Period period62 = period58.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType63 = period58.getPeriodType();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (short) -1, periodType63, chronology64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration50, periodType63);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((long) (byte) 0, periodType63, chronology67);
        org.joda.time.Period period69 = period43.normalizedStandard(periodType63);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(0L, (long) 8, periodType63, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(obj26, periodType63);
        org.joda.time.Period period73 = new org.joda.time.Period(8, (int) (byte) 10, (int) 'a', (-1), 10, (-1), (int) ' ', 100, periodType63);
        org.joda.time.Period period74 = new org.joda.time.Period((int) '#', (int) (byte) 0, 0, (int) ' ', (int) ' ', (-1), (int) (byte) 100, 97, periodType63);
        org.joda.time.Period period75 = new org.joda.time.Period(97, (int) (short) 1, (int) '#', (int) (short) 10, (int) (short) -1, (int) (byte) 100, (int) (byte) 1, (int) (byte) 1, periodType63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period76 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1075");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Hours hours21 = period20.toStandardHours();
        org.joda.time.Period period22 = period16.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period16.withYears(10);
        org.joda.time.Period period26 = period16.withMinutes((int) (byte) 1);
        org.joda.time.Period period27 = period12.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.format.PeriodFormatter periodFormatter28 = null;
        java.lang.String str29 = period12.toString(periodFormatter28);
        int int30 = period12.getSeconds();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0S" + "'", str29, "PT0S");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1076");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period3.minusYears(1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1077");
        org.joda.time.Period period4 = new org.joda.time.Period((-1), (-97), (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1078");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) -1);
        org.joda.time.Period period3 = period1.plusMinutes(10);
        org.joda.time.Period period5 = period3.plusHours(0);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1079");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Hours hours7 = period5.toStandardHours();
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1080");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        int int10 = period9.getDays();
        org.joda.time.Period period12 = period9.minusWeeks((int) '#');
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1081");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Period period8 = period3.plusMillis((int) '4');
        org.joda.time.Period period10 = period8.plusMillis(97);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1082");
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) (short) 10, (int) (byte) 1, (int) (short) 10, (int) (short) -1, (int) (byte) 10, (int) (short) 10, (-11));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1083");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = period14.get(durationFieldType15);
        org.joda.time.Period period17 = period10.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period19 = period10.minusSeconds((int) 'a');
        org.joda.time.Period period20 = period6.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period6.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant23);
        int int25 = period24.getWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1084");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 'a', periodType2, chronology3);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 'a', periodType6, chronology7);
        org.joda.time.Hours hours9 = period8.toStandardHours();
        org.joda.time.Period period10 = period4.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period4.withYears(10);
        org.joda.time.Period period13 = period12.toPeriod();
        org.joda.time.Period period15 = period12.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 0, periodType35, chronology39);
        org.joda.time.Period period41 = period15.normalizedStandard(periodType35);
        org.joda.time.Period period42 = new org.joda.time.Period((long) 1, periodType35);
        int int43 = period42.getMillis();
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1085");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        int int2 = period1.size();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = period1.withPeriodType(periodType3);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1086");
        org.joda.time.Period period1 = org.joda.time.Period.years(1);
        int int2 = period1.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1087");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(0L, 0L, chronology3);
        org.joda.time.Period period6 = period4.withHours((int) 'a');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant10);
        org.joda.time.Period period13 = period11.minusHours((-100));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1088");
        java.lang.Object obj18 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', periodType26, chronology27);
        org.joda.time.Hours hours29 = period28.toStandardHours();
        org.joda.time.Period period30 = period24.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period24.withYears(10);
        org.joda.time.Period period33 = period32.toPeriod();
        org.joda.time.Period period35 = period32.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        org.joda.time.Period period50 = period46.plusMonths(0);
        org.joda.time.Period period52 = period50.plusMonths((int) '#');
        org.joda.time.Period period54 = period50.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType55 = period50.getPeriodType();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (short) -1, periodType55, chronology56);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration42, periodType55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (byte) 0, periodType55, chronology59);
        org.joda.time.Period period61 = period35.normalizedStandard(periodType55);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(0L, (long) 8, periodType55, chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period(obj18, periodType55);
        org.joda.time.Period period65 = new org.joda.time.Period(8, (int) (byte) 10, (int) 'a', (-1), 10, (-1), (int) ' ', 100, periodType55);
        org.joda.time.Period period66 = new org.joda.time.Period((int) '#', (int) (byte) 0, 0, (int) ' ', (int) ' ', (-1), (int) (byte) 100, 97, periodType55);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((long) (-97), (long) (short) 0, periodType55, chronology67);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1089");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        int int5 = period2.getDays();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.Period period9 = period8.normalizedStandard();
        int int10 = period8.getMillis();
        org.joda.time.Period period12 = period8.withHours((int) (byte) 0);
        org.joda.time.Period period14 = period12.withDays(97);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Period period21 = period18.plusSeconds((int) (byte) 1);
        org.joda.time.Period period22 = period12.withFields((org.joda.time.ReadablePeriod) period21);
        int[] intArray23 = period21.getValues();
        boolean boolean24 = period2.equals((java.lang.Object) period21);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0, 0, 0, 0, 0, 0, 1, 97 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1090");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.days(1);
        org.joda.time.Period period4 = period2.withSeconds(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period2.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period17 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.Period period23 = period21.plusMonths((int) '4');
        org.joda.time.Period period24 = period15.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType25 = period23.getPeriodType();
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType25);
        org.joda.time.Period period28 = period26.withMinutes((int) (byte) 100);
        org.joda.time.Period period30 = period26.minusMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.MutablePeriod mutablePeriod48 = period47.toMutablePeriod();
        org.joda.time.Period period49 = period43.plus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, readableInstant51, periodType52);
        org.joda.time.Period period55 = period53.plusMonths((int) '4');
        org.joda.time.Period period56 = period47.withFields((org.joda.time.ReadablePeriod) period55);
        org.joda.time.PeriodType periodType57 = period55.getPeriodType();
        org.joda.time.Period period58 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType57);
        org.joda.time.Period period59 = new org.joda.time.Period(100, (int) '4', 10, 0, (int) (short) 1, (int) ' ', (int) (short) 0, (int) (byte) 10, periodType57);
        org.joda.time.Period period60 = period26.normalizedStandard(periodType57);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType57);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(period60);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1091");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType18);
        org.joda.time.Period period21 = period19.minusSeconds((int) ' ');
        org.joda.time.Period period23 = period21.minusHours((-1));
        org.joda.time.Period period24 = period23.normalizedStandard();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) '4', periodType27, chronology28);
        org.joda.time.Period period31 = period29.plusMillis(0);
        org.joda.time.Period period33 = period31.plusDays((-100));
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 'a', periodType35, chronology36);
        org.joda.time.Period period39 = period37.withMinutes(0);
        int int40 = period39.getWeeks();
        int int41 = period39.getSeconds();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.Period period47 = period45.minusMillis((int) '4');
        int int48 = period47.getSeconds();
        org.joda.time.Period period50 = period47.withHours(100);
        int int51 = period47.getDays();
        org.joda.time.Period period52 = period39.plus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period54 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period57 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period59 = period57.minusYears(100);
        org.joda.time.Period period60 = period59.negated();
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.Period period66 = period64.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant67, readableInstant68, periodType69);
        org.joda.time.DurationFieldType durationFieldType72 = period70.getFieldType((int) (byte) 0);
        int int73 = period66.indexOf(durationFieldType72);
        org.joda.time.Period period75 = period59.withField(durationFieldType72, 10);
        boolean boolean76 = period54.isSupported(durationFieldType72);
        boolean boolean77 = period39.isSupported(durationFieldType72);
        int int78 = period33.indexOf(durationFieldType72);
        org.joda.time.Period period80 = period24.withFieldAdded(durationFieldType72, (int) (byte) 0);
        int int81 = period8.get(durationFieldType72);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1092");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(97);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.plusMinutes((int) ' ');
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) -1, periodType28, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration15, periodType28);
        org.joda.time.Period period32 = period9.withPeriodType(periodType28);
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) period1, periodType28);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1093");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusWeeks((-100));
        org.joda.time.Period period15 = period11.plusWeeks(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.Period period36 = period32.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType37 = period32.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) -1, periodType37, chronology38);
        org.joda.time.Period period40 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType37);
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 10, periodType37);
        org.joda.time.Period period43 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period45 = period43.plusMillis((int) 'a');
        boolean boolean46 = period41.equals((java.lang.Object) period45);
        org.joda.time.Period period48 = period41.withYears(10);
        org.joda.time.Period period49 = period11.withFields((org.joda.time.ReadablePeriod) period41);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1094");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period11.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 0, periodType34, chronology38);
        org.joda.time.Period period40 = period14.normalizedStandard(periodType34);
        org.joda.time.Period period41 = period14.toPeriod();
        int int42 = period41.getMinutes();
        org.joda.time.PeriodType periodType43 = period41.getPeriodType();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1095");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (byte) -1, chronology2);
        org.joda.time.Period period5 = period3.withHours((int) '4');
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1096");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 0);
        org.joda.time.Period period3 = period1.plusMonths(0);
        org.joda.time.Period period5 = period3.plusHours(8);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period8 = period5.minusDays((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT8H" + "'", str6, "PT8H");
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1097");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period6.toDurationTo(readableInstant15);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1098");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.withWeeks(1);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period14 = period4.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period13.minusMillis((int) ' ');
        org.joda.time.Duration duration17 = period16.toStandardDuration();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 'a', periodType24, chronology25);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', periodType28, chronology29);
        org.joda.time.Hours hours31 = period30.toStandardHours();
        org.joda.time.Period period32 = period26.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period26.withYears(10);
        org.joda.time.Period period35 = period34.toPeriod();
        org.joda.time.Period period37 = period34.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        org.joda.time.Period period52 = period48.plusMonths(0);
        org.joda.time.Period period54 = period52.plusMonths((int) '#');
        org.joda.time.Period period56 = period52.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType57 = period52.getPeriodType();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (short) -1, periodType57, chronology58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration44, periodType57);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) (byte) 0, periodType57, chronology61);
        org.joda.time.Period period63 = period37.normalizedStandard(periodType57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(0L, (long) 8, periodType57, chronology64);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) ' ', periodType57, chronology66);
        org.joda.time.Period period68 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType57);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration17, periodType57);
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 0, chronology1);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1100");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        org.joda.time.Period period9 = period3.withSeconds((int) (short) 0);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(10L, (long) (short) 0, periodType12, chronology13);
        org.joda.time.Period period16 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Hours hours21 = period20.toStandardHours();
        org.joda.time.Period period23 = period20.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.DurationFieldType durationFieldType29 = period27.getFieldType((int) (byte) 0);
        org.joda.time.Period period31 = period20.withField(durationFieldType29, 1);
        boolean boolean32 = period16.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.DurationFieldType durationFieldType44 = period42.getFieldType((int) (byte) 0);
        int int45 = period38.indexOf(durationFieldType44);
        org.joda.time.Period period47 = period16.withFieldAdded(durationFieldType44, (int) (short) 0);
        int int48 = period14.get(durationFieldType44);
        org.joda.time.Period period50 = period3.withField(durationFieldType44, (int) '#');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1101");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT1M0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1102");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.Period period21 = period17.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType22 = period17.getPeriodType();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (short) -1, periodType22, chronology23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration9, periodType22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 0, periodType22, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType22);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(0L, periodType22, chronology29);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1103");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 100);
        org.joda.time.Period period3 = period1.plusDays((int) (short) 0);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(obj0, chronology1);
        org.joda.time.Period period4 = period2.minusMinutes((-97));
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1105");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period11 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period5.withYears(10);
        org.joda.time.Period period15 = period5.withMinutes((int) (byte) 1);
        boolean boolean16 = period1.equals((java.lang.Object) period15);
        int int17 = period15.getYears();
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1106");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (byte) -1, chronology2);
        int int4 = period3.getMinutes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1107");
        org.joda.time.Period period9 = org.joda.time.Period.months((int) (short) 100);
        org.joda.time.Period period11 = period9.minusMinutes((-100));
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period(100, (int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (byte) -1, 10, (int) (short) 0, periodType12);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1108");
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) 100, periodType35, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType35);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.MutablePeriod mutablePeriod51 = period50.toMutablePeriod();
        org.joda.time.Period period52 = period46.plus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.Period period59 = period50.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.PeriodType periodType60 = period58.getPeriodType();
        org.joda.time.Period period61 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType60);
        org.joda.time.Period period62 = period41.withPeriodType(periodType60);
        org.joda.time.Period period63 = new org.joda.time.Period((int) (short) 0, (int) '#', 1, 0, (int) (byte) 0, 0, (-11), (int) '4', periodType60);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period62);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1109");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.Period period14 = period6.minusMonths((int) (byte) 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1110");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType26 = period21.getPeriodType();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, periodType26, chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration13, periodType26);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType26);
        org.joda.time.Period period31 = period3.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.Period period41 = period37.plusMonths(0);
        org.joda.time.Period period43 = period41.plusMonths((int) '#');
        org.joda.time.Period period45 = period41.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType46 = period41.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) -1, periodType46, chronology47);
        org.joda.time.Period period49 = period33.minus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        org.joda.time.Period period66 = period62.plusMonths(0);
        org.joda.time.Period period68 = period66.plusMonths((int) '#');
        org.joda.time.Period period70 = period66.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType71 = period66.getPeriodType();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) (short) -1, periodType71, chronology72);
        org.joda.time.Period period74 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType71);
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 10, periodType71);
        org.joda.time.Period period76 = period48.withPeriodType(periodType71);
        org.joda.time.Period period77 = period30.normalizedStandard(periodType71);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = period77.toDurationTo(readableInstant78);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(duration79);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1111");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Hours hours23 = period22.toStandardHours();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period18.withYears(10);
        org.joda.time.Period period27 = period26.toPeriod();
        org.joda.time.Period period29 = period26.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) -1, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 0, periodType49, chronology53);
        org.joda.time.Period period55 = period29.normalizedStandard(periodType49);
        org.joda.time.Period period56 = period11.normalizedStandard(periodType49);
        org.joda.time.Period period58 = period11.plusHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1112");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 10, periodType21);
        org.joda.time.Period period27 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period29 = period27.plusMillis((int) 'a');
        boolean boolean30 = period25.equals((java.lang.Object) period29);
        org.joda.time.Period period32 = period25.minusHours((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period25.toDurationTo(readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period25.toDurationFrom(readableInstant35);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1113");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(100L, (long) ' ', chronology4);
        org.joda.time.Period period7 = period5.plusHours(1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period18.plusMonths(0);
        org.joda.time.Period period24 = period22.plusMonths((int) '#');
        org.joda.time.Period period26 = period22.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType27 = period22.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) -1, periodType27, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration14, periodType27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 0, periodType27, chronology31);
        org.joda.time.Period period33 = period7.withPeriodType(periodType27);
        org.joda.time.Period period34 = period1.normalizedStandard(periodType27);
        org.joda.time.Period period36 = period34.withYears((int) (short) 100);
        org.joda.time.Period period37 = period34.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes38 = period34.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1114");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds15 = period14.toStandardSeconds();
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period14);
        org.joda.time.Period period18 = period16.withMillis((int) (byte) 1);
        org.joda.time.Period period19 = period7.plus((org.joda.time.ReadablePeriod) period16);
        int int21 = period16.getValue((int) (byte) 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1115");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.plusMinutes((int) ' ');
        org.joda.time.Duration duration7 = period3.toStandardDuration();
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Period period19 = period17.withMinutes((-1));
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = period19.normalizedStandard(periodType20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Period period27 = period25.withMinutes(0);
        org.joda.time.Period period29 = period27.minusSeconds((int) (short) 100);
        org.joda.time.Period period31 = period29.withWeeks((int) (short) -1);
        org.joda.time.Period period32 = period21.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.DurationFieldType[] durationFieldTypeArray33 = period31.getFieldTypes();
        org.joda.time.Period period35 = period31.withMonths((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.MutablePeriod mutablePeriod53 = period52.toMutablePeriod();
        org.joda.time.Period period54 = period48.plus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.Period period60 = period58.plusMonths((int) '4');
        org.joda.time.Period period61 = period52.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.PeriodType periodType62 = period60.getPeriodType();
        org.joda.time.Period period63 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType62);
        org.joda.time.Period period64 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) period35, periodType62, chronology65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((long) 10, (long) (short) 100, periodType62, chronology67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((long) (byte) -1, (long) (short) 0, periodType62, chronology69);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant9, periodType62);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldTypeArray33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(mutablePeriod53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1116");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period12 = period10.withMinutes(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.Period period16 = period15.normalizedStandard();
        org.joda.time.Period period18 = period15.plusMinutes((int) ' ');
        org.joda.time.Period period19 = period18.normalizedStandard();
        org.joda.time.Period period21 = period19.plusMinutes((-1));
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.Period period25 = period24.normalizedStandard();
        org.joda.time.Period period27 = period24.plusMinutes((int) ' ');
        org.joda.time.Duration duration28 = period24.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.Period period45 = period41.plusMonths(0);
        org.joda.time.Period period47 = period45.plusMonths((int) '#');
        org.joda.time.Period period49 = period45.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType50 = period45.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) -1, periodType50, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType50);
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 10, periodType50);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) period24, periodType50, chronology55);
        org.joda.time.Period period57 = period19.withPeriodType(periodType50);
        org.joda.time.Period period59 = org.joda.time.Period.months((int) (short) 100);
        org.joda.time.Period period61 = period59.minusSeconds((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType63 = period59.getFieldType((int) (byte) 0);
        boolean boolean64 = period19.isSupported(durationFieldType63);
        boolean boolean65 = period12.isSupported(durationFieldType63);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1117");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.Period period20 = period1.minusSeconds(10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationTo(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant23);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1118");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period11 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period20 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period18.withMonths((int) (byte) 0);
        org.joda.time.Period period24 = period18.plusWeeks((int) (byte) 1);
        boolean boolean25 = period9.equals((java.lang.Object) (byte) 1);
        org.joda.time.Period period27 = period9.plusMillis(0);
        int int28 = period27.getMillis();
        org.joda.time.PeriodType periodType29 = period27.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1119");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration9);
        boolean boolean11 = period1.equals((java.lang.Object) duration9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period16 = org.joda.time.Period.months((int) (byte) -1);
        org.joda.time.Period period18 = period16.plusMinutes(10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        org.joda.time.Period period24 = period21.plusMinutes((int) ' ');
        org.joda.time.Period period25 = period24.normalizedStandard();
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period25);
        org.joda.time.format.PeriodFormatter periodFormatter27 = null;
        java.lang.String str28 = period26.toString(periodFormatter27);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.Period period51 = period47.plusMonths(0);
        org.joda.time.Period period53 = period51.plusMonths((int) '#');
        org.joda.time.Period period55 = period51.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType56 = period51.getPeriodType();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (short) -1, periodType56, chronology57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration43, periodType56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) (short) 100, periodType56, chronology60);
        org.joda.time.Period period62 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType56);
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) str28, periodType56);
        org.joda.time.Period period64 = period18.withPeriodType(periodType56);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant14, periodType56);
        org.joda.time.Period period67 = period65.multipliedBy((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT32M" + "'", str28, "PT32M");
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1120");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration8, periodType21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) 100, periodType21, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType21);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = period27.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1121");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration6, periodType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 0, periodType19, chronology23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period31.toDurationFrom(readableInstant34);
        org.joda.time.Period period37 = period31.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.Period period43 = period41.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, readableInstant51, periodType52);
        org.joda.time.DurationFieldType durationFieldType55 = period53.getFieldType((int) (byte) 0);
        int int56 = period49.indexOf(durationFieldType55);
        int int57 = period41.get(durationFieldType55);
        org.joda.time.Period period59 = period31.withField(durationFieldType55, (int) (short) 0);
        boolean boolean60 = period24.isSupported(durationFieldType55);
        int int61 = period24.size();
        org.joda.time.Period period63 = period24.multipliedBy((int) (byte) 0);
        org.joda.time.Days days64 = period24.toStandardDays();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(days64);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1122");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, periodType23, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration10, periodType23);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType23);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 0, periodType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1123");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.joda.time.Period period10 = period7.withSeconds((int) (short) 10);
        org.joda.time.Period period12 = period7.minusYears((int) (short) 0);
        int int13 = period12.getMinutes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1124");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.minusSeconds((int) '#');
        org.joda.time.Period period10 = period6.minusYears((int) (short) 100);
        org.joda.time.Period period12 = period6.minusMillis((int) (byte) -1);
        org.joda.time.Period period14 = period6.withMillis((int) (short) 1);
        org.joda.time.Period period16 = period14.minusYears((int) '4');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1125");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        org.joda.time.Period period34 = period9.withMonths((-1));
        org.joda.time.DurationFieldType[] durationFieldTypeArray35 = period9.getFieldTypes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray36 = period9.getFieldTypes();
        org.joda.time.Period period38 = period9.plusWeeks((-97));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldTypeArray35);
        org.junit.Assert.assertNotNull(durationFieldTypeArray36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1126");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1127");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period5 = org.joda.time.Period.millis((int) ' ');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period24 = period18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.Period period30 = period28.plusMonths((int) '4');
        org.joda.time.Period period31 = period22.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType32 = period30.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType32);
        org.joda.time.Period period34 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType32);
        org.joda.time.Period period35 = period5.normalizedStandard(periodType32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) 0, 0L, periodType32, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType32);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1128");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) -1, 0, 1, (int) '#');
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1129");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-11), 8, (-97), (int) ' ', 97, (int) (short) 0, (-68), (int) (short) 1, periodType8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1130");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period6.withDays(97);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 'a', periodType10, chronology11);
        org.joda.time.Hours hours13 = period12.toStandardHours();
        org.joda.time.Period period15 = period12.plusSeconds((int) (byte) 1);
        org.joda.time.Period period16 = period6.withFields((org.joda.time.ReadablePeriod) period15);
        int[] intArray17 = period15.getValues();
        org.joda.time.Period period19 = period15.withYears((int) (byte) 10);
        int int20 = period19.getMonths();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 0, 0, 0, 0, 0, 1, 97 });
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1131");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withMonths((int) (short) 0);
        org.joda.time.Period period7 = period3.withMinutes((-11));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1132");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod9 = period7.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod10 = period7.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.DurationFieldType durationFieldType16 = period14.getFieldType((int) (byte) 0);
        org.joda.time.Period period18 = period7.withField(durationFieldType16, (int) 'a');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1133");
        org.joda.time.Period period2 = new org.joda.time.Period(1L, (long) (byte) -1);
        org.joda.time.Period period4 = period2.plusMonths((int) (short) 10);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1134");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        int int3 = period2.getMonths();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1135");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.Period period5 = period3.withYears((int) '4');
        org.joda.time.Period period7 = period5.withMillis((int) (short) 100);
        java.lang.String str8 = period7.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P52Y-1MT0.100S" + "'", str8, "P52Y-1MT0.100S");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1136");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.Period period16 = period14.plusMonths((int) '4');
        org.joda.time.Period period17 = period8.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = period16.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.Period period23 = period22.normalizedStandard();
        org.joda.time.Period period25 = period22.plusMinutes((int) ' ');
        org.joda.time.Period period26 = period25.normalizedStandard();
        org.joda.time.Period period28 = period26.plusMinutes((-1));
        org.joda.time.Period period30 = period28.plusYears(8);
        org.joda.time.Period period31 = period19.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period33 = period19.withWeeks((int) ' ');
        org.joda.time.Period period35 = period19.plusDays((-68));
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1137");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period11.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 0, periodType34, chronology38);
        org.joda.time.Period period40 = period14.normalizedStandard(periodType34);
        org.joda.time.Period period41 = period14.toPeriod();
        int int42 = period41.getMinutes();
        int int43 = period41.getMonths();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1138");
        org.joda.time.Period period8 = new org.joda.time.Period((int) '#', (int) 'a', (int) 'a', (-11), (int) (short) 0, (int) '4', 97, (int) '4');
        int int9 = period8.getSeconds();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1139");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-68));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1140");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType26 = period21.getPeriodType();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, periodType26, chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration13, periodType26);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType26);
        org.joda.time.Period period31 = period3.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.Period period41 = period37.plusMonths(0);
        org.joda.time.Period period43 = period41.plusMonths((int) '#');
        org.joda.time.Period period45 = period41.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType46 = period41.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) -1, periodType46, chronology47);
        org.joda.time.Period period49 = period33.minus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        org.joda.time.Period period66 = period62.plusMonths(0);
        org.joda.time.Period period68 = period66.plusMonths((int) '#');
        org.joda.time.Period period70 = period66.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType71 = period66.getPeriodType();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) (short) -1, periodType71, chronology72);
        org.joda.time.Period period74 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType71);
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 10, periodType71);
        org.joda.time.Period period76 = period48.withPeriodType(periodType71);
        org.joda.time.Period period77 = period30.normalizedStandard(periodType71);
        org.joda.time.Period period79 = period30.minusDays((-68));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1141");
        org.joda.time.Period period8 = new org.joda.time.Period((-31), (int) (short) 100, (-31), (int) (short) -1, (int) (short) 1, (int) (short) 1, 0, (-31));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1142");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration12, periodType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, periodType25, chronology29);
        org.joda.time.Period period31 = period5.withPeriodType(periodType25);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1143");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, (long) (-1), chronology2);
        int int4 = period3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1144");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.Period period5 = period3.withYears((int) '4');
        org.joda.time.Period period7 = period5.withMillis((int) (short) 100);
        org.joda.time.Period period9 = period5.plusDays((-68));
        org.joda.time.Period period11 = period9.minusMinutes(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1145");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.Period period5 = period3.withYears((int) '4');
        org.joda.time.Period period7 = period5.withMillis((int) (short) 100);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P52Y-1MT0.100S" + "'", str9, "P52Y-1MT0.100S");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1146");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.withWeeks(1);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Period period12 = period10.withMinutes(0);
        org.joda.time.Period period13 = period3.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = period12.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 'a', periodType17, chronology18);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 'a', periodType21, chronology22);
        org.joda.time.Hours hours24 = period23.toStandardHours();
        org.joda.time.Period period25 = period19.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period27 = period19.withYears(10);
        org.joda.time.Period period28 = period27.toPeriod();
        org.joda.time.Period period30 = period27.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.Period period45 = period41.plusMonths(0);
        org.joda.time.Period period47 = period45.plusMonths((int) '#');
        org.joda.time.Period period49 = period45.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType50 = period45.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) -1, periodType50, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration37, periodType50);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) (byte) 0, periodType50, chronology54);
        org.joda.time.Period period56 = period30.normalizedStandard(periodType50);
        org.joda.time.Period period57 = period12.normalizedStandard(periodType50);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableInstant68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = period69.toDurationFrom(readableInstant70);
        org.joda.time.Period period73 = period69.plusMonths(0);
        org.joda.time.Period period75 = period73.plusMonths((int) '#');
        org.joda.time.Period period77 = period73.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType78 = period73.getPeriodType();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((long) (short) -1, periodType78, chronology79);
        org.joda.time.Period period81 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType78);
        org.joda.time.Period period82 = period57.normalizedStandard(periodType78);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (byte) 100, periodType78, chronology83);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(period82);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1147");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.Period period11 = period9.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) 0);
        int int18 = period11.indexOf(durationFieldType17);
        int int19 = period3.get(durationFieldType17);
        int int20 = period3.getMillis();
        org.joda.time.Period period22 = period3.withMinutes((int) (byte) 100);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1148");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period13 = period11.withSeconds((int) (short) 1);
        org.joda.time.Period period15 = period11.withMillis((int) (byte) 10);
        int int16 = period15.size();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1149");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusWeeks((-100));
        org.joda.time.Period period15 = period11.plusWeeks(0);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = period15.isSupported(durationFieldType16);
        org.joda.time.Duration duration18 = period15.toStandardDuration();
        int int19 = period15.getSeconds();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-32) + "'", int19 == (-32));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1150");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.Period period16 = period10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.Period period22 = period20.plusMonths((int) '4');
        org.joda.time.Period period23 = period14.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType24 = period22.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 'a', (long) 10, periodType24);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 100, 100L, periodType24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 0, (long) (short) 100, periodType24, chronology28);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1151");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Seconds seconds6 = period2.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period2.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(seconds6);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1152");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT35H100M32.032S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1153");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period13 = period3.withMinutes((int) (byte) 1);
        int int14 = period3.getWeeks();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1154");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period8.minusMonths(1);
        org.joda.time.Period period12 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.Hours hours17 = period16.toStandardHours();
        org.joda.time.Period period19 = period16.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        org.joda.time.Period period27 = period16.withField(durationFieldType25, 1);
        boolean boolean28 = period12.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.Period period34 = period32.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType37);
        org.joda.time.DurationFieldType durationFieldType40 = period38.getFieldType((int) (byte) 0);
        int int41 = period34.indexOf(durationFieldType40);
        org.joda.time.Period period43 = period12.withFieldAdded(durationFieldType40, (int) (short) 0);
        org.joda.time.Period period45 = period10.withField(durationFieldType40, 97);
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) period45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period45.toDurationTo(readableInstant47);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration48);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1155");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period10.toDurationFrom(readableInstant13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        org.joda.time.Period period40 = period38.plusMonths((int) '#');
        org.joda.time.Period period42 = period38.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType43 = period38.getPeriodType();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (short) -1, periodType43, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration30, periodType43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) 100, periodType43, chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType43);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration14, periodType43);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.Period period54 = period52.plusHours(8);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period54);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1156");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) (byte) 10, periodType25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 0, (long) 100, periodType25, chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1157");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period2.withYears((int) (byte) -1);
        org.joda.time.Period period12 = period2.plusSeconds(0);
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period2);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1158");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Hours hours21 = period20.toStandardHours();
        org.joda.time.Period period22 = period16.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period16.withYears(10);
        org.joda.time.Period period26 = period16.withMinutes((int) (byte) 1);
        org.joda.time.Period period27 = period12.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period29 = period12.minusMillis((int) '#');
        int int30 = period12.getYears();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1159");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = period3.getMillis();
        org.joda.time.Period period6 = period3.normalizedStandard();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1160");
        org.joda.time.Period period1 = new org.joda.time.Period((-1L));
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1161");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period11.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 0, periodType34, chronology38);
        org.joda.time.Period period40 = period14.normalizedStandard(periodType34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks41 = period40.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1162");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1163");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.withWeeks((int) (short) -1);
        int int10 = period9.getMonths();
        org.joda.time.Period period12 = period9.plusDays((int) '#');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1164");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(97);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1165");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        int int5 = period3.getMillis();
        org.joda.time.Period period7 = period3.withHours((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period3.toDurationFrom(readableInstant8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.Period period12 = period10.withMillis((int) (byte) 0);
        org.joda.time.Duration duration13 = period10.toStandardDuration();
        org.joda.time.Period period15 = period10.minusMonths(1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1166");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        int int15 = period10.getHours();
        org.joda.time.Weeks weeks16 = period10.toStandardWeeks();
        org.joda.time.Period period18 = period10.plusHours(8);
        org.joda.time.Period period20 = period10.minusMinutes(8);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period10, chronology21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(mutablePeriod23);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1167");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.Period period3 = period1.plusMinutes((int) (byte) 1);
        int[] intArray4 = period3.getValues();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 1, 1, 0, 0 });
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1168");
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.Period period16 = period12.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType17, chronology18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.Period period32 = period28.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType33 = period28.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType33, chronology34);
        org.joda.time.Period period36 = period19.withPeriodType(periodType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (-100), (long) 100, periodType33, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period((long) 52, periodType33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) ' ', periodType33, chronology40);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1169");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '4');
        java.lang.String str2 = period1.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0.052S" + "'", str2, "PT0.052S");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1170");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-11));
        org.joda.time.Period period3 = period1.withYears((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1171");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        int int4 = period3.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period8 = period6.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.Period period14 = period12.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.DurationFieldType durationFieldType20 = period18.getFieldType((int) (byte) 0);
        int int21 = period14.indexOf(durationFieldType20);
        org.joda.time.Period period23 = period6.withFieldAdded(durationFieldType20, 1);
        org.joda.time.Period period25 = period23.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType26 = period25.getPeriodType();
        org.joda.time.Period period27 = period3.withPeriodType(periodType26);
        org.joda.time.Duration duration28 = period3.toStandardDuration();
        org.joda.time.Days days29 = period3.toStandardDays();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(days29);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1172");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '#');
        org.joda.time.Period period8 = period4.withMonths((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1173");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (long) (short) 0, periodType2, chronology3);
        org.joda.time.Period period6 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period13 = period10.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.DurationFieldType durationFieldType19 = period17.getFieldType((int) (byte) 0);
        org.joda.time.Period period21 = period10.withField(durationFieldType19, 1);
        boolean boolean22 = period6.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = period32.getFieldType((int) (byte) 0);
        int int35 = period28.indexOf(durationFieldType34);
        org.joda.time.Period period37 = period6.withFieldAdded(durationFieldType34, (int) (short) 0);
        int int38 = period4.get(durationFieldType34);
        org.joda.time.Period period40 = period4.minusMonths((int) ' ');
        org.joda.time.Period period42 = period40.withYears((int) (short) 1);
        org.joda.time.Period period44 = period42.minusWeeks((int) (short) 1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1174");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period5.withMonths(0);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Period period17 = period15.withMinutes(0);
        org.joda.time.Period period19 = period17.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod20 = period17.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period27.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period27.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.Period period45 = period43.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        int int52 = period45.indexOf(durationFieldType51);
        int int53 = period37.get(durationFieldType51);
        org.joda.time.Period period55 = period27.withField(durationFieldType51, (int) (short) 0);
        int int56 = mutablePeriod20.indexOf(durationFieldType51);
        int int57 = period11.get(durationFieldType51);
        org.joda.time.Period period59 = period11.plusMinutes(0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1175");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.Period period3 = period1.minusDays((int) (byte) 100);
        org.joda.time.Period period5 = period1.plusMinutes(10);
        int int6 = period1.getMillis();
        org.joda.time.Period period8 = period1.minusMonths((int) (byte) 10);
        org.joda.time.Seconds seconds9 = period1.toStandardSeconds();
        org.joda.time.Period period11 = period1.withMinutes((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1176");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        org.joda.time.Days days8 = period7.toStandardDays();
        org.joda.time.Period period10 = period7.plusMonths((int) (byte) -1);
        org.joda.time.Period period12 = period10.minusHours(100);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1177");
        org.joda.time.Period period9 = new org.joda.time.Period((int) (short) 1, (int) (short) 10, 97, (int) (byte) 1, 8, (int) (short) -1, 97, 8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Hours hours21 = period20.toStandardHours();
        org.joda.time.Period period22 = period16.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period16.withYears(10);
        org.joda.time.Period period25 = period24.toPeriod();
        org.joda.time.Period period27 = period24.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.Period period46 = period42.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType47 = period42.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (short) -1, periodType47, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration34, periodType47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 0, periodType47, chronology51);
        org.joda.time.Period period53 = period27.normalizedStandard(periodType47);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period55 = new org.joda.time.Period((java.lang.Object) 97, periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period53);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1178");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.withMinutes((-1));
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = period8.normalizedStandard(periodType9);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.Period period16 = period14.withMinutes(0);
        org.joda.time.Period period18 = period16.minusSeconds((int) (short) 100);
        org.joda.time.Period period20 = period18.withWeeks((int) (short) -1);
        org.joda.time.Period period21 = period10.minus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.DurationFieldType[] durationFieldTypeArray22 = period20.getFieldTypes();
        org.joda.time.Period period24 = period20.withMonths((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        org.joda.time.Period period43 = period37.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.Period period50 = period41.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType51 = period49.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType51);
        org.joda.time.Period period53 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((java.lang.Object) period24, periodType51, chronology54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 10, (long) (short) 100, periodType51, chronology56);
        org.joda.time.Period period58 = new org.joda.time.Period((long) 52, periodType51);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldTypeArray22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression2.test1179");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) 'a');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(10L, (long) (short) 0, periodType4, chronology5);
        org.joda.time.Period period8 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 'a', periodType10, chronology11);
        org.joda.time.Hours hours13 = period12.toStandardHours();
        org.joda.time.Period period15 = period12.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.DurationFieldType durationFieldType21 = period19.getFieldType((int) (byte) 0);
        org.joda.time.Period period23 = period12.withField(durationFieldType21, 1);
        boolean boolean24 = period8.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.Period period30 = period28.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType33);
        org.joda.time.DurationFieldType durationFieldType36 = period34.getFieldType((int) (byte) 0);
        int int37 = period30.indexOf(durationFieldType36);
        org.joda.time.Period period39 = period8.withFieldAdded(durationFieldType36, (int) (short) 0);
        int int40 = period6.get(durationFieldType36);
        org.joda.time.Period period42 = period1.withField(durationFieldType36, (int) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
    }
}

