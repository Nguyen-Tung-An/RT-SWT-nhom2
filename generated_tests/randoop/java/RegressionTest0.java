import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Class<java.lang.Object> objClass0 = org.apache.commons.cli.PatternOptionBuilder.OBJECT_VALUE;
        org.junit.Assert.assertNotNull(objClass0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Class<java.net.URL> uRLClass0 = org.apache.commons.cli.PatternOptionBuilder.URL_VALUE;
        org.junit.Assert.assertNotNull(uRLClass0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Class<?> wildcardClass0 = org.apache.commons.cli.PatternOptionBuilder.CLASS_VALUE;
        org.junit.Assert.assertNotNull(wildcardClass0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Class<java.io.FileInputStream> fileInputStreamClass0 = org.apache.commons.cli.PatternOptionBuilder.EXISTING_FILE_VALUE;
        org.junit.Assert.assertNotNull(fileInputStreamClass0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType('4');
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Class<java.lang.String> strClass0 = org.apache.commons.cli.PatternOptionBuilder.STRING_VALUE;
        org.junit.Assert.assertNotNull(strClass0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('a');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Class<java.io.File[]> fileArrayClass0 = org.apache.commons.cli.PatternOptionBuilder.FILES_VALUE;
        org.junit.Assert.assertNotNull(fileArrayClass0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Class<java.io.File> fileClass0 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        org.junit.Assert.assertNotNull(fileClass0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Class<java.lang.Number> numberClass0 = org.apache.commons.cli.PatternOptionBuilder.NUMBER_VALUE;
        org.junit.Assert.assertNotNull(numberClass0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType('#');
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Class<java.util.Date> dateClass0 = org.apache.commons.cli.PatternOptionBuilder.DATE_VALUE;
        org.junit.Assert.assertNotNull(dateClass0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("");
        java.lang.Class<?> wildcardClass2 = options1.getClass();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType('a');
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('#');
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class java.util.Date");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class java.util.Date");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class java.util.Date");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.cli.PatternOptionBuilder patternOptionBuilder0 = new org.apache.commons.cli.PatternOptionBuilder();
        java.lang.Class<?> wildcardClass1 = patternOptionBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass(' ');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('4');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.PatternOptionBuilder.getValueType(' ');
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("hi!");
        java.lang.Class<?> wildcardClass2 = options1.getClass();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

