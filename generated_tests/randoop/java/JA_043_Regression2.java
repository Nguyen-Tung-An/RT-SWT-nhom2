import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_043_Regression2 {

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
            System.out.format("%n%s%n", "JA_043_Regression2.test1001");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1002");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1003");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1004");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1005");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1006");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1007");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1008");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1009");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1010");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1011");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1012");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1013");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1014");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray12, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, objArray12 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { obj8, boolean22 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray23, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[false, 10]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1015");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = charSequenceCollection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1016");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1017");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1018");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1019");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1020");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1021");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1022");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1023");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1024");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1025");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1026");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1027");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1028");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass16, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1029");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1030");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1031");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1032");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1033");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        java.lang.Class<?> wildcardClass2 = constantDescCollection0.getClass();
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1034");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int21 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1035");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean14, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1036");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        java.lang.Class<?> wildcardClass2 = objCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1037");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1038");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1039");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1040");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = serializableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) serializableCollection0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1041");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1042");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1043");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1044");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1045");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1046");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1047");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1048");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1050");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1051");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1052");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1053");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass11 = objArray4.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1054");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass5 = strComparableCollection0.getClass();
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1055");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1056");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass20 = objArray2.getClass();
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1057");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1058");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int22 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int22, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1059");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1060");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray12, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, objArray12 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { obj8, boolean22 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        boolean boolean27 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        int int29 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray23);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1061");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1062");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1063");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1064");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass23 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass23, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1065");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1066");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1067");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1068");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1069");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass2 = strComparableCollection0.getClass();
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1070");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1071");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1072");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1073");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 1);
        java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1074");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1075");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ":" + "'", obj13, ":");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1076");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1.0f), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1078");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strComparableCollection0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1079");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass4 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1080");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1081");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1082");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1083");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1084");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1085");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1086");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1087");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1088");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1089");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1090");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = serializableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1091");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1092");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1093");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass7, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1094");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1095");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1096");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1097");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1098");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1099");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1100");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1101");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1102");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1103");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1104");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1105");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1106");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = charSequenceCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1107");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1108");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1109");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) typeDescriptorCollection0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1110");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 1);
        java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1111");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1112");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass18 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1113");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass6, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1114");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassCollection0);
        java.lang.Class<?> wildcardClass2 = wildcardClassCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1115");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1116");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1117");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass11 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1118");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1119");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1120");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1121");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1122");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1123");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass21 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1124");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass19 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1125");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1126");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1127");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1128");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1129");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        java.lang.Class<?> wildcardClass4 = charSequenceCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1130");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1131");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1132");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1133");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1134");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1135");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1136");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1137");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1138");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1139");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1140");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1141");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1142");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1143");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1144");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1145");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1146");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1147");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1148");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1149");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1150");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1151");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1152");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1153");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1154");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1155");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1156");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1157");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1158");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1159");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1160");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1161");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1162");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1163");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1164");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1165");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) genericDeclarationCollection0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1166");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1167");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1168");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj21 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean23 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass24 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1169");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1170");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1171");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) genericDeclarationCollection0);
        java.lang.Class<?> wildcardClass2 = genericDeclarationCollection0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1172");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1173");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1174");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1176");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1177");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1178");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1179");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1180");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1181");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1182");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1183");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1184");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1185");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1186");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1) + "'", obj17, (-1));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1187");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1188");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1189");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1190");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get(obj10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1191");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1192");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1193");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1194");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1195");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1196");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1197");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1198");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1199");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1201");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1202");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1203");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1204");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass12 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1205");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1206");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) serializableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1207");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1208");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1209");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objCollection0);
        java.lang.Class<?> wildcardClass2 = objCollection0.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1210");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1211");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1212");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1213");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass12, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1214");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass5 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1215");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass3 = strComparableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1216");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass18 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1217");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1218");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1219");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1220");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1221");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1222");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1223");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1224");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1225");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = wildcardClassCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1226");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1227");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1228");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1229");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1230");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) serializableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) serializableCollection0);
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1231");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1232");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1233");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass18 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1234");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1235");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1236");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1237");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1238");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1239");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1240");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1241");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass15 = objArray4.getClass();
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1242");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1243");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1244");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1245");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1246");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1247");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1248");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1249");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1250");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1251");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1252");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1253");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1254");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int22 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int24 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1255");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1256");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1257");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1258");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass12 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1259");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1260");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1261");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1262");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1263");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass17 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass17, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1264");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1265");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1266");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1267");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1268");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1269");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1270");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1271");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1272");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1273");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1274");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1275");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1276");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1277");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1278");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1279");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1280");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1281");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1282");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1283");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray12, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, objArray12 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { obj8, boolean22 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        java.lang.Class<?> wildcardClass26 = objArray23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, false]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1284");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int21 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1285");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass24 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1286");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1287");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1288");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int22 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1289");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1290");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1291");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass3 = wildcardClassOfFieldCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClassOfFieldCollection0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1292");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1293");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = typeDescriptorCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1294");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1295");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray12, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, objArray12 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { obj8, boolean22 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        boolean boolean27 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        boolean boolean29 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1296");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1297");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1298");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1299");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1300");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int16, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1301");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1302");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1303");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1304");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1305");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1306");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1307");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1308");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1309");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1310");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1311");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass11 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1312");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1313");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1314");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass15 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1315");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1316");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1317");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) genericDeclarationCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) genericDeclarationCollection0);
        java.lang.Class<?> wildcardClass3 = genericDeclarationCollection0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1318");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1319");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1320");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1321");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1322");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass12 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1323");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1324");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ":" + "'", obj11, ":");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1325");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1326");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1327");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1328");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1329");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1330");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1331");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int21 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int21, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1332");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1333");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1334");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1335");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1336");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1337");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) ":", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1339");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get(obj15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1340");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get(obj17, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1341");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1342");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1343");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1344");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1345");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1346");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1347");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1348");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1349");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1350");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1351");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int22 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass23 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1352");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1353");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1354");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1355");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) annotatedElementCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) annotatedElementCollection0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1356");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1357");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1358");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1359");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1360");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1361");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1362");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1363");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass15 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1364");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1365");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1366");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1367");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1368");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1369");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1370");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1371");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1372");
        java.util.Collection<java.util.Collection> collectionCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) collectionCollection0);
        java.lang.Class<?> wildcardClass2 = collectionCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1373");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1374");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1375");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = typeCollection0.getClass();
        org.junit.Assert.assertNotNull(typeCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1376");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1377");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1378");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1379");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1380");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1381");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1382");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1383");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1384");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1385");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1386");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1387");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 0.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1389");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1390");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1391");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int22 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean23 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1392");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1393");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1394");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1395");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1396");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) "[");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1397");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1398");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = serializableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1399");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj23 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1400");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass20 = objArray9.getClass();
        java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1401");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1402");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1403");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1404");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1405");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1406");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1407");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1408");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1409");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1410");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1411");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1412");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass21 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1413");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1414");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1415");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1416");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1417");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1418");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1419");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean20 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1420");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1421");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass18 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1422");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass21 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1423");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1424");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1425");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass15 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1426");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1427");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) typeDescriptorCollection0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1428");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1429");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int8, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1430");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1431");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1432");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1433");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1434");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1435");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray12, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, objArray12 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { obj8, boolean22 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        boolean boolean26 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        java.lang.Class<?> wildcardClass28 = objArray23.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[false, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1436");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1437");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1438");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1439");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1440");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1441");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1442");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1443");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1444");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1445");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objCollection0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1446");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1447");
        java.util.Collection<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) constableCollection0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableCollection0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1448");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1449");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1450");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1451");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1452");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1453");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1454");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1455");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1456");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1457");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1458");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass11 = objArray4.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1459");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1460");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) collection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1461");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1462");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1463");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1464");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass19 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1465");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass4 = strComparableCollection0.getClass();
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1466");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1467");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1468");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean14, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1469");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1470");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1471");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1472");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1473");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1474");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1475");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1476");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = objArray2.getClass();
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1477");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) constantDescCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1478");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass18 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1479");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray12, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray12);
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, objArray12 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray18);
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { obj8, boolean22 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        boolean boolean27 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray23);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[false, 10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1480");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1481");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1482");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1483");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1484");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1485");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1486");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int23 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass25 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1487");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
        int int17 = org.apache.commons.collections4.CollectionUtils.size(obj16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1488");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1489");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 1);
        java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1490");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1491");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1492");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strCollection0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1493");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1494");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass12 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1495");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get(obj13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ":" + "'", obj13, ":");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1496");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1497");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ":" + "'", obj15, ":");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1498");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1499");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) collection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) collection0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_043_Regression2.test1500");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) constantDescCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

