import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_039_Regression0 {

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
            System.out.format("%n%s%n", "JA_039_Regression0.test0001");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = period2.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0002");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) 0L, periodType1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0003");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.fieldDifference(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0004");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period3.get(durationFieldType4);
        org.joda.time.format.PeriodFormatter periodFormatter6 = null;
        java.lang.String str7 = period3.toString(periodFormatter6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0005");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.getMinutes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0006");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period5.withFieldAdded(durationFieldType6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0008");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) -1);
        org.joda.time.PeriodType periodType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) (byte) -1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0009");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0010");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 1, (-1), (int) (byte) 100, 0, (int) (short) -1, (int) (byte) 10, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0011");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0012");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        java.lang.Class<?> wildcardClass5 = period3.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0013");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) -1, periodType13, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) 100L, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0014");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0015");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0016");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("hi!", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0017");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        int[] intArray9 = period8.getValues();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 97 });
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0018");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0019");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) '4');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0020");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0021");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        int int9 = period4.getWeeks();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = period4.normalizedStandard(periodType10);
        org.joda.time.Period period12 = period1.minus((org.joda.time.ReadablePeriod) period11);
        int int13 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0022");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0023");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.size();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0024");
        org.joda.time.Period period4 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0025");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Minutes minutes9 = period6.toStandardMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.withMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0027");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType12);
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period3.minusHours((int) ' ');
        org.joda.time.Chronology chronology17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) ' ', chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0028");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType15, chronology16);
        org.joda.time.Chronology chronology18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) 'a', periodType15, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0029");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period2.getFieldTypes();
        org.joda.time.Period period15 = period2.minusHours((int) (byte) 100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0030");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0031");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = period1.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0032");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 0, 1, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0033");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0034");
        org.joda.time.Period period4 = new org.joda.time.Period((int) ' ', 0, (int) (short) 10, 100);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0035");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        int int6 = period5.getSeconds();
        org.joda.time.Period period8 = period5.plusMinutes(8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0036");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0037");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.097S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0038");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period5.getWeeks();
        int int7 = period5.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period5.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0039");
        org.joda.time.Period period2 = new org.joda.time.Period(10L, (long) (short) -1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0040");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0041");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0042");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.withWeeks((int) (short) -1);
        int int10 = period7.size();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0043");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        org.joda.time.Period period4 = period2.plusSeconds((int) (short) -1);
        int int5 = period4.getMinutes();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0044");
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
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.Days days17 = period16.toStandardDays();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0045");
        org.joda.time.Period period1 = org.joda.time.Period.months(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0046");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        int int7 = period3.getSeconds();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0047");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0048");
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
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period32.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period32.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.DurationFieldType durationFieldType56 = period54.getFieldType((int) (byte) 0);
        int int57 = period50.indexOf(durationFieldType56);
        int int58 = period42.get(durationFieldType56);
        org.joda.time.Period period60 = period32.withField(durationFieldType56, (int) (short) 0);
        boolean boolean61 = period25.isSupported(durationFieldType56);
        org.joda.time.Period period63 = period14.withFieldAdded(durationFieldType56, 1);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0049");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) -1, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds24 = period23.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0050");
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
        org.joda.time.Weeks weeks35 = period34.toStandardWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(weeks35);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0051");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes13 = period11.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0052");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0053");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology9);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) str11);
        org.joda.time.Period period14 = period12.plusSeconds((int) 'a');
        org.joda.time.Period period16 = period12.plusYears((int) (byte) 0);
        org.joda.time.Period period18 = period12.withMonths(0);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Period period24 = period22.withMinutes(0);
        org.joda.time.Period period26 = period24.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod27 = period24.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period34.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.DurationFieldType durationFieldType58 = period56.getFieldType((int) (byte) 0);
        int int59 = period52.indexOf(durationFieldType58);
        int int60 = period44.get(durationFieldType58);
        org.joda.time.Period period62 = period34.withField(durationFieldType58, (int) (short) 0);
        int int63 = mutablePeriod27.indexOf(durationFieldType58);
        int int64 = period18.get(durationFieldType58);
        org.joda.time.Period period66 = period5.withFieldAdded(durationFieldType58, (int) (byte) 1);
        org.joda.time.Period period68 = period66.multipliedBy((int) (short) -1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT-0.011S" + "'", str11, "PT-0.011S");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0054");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) 10.0f, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0055");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Minutes minutes7 = period3.toStandardMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0056");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType13, chronology14);
        org.joda.time.Seconds seconds16 = period15.toStandardSeconds();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(seconds16);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0057");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
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
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType28, chronology29);
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
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType44, chronology45);
        org.joda.time.Period period47 = period30.withPeriodType(periodType44);
        org.joda.time.Chronology chronology48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) (-1), periodType44, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0058");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0059");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        int int11 = period6.getMillis();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0060");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0061");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        int int6 = period5.getWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0062");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) (short) 10);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0063");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period3.get(durationFieldType4);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
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
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) -1, periodType33, chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration20, periodType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) 100, periodType33, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) int5, periodType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0064");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        int int2 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0065");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period5.minusMonths((int) 'a');
        org.joda.time.Period period11 = period9.minusHours(10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0066");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0067");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT32M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0068");
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
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 'a', periodType27, chronology28);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 'a', periodType31, chronology32);
        org.joda.time.Hours hours34 = period33.toStandardHours();
        org.joda.time.Period period35 = period29.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period37 = period29.withYears(10);
        org.joda.time.Period period38 = period37.toPeriod();
        org.joda.time.Period period40 = period37.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        org.joda.time.Period period55 = period51.plusMonths(0);
        org.joda.time.Period period57 = period55.plusMonths((int) '#');
        org.joda.time.Period period59 = period55.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType60 = period55.getPeriodType();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) (short) -1, periodType60, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration47, periodType60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (byte) 0, periodType60, chronology64);
        org.joda.time.Period period66 = period40.normalizedStandard(periodType60);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(0L, (long) 8, periodType60, chronology67);
        org.joda.time.Period period69 = new org.joda.time.Period((java.lang.Object) period14, periodType60);
        org.joda.time.Period period70 = new org.joda.time.Period((int) 'a', 100, (int) (short) -1, 100, (int) (short) -1, (int) (byte) 1, 8, 100, periodType60);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0069");
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
        org.joda.time.Hours hours15 = period11.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = period11.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0070");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
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
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType28, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant7, periodType28);
        org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) readableInstant7);
        org.joda.time.Period period37 = period35.minusMinutes((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0071");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = period1.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0072");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks11 = period1.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0073");
        java.lang.Object obj8 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Period period20 = period14.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period14.withYears(10);
        org.joda.time.Period period23 = period22.toPeriod();
        org.joda.time.Period period25 = period22.plusMillis(1);
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
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 0, periodType45, chronology49);
        org.joda.time.Period period51 = period25.normalizedStandard(periodType45);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(0L, (long) 8, periodType45, chronology52);
        org.joda.time.Period period54 = new org.joda.time.Period(obj8, periodType45);
        org.joda.time.Period period55 = new org.joda.time.Period(8, (int) (byte) 10, (int) 'a', (-1), 10, (-1), (int) ' ', 100, periodType45);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.Period period59 = period58.normalizedStandard();
        org.joda.time.Period period61 = period58.plusMinutes((int) ' ');
        org.joda.time.Period period62 = period61.normalizedStandard();
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) period62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant65, readableInstant66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = period67.toDurationFrom(readableInstant68);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant71, readableInstant72);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = period73.toDurationFrom(readableInstant74);
        org.joda.time.Period period77 = period73.plusMonths(0);
        org.joda.time.Period period79 = period77.plusMonths((int) '#');
        org.joda.time.Period period81 = period77.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType82 = period77.getPeriodType();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (short) -1, periodType82, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration69, periodType82);
        org.joda.time.Period period86 = period63.withPeriodType(periodType82);
        org.joda.time.Chronology chronology87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period88 = new org.joda.time.Period((java.lang.Object) periodType45, periodType82, chronology87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0074");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0075");
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
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        int int18 = period14.getMonths();
        org.joda.time.Period period20 = period14.plusMinutes(100);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
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
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (-100), (long) (-100), periodType43, chronology48);
        org.joda.time.Chronology chronology50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) 100, periodType43, chronology50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0076");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0077");
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
        org.joda.time.Period period16 = period14.plusMillis((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = period14.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0078");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0079");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period11 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Period period17 = period15.plusMonths((int) '4');
        org.joda.time.Period period18 = period9.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType19 = period17.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) 0, periodType19);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0080");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) '4', periodType2, chronology3);
        int int5 = period4.getWeeks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0081");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period11.plusMonths((int) '#');
        org.joda.time.Period period15 = period11.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType16 = period11.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType16, chronology17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (-100), periodType16, chronology20);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0082");
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Hours hours12 = period11.toStandardHours();
        org.joda.time.Period period13 = period7.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period7.withYears(10);
        org.joda.time.Period period16 = period15.toPeriod();
        org.joda.time.Period period18 = period15.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 0, periodType38, chronology42);
        org.joda.time.Period period44 = period18.normalizedStandard(periodType38);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(0L, (long) 8, periodType38, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) ' ', periodType38, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(10L, periodType38, chronology49);
        int int51 = period50.getMonths();
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0084");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period2.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0085");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds14 = period11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0086");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.minusDays((int) (short) 0);
        org.joda.time.Days days9 = period8.toStandardDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0087");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, (long) '#', chronology2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0088");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0089");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.Period period16 = period12.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str4, periodType17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Period period24 = period22.withMinutes(0);
        org.joda.time.Period period26 = period24.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod27 = period24.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period34.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.DurationFieldType durationFieldType58 = period56.getFieldType((int) (byte) 0);
        int int59 = period52.indexOf(durationFieldType58);
        int int60 = period44.get(durationFieldType58);
        org.joda.time.Period period62 = period34.withField(durationFieldType58, (int) (short) 0);
        int int63 = mutablePeriod27.indexOf(durationFieldType58);
        int int64 = period18.get(durationFieldType58);
        int int66 = period18.getValue(0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0090");
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
        org.joda.time.Period period34 = period32.minusMillis((-1));
        int int35 = period32.getMinutes();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-100) + "'", int35 == (-100));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0091");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '4');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0092");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, (long) (byte) 10, chronology2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0093");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period3 = period1.withMonths((int) (byte) 10);
        org.joda.time.Period period5 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period7 = period5.plusMillis((int) 'a');
        boolean boolean8 = period1.equals((java.lang.Object) period5);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0094");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0095");
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
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
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
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType50, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType50);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType50);
        org.joda.time.Chronology chronology55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) '#', periodType50, chronology55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0096");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period3.getMillis();
        org.joda.time.Period period8 = period3.withDays(1);
        org.joda.time.Weeks weeks9 = period8.toStandardWeeks();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0097");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period10 = period7.negated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0098");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.withMonths((int) (short) 0);
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
        org.joda.time.Period period23 = period11.withFields((org.joda.time.ReadablePeriod) period18);
        int int24 = period23.getSeconds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0099");
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
        org.joda.time.Chronology chronology33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) '#', chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0100");
        org.joda.time.Period period8 = new org.joda.time.Period((int) 'a', (-100), 1, 0, 8, (-1), (int) (short) 0, 97);
        org.joda.time.Period period10 = period8.withMinutes((int) '#');
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0101");
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
        org.joda.time.PeriodType periodType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) int19, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0102");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.Period period24 = period20.plusMonths(0);
        org.joda.time.Period period26 = period24.plusMonths((int) '#');
        org.joda.time.Period period28 = period24.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType29 = period24.getPeriodType();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, periodType29, chronology30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration16, periodType29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) 100, periodType29, chronology33);
        org.joda.time.Period period35 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0103");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusHours((-1));
        org.joda.time.Period period15 = period11.withYears((int) 'a');
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0104");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) -1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0105");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.Period period7 = period5.withYears(0);
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period5);
        int int9 = period5.getYears();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0106");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, periodType37, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType37);
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) str9, periodType37);
        org.joda.time.Period period46 = period44.minusWeeks(100);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period53.plusMonths((int) '#');
        org.joda.time.Period period57 = period53.plusMinutes((int) (short) 100);
        org.joda.time.Period period59 = period57.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType61 = period57.getFieldType((int) (byte) 0);
        org.joda.time.Period period63 = period46.withField(durationFieldType61, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period64 = new org.joda.time.Period((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT32M" + "'", str9, "PT32M");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0107");
        org.joda.time.Period period1 = org.joda.time.Period.millis(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0108");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days9 = period8.toStandardDays();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.Period period13 = period12.normalizedStandard();
        org.joda.time.Period period15 = period12.plusMinutes((int) ' ');
        org.joda.time.Period period16 = period15.normalizedStandard();
        org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) period16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Period period40 = period17.withPeriodType(periodType36);
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) days9, periodType36);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0109");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
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
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(100L, periodType21, chronology26);
        org.joda.time.Period period29 = period27.plusDays(0);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0110");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period2.negated();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0111");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = period1.getFieldTypes();
        org.joda.time.Period period4 = period1.minusHours((-1));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0112");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 97);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0113");
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
        org.joda.time.Period period16 = period14.plusSeconds((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0114");
        org.joda.time.Period period1 = org.joda.time.Period.years(100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0115");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0116");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, (long) 10);
        org.joda.time.Period period4 = period2.plusWeeks((int) 'a');
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0117");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0118");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0119");
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
        int int14 = period6.getMonths();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0120");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.withHours((-100));
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0121");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0122");
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
        org.joda.time.Period period32 = period28.plusSeconds((int) (byte) 1);
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
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0123");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
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
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        int int21 = period20.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0124");
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
        int int19 = period17.getSeconds();
        org.joda.time.Duration duration20 = period17.toStandardDuration();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-100) + "'", int19 == (-100));
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0125");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        int int8 = period7.size();
        org.joda.time.Hours hours9 = period7.toStandardHours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0126");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) (byte) 100);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0127");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0128");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType12);
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period3.minusHours((int) ' ');
        org.joda.time.Period period18 = period3.withYears((int) ' ');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0129");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, (long) '#');
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0130");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = period2.toString(periodFormatter3);
        org.joda.time.Period period5 = period2.negated();
        org.joda.time.Period period7 = period2.minusHours((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0131");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-1), (long) (byte) 10, chronology2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0132");
        org.joda.time.Period period1 = org.joda.time.Period.hours(97);
        org.joda.time.Period period4 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period6 = period4.minusYears(100);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.Period period13 = period11.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.DurationFieldType durationFieldType19 = period17.getFieldType((int) (byte) 0);
        int int20 = period13.indexOf(durationFieldType19);
        org.joda.time.Period period22 = period6.withField(durationFieldType19, 10);
        int int23 = period1.get(durationFieldType19);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0133");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '4');
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0134");
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
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Period period21 = period18.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (byte) 0);
        org.joda.time.Period period29 = period18.withField(durationFieldType27, 1);
        int int30 = period14.get(durationFieldType27);
        org.joda.time.Hours hours31 = period14.toStandardHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(hours31);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0135");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (long) (short) 0, periodType2, chronology3);
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period4.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0136");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period2.toDurationFrom(readableInstant6);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0137");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period6 = period3.plusMinutes((int) (short) 1);
        org.joda.time.Weeks weeks7 = period3.toStandardWeeks();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0138");
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
        int int57 = period56.getMonths();
        int int58 = period56.getHours();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0139");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-100));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0140");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0141");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 10);
        java.lang.Class<?> wildcardClass2 = period1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0142");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period3 = period2.toPeriod();
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0143");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', 100, (int) ' ', (int) ' ');
        java.lang.String str5 = period4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT35H100M32.032S" + "'", str5, "PT35H100M32.032S");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0144");
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
        org.joda.time.Period period13 = period2.normalizedStandard();
        org.joda.time.Period period15 = period2.plusSeconds((int) 'a');
        int int16 = period2.getMillis();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0145");
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
        org.joda.time.Period period26 = period21.withSeconds((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0146");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((-1L), 100L, chronology2);
        org.joda.time.Days days4 = period3.toStandardDays();
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0147");
        org.joda.time.Period period1 = org.joda.time.Period.days((-100));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        int int6 = period4.getMillis();
        org.joda.time.Period period8 = period4.withHours((int) (byte) 0);
        org.joda.time.Period period10 = period4.withMonths((int) '4');
        org.joda.time.Period period12 = period10.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology15);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str17);
        org.joda.time.Period period20 = period18.plusSeconds((int) 'a');
        org.joda.time.Period period22 = period18.plusYears((int) (byte) 0);
        org.joda.time.Period period24 = period18.withMonths(0);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', periodType26, chronology27);
        org.joda.time.Period period30 = period28.withMinutes(0);
        org.joda.time.Period period32 = period30.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod33 = period30.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period40.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period40.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType61);
        org.joda.time.DurationFieldType durationFieldType64 = period62.getFieldType((int) (byte) 0);
        int int65 = period58.indexOf(durationFieldType64);
        int int66 = period50.get(durationFieldType64);
        org.joda.time.Period period68 = period40.withField(durationFieldType64, (int) (short) 0);
        int int69 = mutablePeriod33.indexOf(durationFieldType64);
        int int70 = period24.get(durationFieldType64);
        int int71 = period10.get(durationFieldType64);
        org.joda.time.Period period73 = period1.withField(durationFieldType64, 97);
        org.joda.time.Days days74 = period1.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT-0.011S" + "'", str17, "PT-0.011S");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(days74);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0148");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0149");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.withMonths((int) (short) 0);
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
        org.joda.time.Period period23 = period11.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period25 = period18.minusDays((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0150");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.Period period23 = period19.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, periodType24, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11, periodType24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 100, periodType24, chronology28);
        org.joda.time.Period period30 = period4.withPeriodType(periodType24);
        org.joda.time.Period period32 = period30.plusMillis((int) (byte) 100);
        int int33 = period30.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0151");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
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
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(100L, periodType21, chronology26);
        org.joda.time.Days days28 = period27.toStandardDays();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(days28);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0152");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period11 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period5.withYears(10);
        org.joda.time.Period period14 = period13.toPeriod();
        org.joda.time.Period period16 = period13.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 0, periodType36, chronology40);
        org.joda.time.Period period42 = period16.normalizedStandard(periodType36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(0L, (long) 8, periodType36, chronology43);
        int int45 = period44.getMinutes();
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0153");
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
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period15 = period12.withYears((int) 'a');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT-0.097S" + "'", str13, "PT-0.097S");
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0154");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
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
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType19, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 'a', periodType19, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) (short) -1, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0155");
        org.joda.time.Period period4 = new org.joda.time.Period(10, (int) (short) -1, (int) 'a', 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0156");
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
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType((int) (byte) 0);
        int int31 = period24.indexOf(durationFieldType30);
        int int32 = period16.get(durationFieldType30);
        org.joda.time.Period period34 = period6.withField(durationFieldType30, (int) (short) 0);
        java.lang.String str35 = period6.toString();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT0S" + "'", str35, "PT0S");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0157");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days21 = period1.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0158");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0159");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period9.plusHours(97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0160");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0161");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '4', (int) '#', (int) (byte) 0, (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0162");
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
        org.joda.time.Period period22 = period1.minusDays(100);
        org.joda.time.Period period24 = period22.withMinutes((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0163");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P-100WT-0.101S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0164");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType13);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0165");
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period19 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.Period period26 = period17.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = period25.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 100, periodType27);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0166");
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
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period3.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period31 = period25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.Period period37 = period35.plusMonths((int) '4');
        org.joda.time.Period period38 = period29.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.PeriodType periodType39 = period37.getPeriodType();
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', (long) 10, periodType39);
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, 100L, periodType39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) duration16, periodType39, chronology43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        java.lang.Object obj46 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) 'a', periodType50, chronology51);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 'a', periodType54, chronology55);
        org.joda.time.Hours hours57 = period56.toStandardHours();
        org.joda.time.Period period58 = period52.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period52.withYears(10);
        org.joda.time.Period period61 = period60.toPeriod();
        org.joda.time.Period period63 = period60.plusMillis(1);
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
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period((long) (byte) 0, periodType83, chronology87);
        org.joda.time.Period period89 = period63.normalizedStandard(periodType83);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.Period period91 = new org.joda.time.Period(0L, (long) 8, periodType83, chronology90);
        org.joda.time.Period period92 = new org.joda.time.Period(obj46, periodType83);
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant45, periodType83);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.097S" + "'", str14, "PT0.097S");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0167");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) '4', periodType2, chronology3);
        org.joda.time.Period period5 = period4.negated();
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0168");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', chronology1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0169");
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period19 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.Period period26 = period17.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = period25.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period(100, (int) '4', 10, 0, (int) (short) 1, (int) ' ', (int) (short) 0, (int) (byte) 10, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period((-1L), periodType27);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0170");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period6.withHours((int) 'a');
        int int13 = period6.getYears();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0171");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT32M");
        org.joda.time.Period period3 = period1.plusMonths((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0172");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) readableInstant1, periodType4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0173");
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
        org.joda.time.format.PeriodFormatter periodFormatter77 = null;
        java.lang.String str78 = period18.toString(periodFormatter77);
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "P1Y-1M" + "'", str78, "P1Y-1M");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0174");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 1, 10L, chronology2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0175");
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
        org.joda.time.Period period16 = period14.plusSeconds((int) (byte) 1);
        org.joda.time.Period period18 = period14.plusYears(0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0176");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.joda.time.Period period10 = period7.withSeconds((int) (short) 10);
        org.joda.time.Period period12 = period7.minusYears((int) (short) 0);
        org.joda.time.Period period14 = period7.minusMinutes(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0177");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period10.plusMinutes((int) ' ');
        org.joda.time.Duration duration14 = period10.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType36);
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 10, periodType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((java.lang.Object) period10, periodType36, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period((int) '4', (int) ' ', (-1), (int) (short) 1, 100, 10, 97, (-1), periodType36);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0178");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0179");
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
        org.joda.time.Period period29 = period3.plusMonths((int) '4');
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
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0180");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 0, chronology2);
        int int4 = period3.getYears();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0181");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 1, 8, (int) (short) 10, (int) (short) 0, (-1), (-1), (int) (short) 10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0182");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period2.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.Period period30 = period26.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType31 = period26.getPeriodType();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, periodType31, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration18, periodType31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) 100, periodType31, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType31);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType31);
        int int39 = period38.getDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0183");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0184");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
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
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(0L, (long) (byte) -1, periodType17, chronology21);
        org.joda.time.Period period24 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 'a', periodType37, chronology38);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 'a', periodType41, chronology42);
        org.joda.time.Hours hours44 = period43.toStandardHours();
        org.joda.time.Period period45 = period39.withFields((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Period period47 = period39.withYears(10);
        org.joda.time.Period period48 = period47.toPeriod();
        org.joda.time.Period period50 = period47.plusMillis(1);
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
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 0, periodType70, chronology74);
        org.joda.time.Period period76 = period50.normalizedStandard(periodType70);
        org.joda.time.Period period77 = new org.joda.time.Period((int) (short) 1, 10, (int) '4', (int) '#', 0, (int) (byte) -1, 0, 10, periodType70);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period79 = new org.joda.time.Period((java.lang.Object) periodType17, periodType70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(period76);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0185");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period9 = period6.plusDays(10);
        int int10 = period9.getYears();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0186");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType13, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.Period period19 = period18.normalizedStandard();
        org.joda.time.Period period21 = period18.withWeeks(1);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Period period27 = period25.withMinutes(0);
        org.joda.time.Period period28 = period18.minus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period30 = period27.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 'a', periodType32, chronology33);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', periodType36, chronology37);
        org.joda.time.Hours hours39 = period38.toStandardHours();
        org.joda.time.Period period40 = period34.withFields((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Period period42 = period34.withYears(10);
        org.joda.time.Period period43 = period42.toPeriod();
        org.joda.time.Period period45 = period42.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableInstant55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationFrom(readableInstant57);
        org.joda.time.Period period60 = period56.plusMonths(0);
        org.joda.time.Period period62 = period60.plusMonths((int) '#');
        org.joda.time.Period period64 = period60.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType65 = period60.getPeriodType();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (short) -1, periodType65, chronology66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration52, periodType65);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((long) (byte) 0, periodType65, chronology69);
        org.joda.time.Period period71 = period45.normalizedStandard(periodType65);
        org.joda.time.Period period72 = period27.normalizedStandard(periodType65);
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant82, readableInstant83);
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.Duration duration86 = period84.toDurationFrom(readableInstant85);
        org.joda.time.Period period88 = period84.plusMonths(0);
        org.joda.time.Period period90 = period88.plusMonths((int) '#');
        org.joda.time.Period period92 = period88.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType93 = period88.getPeriodType();
        org.joda.time.Chronology chronology94 = null;
        org.joda.time.Period period95 = new org.joda.time.Period((long) (short) -1, periodType93, chronology94);
        org.joda.time.Period period96 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType93);
        org.joda.time.Period period97 = period72.normalizedStandard(periodType93);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period98 = new org.joda.time.Period((java.lang.Object) periodType13, periodType93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(periodType93);
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0187");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period10.withWeeks(1);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Period period19 = period17.withMinutes(0);
        org.joda.time.Period period20 = period10.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period22 = period19.minusMillis((int) ' ');
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
        org.joda.time.Period period64 = period19.normalizedStandard(periodType57);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant77, readableInstant78);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant80, readableInstant81, periodType82);
        org.joda.time.MutablePeriod mutablePeriod84 = period83.toMutablePeriod();
        org.joda.time.Period period85 = period79.plus((org.joda.time.ReadablePeriod) period83);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.ReadableInstant readableInstant87 = null;
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period(readableInstant86, readableInstant87, periodType88);
        org.joda.time.Period period91 = period89.plusMonths((int) '4');
        org.joda.time.Period period92 = period83.withFields((org.joda.time.ReadablePeriod) period91);
        org.joda.time.PeriodType periodType93 = period91.getPeriodType();
        org.joda.time.Period period94 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType93);
        org.joda.time.Period period95 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType93);
        org.joda.time.Period period96 = new org.joda.time.Period(readableInstant65, readableInstant66, periodType93);
        org.joda.time.Chronology chronology97 = null;
        org.joda.time.Period period98 = new org.joda.time.Period((java.lang.Object) period64, periodType93, chronology97);
        org.joda.time.Period period99 = new org.joda.time.Period(8, (int) (byte) 1, 8, (int) (byte) 1, (int) (byte) 0, (-100), (int) 'a', (int) ' ', periodType93);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
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
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(mutablePeriod84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(periodType93);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0188");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusYears(100);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0189");
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
        org.joda.time.Period period26 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 10, periodType23);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 0, (long) 100, periodType23, chronology28);
        org.joda.time.Period period31 = period29.plusMonths((int) ' ');
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0190");
        org.joda.time.Period period2 = new org.joda.time.Period(100L, (long) 97);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0191");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.Period period16 = period12.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str4, periodType17);
        org.joda.time.Chronology chronology19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) periodType17, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0192");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period6 = period3.plusMinutes((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.plusMonths(0);
        org.joda.time.Period period15 = period13.plusMonths((int) '#');
        org.joda.time.Period period17 = period13.plusMinutes((int) (short) 100);
        org.joda.time.Period period19 = period17.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType21 = period17.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours22 = period17.toStandardHours();
        int int23 = period17.getSeconds();
        org.joda.time.Period period24 = period6.withFields((org.joda.time.ReadablePeriod) period17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0193");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType40 = period4.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0195");
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
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        int int18 = period14.getWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0196");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT-100M-99.903S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0197");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period78 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0198");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period3.getMillis();
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
        org.joda.time.Period period52 = period3.minus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period54 = period3.withMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
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
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0199");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        java.lang.Class<?> wildcardClass9 = period7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0200");
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
        int int19 = period17.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod20 = period17.toMutablePeriod();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-100) + "'", int19 == (-100));
        org.junit.Assert.assertNotNull(mutablePeriod20);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0201");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationFrom(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.Period period40 = period36.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType41 = period36.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) -1, periodType41, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration28, periodType41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 100, periodType41, chronology45);
        org.joda.time.Period period47 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType41);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12, periodType41);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant49, periodType50);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0202");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusHours((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds14 = period13.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0203");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.MutablePeriod mutablePeriod9 = period6.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0204");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks14 = period13.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0205");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.Period period25 = period16.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = period24.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', (long) 10, periodType26);
        org.joda.time.Period period29 = period5.withPeriodType(periodType26);
        org.joda.time.Period period31 = period29.plusMillis(1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0206");
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
        org.joda.time.Period period33 = period3.minusDays((int) (byte) 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0207");
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
        java.lang.Object obj47 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 'a', periodType51, chronology52);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 'a', periodType55, chronology56);
        org.joda.time.Hours hours58 = period57.toStandardHours();
        org.joda.time.Period period59 = period53.withFields((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Period period61 = period53.withYears(10);
        org.joda.time.Period period62 = period61.toPeriod();
        org.joda.time.Period period64 = period61.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableInstant68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = period69.toDurationFrom(readableInstant70);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant73, readableInstant74);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = period75.toDurationFrom(readableInstant76);
        org.joda.time.Period period79 = period75.plusMonths(0);
        org.joda.time.Period period81 = period79.plusMonths((int) '#');
        org.joda.time.Period period83 = period79.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType84 = period79.getPeriodType();
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((long) (short) -1, periodType84, chronology85);
        org.joda.time.Period period87 = new org.joda.time.Period(readableInstant66, (org.joda.time.ReadableDuration) duration71, periodType84);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((long) (byte) 0, periodType84, chronology88);
        org.joda.time.Period period90 = period64.normalizedStandard(periodType84);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period(0L, (long) 8, periodType84, chronology91);
        org.joda.time.Period period93 = new org.joda.time.Period(obj47, periodType84);
        org.joda.time.Period period94 = new org.joda.time.Period(8, (int) (byte) 10, (int) 'a', (-1), 10, (-1), (int) ' ', 100, periodType84);
        org.joda.time.Period period95 = new org.joda.time.Period((int) '#', (int) (byte) 0, 0, (int) ' ', (int) ' ', (-1), (int) (byte) 100, 97, periodType84);
        org.joda.time.Chronology chronology96 = null;
        org.joda.time.Period period97 = new org.joda.time.Period((java.lang.Object) period25, periodType84, chronology96);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertNotNull(period90);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType29 = period26.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0209");
        org.joda.time.Period period1 = org.joda.time.Period.days(97);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0210");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        int int6 = period4.getYears();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0211");
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
        org.joda.time.Period period48 = period10.withMonths(100);
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
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0212");
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
        org.joda.time.Period period16 = period14.plusSeconds((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter17 = null;
        java.lang.String str18 = period14.toString(periodFormatter17);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0S" + "'", str18, "PT0S");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0213");
        org.joda.time.Period period1 = org.joda.time.Period.years((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0214");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 100, 0, 1, (int) '#', (int) '#', 100, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0215");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        int int6 = period4.getWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0216");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        int int10 = period9.getDays();
        org.joda.time.Period period12 = period9.minusSeconds((int) (short) 0);
        org.joda.time.Period period14 = period12.withMonths(0);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0217");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Duration duration5 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.Period period9 = period8.normalizedStandard();
        org.joda.time.Period period11 = period8.withWeeks(1);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Period period17 = period15.withMinutes(0);
        org.joda.time.Period period18 = period8.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(100L, (long) ' ', chronology21);
        org.joda.time.Period period24 = period22.plusHours(1);
        org.joda.time.Weeks weeks25 = period24.toStandardWeeks();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology28);
        java.lang.String str30 = period29.toString();
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) str30);
        org.joda.time.Period period33 = period31.plusSeconds((int) 'a');
        org.joda.time.Period period35 = period31.plusYears((int) (byte) 0);
        org.joda.time.Period period37 = period31.withMonths(0);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', periodType39, chronology40);
        org.joda.time.Period period43 = period41.withMinutes(0);
        org.joda.time.Period period45 = period43.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod46 = period43.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period53.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period53.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period53.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.Period period71 = period69.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.DurationFieldType durationFieldType77 = period75.getFieldType((int) (byte) 0);
        int int78 = period71.indexOf(durationFieldType77);
        int int79 = period63.get(durationFieldType77);
        org.joda.time.Period period81 = period53.withField(durationFieldType77, (int) (short) 0);
        int int82 = mutablePeriod46.indexOf(durationFieldType77);
        int int83 = period37.get(durationFieldType77);
        org.joda.time.Period period85 = period24.withFieldAdded(durationFieldType77, (int) (byte) 1);
        org.joda.time.Period period87 = period8.withField(durationFieldType77, 0);
        boolean boolean88 = period2.isSupported(durationFieldType77);
        java.lang.String str89 = period2.toString();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT-0.011S" + "'", str30, "PT-0.011S");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(mutablePeriod46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "PT0S" + "'", str89, "PT0S");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0218");
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
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        int int82 = period81.getSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT-0.011S" + "'", str24, "PT-0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0219");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, (long) (-1), chronology4);
        org.joda.time.Period period7 = period5.withHours(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
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
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType28);
        org.joda.time.Period period33 = period5.minus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.Period period43 = period39.plusMonths(0);
        org.joda.time.Period period45 = period43.plusMonths((int) '#');
        org.joda.time.Period period47 = period43.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType48 = period43.getPeriodType();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (short) -1, periodType48, chronology49);
        org.joda.time.Period period51 = period35.minus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period64.plusMonths(0);
        org.joda.time.Period period70 = period68.plusMonths((int) '#');
        org.joda.time.Period period72 = period68.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType73 = period68.getPeriodType();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (short) -1, periodType73, chronology74);
        org.joda.time.Period period76 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType73);
        org.joda.time.Period period77 = new org.joda.time.Period((long) (byte) 10, periodType73);
        org.joda.time.Period period78 = period50.withPeriodType(periodType73);
        org.joda.time.Period period79 = period32.normalizedStandard(periodType73);
        org.joda.time.Period period80 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType73);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period79);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0220");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period5.toString(periodFormatter8);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT-1M" + "'", str9, "PT-1M");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0221");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0222");
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
        org.joda.time.Period period20 = period18.withSeconds((-100));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0223");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Period period4 = period2.withYears((int) (short) 100);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0224");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((-1L), (long) (short) -1, chronology2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0225");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period3 = period1.withMonths((int) (byte) 10);
        org.joda.time.Period period5 = period3.minusWeeks((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0226");
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
        org.joda.time.format.PeriodFormatter periodFormatter14 = null;
        java.lang.String str15 = period13.toString(periodFormatter14);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P100WT-31.903S" + "'", str15, "P100WT-31.903S");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0227");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) '4', periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusMillis(0);
        org.joda.time.Period period8 = period6.plusDays((-100));
        org.joda.time.Period period10 = period6.plusHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0228");
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
        org.joda.time.Period period13 = period2.normalizedStandard();
        org.joda.time.Period period15 = period2.plusSeconds((int) 'a');
        org.joda.time.Hours hours16 = period2.toStandardHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0229");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '#');
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0230");
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
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        int int18 = period14.getMonths();
        org.joda.time.Period period20 = period14.minusHours((int) ' ');
        org.joda.time.Period period21 = period14.toPeriod();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0231");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Seconds seconds9 = period5.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0232");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) 'a');
        org.joda.time.Period period3 = period1.plusYears(8);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period3.withField(durationFieldType4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0233");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.Period period21 = period17.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period28.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period28.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType37);
        org.joda.time.Period period40 = period38.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.DurationFieldType durationFieldType52 = period50.getFieldType((int) (byte) 0);
        int int53 = period46.indexOf(durationFieldType52);
        int int54 = period38.get(durationFieldType52);
        org.joda.time.Period period56 = period28.withField(durationFieldType52, (int) (short) 0);
        boolean boolean57 = period21.isSupported(durationFieldType52);
        org.joda.time.Period period59 = period10.withField(durationFieldType52, (int) ' ');
        org.joda.time.Period period61 = period59.minusDays((int) '#');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0234");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 10, (long) (short) -1, chronology2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0235");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        org.joda.time.Period period10 = period8.withMillis((int) '4');
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0236");
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
        int int39 = period4.getYears();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0237");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0238");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P1Y-1M");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0239");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = period1.withSeconds(100);
        org.joda.time.Period period5 = period3.withWeeks((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0240");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period3.getMillis();
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
        org.joda.time.Period period52 = period3.minus((org.joda.time.ReadablePeriod) period51);
        int int53 = period52.getYears();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
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
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0241");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0242");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) -1);
        org.joda.time.Period period3 = period1.plusDays((int) '#');
        org.joda.time.Period period5 = period3.minusMonths((int) ' ');
        org.joda.time.Period period7 = period5.minusMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0243");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) 'a');
        org.joda.time.Period period3 = period1.withSeconds((int) (short) 100);
        org.joda.time.Seconds seconds4 = period1.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(seconds4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0244");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        int int6 = period4.getMillis();
        org.joda.time.Period period8 = period4.withHours((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period4.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
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
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) -1, periodType33, chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration20, periodType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) 100, periodType33, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType33);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType33);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 0, (long) (byte) 1, periodType33, chronology41);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0245");
        org.joda.time.Period period8 = new org.joda.time.Period((int) 'a', (-100), 1, 0, 8, (-1), (int) (short) 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0246");
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
        org.joda.time.Period period16 = period14.plusMillis((int) (short) 10);
        int int17 = period14.getDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0247");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        org.joda.time.Hours hours9 = period8.toStandardHours();
        org.joda.time.Period period11 = period8.minusMonths(1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0248");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 0);
        org.joda.time.Period period3 = period1.withMinutes((int) (byte) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0249");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-100));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0250");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.minusDays((int) (short) 0);
        org.joda.time.Period period10 = period8.plusMillis(10);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0251");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.Period period5 = period1.minusYears((int) '#');
        org.joda.time.Period period7 = period1.plusHours(100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0252");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (byte) 10);
        int int5 = period2.getWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0253");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.Period period14 = period10.plusWeeks((int) ' ');
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0254");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period5.withWeeks(1);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 'a', periodType10, chronology11);
        org.joda.time.Period period14 = period12.withMinutes(0);
        org.joda.time.Period period15 = period5.minus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period14.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Period period32 = period29.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 0, periodType52, chronology56);
        org.joda.time.Period period58 = period32.normalizedStandard(periodType52);
        org.joda.time.Period period59 = period14.normalizedStandard(periodType52);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType52);
        org.joda.time.Period period61 = new org.joda.time.Period((long) 8, periodType52);
        int int62 = period61.getHours();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0255");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.DurationFieldType durationFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = period1.withFieldAdded(durationFieldType2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0256");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        java.lang.Class<?> wildcardClass8 = period5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0257");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) -1, 1, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0258");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.plusMinutes((int) ' ');
        org.joda.time.Duration duration7 = period3.toStandardDuration();
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0259");
        org.joda.time.Period period1 = org.joda.time.Period.days(0);
        java.lang.Class<?> wildcardClass2 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0260");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = period1.withSeconds(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = period3.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0261");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period6 = period5.toPeriod();
        org.joda.time.Period period8 = period6.minusMonths(8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0262");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.plusMinutes((-1));
        org.joda.time.Period period10 = period8.plusYears(8);
        org.joda.time.Period period12 = period10.plusSeconds(97);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes13 = period10.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0263");
        org.joda.time.Period period1 = org.joda.time.Period.years(8);
        org.joda.time.Period period2 = period1.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0264");
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
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0265");
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
        org.joda.time.Days days35 = period2.toStandardDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(days35);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0266");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.MutablePeriod mutablePeriod6 = period3.toMutablePeriod();
        org.joda.time.Period period8 = period3.withYears(10);
        org.joda.time.Period period10 = period3.plusMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0267");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withMonths((int) (byte) 0);
        int[] intArray7 = period2.getValues();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0268");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period82 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0269");
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
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType((int) (byte) 0);
        int int31 = period24.indexOf(durationFieldType30);
        int int32 = period16.get(durationFieldType30);
        org.joda.time.Period period34 = period6.withField(durationFieldType30, (int) (short) 0);
        org.joda.time.Period period36 = period34.plusHours((int) (byte) 1);
        org.joda.time.Weeks weeks37 = period36.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(weeks37);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0270");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Days days6 = period3.toStandardDays();
        org.joda.time.Period period8 = period3.plusSeconds((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period3.toDurationTo(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0271");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period10.withWeeks(1);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Period period19 = period17.withMinutes(0);
        org.joda.time.Period period20 = period10.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period22 = period19.minusMillis((int) ' ');
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
        org.joda.time.Period period64 = period19.normalizedStandard(periodType57);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant77, readableInstant78);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant80, readableInstant81, periodType82);
        org.joda.time.MutablePeriod mutablePeriod84 = period83.toMutablePeriod();
        org.joda.time.Period period85 = period79.plus((org.joda.time.ReadablePeriod) period83);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.ReadableInstant readableInstant87 = null;
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period(readableInstant86, readableInstant87, periodType88);
        org.joda.time.Period period91 = period89.plusMonths((int) '4');
        org.joda.time.Period period92 = period83.withFields((org.joda.time.ReadablePeriod) period91);
        org.joda.time.PeriodType periodType93 = period91.getPeriodType();
        org.joda.time.Period period94 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType93);
        org.joda.time.Period period95 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType93);
        org.joda.time.Period period96 = new org.joda.time.Period(readableInstant65, readableInstant66, periodType93);
        org.joda.time.Chronology chronology97 = null;
        org.joda.time.Period period98 = new org.joda.time.Period((java.lang.Object) period64, periodType93, chronology97);
        org.joda.time.Period period99 = new org.joda.time.Period((int) (short) 10, (int) (byte) 10, (int) (short) 1, (int) ' ', (int) '#', (int) (byte) 0, 0, 0, periodType93);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
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
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(mutablePeriod84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(periodType93);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0272");
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
        org.joda.time.Period period32 = period25.minusMonths((int) 'a');
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0273");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period5.minusMonths((int) 'a');
        org.joda.time.Period period11 = period5.minusMillis((int) ' ');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0274");
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
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period10.toDurationTo(readableInstant15);
        java.lang.Class<?> wildcardClass17 = period10.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0275");
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
        org.joda.time.Period period44 = period41.withYears((int) (short) 0);
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
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0276");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) -1, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType20);
        org.joda.time.Period period24 = period23.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds25 = period24.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0277");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period16.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period16.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
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
        int int42 = period26.get(durationFieldType40);
        org.joda.time.Period period44 = period16.withField(durationFieldType40, (int) (short) 0);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(100L, (long) ' ', chronology47);
        org.joda.time.Period period50 = period48.plusHours(1);
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
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 0, periodType70, chronology74);
        org.joda.time.Period period76 = period50.withPeriodType(periodType70);
        org.joda.time.Period period77 = period16.withPeriodType(periodType70);
        org.joda.time.Period period78 = new org.joda.time.Period(8, (int) (short) 0, 10, (int) (byte) -1, (-1), 100, (int) '4', (int) (byte) -1, periodType70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period79 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period77);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0278");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.Period period12 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.Period period19 = period10.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.PeriodType periodType20 = period18.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0279");
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
        org.joda.time.Period period20 = period10.plusMillis((int) (byte) -1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0280");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology9);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) str11);
        org.joda.time.Period period14 = period12.plusSeconds((int) 'a');
        org.joda.time.Period period16 = period12.plusYears((int) (byte) 0);
        org.joda.time.Period period18 = period12.withMonths(0);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Period period24 = period22.withMinutes(0);
        org.joda.time.Period period26 = period24.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod27 = period24.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period34.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.DurationFieldType durationFieldType58 = period56.getFieldType((int) (byte) 0);
        int int59 = period52.indexOf(durationFieldType58);
        int int60 = period44.get(durationFieldType58);
        org.joda.time.Period period62 = period34.withField(durationFieldType58, (int) (short) 0);
        int int63 = mutablePeriod27.indexOf(durationFieldType58);
        int int64 = period18.get(durationFieldType58);
        org.joda.time.Period period66 = period5.withFieldAdded(durationFieldType58, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration67 = period66.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT-0.011S" + "'", str11, "PT-0.011S");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0281");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0282");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period12 = period9.withYears(8);
        org.joda.time.Period period14 = period9.minusMonths(0);
        int int15 = period14.getMillis();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-11) + "'", int15 == (-11));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0283");
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
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant14);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0284");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0285");
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
        org.joda.time.Period period71 = period8.withHours((int) ' ');
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
        org.junit.Assert.assertNotNull(period71);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0286");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 10);
        org.joda.time.Period period3 = period1.minusDays((int) (byte) 10);
        org.joda.time.Minutes minutes4 = period1.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0287");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((-1), 0, (int) (short) 100, 0);
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType7);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0288");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = period4.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0289");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, periodType37, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType37);
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) str9, periodType37);
        org.joda.time.Period period46 = period44.minusWeeks(100);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period53.plusMonths((int) '#');
        org.joda.time.Period period57 = period53.plusMinutes((int) (short) 100);
        org.joda.time.Period period59 = period57.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType61 = period57.getFieldType((int) (byte) 0);
        org.joda.time.Period period63 = period46.withField(durationFieldType61, 100);
        org.joda.time.Minutes minutes64 = period46.toStandardMinutes();
        org.joda.time.Period period66 = period46.withDays((int) (short) 100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT32M" + "'", str9, "PT32M");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0290");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0291");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (byte) 10);
        org.joda.time.Period period5 = period2.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0292");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period20 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.Period period26 = period24.plusMonths((int) '4');
        org.joda.time.Period period27 = period18.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = period26.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType28);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType28);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(mutablePeriod32);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0293");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.Period period16 = period14.minusDays(100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 0, periodType36, chronology40);
        org.joda.time.Hours hours42 = period41.toStandardHours();
        boolean boolean43 = period14.equals((java.lang.Object) hours42);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0294");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.Period period3 = org.joda.time.Period.years((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.Period period13 = period12.normalizedStandard();
        org.joda.time.Period period15 = period12.withWeeks(1);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 'a', periodType17, chronology18);
        org.joda.time.Period period21 = period19.withMinutes(0);
        org.joda.time.Period period22 = period12.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(100L, (long) ' ', chronology25);
        org.joda.time.Period period28 = period26.plusHours(1);
        org.joda.time.Weeks weeks29 = period28.toStandardWeeks();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology32);
        java.lang.String str34 = period33.toString();
        org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) str34);
        org.joda.time.Period period37 = period35.plusSeconds((int) 'a');
        org.joda.time.Period period39 = period35.plusYears((int) (byte) 0);
        org.joda.time.Period period41 = period35.withMonths(0);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 'a', periodType43, chronology44);
        org.joda.time.Period period47 = period45.withMinutes(0);
        org.joda.time.Period period49 = period47.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod50 = period47.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Period period57 = period53.plusMonths(0);
        org.joda.time.Period period59 = period57.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period57.toDurationFrom(readableInstant60);
        org.joda.time.Period period63 = period57.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, readableInstant65, periodType66);
        org.joda.time.Period period69 = period67.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant70, readableInstant71, periodType72);
        org.joda.time.Period period75 = period73.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, readableInstant77, periodType78);
        org.joda.time.DurationFieldType durationFieldType81 = period79.getFieldType((int) (byte) 0);
        int int82 = period75.indexOf(durationFieldType81);
        int int83 = period67.get(durationFieldType81);
        org.joda.time.Period period85 = period57.withField(durationFieldType81, (int) (short) 0);
        int int86 = mutablePeriod50.indexOf(durationFieldType81);
        int int87 = period41.get(durationFieldType81);
        org.joda.time.Period period89 = period28.withFieldAdded(durationFieldType81, (int) (byte) 1);
        org.joda.time.Period period91 = period12.withField(durationFieldType81, 0);
        boolean boolean92 = period6.isSupported(durationFieldType81);
        boolean boolean93 = period3.isSupported(durationFieldType81);
        org.joda.time.Period period95 = period1.withField(durationFieldType81, (int) (byte) 1);
        org.joda.time.Period period97 = period1.minusYears((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT-0.011S" + "'", str34, "PT-0.011S");
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(mutablePeriod50);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0295");
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
        org.joda.time.Period period15 = period6.multipliedBy(1);
        int int16 = period15.getHours();
        int int17 = period15.getHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0296");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '4', (int) (short) -1, (int) (byte) 100, (-31));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0297");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period9 = period6.plusDays(10);
        org.joda.time.Period period11 = period6.minusWeeks((int) (short) -1);
        int int12 = period11.getSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0298");
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
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.Period period18 = period16.withFields(readablePeriod17);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0299");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Period period12 = period9.plusMinutes((int) ' ');
        org.joda.time.Period period13 = period6.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period15 = period6.withHours((int) ' ');
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0300");
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
        org.joda.time.Period period14 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = period18.get(durationFieldType19);
        org.joda.time.Period period21 = period14.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Days days22 = period21.toStandardDays();
        int int23 = period21.getSeconds();
        boolean boolean24 = period8.equals((java.lang.Object) int23);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0301");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 1);
        int int2 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0302");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        int int8 = period7.size();
        org.joda.time.Period period10 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period11 = period10.normalizedStandard();
        boolean boolean12 = period7.equals((java.lang.Object) period10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0303");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.Period period5 = period1.plusHours((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period1.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0304");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds7 = period6.toStandardSeconds();
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period15.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period15.minusMinutes((int) (byte) -1);
        org.joda.time.Duration duration22 = period21.toStandardDuration();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology25);
        java.lang.String str27 = period26.toString();
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) str27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.Period period39 = period35.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) str27, periodType40);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 'a', periodType43, chronology44);
        org.joda.time.Period period47 = period45.withMinutes(0);
        org.joda.time.Period period49 = period47.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod50 = period47.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Period period57 = period53.plusMonths(0);
        org.joda.time.Period period59 = period57.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period57.toDurationFrom(readableInstant60);
        org.joda.time.Period period63 = period57.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, readableInstant65, periodType66);
        org.joda.time.Period period69 = period67.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant70, readableInstant71, periodType72);
        org.joda.time.Period period75 = period73.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, readableInstant77, periodType78);
        org.joda.time.DurationFieldType durationFieldType81 = period79.getFieldType((int) (byte) 0);
        int int82 = period75.indexOf(durationFieldType81);
        int int83 = period67.get(durationFieldType81);
        org.joda.time.Period period85 = period57.withField(durationFieldType81, (int) (short) 0);
        int int86 = mutablePeriod50.indexOf(durationFieldType81);
        int int87 = period41.get(durationFieldType81);
        int int88 = period21.indexOf(durationFieldType81);
        org.joda.time.Period period90 = period6.withFieldAdded(durationFieldType81, (int) (short) -1);
        org.joda.time.Period period92 = period6.plusWeeks((int) '4');
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT-0.011S" + "'", str27, "PT-0.011S");
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(mutablePeriod50);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0305");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Days days3 = period2.toStandardDays();
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0306");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) 'a');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0307");
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
        org.joda.time.Period period42 = period4.minusWeeks((-31));
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
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0308");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getYears();
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period6.toString(periodFormatter8);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0S" + "'", str9, "PT0S");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0309");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, 1L, chronology2);
        org.joda.time.Period period5 = period3.plusSeconds((int) '#');
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0310");
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
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 'a', periodType44, chronology45);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 'a', periodType48, chronology49);
        org.joda.time.Hours hours51 = period50.toStandardHours();
        org.joda.time.Period period52 = period46.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period54 = period46.withYears(10);
        org.joda.time.Period period56 = period54.withSeconds((int) (short) 1);
        boolean boolean57 = period40.equals((java.lang.Object) period54);
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
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0311");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        int int5 = period3.getWeeks();
        org.joda.time.Period period7 = period3.minusDays((int) 'a');
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0312");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period5.getWeeks();
        int int7 = period5.getDays();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = period5.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0313");
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
        org.joda.time.Period period14 = period5.withMonths((int) '#');
        org.joda.time.Period period16 = period5.plusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0314");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.minusMillis((int) (byte) 1);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period11.withDays((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0315");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getHours();
        org.joda.time.Period period8 = period6.negated();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0316");
        org.joda.time.Period period4 = new org.joda.time.Period((-31), (int) (short) 1, 0, (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0317");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days42 = period14.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
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
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0318");
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
        org.joda.time.Period period22 = period20.withSeconds((int) (byte) 0);
        org.joda.time.Period period24 = period20.minusDays((int) (byte) -1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0319");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 100);
        int int2 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0320");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) ' ');
        int int2 = period1.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0321");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.Period period25 = period16.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = period24.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', (long) 10, periodType26);
        org.joda.time.Period period29 = period5.withPeriodType(periodType26);
        org.joda.time.Period period31 = period29.minusDays((int) (byte) 10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0322");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, periodType37, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType37);
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) str9, periodType37);
        org.joda.time.Period period46 = period44.minusWeeks(100);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period53.plusMonths((int) '#');
        org.joda.time.Period period57 = period53.plusMinutes((int) (short) 100);
        org.joda.time.Period period59 = period57.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType61 = period57.getFieldType((int) (byte) 0);
        org.joda.time.Period period63 = period46.withField(durationFieldType61, 100);
        org.joda.time.Period period72 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        int int73 = period72.size();
        org.joda.time.Period period74 = period63.plus((org.joda.time.ReadablePeriod) period72);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT32M" + "'", str9, "PT32M");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 8 + "'", int73 == 8);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0324");
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
        org.joda.time.Period period33 = period31.minusDays(1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = period31.getFieldTypes();
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
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0325");
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Period period14 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.Period period20 = period18.plusMonths((int) '4');
        org.joda.time.Period period21 = period12.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = period20.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', (long) 10, periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 100, 100L, periodType22);
        java.lang.Class<?> wildcardClass26 = period25.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0326");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, 0L);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0327");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) 'a');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0328");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
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
        org.joda.time.Period period49 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType44, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant23, periodType44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 100, (long) (short) -1, periodType44, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant13, periodType44);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0329");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        int int10 = period9.getDays();
        org.joda.time.Period period11 = period9.normalizedStandard();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0330");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        org.joda.time.Period period4 = period2.plusSeconds((int) (short) -1);
        int int5 = period2.getDays();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0331");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Duration duration9 = period8.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0332");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Duration duration7 = period4.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period10.withWeeks(1);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Period period19 = period17.withMinutes(0);
        org.joda.time.Period period20 = period10.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(100L, (long) ' ', chronology23);
        org.joda.time.Period period26 = period24.plusHours(1);
        org.joda.time.Weeks weeks27 = period26.toStandardWeeks();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology30);
        java.lang.String str32 = period31.toString();
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) str32);
        org.joda.time.Period period35 = period33.plusSeconds((int) 'a');
        org.joda.time.Period period37 = period33.plusYears((int) (byte) 0);
        org.joda.time.Period period39 = period33.withMonths(0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 'a', periodType41, chronology42);
        org.joda.time.Period period45 = period43.withMinutes(0);
        org.joda.time.Period period47 = period45.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod48 = period45.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        org.joda.time.Period period55 = period51.plusMonths(0);
        org.joda.time.Period period57 = period55.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period55.toDurationFrom(readableInstant58);
        org.joda.time.Period period61 = period55.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, readableInstant63, periodType64);
        org.joda.time.Period period67 = period65.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, readableInstant69, periodType70);
        org.joda.time.Period period73 = period71.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, readableInstant75, periodType76);
        org.joda.time.DurationFieldType durationFieldType79 = period77.getFieldType((int) (byte) 0);
        int int80 = period73.indexOf(durationFieldType79);
        int int81 = period65.get(durationFieldType79);
        org.joda.time.Period period83 = period55.withField(durationFieldType79, (int) (short) 0);
        int int84 = mutablePeriod48.indexOf(durationFieldType79);
        int int85 = period39.get(durationFieldType79);
        org.joda.time.Period period87 = period26.withFieldAdded(durationFieldType79, (int) (byte) 1);
        org.joda.time.Period period89 = period10.withField(durationFieldType79, 0);
        boolean boolean90 = period4.isSupported(durationFieldType79);
        boolean boolean91 = period1.isSupported(durationFieldType79);
        org.joda.time.Period period93 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period95 = period93.withDays(1);
        org.joda.time.Period period97 = period95.withSeconds((int) '4');
        org.joda.time.Period period98 = period1.minus((org.joda.time.ReadablePeriod) period95);
        org.joda.time.DurationFieldType[] durationFieldTypeArray99 = period98.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT-0.011S" + "'", str32, "PT-0.011S");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertNotNull(period97);
        org.junit.Assert.assertNotNull(period98);
        org.junit.Assert.assertNotNull(durationFieldTypeArray99);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0333");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) str7);
        org.joda.time.Period period10 = period8.plusSeconds((int) 'a');
        org.joda.time.Period period12 = period10.plusWeeks((int) (short) 10);
        org.joda.time.Period period14 = period10.withMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.Period period23 = period17.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period21.withMonths((int) (byte) 0);
        org.joda.time.Period period26 = period14.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Duration duration27 = period14.toStandardDuration();
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
        org.joda.time.Period period71 = new org.joda.time.Period((long) 'a', periodType63, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration27, periodType63);
        org.joda.time.Period period73 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType63);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT-0.011S" + "'", str7, "PT-0.011S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration27);
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0334");
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
        org.joda.time.Period period20 = period10.plusWeeks(1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0335");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.minusMinutes((int) (short) -1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0336");
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
        int int19 = period17.getSeconds();
        int[] intArray20 = period17.getValues();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-100) + "'", int19 == (-100));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 0, (-1), 0, 0, 0, (-100), 97 });
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0337");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0338");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
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
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        int int21 = period4.getMonths();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0339");
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
        org.joda.time.Period period29 = period3.minusHours((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0340");
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
        int int31 = period30.getWeeks();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0341");
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
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant69, readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.MutablePeriod mutablePeriod76 = period75.toMutablePeriod();
        org.joda.time.Period period77 = period71.plus((org.joda.time.ReadablePeriod) period75);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, readableInstant79, periodType80);
        org.joda.time.Period period83 = period81.plusMonths((int) '4');
        org.joda.time.Period period84 = period75.withFields((org.joda.time.ReadablePeriod) period83);
        org.joda.time.PeriodType periodType85 = period83.getPeriodType();
        org.joda.time.Period period86 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType85);
        org.joda.time.Period period87 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType85);
        org.joda.time.Period period88 = new org.joda.time.Period(readableInstant57, readableInstant58, periodType85);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((java.lang.Object) period56, periodType85, chronology89);
        // The following exception was thrown during execution in test generation
        try {
            int int92 = period56.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(mutablePeriod76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(periodType85);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0342");
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
        int int45 = period6.size();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0343");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0344");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Hours hours16 = period15.toStandardHours();
        org.joda.time.Period period17 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period19 = period11.withYears(10);
        org.joda.time.Period period20 = period19.toPeriod();
        org.joda.time.Period period22 = period19.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationFrom(readableInstant34);
        org.joda.time.Period period37 = period33.plusMonths(0);
        org.joda.time.Period period39 = period37.plusMonths((int) '#');
        org.joda.time.Period period41 = period37.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (short) -1, periodType42, chronology43);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration29, periodType42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 0, periodType42, chronology46);
        org.joda.time.Period period48 = period22.normalizedStandard(periodType42);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 'a', periodType42, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) period5, periodType42);
        org.joda.time.Period period53 = org.joda.time.Period.years((int) (short) -1);
        org.joda.time.Period period55 = period53.plusDays((int) '#');
        org.joda.time.Period period56 = period51.withFields((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(100L, (long) 'a', chronology59);
        org.joda.time.Period period62 = org.joda.time.Period.months((int) (short) 100);
        org.joda.time.Period period64 = period62.minusSeconds((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType66 = period62.getFieldType((int) (byte) 0);
        int int67 = period60.indexOf(durationFieldType66);
        org.joda.time.Period period69 = period51.withField(durationFieldType66, (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0345");
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
        org.joda.time.Period period16 = period14.withMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        boolean boolean22 = period14.equals((java.lang.Object) period19);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0346");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) '4', periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusMillis(0);
        org.joda.time.Period period8 = period6.multipliedBy((int) (byte) 1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0347");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.format.PeriodFormatter periodFormatter6 = null;
        java.lang.String str7 = period3.toString(periodFormatter6);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0348");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.plusMinutes((-1));
        org.joda.time.Period period10 = period8.plusYears(8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, (long) (-1), chronology13);
        org.joda.time.Period period16 = period14.withHours(0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType37);
        org.joda.time.Period period42 = period14.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) -1);
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
        org.joda.time.Period period60 = period44.minus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant71, readableInstant72);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = period73.toDurationFrom(readableInstant74);
        org.joda.time.Period period77 = period73.plusMonths(0);
        org.joda.time.Period period79 = period77.plusMonths((int) '#');
        org.joda.time.Period period81 = period77.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType82 = period77.getPeriodType();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (short) -1, periodType82, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType82);
        org.joda.time.Period period86 = new org.joda.time.Period((long) (byte) 10, periodType82);
        org.joda.time.Period period87 = period59.withPeriodType(periodType82);
        org.joda.time.Period period88 = period41.normalizedStandard(periodType82);
        org.joda.time.Period period89 = period10.withPeriodType(periodType82);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0349");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        int int6 = period5.getMillis();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0350");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5, periodType6);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0351");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0352");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P100WT-31.903S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0353");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, (long) 10);
        int int3 = period2.getSeconds();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0354");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.Period period12 = period10.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.DurationFieldType durationFieldType24 = period22.getFieldType((int) (byte) 0);
        int int25 = period18.indexOf(durationFieldType24);
        int int26 = period10.get(durationFieldType24);
        org.joda.time.Period period27 = period3.minus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray28 = period10.getFieldTypes();
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldTypeArray28);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0355");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 100);
        org.joda.time.Period period3 = period1.minusSeconds((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType5 = period1.getFieldType((int) (byte) 0);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.Hours hours14 = period13.toStandardHours();
        org.joda.time.Period period15 = period9.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period9.withYears(10);
        org.joda.time.Period period18 = period17.toPeriod();
        org.joda.time.Period period20 = period17.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.Period period39 = period35.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) -1, periodType40, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant22, (org.joda.time.ReadableDuration) duration27, periodType40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (byte) 0, periodType40, chronology44);
        org.joda.time.Period period46 = period20.normalizedStandard(periodType40);
        int[] intArray47 = period46.getValues();
        int int48 = period46.size();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period46.toDurationTo(readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, readableInstant51);
        org.joda.time.Period period54 = period52.withYears(1);
        org.joda.time.Period period55 = period1.plus((org.joda.time.ReadablePeriod) period52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 10, 0, 0, 0, 0, 0, 0, 98 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0356");
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
        org.joda.time.format.PeriodFormatter periodFormatter14 = null;
        java.lang.String str15 = period13.toString(periodFormatter14);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT1M0.097S" + "'", str15, "PT1M0.097S");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0357");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.withMonths((int) (byte) 0);
        org.joda.time.Period period13 = period7.plusWeeks((int) (byte) 1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology16);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) str18);
        org.joda.time.Period period21 = period19.plusSeconds((int) 'a');
        org.joda.time.Period period23 = period21.plusWeeks((int) (short) 10);
        org.joda.time.Period period25 = period21.minusMillis((int) (byte) 1);
        org.joda.time.Period period26 = period7.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period35.toDurationFrom(readableInstant38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant57, readableInstant58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationFrom(readableInstant60);
        org.joda.time.Period period63 = period59.plusMonths(0);
        org.joda.time.Period period65 = period63.plusMonths((int) '#');
        org.joda.time.Period period67 = period63.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType68 = period63.getPeriodType();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((long) (short) -1, periodType68, chronology69);
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration55, periodType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) (short) 100, periodType68, chronology72);
        org.joda.time.Period period74 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType68);
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration39, periodType68);
        org.joda.time.Period period76 = period25.withPeriodType(periodType68);
        org.joda.time.Period period77 = new org.joda.time.Period((long) ' ', periodType68);
        org.joda.time.Period period78 = period77.negated();
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT-0.011S" + "'", str18, "PT-0.011S");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0358");
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
        org.joda.time.format.PeriodFormatter periodFormatter31 = null;
        java.lang.String str32 = period9.toString(periodFormatter31);
        int int33 = period9.getMinutes();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT-100M-99.903S" + "'", str32, "PT-100M-99.903S");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-100) + "'", int33 == (-100));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0359");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds7 = period6.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period10.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period23.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period23.minusMinutes((int) (byte) -1);
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
        org.joda.time.Period period51 = period23.withField(durationFieldType47, (int) (short) 0);
        int int52 = period16.indexOf(durationFieldType47);
        int int53 = period6.get(durationFieldType47);
        int int54 = period6.getWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0360");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType63);
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0361");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.Period period5 = period1.plusHours((int) (short) 100);
        org.joda.time.PeriodType periodType6 = period1.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0362");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(97);
        org.joda.time.Period period3 = period1.minusMillis(97);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0363");
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
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        org.joda.time.Period period26 = period20.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period20.withYears(10);
        org.joda.time.Period period29 = period28.toPeriod();
        org.joda.time.Period period31 = period28.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period42.plusMonths(0);
        org.joda.time.Period period48 = period46.plusMonths((int) '#');
        org.joda.time.Period period50 = period46.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType51 = period46.getPeriodType();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (short) -1, periodType51, chronology52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration38, periodType51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (byte) 0, periodType51, chronology55);
        org.joda.time.Period period57 = period31.normalizedStandard(periodType51);
        org.joda.time.Period period58 = period13.normalizedStandard(periodType51);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType51);
        java.lang.String str60 = period59.toString();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0S" + "'", str60, "PT0S");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0364");
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
        java.lang.String str21 = period20.toString();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P-1MT-97S" + "'", str21, "P-1MT-97S");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0365");
        org.joda.time.Period period4 = new org.joda.time.Period((-1), (int) (short) 0, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0366");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        int int6 = period4.getMonths();
        int[] intArray7 = period4.getValues();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, 0, 0, 0, (-53) });
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0367");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period10.plusWeeks(0);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0368");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period5.getWeeks();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0369");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(8);
        org.joda.time.Period period3 = period1.plusSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0370");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 0, chronology1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0371");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) -1);
        org.joda.time.Period period3 = period1.plusDays((int) '#');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationTo(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Period period19 = period17.withMinutes(0);
        org.joda.time.Period period21 = period19.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod22 = period19.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period29.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period29.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.Period period41 = period39.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.Period period47 = period45.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.DurationFieldType durationFieldType53 = period51.getFieldType((int) (byte) 0);
        int int54 = period47.indexOf(durationFieldType53);
        int int55 = period39.get(durationFieldType53);
        org.joda.time.Period period57 = period29.withField(durationFieldType53, (int) (short) 0);
        int int58 = mutablePeriod22.indexOf(durationFieldType53);
        boolean boolean59 = period13.isSupported(durationFieldType53);
        org.joda.time.Period period61 = period3.withField(durationFieldType53, (int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0372");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        int int6 = period2.getMillis();
        org.joda.time.Period period8 = period2.plusHours((int) (byte) 100);
        org.joda.time.Period period10 = period8.withMinutes((int) (short) 100);
        org.joda.time.Weeks weeks11 = period8.toStandardWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0373");
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
        org.joda.time.Period period16 = period3.plusSeconds(97);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0374");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Hours hours12 = period11.toStandardHours();
        org.joda.time.Period period13 = period7.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period7.withYears(10);
        org.joda.time.Period period16 = period15.toPeriod();
        org.joda.time.Period period18 = period15.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 0, periodType38, chronology42);
        org.joda.time.Period period44 = period18.normalizedStandard(periodType38);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(0L, (long) 8, periodType38, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) ' ', periodType38, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(obj0, periodType38, chronology49);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0375");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMonths((-1));
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0376");
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
        int int13 = period10.getMinutes();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period10.toDurationTo(readableInstant14);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0377");
        org.joda.time.Period period1 = org.joda.time.Period.hours(100);
        int int2 = period1.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0378");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.plusMinutes((int) ' ');
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        java.lang.String str11 = period9.toString(periodFormatter10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.Period period38 = period34.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType39 = period34.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) -1, periodType39, chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration26, periodType39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (short) 100, periodType39, chronology43);
        org.joda.time.Period period45 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType39);
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) str11, periodType39);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 97, (long) (byte) 1, periodType39, chronology47);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT32M" + "'", str11, "PT32M");
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0379");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.Period period3 = period1.plusSeconds(100);
        int int4 = period3.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0380");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period3.getMillis();
        org.joda.time.Period period8 = period3.withDays(1);
        int[] intArray9 = period8.getValues();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 1, 0, 0, 0, 97 });
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0381");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        int int7 = period5.size();
        org.joda.time.Hours hours8 = period5.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(hours8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0382");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        int int6 = period4.getMonths();
        org.joda.time.Period period8 = period4.withWeeks(8);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Duration duration14 = period11.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period17.withWeeks(1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Period period26 = period24.withMinutes(0);
        org.joda.time.Period period27 = period17.minus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(100L, (long) ' ', chronology30);
        org.joda.time.Period period33 = period31.plusHours(1);
        org.joda.time.Weeks weeks34 = period33.toStandardWeeks();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology37);
        java.lang.String str39 = period38.toString();
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) str39);
        org.joda.time.Period period42 = period40.plusSeconds((int) 'a');
        org.joda.time.Period period44 = period40.plusYears((int) (byte) 0);
        org.joda.time.Period period46 = period40.withMonths(0);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 'a', periodType48, chronology49);
        org.joda.time.Period period52 = period50.withMinutes(0);
        org.joda.time.Period period54 = period52.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod55 = period52.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.Period period62 = period58.plusMonths(0);
        org.joda.time.Period period64 = period62.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period62.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period62.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.Period period74 = period72.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.Period period80 = period78.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, readableInstant82, periodType83);
        org.joda.time.DurationFieldType durationFieldType86 = period84.getFieldType((int) (byte) 0);
        int int87 = period80.indexOf(durationFieldType86);
        int int88 = period72.get(durationFieldType86);
        org.joda.time.Period period90 = period62.withField(durationFieldType86, (int) (short) 0);
        int int91 = mutablePeriod55.indexOf(durationFieldType86);
        int int92 = period46.get(durationFieldType86);
        org.joda.time.Period period94 = period33.withFieldAdded(durationFieldType86, (int) (byte) 1);
        org.joda.time.Period period96 = period17.withField(durationFieldType86, 0);
        boolean boolean97 = period11.isSupported(durationFieldType86);
        org.joda.time.Period period99 = period8.withFieldAdded(durationFieldType86, (int) (byte) 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PT-0.011S" + "'", str39, "PT-0.011S");
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(period99);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0383");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getYears();
        org.joda.time.Period period9 = period6.withMonths((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = period6.getClass();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0384");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.minusMillis((int) (byte) 1);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period12.minusSeconds((-11));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0385");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Weeks weeks11 = period10.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0386");
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
        int int41 = period40.getMonths();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0387");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period5.minusMonths((int) 'a');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(0L, 0L, chronology12);
        org.joda.time.Period period15 = period13.withHours((int) 'a');
        org.joda.time.Period period16 = period5.minus((org.joda.time.ReadablePeriod) period15);
        java.lang.Class<?> wildcardClass17 = period16.getClass();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0388");
        org.joda.time.Period period1 = new org.joda.time.Period((long) ' ');
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0389");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        int int15 = period14.size();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0390");
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
        org.joda.time.Period period14 = period6.plusHours((int) (short) 100);
        int int15 = period14.getHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0391");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) -1);
        org.joda.time.Period period3 = period1.plusDays((int) (byte) 100);
        org.joda.time.Period period5 = period1.plusDays(97);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0392");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-31));
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0393");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT-1M");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0394");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusHours((-1));
        java.lang.String str14 = period13.toString();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P-1Y35W10DT1H10M-30.990S" + "'", str14, "P-1Y35W10DT1H10M-30.990S");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0395");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(97);
        org.joda.time.Period period3 = period1.minusDays((int) (short) 100);
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = period1.toString(periodFormatter4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P97W" + "'", str5, "P97W");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0396");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period8 = period5.negated();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.Period period21 = period19.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) period19, periodType22);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 'a', periodType25, chronology26);
        org.joda.time.Hours hours28 = period27.toStandardHours();
        org.joda.time.Period period30 = period27.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType33);
        org.joda.time.DurationFieldType durationFieldType36 = period34.getFieldType((int) (byte) 0);
        org.joda.time.Period period38 = period27.withField(durationFieldType36, 1);
        int int39 = period23.get(durationFieldType36);
        org.joda.time.Period period41 = period8.withField(durationFieldType36, 97);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0397");
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
        org.joda.time.Period period14 = new org.joda.time.Period();
        org.joda.time.Period period16 = period14.minusDays((int) (short) 0);
        org.joda.time.Period period18 = period16.plusSeconds((int) (short) -1);
        org.joda.time.Period period19 = period3.minus((org.joda.time.ReadablePeriod) period16);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0398");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Weeks weeks8 = period7.toStandardWeeks();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0399");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.minusWeeks((int) ' ');
        org.joda.time.Period period5 = period3.multipliedBy(0);
        org.joda.time.Period period6 = period3.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0400");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT-1M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0401");
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
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType((int) (byte) 0);
        int int31 = period24.indexOf(durationFieldType30);
        int int32 = period16.get(durationFieldType30);
        org.joda.time.Period period34 = period6.withField(durationFieldType30, (int) (short) 0);
        java.lang.Class<?> wildcardClass35 = period6.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0402");
        org.joda.time.Period period1 = org.joda.time.Period.years(10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0403");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period10.toDurationTo(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant14);
        java.lang.Class<?> wildcardClass16 = duration13.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0404");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        int int4 = period3.getHours();
        org.joda.time.Period period6 = period3.plusWeeks((int) (byte) 0);
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) -1);
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
        org.joda.time.Period period24 = period8.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period26 = period23.plusMillis(100);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology29);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) str31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Period period39 = period35.plusMonths(0);
        org.joda.time.Period period41 = period39.plusMonths((int) '#');
        org.joda.time.Period period43 = period39.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType44 = period39.getPeriodType();
        org.joda.time.Period period45 = new org.joda.time.Period((java.lang.Object) str31, periodType44);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) 'a', periodType47, chronology48);
        org.joda.time.Period period51 = period49.withMinutes(0);
        org.joda.time.Period period53 = period51.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod54 = period51.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant55, readableInstant56);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period57.toDurationFrom(readableInstant58);
        org.joda.time.Period period61 = period57.plusMonths(0);
        org.joda.time.Period period63 = period61.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period61.toDurationFrom(readableInstant64);
        org.joda.time.Period period67 = period61.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, readableInstant69, periodType70);
        org.joda.time.Period period73 = period71.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, readableInstant75, periodType76);
        org.joda.time.Period period79 = period77.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant80, readableInstant81, periodType82);
        org.joda.time.DurationFieldType durationFieldType85 = period83.getFieldType((int) (byte) 0);
        int int86 = period79.indexOf(durationFieldType85);
        int int87 = period71.get(durationFieldType85);
        org.joda.time.Period period89 = period61.withField(durationFieldType85, (int) (short) 0);
        int int90 = mutablePeriod54.indexOf(durationFieldType85);
        int int91 = period45.get(durationFieldType85);
        int int92 = period23.get(durationFieldType85);
        int int93 = period6.indexOf(durationFieldType85);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT-0.011S" + "'", str31, "PT-0.011S");
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(mutablePeriod54);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0405");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 100);
        org.joda.time.Period period3 = period1.minusSeconds((int) (byte) 1);
        org.joda.time.Period period5 = period3.multipliedBy(8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0406");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Duration duration18 = period1.toStandardDuration();
        org.joda.time.Period period20 = period1.plusWeeks(97);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0407");
        org.joda.time.Period period8 = new org.joda.time.Period(1, 10, (int) (byte) 0, 10, (int) (byte) 10, (int) (short) 10, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0408");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0S");
        org.joda.time.format.PeriodFormatter periodFormatter2 = null;
        java.lang.String str3 = period1.toString(periodFormatter2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0409");
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
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period63.toDurationTo(readableInstant64);
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
        org.junit.Assert.assertNotNull(duration65);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0410");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.Days days6 = period4.toStandardDays();
        int int7 = period4.getYears();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0411");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 0, (int) (byte) 1, (int) '4', (int) (short) 0, 0, (-31), (-11), (int) (short) 1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0412");
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
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 'a', periodType21, chronology22);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 'a', periodType25, chronology26);
        org.joda.time.Hours hours28 = period27.toStandardHours();
        org.joda.time.Period period29 = period23.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period23.withYears(10);
        org.joda.time.Period period32 = period31.toPeriod();
        org.joda.time.Period period34 = period31.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.Period period49 = period45.plusMonths(0);
        org.joda.time.Period period51 = period49.plusMonths((int) '#');
        org.joda.time.Period period53 = period49.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType54 = period49.getPeriodType();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (short) -1, periodType54, chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration41, periodType54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (byte) 0, periodType54, chronology58);
        org.joda.time.Period period60 = period34.normalizedStandard(periodType54);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(0L, (long) 8, periodType54, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) period8, periodType54);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (-100), (long) 1, periodType54, chronology64);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period60);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0413");
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
        org.joda.time.Period period78 = new org.joda.time.Period(0L, 0L, periodType69);
        int[] intArray79 = period78.getValues();
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
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0414");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Period period12 = period9.plusMinutes((int) ' ');
        org.joda.time.Period period13 = period6.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Minutes minutes14 = period9.toStandardMinutes();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0415");
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
        org.joda.time.Duration duration13 = period12.toStandardDuration();
        int int15 = period12.getValue((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0416");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.Period period16 = period12.withHours((int) '4');
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0417");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) 'a', chronology2);
        org.joda.time.Period period5 = org.joda.time.Period.months((int) (short) 100);
        org.joda.time.Period period7 = period5.minusSeconds((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType9 = period5.getFieldType((int) (byte) 0);
        int int10 = period3.indexOf(durationFieldType9);
        org.joda.time.Period period12 = period3.plusHours((int) (short) 10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0418");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) -1);
        org.joda.time.Period period3 = period1.minusSeconds(10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0419");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period10.minusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = period14.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0420");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds13 = period12.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0421");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = period3.getSeconds();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0422");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.Period period3 = period1.plusSeconds(100);
        int int4 = period3.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0423");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period16.withMonths((int) (byte) 0);
        org.joda.time.Period period22 = period16.plusWeeks((int) (byte) 1);
        boolean boolean23 = period7.equals((java.lang.Object) (byte) 1);
        org.joda.time.Period period25 = period7.plusMillis(0);
        org.joda.time.Period period27 = org.joda.time.Period.days((-100));
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', periodType29, chronology30);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Hours hours36 = period35.toStandardHours();
        org.joda.time.Period period37 = period31.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period39 = period31.withYears(10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period42.plusMonths(0);
        org.joda.time.Period period48 = period42.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        org.joda.time.Period period55 = period51.plusMonths(0);
        org.joda.time.Period period57 = period55.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period55.toDurationFrom(readableInstant58);
        org.joda.time.Period period61 = period55.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, readableInstant63, periodType64);
        org.joda.time.Period period67 = period65.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, readableInstant69, periodType70);
        org.joda.time.Period period73 = period71.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, readableInstant75, periodType76);
        org.joda.time.DurationFieldType durationFieldType79 = period77.getFieldType((int) (byte) 0);
        int int80 = period73.indexOf(durationFieldType79);
        int int81 = period65.get(durationFieldType79);
        org.joda.time.Period period83 = period55.withField(durationFieldType79, (int) (short) 0);
        int int84 = period48.indexOf(durationFieldType79);
        int int85 = period39.get(durationFieldType79);
        org.joda.time.Period period87 = period27.withField(durationFieldType79, 0);
        org.joda.time.Period period89 = period7.withFieldAdded(durationFieldType79, (int) (byte) 100);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0424");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds7 = period6.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period10.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period23.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period23.minusMinutes((int) (byte) -1);
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
        org.joda.time.Period period51 = period23.withField(durationFieldType47, (int) (short) 0);
        int int52 = period16.indexOf(durationFieldType47);
        int int53 = period6.get(durationFieldType47);
        org.joda.time.DurationFieldType[] durationFieldTypeArray54 = period6.getFieldTypes();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray54);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0425");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 1, (-1), (int) (byte) 100, 0, (int) (short) -1, (int) (byte) 10, (int) (short) 1, (int) '#');
        org.joda.time.Period period9 = period8.normalizedStandard();
        org.joda.time.Period period11 = period9.minusYears((int) (short) -1);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0426");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period3 = period1.withSeconds((int) (short) -1);
        org.joda.time.Period period4 = period3.toPeriod();
        org.joda.time.Period period6 = period3.minusMillis((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0427");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) (short) -1);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0428");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Seconds seconds6 = period4.toStandardSeconds();
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(seconds6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0429");
        org.joda.time.Period period1 = org.joda.time.Period.years((-31));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0430");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
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
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(0L, chronology22);
        org.joda.time.Period period25 = period23.minusMillis((int) (short) 0);
        org.joda.time.Period period26 = period4.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period28 = period26.plusMillis((int) (byte) 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0431");
        org.joda.time.Period period3 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType20, chronology21);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType36, chronology37);
        org.joda.time.Period period39 = period22.withPeriodType(periodType36);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6, periodType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType36, chronology41);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0432");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(10L, chronology1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0433");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) period3, chronology5);
        org.joda.time.Period period8 = org.joda.time.Period.days((-100));
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 'a', periodType10, chronology11);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.Hours hours17 = period16.toStandardHours();
        org.joda.time.Period period18 = period12.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period12.withYears(10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period23.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period36.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period36.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Period period48 = period46.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.Period period54 = period52.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.DurationFieldType durationFieldType60 = period58.getFieldType((int) (byte) 0);
        int int61 = period54.indexOf(durationFieldType60);
        int int62 = period46.get(durationFieldType60);
        org.joda.time.Period period64 = period36.withField(durationFieldType60, (int) (short) 0);
        int int65 = period29.indexOf(durationFieldType60);
        int int66 = period20.get(durationFieldType60);
        org.joda.time.Period period68 = period8.withField(durationFieldType60, 0);
        boolean boolean69 = period6.isSupported(durationFieldType60);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0434");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-11));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0435");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.Period period25 = period21.plusMonths(0);
        org.joda.time.Period period27 = period25.plusMonths((int) '#');
        org.joda.time.Period period29 = period25.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType30 = period25.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType30, chronology31);
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
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType46, chronology47);
        org.joda.time.Period period49 = period32.withPeriodType(periodType46);
        org.joda.time.Period period50 = new org.joda.time.Period((int) '#', (int) ' ', 0, (int) (short) -1, 100, (int) (byte) 100, (int) (byte) 0, 97, periodType46);
        org.joda.time.Period period51 = period8.withPeriodType(periodType46);
        org.joda.time.DurationFieldType durationFieldType52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period54 = period51.withField(durationFieldType52, (-31));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0436");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.Period period7 = period5.withYears((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration8 = period7.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0437");
        org.joda.time.Period period4 = new org.joda.time.Period((-31), 8, 10, (int) (short) 10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0438");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getYears();
        org.joda.time.Period period9 = period6.minusHours((int) (byte) -1);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0439");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.Period period14 = org.joda.time.Period.years((int) (short) -1);
        org.joda.time.Period period16 = period14.plusDays((int) '#');
        org.joda.time.Period period18 = period16.minusMonths((int) ' ');
        org.joda.time.Period period20 = org.joda.time.Period.days((-100));
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.Period period24 = period23.normalizedStandard();
        int int25 = period23.getMillis();
        org.joda.time.Period period27 = period23.withHours((int) (byte) 0);
        org.joda.time.Period period29 = period23.withMonths((int) '4');
        org.joda.time.Period period31 = period29.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology34);
        java.lang.String str36 = period35.toString();
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) str36);
        org.joda.time.Period period39 = period37.plusSeconds((int) 'a');
        org.joda.time.Period period41 = period37.plusYears((int) (byte) 0);
        org.joda.time.Period period43 = period37.withMonths(0);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 'a', periodType45, chronology46);
        org.joda.time.Period period49 = period47.withMinutes(0);
        org.joda.time.Period period51 = period49.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod52 = period49.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period55.plusMonths(0);
        org.joda.time.Period period61 = period59.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = period59.toDurationFrom(readableInstant62);
        org.joda.time.Period period65 = period59.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.Period period71 = period69.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.Period period77 = period75.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, readableInstant79, periodType80);
        org.joda.time.DurationFieldType durationFieldType83 = period81.getFieldType((int) (byte) 0);
        int int84 = period77.indexOf(durationFieldType83);
        int int85 = period69.get(durationFieldType83);
        org.joda.time.Period period87 = period59.withField(durationFieldType83, (int) (short) 0);
        int int88 = mutablePeriod52.indexOf(durationFieldType83);
        int int89 = period43.get(durationFieldType83);
        int int90 = period29.get(durationFieldType83);
        org.joda.time.Period period92 = period20.withField(durationFieldType83, 97);
        org.joda.time.Period period94 = period18.withField(durationFieldType83, (-1));
        boolean boolean95 = period12.isSupported(durationFieldType83);
        org.joda.time.Hours hours96 = period12.toStandardHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT-0.011S" + "'", str36, "PT-0.011S");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(mutablePeriod52);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(hours96);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0440");
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
        // The following exception was thrown during execution in test generation
        try {
            int int59 = period11.getValue((-31));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0441");
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
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        int int18 = period14.getMonths();
        org.joda.time.Period period20 = period14.minusHours((int) ' ');
        org.joda.time.Period period22 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period24 = period22.plusMillis((int) 'a');
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
        org.joda.time.Period period39 = period22.withFieldAdded(durationFieldType36, 1);
        org.joda.time.Period period40 = period14.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period42 = period40.plusWeeks((int) (short) -1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0442");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (long) (short) 0, periodType2, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) chronology3, chronology5);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0443");
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) -1);
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
        org.joda.time.Period period25 = period9.minus((org.joda.time.ReadablePeriod) period24);
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
        org.joda.time.Period period50 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType47);
        org.joda.time.Period period51 = new org.joda.time.Period((long) (byte) 10, periodType47);
        org.joda.time.Period period52 = period24.withPeriodType(periodType47);
        org.joda.time.Period period53 = new org.joda.time.Period((int) '4', (int) (byte) 100, (int) (byte) -1, 10, 97, 0, 1, (int) (byte) 0, periodType47);
        int int54 = period53.getSeconds();
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0444");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-31), (long) (short) 10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0445");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period5.withMonths(0);
        org.joda.time.Period period13 = period5.plusWeeks(10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0446");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 100, (long) (-1), chronology3);
        org.joda.time.Period period6 = period4.withHours(0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
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
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType27);
        org.joda.time.Period period32 = period4.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) -1);
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
        org.joda.time.Period period50 = period34.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant61, readableInstant62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period63.toDurationFrom(readableInstant64);
        org.joda.time.Period period67 = period63.plusMonths(0);
        org.joda.time.Period period69 = period67.plusMonths((int) '#');
        org.joda.time.Period period71 = period67.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType72 = period67.getPeriodType();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (short) -1, periodType72, chronology73);
        org.joda.time.Period period75 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType72);
        org.joda.time.Period period76 = new org.joda.time.Period((long) (byte) 10, periodType72);
        org.joda.time.Period period77 = period49.withPeriodType(periodType72);
        org.joda.time.Period period78 = period31.normalizedStandard(periodType72);
        org.joda.time.Period period79 = new org.joda.time.Period(1L, periodType72);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0447");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period3.getMillis();
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
        org.joda.time.Period period52 = period3.minus((org.joda.time.ReadablePeriod) period51);
        int int53 = period3.getWeeks();
        org.joda.time.Period period55 = org.joda.time.Period.months((int) (byte) -1);
        boolean boolean56 = period3.equals((java.lang.Object) period55);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
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
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0448");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Days days8 = period5.toStandardDays();
        java.lang.Class<?> wildcardClass9 = days8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0449");
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
        org.joda.time.Period period76 = new org.joda.time.Period((long) 8, (long) 1, periodType63);
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0450");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationFrom(readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
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
        org.joda.time.Period period37 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType34);
        org.joda.time.Period period38 = new org.joda.time.Period((long) (byte) 10, periodType34);
        org.joda.time.Period period39 = new org.joda.time.Period((int) '#', (-100), (int) (byte) 0, (int) '4', (int) (short) 0, 1, (int) (short) 0, 1, periodType34);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, readableInstant4, periodType34);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0451");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = period2.toString(periodFormatter3);
        org.joda.time.Period period5 = period2.negated();
        int int6 = period5.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0452");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationFrom(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0453");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.Period period11 = period7.plusMinutes((int) (short) 100);
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period11, periodType14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = period15.normalizedStandard(periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = period15.toMutablePeriod();
        int int19 = period15.getMonths();
        org.joda.time.Period period21 = period15.minusHours((int) ' ');
        org.joda.time.Duration duration22 = period21.toStandardDuration();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology25);
        java.lang.String str27 = period26.toString();
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) str27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.Period period39 = period35.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) str27, periodType40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration22, periodType40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.MutablePeriod mutablePeriod51 = period50.toMutablePeriod();
        org.joda.time.Period period52 = period46.plus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant63, readableInstant64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.MutablePeriod mutablePeriod70 = period69.toMutablePeriod();
        org.joda.time.Period period71 = period65.plus((org.joda.time.ReadablePeriod) period69);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.Period period77 = period75.plusMonths((int) '4');
        org.joda.time.Period period78 = period69.withFields((org.joda.time.ReadablePeriod) period77);
        org.joda.time.PeriodType periodType79 = period77.getPeriodType();
        org.joda.time.Period period80 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType79);
        org.joda.time.Period period81 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType79);
        org.joda.time.Period period82 = period50.withPeriodType(periodType79);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant43, periodType79);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT-0.011S" + "'", str27, "PT-0.011S");
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(mutablePeriod70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(period82);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0454");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period8.multipliedBy((int) (short) -1);
        org.joda.time.Period period12 = period8.withHours((-1));
        org.joda.time.Period period13 = period12.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0455");
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
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((java.lang.Object) period11, chronology57);
        org.joda.time.DurationFieldType[] durationFieldTypeArray59 = period58.getFieldTypes();
        org.joda.time.Period period60 = period58.toPeriod();
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
        org.junit.Assert.assertNotNull(durationFieldTypeArray59);
        org.junit.Assert.assertNotNull(period60);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0456");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.joda.time.Period period4 = period2.withDays((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0457");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) -1, (int) (short) -1, 0, (int) (short) 10);
        org.joda.time.Period period6 = period4.plusMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0458");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', (long) 8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0459");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds15 = period14.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period18.plusMonths(0);
        org.joda.time.Period period24 = period18.plusWeeks((int) ' ');
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
        int int60 = period24.indexOf(durationFieldType55);
        int int61 = period14.get(durationFieldType55);
        boolean boolean62 = period5.isSupported(durationFieldType55);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0460");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.Period period16 = period12.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str4, periodType17);
        org.joda.time.Period period20 = period18.plusYears(10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT-0.011S" + "'", str4, "PT-0.011S");
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0461");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.minusDays((int) (short) 0);
        int int9 = period8.getMillis();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0462");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT-0.053S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0463");
        org.joda.time.Period period1 = org.joda.time.Period.days((-100));
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period11 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period5.withYears(10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period16.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period29.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period29.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.Period period41 = period39.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.Period period47 = period45.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.DurationFieldType durationFieldType53 = period51.getFieldType((int) (byte) 0);
        int int54 = period47.indexOf(durationFieldType53);
        int int55 = period39.get(durationFieldType53);
        org.joda.time.Period period57 = period29.withField(durationFieldType53, (int) (short) 0);
        int int58 = period22.indexOf(durationFieldType53);
        int int59 = period13.get(durationFieldType53);
        org.joda.time.Period period61 = period1.withField(durationFieldType53, 0);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) 'a', periodType63, chronology64);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) 'a', periodType67, chronology68);
        org.joda.time.Hours hours70 = period69.toStandardHours();
        org.joda.time.Period period71 = period65.withFields((org.joda.time.ReadablePeriod) period69);
        int int72 = period71.getDays();
        java.lang.Class<?> wildcardClass73 = period71.getClass();
        boolean boolean74 = period61.equals((java.lang.Object) period71);
        org.joda.time.Period period75 = period61.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(hours70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(period75);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0464");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 1, 0L, chronology2);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0465");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Days days6 = period3.toStandardDays();
        org.joda.time.Period period8 = period3.plusSeconds((int) (short) 0);
        org.joda.time.Period period10 = period3.plusMillis((-11));
        org.joda.time.Period period13 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period15 = period13.plusMillis((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period34.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.DurationFieldType durationFieldType58 = period56.getFieldType((int) (byte) 0);
        int int59 = period52.indexOf(durationFieldType58);
        int int60 = period44.get(durationFieldType58);
        org.joda.time.Period period62 = period34.withField(durationFieldType58, (int) (short) 0);
        boolean boolean63 = period27.isSupported(durationFieldType58);
        org.joda.time.Period period65 = period15.withField(durationFieldType58, (int) (short) 100);
        org.joda.time.Period period67 = period10.withField(durationFieldType58, (int) '4');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0466");
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
        org.joda.time.Period period14 = period12.plusSeconds((int) ' ');
        org.joda.time.Period period15 = period14.toPeriod();
        int int16 = period14.size();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0467");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P-1Y35W10DT1H10M-30.990S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0468");
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
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Period period17 = period14.plusDays(1);
        org.joda.time.Period period19 = period14.withDays((int) (short) 1);
        org.joda.time.Duration duration20 = period14.toStandardDuration();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0469");
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
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant69, readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.MutablePeriod mutablePeriod76 = period75.toMutablePeriod();
        org.joda.time.Period period77 = period71.plus((org.joda.time.ReadablePeriod) period75);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, readableInstant79, periodType80);
        org.joda.time.Period period83 = period81.plusMonths((int) '4');
        org.joda.time.Period period84 = period75.withFields((org.joda.time.ReadablePeriod) period83);
        org.joda.time.PeriodType periodType85 = period83.getPeriodType();
        org.joda.time.Period period86 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType85);
        org.joda.time.Period period87 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType85);
        org.joda.time.Period period88 = new org.joda.time.Period(readableInstant57, readableInstant58, periodType85);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((java.lang.Object) period56, periodType85, chronology89);
        org.joda.time.Period period92 = period90.withWeeks((int) 'a');
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
        org.junit.Assert.assertNotNull(mutablePeriod76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(period92);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0470");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = period5.getFieldTypes();
        org.joda.time.Period period34 = period5.minusYears((int) '#');
        org.joda.time.Period period36 = period5.minusMillis((int) (byte) -1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0471");
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Period period14 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.Period period20 = period18.plusMonths((int) '4');
        org.joda.time.Period period21 = period12.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = period20.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', (long) 10, periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 100, 100L, periodType22);
        org.joda.time.Chronology chronology26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) 100L, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0472");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.minusSeconds((int) '#');
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0473");
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
        org.joda.time.Period period16 = period14.plusMillis(0);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0474");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.minusDays(8);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.Hours hours14 = period13.toStandardHours();
        org.joda.time.Period period15 = period9.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period9.withYears(10);
        org.joda.time.Period period18 = period17.toPeriod();
        org.joda.time.Period period20 = period17.plusMillis(1);
        int int21 = period20.getMinutes();
        org.joda.time.Period period22 = period5.minus((org.joda.time.ReadablePeriod) period20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days23 = period22.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0475");
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
        org.joda.time.Period period17 = period15.minusSeconds((int) (byte) 10);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0476");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DurationFieldType[] durationFieldTypeArray18 = period1.getFieldTypes();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldTypeArray18);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0477");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
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
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType19, chronology20);
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
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType35, chronology36);
        org.joda.time.Period period38 = period21.withPeriodType(periodType35);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5, periodType35);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0478");
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) 'a', (int) '4', (int) (short) 1, (int) '#', 8, 0, 0);
        org.joda.time.Period period10 = period8.minusDays(8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0479");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Period period8 = period3.plusMillis((int) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period11.plusMinutes((int) ' ');
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period15);
        org.joda.time.format.PeriodFormatter periodFormatter17 = null;
        java.lang.String str18 = period16.toString(periodFormatter17);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
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
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration33, periodType46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) 100, periodType46, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType46);
        org.joda.time.Period period53 = new org.joda.time.Period((java.lang.Object) str18, periodType46);
        org.joda.time.Period period55 = period53.minusWeeks(100);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.Period period62 = period58.plusMonths(0);
        org.joda.time.Period period64 = period62.plusMonths((int) '#');
        org.joda.time.Period period66 = period62.plusMinutes((int) (short) 100);
        org.joda.time.Period period68 = period66.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType70 = period66.getFieldType((int) (byte) 0);
        org.joda.time.Period period72 = period55.withField(durationFieldType70, 100);
        org.joda.time.Period period74 = period8.withFieldAdded(durationFieldType70, (int) (byte) 1);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT32M" + "'", str18, "PT32M");
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0480");
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
        org.joda.time.Period period20 = period18.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        int int26 = period24.getWeeks();
        int int27 = period24.getSeconds();
        org.joda.time.Period period28 = period18.withFields((org.joda.time.ReadablePeriod) period24);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0481");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0482");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P97W", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.joda.time.format.PeriodFormatter.parsePeriod(String)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0483");
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
        int int32 = period5.getDays();
        org.joda.time.Period period34 = period5.minusDays((int) (short) 10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0484");
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
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 100, (long) (-1), chronology34);
        org.joda.time.Period period37 = period35.withHours(0);
        org.joda.time.Hours hours38 = period35.toStandardHours();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.Period period46 = period35.withPeriodType(periodType45);
        org.joda.time.Period period47 = period19.withPeriodType(periodType45);
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
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0485");
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
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology30);
        java.lang.String str32 = period31.toString();
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) str32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) str32, periodType45);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 'a', periodType48, chronology49);
        org.joda.time.Period period52 = period50.withMinutes(0);
        org.joda.time.Period period54 = period52.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod55 = period52.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.Period period62 = period58.plusMonths(0);
        org.joda.time.Period period64 = period62.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period62.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period62.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.Period period74 = period72.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.Period period80 = period78.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, readableInstant82, periodType83);
        org.joda.time.DurationFieldType durationFieldType86 = period84.getFieldType((int) (byte) 0);
        int int87 = period80.indexOf(durationFieldType86);
        int int88 = period72.get(durationFieldType86);
        org.joda.time.Period period90 = period62.withField(durationFieldType86, (int) (short) 0);
        int int91 = mutablePeriod55.indexOf(durationFieldType86);
        int int92 = period46.get(durationFieldType86);
        int int93 = period3.indexOf(durationFieldType86);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT-0.011S" + "'", str32, "PT-0.011S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0486");
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
        int int28 = period27.getSeconds();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0487");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) '4');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0488");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-100));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0489");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.minusDays((int) (short) 0);
        org.joda.time.Period period10 = period8.plusMillis(10);
        org.joda.time.Period period12 = period10.minusSeconds((-100));
        java.lang.String str13 = period12.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT100.010S" + "'", str13, "PT100.010S");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0490");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.Period period7 = period5.withYears((int) (byte) 100);
        org.joda.time.Period period9 = period7.minusDays((int) '#');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0491");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT1M0.097S");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) "PT1M0.097S", chronology2);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0492");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        org.joda.time.Period period5 = period3.minusSeconds((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period3.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0493");
        org.joda.time.Period period1 = org.joda.time.Period.years(8);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0494");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period12 = period10.minusSeconds(0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0495");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        int int4 = period3.getYears();
        java.lang.Class<?> wildcardClass5 = period3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0496");
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
        org.joda.time.Period period36 = period2.withYears(100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0497");
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
        int int25 = period24.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0498");
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
        org.joda.time.Period period14 = period12.minusHours((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours15 = period12.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0499");
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
        org.joda.time.Period period29 = period27.minusWeeks((int) ' ');
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_039_Regression0.test0500");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = period1.withMonths((int) 'a');
        int int4 = period3.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }
}

