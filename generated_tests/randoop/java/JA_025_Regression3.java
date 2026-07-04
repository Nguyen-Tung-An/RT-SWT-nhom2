import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_025_Regression3 {

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
            System.out.format("%n%s%n", "JA_025_Regression3.test1501");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((-101129L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-101128L) + "'", long1 == (-101128L));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1502");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(0.7435938375035029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1503");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-91040L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1504");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((float) 1024, (float) (-146177));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1505");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact(3363L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3363 + "'", int1 == 3363);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1506");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(3363, 3358);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1507");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) 101L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1508");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.0f, (float) 127L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1509");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(3396, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3401 + "'", int2 == 3401);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1510");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(30.0d, (double) (-91047));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1511");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(0.015624999999974735d, 2.0000000000000075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015624999999974735d + "'", double2 == 0.015624999999974735d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1512");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1513");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1023), 152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-871) + "'", int2 == (-871));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1514");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(0.5755576643364693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9575104019432289d + "'", double1 == 0.9575104019432289d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1515");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(1040.7943593705909d, (double) 226.99998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1065.2614193568397d + "'", double2 == 1065.2614193568397d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1516");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(1.5704510598101804d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1517");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 6, (long) (-1013));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1007L) + "'", long2 == (-1007L));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1518");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(12.041594588692089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84833.637195194d + "'", double1 == 84833.637195194d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1519");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.11097654215740219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1109765421574022d + "'", double1 == 0.1109765421574022d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1520");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-90788), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1521");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) (-1151L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5699275172828289d) + "'", double1 == (-1.5699275172828289d));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1522");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 648, 96L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 744L + "'", long2 == 744L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1523");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1524");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(3.469519831558414E-4d, (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.00000000188087d + "'", double2 == 32.00000000188087d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1525");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1526");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (-1014));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1527");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 1424L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1528");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59155902616465d + "'", double1 == 114.59155902616465d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1529");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (-1013L), 1023.9999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1013.0d) + "'", double2 == (-1013.0d));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1530");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((int) (short) 1, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1531");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(31.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1532");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(0.9835877454343449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5239998961367942d + "'", double1 == 1.5239998961367942d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1533");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 99.999985f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99998474121092d + "'", double1 == 99.99998474121092d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1534");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(0, (-13444));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1535");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.5103259118461393E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.510325911846128E-7d + "'", double1 == 1.510325911846128E-7d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1536");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-9L), 175262256L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175262256L + "'", long2 == 175262256L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1537");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1538");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1539");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.0625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7866188121086977d + "'", double1 == 0.7866188121086977d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1540");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000002f + "'", float1 == 1.0000002f);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1541");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-91049.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0078125f + "'", float1 == 0.0078125f);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1542");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((-0.6077178770248709d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8209532363056178d + "'", double1 == 0.8209532363056178d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1543");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4651773501465964d + "'", double1 == 0.4651773501465964d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1544");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) (-1154.0f), (double) 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1154.0d) + "'", double2 == (-1154.0d));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1545");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-10.0f), (float) 1014);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1546");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees((double) (-31L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1776.169164905552d) + "'", double1 == (-1776.169164905552d));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1547");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(1.5385494443596428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994801143396996d + "'", double1 == 0.9994801143396996d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1548");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.000004f + "'", float1 == 36.000004f);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1549");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(12L, (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24L) + "'", long2 == (-24L));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1550");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-14.544313390449707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1551");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(8L, (long) 227);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-219L) + "'", long2 == (-219L));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1552");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((-10.000000000000002d), 0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.568054776885421d) + "'", double2 == (-1.568054776885421d));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1553");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-1013), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1554");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-127), (double) 3428);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.99999f) + "'", float2 == (-126.99999f));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1555");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(1.5239998961367942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.404194527574276d + "'", double1 == 2.404194527574276d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1556");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-871));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 871 + "'", int1 == 871);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1557");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh((double) 1013.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.614805547662854d + "'", double1 == 7.614805547662854d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1558");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) '#', (long) (-32739));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32704L) + "'", long2 == (-32704L));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1559");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((-0.5477292602242684d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1560");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(1008);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1007 + "'", int1 == 1007);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1561");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((double) (-0.0f), (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1562");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(22026.465794806754d, (double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.465794806754d + "'", double2 == 22026.465794806754d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1563");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-91037L), (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-91037.0f) + "'", float2 == (-91037.0f));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1564");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.157920892373162E85d, 3395L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1565");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1566");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(63L, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1567");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) 48, 3360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1568");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03490658503988659d + "'", double1 == 0.03490658503988659d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1569");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1570");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (-127), 696L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 696L + "'", long2 == 696L);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1571");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1572");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(0L, (long) 1008);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1573");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(630L, (-149L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1574");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(21L, 696L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14616L + "'", long2 == 14616L);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1575");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(36L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1576");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(18.432576789051176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2655860518246536d + "'", double1 == 1.2655860518246536d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1577");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 3358.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3357.9999999999995d + "'", double1 == 3357.9999999999995d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1578");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(227.0d, 5.429345628954441d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.429345628954441d + "'", double2 == 5.429345628954441d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1579");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4342944819032518d + "'", double1 == 0.4342944819032518d);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1580");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1581");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 127.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2165681500327987d + "'", double1 == 2.2165681500327987d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1582");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-10080L), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10080.0d) + "'", double2 == (-10080.0d));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1583");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(6.1118044E-10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.111804E-10f + "'", float1 == 6.111804E-10f);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1584");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((double) (-3));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1585");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.32237840649762E-9d + "'", double1 == 8.32237840649762E-9d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1586");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22025L + "'", long1 == 22025L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1587");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7433261306201424d + "'", double1 == 1.7433261306201424d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1588");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(312.5224337077219d, 0.49714987269413385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49714987269413385d + "'", double2 == 0.49714987269413385d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1589");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(30L, 175262256L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30L + "'", long2 == 30L);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1590");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(3.8146973E-6f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1591");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1592");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.414213562373095d, (-33.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0789593218788903E-5d + "'", double2 == 1.0789593218788903E-5d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1593");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(1013.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1013.9998f + "'", float1 == 1013.9998f);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1594");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(2.353852668370216E17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1595");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1013);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1013 + "'", int1 == 1013);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1596");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(2.404833716619938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4048337166199385d + "'", double1 == 2.4048337166199385d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1597");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(2.1972245773362196d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1598");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 52L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.984137914278307E171d + "'", double2 == 3.984137914278307E171d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1599");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(100.00001f, (float) (-32));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.00001f + "'", float2 == 100.00001f);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1600");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(105L, (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 73L + "'", long2 == 73L);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1601");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh((-0.9899924966004455d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6462754977868417d) + "'", double1 == (-2.6462754977868417d));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1602");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 630L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 630.00006f + "'", float1 == 630.00006f);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1603");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(784.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9851359060614224d) + "'", double1 == (-0.9851359060614224d));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1604");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(1217, (-1013));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-809) + "'", int2 == (-809));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1605");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-91050L), (long) 3360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3030L + "'", long2 == 3030L);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1606");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 89L, 1.0686368200076951E-305d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1607");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-0.50637222006591d), 3363);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1608");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-91047));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-91047.01f) + "'", float1 == (-91047.01f));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1609");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-149.0d), 3363);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1610");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(35.03922309737463d, (double) 90788);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.03922309737463d + "'", double2 == 35.03922309737463d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1611");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(99000L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 98999L + "'", long1 == 98999L);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1612");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1613");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(35, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1614");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(64L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1615");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-809));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1616");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-1003), 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1003) + "'", int2 == (-1003));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1617");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 152);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35904428689111606d + "'", double1 == 0.35904428689111606d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1618");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(26, (-13444));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1619");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6897511201227055d) + "'", double1 == (-0.6897511201227055d));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1620");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) (-1), (long) 1120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1120L) + "'", long2 == (-1120L));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1621");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999403953551d + "'", double1 == 0.9999999403953551d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1622");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-17.715091907742444d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1623");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(9.765625E-4f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.765625E-4f + "'", float2 == 9.765625E-4f);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1624");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1625");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 396, (-90023L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-89627L) + "'", long2 == (-89627L));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1626");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1627");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-0.008837862480783425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20675169555319545d) + "'", double1 == (-0.20675169555319545d));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1628");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-13444L), 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13408L) + "'", long2 == (-13408L));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1629");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 226L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1630");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(0.11097654215740219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0061642189978075d + "'", double1 == 1.0061642189978075d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1631");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((-0.5324596581265606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5324596581265605d) + "'", double1 == (-0.5324596581265605d));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1632");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(0.8979266153021832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4557603683610037d + "'", double1 == 0.4557603683610037d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1633");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3401);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3401 + "'", int1 == 3401);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1634");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1635");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter(0.2329201033226127d, (-0.5063722200659099d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23292010332261268d + "'", double2 == 0.23292010332261268d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1636");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 2520L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4740731286609112d + "'", double1 == 0.4740731286609112d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1637");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(32, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1638");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004425697988050785d + "'", double1 == 0.004425697988050785d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1639");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1640");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-1014));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1014L + "'", long1 == 1014L);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1641");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1642");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((long) 10, 3363L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33630L + "'", long2 == 33630L);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1643");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(3.1386173574005567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4641293863707505d + "'", double1 == 1.4641293863707505d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1644");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-1378L), (-1378L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1645");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1646");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(Double.POSITIVE_INFINITY, (double) 2520L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1647");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (byte) 10, 0.06048850250843339d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1648");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(9.707105757318058E-6d, (double) 930L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.707105757318058E-6d + "'", double2 == 9.707105757318058E-6d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1649");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-149));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1650");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(11L, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-110L) + "'", long2 == (-110L));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1651");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-103747L), (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1652");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1653");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(3363, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3363 + "'", int2 == 3363);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1654");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 101 + "'", int1 == 101);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1655");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((-127), (-1019));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 892 + "'", int2 == 892);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1656");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh((-0.9234931422524565d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1657");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-70L), (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 700L + "'", long2 == 700L);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1658");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(101.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 101.00001f + "'", float1 == 101.00001f);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1659");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(14553.12799632291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1660");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) (-1036298.94f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1661");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(0.5705654518541791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7692672040590817d + "'", double1 == 0.7692672040590817d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1662");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) 127L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1663");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-6619L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6619L) + "'", long2 == (-6619L));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1664");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(0.49714987269413385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.484589490840037d + "'", double1 == 28.484589490840037d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1665");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.0d, (double) (-1151L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1666");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((-90023L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-90023) + "'", int1 == (-90023));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1667");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-1015));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1015.00006f) + "'", float1 == (-1015.00006f));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1668");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) 1008, 3261L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2253L) + "'", long2 == (-2253L));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1669");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(0, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1670");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 12.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81377.39570642986d + "'", double1 == 81377.39570642986d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1671");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(0.99999994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1672");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-35));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-34L) + "'", long1 == (-34L));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1673");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) (-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1674");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1675");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1676");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(47.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.686370328274947E20d + "'", double1 == 6.686370328274947E20d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1677");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1678");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil((double) 1424L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1424.0d + "'", double1 == 1424.0d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1679");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) (-90788), (long) (-100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 907L + "'", long2 == 907L);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1680");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) 152);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 152L + "'", long1 == 152L);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1681");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp(6.1118044E-10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.111805E-10f + "'", float1 == 6.111805E-10f);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1682");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-103747L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 103747.0f + "'", float1 == 103747.0f);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1683");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atanh(3.984137914278307E171d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1684");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(2.3025850929940455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1947055233182953d + "'", double1 == 1.1947055233182953d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1685");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 98L + "'", long1 == 98L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1686");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1.2664982178518892E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1687");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(36, (-1015));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1051 + "'", int2 == 1051);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1688");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000000000001d + "'", double1 == 52.00000000000001d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1689");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-32704L), 1.5704510598101804d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-32703.998f) + "'", float2 == (-32703.998f));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1690");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) (-6102312));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6102312.0f + "'", float1 == 6102312.0f);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1691");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1692");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-1589.1048306483171d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1693");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1694");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(1013.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1013.9999f + "'", float1 == 1013.9999f);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1695");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3.5308397786165204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5308397786165204d + "'", double1 == 3.5308397786165204d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1696");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 105L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 105.00001f + "'", float1 == 105.00001f);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1697");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-2), 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1698");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(3360.015125058972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08169091132296946d + "'", double1 == 0.08169091132296946d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1699");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((int) (short) 1, (-90788));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1700");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 1024L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0f + "'", float1 == 1024.0f);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1701");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(0.4740731286609112d, 0.004425697988050785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4740731286609112d + "'", double2 == 0.4740731286609112d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1702");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toIntExact((long) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1703");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-200L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-200.00002f) + "'", float1 == (-200.00002f));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1704");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((double) 3361);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1705");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh((double) 12L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81377.39571257407d + "'", double1 == 81377.39571257407d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1706");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1707");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1708");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1709");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(5.0d, 4379);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1710");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(99.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.889030319346946E42d + "'", double1 == 9.889030319346946E42d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1711");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(127.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.5373497666891724d + "'", double1 == 5.5373497666891724d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1712");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5440211108893698d + "'", double1 == 0.5440211108893698d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1713");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) 31.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1714");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-0.8732972972139946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1715");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((-0.5324596581265606d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1716");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 3428, 98L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1717");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1718");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.503290667999202d + "'", double1 == 0.503290667999202d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1719");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(100.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0043213737826426d + "'", double1 == 2.0043213737826426d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1720");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-35L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1721");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1722");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(0.17278084418222237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0030155946153550698d + "'", double1 == 0.0030155946153550698d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1723");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((-5.026525695313479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.99991389536053d) + "'", double1 == (-0.99991389536053d));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1724");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(32, 1120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1088) + "'", int2 == (-1088));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1725");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.273736754432062E-13d + "'", double1 == 2.273736754432062E-13d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1726");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-91047));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-91048) + "'", int1 == (-91048));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1727");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1728");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-90023), (long) (-50419));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39604L) + "'", long2 == (-39604L));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1729");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(3364);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3365 + "'", int1 == 3365);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1730");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1731");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos(14438.536437296745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9751501390930555d + "'", double1 == 0.9751501390930555d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1732");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(3.2947553997329484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15437176505621994d + "'", double1 == 0.15437176505621994d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1733");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((-1.5699275172828289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.162232994932017d) + "'", double1 == (-1.162232994932017d));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1734");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-103.27892990343184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401298464324826E-45d + "'", double1 == 1.401298464324826E-45d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1735");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((float) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1736");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1737");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) 35, 3428L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1738");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 227L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 227.0f + "'", float1 == 227.0f);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1739");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder(31.999999999999996d, (double) 1151.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1740");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1741");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 27.999998f, 1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.16903942929542d + "'", double2 == 97.16903942929542d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1742");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1022.99994f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1743");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(4.911649328672854E-164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.911649328672853E-164d + "'", double1 == 4.911649328672853E-164d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1744");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan(35.00203184070947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4763051111203195d + "'", double1 == 0.4763051111203195d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1745");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1746");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1747");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(1023.9999999999999d, 2.674395062530872E112d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.674395062530872E112d + "'", double2 == 2.674395062530872E112d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1748");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-149));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-149.00002f) + "'", float1 == (-149.00002f));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1749");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((double) 2520L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1750");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 0.0078125f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1072099696478683d) + "'", double1 == (-2.1072099696478683d));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1751");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint((double) 21L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1752");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99999999999999d + "'", double1 == 99.99999999999999d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1753");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot(4.097244099359933E56d, 0.4768639242040633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.097244099359933E56d + "'", double2 == 4.097244099359933E56d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1754");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) (-1088));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1755");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((double) (-1003));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7392416009402618d + "'", double1 == 0.7392416009402618d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1756");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((-17.715091907742444d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1757");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 3428, 300L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1758");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) 101300);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101300.0d + "'", double1 == 101300.0d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1759");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-303L), (long) 1014);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 711L + "'", long2 == 711L);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1760");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(252);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 253 + "'", int1 == 253);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1761");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(6.691673596021347E41d, 96);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.301690031579909E70d + "'", double2 == 5.301690031579909E70d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1762");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 98L + "'", long1 == 98L);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1763");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9092974268256815d + "'", double1 == 0.9092974268256815d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1764");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((float) 152L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 152.0f + "'", float1 == 152.0f);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1765");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-1.633123935319537E16d), (-100));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2883076259542711E-14d) + "'", double2 == (-1.2883076259542711E-14d));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1766");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10(649.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.812244696800369d + "'", double1 == 2.812244696800369d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1767");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-73856), 152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1768");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(5.298292365610485d, (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1769");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(648);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 648 + "'", int1 == 648);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1770");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(312.5224337077219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9978204601543744d) + "'", double1 == (-0.9978204601543744d));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1771");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((float) (-219L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1772");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan(0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0274087022410345d + "'", double1 == 0.0274087022410345d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1773");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(3.2947553997329484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.907751933157442d + "'", double1 == 1.907751933157442d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1774");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin((-0.9234931422524565d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7977129777416644d) + "'", double1 == (-0.7977129777416644d));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1775");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(97.0d, (double) (-35L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.903951111578052E-70d + "'", double2 == 2.903951111578052E-70d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1776");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) 3396, (double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5687350811864498d + "'", double2 == 1.5687350811864498d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1777");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp((-12.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.14421235332821E-6d + "'", double1 == 6.14421235332821E-6d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1778");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(696.0f, (float) (-1019));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-696.0f) + "'", float2 == (-696.0f));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1779");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(396);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 396 + "'", int1 == 396);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1780");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1((double) 64);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.235149080811617E27d + "'", double1 == 6.235149080811617E27d);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1781");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((int) '#', 3363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1782");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1783");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(2.718281828459045d, 1.5687350811864498d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1784");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin((double) (-1007L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1785");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(0.7435938375035029d, (double) (-1024.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7435938375035029d) + "'", double2 == (-0.7435938375035029d));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1786");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) (-1016L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1787");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-90023.99f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 90023.99f + "'", float1 == 90023.99f);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1788");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(0.014898665854393249d, (-17.715091907742444d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1789");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(97.0d, 0.5440211108893698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1790");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((-12700.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-221.65681500327986d) + "'", double1 == (-221.65681500327986d));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1791");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(0.5440211108893698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43439012436492125d + "'", double1 == 0.43439012436492125d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1792");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0000001f) + "'", float1 == (-1.0000001f));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1793");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.exp(3.104479980411714E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1794");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2(9.889030319346946E42d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1795");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((-3.141592653440699d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1796");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) (-2), 152L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 150L + "'", long2 == 150L);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1797");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(1.157920892373162E85d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 195.86635896729837d + "'", double1 == 195.86635896729837d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1798");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-0.26602380077804594d), (double) 33630L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.26602380077804594d) + "'", double2 == (-0.26602380077804594d));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1799");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(3.984137914278307E171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1800");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1801");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((double) 35L, 45.4416878563681d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.35805954907812d + "'", double2 == 57.35805954907812d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1802");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(3428, (-1088));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2340 + "'", int2 == 2340);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1803");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.434045323243469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1804");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) (-3578L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2811043134985358d + "'", double1 == 0.2811043134985358d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1805");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((-1.421946954983242d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1806");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 100, (double) (-9L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-18d + "'", double2 == 1.0E-18d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1807");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acosh(1.0649310253298E-46d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1808");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tan((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220703131063298E-4d + "'", double1 == 1.220703131063298E-4d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1809");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cos((double) 1008);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8999062670030438d) + "'", double1 == (-0.8999062670030438d));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1810");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707886974003653d + "'", double1 == 1.5707886974003653d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1811");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.907751933157442d, (long) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9679700781975085E8d + "'", double2 == 4.9679700781975085E8d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1812");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(1.401298464324826E-45d, (double) 73L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 73.0d + "'", double2 == 73.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1813");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.expm1(7.614805547662854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2027.0003710262447d + "'", double1 == 2027.0003710262447d);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1814");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.4422495703074085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1815");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((long) 'a', (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1816");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asin(0.02741556776206522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027419003241974858d + "'", double1 == 0.027419003241974858d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1817");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1818");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((-0.48305403451165263d), 31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4830540345116526d) + "'", double2 == (-0.4830540345116526d));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1819");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) (byte) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1820");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((double) (-1016L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1016.0d + "'", double1 == 1016.0d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1821");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(0.9994801143396996d, (-1024));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.559792686287636E-309d + "'", double2 == 5.559792686287636E-309d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1822");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sinh((double) 99000L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1823");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cosh(15.154262241479262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1907139.5523802382d + "'", double1 == 1907139.5523802382d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1824");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) (-91040L), (double) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-91039.99f) + "'", float2 == (-91039.99f));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1825");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(4.430930905201998d, 784.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.430930905201998d + "'", double2 == 4.430930905201998d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1826");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((float) (-219L), (float) 90788);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-219.0f) + "'", float2 == (-219.0f));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1827");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact(0L, (long) 648);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 648L + "'", long2 == 648L);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1828");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1829");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv(0L, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1830");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact(1024, (-52208));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53232 + "'", int2 == 53232);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1831");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((-6102312), 32736);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6102312) + "'", int2 == (-6102312));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1832");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextAfter((float) 28, 12.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 27.999998f + "'", float2 == 27.999998f);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1833");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((-91039.99f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1834");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(1024.0000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.872171540421938d + "'", double1 == 17.872171540421938d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1835");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((long) 3428, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1836");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-1024), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-989) + "'", int2 == (-989));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1837");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan2((double) (-50419.004f), 0.08169091132296946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707947065544121d) + "'", double2 == (-1.5707947065544121d));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1838");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((float) 3358L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3358.0002f + "'", float1 == 3358.0002f);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1839");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact(0, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1840");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(51.00000000000001d, (long) 101300);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1841");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((-200.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1842");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((-73856));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-73857) + "'", int1 == (-73857));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1843");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1844");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.4E-45f) + "'", float1 == (-1.4E-45f));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1845");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign((-1.5638183903210896d), (double) 200L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5638183903210896d + "'", double2 == 1.5638183903210896d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1846");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((int) (byte) 10, (-1015));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1847");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1848");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.subtractExact((long) (-91040), 3428L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-94468L) + "'", long2 == (-94468L));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1849");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 127, 63L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1850");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((-3264), (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1851");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh(1.2664982178518896E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2664982178518896E-18d + "'", double1 == 1.2664982178518896E-18d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1852");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.atan((double) 63L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5549246438031066d + "'", double1 == 1.5549246438031066d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1853");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(648, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 648 + "'", int2 == 648);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1854");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4096.000000000001d + "'", double1 == 4096.000000000001d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1855");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt(6.025494840663478E-191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9204047462873644E-64d + "'", double1 == 3.9204047462873644E-64d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1856");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.999999999999998d + "'", double1 == 8.999999999999998d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1857");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.rint(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1858");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1859");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((-0.7977129777416644d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.598067687838341d) + "'", double1 == (-1.598067687838341d));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1860");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1861");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.asinh(18.432576789051176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.608001760345104d + "'", double1 == 3.608001760345104d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1862");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs(16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1863");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1864");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(2027.0003710262447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.614805547662854d + "'", double1 == 7.614805547662854d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1865");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.IEEEremainder((double) 105.00001f, 1.4602720354524676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13957892318313725d) + "'", double2 == (-0.13957892318313725d));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1866");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((double) 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258672648362398E-5d + "'", double1 == 1.5258672648362398E-5d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1867");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9999999999999996d + "'", double1 == 2.9999999999999996d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1868");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 221L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1869");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(711L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1870");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians((double) 1023L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.854718247901992d + "'", double1 == 17.854718247901992d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1871");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(14438.536437296745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.577725309251234d + "'", double1 == 9.577725309251234d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1872");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((float) 101300);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1873");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((long) 16, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1874");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((double) 4, (-1013.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1013.0d) + "'", double2 == (-1013.0d));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1875");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor(9.010913302575805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1876");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb(4.911649328672854E-164d, 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.636921654508783E-155d + "'", double2 == 2.636921654508783E-155d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1877");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((long) 1024, (long) 2340);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2340L + "'", long2 == 2340L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1878");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((double) (-91037.0f), (-91137));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1879");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((long) (-76));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 76L + "'", long1 == 76L);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1880");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.scalb((-0.18125409412719368d), (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.005664190441474802d) + "'", double2 == (-0.005664190441474802d));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1881");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) 34, (float) (-1208));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1882");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(2.2239800905693157d, (double) 64L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2239800905693157d + "'", double2 == 2.2239800905693157d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1883");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) 1007);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.003029470553618d + "'", double1 == 3.003029470553618d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1884");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.cbrt((double) 31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141380652391393d + "'", double1 == 3.141380652391393d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1885");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow(1.1060669239491665d, 28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.82206660178827d + "'", double2 == 16.82206660178827d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1886");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum((double) 1378L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1887");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.incrementExact((long) (-10));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9L) + "'", long1 == (-9L));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1888");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-91039.99f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 91039.99f + "'", float1 == 91039.99f);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1889");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toRadians(37.407280917310196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6528802162255076d + "'", double1 == 0.6528802162255076d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1890");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent((double) (-146177));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1891");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextUp((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.00000000000001d + "'", double1 == 127.00000000000001d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1892");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((double) (-3355L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3355.0000000000005d) + "'", double1 == (-3355.0000000000005d));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1893");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.tanh((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1894");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.getExponent(1.1344640137963142d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1895");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-0.6925076809349759d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6925076809349759d + "'", double1 == 0.6925076809349759d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1896");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.signum(1023.00006f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1897");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 9.999999f, 1008L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1898");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.hypot((-5.026525695313479d), 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.39237503743198d + "'", double2 == 32.39237503743198d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1899");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp((-35.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1900");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.copySign(152.0d, 4.9679700781975085E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 152.0d + "'", double2 == 152.0d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1901");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.toDegrees(1.5704510598101804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.98021765897056d + "'", double1 == 89.98021765897056d);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1902");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198906d + "'", double1 == 1.3862943611198906d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1903");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.floor((double) (-103747L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-103747.0d) + "'", double1 == (-103747.0d));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1904");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log10((double) (-91049.99f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1905");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorDiv((-108L), (-49L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1906");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1907");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4551915E-11f + "'", float1 == 1.4551915E-11f);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1908");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(4096.000000000001d, (double) 21.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.0d + "'", double2 == 21.0d);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1909");
        float float1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown(5.9999995f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.999999f + "'", float1 == 5.999999f);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1910");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) (-91048), (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1911");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.abs((-1589.1048306483171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1589.1048306483171d + "'", double1 == 1589.1048306483171d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1912");
        float float2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max((float) (-1378L), (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1913");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.nextDown((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0000000000000004d) + "'", double1 == (-2.0000000000000004d));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1914");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min((long) (-1208), 630L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1208L) + "'", long2 == (-1208L));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1915");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(0.8755905434288421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5041393410787652d + "'", double1 == 0.5041393410787652d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1916");
        long long1 = org.apache.commons.math4.core.jdkmath.AccurateMath.decrementExact((long) (-73857));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-73858L) + "'", long1 == (-73858L));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1917");
        int int1 = org.apache.commons.math4.core.jdkmath.AccurateMath.round((float) (-1003));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1003) + "'", int1 == (-1003));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1918");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1919");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.log1p((-1.598067687838341d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1920");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.min(1051, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1921");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod((-3355L), 30L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1922");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1120, (-1016L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1923");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.acos(1589.1048306483171d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1924");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.ulp(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1925");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.multiplyExact((-76), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-456) + "'", int2 == (-456));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1926");
        int int2 = org.apache.commons.math4.core.jdkmath.AccurateMath.floorMod(90788, (-52208));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13628) + "'", int2 == (-13628));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1927");
        double double1 = org.apache.commons.math4.core.jdkmath.AccurateMath.sin(1065.2614193568397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25853930416304477d) + "'", double1 == (-0.25853930416304477d));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1928");
        long long2 = org.apache.commons.math4.core.jdkmath.AccurateMath.addExact((-13408L), 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13403L) + "'", long2 == (-13403L));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1929");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.max(8.97968787580151E307d, 0.999640215871468d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.97968787580151E307d + "'", double2 == 8.97968787580151E307d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_025_Regression3.test1930");
        double double2 = org.apache.commons.math4.core.jdkmath.AccurateMath.pow((double) 1.2207031E-4f, (-1.3067790607827852d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 129997.80968939842d + "'", double2 == 129997.80968939842d);
    }
}

