import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_003_Regression1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test501");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        java.lang.Class<?> wildcardClass1 = collection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test502");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test503");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test504");
        java.util.Collection<java.lang.Iterable> iterableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = iterableCollection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) iterableCollection0);
        org.junit.Assert.assertNotNull(iterableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test505");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int11, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test506");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test507");
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
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test508");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test509");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int11);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test510");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test511");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test512");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        java.lang.Class<?> wildcardClass3 = collection0.getClass();
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test513");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test514");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test515");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test516");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test517");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test518");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test519");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test520");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test521");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test522");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test523");
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
        java.lang.Class<?> wildcardClass16 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass16);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test524");
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test525");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass11 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test526");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test527");
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
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test528");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test529");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test530");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass3 = strComparableCollection0.getClass();
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test531");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0);
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
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test532");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test533");
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
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test534");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeCollection0);
        java.lang.Class<?> wildcardClass2 = typeCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test535");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test536");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test537");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass2 = strComparableCollection0.getClass();
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test538");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean15, 100);
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test539");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test540");
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
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test541");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test542");
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
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int14, 0);
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
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test543");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get(obj13, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test544");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass3 = strComparableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strComparableCollection0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test545");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test546");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test547");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test548");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test549");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test550");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test551");
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
        java.lang.Class<?> wildcardClass13 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test552");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test553");
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
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test554");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get(obj10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test555");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass7 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test556");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test557");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) serializableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test558");
        java.util.Collection<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = objArrayCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArrayCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test559");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test560");
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
        java.lang.Class<?> wildcardClass14 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test561");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test562");
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
        java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test563");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test564");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test565");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test566");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test567");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test568");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass12 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test569");
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
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test570");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test571");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test572");
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
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test573");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test574");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test575");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass4 = strComparableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strComparableCollection0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test576");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test577");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean15, 3);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test578");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test579");
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
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test580");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int15);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test581");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test582");
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
        boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test583");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test584");
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
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test585");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test586");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test587");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean4 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test588");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test589");
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
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test590");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test591");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test592");
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
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test593");
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
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test594");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) serializableCollection0);
        java.lang.Class<?> wildcardClass2 = serializableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test595");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test596");
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
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test597");
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
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test598");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strComparableCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test599");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test600");
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
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test601");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 10);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test602");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test603");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test604");
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
        java.lang.Class<?> wildcardClass18 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass18, 3);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test605");
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
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test606");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constantDescCollection0);
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test607");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test608");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean18);
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test609");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test610");
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
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10 + "'", obj14, 10);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test611");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test612");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test613");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test614");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test615");
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
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test616");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test617");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test618");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test619");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) genericDeclarationCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) genericDeclarationCollection0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test620");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test621");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test622");
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
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test623");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test624");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test625");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test626");
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
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test627");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test628");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test629");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test630");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClassCollection0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test631");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test632");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test633");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test634");
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
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test635");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test636");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression1.test637");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }
}

