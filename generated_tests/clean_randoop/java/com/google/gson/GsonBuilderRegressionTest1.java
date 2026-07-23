package com.google.gson;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GsonBuilderRegressionTest1 {

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
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test501");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList4 = gsonBuilder0.hierarchyFactories;
        com.google.gson.Strictness strictness5 = gsonBuilder0.strictness;
        com.google.gson.Strictness strictness6 = null;
        gsonBuilder0.strictness = strictness6;
        java.lang.String str8 = gsonBuilder0.datePattern;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        boolean boolean12 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        boolean boolean15 = gsonBuilder13.useJdkUnsafe;
        boolean boolean16 = gsonBuilder13.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy17 = gsonBuilder13.objectToNumberStrategy;
        gsonBuilder11.objectToNumberStrategy = toNumberStrategy17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder11.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy21 = gsonBuilder20.longSerializationPolicy;
        gsonBuilder11.longSerializationPolicy = longSerializationPolicy21;
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder9.setLongSerializationPolicy(longSerializationPolicy21);
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder9.disableInnerClassSerialization();
        int[] intArray27 = new int[] { 1, (byte) 1 };
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder9.excludeFieldsWithModifiers(intArray27);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder0.excludeFieldsWithModifiers(intArray27);
        int int30 = gsonBuilder29.dateStyle;
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray31 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder29.setExclusionStrategies(exclusionStrategyArray31);
        com.google.gson.ToNumberStrategy toNumberStrategy33 = gsonBuilder29.objectToNumberStrategy;
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList4);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(longSerializationPolicy21);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1 });
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(exclusionStrategyArray31);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray31, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertNotNull(toNumberStrategy33);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test502");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder(gson6);
        gsonBuilder7.dateStyle = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test503");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        gsonBuilder1.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder6.enableComplexMapKeySerialization();
        gsonBuilder6.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray10 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder6.setExclusionStrategies(exclusionStrategyArray10);
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder1.setExclusionStrategies(exclusionStrategyArray10);
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder1.disableInnerClassSerialization();
        gsonBuilder1.generateNonExecutableJson = true;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(exclusionStrategyArray10);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray10, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertNotNull(gsonBuilder13);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test504");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.Gson gson2 = gsonBuilder1.create();
        gsonBuilder1.serializeNulls = false;
        boolean boolean5 = gsonBuilder1.complexMapKeySerialization;
        gsonBuilder1.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder1.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder8.excludeFieldsWithoutExposeAnnotation();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder9.setDateFormat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date pattern 'hi!' is not valid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gson2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder9);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test505");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        gsonBuilder0.timeStyle = (short) 1;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue10 = gsonBuilder9.reflectionFilters;
        gsonBuilder9.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.setDateFormat((int) (short) 0);
        int[] intArray15 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder14.excludeFieldsWithModifiers(intArray15);
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue18 = gsonBuilder17.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder19.enableComplexMapKeySerialization();
        gsonBuilder19.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray23 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder19.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder17.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.FormattingStyle formattingStyle26 = gsonBuilder17.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy27 = gsonBuilder17.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder16.setFieldNamingStrategy(fieldNamingStrategy27);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder0.setFieldNamingStrategy(fieldNamingStrategy27);
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder29.disableInnerClassSerialization();
        boolean boolean31 = gsonBuilder29.serializeNulls;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue10);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue18);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(exclusionStrategyArray23);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray23, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(formattingStyle26);
        org.junit.Assert.assertNotNull(fieldNamingStrategy27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test506");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList4 = gsonBuilder0.hierarchyFactories;
        com.google.gson.Strictness strictness5 = gsonBuilder0.strictness;
        com.google.gson.Strictness strictness6 = null;
        gsonBuilder0.strictness = strictness6;
        java.lang.String str8 = gsonBuilder0.datePattern;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        boolean boolean12 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        boolean boolean15 = gsonBuilder13.useJdkUnsafe;
        boolean boolean16 = gsonBuilder13.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy17 = gsonBuilder13.objectToNumberStrategy;
        gsonBuilder11.objectToNumberStrategy = toNumberStrategy17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder11.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy21 = gsonBuilder20.longSerializationPolicy;
        gsonBuilder11.longSerializationPolicy = longSerializationPolicy21;
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder9.setLongSerializationPolicy(longSerializationPolicy21);
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder9.disableInnerClassSerialization();
        int[] intArray27 = new int[] { 1, (byte) 1 };
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder9.excludeFieldsWithModifiers(intArray27);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder0.excludeFieldsWithModifiers(intArray27);
        int int30 = gsonBuilder29.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder29.disableInnerClassSerialization();
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList4);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(longSerializationPolicy21);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1 });
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder31);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test507");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        gsonBuilder1.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder6.enableComplexMapKeySerialization();
        gsonBuilder6.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray10 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder6.setExclusionStrategies(exclusionStrategyArray10);
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder1.setExclusionStrategies(exclusionStrategyArray10);
        com.google.gson.Strictness strictness13 = null;
        gsonBuilder1.strictness = strictness13;
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder1.disableHtmlEscaping();
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(exclusionStrategyArray10);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray10, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertNotNull(gsonBuilder15);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test508");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy3 = null;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy3;
        gsonBuilder0.generateNonExecutableJson = true;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy7 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy7;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder10.setVersion((double) 10);
        gsonBuilder10.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder17 = gsonBuilder15.excluder;
        gsonBuilder10.excluder = excluder17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder0.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder17);
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue21 = gsonBuilder20.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder22 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder22.enableComplexMapKeySerialization();
        gsonBuilder22.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray26 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder22.setExclusionStrategies(exclusionStrategyArray26);
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder20.setExclusionStrategies(exclusionStrategyArray26);
        com.google.gson.FormattingStyle formattingStyle29 = gsonBuilder20.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder30 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder30.enableComplexMapKeySerialization();
        gsonBuilder30.serializeSpecialFloatingPointValues = true;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue34 = gsonBuilder30.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder35 = new com.google.gson.GsonBuilder();
        boolean boolean36 = gsonBuilder35.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder37 = new com.google.gson.GsonBuilder();
        boolean boolean38 = gsonBuilder37.complexMapKeySerialization;
        boolean boolean39 = gsonBuilder37.useJdkUnsafe;
        boolean boolean40 = gsonBuilder37.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy41 = gsonBuilder37.objectToNumberStrategy;
        gsonBuilder35.objectToNumberStrategy = toNumberStrategy41;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList43 = gsonBuilder35.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder44 = gsonBuilder35.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder45 = gsonBuilder44.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle46 = gsonBuilder45.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder47 = gsonBuilder30.setFormattingStyle(formattingStyle46);
        com.google.gson.GsonBuilder gsonBuilder48 = gsonBuilder20.setFormattingStyle(formattingStyle46);
        com.google.gson.GsonBuilder gsonBuilder49 = gsonBuilder48.generateNonExecutableJson();
        com.google.gson.internal.Excluder excluder50 = gsonBuilder49.excluder;
        gsonBuilder0.excluder = excluder50;
        com.google.gson.GsonBuilder gsonBuilder52 = gsonBuilder0.setLenient();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue21);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(exclusionStrategyArray26);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray26, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(formattingStyle29);
        org.junit.Assert.assertNotNull(gsonBuilder31);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy41);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList43);
        org.junit.Assert.assertNotNull(gsonBuilder44);
        org.junit.Assert.assertNotNull(gsonBuilder45);
        org.junit.Assert.assertNotNull(formattingStyle46);
        org.junit.Assert.assertNotNull(gsonBuilder47);
        org.junit.Assert.assertNotNull(gsonBuilder48);
        org.junit.Assert.assertNotNull(gsonBuilder49);
        org.junit.Assert.assertNotNull(excluder50);
        org.junit.Assert.assertNotNull(gsonBuilder52);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test509");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.setVersion((double) 10);
        gsonBuilder8.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder15 = gsonBuilder13.excluder;
        gsonBuilder8.excluder = excluder15;
        gsonBuilder0.excluder = excluder15;
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.complexMapKeySerialization = false;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder0.serializeSpecialFloatingPointValues();
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder0.generateNonExecutableJson();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder22);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test510");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.Gson gson2 = gsonBuilder1.create();
        gsonBuilder1.serializeNulls = false;
        boolean boolean5 = gsonBuilder1.complexMapKeySerialization;
        gsonBuilder1.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder1.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder8.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        boolean boolean11 = gsonBuilder10.complexMapKeySerialization;
        boolean boolean12 = gsonBuilder10.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder10.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder10.disableHtmlEscaping();
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList15 = gsonBuilder10.factories;
        com.google.gson.FormattingStyle formattingStyle16 = gsonBuilder10.formattingStyle;
        gsonBuilder8.formattingStyle = formattingStyle16;
        gsonBuilder8.escapeHtmlChars = true;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gson2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList15);
        org.junit.Assert.assertNotNull(formattingStyle16);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test511");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.serializeSpecialFloatingPointValues = true;
        boolean boolean4 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.Strictness strictness5 = gsonBuilder0.strictness;
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder0.setVersion((double) 0.0f);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.disableJdkUnsafe();
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test512");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList8 = gsonBuilder0.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder0.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder9.disableHtmlEscaping();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy12 = gsonBuilder9.fieldNamingPolicy;
        gsonBuilder9.timeStyle = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList8);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(fieldNamingStrategy12);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test513");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        gsonBuilder0.useJdkUnsafe = false;
        gsonBuilder0.dateStyle = 0;
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder10.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder11.setVersion((double) 10);
        gsonBuilder11.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        boolean boolean17 = gsonBuilder16.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder18 = gsonBuilder16.excluder;
        gsonBuilder11.excluder = excluder18;
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder0.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder18);
        gsonBuilder0.generateNonExecutableJson = false;
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder23.setPrettyPrinting();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(excluder18);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test514");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        gsonBuilder0.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setDateFormat((int) (short) 0);
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder0.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder();
        boolean boolean9 = gsonBuilder8.complexMapKeySerialization;
        boolean boolean10 = gsonBuilder8.useJdkUnsafe;
        boolean boolean11 = gsonBuilder8.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy12 = gsonBuilder8.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy13 = null;
        gsonBuilder8.fieldNamingPolicy = fieldNamingStrategy13;
        com.google.gson.ToNumberStrategy toNumberStrategy15 = gsonBuilder8.numberToNumberStrategy;
        boolean boolean16 = gsonBuilder8.useJdkUnsafe;
        gsonBuilder8.datePattern = "";
        com.google.gson.internal.Excluder excluder19 = gsonBuilder8.excluder;
        gsonBuilder7.excluder = excluder19;
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy12);
        org.junit.Assert.assertNotNull(toNumberStrategy15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(excluder19);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test515");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList4 = gsonBuilder0.hierarchyFactories;
        com.google.gson.Strictness strictness5 = gsonBuilder0.strictness;
        com.google.gson.Strictness strictness6 = null;
        gsonBuilder0.strictness = strictness6;
        java.lang.String str8 = gsonBuilder0.datePattern;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        boolean boolean12 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        boolean boolean15 = gsonBuilder13.useJdkUnsafe;
        boolean boolean16 = gsonBuilder13.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy17 = gsonBuilder13.objectToNumberStrategy;
        gsonBuilder11.objectToNumberStrategy = toNumberStrategy17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder11.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy21 = gsonBuilder20.longSerializationPolicy;
        gsonBuilder11.longSerializationPolicy = longSerializationPolicy21;
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder9.setLongSerializationPolicy(longSerializationPolicy21);
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder9.disableInnerClassSerialization();
        int[] intArray27 = new int[] { 1, (byte) 1 };
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder9.excludeFieldsWithModifiers(intArray27);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder0.excludeFieldsWithModifiers(intArray27);
        int int30 = gsonBuilder29.dateStyle;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder29.setDateFormat((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList4);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(longSerializationPolicy21);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1 });
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test516");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        gsonBuilder0.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setDateFormat((int) (short) 0);
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
        gsonBuilder0.generateNonExecutableJson = true;
        gsonBuilder0.escapeHtmlChars = false;
        gsonBuilder0.useJdkUnsafe = true;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        boolean boolean15 = gsonBuilder13.useJdkUnsafe;
        boolean boolean16 = gsonBuilder13.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy17 = gsonBuilder13.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList18 = gsonBuilder13.factories;
        com.google.gson.Gson gson19 = gsonBuilder13.create();
        int int20 = gsonBuilder13.timeStyle;
        com.google.gson.Gson gson21 = gsonBuilder13.create();
        com.google.gson.internal.ConstructorConstructor constructorConstructor22 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.GsonBuilder gsonBuilder23 = new com.google.gson.GsonBuilder();
        boolean boolean24 = gsonBuilder23.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder25 = gsonBuilder23.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor26 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory27 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList28 = gsonBuilder23.createFactories(constructorConstructor26, jsonAdapterAnnotationTypeAdapterFactory27);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList29 = gsonBuilder13.createFactories(constructorConstructor22, jsonAdapterAnnotationTypeAdapterFactory27);
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder0.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory27);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy17);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList18);
        org.junit.Assert.assertNotNull(gson19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(gson21);
        org.junit.Assert.assertNotNull(constructorConstructor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(excluder25);
        org.junit.Assert.assertNotNull(constructorConstructor26);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory27);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList28);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList29);
        org.junit.Assert.assertNotNull(gsonBuilder30);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test517");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        boolean boolean6 = gsonBuilder5.serializeSpecialFloatingPointValues;
        int int7 = gsonBuilder5.dateStyle;
        boolean boolean8 = gsonBuilder5.useJdkUnsafe;
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test518");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy3 = null;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy3;
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder5.setLenient();
        com.google.gson.internal.Excluder excluder7 = gsonBuilder5.excluder;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(excluder7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test519");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Strictness strictness6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder0.setStrictness(strictness6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test520");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.setVersion((double) 10);
        gsonBuilder8.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder15 = gsonBuilder13.excluder;
        gsonBuilder8.excluder = excluder15;
        gsonBuilder0.excluder = excluder15;
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.complexMapKeySerialization = false;
        com.google.gson.ReflectionAccessFilter reflectionAccessFilter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder0.addReflectionAccessFilter(reflectionAccessFilter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertNotNull(gsonBuilder18);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test521");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        com.google.gson.GsonBuilder gsonBuilder3 = new com.google.gson.GsonBuilder();
        boolean boolean4 = gsonBuilder3.complexMapKeySerialization;
        boolean boolean5 = gsonBuilder3.useJdkUnsafe;
        int int6 = gsonBuilder3.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        boolean boolean12 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder13 = gsonBuilder11.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy14 = gsonBuilder11.numberToNumberStrategy;
        gsonBuilder10.objectToNumberStrategy = toNumberStrategy14;
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        boolean boolean17 = gsonBuilder16.complexMapKeySerialization;
        boolean boolean18 = gsonBuilder16.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy19 = null;
        gsonBuilder16.longSerializationPolicy = longSerializationPolicy19;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder16.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder22 = new com.google.gson.GsonBuilder();
        boolean boolean23 = gsonBuilder22.complexMapKeySerialization;
        boolean boolean24 = gsonBuilder22.useJdkUnsafe;
        boolean boolean25 = gsonBuilder22.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy26 = gsonBuilder22.objectToNumberStrategy;
        gsonBuilder21.numberToNumberStrategy = toNumberStrategy26;
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder10.setNumberToNumberStrategy(toNumberStrategy26);
        gsonBuilder3.numberToNumberStrategy = toNumberStrategy26;
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder0.setObjectToNumberStrategy(toNumberStrategy26);
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder0.serializeNulls();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy34 = gsonBuilder33.fieldNamingPolicy;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(excluder13);
        org.junit.Assert.assertNotNull(toNumberStrategy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy26);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertNotNull(fieldNamingStrategy34);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test522");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.Gson gson2 = gsonBuilder1.create();
        gsonBuilder1.serializeNulls = false;
        com.google.gson.Strictness strictness5 = gsonBuilder1.strictness;
        com.google.gson.Strictness strictness6 = gsonBuilder1.strictness;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gson2);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNull(strictness6);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test523");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.Gson gson2 = gsonBuilder1.create();
        gsonBuilder1.serializeNulls = false;
        boolean boolean5 = gsonBuilder1.complexMapKeySerialization;
        gsonBuilder1.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder1.disableHtmlEscaping();
        com.google.gson.ToNumberStrategy toNumberStrategy9 = gsonBuilder1.numberToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder1.disableInnerClassSerialization();
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gson2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(toNumberStrategy9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test524");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        gsonBuilder1.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder6.enableComplexMapKeySerialization();
        gsonBuilder6.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray10 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder6.setExclusionStrategies(exclusionStrategyArray10);
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder1.setExclusionStrategies(exclusionStrategyArray10);
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy14 = null;
        gsonBuilder13.numberToNumberStrategy = toNumberStrategy14;
        com.google.gson.Strictness strictness16 = null;
        gsonBuilder13.strictness = strictness16;
        com.google.gson.LongSerializationPolicy longSerializationPolicy18 = gsonBuilder13.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder13.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder20 = com.google.gson.GsonBuilder.DEFAULT;
        gsonBuilder20.dateStyle = (byte) 100;
        com.google.gson.GsonBuilder gsonBuilder23 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy24 = gsonBuilder23.longSerializationPolicy;
        gsonBuilder20.longSerializationPolicy = longSerializationPolicy24;
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder13.setLongSerializationPolicy(longSerializationPolicy24);
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder1.setLongSerializationPolicy(longSerializationPolicy24);
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(exclusionStrategyArray10);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray10, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertNotNull(longSerializationPolicy18);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(longSerializationPolicy24);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test525");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.ReflectionAccessFilter reflectionAccessFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder0.addReflectionAccessFilter(reflectionAccessFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(gsonBuilder4);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test526");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        boolean boolean6 = gsonBuilder5.serializeSpecialFloatingPointValues;
        gsonBuilder5.generateNonExecutableJson = true;
        com.google.gson.FormattingStyle formattingStyle9 = gsonBuilder5.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> typeMap11 = gsonBuilder10.instanceCreators;
        gsonBuilder10.serializeSpecialFloatingPointValues = true;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList14 = gsonBuilder10.hierarchyFactories;
        com.google.gson.ToNumberStrategy toNumberStrategy15 = gsonBuilder10.objectToNumberStrategy;
        gsonBuilder5.objectToNumberStrategy = toNumberStrategy15;
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(formattingStyle9);
        org.junit.Assert.assertNotNull(typeMap11);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList14);
        org.junit.Assert.assertNotNull(toNumberStrategy15);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test527");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        boolean boolean6 = gsonBuilder4.useJdkUnsafe;
        boolean boolean7 = gsonBuilder4.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy8 = gsonBuilder4.objectToNumberStrategy;
        gsonBuilder2.objectToNumberStrategy = toNumberStrategy8;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder2.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = gsonBuilder11.longSerializationPolicy;
        gsonBuilder2.longSerializationPolicy = longSerializationPolicy12;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder0.setLongSerializationPolicy(longSerializationPolicy12);
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder0.disableInnerClassSerialization();
        boolean boolean16 = gsonBuilder0.serializeNulls;
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder0.disableInnerClassSerialization();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(longSerializationPolicy12);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gsonBuilder17);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test528");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder6 = gsonBuilder4.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy7 = gsonBuilder4.numberToNumberStrategy;
        gsonBuilder3.objectToNumberStrategy = toNumberStrategy7;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = null;
        gsonBuilder9.longSerializationPolicy = longSerializationPolicy12;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        boolean boolean17 = gsonBuilder15.useJdkUnsafe;
        boolean boolean18 = gsonBuilder15.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy19 = gsonBuilder15.objectToNumberStrategy;
        gsonBuilder14.numberToNumberStrategy = toNumberStrategy19;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder3.setNumberToNumberStrategy(toNumberStrategy19);
        com.google.gson.GsonBuilder gsonBuilder22 = new com.google.gson.GsonBuilder();
        boolean boolean23 = gsonBuilder22.complexMapKeySerialization;
        boolean boolean24 = gsonBuilder22.useJdkUnsafe;
        boolean boolean25 = gsonBuilder22.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy26 = gsonBuilder22.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy27 = null;
        gsonBuilder22.fieldNamingPolicy = fieldNamingStrategy27;
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder22.setDateFormat("");
        com.google.gson.FormattingStyle formattingStyle31 = gsonBuilder22.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder21.setFormattingStyle(formattingStyle31);
        com.google.gson.ToNumberStrategy toNumberStrategy33 = gsonBuilder32.objectToNumberStrategy;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(toNumberStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy19);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy26);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertNotNull(formattingStyle31);
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertNotNull(toNumberStrategy33);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test529");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder11 = gsonBuilder9.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor12 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory13 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList14 = gsonBuilder9.createFactories(constructorConstructor12, jsonAdapterAnnotationTypeAdapterFactory13);
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder15.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder16.setVersion((double) 10);
        com.google.gson.ToNumberStrategy toNumberStrategy19 = gsonBuilder18.numberToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList20 = gsonBuilder18.factories;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder18.disableHtmlEscaping();
        com.google.gson.internal.ConstructorConstructor constructorConstructor22 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.GsonBuilder gsonBuilder23 = new com.google.gson.GsonBuilder();
        boolean boolean24 = gsonBuilder23.complexMapKeySerialization;
        boolean boolean25 = gsonBuilder23.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder23.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder23.disableHtmlEscaping();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory28 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder27.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory28);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList30 = gsonBuilder21.createFactories(constructorConstructor22, jsonAdapterAnnotationTypeAdapterFactory28);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList31 = gsonBuilder8.createFactories(constructorConstructor12, jsonAdapterAnnotationTypeAdapterFactory28);
        boolean boolean32 = gsonBuilder8.useJdkUnsafe;
        gsonBuilder8.complexMapKeySerialization = false;
        gsonBuilder8.dateStyle = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(excluder11);
        org.junit.Assert.assertNotNull(constructorConstructor12);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory13);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList14);
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertNotNull(toNumberStrategy19);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList20);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(constructorConstructor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList30);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test530");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        gsonBuilder0.useJdkUnsafe = false;
        int int8 = gsonBuilder0.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.internal.Excluder excluder10 = gsonBuilder0.excluder;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertNotNull(excluder10);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test531");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue7 = gsonBuilder6.reflectionFilters;
        gsonBuilder6.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder6.setDateFormat((int) (short) 0);
        int[] intArray12 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder11.excludeFieldsWithModifiers(intArray12);
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue15 = gsonBuilder14.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder16.enableComplexMapKeySerialization();
        gsonBuilder16.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray20 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder16.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder14.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.FormattingStyle formattingStyle23 = gsonBuilder14.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy24 = gsonBuilder14.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder13.setFieldNamingStrategy(fieldNamingStrategy24);
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder5.setFieldNamingStrategy(fieldNamingStrategy24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.Gson gson27 = gsonBuilder26.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue7);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue15);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(exclusionStrategyArray20);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray20, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(formattingStyle23);
        org.junit.Assert.assertNotNull(fieldNamingStrategy24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(gsonBuilder26);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test532");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList8 = gsonBuilder0.hierarchyFactories;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList9 = gsonBuilder0.hierarchyFactories;
        gsonBuilder0.timeStyle = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList8);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList9);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test533");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder8 = com.google.gson.GsonBuilder.DEFAULT;
        gsonBuilder8.dateStyle = (byte) 100;
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy12 = null;
        gsonBuilder11.numberToNumberStrategy = toNumberStrategy12;
        gsonBuilder11.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder11.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue18 = gsonBuilder17.reflectionFilters;
        gsonBuilder17.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder17.setDateFormat((int) (short) 0);
        int[] intArray23 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder22.excludeFieldsWithModifiers(intArray23);
        com.google.gson.GsonBuilder gsonBuilder25 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue26 = gsonBuilder25.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder27 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder27.enableComplexMapKeySerialization();
        gsonBuilder27.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray31 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder27.setExclusionStrategies(exclusionStrategyArray31);
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder25.setExclusionStrategies(exclusionStrategyArray31);
        com.google.gson.FormattingStyle formattingStyle34 = gsonBuilder25.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy35 = gsonBuilder25.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder36 = gsonBuilder24.setFieldNamingStrategy(fieldNamingStrategy35);
        com.google.gson.GsonBuilder gsonBuilder37 = gsonBuilder16.setFieldNamingStrategy(fieldNamingStrategy35);
        gsonBuilder8.fieldNamingPolicy = fieldNamingStrategy35;
        com.google.gson.GsonBuilder gsonBuilder39 = gsonBuilder7.setFieldNamingStrategy(fieldNamingStrategy35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue18);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue26);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(exclusionStrategyArray31);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray31, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertNotNull(formattingStyle34);
        org.junit.Assert.assertNotNull(fieldNamingStrategy35);
        org.junit.Assert.assertNotNull(gsonBuilder36);
        org.junit.Assert.assertNotNull(gsonBuilder37);
        org.junit.Assert.assertNotNull(gsonBuilder39);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test534");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.serializeSpecialFloatingPointValues = true;
        boolean boolean4 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean5 = gsonBuilder0.generateNonExecutableJson;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test535");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList6 = gsonBuilder5.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        boolean boolean8 = gsonBuilder7.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        boolean boolean12 = gsonBuilder9.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy13 = gsonBuilder9.objectToNumberStrategy;
        gsonBuilder7.objectToNumberStrategy = toNumberStrategy13;
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        boolean boolean17 = gsonBuilder16.complexMapKeySerialization;
        boolean boolean18 = gsonBuilder16.useJdkUnsafe;
        boolean boolean19 = gsonBuilder16.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy20 = gsonBuilder16.objectToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder15.setNumberToNumberStrategy(toNumberStrategy20);
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder5.setNumberToNumberStrategy(toNumberStrategy20);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList23 = gsonBuilder5.factories;
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder5.setLenient();
        com.google.gson.GsonBuilder gsonBuilder25 = new com.google.gson.GsonBuilder();
        boolean boolean26 = gsonBuilder25.complexMapKeySerialization;
        boolean boolean27 = gsonBuilder25.useJdkUnsafe;
        boolean boolean28 = gsonBuilder25.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy29 = gsonBuilder25.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList30 = gsonBuilder25.factories;
        com.google.gson.Gson gson31 = gsonBuilder25.create();
        int int32 = gsonBuilder25.timeStyle;
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder25.serializeSpecialFloatingPointValues();
        com.google.gson.GsonBuilder gsonBuilder34 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder35 = gsonBuilder34.enableComplexMapKeySerialization();
        gsonBuilder34.serializeSpecialFloatingPointValues = true;
        boolean boolean38 = gsonBuilder34.complexMapKeySerialization;
        com.google.gson.Strictness strictness39 = gsonBuilder34.strictness;
        com.google.gson.GsonBuilder gsonBuilder40 = gsonBuilder34.generateNonExecutableJson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor41 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.GsonBuilder gsonBuilder42 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder43 = gsonBuilder42.enableComplexMapKeySerialization();
        com.google.gson.Gson gson44 = gsonBuilder43.create();
        gsonBuilder43.serializeNulls = false;
        boolean boolean47 = gsonBuilder43.complexMapKeySerialization;
        gsonBuilder43.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder50 = gsonBuilder43.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder51 = new com.google.gson.GsonBuilder();
        boolean boolean52 = gsonBuilder51.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder53 = gsonBuilder51.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor54 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory55 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList56 = gsonBuilder51.createFactories(constructorConstructor54, jsonAdapterAnnotationTypeAdapterFactory55);
        com.google.gson.GsonBuilder gsonBuilder57 = gsonBuilder43.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory55);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList58 = gsonBuilder34.createFactories(constructorConstructor41, jsonAdapterAnnotationTypeAdapterFactory55);
        com.google.gson.GsonBuilder gsonBuilder59 = new com.google.gson.GsonBuilder();
        boolean boolean60 = gsonBuilder59.complexMapKeySerialization;
        boolean boolean61 = gsonBuilder59.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder62 = gsonBuilder59.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder63 = gsonBuilder59.disableHtmlEscaping();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory64 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder65 = gsonBuilder63.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory64);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList66 = gsonBuilder33.createFactories(constructorConstructor41, jsonAdapterAnnotationTypeAdapterFactory64);
        com.google.gson.GsonBuilder gsonBuilder67 = new com.google.gson.GsonBuilder();
        boolean boolean68 = gsonBuilder67.complexMapKeySerialization;
        boolean boolean69 = gsonBuilder67.useJdkUnsafe;
        boolean boolean70 = gsonBuilder67.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy71 = gsonBuilder67.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList72 = gsonBuilder67.factories;
        com.google.gson.Gson gson73 = gsonBuilder67.create();
        com.google.gson.GsonBuilder gsonBuilder74 = new com.google.gson.GsonBuilder(gson73);
        com.google.gson.GsonBuilder gsonBuilder75 = new com.google.gson.GsonBuilder(gson73);
        com.google.gson.GsonBuilder gsonBuilder76 = new com.google.gson.GsonBuilder();
        boolean boolean77 = gsonBuilder76.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder78 = gsonBuilder76.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor79 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory80 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList81 = gsonBuilder76.createFactories(constructorConstructor79, jsonAdapterAnnotationTypeAdapterFactory80);
        com.google.gson.GsonBuilder gsonBuilder82 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder83 = gsonBuilder82.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder85 = gsonBuilder83.setVersion((double) 10);
        com.google.gson.ToNumberStrategy toNumberStrategy86 = gsonBuilder85.numberToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList87 = gsonBuilder85.factories;
        com.google.gson.GsonBuilder gsonBuilder88 = gsonBuilder85.disableHtmlEscaping();
        com.google.gson.internal.ConstructorConstructor constructorConstructor89 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.GsonBuilder gsonBuilder90 = new com.google.gson.GsonBuilder();
        boolean boolean91 = gsonBuilder90.complexMapKeySerialization;
        boolean boolean92 = gsonBuilder90.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder93 = gsonBuilder90.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder94 = gsonBuilder90.disableHtmlEscaping();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory95 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder96 = gsonBuilder94.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory95);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList97 = gsonBuilder88.createFactories(constructorConstructor89, jsonAdapterAnnotationTypeAdapterFactory95);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList98 = gsonBuilder75.createFactories(constructorConstructor79, jsonAdapterAnnotationTypeAdapterFactory95);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList99 = gsonBuilder24.createFactories(constructorConstructor41, jsonAdapterAnnotationTypeAdapterFactory95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy13);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy20);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy29);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList30);
        org.junit.Assert.assertNotNull(gson31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertNotNull(gsonBuilder35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(strictness39);
        org.junit.Assert.assertNotNull(gsonBuilder40);
        org.junit.Assert.assertNotNull(constructorConstructor41);
        org.junit.Assert.assertNotNull(gsonBuilder43);
        org.junit.Assert.assertNotNull(gson44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(gsonBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(excluder53);
        org.junit.Assert.assertNotNull(constructorConstructor54);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory55);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList56);
        org.junit.Assert.assertNotNull(gsonBuilder57);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(gsonBuilder62);
        org.junit.Assert.assertNotNull(gsonBuilder63);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory64);
        org.junit.Assert.assertNotNull(gsonBuilder65);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy71);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList72);
        org.junit.Assert.assertNotNull(gson73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(excluder78);
        org.junit.Assert.assertNotNull(constructorConstructor79);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory80);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList81);
        org.junit.Assert.assertNotNull(gsonBuilder83);
        org.junit.Assert.assertNotNull(gsonBuilder85);
        org.junit.Assert.assertNotNull(toNumberStrategy86);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList87);
        org.junit.Assert.assertNotNull(gsonBuilder88);
        org.junit.Assert.assertNotNull(constructorConstructor89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(gsonBuilder93);
        org.junit.Assert.assertNotNull(gsonBuilder94);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory95);
        org.junit.Assert.assertNotNull(gsonBuilder96);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList97);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList98);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test536");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        gsonBuilder0.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder();
        boolean boolean9 = gsonBuilder8.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        boolean boolean11 = gsonBuilder10.complexMapKeySerialization;
        boolean boolean12 = gsonBuilder10.useJdkUnsafe;
        boolean boolean13 = gsonBuilder10.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy14 = gsonBuilder10.objectToNumberStrategy;
        gsonBuilder8.objectToNumberStrategy = toNumberStrategy14;
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder8.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder16.setDateFormat("");
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        boolean boolean20 = gsonBuilder19.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder21 = new com.google.gson.GsonBuilder();
        boolean boolean22 = gsonBuilder21.complexMapKeySerialization;
        boolean boolean23 = gsonBuilder21.useJdkUnsafe;
        boolean boolean24 = gsonBuilder21.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy25 = gsonBuilder21.objectToNumberStrategy;
        gsonBuilder19.objectToNumberStrategy = toNumberStrategy25;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList27 = gsonBuilder19.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder19.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder28.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle30 = gsonBuilder29.formattingStyle;
        gsonBuilder16.formattingStyle = formattingStyle30;
        gsonBuilder0.formattingStyle = formattingStyle30;
        com.google.gson.GsonBuilder gsonBuilder34 = gsonBuilder0.setDateFormat(2);
        com.google.gson.ToNumberStrategy toNumberStrategy35 = gsonBuilder34.objectToNumberStrategy;
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy14);
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy25);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(formattingStyle30);
        org.junit.Assert.assertNotNull(gsonBuilder34);
        org.junit.Assert.assertNotNull(toNumberStrategy35);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test537");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        gsonBuilder0.timeStyle = (short) 1;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue10 = gsonBuilder9.reflectionFilters;
        gsonBuilder9.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.setDateFormat((int) (short) 0);
        int[] intArray15 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder14.excludeFieldsWithModifiers(intArray15);
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue18 = gsonBuilder17.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder19.enableComplexMapKeySerialization();
        gsonBuilder19.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray23 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder19.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder17.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.FormattingStyle formattingStyle26 = gsonBuilder17.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy27 = gsonBuilder17.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder16.setFieldNamingStrategy(fieldNamingStrategy27);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder0.setFieldNamingStrategy(fieldNamingStrategy27);
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder29.setPrettyPrinting();
        gsonBuilder30.timeStyle = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue10);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue18);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(exclusionStrategyArray23);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray23, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(formattingStyle26);
        org.junit.Assert.assertNotNull(fieldNamingStrategy27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(gsonBuilder30);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test538");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder6 = gsonBuilder4.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy7 = gsonBuilder4.numberToNumberStrategy;
        gsonBuilder3.objectToNumberStrategy = toNumberStrategy7;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = null;
        gsonBuilder9.longSerializationPolicy = longSerializationPolicy12;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        boolean boolean17 = gsonBuilder15.useJdkUnsafe;
        boolean boolean18 = gsonBuilder15.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy19 = gsonBuilder15.objectToNumberStrategy;
        gsonBuilder14.numberToNumberStrategy = toNumberStrategy19;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder3.setNumberToNumberStrategy(toNumberStrategy19);
        boolean boolean22 = gsonBuilder21.serializeNulls;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder21.setDateFormat((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(toNumberStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy19);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test539");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.serializeSpecialFloatingPointValues = true;
        boolean boolean4 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.Strictness strictness5 = gsonBuilder0.strictness;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder6.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder7.setVersion((double) 1L);
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder9);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test540");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.enableComplexMapKeySerialization();
        gsonBuilder2.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray6 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder2.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.FormattingStyle formattingStyle9 = gsonBuilder0.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder10.enableComplexMapKeySerialization();
        gsonBuilder10.serializeSpecialFloatingPointValues = true;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue14 = gsonBuilder10.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        boolean boolean18 = gsonBuilder17.complexMapKeySerialization;
        boolean boolean19 = gsonBuilder17.useJdkUnsafe;
        boolean boolean20 = gsonBuilder17.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy21 = gsonBuilder17.objectToNumberStrategy;
        gsonBuilder15.objectToNumberStrategy = toNumberStrategy21;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList23 = gsonBuilder15.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder15.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder24.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle26 = gsonBuilder25.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder10.setFormattingStyle(formattingStyle26);
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder0.setFormattingStyle(formattingStyle26);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder28.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder28.generateNonExecutableJson();
        boolean boolean31 = gsonBuilder28.useJdkUnsafe;
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(exclusionStrategyArray6);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray6, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(formattingStyle9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy21);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(formattingStyle26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test541");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.setVersion((double) 10);
        gsonBuilder8.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder15 = gsonBuilder13.excluder;
        gsonBuilder8.excluder = excluder15;
        gsonBuilder0.excluder = excluder15;
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder0.disableInnerClassSerialization();
        boolean boolean19 = gsonBuilder18.complexMapKeySerialization;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test542");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory5 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder4.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory5);
        boolean boolean7 = gsonBuilder6.useJdkUnsafe;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue8 = gsonBuilder6.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.serializeNulls;
        gsonBuilder9.serializeNulls = false;
        com.google.gson.ToNumberStrategy toNumberStrategy14 = gsonBuilder9.objectToNumberStrategy;
        gsonBuilder6.objectToNumberStrategy = toNumberStrategy14;
        com.google.gson.Gson gson16 = gsonBuilder6.create();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy14);
        org.junit.Assert.assertNotNull(gson16);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test543");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.serializeSpecialFloatingPointValues = true;
        boolean boolean4 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.Strictness strictness5 = gsonBuilder0.strictness;
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder0.setVersion((double) 0.0f);
        java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> typeMap8 = gsonBuilder7.instanceCreators;
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder7.disableJdkUnsafe();
        boolean boolean10 = gsonBuilder7.useJdkUnsafe;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(typeMap8);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test544");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.serializeNulls;
        com.google.gson.Strictness strictness3 = null;
        gsonBuilder0.strictness = strictness3;
        com.google.gson.GsonBuilder gsonBuilder5 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder5.enableComplexMapKeySerialization();
        com.google.gson.Gson gson7 = gsonBuilder6.create();
        gsonBuilder6.serializeNulls = false;
        boolean boolean10 = gsonBuilder6.complexMapKeySerialization;
        gsonBuilder6.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder6.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        boolean boolean15 = gsonBuilder14.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder16 = gsonBuilder14.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor17 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory18 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList19 = gsonBuilder14.createFactories(constructorConstructor17, jsonAdapterAnnotationTypeAdapterFactory18);
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder6.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory18);
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder0.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory18);
        boolean boolean22 = gsonBuilder21.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder21.disableHtmlEscaping();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(gson7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(excluder16);
        org.junit.Assert.assertNotNull(constructorConstructor17);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory18);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList19);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gsonBuilder23);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test545");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList6 = gsonBuilder5.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        boolean boolean8 = gsonBuilder7.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        boolean boolean12 = gsonBuilder9.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy13 = gsonBuilder9.objectToNumberStrategy;
        gsonBuilder7.objectToNumberStrategy = toNumberStrategy13;
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        boolean boolean17 = gsonBuilder16.complexMapKeySerialization;
        boolean boolean18 = gsonBuilder16.useJdkUnsafe;
        boolean boolean19 = gsonBuilder16.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy20 = gsonBuilder16.objectToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder15.setNumberToNumberStrategy(toNumberStrategy20);
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder5.setNumberToNumberStrategy(toNumberStrategy20);
        com.google.gson.LongSerializationPolicy longSerializationPolicy23 = gsonBuilder5.longSerializationPolicy;
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy13);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy20);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(longSerializationPolicy23);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test546");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.serializeNulls;
        gsonBuilder0.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue7 = gsonBuilder6.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder8.enableComplexMapKeySerialization();
        gsonBuilder8.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray12 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder8.setExclusionStrategies(exclusionStrategyArray12);
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder6.setExclusionStrategies(exclusionStrategyArray12);
        com.google.gson.FormattingStyle formattingStyle15 = gsonBuilder6.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy16 = gsonBuilder6.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder5.setFieldNamingStrategy(fieldNamingStrategy16);
        gsonBuilder5.escapeHtmlChars = true;
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder5.generateNonExecutableJson();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue7);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertNotNull(exclusionStrategyArray12);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray12, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(formattingStyle15);
        org.junit.Assert.assertNotNull(fieldNamingStrategy16);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(gsonBuilder20);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test547");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue7 = gsonBuilder6.reflectionFilters;
        gsonBuilder6.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder6.setDateFormat((int) (short) 0);
        int[] intArray12 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder11.excludeFieldsWithModifiers(intArray12);
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue15 = gsonBuilder14.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder16.enableComplexMapKeySerialization();
        gsonBuilder16.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray20 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder16.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder14.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.FormattingStyle formattingStyle23 = gsonBuilder14.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy24 = gsonBuilder14.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder13.setFieldNamingStrategy(fieldNamingStrategy24);
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder5.setFieldNamingStrategy(fieldNamingStrategy24);
        com.google.gson.LongSerializationPolicy longSerializationPolicy27 = gsonBuilder5.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder28 = com.google.gson.GsonBuilder.DEFAULT;
        boolean boolean29 = gsonBuilder28.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder28.setPrettyPrinting();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy31 = gsonBuilder28.fieldNamingPolicy;
        gsonBuilder5.fieldNamingPolicy = fieldNamingStrategy31;
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue7);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue15);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(exclusionStrategyArray20);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray20, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(formattingStyle23);
        org.junit.Assert.assertNotNull(fieldNamingStrategy24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertNotNull(longSerializationPolicy27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
// flaky "1) test547(com.google.gson.GsonBuilderRegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertNotNull(fieldNamingStrategy31);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test548");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList2 = gsonBuilder0.factories;
        boolean boolean3 = gsonBuilder0.serializeNulls;
        com.google.gson.ReflectionAccessFilter reflectionAccessFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.addReflectionAccessFilter(reflectionAccessFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test549");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder(gson6);
        gsonBuilder10.escapeHtmlChars = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test550");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.datePattern = "";
        boolean boolean4 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.disableInnerClassSerialization();
        gsonBuilder5.escapeHtmlChars = true;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder5.serializeSpecialFloatingPointValues();
        com.google.gson.LongSerializationPolicy longSerializationPolicy9 = gsonBuilder8.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.serializeNulls();
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(longSerializationPolicy9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test551");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        int int2 = gsonBuilder0.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder3 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy4 = gsonBuilder3.longSerializationPolicy;
        gsonBuilder3.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList7 = gsonBuilder3.hierarchyFactories;
        com.google.gson.Strictness strictness8 = gsonBuilder3.strictness;
        com.google.gson.LongSerializationPolicy longSerializationPolicy9 = gsonBuilder3.longSerializationPolicy;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy9;
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder0.disableJdkUnsafe();
        gsonBuilder11.serializeSpecialFloatingPointValues = true;
        int int14 = gsonBuilder11.dateStyle;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(longSerializationPolicy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList7);
        org.junit.Assert.assertNull(strictness8);
        org.junit.Assert.assertNotNull(longSerializationPolicy9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test552");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList8 = gsonBuilder0.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder0.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder9.disableHtmlEscaping();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy12 = gsonBuilder9.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.setDateFormat("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList8);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(fieldNamingStrategy12);
        org.junit.Assert.assertNotNull(gsonBuilder14);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test553");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder5 = new com.google.gson.GsonBuilder();
        boolean boolean6 = gsonBuilder5.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        boolean boolean8 = gsonBuilder7.complexMapKeySerialization;
        boolean boolean9 = gsonBuilder7.useJdkUnsafe;
        boolean boolean10 = gsonBuilder7.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy11 = gsonBuilder7.objectToNumberStrategy;
        gsonBuilder5.objectToNumberStrategy = toNumberStrategy11;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder5.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        boolean boolean15 = gsonBuilder14.complexMapKeySerialization;
        boolean boolean16 = gsonBuilder14.useJdkUnsafe;
        boolean boolean17 = gsonBuilder14.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy18 = gsonBuilder14.objectToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder13.setNumberToNumberStrategy(toNumberStrategy18);
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy18;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy11);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy18);
        org.junit.Assert.assertNotNull(gsonBuilder19);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test554");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        int int7 = gsonBuilder0.timeStyle;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory9 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory9);
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder10.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder11.generateNonExecutableJson();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder12.setDateFormat((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(gsonBuilder12);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test555");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.datePattern = "";
        boolean boolean4 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.disableInnerClassSerialization();
        gsonBuilder5.escapeHtmlChars = true;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder5.serializeSpecialFloatingPointValues();
        com.google.gson.Strictness strictness9 = null;
        gsonBuilder5.strictness = strictness9;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder8);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test556");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        gsonBuilder0.useJdkUnsafe = false;
        gsonBuilder0.complexMapKeySerialization = false;
        boolean boolean10 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder0.serializeSpecialFloatingPointValues();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(gsonBuilder12);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test557");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.enableComplexMapKeySerialization();
        gsonBuilder2.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray6 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder2.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        boolean boolean12 = gsonBuilder9.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy13 = gsonBuilder9.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy14 = null;
        gsonBuilder9.fieldNamingPolicy = fieldNamingStrategy14;
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder9.setDateFormat("");
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder9.setLenient();
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue20 = gsonBuilder19.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder21 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder21.enableComplexMapKeySerialization();
        gsonBuilder21.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray25 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder21.setExclusionStrategies(exclusionStrategyArray25);
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder19.setExclusionStrategies(exclusionStrategyArray25);
        com.google.gson.FormattingStyle formattingStyle28 = gsonBuilder19.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy29 = gsonBuilder19.fieldNamingPolicy;
        gsonBuilder18.fieldNamingPolicy = fieldNamingStrategy29;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder8.setFieldNamingStrategy(fieldNamingStrategy29);
        com.google.gson.GsonBuilder gsonBuilder32 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder32.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder35 = gsonBuilder33.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder36 = new com.google.gson.GsonBuilder();
        boolean boolean37 = gsonBuilder36.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder38 = gsonBuilder36.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy39 = gsonBuilder36.numberToNumberStrategy;
        gsonBuilder35.objectToNumberStrategy = toNumberStrategy39;
        com.google.gson.GsonBuilder gsonBuilder41 = gsonBuilder31.setNumberToNumberStrategy(toNumberStrategy39);
        gsonBuilder41.datePattern = "";
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(exclusionStrategyArray6);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray6, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy13);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue20);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(exclusionStrategyArray25);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray25, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(formattingStyle28);
        org.junit.Assert.assertNotNull(fieldNamingStrategy29);
        org.junit.Assert.assertNotNull(gsonBuilder31);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertNotNull(gsonBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(excluder38);
        org.junit.Assert.assertNotNull(toNumberStrategy39);
        org.junit.Assert.assertNotNull(gsonBuilder41);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test558");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        boolean boolean6 = gsonBuilder4.useJdkUnsafe;
        boolean boolean7 = gsonBuilder4.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy8 = gsonBuilder4.objectToNumberStrategy;
        gsonBuilder2.objectToNumberStrategy = toNumberStrategy8;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder2.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = gsonBuilder11.longSerializationPolicy;
        gsonBuilder2.longSerializationPolicy = longSerializationPolicy12;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder0.setLongSerializationPolicy(longSerializationPolicy12);
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder0.disableInnerClassSerialization();
        boolean boolean16 = gsonBuilder15.escapeHtmlChars;
        gsonBuilder15.dateStyle = 1;
        gsonBuilder15.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder15.generateNonExecutableJson();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(longSerializationPolicy12);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(gsonBuilder21);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test559");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.Gson gson2 = gsonBuilder1.create();
        com.google.gson.GsonBuilder gsonBuilder3 = new com.google.gson.GsonBuilder(gson2);
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder(gson2);
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder4.setPrettyPrinting();
        gsonBuilder4.timeStyle = 1;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gson2);
        org.junit.Assert.assertNotNull(gsonBuilder5);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test560");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        int int9 = gsonBuilder7.dateStyle;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test561");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.FormattingStyle formattingStyle8 = gsonBuilder0.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder0.setVersion((double) 1.0f);
        java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> typeMap11 = gsonBuilder10.instanceCreators;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(formattingStyle8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(typeMap11);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test562");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder8.generateNonExecutableJson = false;
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder8.setLenient();
        com.google.gson.ToNumberStrategy toNumberStrategy12 = gsonBuilder8.numberToNumberStrategy;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(toNumberStrategy12);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test563");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        boolean boolean6 = gsonBuilder4.useJdkUnsafe;
        boolean boolean7 = gsonBuilder4.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy8 = gsonBuilder4.objectToNumberStrategy;
        gsonBuilder2.objectToNumberStrategy = toNumberStrategy8;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder2.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = gsonBuilder11.longSerializationPolicy;
        gsonBuilder2.longSerializationPolicy = longSerializationPolicy12;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder0.setLongSerializationPolicy(longSerializationPolicy12);
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder0.disableInnerClassSerialization();
        int[] intArray18 = new int[] { 1, (byte) 1 };
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder0.excludeFieldsWithModifiers(intArray18);
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy21 = gsonBuilder20.longSerializationPolicy;
        gsonBuilder20.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder20.disableHtmlEscaping();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy25 = gsonBuilder24.fieldNamingPolicy;
        gsonBuilder19.fieldNamingPolicy = fieldNamingStrategy25;
        gsonBuilder19.useJdkUnsafe = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(longSerializationPolicy12);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1 });
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(longSerializationPolicy21);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(fieldNamingStrategy25);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test564");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.enableComplexMapKeySerialization();
        gsonBuilder2.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray6 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder2.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = null;
        gsonBuilder9.longSerializationPolicy = longSerializationPolicy12;
        gsonBuilder9.generateNonExecutableJson = true;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy16 = null;
        gsonBuilder9.fieldNamingPolicy = fieldNamingStrategy16;
        com.google.gson.GsonBuilder gsonBuilder18 = new com.google.gson.GsonBuilder();
        boolean boolean19 = gsonBuilder18.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder20 = gsonBuilder18.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy21 = gsonBuilder18.numberToNumberStrategy;
        gsonBuilder18.generateNonExecutableJson = false;
        com.google.gson.GsonBuilder gsonBuilder24 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy25 = gsonBuilder24.longSerializationPolicy;
        gsonBuilder24.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList28 = gsonBuilder24.hierarchyFactories;
        com.google.gson.Strictness strictness29 = gsonBuilder24.strictness;
        com.google.gson.Strictness strictness30 = null;
        gsonBuilder24.strictness = strictness30;
        java.lang.String str32 = gsonBuilder24.datePattern;
        com.google.gson.GsonBuilder gsonBuilder33 = new com.google.gson.GsonBuilder();
        boolean boolean34 = gsonBuilder33.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder35 = new com.google.gson.GsonBuilder();
        boolean boolean36 = gsonBuilder35.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder37 = new com.google.gson.GsonBuilder();
        boolean boolean38 = gsonBuilder37.complexMapKeySerialization;
        boolean boolean39 = gsonBuilder37.useJdkUnsafe;
        boolean boolean40 = gsonBuilder37.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy41 = gsonBuilder37.objectToNumberStrategy;
        gsonBuilder35.objectToNumberStrategy = toNumberStrategy41;
        com.google.gson.GsonBuilder gsonBuilder43 = gsonBuilder35.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder44 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy45 = gsonBuilder44.longSerializationPolicy;
        gsonBuilder35.longSerializationPolicy = longSerializationPolicy45;
        com.google.gson.GsonBuilder gsonBuilder47 = gsonBuilder33.setLongSerializationPolicy(longSerializationPolicy45);
        com.google.gson.GsonBuilder gsonBuilder48 = gsonBuilder33.disableInnerClassSerialization();
        int[] intArray51 = new int[] { 1, (byte) 1 };
        com.google.gson.GsonBuilder gsonBuilder52 = gsonBuilder33.excludeFieldsWithModifiers(intArray51);
        com.google.gson.GsonBuilder gsonBuilder53 = gsonBuilder24.excludeFieldsWithModifiers(intArray51);
        com.google.gson.GsonBuilder gsonBuilder54 = gsonBuilder18.excludeFieldsWithModifiers(intArray51);
        com.google.gson.GsonBuilder gsonBuilder55 = gsonBuilder9.excludeFieldsWithModifiers(intArray51);
        com.google.gson.GsonBuilder gsonBuilder56 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue57 = gsonBuilder56.reflectionFilters;
        gsonBuilder56.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder60 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy61 = null;
        gsonBuilder60.numberToNumberStrategy = toNumberStrategy61;
        gsonBuilder60.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder65 = gsonBuilder60.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder66 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue67 = gsonBuilder66.reflectionFilters;
        gsonBuilder66.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder71 = gsonBuilder66.setDateFormat((int) (short) 0);
        int[] intArray72 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder73 = gsonBuilder71.excludeFieldsWithModifiers(intArray72);
        com.google.gson.GsonBuilder gsonBuilder74 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue75 = gsonBuilder74.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder76 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder77 = gsonBuilder76.enableComplexMapKeySerialization();
        gsonBuilder76.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray80 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder81 = gsonBuilder76.setExclusionStrategies(exclusionStrategyArray80);
        com.google.gson.GsonBuilder gsonBuilder82 = gsonBuilder74.setExclusionStrategies(exclusionStrategyArray80);
        com.google.gson.FormattingStyle formattingStyle83 = gsonBuilder74.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy84 = gsonBuilder74.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder85 = gsonBuilder73.setFieldNamingStrategy(fieldNamingStrategy84);
        com.google.gson.GsonBuilder gsonBuilder86 = gsonBuilder65.setFieldNamingStrategy(fieldNamingStrategy84);
        com.google.gson.GsonBuilder gsonBuilder87 = gsonBuilder56.setFieldNamingStrategy(fieldNamingStrategy84);
        gsonBuilder9.fieldNamingPolicy = fieldNamingStrategy84;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy84;
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(exclusionStrategyArray6);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray6, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(excluder20);
        org.junit.Assert.assertNotNull(toNumberStrategy21);
        org.junit.Assert.assertNotNull(longSerializationPolicy25);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList28);
        org.junit.Assert.assertNull(strictness29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy41);
        org.junit.Assert.assertNotNull(gsonBuilder43);
        org.junit.Assert.assertNotNull(longSerializationPolicy45);
        org.junit.Assert.assertNotNull(gsonBuilder47);
        org.junit.Assert.assertNotNull(gsonBuilder48);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 1 });
        org.junit.Assert.assertNotNull(gsonBuilder52);
        org.junit.Assert.assertNotNull(gsonBuilder53);
        org.junit.Assert.assertNotNull(gsonBuilder54);
        org.junit.Assert.assertNotNull(gsonBuilder55);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue57);
        org.junit.Assert.assertNotNull(gsonBuilder65);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue67);
        org.junit.Assert.assertNotNull(gsonBuilder71);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder73);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue75);
        org.junit.Assert.assertNotNull(gsonBuilder77);
        org.junit.Assert.assertNotNull(exclusionStrategyArray80);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray80, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder81);
        org.junit.Assert.assertNotNull(gsonBuilder82);
        org.junit.Assert.assertNotNull(formattingStyle83);
        org.junit.Assert.assertNotNull(fieldNamingStrategy84);
        org.junit.Assert.assertNotNull(gsonBuilder85);
        org.junit.Assert.assertNotNull(gsonBuilder86);
        org.junit.Assert.assertNotNull(gsonBuilder87);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test565");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        int int7 = gsonBuilder0.timeStyle;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory9 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory9);
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder8.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder11.disableInnerClassSerialization();
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder13.enableComplexMapKeySerialization();
        gsonBuilder13.datePattern = "";
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        boolean boolean18 = gsonBuilder17.complexMapKeySerialization;
        boolean boolean19 = gsonBuilder17.useJdkUnsafe;
        boolean boolean20 = gsonBuilder17.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy21 = gsonBuilder17.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList22 = gsonBuilder17.factories;
        com.google.gson.Gson gson23 = gsonBuilder17.create();
        com.google.gson.GsonBuilder gsonBuilder24 = new com.google.gson.GsonBuilder(gson23);
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder24.enableComplexMapKeySerialization();
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList26 = gsonBuilder24.factories;
        com.google.gson.GsonBuilder gsonBuilder27 = new com.google.gson.GsonBuilder();
        boolean boolean28 = gsonBuilder27.complexMapKeySerialization;
        boolean boolean29 = gsonBuilder27.useJdkUnsafe;
        int int30 = gsonBuilder27.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder31 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder31.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder34 = gsonBuilder32.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder35 = new com.google.gson.GsonBuilder();
        boolean boolean36 = gsonBuilder35.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder37 = gsonBuilder35.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy38 = gsonBuilder35.numberToNumberStrategy;
        gsonBuilder34.objectToNumberStrategy = toNumberStrategy38;
        com.google.gson.GsonBuilder gsonBuilder40 = new com.google.gson.GsonBuilder();
        boolean boolean41 = gsonBuilder40.complexMapKeySerialization;
        boolean boolean42 = gsonBuilder40.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy43 = null;
        gsonBuilder40.longSerializationPolicy = longSerializationPolicy43;
        com.google.gson.GsonBuilder gsonBuilder45 = gsonBuilder40.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder46 = new com.google.gson.GsonBuilder();
        boolean boolean47 = gsonBuilder46.complexMapKeySerialization;
        boolean boolean48 = gsonBuilder46.useJdkUnsafe;
        boolean boolean49 = gsonBuilder46.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy50 = gsonBuilder46.objectToNumberStrategy;
        gsonBuilder45.numberToNumberStrategy = toNumberStrategy50;
        com.google.gson.GsonBuilder gsonBuilder52 = gsonBuilder34.setNumberToNumberStrategy(toNumberStrategy50);
        gsonBuilder27.numberToNumberStrategy = toNumberStrategy50;
        gsonBuilder24.numberToNumberStrategy = toNumberStrategy50;
        com.google.gson.GsonBuilder gsonBuilder55 = gsonBuilder13.setNumberToNumberStrategy(toNumberStrategy50);
        com.google.gson.GsonBuilder gsonBuilder56 = new com.google.gson.GsonBuilder();
        boolean boolean57 = gsonBuilder56.complexMapKeySerialization;
        boolean boolean58 = gsonBuilder56.useJdkUnsafe;
        boolean boolean59 = gsonBuilder56.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy60 = gsonBuilder56.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy61 = null;
        gsonBuilder56.fieldNamingPolicy = fieldNamingStrategy61;
        com.google.gson.GsonBuilder gsonBuilder63 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder64 = gsonBuilder63.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder66 = gsonBuilder64.setVersion((double) 10);
        gsonBuilder64.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder69 = new com.google.gson.GsonBuilder();
        boolean boolean70 = gsonBuilder69.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder71 = gsonBuilder69.excluder;
        gsonBuilder64.excluder = excluder71;
        gsonBuilder56.excluder = excluder71;
        com.google.gson.GsonBuilder gsonBuilder74 = gsonBuilder56.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder75 = new com.google.gson.GsonBuilder();
        boolean boolean76 = gsonBuilder75.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder77 = new com.google.gson.GsonBuilder();
        boolean boolean78 = gsonBuilder77.complexMapKeySerialization;
        boolean boolean79 = gsonBuilder77.useJdkUnsafe;
        boolean boolean80 = gsonBuilder77.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy81 = gsonBuilder77.objectToNumberStrategy;
        gsonBuilder75.objectToNumberStrategy = toNumberStrategy81;
        gsonBuilder56.numberToNumberStrategy = toNumberStrategy81;
        gsonBuilder13.numberToNumberStrategy = toNumberStrategy81;
        com.google.gson.GsonBuilder gsonBuilder85 = gsonBuilder12.setNumberToNumberStrategy(toNumberStrategy81);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy21);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList22);
        org.junit.Assert.assertNotNull(gson23);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertNotNull(gsonBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(excluder37);
        org.junit.Assert.assertNotNull(toNumberStrategy38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(gsonBuilder45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy50);
        org.junit.Assert.assertNotNull(gsonBuilder52);
        org.junit.Assert.assertNotNull(gsonBuilder55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy60);
        org.junit.Assert.assertNotNull(gsonBuilder64);
        org.junit.Assert.assertNotNull(gsonBuilder66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(excluder71);
        org.junit.Assert.assertNotNull(gsonBuilder74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy81);
        org.junit.Assert.assertNotNull(gsonBuilder85);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test566");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder3.numberToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder3.factories;
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        boolean boolean7 = gsonBuilder6.complexMapKeySerialization;
        boolean boolean8 = gsonBuilder6.useJdkUnsafe;
        boolean boolean9 = gsonBuilder6.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy10 = gsonBuilder6.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy11 = null;
        gsonBuilder6.fieldNamingPolicy = fieldNamingStrategy11;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder6.setDateFormat("");
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder6.setLenient();
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue17 = gsonBuilder16.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder18 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder18.enableComplexMapKeySerialization();
        gsonBuilder18.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray22 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder18.setExclusionStrategies(exclusionStrategyArray22);
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder16.setExclusionStrategies(exclusionStrategyArray22);
        com.google.gson.FormattingStyle formattingStyle25 = gsonBuilder16.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy26 = gsonBuilder16.fieldNamingPolicy;
        gsonBuilder15.fieldNamingPolicy = fieldNamingStrategy26;
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder3.setFieldNamingStrategy(fieldNamingStrategy26);
        boolean boolean29 = gsonBuilder28.escapeHtmlChars;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy10);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(exclusionStrategyArray22);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray22, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(formattingStyle25);
        org.junit.Assert.assertNotNull(fieldNamingStrategy26);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test567");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder2 = gsonBuilder0.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy3 = gsonBuilder0.numberToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        boolean boolean7 = gsonBuilder6.complexMapKeySerialization;
        boolean boolean8 = gsonBuilder6.useJdkUnsafe;
        boolean boolean9 = gsonBuilder6.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy10 = gsonBuilder6.objectToNumberStrategy;
        gsonBuilder4.objectToNumberStrategy = toNumberStrategy10;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList12 = gsonBuilder4.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder4.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder13.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle15 = gsonBuilder14.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder0.setFormattingStyle(formattingStyle15);
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue18 = gsonBuilder17.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder19.enableComplexMapKeySerialization();
        gsonBuilder19.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray23 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder19.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder17.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.GsonBuilder gsonBuilder26 = new com.google.gson.GsonBuilder();
        boolean boolean27 = gsonBuilder26.complexMapKeySerialization;
        boolean boolean28 = gsonBuilder26.useJdkUnsafe;
        boolean boolean29 = gsonBuilder26.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy30 = gsonBuilder26.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy31 = null;
        gsonBuilder26.fieldNamingPolicy = fieldNamingStrategy31;
        com.google.gson.GsonBuilder gsonBuilder34 = gsonBuilder26.setDateFormat("");
        com.google.gson.GsonBuilder gsonBuilder35 = gsonBuilder26.setLenient();
        com.google.gson.GsonBuilder gsonBuilder36 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue37 = gsonBuilder36.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder38 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder39 = gsonBuilder38.enableComplexMapKeySerialization();
        gsonBuilder38.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray42 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder43 = gsonBuilder38.setExclusionStrategies(exclusionStrategyArray42);
        com.google.gson.GsonBuilder gsonBuilder44 = gsonBuilder36.setExclusionStrategies(exclusionStrategyArray42);
        com.google.gson.FormattingStyle formattingStyle45 = gsonBuilder36.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy46 = gsonBuilder36.fieldNamingPolicy;
        gsonBuilder35.fieldNamingPolicy = fieldNamingStrategy46;
        com.google.gson.GsonBuilder gsonBuilder48 = gsonBuilder25.setFieldNamingStrategy(fieldNamingStrategy46);
        com.google.gson.GsonBuilder gsonBuilder49 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder50 = gsonBuilder49.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder52 = gsonBuilder50.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder53 = new com.google.gson.GsonBuilder();
        boolean boolean54 = gsonBuilder53.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder55 = gsonBuilder53.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy56 = gsonBuilder53.numberToNumberStrategy;
        gsonBuilder52.objectToNumberStrategy = toNumberStrategy56;
        com.google.gson.GsonBuilder gsonBuilder58 = gsonBuilder48.setNumberToNumberStrategy(toNumberStrategy56);
        com.google.gson.GsonBuilder gsonBuilder59 = gsonBuilder0.setNumberToNumberStrategy(toNumberStrategy56);
        com.google.gson.GsonBuilder gsonBuilder60 = gsonBuilder59.disableHtmlEscaping();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(toNumberStrategy3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy10);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList12);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(formattingStyle15);
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue18);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(exclusionStrategyArray23);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray23, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy30);
        org.junit.Assert.assertNotNull(gsonBuilder34);
        org.junit.Assert.assertNotNull(gsonBuilder35);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue37);
        org.junit.Assert.assertNotNull(gsonBuilder39);
        org.junit.Assert.assertNotNull(exclusionStrategyArray42);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray42, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder43);
        org.junit.Assert.assertNotNull(gsonBuilder44);
        org.junit.Assert.assertNotNull(formattingStyle45);
        org.junit.Assert.assertNotNull(fieldNamingStrategy46);
        org.junit.Assert.assertNotNull(gsonBuilder48);
        org.junit.Assert.assertNotNull(gsonBuilder50);
        org.junit.Assert.assertNotNull(gsonBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(excluder55);
        org.junit.Assert.assertNotNull(toNumberStrategy56);
        org.junit.Assert.assertNotNull(gsonBuilder58);
        org.junit.Assert.assertNotNull(gsonBuilder59);
        org.junit.Assert.assertNotNull(gsonBuilder60);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test568");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder3.numberToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder3.factories;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder3.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        boolean boolean8 = gsonBuilder7.complexMapKeySerialization;
        boolean boolean9 = gsonBuilder7.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy10 = null;
        gsonBuilder7.longSerializationPolicy = longSerializationPolicy10;
        gsonBuilder7.generateNonExecutableJson = true;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy14 = null;
        gsonBuilder7.fieldNamingPolicy = fieldNamingStrategy14;
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder16.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder17.setVersion((double) 10);
        gsonBuilder17.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder22 = new com.google.gson.GsonBuilder();
        boolean boolean23 = gsonBuilder22.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder24 = gsonBuilder22.excluder;
        gsonBuilder17.excluder = excluder24;
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder7.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder24);
        gsonBuilder6.excluder = excluder24;
        gsonBuilder6.useJdkUnsafe = false;
        boolean boolean30 = gsonBuilder6.generateNonExecutableJson;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder6.serializeNulls();
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(excluder24);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gsonBuilder31);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test569");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.enableComplexMapKeySerialization();
        com.google.gson.FormattingStyle formattingStyle11 = gsonBuilder9.formattingStyle;
        gsonBuilder0.formattingStyle = formattingStyle11;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
        boolean boolean14 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy16 = null;
        gsonBuilder15.numberToNumberStrategy = toNumberStrategy16;
        gsonBuilder15.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder15.setPrettyPrinting();
        gsonBuilder15.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder23 = new com.google.gson.GsonBuilder();
        boolean boolean24 = gsonBuilder23.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder25 = new com.google.gson.GsonBuilder();
        boolean boolean26 = gsonBuilder25.complexMapKeySerialization;
        boolean boolean27 = gsonBuilder25.useJdkUnsafe;
        boolean boolean28 = gsonBuilder25.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy29 = gsonBuilder25.objectToNumberStrategy;
        gsonBuilder23.objectToNumberStrategy = toNumberStrategy29;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder23.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder31.setDateFormat("");
        com.google.gson.GsonBuilder gsonBuilder34 = new com.google.gson.GsonBuilder();
        boolean boolean35 = gsonBuilder34.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder36 = new com.google.gson.GsonBuilder();
        boolean boolean37 = gsonBuilder36.complexMapKeySerialization;
        boolean boolean38 = gsonBuilder36.useJdkUnsafe;
        boolean boolean39 = gsonBuilder36.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy40 = gsonBuilder36.objectToNumberStrategy;
        gsonBuilder34.objectToNumberStrategy = toNumberStrategy40;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList42 = gsonBuilder34.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder43 = gsonBuilder34.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder44 = gsonBuilder43.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle45 = gsonBuilder44.formattingStyle;
        gsonBuilder31.formattingStyle = formattingStyle45;
        gsonBuilder15.formattingStyle = formattingStyle45;
        gsonBuilder0.formattingStyle = formattingStyle45;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(formattingStyle11);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy29);
        org.junit.Assert.assertNotNull(gsonBuilder31);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy40);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList42);
        org.junit.Assert.assertNotNull(gsonBuilder43);
        org.junit.Assert.assertNotNull(gsonBuilder44);
        org.junit.Assert.assertNotNull(formattingStyle45);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test570");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder8.setLenient();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
        org.junit.Assert.assertNotNull(gsonBuilder9);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test571");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder4.disableJdkUnsafe();
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder5.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        boolean boolean8 = gsonBuilder7.complexMapKeySerialization;
        boolean boolean9 = gsonBuilder7.useJdkUnsafe;
        boolean boolean10 = gsonBuilder7.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy11 = gsonBuilder7.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy12 = null;
        gsonBuilder7.fieldNamingPolicy = fieldNamingStrategy12;
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder14.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder15.setVersion((double) 10);
        gsonBuilder15.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        boolean boolean21 = gsonBuilder20.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder22 = gsonBuilder20.excluder;
        gsonBuilder15.excluder = excluder22;
        gsonBuilder7.excluder = excluder22;
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder7.enableComplexMapKeySerialization();
        boolean boolean26 = gsonBuilder25.serializeSpecialFloatingPointValues;
        com.google.gson.GsonBuilder gsonBuilder27 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy28 = gsonBuilder27.longSerializationPolicy;
        gsonBuilder27.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList31 = gsonBuilder27.hierarchyFactories;
        com.google.gson.Strictness strictness32 = gsonBuilder27.strictness;
        com.google.gson.Strictness strictness33 = null;
        gsonBuilder27.strictness = strictness33;
        com.google.gson.ToNumberStrategy toNumberStrategy35 = gsonBuilder27.numberToNumberStrategy;
        gsonBuilder27.useJdkUnsafe = false;
        boolean boolean38 = gsonBuilder27.serializeSpecialFloatingPointValues;
        com.google.gson.GsonBuilder gsonBuilder39 = gsonBuilder27.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder40 = new com.google.gson.GsonBuilder();
        boolean boolean41 = gsonBuilder40.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder42 = new com.google.gson.GsonBuilder();
        boolean boolean43 = gsonBuilder42.complexMapKeySerialization;
        boolean boolean44 = gsonBuilder42.useJdkUnsafe;
        boolean boolean45 = gsonBuilder42.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy46 = gsonBuilder42.objectToNumberStrategy;
        gsonBuilder40.objectToNumberStrategy = toNumberStrategy46;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList48 = gsonBuilder40.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder49 = gsonBuilder40.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder50 = gsonBuilder49.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle51 = gsonBuilder50.formattingStyle;
        gsonBuilder39.formattingStyle = formattingStyle51;
        com.google.gson.GsonBuilder gsonBuilder53 = gsonBuilder25.setFormattingStyle(formattingStyle51);
        com.google.gson.GsonBuilder gsonBuilder54 = gsonBuilder5.setFormattingStyle(formattingStyle51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder56 = gsonBuilder54.setDateFormat((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy11);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(excluder22);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longSerializationPolicy28);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList31);
        org.junit.Assert.assertNull(strictness32);
        org.junit.Assert.assertNotNull(toNumberStrategy35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(gsonBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy46);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList48);
        org.junit.Assert.assertNotNull(gsonBuilder49);
        org.junit.Assert.assertNotNull(gsonBuilder50);
        org.junit.Assert.assertNotNull(formattingStyle51);
        org.junit.Assert.assertNotNull(gsonBuilder53);
        org.junit.Assert.assertNotNull(gsonBuilder54);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test572");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.serializeSpecialFloatingPointValues = true;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setDateFormat((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonBuilder1);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test573");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory5 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder4.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory5);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList7 = gsonBuilder4.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue9 = gsonBuilder8.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder10.enableComplexMapKeySerialization();
        gsonBuilder10.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray14 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder10.setExclusionStrategies(exclusionStrategyArray14);
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder8.setExclusionStrategies(exclusionStrategyArray14);
        com.google.gson.FormattingStyle formattingStyle17 = gsonBuilder8.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy18 = gsonBuilder8.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy20 = gsonBuilder19.longSerializationPolicy;
        gsonBuilder19.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList23 = gsonBuilder19.hierarchyFactories;
        com.google.gson.Strictness strictness24 = gsonBuilder19.strictness;
        com.google.gson.internal.Excluder excluder25 = gsonBuilder19.excluder;
        gsonBuilder8.excluder = excluder25;
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder4.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList7);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(exclusionStrategyArray14);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray14, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(formattingStyle17);
        org.junit.Assert.assertNotNull(fieldNamingStrategy18);
        org.junit.Assert.assertNotNull(longSerializationPolicy20);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList23);
        org.junit.Assert.assertNull(strictness24);
        org.junit.Assert.assertNotNull(excluder25);
        org.junit.Assert.assertNotNull(gsonBuilder27);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test574");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue4 = gsonBuilder1.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder1.setVersion((double) 10L);
        boolean boolean7 = gsonBuilder1.generateNonExecutableJson;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue4);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test575");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder8.generateNonExecutableJson = false;
        gsonBuilder8.timeStyle = 1;
        gsonBuilder8.timeStyle = 0;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        boolean boolean17 = gsonBuilder15.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy18 = null;
        gsonBuilder15.longSerializationPolicy = longSerializationPolicy18;
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder15.generateNonExecutableJson();
        gsonBuilder15.dateStyle = 0;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList23 = gsonBuilder15.factories;
        com.google.gson.GsonBuilder gsonBuilder24 = new com.google.gson.GsonBuilder();
        boolean boolean25 = gsonBuilder24.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder26 = new com.google.gson.GsonBuilder();
        boolean boolean27 = gsonBuilder26.complexMapKeySerialization;
        boolean boolean28 = gsonBuilder26.useJdkUnsafe;
        boolean boolean29 = gsonBuilder26.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy30 = gsonBuilder26.objectToNumberStrategy;
        gsonBuilder24.objectToNumberStrategy = toNumberStrategy30;
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder24.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder33 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy34 = gsonBuilder33.longSerializationPolicy;
        gsonBuilder24.longSerializationPolicy = longSerializationPolicy34;
        gsonBuilder15.longSerializationPolicy = longSerializationPolicy34;
        gsonBuilder8.longSerializationPolicy = longSerializationPolicy34;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy30);
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertNotNull(longSerializationPolicy34);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test576");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList4 = gsonBuilder0.hierarchyFactories;
        com.google.gson.Strictness strictness5 = gsonBuilder0.strictness;
        com.google.gson.Strictness strictness6 = null;
        gsonBuilder0.strictness = strictness6;
        com.google.gson.ToNumberStrategy toNumberStrategy8 = gsonBuilder0.numberToNumberStrategy;
        gsonBuilder0.escapeHtmlChars = true;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue11 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder0.generateNonExecutableJson();
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList4);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNotNull(toNumberStrategy8);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue11);
        org.junit.Assert.assertNotNull(gsonBuilder12);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test577");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList8 = gsonBuilder0.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder0.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder9.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder12 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue13 = gsonBuilder12.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder14.enableComplexMapKeySerialization();
        gsonBuilder14.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray18 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder14.setExclusionStrategies(exclusionStrategyArray18);
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder12.setExclusionStrategies(exclusionStrategyArray18);
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder9.setExclusionStrategies(exclusionStrategyArray18);
        com.google.gson.ExclusionStrategy exclusionStrategy22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder21.addDeserializationExclusionStrategy(exclusionStrategy22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList8);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue13);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertNotNull(exclusionStrategyArray18);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray18, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(gsonBuilder21);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test578");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder8.generateNonExecutableJson = false;
        gsonBuilder8.timeStyle = 1;
        gsonBuilder8.timeStyle = 0;
        com.google.gson.Gson gson15 = gsonBuilder8.create();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gson15);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test579");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory5 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder4.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory5);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList7 = gsonBuilder4.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder4.setDateFormat(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList7);
        org.junit.Assert.assertNotNull(gsonBuilder9);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test580");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder4.disableJdkUnsafe();
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder5.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue8 = gsonBuilder7.reflectionFilters;
        gsonBuilder7.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder7.setDateFormat((int) (short) 0);
        int[] intArray13 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder12.excludeFieldsWithModifiers(intArray13);
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder17 = gsonBuilder15.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy18 = gsonBuilder15.numberToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        boolean boolean20 = gsonBuilder19.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder21 = new com.google.gson.GsonBuilder();
        boolean boolean22 = gsonBuilder21.complexMapKeySerialization;
        boolean boolean23 = gsonBuilder21.useJdkUnsafe;
        boolean boolean24 = gsonBuilder21.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy25 = gsonBuilder21.objectToNumberStrategy;
        gsonBuilder19.objectToNumberStrategy = toNumberStrategy25;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList27 = gsonBuilder19.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder19.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder28.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle30 = gsonBuilder29.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder15.setFormattingStyle(formattingStyle30);
        gsonBuilder12.formattingStyle = formattingStyle30;
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder5.setFormattingStyle(formattingStyle30);
        com.google.gson.GsonBuilder gsonBuilder34 = gsonBuilder33.setPrettyPrinting();
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList35 = gsonBuilder33.factories;
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue8);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertNotNull(toNumberStrategy18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy25);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(formattingStyle30);
        org.junit.Assert.assertNotNull(gsonBuilder31);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertNotNull(gsonBuilder34);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList35);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test581");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        boolean boolean12 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder13 = gsonBuilder11.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy14 = gsonBuilder11.numberToNumberStrategy;
        gsonBuilder10.objectToNumberStrategy = toNumberStrategy14;
        com.google.gson.ToNumberStrategy toNumberStrategy16 = gsonBuilder10.numberToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder10.setVersion((double) 100);
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder10.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        boolean boolean21 = gsonBuilder20.complexMapKeySerialization;
        boolean boolean22 = gsonBuilder20.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy23 = null;
        gsonBuilder20.longSerializationPolicy = longSerializationPolicy23;
        gsonBuilder20.generateNonExecutableJson = true;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy27 = null;
        gsonBuilder20.fieldNamingPolicy = fieldNamingStrategy27;
        com.google.gson.GsonBuilder gsonBuilder29 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder29.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder30.setVersion((double) 10);
        gsonBuilder30.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder35 = new com.google.gson.GsonBuilder();
        boolean boolean36 = gsonBuilder35.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder37 = gsonBuilder35.excluder;
        gsonBuilder30.excluder = excluder37;
        com.google.gson.GsonBuilder gsonBuilder39 = gsonBuilder20.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder37);
        com.google.gson.GsonBuilder gsonBuilder40 = new com.google.gson.GsonBuilder();
        boolean boolean41 = gsonBuilder40.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder42 = gsonBuilder40.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor43 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory44 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList45 = gsonBuilder40.createFactories(constructorConstructor43, jsonAdapterAnnotationTypeAdapterFactory44);
        com.google.gson.GsonBuilder gsonBuilder46 = gsonBuilder39.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory44);
        com.google.gson.GsonBuilder gsonBuilder47 = new com.google.gson.GsonBuilder();
        boolean boolean48 = gsonBuilder47.complexMapKeySerialization;
        com.google.gson.ToNumberStrategy toNumberStrategy49 = gsonBuilder47.numberToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy50 = gsonBuilder47.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder51 = gsonBuilder39.setFieldNamingStrategy(fieldNamingStrategy50);
        com.google.gson.GsonBuilder gsonBuilder52 = gsonBuilder10.setFieldNamingStrategy(fieldNamingStrategy50);
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy50;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(excluder13);
        org.junit.Assert.assertNotNull(toNumberStrategy14);
        org.junit.Assert.assertNotNull(toNumberStrategy16);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(excluder37);
        org.junit.Assert.assertNotNull(gsonBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(excluder42);
        org.junit.Assert.assertNotNull(constructorConstructor43);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory44);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList45);
        org.junit.Assert.assertNotNull(gsonBuilder46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy49);
        org.junit.Assert.assertNotNull(fieldNamingStrategy50);
        org.junit.Assert.assertNotNull(gsonBuilder51);
        org.junit.Assert.assertNotNull(gsonBuilder52);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test582");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        gsonBuilder0.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setDateFormat((int) (short) 0);
        com.google.gson.GsonBuilder gsonBuilder6 = com.google.gson.GsonBuilder.DEFAULT;
        gsonBuilder6.dateStyle = (byte) 100;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy10 = gsonBuilder9.longSerializationPolicy;
        gsonBuilder6.longSerializationPolicy = longSerializationPolicy10;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy10;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        boolean boolean15 = gsonBuilder13.useJdkUnsafe;
        boolean boolean16 = gsonBuilder13.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy17 = gsonBuilder13.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy18 = null;
        gsonBuilder13.fieldNamingPolicy = fieldNamingStrategy18;
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder20.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder21.setVersion((double) 10);
        gsonBuilder21.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder26 = new com.google.gson.GsonBuilder();
        boolean boolean27 = gsonBuilder26.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder28 = gsonBuilder26.excluder;
        gsonBuilder21.excluder = excluder28;
        gsonBuilder13.excluder = excluder28;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder13.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder32 = new com.google.gson.GsonBuilder();
        boolean boolean33 = gsonBuilder32.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder34 = new com.google.gson.GsonBuilder();
        boolean boolean35 = gsonBuilder34.complexMapKeySerialization;
        boolean boolean36 = gsonBuilder34.useJdkUnsafe;
        boolean boolean37 = gsonBuilder34.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy38 = gsonBuilder34.objectToNumberStrategy;
        gsonBuilder32.objectToNumberStrategy = toNumberStrategy38;
        gsonBuilder13.numberToNumberStrategy = toNumberStrategy38;
        com.google.gson.GsonBuilder gsonBuilder41 = gsonBuilder0.setNumberToNumberStrategy(toNumberStrategy38);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(longSerializationPolicy10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy17);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(excluder28);
        org.junit.Assert.assertNotNull(gsonBuilder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy38);
        org.junit.Assert.assertNotNull(gsonBuilder41);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test583");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.enableComplexMapKeySerialization();
        gsonBuilder2.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray6 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder2.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        boolean boolean12 = gsonBuilder9.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy13 = gsonBuilder9.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy14 = null;
        gsonBuilder9.fieldNamingPolicy = fieldNamingStrategy14;
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder9.setDateFormat("");
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder9.setLenient();
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue20 = gsonBuilder19.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder21 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder21.enableComplexMapKeySerialization();
        gsonBuilder21.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray25 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder21.setExclusionStrategies(exclusionStrategyArray25);
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder19.setExclusionStrategies(exclusionStrategyArray25);
        com.google.gson.FormattingStyle formattingStyle28 = gsonBuilder19.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy29 = gsonBuilder19.fieldNamingPolicy;
        gsonBuilder18.fieldNamingPolicy = fieldNamingStrategy29;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder8.setFieldNamingStrategy(fieldNamingStrategy29);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList32 = gsonBuilder8.factories;
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(exclusionStrategyArray6);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray6, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy13);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue20);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(exclusionStrategyArray25);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray25, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(formattingStyle28);
        org.junit.Assert.assertNotNull(fieldNamingStrategy29);
        org.junit.Assert.assertNotNull(gsonBuilder31);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList32);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test584");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.setVersion((double) 10);
        gsonBuilder8.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder15 = gsonBuilder13.excluder;
        gsonBuilder8.excluder = excluder15;
        gsonBuilder0.excluder = excluder15;
        boolean boolean18 = gsonBuilder0.escapeHtmlChars;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList19 = gsonBuilder0.hierarchyFactories;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList19);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test585");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.enableComplexMapKeySerialization();
        gsonBuilder2.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray6 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder2.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.FormattingStyle formattingStyle9 = gsonBuilder0.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder0.generateNonExecutableJson();
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(exclusionStrategyArray6);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray6, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(formattingStyle9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test586");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy3 = null;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy3;
        gsonBuilder0.generateNonExecutableJson = true;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy7 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy7;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder10.setVersion((double) 10);
        gsonBuilder10.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder17 = gsonBuilder15.excluder;
        gsonBuilder10.excluder = excluder17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder0.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder17);
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        boolean boolean21 = gsonBuilder20.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder22 = gsonBuilder20.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor23 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory24 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList25 = gsonBuilder20.createFactories(constructorConstructor23, jsonAdapterAnnotationTypeAdapterFactory24);
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder19.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory24);
        com.google.gson.GsonBuilder gsonBuilder27 = new com.google.gson.GsonBuilder();
        boolean boolean28 = gsonBuilder27.complexMapKeySerialization;
        com.google.gson.ToNumberStrategy toNumberStrategy29 = gsonBuilder27.numberToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy30 = gsonBuilder27.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder31 = gsonBuilder19.setFieldNamingStrategy(fieldNamingStrategy30);
        java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> typeMap32 = gsonBuilder31.instanceCreators;
        gsonBuilder31.escapeHtmlChars = false;
        com.google.gson.GsonBuilder gsonBuilder35 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy36 = gsonBuilder35.longSerializationPolicy;
        gsonBuilder35.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList39 = gsonBuilder35.hierarchyFactories;
        com.google.gson.Strictness strictness40 = gsonBuilder35.strictness;
        com.google.gson.LongSerializationPolicy longSerializationPolicy41 = gsonBuilder35.longSerializationPolicy;
        java.lang.Class<?> wildcardClass42 = longSerializationPolicy41.getClass();
        com.google.gson.GsonBuilder gsonBuilder43 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy44 = gsonBuilder43.longSerializationPolicy;
        gsonBuilder43.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList47 = gsonBuilder43.hierarchyFactories;
        com.google.gson.Strictness strictness48 = gsonBuilder43.strictness;
        com.google.gson.GsonBuilder gsonBuilder49 = new com.google.gson.GsonBuilder();
        boolean boolean50 = gsonBuilder49.complexMapKeySerialization;
        boolean boolean51 = gsonBuilder49.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy52 = null;
        gsonBuilder49.longSerializationPolicy = longSerializationPolicy52;
        gsonBuilder49.generateNonExecutableJson = true;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy56 = null;
        gsonBuilder49.fieldNamingPolicy = fieldNamingStrategy56;
        com.google.gson.GsonBuilder gsonBuilder58 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder59 = gsonBuilder58.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder61 = gsonBuilder59.setVersion((double) 10);
        gsonBuilder59.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder64 = new com.google.gson.GsonBuilder();
        boolean boolean65 = gsonBuilder64.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder66 = gsonBuilder64.excluder;
        gsonBuilder59.excluder = excluder66;
        com.google.gson.GsonBuilder gsonBuilder68 = gsonBuilder49.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder66);
        com.google.gson.GsonBuilder gsonBuilder69 = new com.google.gson.GsonBuilder();
        boolean boolean70 = gsonBuilder69.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder71 = gsonBuilder69.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor72 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory73 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList74 = gsonBuilder69.createFactories(constructorConstructor72, jsonAdapterAnnotationTypeAdapterFactory73);
        com.google.gson.GsonBuilder gsonBuilder75 = gsonBuilder68.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory73);
        com.google.gson.GsonBuilder gsonBuilder76 = new com.google.gson.GsonBuilder();
        boolean boolean77 = gsonBuilder76.complexMapKeySerialization;
        com.google.gson.ToNumberStrategy toNumberStrategy78 = gsonBuilder76.numberToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy79 = gsonBuilder76.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder80 = gsonBuilder68.setFieldNamingStrategy(fieldNamingStrategy79);
        gsonBuilder43.fieldNamingPolicy = fieldNamingStrategy79;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder82 = gsonBuilder31.registerTypeAdapter((java.lang.reflect.Type) wildcardClass42, (java.lang.Object) gsonBuilder43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Class com.google.gson.GsonBuilder does not implement any supported type adapter class or interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(excluder22);
        org.junit.Assert.assertNotNull(constructorConstructor23);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory24);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList25);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy29);
        org.junit.Assert.assertNotNull(fieldNamingStrategy30);
        org.junit.Assert.assertNotNull(gsonBuilder31);
        org.junit.Assert.assertNotNull(typeMap32);
        org.junit.Assert.assertNotNull(longSerializationPolicy36);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList39);
        org.junit.Assert.assertNull(strictness40);
        org.junit.Assert.assertNotNull(longSerializationPolicy41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(longSerializationPolicy44);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList47);
        org.junit.Assert.assertNull(strictness48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(gsonBuilder59);
        org.junit.Assert.assertNotNull(gsonBuilder61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(excluder66);
        org.junit.Assert.assertNotNull(gsonBuilder68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(excluder71);
        org.junit.Assert.assertNotNull(constructorConstructor72);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory73);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList74);
        org.junit.Assert.assertNotNull(gsonBuilder75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy78);
        org.junit.Assert.assertNotNull(fieldNamingStrategy79);
        org.junit.Assert.assertNotNull(gsonBuilder80);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test587");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        int int12 = gsonBuilder9.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder9.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue15 = gsonBuilder14.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder16.enableComplexMapKeySerialization();
        gsonBuilder16.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray20 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder16.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder14.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder13.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray20);
        com.google.gson.GsonBuilder gsonBuilder25 = new com.google.gson.GsonBuilder();
        boolean boolean26 = gsonBuilder25.complexMapKeySerialization;
        boolean boolean27 = gsonBuilder25.useJdkUnsafe;
        boolean boolean28 = gsonBuilder25.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy29 = gsonBuilder25.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy30 = null;
        gsonBuilder25.fieldNamingPolicy = fieldNamingStrategy30;
        gsonBuilder25.timeStyle = (short) 1;
        com.google.gson.GsonBuilder gsonBuilder34 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue35 = gsonBuilder34.reflectionFilters;
        gsonBuilder34.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder39 = gsonBuilder34.setDateFormat((int) (short) 0);
        int[] intArray40 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder41 = gsonBuilder39.excludeFieldsWithModifiers(intArray40);
        com.google.gson.GsonBuilder gsonBuilder42 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue43 = gsonBuilder42.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder44 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder45 = gsonBuilder44.enableComplexMapKeySerialization();
        gsonBuilder44.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray48 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder49 = gsonBuilder44.setExclusionStrategies(exclusionStrategyArray48);
        com.google.gson.GsonBuilder gsonBuilder50 = gsonBuilder42.setExclusionStrategies(exclusionStrategyArray48);
        com.google.gson.FormattingStyle formattingStyle51 = gsonBuilder42.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy52 = gsonBuilder42.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder53 = gsonBuilder41.setFieldNamingStrategy(fieldNamingStrategy52);
        com.google.gson.GsonBuilder gsonBuilder54 = gsonBuilder25.setFieldNamingStrategy(fieldNamingStrategy52);
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy52;
        gsonBuilder0.generateNonExecutableJson = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue15);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(exclusionStrategyArray20);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray20, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy29);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue35);
        org.junit.Assert.assertNotNull(gsonBuilder39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder41);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue43);
        org.junit.Assert.assertNotNull(gsonBuilder45);
        org.junit.Assert.assertNotNull(exclusionStrategyArray48);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray48, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder49);
        org.junit.Assert.assertNotNull(gsonBuilder50);
        org.junit.Assert.assertNotNull(formattingStyle51);
        org.junit.Assert.assertNotNull(fieldNamingStrategy52);
        org.junit.Assert.assertNotNull(gsonBuilder53);
        org.junit.Assert.assertNotNull(gsonBuilder54);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test588");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder2 = gsonBuilder0.excluder;
        com.google.gson.GsonBuilder gsonBuilder3 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder3.enableComplexMapKeySerialization();
        gsonBuilder3.datePattern = "";
        boolean boolean7 = gsonBuilder3.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder3.disableInnerClassSerialization();
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.enableComplexMapKeySerialization();
        com.google.gson.Gson gson11 = gsonBuilder10.create();
        gsonBuilder10.serializeNulls = false;
        boolean boolean14 = gsonBuilder10.complexMapKeySerialization;
        gsonBuilder10.serializeNulls = false;
        com.google.gson.LongSerializationPolicy longSerializationPolicy17 = gsonBuilder10.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder3.setLongSerializationPolicy(longSerializationPolicy17);
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder0.setLongSerializationPolicy(longSerializationPolicy17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gson11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longSerializationPolicy17);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertNotNull(gsonBuilder19);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test589");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        gsonBuilder0.generateNonExecutableJson = false;
        com.google.gson.ExclusionStrategy exclusionStrategy7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.addSerializationExclusionStrategy(exclusionStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test590");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        int int3 = gsonBuilder0.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        boolean boolean6 = gsonBuilder4.useJdkUnsafe;
        boolean boolean7 = gsonBuilder4.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy8 = gsonBuilder4.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy9 = null;
        gsonBuilder4.fieldNamingPolicy = fieldNamingStrategy9;
        gsonBuilder4.timeStyle = (short) 1;
        com.google.gson.GsonBuilder gsonBuilder13 = com.google.gson.GsonBuilder.DEFAULT;
        boolean boolean14 = gsonBuilder13.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder17 = gsonBuilder15.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy18 = gsonBuilder15.numberToNumberStrategy;
        gsonBuilder13.numberToNumberStrategy = toNumberStrategy18;
        com.google.gson.ToNumberStrategy toNumberStrategy20 = gsonBuilder13.numberToNumberStrategy;
        gsonBuilder4.numberToNumberStrategy = toNumberStrategy20;
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder0.setNumberToNumberStrategy(toNumberStrategy20);
        com.google.gson.ToNumberStrategy toNumberStrategy23 = gsonBuilder0.numberToNumberStrategy;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder0.setFieldNamingPolicy(fieldNamingPolicy24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy8);
        org.junit.Assert.assertNotNull(gsonBuilder13);
// flaky "2) test590(com.google.gson.GsonBuilderRegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertNotNull(toNumberStrategy18);
        org.junit.Assert.assertNotNull(toNumberStrategy20);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(toNumberStrategy23);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test591");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder0.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory5 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        com.google.gson.GsonBuilder gsonBuilder6 = gsonBuilder4.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory5);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder6.setVersion((double) (byte) 100);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList9 = gsonBuilder8.hierarchyFactories;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList9);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test592");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder6 = gsonBuilder4.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy7 = gsonBuilder4.numberToNumberStrategy;
        gsonBuilder3.objectToNumberStrategy = toNumberStrategy7;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = null;
        gsonBuilder9.longSerializationPolicy = longSerializationPolicy12;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        boolean boolean17 = gsonBuilder15.useJdkUnsafe;
        boolean boolean18 = gsonBuilder15.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy19 = gsonBuilder15.objectToNumberStrategy;
        gsonBuilder14.numberToNumberStrategy = toNumberStrategy19;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder3.setNumberToNumberStrategy(toNumberStrategy19);
        boolean boolean22 = gsonBuilder21.serializeNulls;
        gsonBuilder21.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder21.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder26 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder26.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder27.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder30 = new com.google.gson.GsonBuilder();
        boolean boolean31 = gsonBuilder30.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder32 = gsonBuilder30.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy33 = gsonBuilder30.numberToNumberStrategy;
        gsonBuilder29.objectToNumberStrategy = toNumberStrategy33;
        com.google.gson.ToNumberStrategy toNumberStrategy35 = gsonBuilder29.numberToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder37 = gsonBuilder29.setVersion((double) 100);
        com.google.gson.GsonBuilder gsonBuilder38 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy39 = gsonBuilder38.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder40 = gsonBuilder37.setLongSerializationPolicy(longSerializationPolicy39);
        com.google.gson.GsonBuilder gsonBuilder41 = gsonBuilder25.setLongSerializationPolicy(longSerializationPolicy39);
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(toNumberStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy19);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(excluder32);
        org.junit.Assert.assertNotNull(toNumberStrategy33);
        org.junit.Assert.assertNotNull(toNumberStrategy35);
        org.junit.Assert.assertNotNull(gsonBuilder37);
        org.junit.Assert.assertNotNull(longSerializationPolicy39);
        org.junit.Assert.assertNotNull(gsonBuilder40);
        org.junit.Assert.assertNotNull(gsonBuilder41);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test593");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder6.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder7.setVersion((double) 10);
        com.google.gson.LongSerializationPolicy longSerializationPolicy10 = gsonBuilder9.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder11.enableComplexMapKeySerialization();
        gsonBuilder11.serializeSpecialFloatingPointValues = true;
        boolean boolean15 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.Strictness strictness16 = gsonBuilder11.strictness;
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder11.setVersion((double) 0.0f);
        com.google.gson.Gson gson19 = gsonBuilder18.create();
        com.google.gson.ToNumberStrategy toNumberStrategy20 = gsonBuilder18.numberToNumberStrategy;
        gsonBuilder9.objectToNumberStrategy = toNumberStrategy20;
        com.google.gson.GsonBuilder gsonBuilder22 = new com.google.gson.GsonBuilder();
        boolean boolean23 = gsonBuilder22.complexMapKeySerialization;
        boolean boolean24 = gsonBuilder22.useJdkUnsafe;
        boolean boolean25 = gsonBuilder22.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy26 = gsonBuilder22.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy27 = null;
        gsonBuilder22.fieldNamingPolicy = fieldNamingStrategy27;
        com.google.gson.GsonBuilder gsonBuilder29 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder29.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder30.setVersion((double) 10);
        gsonBuilder30.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder35 = new com.google.gson.GsonBuilder();
        boolean boolean36 = gsonBuilder35.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder37 = gsonBuilder35.excluder;
        gsonBuilder30.excluder = excluder37;
        gsonBuilder22.excluder = excluder37;
        boolean boolean40 = gsonBuilder22.escapeHtmlChars;
        com.google.gson.GsonBuilder gsonBuilder41 = new com.google.gson.GsonBuilder();
        boolean boolean42 = gsonBuilder41.complexMapKeySerialization;
        boolean boolean43 = gsonBuilder41.useJdkUnsafe;
        boolean boolean44 = gsonBuilder41.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy45 = gsonBuilder41.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy46 = null;
        gsonBuilder41.fieldNamingPolicy = fieldNamingStrategy46;
        com.google.gson.GsonBuilder gsonBuilder48 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder49 = gsonBuilder48.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder51 = gsonBuilder49.setVersion((double) 10);
        gsonBuilder49.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder54 = new com.google.gson.GsonBuilder();
        boolean boolean55 = gsonBuilder54.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder56 = gsonBuilder54.excluder;
        gsonBuilder49.excluder = excluder56;
        gsonBuilder41.excluder = excluder56;
        com.google.gson.GsonBuilder gsonBuilder59 = gsonBuilder41.enableComplexMapKeySerialization();
        gsonBuilder41.complexMapKeySerialization = false;
        com.google.gson.internal.Excluder excluder62 = gsonBuilder41.excluder;
        gsonBuilder22.excluder = excluder62;
        gsonBuilder9.excluder = excluder62;
        com.google.gson.GsonBuilder gsonBuilder65 = gsonBuilder0.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder62);
        com.google.gson.GsonBuilder gsonBuilder66 = gsonBuilder65.generateNonExecutableJson();
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertNotNull(longSerializationPolicy10);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strictness16);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertNotNull(gson19);
        org.junit.Assert.assertNotNull(toNumberStrategy20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy26);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(excluder37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy45);
        org.junit.Assert.assertNotNull(gsonBuilder49);
        org.junit.Assert.assertNotNull(gsonBuilder51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(excluder56);
        org.junit.Assert.assertNotNull(gsonBuilder59);
        org.junit.Assert.assertNotNull(excluder62);
        org.junit.Assert.assertNotNull(gsonBuilder65);
        org.junit.Assert.assertNotNull(gsonBuilder66);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test594");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.ToNumberStrategy toNumberStrategy2 = gsonBuilder0.numberToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy3 = gsonBuilder0.fieldNamingPolicy;
        boolean boolean4 = gsonBuilder0.escapeHtmlChars;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy2);
        org.junit.Assert.assertNotNull(fieldNamingStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test595");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        int int2 = gsonBuilder0.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder3 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy4 = gsonBuilder3.longSerializationPolicy;
        gsonBuilder3.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList7 = gsonBuilder3.hierarchyFactories;
        com.google.gson.Strictness strictness8 = gsonBuilder3.strictness;
        com.google.gson.LongSerializationPolicy longSerializationPolicy9 = gsonBuilder3.longSerializationPolicy;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy9;
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.FormattingStyle formattingStyle12 = gsonBuilder0.formattingStyle;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList13 = gsonBuilder0.factories;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(longSerializationPolicy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList7);
        org.junit.Assert.assertNull(strictness8);
        org.junit.Assert.assertNotNull(longSerializationPolicy9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(formattingStyle12);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList13);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test596");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder3.numberToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder3.factories;
        boolean boolean6 = gsonBuilder3.serializeSpecialFloatingPointValues;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        gsonBuilder7.serializeSpecialFloatingPointValues = true;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue11 = gsonBuilder7.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder12 = new com.google.gson.GsonBuilder();
        boolean boolean13 = gsonBuilder12.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        boolean boolean15 = gsonBuilder14.complexMapKeySerialization;
        boolean boolean16 = gsonBuilder14.useJdkUnsafe;
        boolean boolean17 = gsonBuilder14.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy18 = gsonBuilder14.objectToNumberStrategy;
        gsonBuilder12.objectToNumberStrategy = toNumberStrategy18;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList20 = gsonBuilder12.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder12.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder21.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle23 = gsonBuilder22.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder7.setFormattingStyle(formattingStyle23);
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder3.setFormattingStyle(formattingStyle23);
        gsonBuilder25.datePattern = "hi!";
        java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> typeMap28 = gsonBuilder25.instanceCreators;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy18);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList20);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(formattingStyle23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(typeMap28);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test597");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy1 = null;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy1;
        gsonBuilder0.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder0.setPrettyPrinting();
        boolean boolean6 = gsonBuilder5.serializeSpecialFloatingPointValues;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList7 = gsonBuilder5.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder5.setPrettyPrinting();
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList9 = gsonBuilder8.hierarchyFactories;
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test598");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder2 = gsonBuilder0.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy3 = gsonBuilder0.numberToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder6 = new com.google.gson.GsonBuilder();
        boolean boolean7 = gsonBuilder6.complexMapKeySerialization;
        boolean boolean8 = gsonBuilder6.useJdkUnsafe;
        boolean boolean9 = gsonBuilder6.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy10 = gsonBuilder6.objectToNumberStrategy;
        gsonBuilder4.objectToNumberStrategy = toNumberStrategy10;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList12 = gsonBuilder4.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder4.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder13.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle15 = gsonBuilder14.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder0.setFormattingStyle(formattingStyle15);
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        boolean boolean18 = gsonBuilder17.complexMapKeySerialization;
        boolean boolean19 = gsonBuilder17.useJdkUnsafe;
        int int20 = gsonBuilder17.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder21 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder22 = gsonBuilder21.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder22.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder25 = new com.google.gson.GsonBuilder();
        boolean boolean26 = gsonBuilder25.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder27 = gsonBuilder25.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy28 = gsonBuilder25.numberToNumberStrategy;
        gsonBuilder24.objectToNumberStrategy = toNumberStrategy28;
        com.google.gson.GsonBuilder gsonBuilder30 = new com.google.gson.GsonBuilder();
        boolean boolean31 = gsonBuilder30.complexMapKeySerialization;
        boolean boolean32 = gsonBuilder30.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy33 = null;
        gsonBuilder30.longSerializationPolicy = longSerializationPolicy33;
        com.google.gson.GsonBuilder gsonBuilder35 = gsonBuilder30.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder36 = new com.google.gson.GsonBuilder();
        boolean boolean37 = gsonBuilder36.complexMapKeySerialization;
        boolean boolean38 = gsonBuilder36.useJdkUnsafe;
        boolean boolean39 = gsonBuilder36.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy40 = gsonBuilder36.objectToNumberStrategy;
        gsonBuilder35.numberToNumberStrategy = toNumberStrategy40;
        com.google.gson.GsonBuilder gsonBuilder42 = gsonBuilder24.setNumberToNumberStrategy(toNumberStrategy40);
        gsonBuilder17.numberToNumberStrategy = toNumberStrategy40;
        com.google.gson.GsonBuilder gsonBuilder44 = gsonBuilder16.setNumberToNumberStrategy(toNumberStrategy40);
        java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> typeMap45 = gsonBuilder44.instanceCreators;
        boolean boolean46 = gsonBuilder44.serializeSpecialFloatingPointValues;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(toNumberStrategy3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy10);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList12);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(formattingStyle15);
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder22);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(excluder27);
        org.junit.Assert.assertNotNull(toNumberStrategy28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(gsonBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy40);
        org.junit.Assert.assertNotNull(gsonBuilder42);
        org.junit.Assert.assertNotNull(gsonBuilder44);
        org.junit.Assert.assertNotNull(typeMap45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test599");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        gsonBuilder0.timeStyle = (-1);
        com.google.gson.LongSerializationPolicy longSerializationPolicy4 = gsonBuilder0.longSerializationPolicy;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder0.setDateFormat(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(longSerializationPolicy4);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test600");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        gsonBuilder0.serializeSpecialFloatingPointValues = true;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue4 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder5 = new com.google.gson.GsonBuilder();
        boolean boolean6 = gsonBuilder5.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        boolean boolean8 = gsonBuilder7.complexMapKeySerialization;
        boolean boolean9 = gsonBuilder7.useJdkUnsafe;
        boolean boolean10 = gsonBuilder7.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy11 = gsonBuilder7.objectToNumberStrategy;
        gsonBuilder5.objectToNumberStrategy = toNumberStrategy11;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList13 = gsonBuilder5.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder5.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder14.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle16 = gsonBuilder15.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder0.setFormattingStyle(formattingStyle16);
        com.google.gson.GsonBuilder gsonBuilder18 = new com.google.gson.GsonBuilder();
        boolean boolean19 = gsonBuilder18.complexMapKeySerialization;
        boolean boolean20 = gsonBuilder18.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy21 = null;
        gsonBuilder18.longSerializationPolicy = longSerializationPolicy21;
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder18.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder24 = new com.google.gson.GsonBuilder();
        boolean boolean25 = gsonBuilder24.complexMapKeySerialization;
        boolean boolean26 = gsonBuilder24.useJdkUnsafe;
        boolean boolean27 = gsonBuilder24.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy28 = gsonBuilder24.objectToNumberStrategy;
        gsonBuilder23.numberToNumberStrategy = toNumberStrategy28;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy28;
        gsonBuilder0.timeStyle = 0;
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder0.setLenient();
        boolean boolean34 = gsonBuilder33.useJdkUnsafe;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy11);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList13);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertNotNull(formattingStyle16);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy28);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test601");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList5 = gsonBuilder0.factories;
        com.google.gson.Gson gson6 = gsonBuilder0.create();
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder(gson6);
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        boolean boolean12 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder13 = gsonBuilder11.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor14 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory15 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList16 = gsonBuilder11.createFactories(constructorConstructor14, jsonAdapterAnnotationTypeAdapterFactory15);
        com.google.gson.GsonBuilder gsonBuilder17 = gsonBuilder10.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory15);
        com.google.gson.GsonBuilder gsonBuilder18 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue19 = gsonBuilder18.reflectionFilters;
        gsonBuilder18.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder23 = gsonBuilder18.setDateFormat((int) (short) 0);
        int[] intArray24 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder23.excludeFieldsWithModifiers(intArray24);
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder25.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder27 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy28 = null;
        gsonBuilder27.numberToNumberStrategy = toNumberStrategy28;
        com.google.gson.Strictness strictness30 = null;
        gsonBuilder27.strictness = strictness30;
        com.google.gson.LongSerializationPolicy longSerializationPolicy32 = gsonBuilder27.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder25.setLongSerializationPolicy(longSerializationPolicy32);
        com.google.gson.GsonBuilder gsonBuilder34 = gsonBuilder17.setLongSerializationPolicy(longSerializationPolicy32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList5);
        org.junit.Assert.assertNotNull(gson6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(excluder13);
        org.junit.Assert.assertNotNull(constructorConstructor14);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory15);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList16);
        org.junit.Assert.assertNotNull(gsonBuilder17);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue19);
        org.junit.Assert.assertNotNull(gsonBuilder23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertNotNull(longSerializationPolicy32);
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertNotNull(gsonBuilder34);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test602");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList4 = gsonBuilder0.hierarchyFactories;
        gsonBuilder0.useJdkUnsafe = false;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue7 = gsonBuilder0.reflectionFilters;
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList4);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue7);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test603");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.ToNumberStrategy toNumberStrategy8 = gsonBuilder0.numberToNumberStrategy;
        gsonBuilder0.complexMapKeySerialization = true;
        com.google.gson.GsonBuilder gsonBuilder11 = new com.google.gson.GsonBuilder();
        boolean boolean12 = gsonBuilder11.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        boolean boolean15 = gsonBuilder13.useJdkUnsafe;
        boolean boolean16 = gsonBuilder13.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy17 = gsonBuilder13.objectToNumberStrategy;
        gsonBuilder11.objectToNumberStrategy = toNumberStrategy17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder11.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder19.setDateFormat("");
        gsonBuilder21.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder24 = new com.google.gson.GsonBuilder();
        boolean boolean25 = gsonBuilder24.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder26 = new com.google.gson.GsonBuilder();
        boolean boolean27 = gsonBuilder26.complexMapKeySerialization;
        boolean boolean28 = gsonBuilder26.useJdkUnsafe;
        boolean boolean29 = gsonBuilder26.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy30 = gsonBuilder26.objectToNumberStrategy;
        gsonBuilder24.objectToNumberStrategy = toNumberStrategy30;
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder24.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder33 = new com.google.gson.GsonBuilder();
        boolean boolean34 = gsonBuilder33.complexMapKeySerialization;
        boolean boolean35 = gsonBuilder33.useJdkUnsafe;
        boolean boolean36 = gsonBuilder33.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy37 = gsonBuilder33.objectToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder38 = gsonBuilder32.setNumberToNumberStrategy(toNumberStrategy37);
        com.google.gson.GsonBuilder gsonBuilder39 = gsonBuilder21.setNumberToNumberStrategy(toNumberStrategy37);
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy37;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList41 = gsonBuilder0.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder42 = gsonBuilder0.serializeSpecialFloatingPointValues();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(toNumberStrategy8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy30);
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy37);
        org.junit.Assert.assertNotNull(gsonBuilder38);
        org.junit.Assert.assertNotNull(gsonBuilder39);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList41);
        org.junit.Assert.assertNotNull(gsonBuilder42);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test604");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        int int3 = gsonBuilder0.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder5 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue6 = gsonBuilder5.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        gsonBuilder7.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray11 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder7.setExclusionStrategies(exclusionStrategyArray11);
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder5.setExclusionStrategies(exclusionStrategyArray11);
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder4.setExclusionStrategies(exclusionStrategyArray11);
        gsonBuilder4.timeStyle = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(exclusionStrategyArray11);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray11, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(gsonBuilder14);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test605");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder7.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder8.setVersion((double) 10);
        gsonBuilder8.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder13 = new com.google.gson.GsonBuilder();
        boolean boolean14 = gsonBuilder13.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder15 = gsonBuilder13.excluder;
        gsonBuilder8.excluder = excluder15;
        gsonBuilder0.excluder = excluder15;
        com.google.gson.GsonBuilder gsonBuilder18 = gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        boolean boolean20 = gsonBuilder19.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder21 = new com.google.gson.GsonBuilder();
        boolean boolean22 = gsonBuilder21.complexMapKeySerialization;
        boolean boolean23 = gsonBuilder21.useJdkUnsafe;
        boolean boolean24 = gsonBuilder21.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy25 = gsonBuilder21.objectToNumberStrategy;
        gsonBuilder19.objectToNumberStrategy = toNumberStrategy25;
        gsonBuilder0.numberToNumberStrategy = toNumberStrategy25;
        com.google.gson.GsonBuilder gsonBuilder28 = new com.google.gson.GsonBuilder();
        boolean boolean29 = gsonBuilder28.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder30 = new com.google.gson.GsonBuilder();
        boolean boolean31 = gsonBuilder30.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder32 = new com.google.gson.GsonBuilder();
        boolean boolean33 = gsonBuilder32.complexMapKeySerialization;
        boolean boolean34 = gsonBuilder32.useJdkUnsafe;
        boolean boolean35 = gsonBuilder32.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy36 = gsonBuilder32.objectToNumberStrategy;
        gsonBuilder30.objectToNumberStrategy = toNumberStrategy36;
        com.google.gson.GsonBuilder gsonBuilder38 = gsonBuilder30.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder39 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy40 = gsonBuilder39.longSerializationPolicy;
        gsonBuilder30.longSerializationPolicy = longSerializationPolicy40;
        com.google.gson.GsonBuilder gsonBuilder42 = gsonBuilder28.setLongSerializationPolicy(longSerializationPolicy40);
        com.google.gson.GsonBuilder gsonBuilder43 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder44 = gsonBuilder43.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder46 = gsonBuilder44.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder47 = new com.google.gson.GsonBuilder();
        boolean boolean48 = gsonBuilder47.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder49 = gsonBuilder47.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy50 = gsonBuilder47.numberToNumberStrategy;
        gsonBuilder46.objectToNumberStrategy = toNumberStrategy50;
        com.google.gson.ToNumberStrategy toNumberStrategy52 = gsonBuilder46.numberToNumberStrategy;
        com.google.gson.LongSerializationPolicy longSerializationPolicy53 = gsonBuilder46.longSerializationPolicy;
        gsonBuilder42.longSerializationPolicy = longSerializationPolicy53;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy53;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy56 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder57 = gsonBuilder0.setFieldNamingPolicy(fieldNamingPolicy56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertNotNull(gsonBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy36);
        org.junit.Assert.assertNotNull(gsonBuilder38);
        org.junit.Assert.assertNotNull(longSerializationPolicy40);
        org.junit.Assert.assertNotNull(gsonBuilder42);
        org.junit.Assert.assertNotNull(gsonBuilder44);
        org.junit.Assert.assertNotNull(gsonBuilder46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(excluder49);
        org.junit.Assert.assertNotNull(toNumberStrategy50);
        org.junit.Assert.assertNotNull(toNumberStrategy52);
        org.junit.Assert.assertNotNull(longSerializationPolicy53);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test606");
        com.google.gson.GsonBuilder gsonBuilder0 = com.google.gson.GsonBuilder.DEFAULT;
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = gsonBuilder0.disableJdkUnsafe();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.excludeFieldsWithoutExposeAnnotation();
        org.junit.Assert.assertNotNull(gsonBuilder0);
// flaky "3) test606(com.google.gson.GsonBuilderRegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(gsonBuilder2);
        org.junit.Assert.assertNotNull(gsonBuilder3);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test607");
        com.google.gson.GsonBuilder gsonBuilder0 = com.google.gson.GsonBuilder.DEFAULT;
        int int1 = gsonBuilder0.timeStyle;
        org.junit.Assert.assertNotNull(gsonBuilder0);
// flaky "4) test607(com.google.gson.GsonBuilderRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test608");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy1 = gsonBuilder0.longSerializationPolicy;
        gsonBuilder0.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder4 = gsonBuilder0.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder5 = gsonBuilder4.enableComplexMapKeySerialization();
        gsonBuilder5.complexMapKeySerialization = false;
        com.google.gson.GsonBuilder gsonBuilder8 = new com.google.gson.GsonBuilder();
        com.google.gson.ToNumberStrategy toNumberStrategy9 = null;
        gsonBuilder8.numberToNumberStrategy = toNumberStrategy9;
        gsonBuilder8.datePattern = "hi!";
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder8.setPrettyPrinting();
        boolean boolean14 = gsonBuilder13.serializeSpecialFloatingPointValues;
        gsonBuilder13.generateNonExecutableJson = true;
        com.google.gson.FormattingStyle formattingStyle17 = gsonBuilder13.formattingStyle;
        gsonBuilder5.formattingStyle = formattingStyle17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder5.serializeNulls();
        org.junit.Assert.assertNotNull(longSerializationPolicy1);
        org.junit.Assert.assertNotNull(gsonBuilder4);
        org.junit.Assert.assertNotNull(gsonBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(formattingStyle17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test609");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.enableComplexMapKeySerialization();
        com.google.gson.FormattingStyle formattingStyle11 = gsonBuilder9.formattingStyle;
        gsonBuilder0.formattingStyle = formattingStyle11;
        com.google.gson.GsonBuilder gsonBuilder13 = gsonBuilder0.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder13.setDateFormat(0);
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        boolean boolean17 = gsonBuilder16.complexMapKeySerialization;
        boolean boolean18 = gsonBuilder16.useJdkUnsafe;
        boolean boolean19 = gsonBuilder16.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy20 = gsonBuilder16.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy21 = null;
        gsonBuilder16.fieldNamingPolicy = fieldNamingStrategy21;
        com.google.gson.GsonBuilder gsonBuilder23 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder23.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder24.setVersion((double) 10);
        gsonBuilder24.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder29 = new com.google.gson.GsonBuilder();
        boolean boolean30 = gsonBuilder29.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder31 = gsonBuilder29.excluder;
        gsonBuilder24.excluder = excluder31;
        gsonBuilder16.excluder = excluder31;
        com.google.gson.GsonBuilder gsonBuilder34 = gsonBuilder16.disableInnerClassSerialization();
        com.google.gson.GsonBuilder gsonBuilder35 = new com.google.gson.GsonBuilder();
        boolean boolean36 = gsonBuilder35.complexMapKeySerialization;
        boolean boolean37 = gsonBuilder35.useJdkUnsafe;
        boolean boolean38 = gsonBuilder35.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy39 = gsonBuilder35.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy40 = null;
        gsonBuilder35.fieldNamingPolicy = fieldNamingStrategy40;
        com.google.gson.GsonBuilder gsonBuilder42 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder43 = gsonBuilder42.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder45 = gsonBuilder43.setVersion((double) 10);
        gsonBuilder43.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder48 = new com.google.gson.GsonBuilder();
        boolean boolean49 = gsonBuilder48.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder50 = gsonBuilder48.excluder;
        gsonBuilder43.excluder = excluder50;
        gsonBuilder35.excluder = excluder50;
        gsonBuilder16.excluder = excluder50;
        gsonBuilder15.excluder = excluder50;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(formattingStyle11);
        org.junit.Assert.assertNotNull(gsonBuilder13);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy20);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(excluder31);
        org.junit.Assert.assertNotNull(gsonBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy39);
        org.junit.Assert.assertNotNull(gsonBuilder43);
        org.junit.Assert.assertNotNull(gsonBuilder45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(excluder50);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test610");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        gsonBuilder0.timeStyle = (short) 1;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue10 = gsonBuilder9.reflectionFilters;
        gsonBuilder9.timeStyle = (-1);
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.setDateFormat((int) (short) 0);
        int[] intArray15 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder14.excludeFieldsWithModifiers(intArray15);
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue18 = gsonBuilder17.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder19 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder19.enableComplexMapKeySerialization();
        gsonBuilder19.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray23 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder19.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder17.setExclusionStrategies(exclusionStrategyArray23);
        com.google.gson.FormattingStyle formattingStyle26 = gsonBuilder17.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy27 = gsonBuilder17.fieldNamingPolicy;
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder16.setFieldNamingStrategy(fieldNamingStrategy27);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder0.setFieldNamingStrategy(fieldNamingStrategy27);
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder29.disableInnerClassSerialization();
        gsonBuilder29.serializeSpecialFloatingPointValues = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue10);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder16);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue18);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(exclusionStrategyArray23);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray23, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(formattingStyle26);
        org.junit.Assert.assertNotNull(fieldNamingStrategy27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(gsonBuilder30);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test611");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy3 = null;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy3;
        gsonBuilder0.generateNonExecutableJson = true;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy7 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy7;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder10.setVersion((double) 10);
        gsonBuilder10.useJdkUnsafe = false;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder17 = gsonBuilder15.excluder;
        gsonBuilder10.excluder = excluder17;
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder0.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) excluder17);
        com.google.gson.GsonBuilder gsonBuilder20 = new com.google.gson.GsonBuilder();
        boolean boolean21 = gsonBuilder20.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder22 = gsonBuilder20.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor23 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory24 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList25 = gsonBuilder20.createFactories(constructorConstructor23, jsonAdapterAnnotationTypeAdapterFactory24);
        com.google.gson.GsonBuilder gsonBuilder26 = gsonBuilder19.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory24);
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder19.generateNonExecutableJson();
        boolean boolean28 = gsonBuilder19.useJdkUnsafe;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(excluder22);
        org.junit.Assert.assertNotNull(constructorConstructor23);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory24);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList25);
        org.junit.Assert.assertNotNull(gsonBuilder26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test612");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.enableComplexMapKeySerialization();
        gsonBuilder2.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray6 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder2.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.FormattingStyle formattingStyle9 = gsonBuilder0.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder10.enableComplexMapKeySerialization();
        gsonBuilder10.serializeSpecialFloatingPointValues = true;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue14 = gsonBuilder10.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        boolean boolean18 = gsonBuilder17.complexMapKeySerialization;
        boolean boolean19 = gsonBuilder17.useJdkUnsafe;
        boolean boolean20 = gsonBuilder17.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy21 = gsonBuilder17.objectToNumberStrategy;
        gsonBuilder15.objectToNumberStrategy = toNumberStrategy21;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList23 = gsonBuilder15.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder15.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder24.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle26 = gsonBuilder25.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder10.setFormattingStyle(formattingStyle26);
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder0.setFormattingStyle(formattingStyle26);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder28.generateNonExecutableJson();
        com.google.gson.internal.Excluder excluder30 = gsonBuilder29.excluder;
        com.google.gson.GsonBuilder gsonBuilder31 = new com.google.gson.GsonBuilder();
        boolean boolean32 = gsonBuilder31.complexMapKeySerialization;
        boolean boolean33 = gsonBuilder31.useJdkUnsafe;
        boolean boolean34 = gsonBuilder31.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy35 = gsonBuilder31.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList36 = gsonBuilder31.factories;
        com.google.gson.Gson gson37 = gsonBuilder31.create();
        int int38 = gsonBuilder31.timeStyle;
        com.google.gson.Gson gson39 = gsonBuilder31.create();
        com.google.gson.internal.ConstructorConstructor constructorConstructor40 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.GsonBuilder gsonBuilder41 = new com.google.gson.GsonBuilder();
        boolean boolean42 = gsonBuilder41.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder43 = gsonBuilder41.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor44 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory45 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList46 = gsonBuilder41.createFactories(constructorConstructor44, jsonAdapterAnnotationTypeAdapterFactory45);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList47 = gsonBuilder31.createFactories(constructorConstructor40, jsonAdapterAnnotationTypeAdapterFactory45);
        com.google.gson.GsonBuilder gsonBuilder48 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder49 = gsonBuilder48.enableComplexMapKeySerialization();
        gsonBuilder48.serializeSpecialFloatingPointValues = true;
        boolean boolean52 = gsonBuilder48.complexMapKeySerialization;
        com.google.gson.Strictness strictness53 = gsonBuilder48.strictness;
        com.google.gson.GsonBuilder gsonBuilder54 = gsonBuilder48.generateNonExecutableJson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor55 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.GsonBuilder gsonBuilder56 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder57 = gsonBuilder56.enableComplexMapKeySerialization();
        com.google.gson.Gson gson58 = gsonBuilder57.create();
        gsonBuilder57.serializeNulls = false;
        boolean boolean61 = gsonBuilder57.complexMapKeySerialization;
        gsonBuilder57.serializeNulls = false;
        com.google.gson.GsonBuilder gsonBuilder64 = gsonBuilder57.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder65 = new com.google.gson.GsonBuilder();
        boolean boolean66 = gsonBuilder65.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder67 = gsonBuilder65.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor68 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory69 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList70 = gsonBuilder65.createFactories(constructorConstructor68, jsonAdapterAnnotationTypeAdapterFactory69);
        com.google.gson.GsonBuilder gsonBuilder71 = gsonBuilder57.registerTypeAdapterFactory((com.google.gson.TypeAdapterFactory) jsonAdapterAnnotationTypeAdapterFactory69);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList72 = gsonBuilder48.createFactories(constructorConstructor55, jsonAdapterAnnotationTypeAdapterFactory69);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList73 = gsonBuilder29.createFactories(constructorConstructor40, jsonAdapterAnnotationTypeAdapterFactory69);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(exclusionStrategyArray6);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray6, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(formattingStyle9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy21);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(formattingStyle26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(excluder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy35);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList36);
        org.junit.Assert.assertNotNull(gson37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(gson39);
        org.junit.Assert.assertNotNull(constructorConstructor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(excluder43);
        org.junit.Assert.assertNotNull(constructorConstructor44);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory45);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList46);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList47);
        org.junit.Assert.assertNotNull(gsonBuilder49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(strictness53);
        org.junit.Assert.assertNotNull(gsonBuilder54);
        org.junit.Assert.assertNotNull(constructorConstructor55);
        org.junit.Assert.assertNotNull(gsonBuilder57);
        org.junit.Assert.assertNotNull(gson58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(gsonBuilder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(excluder67);
        org.junit.Assert.assertNotNull(constructorConstructor68);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory69);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList70);
        org.junit.Assert.assertNotNull(gsonBuilder71);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList72);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList73);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test613");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        int int2 = gsonBuilder0.dateStyle;
        com.google.gson.GsonBuilder gsonBuilder3 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy4 = gsonBuilder3.longSerializationPolicy;
        gsonBuilder3.serializeNulls = false;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList7 = gsonBuilder3.hierarchyFactories;
        com.google.gson.Strictness strictness8 = gsonBuilder3.strictness;
        com.google.gson.LongSerializationPolicy longSerializationPolicy9 = gsonBuilder3.longSerializationPolicy;
        gsonBuilder0.longSerializationPolicy = longSerializationPolicy9;
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder0.disableJdkUnsafe();
        gsonBuilder11.serializeSpecialFloatingPointValues = true;
        boolean boolean14 = gsonBuilder11.escapeHtmlChars;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(longSerializationPolicy4);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList7);
        org.junit.Assert.assertNull(strictness8);
        org.junit.Assert.assertNotNull(longSerializationPolicy9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test614");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder6 = gsonBuilder4.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy7 = gsonBuilder4.numberToNumberStrategy;
        gsonBuilder3.objectToNumberStrategy = toNumberStrategy7;
        com.google.gson.ToNumberStrategy toNumberStrategy9 = gsonBuilder3.numberToNumberStrategy;
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder3.setVersion((double) 100);
        com.google.gson.GsonBuilder gsonBuilder12 = new com.google.gson.GsonBuilder();
        com.google.gson.LongSerializationPolicy longSerializationPolicy13 = gsonBuilder12.longSerializationPolicy;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder11.setLongSerializationPolicy(longSerializationPolicy13);
        com.google.gson.ReflectionAccessFilter reflectionAccessFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.GsonBuilder gsonBuilder16 = gsonBuilder11.addReflectionAccessFilter(reflectionAccessFilter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(toNumberStrategy7);
        org.junit.Assert.assertNotNull(toNumberStrategy9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(longSerializationPolicy13);
        org.junit.Assert.assertNotNull(gsonBuilder14);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test615");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue1 = gsonBuilder0.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder2.enableComplexMapKeySerialization();
        gsonBuilder2.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray6 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder7 = gsonBuilder2.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.GsonBuilder gsonBuilder8 = gsonBuilder0.setExclusionStrategies(exclusionStrategyArray6);
        com.google.gson.FormattingStyle formattingStyle9 = gsonBuilder0.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder10 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder10.enableComplexMapKeySerialization();
        gsonBuilder10.serializeSpecialFloatingPointValues = true;
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue14 = gsonBuilder10.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder17 = new com.google.gson.GsonBuilder();
        boolean boolean18 = gsonBuilder17.complexMapKeySerialization;
        boolean boolean19 = gsonBuilder17.useJdkUnsafe;
        boolean boolean20 = gsonBuilder17.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy21 = gsonBuilder17.objectToNumberStrategy;
        gsonBuilder15.objectToNumberStrategy = toNumberStrategy21;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList23 = gsonBuilder15.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder15.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder24.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.FormattingStyle formattingStyle26 = gsonBuilder25.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder27 = gsonBuilder10.setFormattingStyle(formattingStyle26);
        com.google.gson.GsonBuilder gsonBuilder28 = gsonBuilder0.setFormattingStyle(formattingStyle26);
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder28.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder30 = new com.google.gson.GsonBuilder();
        boolean boolean31 = gsonBuilder30.complexMapKeySerialization;
        boolean boolean32 = gsonBuilder30.useJdkUnsafe;
        boolean boolean33 = gsonBuilder30.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy34 = gsonBuilder30.objectToNumberStrategy;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList35 = gsonBuilder30.factories;
        com.google.gson.Gson gson36 = gsonBuilder30.create();
        int int37 = gsonBuilder30.timeStyle;
        com.google.gson.Gson gson38 = gsonBuilder30.create();
        com.google.gson.internal.ConstructorConstructor constructorConstructor39 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.GsonBuilder gsonBuilder40 = new com.google.gson.GsonBuilder();
        boolean boolean41 = gsonBuilder40.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder42 = gsonBuilder40.excluder;
        com.google.gson.internal.ConstructorConstructor constructorConstructor43 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR;
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory44 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList45 = gsonBuilder40.createFactories(constructorConstructor43, jsonAdapterAnnotationTypeAdapterFactory44);
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList46 = gsonBuilder30.createFactories(constructorConstructor39, jsonAdapterAnnotationTypeAdapterFactory44);
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory47 = null;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList48 = gsonBuilder29.createFactories(constructorConstructor39, jsonAdapterAnnotationTypeAdapterFactory47);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertNotNull(exclusionStrategyArray6);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray6, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder7);
        org.junit.Assert.assertNotNull(gsonBuilder8);
        org.junit.Assert.assertNotNull(formattingStyle9);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy21);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList23);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(formattingStyle26);
        org.junit.Assert.assertNotNull(gsonBuilder27);
        org.junit.Assert.assertNotNull(gsonBuilder28);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy34);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList35);
        org.junit.Assert.assertNotNull(gson36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(gson38);
        org.junit.Assert.assertNotNull(constructorConstructor39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(excluder42);
        org.junit.Assert.assertNotNull(constructorConstructor43);
        org.junit.Assert.assertNotNull(jsonAdapterAnnotationTypeAdapterFactory44);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList45);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList46);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList48);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test616");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder0.generateNonExecutableJson();
        boolean boolean4 = gsonBuilder0.serializeSpecialFloatingPointValues;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test617");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder3 = gsonBuilder1.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder4 = new com.google.gson.GsonBuilder();
        boolean boolean5 = gsonBuilder4.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder6 = gsonBuilder4.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy7 = gsonBuilder4.numberToNumberStrategy;
        gsonBuilder3.objectToNumberStrategy = toNumberStrategy7;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        boolean boolean10 = gsonBuilder9.complexMapKeySerialization;
        boolean boolean11 = gsonBuilder9.useJdkUnsafe;
        com.google.gson.LongSerializationPolicy longSerializationPolicy12 = null;
        gsonBuilder9.longSerializationPolicy = longSerializationPolicy12;
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.generateNonExecutableJson();
        com.google.gson.GsonBuilder gsonBuilder15 = new com.google.gson.GsonBuilder();
        boolean boolean16 = gsonBuilder15.complexMapKeySerialization;
        boolean boolean17 = gsonBuilder15.useJdkUnsafe;
        boolean boolean18 = gsonBuilder15.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy19 = gsonBuilder15.objectToNumberStrategy;
        gsonBuilder14.numberToNumberStrategy = toNumberStrategy19;
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder3.setNumberToNumberStrategy(toNumberStrategy19);
        com.google.gson.GsonBuilder gsonBuilder22 = new com.google.gson.GsonBuilder();
        boolean boolean23 = gsonBuilder22.complexMapKeySerialization;
        boolean boolean24 = gsonBuilder22.useJdkUnsafe;
        boolean boolean25 = gsonBuilder22.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy26 = gsonBuilder22.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy27 = null;
        gsonBuilder22.fieldNamingPolicy = fieldNamingStrategy27;
        com.google.gson.GsonBuilder gsonBuilder30 = gsonBuilder22.setDateFormat("");
        com.google.gson.FormattingStyle formattingStyle31 = gsonBuilder22.formattingStyle;
        com.google.gson.GsonBuilder gsonBuilder32 = gsonBuilder21.setFormattingStyle(formattingStyle31);
        boolean boolean33 = gsonBuilder21.serializeSpecialFloatingPointValues;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gsonBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(toNumberStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy19);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy26);
        org.junit.Assert.assertNotNull(gsonBuilder30);
        org.junit.Assert.assertNotNull(formattingStyle31);
        org.junit.Assert.assertNotNull(gsonBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test618");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        boolean boolean2 = gsonBuilder0.useJdkUnsafe;
        boolean boolean3 = gsonBuilder0.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy4 = gsonBuilder0.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy5 = null;
        gsonBuilder0.fieldNamingPolicy = fieldNamingStrategy5;
        com.google.gson.ToNumberStrategy toNumberStrategy7 = gsonBuilder0.numberToNumberStrategy;
        boolean boolean8 = gsonBuilder0.useJdkUnsafe;
        gsonBuilder0.datePattern = "";
        int[] intArray11 = new int[] {};
        com.google.gson.GsonBuilder gsonBuilder12 = gsonBuilder0.excludeFieldsWithModifiers(intArray11);
        gsonBuilder12.complexMapKeySerialization = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy4);
        org.junit.Assert.assertNotNull(toNumberStrategy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertNotNull(gsonBuilder12);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test619");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder1 = gsonBuilder0.enableComplexMapKeySerialization();
        com.google.gson.Gson gson2 = gsonBuilder1.create();
        gsonBuilder1.serializeNulls = false;
        com.google.gson.Strictness strictness5 = gsonBuilder1.strictness;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList6 = gsonBuilder1.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder7 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue8 = gsonBuilder7.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder9 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.enableComplexMapKeySerialization();
        gsonBuilder9.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray13 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder14 = gsonBuilder9.setExclusionStrategies(exclusionStrategyArray13);
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder7.setExclusionStrategies(exclusionStrategyArray13);
        com.google.gson.GsonBuilder gsonBuilder16 = new com.google.gson.GsonBuilder();
        boolean boolean17 = gsonBuilder16.complexMapKeySerialization;
        boolean boolean18 = gsonBuilder16.useJdkUnsafe;
        boolean boolean19 = gsonBuilder16.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy20 = gsonBuilder16.objectToNumberStrategy;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy21 = null;
        gsonBuilder16.fieldNamingPolicy = fieldNamingStrategy21;
        com.google.gson.GsonBuilder gsonBuilder24 = gsonBuilder16.setDateFormat("");
        com.google.gson.GsonBuilder gsonBuilder25 = gsonBuilder16.setLenient();
        com.google.gson.GsonBuilder gsonBuilder26 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue27 = gsonBuilder26.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder28 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder29 = gsonBuilder28.enableComplexMapKeySerialization();
        gsonBuilder28.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray32 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder33 = gsonBuilder28.setExclusionStrategies(exclusionStrategyArray32);
        com.google.gson.GsonBuilder gsonBuilder34 = gsonBuilder26.setExclusionStrategies(exclusionStrategyArray32);
        com.google.gson.FormattingStyle formattingStyle35 = gsonBuilder26.formattingStyle;
        com.google.gson.FieldNamingStrategy fieldNamingStrategy36 = gsonBuilder26.fieldNamingPolicy;
        gsonBuilder25.fieldNamingPolicy = fieldNamingStrategy36;
        com.google.gson.GsonBuilder gsonBuilder38 = gsonBuilder15.setFieldNamingStrategy(fieldNamingStrategy36);
        com.google.gson.GsonBuilder gsonBuilder39 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder40 = gsonBuilder39.enableComplexMapKeySerialization();
        com.google.gson.GsonBuilder gsonBuilder42 = gsonBuilder40.setVersion((double) 10);
        com.google.gson.GsonBuilder gsonBuilder43 = new com.google.gson.GsonBuilder();
        boolean boolean44 = gsonBuilder43.complexMapKeySerialization;
        com.google.gson.internal.Excluder excluder45 = gsonBuilder43.excluder;
        com.google.gson.ToNumberStrategy toNumberStrategy46 = gsonBuilder43.numberToNumberStrategy;
        gsonBuilder42.objectToNumberStrategy = toNumberStrategy46;
        com.google.gson.GsonBuilder gsonBuilder48 = gsonBuilder38.setNumberToNumberStrategy(toNumberStrategy46);
        gsonBuilder1.numberToNumberStrategy = toNumberStrategy46;
        boolean boolean50 = gsonBuilder1.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy51 = gsonBuilder1.objectToNumberStrategy;
        org.junit.Assert.assertNotNull(gsonBuilder1);
        org.junit.Assert.assertNotNull(gson2);
        org.junit.Assert.assertNull(strictness5);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList6);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue8);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(exclusionStrategyArray13);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray13, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder14);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy20);
        org.junit.Assert.assertNotNull(gsonBuilder24);
        org.junit.Assert.assertNotNull(gsonBuilder25);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue27);
        org.junit.Assert.assertNotNull(gsonBuilder29);
        org.junit.Assert.assertNotNull(exclusionStrategyArray32);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray32, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder33);
        org.junit.Assert.assertNotNull(gsonBuilder34);
        org.junit.Assert.assertNotNull(formattingStyle35);
        org.junit.Assert.assertNotNull(fieldNamingStrategy36);
        org.junit.Assert.assertNotNull(gsonBuilder38);
        org.junit.Assert.assertNotNull(gsonBuilder40);
        org.junit.Assert.assertNotNull(gsonBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(excluder45);
        org.junit.Assert.assertNotNull(toNumberStrategy46);
        org.junit.Assert.assertNotNull(gsonBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy51);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GsonBuilderRegressionTest1.test620");
        com.google.gson.GsonBuilder gsonBuilder0 = new com.google.gson.GsonBuilder();
        boolean boolean1 = gsonBuilder0.complexMapKeySerialization;
        com.google.gson.GsonBuilder gsonBuilder2 = new com.google.gson.GsonBuilder();
        boolean boolean3 = gsonBuilder2.complexMapKeySerialization;
        boolean boolean4 = gsonBuilder2.useJdkUnsafe;
        boolean boolean5 = gsonBuilder2.serializeSpecialFloatingPointValues;
        com.google.gson.ToNumberStrategy toNumberStrategy6 = gsonBuilder2.objectToNumberStrategy;
        gsonBuilder0.objectToNumberStrategy = toNumberStrategy6;
        java.util.List<com.google.gson.TypeAdapterFactory> typeAdapterFactoryList8 = gsonBuilder0.hierarchyFactories;
        com.google.gson.GsonBuilder gsonBuilder9 = gsonBuilder0.serializeNulls();
        com.google.gson.GsonBuilder gsonBuilder10 = gsonBuilder9.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.GsonBuilder gsonBuilder11 = gsonBuilder9.disableHtmlEscaping();
        com.google.gson.GsonBuilder gsonBuilder12 = new com.google.gson.GsonBuilder();
        java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionAccessFilterQueue13 = gsonBuilder12.reflectionFilters;
        com.google.gson.GsonBuilder gsonBuilder14 = new com.google.gson.GsonBuilder();
        com.google.gson.GsonBuilder gsonBuilder15 = gsonBuilder14.enableComplexMapKeySerialization();
        gsonBuilder14.datePattern = "";
        com.google.gson.ExclusionStrategy[] exclusionStrategyArray18 = new com.google.gson.ExclusionStrategy[] {};
        com.google.gson.GsonBuilder gsonBuilder19 = gsonBuilder14.setExclusionStrategies(exclusionStrategyArray18);
        com.google.gson.GsonBuilder gsonBuilder20 = gsonBuilder12.setExclusionStrategies(exclusionStrategyArray18);
        com.google.gson.GsonBuilder gsonBuilder21 = gsonBuilder9.setExclusionStrategies(exclusionStrategyArray18);
        com.google.gson.LongSerializationPolicy longSerializationPolicy22 = gsonBuilder9.longSerializationPolicy;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toNumberStrategy6);
        org.junit.Assert.assertNotNull(typeAdapterFactoryList8);
        org.junit.Assert.assertNotNull(gsonBuilder9);
        org.junit.Assert.assertNotNull(gsonBuilder10);
        org.junit.Assert.assertNotNull(gsonBuilder11);
        org.junit.Assert.assertNotNull(reflectionAccessFilterQueue13);
        org.junit.Assert.assertNotNull(gsonBuilder15);
        org.junit.Assert.assertNotNull(exclusionStrategyArray18);
        org.junit.Assert.assertArrayEquals(exclusionStrategyArray18, new com.google.gson.ExclusionStrategy[] {});
        org.junit.Assert.assertNotNull(gsonBuilder19);
        org.junit.Assert.assertNotNull(gsonBuilder20);
        org.junit.Assert.assertNotNull(gsonBuilder21);
        org.junit.Assert.assertNotNull(longSerializationPolicy22);
    }
}
