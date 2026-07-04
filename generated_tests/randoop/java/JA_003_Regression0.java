import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_003_Regression0 {

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
            System.out.format("%n%s%n", "JA_003_Regression0.test001");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test002");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.COLON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test003");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.COMMA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test004");
        int int0 = org.apache.commons.collections4.CollectionUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test005");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.DEFAULT_TOSTRING_SUFFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "]" + "'", str0, "]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test006");
        java.lang.Object obj0 = null;
        int int1 = org.apache.commons.collections4.CollectionUtils.size(obj0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test007");
        java.lang.String str0 = org.apache.commons.collections4.CollectionUtils.DEFAULT_TOSTRING_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "[" + "'", str0, "[");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) ":", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test010");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test011");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test013");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test015");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test016");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test018");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test024");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test029");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test030");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test031");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test033");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test034");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test035");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test038");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 0.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test043");
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test044");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test045");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test051");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) ",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test054");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test055");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test056");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) "[");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test057");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test058");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test061");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1.0d, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test065");
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test069");
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test072");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test073");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test076");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test077");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test078");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test079");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test080");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test081");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test082");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test083");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test084");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test087");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test088");
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test090");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test091");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test093");
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test098");
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test100");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test103");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test104");
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test106");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test107");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test108");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test111");
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test112");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test114");
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test115");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test116");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test117");
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test118");
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test119");
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test120");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test121");
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test122");
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test123");
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test124");
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test125");
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test126");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test127");
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test128");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test129");
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test130");
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test131");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test132");
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test133");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = wildcardClassCollection0.getClass();
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassCollection0);
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test134");
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test135");
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
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test136");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test137");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) ":");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test138");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test139");
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
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test140");
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test141");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test142");
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test143");
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test145");
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test146");
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test147");
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test148");
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test149");
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
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test150");
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test151");
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test152");
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test153");
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test156");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test157");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = strComparableCollection0.getClass();
        org.junit.Assert.assertNotNull(strComparableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test158");
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test160");
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test161");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test162");
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test163");
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
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test164");
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test166");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test167");
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test168");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test169");
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test170");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test171");
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test172");
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test173");
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
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test174");
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
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test176");
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test177");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test178");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test179");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test180");
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test181");
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test182");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test183");
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
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test184");
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
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test185");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) ",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test186");
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test187");
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test189");
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test190");
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test191");
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test192");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test193");
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test194");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test195");
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
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test196");
        java.util.Collection<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArrayCollection0);
        org.junit.Assert.assertNotNull(objArrayCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test197");
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test198");
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test199");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test200");
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test201");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test202");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = genericDeclarationCollection0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test203");
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test204");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test205");
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test206");
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
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test207");
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test208");
        java.lang.Object obj0 = null;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(obj0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test209");
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test210");
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test211");
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test212");
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test213");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test214");
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test215");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test216");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj10 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test217");
        java.util.Collection<java.lang.String> strCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) strCollection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) strCollection0);
        org.junit.Assert.assertNotNull(strCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test219");
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test220");
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
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test221");
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
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test223");
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test224");
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
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test225");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test226");
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test227");
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test228");
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test229");
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test230");
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test231");
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test232");
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
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test233");
        java.util.Collection<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = serializableCollection0.getClass();
        org.junit.Assert.assertNotNull(serializableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test234");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test235");
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) constantDescCollection0);
        org.junit.Assert.assertNotNull(constantDescCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test236");
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test237");
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test238");
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test239");
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test240");
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test241");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Class<?> wildcardClass10 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test242");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldCollection0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test243");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray4, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test244");
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test245");
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test246");
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test247");
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
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test248");
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
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test249");
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
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test252");
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test253");
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
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test254");
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
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test255");
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test256");
        java.util.Collection<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = constableCollection0.getClass();
        org.junit.Assert.assertNotNull(constableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test257");
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test258");
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test259");
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test260");
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
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test261");
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test262");
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test263");
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
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test265");
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test266");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test267");
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test268");
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test269");
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
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test270");
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test271");
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
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test272");
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
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test273");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test274");
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test275");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test276");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass9 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test277");
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test278");
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test279");
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test280");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        java.lang.Class<?> wildcardClass4 = collection0.getClass();
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test281");
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
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test282");
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test283");
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test284");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test285");
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test286");
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test287");
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
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test289");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test290");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test291");
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
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test292");
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
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test293");
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
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test294");
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
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test295");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test296");
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
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test297");
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
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test298");
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test299");
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test300");
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
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test301");
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
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test302");
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test303");
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
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test304");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test305");
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
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test306");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test307");
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
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test308");
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
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test309");
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
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test310");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test311");
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
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test312");
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test313");
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
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test314");
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test315");
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test316");
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test317");
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
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test318");
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
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test319");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[:, 10, false, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test320");
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
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test321");
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test322");
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test324");
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test325");
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
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test326");
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test327");
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test328");
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test329");
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
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test330");
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
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test331");
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
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test332");
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test333");
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test335");
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test336");
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
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test337");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test338");
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test339");
        java.util.Collection<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) typeDescriptorCollection0);
        java.lang.Class<?> wildcardClass2 = typeDescriptorCollection0.getClass();
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test340");
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
        int int14 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test341");
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
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test342");
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
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test343");
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
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test344");
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
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test345");
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
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test346");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 10.0f, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test348");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test349");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test350");
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
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test351");
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test352");
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test353");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        java.lang.Class<?> wildcardClass2 = collection0.getClass();
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test354");
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test355");
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
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test356");
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
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test357");
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
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test358");
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test359");
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
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test360");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test361");
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
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test362");
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test363");
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test364");
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
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test365");
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
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test366");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test367");
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
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test368");
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
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test369");
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test370");
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
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test371");
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test372");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test373");
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test374");
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
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test375");
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
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test376");
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
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test377");
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test378");
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
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test379");
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
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test380");
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
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test381");
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test382");
        java.util.Collection<java.lang.Object> objCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        java.lang.Class<?> wildcardClass1 = objCollection0.getClass();
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test383");
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test385");
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
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test386");
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
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test387");
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
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test388");
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test389");
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
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test390");
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test391");
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test392");
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
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test393");
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
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test394");
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test395");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test396");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Object obj9 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test397");
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
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test398");
        java.util.Collection<java.util.Collection> collectionCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) collectionCollection0);
        java.lang.Class<?> wildcardClass2 = collectionCollection0.getClass();
        org.junit.Assert.assertNotNull(collectionCollection0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test399");
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test400");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test401");
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
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test402");
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
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) "[", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index cannot be negative: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test404");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[-1.0, 0], [], 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test405");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Object obj8 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, (int) (short) 1);
        boolean boolean9 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int10 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass11 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test406");
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
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test407");
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
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test408");
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
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test409");
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
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test410");
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
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test411");
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
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test412");
        java.util.Collection collection0 = org.apache.commons.collections4.CollectionUtils.EMPTY_COLLECTION;
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) collection0);
        int int3 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) collection0);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test413");
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test414");
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test415");
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
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test416");
        java.util.Collection<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean2 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        boolean boolean3 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) wildcardClassOfFieldCollection0);
        java.lang.Class<?> wildcardClass4 = wildcardClassOfFieldCollection0.getClass();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test417");
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
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test418");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test419");
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test420");
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
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test421");
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
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test422");
        java.lang.Object[] objArray4 = new java.lang.Object[] { ":", (byte) 10, false, (-1) };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray4);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray4);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false, 10, :]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test423");
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
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test424");
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test425");
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test426");
        java.util.Collection<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.CollectionUtils.emptyCollection();
        boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) charSequenceCollection0);
        int int2 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) charSequenceCollection0);
        org.junit.Assert.assertNotNull(charSequenceCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test427");
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
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test428");
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test429");
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
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test430");
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
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test431");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test432");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test433");
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
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test434");
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
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test435");
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
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test436");
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
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test437");
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
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test438");
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
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test439");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test440");
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
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test441");
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
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test442");
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
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test443");
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
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test444");
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
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test445");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test446");
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
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test447");
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test448");
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
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test449");
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
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test450");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass8 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test451");
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
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test452");
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
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test453");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test454");
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test455");
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
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test456");
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
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test457");
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test458");
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
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test459");
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
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[0, -1.0], 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test460");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int7 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj11 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test461");
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
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test462");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test463");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test464");
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test465");
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
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test466");
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
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test467");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
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
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test468");
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test469");
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
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test470");
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
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test471");
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
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test472");
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
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test473");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test474");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test475");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test476");
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test477");
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
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test478");
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
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test479");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Class<?> wildcardClass10 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test480");
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) (-1.0d), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test482");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int4 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int6 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int8 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        boolean boolean11 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test483");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj6 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean8 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        int int9 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean10 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
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
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test484");
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
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test485");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object obj7 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray3, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, objArray3 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray9);
        int int12 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass13 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, -1.0]");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [0, -1.0]]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test486");
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
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test487");
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
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test488");
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
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test489");
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
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test490");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test491");
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
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test492");
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
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test493");
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
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test494");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        int int5 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) objArray2);
        boolean boolean6 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        boolean boolean7 = org.apache.commons.collections4.CollectionUtils.sizeIsEmpty((java.lang.Object) objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test495");
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
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test496");
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
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test497");
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
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test498");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0d), 0 };
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        java.lang.Object obj5 = org.apache.commons.collections4.CollectionUtils.get((java.lang.Object) objArray2, 0);
        org.apache.commons.collections4.CollectionUtils.reverseArray(objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0, 0]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test499");
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
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_003_Regression0.test500");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.collections4.CollectionUtils.size((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

