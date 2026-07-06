import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_055_Regression0 {

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
            System.out.format("%n%s%n", "JA_055_Regression0.test0001");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0002");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0003");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0004");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0005");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0006");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0007");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0008");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 100, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0009");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0010");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0011");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0012");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0013");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-1.0d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0014");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0015");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0016");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0017");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999999999999d + "'", double1 == 96.99999999999999d);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0018");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(4.9E-324d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0019");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0020");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0021");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0022");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) (short) 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0023");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0024");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0025");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0026");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.99999f + "'", float1 == 99.99999f);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0027");
        double double0 = org.apache.commons.math4.core.jdkmath.AccurateMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0028");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 1, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0029");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(10.0f, (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E10f + "'", float2 == 4.2949673E10f);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0030");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0031");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0032");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0033");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0034");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) (short) 0, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0035");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0036");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0037");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0038");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-1), (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0039");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (short) 10, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0040");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0041");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3.8146973E-6f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0042");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0043");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0044");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0045");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 152 + "'", int2 == 152);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0046");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(0.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0047");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3.8146973E-6f, (float) 1000L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0048");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0049");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0050");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0051");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631011.7651164597d + "'", double1 == 631011.7651164597d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0052");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.4E-45f) + "'", float1 == (-1.4E-45f));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0053");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0054");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0055");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0056");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 3.8146973E-6f, (double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3947966093944364E-6d + "'", double2 == 5.3947966093944364E-6d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0057");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 3, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0058");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(2.718281828459045d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.105399244260575d + "'", double2 == 35.105399244260575d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0059");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 152);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0060");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (short) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0061");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4457272005608357E-47d) + "'", double1 == (-2.4457272005608357E-47d));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0062");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0063");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0064");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0065");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(Double.NEGATIVE_INFINITY, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0066");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0067");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0068");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0069");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 100, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0070");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0071");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0072");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(4.2949673E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0f + "'", float1 == 4096.0f);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0073");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (byte) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0074");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0075");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-2.4457272005608357E-47d), (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.152424001869452E-48d) + "'", double2 == (-8.152424001869452E-48d));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0076");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0077");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0078");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0079");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0080");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226350743220142d + "'", double1 == 0.9226350743220142d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0081");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0082");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0083");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0084");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 10L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0085");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((int) (short) 0, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0086");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0087");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (byte) 0, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0088");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 0.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0089");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(Double.NaN, (double) 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0090");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.99999994f + "'", float1 == 0.99999994f);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0091");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0092");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0093");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (-127), (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0094");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((-8.152424001869452E-48d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.152424001869451E-48d) + "'", double2 == (-8.152424001869451E-48d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0095");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0096");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (short) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0097");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) '#', (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0098");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-1), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0099");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(Double.NaN, (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0100");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.50637222006591d) + "'", double1 == (-0.50637222006591d));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0101");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0102");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0103");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0104");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0105");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.99999994f, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0106");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 1000L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.600902709541988d + "'", double1 == 7.600902709541988d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0107");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 31L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0108");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 99L + "'", long1 == 99L);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0109");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0110");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) 10, (-8.152424001869451E-48d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0111");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0112");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0113");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7278759594743862d + "'", double1 == 1.7278759594743862d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0114");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(5.3947966093944364E-6d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.394796609394437E-6d + "'", double2 == 5.394796609394437E-6d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0115");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0116");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0117");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0118");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((-8.152424001869451E-48d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0119");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0120");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 2, (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0121");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-127));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-127L) + "'", long1 == (-127L));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0122");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0123");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0124");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0125");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4095.9998f + "'", float1 == 4095.9998f);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0126");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(152, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252 + "'", int2 == 252);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0127");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-36));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-35L) + "'", long1 == (-35L));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0128");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0129");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0130");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0131");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (byte) 0, 152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0132");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-127L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0133");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(100.0f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0134");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0135");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(99.0d, (double) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.0d + "'", double2 == 99.0d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0136");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) '#', 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3360 + "'", int2 == 3360);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0137");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120441302697d + "'", double1 == 4.615120441302697d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0138");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999999999999996d + "'", double1 == 31.999999999999996d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0139");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (-127));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0140");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.151039979174052E54d + "'", double1 == 7.151039979174052E54d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0141");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0142");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (-127L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0143");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0144");
        double double0 = org.apache.commons.math4.core.jdkmath.AccurateMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0145");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0146");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0147");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27941549819892586d) + "'", double1 == (-0.27941549819892586d));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0148");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.8342233605065102d, (double) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065101d + "'", double2 == 0.8342233605065101d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0149");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0150");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0151");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0152");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0153");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0154");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.4E-45f) + "'", float1 == (-1.4E-45f));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0155");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0156");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(127L, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0157");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(96, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0158");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0159");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0160");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-0.8390715290764524d), (-2.4457272005608357E-47d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0161");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0162");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(99L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0163");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(31L, (long) 252);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-221L) + "'", long2 == (-221L));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0164");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0165");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-36));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0166");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5704510598101804d + "'", double1 == 1.5704510598101804d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0167");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) -1, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0168");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (-35L), (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0169");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(11013.232920103323d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2329201033226127d + "'", double2 == 0.2329201033226127d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0170");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0171");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((double) (byte) 0, 5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0172");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (short) 1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0173");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485196d) + "'", double1 == (-0.6995216443485196d));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0174");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1.4E-45f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0175");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(1L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0176");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E10d + "'", double2 == 1.0E10d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0177");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(0, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0178");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(99L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0179");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 1, 0.2329201033226127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0267676341469947d + "'", double2 == 1.0267676341469947d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0180");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(4.615120441302697d, (double) 31L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120441302697d + "'", double2 == 4.615120441302697d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0181");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0182");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 3, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0183");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0184");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(31L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0185");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 127L, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 254.0f + "'", float2 == 254.0f);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0186");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) '#', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0187");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(7.151039979174052E54d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.151039979174051E54d + "'", double2 == 7.151039979174051E54d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0188");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 4.2949673E10f, (-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963268014022d + "'", double2 == 1.5707963268014022d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0189");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999999f + "'", float1 == 9.999999f);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0190");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2870479599298175d) + "'", double1 == (-0.2870479599298175d));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0191");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-0.50637222006591d), 7.151039979174051E54d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.151039979174051E54d + "'", double2 == 7.151039979174051E54d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0192");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 3L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0193");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0194");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0195");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.8414709848078965d), (-221L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6842480121755888E16d) + "'", double2 == (-3.6842480121755888E16d));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0196");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(10.0d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0197");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 99);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0198");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0199");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(100L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0200");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 4095.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.010913302575805d + "'", double1 == 9.010913302575805d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0201");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265606496E-6d + "'", double1 == 3.814697265606496E-6d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0202");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0203");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0204");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) (short) -1, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0205");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-0.8813735870195429d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0206");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0207");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0L, 89L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0208");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.397895272798371d + "'", double1 == 2.397895272798371d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0209");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0210");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0211");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(3.141592653589793d, (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2664982178518892E-18d + "'", double2 == 1.2664982178518892E-18d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0212");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0213");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577609798773d + "'", double1 == 57.29577609798773d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0214");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49714987269413385d + "'", double1 == 0.49714987269413385d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0215");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0216");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992068341863537d) + "'", double1 == (-0.9992068341863537d));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0217");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 127, 1.2664982178518892E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.507160263437665d) + "'", double2 == (-8.507160263437665d));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0218");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 97.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0219");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-1L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0220");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0221");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0222");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0223");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43107595064559234d + "'", double1 == 0.43107595064559234d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0224");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0225");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0226");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) ' ', 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0227");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3360, 1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2584991.8192772097d + "'", double2 == 2584991.8192772097d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0228");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) (-35L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0229");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0230");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(7.151039979174051E54d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0231");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(99.0d, 0.8342233605065101d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2725799002747067d) + "'", double2 == (-0.2725799002747067d));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0232");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(35.105399244260575d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.10539924426057d + "'", double2 == 35.10539924426057d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0233");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 3360);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3361L + "'", long1 == 3361L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0234");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0235");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.9899924966004454d), (-35L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.421946954983242d) + "'", double2 == (-1.421946954983242d));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0236");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0237");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0238");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9999999999999998d + "'", double1 == 1.9999999999999998d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0239");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0240");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0241");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9999999999999996d + "'", double1 == 2.9999999999999996d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0242");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0243");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) (short) 10, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0244");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0245");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 99.99999f, 3360);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0246");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.4E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0247");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0L, (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0248");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9867228626928289d + "'", double1 == 0.9867228626928289d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0249");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0250");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10491011863382856d) + "'", double1 == (-0.10491011863382856d));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0251");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.999985f + "'", float1 == 99.999985f);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0252");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0253");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(2.397895272798371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.454545454545458d + "'", double1 == 5.454545454545458d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0254");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(9.010913302575805d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11097654215740219d + "'", double2 == 0.11097654215740219d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0255");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 252, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 252.0f + "'", float2 == 252.0f);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0256");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 1000L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0257");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-0.9992068341863537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5421489906918573d + "'", double1 == 1.5421489906918573d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0258");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) (-1), 5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0259");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (byte) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0260");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(57.29577609798773d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.229124373596866E-224d + "'", double2 == 5.229124373596866E-224d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0261");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-0.50637222006591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0262");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0263");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 3361L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0264");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999854481d + "'", double1 == 0.9999999999854481d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0265");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0266");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0267");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999999999999996d + "'", double1 == 31.999999999999996d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0268");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.2329201033226127d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0269");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(33, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0270");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(9.999999f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0271");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(35.105399244260575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.81152709771016E14d + "'", double1 == 8.81152709771016E14d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0272");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(152, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0273");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(1.2664982178518892E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0274");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 89L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0275");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(57.29577609798773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0276");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.99999999999999d + "'", double1 == 51.99999999999999d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0277");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.0f, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0278");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0279");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7949577687638787d) + "'", double1 == (-0.7949577687638787d));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0280");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0281");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(31.999999999999996d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0282");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(99L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0283");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(99.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992068341863537d) + "'", double1 == (-0.9992068341863537d));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0284");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979694d + "'", double1 == 2.9982229502979694d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0285");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(1.5707963268014022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0286");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0287");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0288");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 252, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 252.0f + "'", float2 == 252.0f);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0289");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 101);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 101.0f + "'", float1 == 101.0f);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0290");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0291");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.43107595064559234d, 1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1858264752250012d + "'", double2 == 0.1858264752250012d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0292");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0293");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 10.0f, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1d + "'", double2 == 0.1d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0294");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 52, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0295");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) (-12));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2894284851066637d) + "'", double1 == (-2.2894284851066637d));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0296");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0297");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(5.394796609394437E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609394437E-6d + "'", double1 == 5.394796609394437E-6d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0298");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0299");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2548062764226884d + "'", double1 == 1.2548062764226884d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0300");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 97.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0301");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.2329201033226127d, (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.432576789051176d + "'", double2 == 18.432576789051176d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0302");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) '#', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120 + "'", int2 == 1120);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0303");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(3, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3363 + "'", int2 == 3363);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0304");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) ' ', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0305");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(3, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0306");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(10, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1013) + "'", int2 == (-1013));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0307");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320666d + "'", double1 == 1.8184464592320666d);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0308");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (-221L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0309");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0310");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 3072.0f, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.000048170405d + "'", double2 == 3072.000048170405d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0311");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0312");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0313");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0314");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0315");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.17011361997944d) + "'", double1 == (-31.17011361997944d));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0316");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 3, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0317");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0318");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) ' ', (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0319");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0320");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 31L, 254.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0321");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 33, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4886096985958848d + "'", double2 == 1.4886096985958848d);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0322");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6557942026326724d + "'", double1 == 0.6557942026326724d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0323");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0324");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0325");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(100L, (long) 1120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0326");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.11097654215740219d, 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0327");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0328");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-0.10491011863382856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10491011863382857d) + "'", double1 == (-0.10491011863382857d));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0329");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0330");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-0.50637222006591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063722200659099d) + "'", double1 == (-0.5063722200659099d));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0331");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 52.0f, 9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.000000000000007d + "'", double2 == 2.000000000000007d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0332");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0333");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(0.7853981633974483d, (double) 127L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006184158670580004d + "'", double2 == 0.006184158670580004d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0334");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.0d, (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0335");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0336");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 52, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0338");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0339");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(0.6557942026326724d, 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6766525823045269d + "'", double2 == 1.6766525823045269d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0340");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0341");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.49714987269413385d, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2947553997329484d + "'", double2 == 3.2947553997329484d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0342");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0343");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(5.3947966093944364E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.394796609446773E-6d + "'", double1 == 5.394796609446773E-6d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0344");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1023), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1024) + "'", int2 == (-1024));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0345");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0346");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 101L + "'", long1 == 101L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0347");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 254.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.404833716619938d + "'", double1 == 2.404833716619938d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0348");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-31.17011361997944d), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.9512813239549044E31d) + "'", double2 == (-3.9512813239549044E31d));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0349");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0350");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0351");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0352");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 52, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0353");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-0.7949577687638787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0354");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(0.11097654215740219d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0355");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0356");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0357");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.476649250079015d) + "'", double1 == (-12.476649250079015d));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0358");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0359");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-3), 31.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0360");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.8390715290764524d), (long) (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.987486442376865E77d) + "'", double2 == (-8.987486442376865E77d));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0361");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1024));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0362");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(89L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91047L) + "'", long2 == (-91047L));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0363");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(2.397895272798371d, 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.787662199743643d + "'", double2 == 13.787662199743643d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0364");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) 'a', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0365");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0366");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 96);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.923458286012058E41d + "'", double1 == 4.923458286012058E41d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0367");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(1.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0369");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0370");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(0.9226350743220142d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9226350743220142d + "'", double2 == 0.9226350743220142d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0371");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0372");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (byte) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0373");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) 96);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 95L + "'", long1 == 95L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0374");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0375");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-91047L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 91047.0f + "'", float1 == 91047.0f);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0376");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-221L), 1.5421489906918573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5638183903210896d) + "'", double2 == (-1.5638183903210896d));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0377");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(91047.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0378");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (short) 100, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 227 + "'", int2 == 227);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0379");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.11097654215740219d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11097654215740219d + "'", double2 == 0.11097654215740219d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0380");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(10.000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0381");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-91047L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-91049L) + "'", long2 == (-91049L));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0382");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18125409412719368d) + "'", double1 == (-0.18125409412719368d));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0383");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) ' ', (-8.152424001869452E-48d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0384");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(3363, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0385");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0386");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1013));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1013 + "'", int1 == 1013);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0387");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) (-91049L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1589.1048306483171d) + "'", double1 == (-1589.1048306483171d));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0388");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(100L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-200L) + "'", long2 == (-200L));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0389");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) '4', (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0390");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (-2), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0391");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-8.152424001869452E-48d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0392");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0393");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((-0.8414709848078965d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0394");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(3363, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0395");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 1, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0396");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(1.4886096985958848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17278084418222234d + "'", double1 == 0.17278084418222234d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0397");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) (-1024), (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1151L) + "'", long2 == (-1151L));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0398");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(Double.NaN, (long) 33);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0399");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(35.10539924426057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8536306738324039d) + "'", double1 == (-0.8536306738324039d));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0400");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3360);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3360 + "'", int1 == 3360);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0401");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(7.600902709541988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25038599000323114d + "'", double1 == 0.25038599000323114d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0402");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-0.8536306738324039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014898665854393249d) + "'", double1 == (-0.014898665854393249d));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0403");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(0.43107595064559234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0404");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(32, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0405");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((double) 97, (double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91047.0d + "'", double2 == 91047.0d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0406");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0407");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0408");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49824130708557135d) + "'", double1 == (-0.49824130708557135d));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0409");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0410");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0411");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(631011.7651164597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0412");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 6, 0.17278084418222234d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0413");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 95L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0414");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) -1, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0415");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 101.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.99999999999999d + "'", double1 == 100.99999999999999d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0416");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004455d) + "'", double1 == (-0.9899924966004455d));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0417");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0418");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (byte) 0, 254.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0419");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0420");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(89L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0421");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0422");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-0.5440211108893698d), 0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6925076809349759d) + "'", double2 == (-0.6925076809349759d));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0423");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(96.99999999999999d, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.374241268949272E19d + "'", double2 == 7.374241268949272E19d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0424");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(6.691673596021348E41d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0425");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((-0.9899924966004455d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0426");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-12), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0427");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 252.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3841381659328928E109d + "'", double1 == 1.3841381659328928E109d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0428");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0429");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(3.814697265606496E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0430");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 2, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0431");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0432");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0433");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0434");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.444788742025d + "'", double1 == 22026.444788742025d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0435");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0436");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(1.4886096985958848d, 96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.488609698595885d + "'", double2 == 1.488609698595885d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0437");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0438");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-1L), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0439");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0440");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (short) 1, (long) 127);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0441");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) (-3), (double) (-1151L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0442");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(3.2947553997329484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0443");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 227);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0444");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0445");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((-0.8390715290764524d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0446");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((-0.10491011863382856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0447");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) 1L, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0448");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 252);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 252.0f + "'", float1 == 252.0f);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0449");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-1), (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3361L) + "'", long2 == (-3361L));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0450");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.49714987269413385d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0451");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 3395);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5308397786165204d + "'", double1 == 3.5308397786165204d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0452");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (-3), 101L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-303L) + "'", long2 == (-303L));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0453");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((double) (-91047L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0454");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(8L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0455");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) 3072.0f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.0d + "'", double2 == 3072.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0456");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0457");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 227);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 227.0f + "'", float1 == 227.0f);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0458");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(4.923458286012058E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0459");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(100, 3360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0460");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0461");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 99);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5672.28217179515d + "'", double1 == 5672.28217179515d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0462");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (byte) -1, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0463");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0464");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(3363, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0465");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) 3361L, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3361.0d) + "'", double2 == (-3361.0d));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0466");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-0.2725799002747067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26602380077804594d) + "'", double1 == (-0.26602380077804594d));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0467");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0468");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 3361L, (-11));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.617507722608334E-39d + "'", double2 == 1.617507722608334E-39d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0469");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 227, (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 227L + "'", long2 == 227L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0470");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0471");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (byte) -1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0472");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0473");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6574544541530771d + "'", double1 == 1.6574544541530771d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0474");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((double) 9L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0475");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0476");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0477");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-127), 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0478");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(9.999999999999998d, (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.401298464324817E-45d + "'", double2 == 1.401298464324817E-45d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0479");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-36), 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0480");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(99, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 396 + "'", int2 == 396);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0481");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (-35), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-70L) + "'", long2 == (-70L));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0482");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0483");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log((double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.030084094267563d + "'", double1 == 8.030084094267563d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0484");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-221L), 152);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0485");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0486");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(100.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560895660206908d + "'", double1 == 1.560895660206908d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0487");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1.7278759594743862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03015712455888415d + "'", double1 == 0.03015712455888415d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0488");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((int) (byte) 100, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0489");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 96);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0490");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(0.0d, (double) 96);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0491");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 3360);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3360.0002f + "'", float1 == 3360.0002f);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0492");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((-3.9512813239549044E31d), 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0493");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 5, (-35L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368E-25d + "'", double2 == 3.4359738368E-25d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0494");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0495");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(101, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0496");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 3360, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10080L) + "'", long2 == (-10080L));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0497");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (-127L), 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6099163E32f) + "'", float2 == (-1.6099163E32f));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0498");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 91047.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91047.0d + "'", double1 == 91047.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0499");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(0.1d, (long) 1013);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_055_Regression0.test0500");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(91047.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

