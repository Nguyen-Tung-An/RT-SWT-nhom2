import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_005_Regression0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test001");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test002");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test003");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test004");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test005");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test006");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test007");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test008");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 100, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test009");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test010");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test011");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test012");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test013");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.0d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test014");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test015");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test016");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test017");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999999999999d + "'", double1 == 96.99999999999999d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test018");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(4.9E-324d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test019");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test020");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test021");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test022");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) (short) 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test023");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test024");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test025");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test026");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.99999f + "'", float1 == 99.99999f);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test027");
        double double0 = org.apache.commons.math4.core.jdkmath.AccurateMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test028");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 1, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test029");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(10.0f, (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E10f + "'", float2 == 4.2949673E10f);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test030");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test031");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test032");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test033");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test034");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) (short) 0, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test035");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test036");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test037");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test038");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-1), (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test039");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (short) 10, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test040");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test041");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3.8146973E-6f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test042");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test043");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test044");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test045");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 152 + "'", int2 == 152);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test046");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(0.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test047");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3.8146973E-6f, (float) 1000L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test048");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test049");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test050");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test051");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631011.7651164597d + "'", double1 == 631011.7651164597d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test052");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.4E-45f) + "'", float1 == (-1.4E-45f));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test053");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test054");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test055");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test056");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 3.8146973E-6f, (double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3947966093944364E-6d + "'", double2 == 5.3947966093944364E-6d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test057");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 3, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test058");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(2.718281828459045d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.105399244260575d + "'", double2 == 35.105399244260575d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test059");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 152);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test060");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (short) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test061");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4457272005608357E-47d) + "'", double1 == (-2.4457272005608357E-47d));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test062");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test063");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test064");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test065");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(Double.NEGATIVE_INFINITY, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test066");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test067");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test068");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test069");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 100, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test070");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test071");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test072");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(4.2949673E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0f + "'", float1 == 4096.0f);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test073");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (byte) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test074");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test075");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-2.4457272005608357E-47d), (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.152424001869452E-48d) + "'", double2 == (-8.152424001869452E-48d));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test076");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test077");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test078");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test079");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test080");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226350743220142d + "'", double1 == 0.9226350743220142d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test081");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test082");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test083");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test084");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 10L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test085");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((int) (short) 0, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test086");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test087");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (byte) 0, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test088");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 0.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test089");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(Double.NaN, (double) 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test090");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.99999994f + "'", float1 == 0.99999994f);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test091");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test092");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test093");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (-127), (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test094");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((-8.152424001869452E-48d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.152424001869451E-48d) + "'", double2 == (-8.152424001869451E-48d));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test095");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test096");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (short) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test097");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) '#', (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test098");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-1), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test099");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(Double.NaN, (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test100");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.50637222006591d) + "'", double1 == (-0.50637222006591d));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test101");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test102");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test103");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test104");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test105");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.99999994f, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test106");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 1000L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.600902709541988d + "'", double1 == 7.600902709541988d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test107");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 31L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test108");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 99L + "'", long1 == 99L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test109");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test110");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 10, (-8.152424001869451E-48d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test111");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test112");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test113");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7278759594743862d + "'", double1 == 1.7278759594743862d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test114");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(5.3947966093944364E-6d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.394796609394437E-6d + "'", double2 == 5.394796609394437E-6d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test115");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test116");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test117");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test118");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((-8.152424001869451E-48d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test119");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test120");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 2, (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test121");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-127));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-127L) + "'", long1 == (-127L));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test122");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test123");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test124");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test125");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4095.9998f + "'", float1 == 4095.9998f);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test126");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(152, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252 + "'", int2 == 252);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test127");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-36));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-35L) + "'", long1 == (-35L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test128");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test129");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test130");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test131");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (byte) 0, 152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test132");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-127L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test133");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(100.0f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test134");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test135");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(99.0d, (double) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.0d + "'", double2 == 99.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test136");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) '#', 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3360 + "'", int2 == 3360);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test137");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120441302697d + "'", double1 == 4.615120441302697d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test138");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999999999999996d + "'", double1 == 31.999999999999996d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test139");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (-127));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test140");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.151039979174052E54d + "'", double1 == 7.151039979174052E54d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test141");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test142");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (-127L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test143");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test144");
        double double0 = org.apache.commons.math4.core.jdkmath.AccurateMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test145");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test146");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test147");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27941549819892586d) + "'", double1 == (-0.27941549819892586d));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test148");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.8342233605065102d, (double) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065101d + "'", double2 == 0.8342233605065101d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test149");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test150");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test151");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test152");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test153");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test154");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.4E-45f) + "'", float1 == (-1.4E-45f));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test155");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test156");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(127L, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test157");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(96, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test158");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test159");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test160");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-0.8390715290764524d), (-2.4457272005608357E-47d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test161");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test162");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(99L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test163");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(31L, (long) 252);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-221L) + "'", long2 == (-221L));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test164");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test165");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-36));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test166");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5704510598101804d + "'", double1 == 1.5704510598101804d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test167");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) -1, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test168");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-35L), (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test169");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(11013.232920103323d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2329201033226127d + "'", double2 == 0.2329201033226127d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test170");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test171");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) (byte) 0, 5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test172");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) 1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test173");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485196d) + "'", double1 == (-0.6995216443485196d));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test174");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1.4E-45f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test175");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test176");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E10d + "'", double2 == 1.0E10d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test177");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(0, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test178");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(99L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test179");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 1, 0.2329201033226127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0267676341469947d + "'", double2 == 1.0267676341469947d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test180");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(4.615120441302697d, (double) 31L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120441302697d + "'", double2 == 4.615120441302697d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test181");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test182");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 3, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test183");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test184");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(31L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test185");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 127L, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 254.0f + "'", float2 == 254.0f);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test186");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) '#', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test187");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(7.151039979174052E54d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.151039979174051E54d + "'", double2 == 7.151039979174051E54d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test188");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 4.2949673E10f, (-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963268014022d + "'", double2 == 1.5707963268014022d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test189");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999999f + "'", float1 == 9.999999f);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test190");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2870479599298175d) + "'", double1 == (-0.2870479599298175d));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test191");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-0.50637222006591d), 7.151039979174051E54d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.151039979174051E54d + "'", double2 == 7.151039979174051E54d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test192");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 3L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test193");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test194");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test195");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.8414709848078965d), (-221L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6842480121755888E16d) + "'", double2 == (-3.6842480121755888E16d));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test196");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(10.0d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test197");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 99);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test198");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test199");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(100L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test200");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 4095.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.010913302575805d + "'", double1 == 9.010913302575805d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test201");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265606496E-6d + "'", double1 == 3.814697265606496E-6d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test202");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test203");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test204");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (short) -1, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test205");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-0.8813735870195429d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test206");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test207");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0L, 89L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test208");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.397895272798371d + "'", double1 == 2.397895272798371d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test209");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test210");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test211");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.141592653589793d, (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2664982178518892E-18d + "'", double2 == 1.2664982178518892E-18d);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test212");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test213");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577609798773d + "'", double1 == 57.29577609798773d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test214");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49714987269413385d + "'", double1 == 0.49714987269413385d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test215");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test216");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992068341863537d) + "'", double1 == (-0.9992068341863537d));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test217");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 127, 1.2664982178518892E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.507160263437665d) + "'", double2 == (-8.507160263437665d));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test218");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 97.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test219");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-1L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test220");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test221");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test222");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test223");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43107595064559234d + "'", double1 == 0.43107595064559234d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test224");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test225");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test226");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) ' ', 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test227");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3360, 1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2584991.8192772097d + "'", double2 == 2584991.8192772097d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test228");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-35L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test229");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test230");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(7.151039979174051E54d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test231");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(99.0d, 0.8342233605065101d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2725799002747067d) + "'", double2 == (-0.2725799002747067d));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test232");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(35.105399244260575d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.10539924426057d + "'", double2 == 35.10539924426057d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test233");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 3360);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3361L + "'", long1 == 3361L);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test234");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test235");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.9899924966004454d), (-35L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.421946954983242d) + "'", double2 == (-1.421946954983242d));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test236");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test237");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test238");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9999999999999998d + "'", double1 == 1.9999999999999998d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test239");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test240");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test241");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9999999999999996d + "'", double1 == 2.9999999999999996d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test242");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test243");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (short) 10, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test244");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test245");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 99.99999f, 3360);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test246");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.4E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test247");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0L, (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test248");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9867228626928289d + "'", double1 == 0.9867228626928289d);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test249");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test250");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10491011863382856d) + "'", double1 == (-0.10491011863382856d));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test251");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.999985f + "'", float1 == 99.999985f);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test252");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test253");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(2.397895272798371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.454545454545458d + "'", double1 == 5.454545454545458d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test254");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(9.010913302575805d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11097654215740219d + "'", double2 == 0.11097654215740219d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test255");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 252, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 252.0f + "'", float2 == 252.0f);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test256");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 1000L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test257");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-0.9992068341863537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5421489906918573d + "'", double1 == 1.5421489906918573d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test258");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) (-1), 5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test259");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (byte) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test260");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(57.29577609798773d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.229124373596866E-224d + "'", double2 == 5.229124373596866E-224d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test261");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-0.50637222006591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test262");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test263");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 3361L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test264");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999854481d + "'", double1 == 0.9999999999854481d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test265");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test266");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test267");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999999999999996d + "'", double1 == 31.999999999999996d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test268");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.2329201033226127d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test269");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(33, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test270");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(9.999999f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test271");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(35.105399244260575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.81152709771016E14d + "'", double1 == 8.81152709771016E14d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test272");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(152, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test273");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.2664982178518892E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test274");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 89L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test275");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(57.29577609798773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test276");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.99999999999999d + "'", double1 == 51.99999999999999d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test277");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.0f, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test278");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test279");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7949577687638787d) + "'", double1 == (-0.7949577687638787d));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test280");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test281");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(31.999999999999996d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test282");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(99L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test283");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(99.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992068341863537d) + "'", double1 == (-0.9992068341863537d));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test284");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979694d + "'", double1 == 2.9982229502979694d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test285");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(1.5707963268014022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test286");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test287");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test288");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 252, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 252.0f + "'", float2 == 252.0f);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test289");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 101);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 101.0f + "'", float1 == 101.0f);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test290");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test291");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.43107595064559234d, 1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1858264752250012d + "'", double2 == 0.1858264752250012d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test292");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test293");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 10.0f, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1d + "'", double2 == 0.1d);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test294");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 52, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test295");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) (-12));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2894284851066637d) + "'", double1 == (-2.2894284851066637d));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test296");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test297");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(5.394796609394437E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609394437E-6d + "'", double1 == 5.394796609394437E-6d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test298");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test299");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2548062764226884d + "'", double1 == 1.2548062764226884d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test300");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 97.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test301");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.2329201033226127d, (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.432576789051176d + "'", double2 == 18.432576789051176d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test302");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) '#', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test303");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(3, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3363 + "'", int2 == 3363);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test304");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) ' ', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test305");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(3, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test306");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(10, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1013) + "'", int2 == (-1013));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test307");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320666d + "'", double1 == 1.8184464592320666d);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test308");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (-221L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test309");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test310");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 3072.0f, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.000048170405d + "'", double2 == 3072.000048170405d);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test311");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test312");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test313");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test314");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test315");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.17011361997944d) + "'", double1 == (-31.17011361997944d));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test316");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 3, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test317");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test318");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) ' ', (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test319");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test320");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 31L, 254.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test321");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 33, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4886096985958848d + "'", double2 == 1.4886096985958848d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test322");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6557942026326724d + "'", double1 == 0.6557942026326724d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test323");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test324");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test325");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(100L, (long) 1120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test326");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.11097654215740219d, 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test327");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test328");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-0.10491011863382856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10491011863382857d) + "'", double1 == (-0.10491011863382857d));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test329");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test330");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-0.50637222006591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063722200659099d) + "'", double1 == (-0.5063722200659099d));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test331");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 52.0f, 9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.000000000000007d + "'", double2 == 2.000000000000007d);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test332");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test333");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(0.7853981633974483d, (double) 127L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006184158670580004d + "'", double2 == 0.006184158670580004d);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test334");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test335");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test336");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test337");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 52, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test338");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test339");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(0.6557942026326724d, 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6766525823045269d + "'", double2 == 1.6766525823045269d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test340");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test341");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.49714987269413385d, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2947553997329484d + "'", double2 == 3.2947553997329484d);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test342");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test343");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609446773E-6d + "'", double1 == 5.394796609446773E-6d);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test344");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1023), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1024) + "'", int2 == (-1024));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test345");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test346");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 101L + "'", long1 == 101L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test347");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 254.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.404833716619938d + "'", double1 == 2.404833716619938d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test348");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-31.17011361997944d), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.9512813239549044E31d) + "'", double2 == (-3.9512813239549044E31d));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test349");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test350");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test351");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test352");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 52, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test353");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-0.7949577687638787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test354");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(0.11097654215740219d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test355");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test356");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test357");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.476649250079015d) + "'", double1 == (-12.476649250079015d));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test358");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test359");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-3), 31.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test360");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.8390715290764524d), (long) (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.987486442376865E77d) + "'", double2 == (-8.987486442376865E77d));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test361");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1024));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test362");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(89L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91047L) + "'", long2 == (-91047L));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test363");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.397895272798371d, 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.787662199743643d + "'", double2 == 13.787662199743643d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test364");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) 'a', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test365");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test366");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 96);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.923458286012058E41d + "'", double1 == 4.923458286012058E41d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test367");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test368");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test369");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test370");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(0.9226350743220142d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9226350743220142d + "'", double2 == 0.9226350743220142d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test371");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test372");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (byte) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test373");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 96);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 95L + "'", long1 == 95L);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test374");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test375");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-91047L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 91047.0f + "'", float1 == 91047.0f);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test376");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-221L), 1.5421489906918573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5638183903210896d) + "'", double2 == (-1.5638183903210896d));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test377");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(91047.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test378");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (short) 100, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 227 + "'", int2 == 227);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test379");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.11097654215740219d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11097654215740219d + "'", double2 == 0.11097654215740219d);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test380");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(10.000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test381");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-91047L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91049L) + "'", long2 == (-91049L));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test382");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18125409412719368d) + "'", double1 == (-0.18125409412719368d));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test383");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) ' ', (-8.152424001869452E-48d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test384");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3363, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test385");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test386");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1013));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1013 + "'", int1 == 1013);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test387");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-91049L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1589.1048306483171d) + "'", double1 == (-1589.1048306483171d));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test388");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(100L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-200L) + "'", long2 == (-200L));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test389");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) '4', (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test390");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (-2), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test391");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-8.152424001869452E-48d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test392");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test393");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((-0.8414709848078965d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test394");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(3363, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test395");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 1, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test396");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(1.4886096985958848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17278084418222234d + "'", double1 == 0.17278084418222234d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test397");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (-1024), (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1151L) + "'", long2 == (-1151L));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test398");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(Double.NaN, (long) 33);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test399");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(35.10539924426057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8536306738324039d) + "'", double1 == (-0.8536306738324039d));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test400");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3360);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3360 + "'", int1 == 3360);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test401");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(7.600902709541988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25038599000323114d + "'", double1 == 0.25038599000323114d);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test402");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-0.8536306738324039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014898665854393249d) + "'", double1 == (-0.014898665854393249d));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test403");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(0.43107595064559234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test404");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(32, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test405");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 97, (double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91047.0d + "'", double2 == 91047.0d);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test406");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test407");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test408");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49824130708557135d) + "'", double1 == (-0.49824130708557135d));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test409");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test410");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test411");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(631011.7651164597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test412");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 6, 0.17278084418222234d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test413");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 95L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test414");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) -1, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test415");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 101.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.99999999999999d + "'", double1 == 100.99999999999999d);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test416");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004455d) + "'", double1 == (-0.9899924966004455d));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test417");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test418");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (byte) 0, 254.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test419");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test420");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(89L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test421");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test422");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-0.5440211108893698d), 0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6925076809349759d) + "'", double2 == (-0.6925076809349759d));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test423");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(96.99999999999999d, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.374241268949272E19d + "'", double2 == 7.374241268949272E19d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test424");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(6.691673596021348E41d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test425");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((-0.9899924966004455d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test426");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-12), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test427");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 252.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3841381659328928E109d + "'", double1 == 1.3841381659328928E109d);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test428");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test429");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(3.814697265606496E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test430");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 2, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test431");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test432");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test433");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test434");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.444788742025d + "'", double1 == 22026.444788742025d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test435");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test436");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(1.4886096985958848d, 96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.488609698595885d + "'", double2 == 1.488609698595885d);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test437");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test438");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-1L), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test439");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test440");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (short) 1, (long) 127);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test441");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-3), (double) (-1151L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test442");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(3.2947553997329484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test443");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 227);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test444");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test445");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.8390715290764524d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test446");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((-0.10491011863382856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test447");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 1L, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test448");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 252);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 252.0f + "'", float1 == 252.0f);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test449");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-1), (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3361L) + "'", long2 == (-3361L));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test450");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.49714987269413385d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test451");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 3395);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5308397786165204d + "'", double1 == 3.5308397786165204d);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test452");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (-3), 101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-303L) + "'", long2 == (-303L));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test453");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-91047L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test454");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(8L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test455");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 3072.0f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.0d + "'", double2 == 3072.0d);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test456");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test457");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 227);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 227.0f + "'", float1 == 227.0f);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test458");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(4.923458286012058E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test459");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(100, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test460");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test461");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5672.28217179515d + "'", double1 == 5672.28217179515d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test462");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (byte) -1, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test463");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test464");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(3363, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test465");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 3361L, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3361.0d) + "'", double2 == (-3361.0d));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test466");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-0.2725799002747067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26602380077804594d) + "'", double1 == (-0.26602380077804594d));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test467");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test468");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3361L, (-11));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.617507722608334E-39d + "'", double2 == 1.617507722608334E-39d);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test469");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 227, (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 227L + "'", long2 == 227L);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test470");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test471");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (byte) -1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test472");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test473");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6574544541530771d + "'", double1 == 1.6574544541530771d);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test474");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 9L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test475");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test476");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test477");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-127), 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test478");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(9.999999999999998d, (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.401298464324817E-45d + "'", double2 == 1.401298464324817E-45d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test479");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-36), 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test480");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(99, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 396 + "'", int2 == 396);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test481");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (-35), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-70L) + "'", long2 == (-70L));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test482");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test483");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.030084094267563d + "'", double1 == 8.030084094267563d);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test484");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-221L), 152);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test485");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test486");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(100.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560895660206908d + "'", double1 == 1.560895660206908d);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test487");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1.7278759594743862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03015712455888415d + "'", double1 == 0.03015712455888415d);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test488");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 100, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test489");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 96);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test490");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, (double) 96);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test491");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 3360);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3360.0002f + "'", float1 == 3360.0002f);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test492");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((-3.9512813239549044E31d), 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test493");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 5, (-35L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368E-25d + "'", double2 == 3.4359738368E-25d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test494");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test495");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(101, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test496");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 3360, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10080L) + "'", long2 == (-10080L));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test497");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (-127L), 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6099163E32f) + "'", float2 == (-1.6099163E32f));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test498");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91047.0d + "'", double1 == 91047.0d);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test499");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.1d, (long) 1013);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_005_Regression0.test500");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(91047.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

