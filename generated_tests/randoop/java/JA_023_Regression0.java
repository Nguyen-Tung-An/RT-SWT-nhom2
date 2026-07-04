import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_023_Regression0 {

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
            System.out.format("%n%s%n", "JA_023_Regression0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0002");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.COLON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0003");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.COMMA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0004");
        int int0 = org.apache.commons.collections4.CollectionUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0005");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.DEFAULT_TOSTRING_SUFFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "]" + "'", str0, "]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0006");
        java.lang.Object obj0 = null;
        int int1 = org.apache.commons.collections4.CollectionUtils.size(obj0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0007");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.DEFAULT_TOSTRING_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "[" + "'", str0, "[");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) ":", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0009");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0014");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass7 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0020");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 1);
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0023");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0028");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0032");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = annotatedElementCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0034");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = annotatedElementCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) annotatedElementCollection0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0041");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass4 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass4, (int) (short) 0);
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 0.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0043");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        java.lang.Class<?> wildcardClass1 = collection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0048");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass4 = objArray2.getClass();
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) ",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0052");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strComparableCollection0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) "[");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0058");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0059");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0062");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1.0d, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0065");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0066");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0067");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0069");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0070");
        java.util.Collection<java.lang.Iterable> iterableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) iterableCollection0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableCollection0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0071");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0072");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass8 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0074");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0075");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0077");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) annotatedElementCollection0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0081");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0086");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = wildcardClassOfFieldCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0087");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0088");
        java.util.Collection<java.lang.Iterable> iterableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) iterableCollection0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableCollection0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0089");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass5 = objArray2.getClass();
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0090");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0091");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassCollection0);
        java.lang.Class<?> wildcardClass2 = wildcardClassCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClassCollection0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0092");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
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
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0093");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0094");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0095");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0096");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0097");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        java.lang.Class<?> wildcardClass2 = typeDescriptorCollection0.getClass();
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0098");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 100);
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
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0099");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0100");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0101");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0102");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0103");
        java.util.Collection<java.util.Collection> collectionCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = collectionCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0104");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
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
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0105");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
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
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0107");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strCollection0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0111");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0113");
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
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass14);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0114");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
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
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0116");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0117");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0118");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0119");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strComparableCollection0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0120");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
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
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0121");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0122");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass5 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0123");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0124");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0125");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0127");
        java.util.Collection<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) constableCollection0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableCollection0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0129");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0130");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0132");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0133");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = wildcardClassCollection0.getClass();
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassCollection0);
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0134");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0135");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) ":");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0138");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0139");
        java.util.Collection<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArrayCollection0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArrayCollection0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0141");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0142");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0144");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strCollection0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0145");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass8 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0146");
        java.util.Collection<java.util.Collection> collectionCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = collectionCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0147");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClassOfFieldCollection0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0148");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0149");
        java.util.Collection<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) constableCollection0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableCollection0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0150");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0151");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0152");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = annotatedElementCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0155");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass5 = objArray2.getClass();
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0156");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClassOfFieldCollection0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0158");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0160");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean12);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0161");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0162");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0165");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0166");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0167");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0168");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0169");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 3);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0170");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0172");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0174");
        java.util.Collection<java.lang.Iterable> iterableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) iterableCollection0);
        java.lang.Class<?> wildcardClass2 = iterableCollection0.getClass();
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) iterableCollection0);
        org.junit.Assert.assertNotNull(iterableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0175");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0176");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0177");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 1);
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0178");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
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
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) ",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0180");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean6, (int) ' ');
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0181");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0183");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0184");
        java.util.Collection<java.util.Collection> collectionCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) collectionCollection0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionCollection0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0185");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0186");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, (int) (short) 1);
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
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0187");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0188");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0189");
        java.util.Collection<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArrayCollection0);
        org.junit.Assert.assertNotNull(objArrayCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0190");
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
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass10);
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0191");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0193");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0195");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0197");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean9, 100);
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0198");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int8, 2);
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0199");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0200");
        java.lang.Object obj0 = null;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0201");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0202");
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
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass9, 1);
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0203");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0204");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean12);
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
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0205");
        java.util.Collection<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) constableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0207");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass9, (int) 'a');
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0208");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0209");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean12, (int) 'a');
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
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0211");
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
            boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0212");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0214");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0215");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        java.lang.Class<?> wildcardClass2 = objCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0216");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get(obj16, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0217");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
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
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0218");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0219");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0220");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass14);
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0221");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass12, (int) '4');
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0222");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0223");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0224");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0225");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0226");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0227");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0228");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0229");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0230");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0231");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
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
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0234");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0235");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeCollection0);
        java.lang.Class<?> wildcardClass2 = typeCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0236");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0237");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0238");
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
        int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0239");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0240");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0241");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0242");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (byte) 10);
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
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0243");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
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
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0244");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0246");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = wildcardClassCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0247");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass5 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass5, 1);
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0248");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass14);
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0250");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0251");
        java.util.Collection<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArrayCollection0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArrayCollection0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0252");
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
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0253");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0255");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0256");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0257");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClassOfFieldCollection0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0258");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0259");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0260");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0261");
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
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int12, (int) (short) 1);
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0262");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0263");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass15, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0265");
        java.util.Collection<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = objArrayCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArrayCollection0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArrayCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0266");
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
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int12);
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0267");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get(obj8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0268");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0269");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0270");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass13, 3);
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0271");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.collections4.CollectionUtils.size(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0272");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0273");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int6, (int) ' ');
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0274");
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
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0275");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 1, (int) ' ');
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0276");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0);
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0278");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0279");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0280");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass13 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0281");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0282");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0283");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0284");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0285");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0286");
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
            boolean boolean14 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean13);
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0287");
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
        java.lang.Class<?> wildcardClass14 = objArray9.getClass();
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0288");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0289");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0290");
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
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) '#');
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0292");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass15, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0293");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0294");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0295");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0296");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        java.lang.Class<?> wildcardClass1 = collection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0297");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.CollectionUtils.reverseArray(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: array");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0298");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = typeDescriptorCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) typeDescriptorCollection0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0299");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean3, (int) (short) 100);
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0300");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0302");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass4 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass4);
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0303");
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
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0304");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size(obj13);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0305");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        java.lang.Class<?> wildcardClass2 = typeDescriptorCollection0.getClass();
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0306");
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
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean12);
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0307");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0308");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0309");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0310");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) strComparableCollection0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0313");
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
        int int15 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0314");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0315");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
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
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0316");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0317");
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
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass15, 0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0318");
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
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 3);
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
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0319");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0320");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
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
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0321");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0322");
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
            boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0323");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int9, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0324");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0325");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0326");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0327");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) annotatedElementCollection0);
        java.lang.Class<?> wildcardClass2 = annotatedElementCollection0.getClass();
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) annotatedElementCollection0);
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0328");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0329");
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
            int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 2);
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0330");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) annotatedElementCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0331");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 10);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0332");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0333");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0334");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 10);
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0335");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0336");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strComparableCollection0);
        java.lang.Class<?> wildcardClass3 = strComparableCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0337");
        java.util.Collection<java.lang.Iterable> iterableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) iterableCollection0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableCollection0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0338");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) collection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0339");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass5 = objArray2.getClass();
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0340");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = objCollection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0341");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0343");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.collections4.CollectionUtils.size(obj8);
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0344");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0345");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0346");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeCollection0);
        java.lang.Class<?> wildcardClass2 = typeCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0347");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) annotatedElementCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) annotatedElementCollection0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0348");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass4 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass4, 0);
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0349");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0350");
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
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0352");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, 0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0353");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) boolean12);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0354");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass6 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass6);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "[", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0356");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0357");
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
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0358");
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
            int int15 = org.apache.commons.collections4.CollectionUtils.size(obj14);
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
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0359");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass11, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0360");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0361");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        java.lang.Class<?> wildcardClass2 = charSequenceCollection0.getClass();
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0362");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0363");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.util.Collection<java.lang.Object> objCollection7 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray2, objCollection7, 1 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0364");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        java.lang.Class<?> wildcardClass3 = strCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0365");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0366");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass5 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0367");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean11, (int) (byte) 10);
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
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0368");
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
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0369");
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
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, [], [-1.0, 0]]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0370");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0371");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0372");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass7 = objArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0373");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0374");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj11);
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0375");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0376");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean21, 4);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0377");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) serializableCollection0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollection0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0378");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean12);
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
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0379");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0381");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0382");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0383");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0384");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0385");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0386");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0387");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) int2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0388");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0389");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean10, (int) (short) 100);
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0390");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeDescriptorCollection0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0391");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0392");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0393");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.collections4.CollectionUtils.size(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0394");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0395");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0396");
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
            int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int9);
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0397");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int18);
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
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0399");
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
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0400");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) constantDescCollection0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescCollection0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0401");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0402");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get(obj0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0403");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClassOfFieldCollection0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0404");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass7 = objArray2.getClass();
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0405");
        java.util.Collection<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) typeCollection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) typeCollection0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0406");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0407");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0408");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int15);
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
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1.0d), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0410");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) int6);
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0411");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0412");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0413");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0414");
        java.util.Collection<java.lang.Iterable> iterableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) iterableCollection0);
        java.lang.Class<?> wildcardClass2 = iterableCollection0.getClass();
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) iterableCollection0);
        org.junit.Assert.assertNotNull(iterableCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0415");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = constantDescCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) constantDescCollection0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0416");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray9, 3);
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0417");
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
        java.lang.Class<?> wildcardClass16 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0418");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0419");
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
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass14, (int) (short) 1);
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0420");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) boolean14, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0422");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        java.lang.Class<?> wildcardClass1 = collection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0424");
        java.util.Collection<java.lang.Iterable> iterableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = iterableCollection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) iterableCollection0);
        org.junit.Assert.assertNotNull(iterableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0425");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0426");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0427");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0429");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0431");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0432");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0434");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0435");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0436");
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0437");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0439");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0442");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0445");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0447");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0449");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0450");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0451");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0452");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0453");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0455");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0459");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0460");
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0461");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0463");
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0465");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0470");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0471");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0472");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0474");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0475");
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0476");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0477");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0479");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0480");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0481");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0482");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0483");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0484");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0488");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0490");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0493");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0494");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) annotatedElementCollection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) int1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0495");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objCollection0);
        java.lang.Class<?> wildcardClass2 = objCollection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objCollection0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0496");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        java.lang.Class<?> wildcardClass3 = collection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0497");
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
        java.lang.Class<?> wildcardClass15 = objArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClass15);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0498");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0499");
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = annotatedElementCollection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) annotatedElementCollection0);
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_023_Regression0.test0500");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int11 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass12 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) wildcardClass12, (int) 'a');
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

