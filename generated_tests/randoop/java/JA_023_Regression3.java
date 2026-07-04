import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_023_Regression3 {

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
            System.out.format("%n%s%n", "JA_023_Regression3.test1501");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1502");
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
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass19 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1503");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ":" + "'", obj15, ":");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1504");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1505");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1506");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1507");
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
        java.lang.Class<?> wildcardClass14 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1508");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1509");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1510");
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
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1511");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1512");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = typeDescriptorCollection0.getClass();
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1513");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean10, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1514");
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
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1515");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1516");
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
        java.lang.Class<?> wildcardClass20 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1517");
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
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1519");
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
        java.lang.Class<?> wildcardClass27 = objArray23.getClass();
        java.lang.Object obj29 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray23, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1520");
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
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass19 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass19);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1521");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1522");
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
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1523");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1524");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1525");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1526");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1527");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get(obj11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1528");
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
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj16);
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1529");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1530");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1531");
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
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1532");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1533");
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
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1534");
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
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1535");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 0);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size(obj12);
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1536");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1537");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1538");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1539");
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
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean10);
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1540");
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
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1541");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1542");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1543");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1544");
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
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1545");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass3 = wildcardClassOfFieldCollection0.getClass();
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1546");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass22 = objArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1547");
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
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1548");
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
        java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
        int int19 = org.apache.commons.collections4.CollectionUtils.size(obj18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int19);
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1549");
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
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass15);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1550");
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
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1551");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass18 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1552");
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
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1553");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1554");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1555");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1556");
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
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int16, 4);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1557");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1558");
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
        boolean boolean23 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean24 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1559");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass13 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1560");
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
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean20 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean20);
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
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1561");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1562");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1563");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1564");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1565");
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
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1566");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1567");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1568");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1569");
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
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1570");
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
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1571");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1572");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1573");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1574");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1575");
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
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1576");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = strComparableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1577");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1578");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int16);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1579");
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
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1580");
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
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1581");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean8);
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1582");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1583");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1584");
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
        boolean boolean23 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean25 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1585");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1586");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1587");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1588");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1589");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1590");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1591");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1592");
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
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1593");
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
        java.lang.Class<?> wildcardClass18 = obj16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1594");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1595");
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
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1596");
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
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
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
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1597");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1598");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1599");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1600");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1601");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1602");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1603");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1604");
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
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1605");
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
        java.lang.Object obj26 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1606");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1607");
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
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get(obj16, (int) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1608");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1609");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1610");
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
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1611");
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
        java.lang.Class<?> wildcardClass22 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1612");
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
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get(obj16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1613");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        java.lang.Class<?> wildcardClass2 = charSequenceCollection0.getClass();
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1614");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean5 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1615");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1616");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1617");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1618");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int17);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1619");
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
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1620");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        java.lang.Class<?> wildcardClass17 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1621");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1622");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1623");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1624");
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
        boolean boolean20 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1625");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1626");
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
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean10, (int) (byte) 0);
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1627");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1628");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean16);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1629");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1630");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int19);
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1631");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1632");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1633");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1634");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1635");
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
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1636");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10 + "'", obj18, 10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1637");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1638");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1639");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) annotatedElementCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) annotatedElementCollection0);
        java.lang.Class<?> wildcardClass3 = annotatedElementCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1640");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1641");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1642");
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
        java.lang.Class<?> wildcardClass20 = objArray2.getClass();
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
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1643");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1644");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1645");
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
        boolean boolean20 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1646");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1647");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1648");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1649");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ":" + "'", obj13, ":");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1650");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1651");
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
        java.lang.Class<?> wildcardClass19 = objArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1652");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1653");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1654");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1655");
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
            java.lang.Object obj23 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass21, (-1));
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
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1656");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1657");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1658");
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
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1659");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1660");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1661");
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
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean14);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1662");
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
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1663");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int19);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1664");
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
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1665");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1666");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) constantDescCollection0);
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1667");
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
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean11, 0);
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1668");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1669");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1670");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1671");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1672");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1673");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj26 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, 4);
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
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0d) + "'", obj26, (-1.0d));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1674");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1675");
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
        java.lang.Class<?> wildcardClass21 = objArray2.getClass();
        int int22 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1676");
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
        java.lang.Class<?> wildcardClass15 = objArray4.getClass();
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + ":" + "'", obj17, ":");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1677");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1678");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1679");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1680");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1681");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1682");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1683");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1684");
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
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1685");
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
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass17);
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1686");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass13 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1687");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1688");
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
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1689");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ":" + "'", obj11, ":");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1690");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1691");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size(obj13);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj13);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1692");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1693");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1694");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1695");
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
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1696");
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
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1697");
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
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass19 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1698");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1699");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1700");
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
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1701");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1702");
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
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1703");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1704");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1705");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1706");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1707");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        java.lang.Class<?> wildcardClass2 = strCollection0.getClass();
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1708");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1709");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) charSequenceCollection0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1710");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1711");
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
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1712");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1713");
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
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1714");
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
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1715");
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
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1716");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1717");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1718");
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
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1719");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1720");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1721");
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
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1722");
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
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1723");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        java.lang.Class<?> wildcardClass17 = objArray4.getClass();
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1724");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1725");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1726");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int8, (int) (short) 0);
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
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1727");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int8, (int) (short) 0);
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
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1728");
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
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass19 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1729");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1730");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) serializableCollection0);
        java.lang.Class<?> wildcardClass2 = serializableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1731");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1732");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1733");
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
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1734");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1735");
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
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1736");
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
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1737");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass18 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1738");
        java.util.Collection<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) constableCollection0);
        org.junit.Assert.assertNotNull(constableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1739");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1740");
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
        java.lang.Class<?> wildcardClass15 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1741");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1742");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1743");
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
            int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int11);
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1744");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1745");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1746");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1747");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1748");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1749");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) genericDeclarationCollection0);
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1750");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1751");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass19 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1752");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1753");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass9, 100);
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1754");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1755");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass4 = wildcardClassOfFieldCollection0.getClass();
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1756");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1757");
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
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1758");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1759");
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
        java.lang.Class<?> wildcardClass18 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass18);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1760");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1761");
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
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj21 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1762");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1763");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1764");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass13 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1765");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1766");
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
        boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1767");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1768");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1769");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1770");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1771");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1772");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1773");
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
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10 + "'", obj17, 10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1774");
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
        java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 0);
        int int19 = org.apache.commons.collections4.CollectionUtils.size(obj18);
        java.lang.Object obj21 = org.apache.commons.collections4.CollectionUtils.get(obj18, (int) (short) 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1775");
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
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1776");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1777");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1778");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) constantDescCollection0);
        java.lang.Class<?> wildcardClass2 = constantDescCollection0.getClass();
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1779");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1780");
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
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1781");
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
        java.lang.Object obj21 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1782");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1783");
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
        int int25 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray23);
        java.lang.Class<?> wildcardClass26 = objArray23.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1784");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1785");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        java.lang.Class<?> wildcardClass3 = collection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) collection0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1786");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1787");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1788");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1789");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1790");
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
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean14);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1791");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1792");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 1);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1793");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1794");
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
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1795");
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
        java.lang.Class<?> wildcardClass27 = objArray23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass27);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[false, 10]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1796");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1797");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1798");
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
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1799");
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
        java.lang.Class<?> wildcardClass17 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1800");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1801");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int21 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1802");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass18 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1803");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1804");
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
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj24 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        boolean boolean25 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1805");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1806");
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
        java.lang.Object obj29 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray23, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1807");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1808");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1809");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1810");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1811");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1812");
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
        boolean boolean22 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj24 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1813");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.collections4.CollectionUtils.size(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1814");
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
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1815");
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
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1816");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass12 = objArray4.getClass();
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1817");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1818");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass11 = objArray4.getClass();
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1819");
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
        java.lang.Class<?> wildcardClass22 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass22);
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
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1820");
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
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1821");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ":" + "'", obj11, ":");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1822");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1823");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1824");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1825");
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
        boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1826");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass20 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass20, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1827");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1828");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1829");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1830");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass13 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1831");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1832");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1833");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass13 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1834");
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
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1835");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) annotatedElementCollection0);
        java.lang.Class<?> wildcardClass2 = annotatedElementCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1836");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        java.lang.Class<?> wildcardClass3 = typeDescriptorCollection0.getClass();
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1837");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1838");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1839");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass2 = strComparableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1840");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int17 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean18 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int20 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1841");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size(obj9);
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
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1842");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1843");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1844");
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
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1845");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1846");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1847");
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
        java.lang.Class<?> wildcardClass17 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass17);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1848");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1849");
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
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1850");
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
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1851");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1852");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1854");
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
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1855");
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
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1856");
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
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1857");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1858");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1859");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1860");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1861");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1862");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1863");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1864");
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
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1865");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass13 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1866");
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
        int int18 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int21 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1867");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1L), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1869");
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
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1870");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass4 = strComparableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression3.test1871");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }
}

