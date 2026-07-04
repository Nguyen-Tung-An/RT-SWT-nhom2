import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_016_Regression2 {

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
            System.out.format("%n%s%n", "JA_016_Regression2.test1001");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter0.nullSafe();
        java.io.Writer writer27 = null;
        java.util.Date date28 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.toJson(writer27, date28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1002");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter9.fromJsonTree(jsonElement17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = dateTypeAdapter22.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 1 column 1 path $?See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1003");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter4.toJsonTree(date8);
        java.util.Date date10 = utcDateTypeAdapter0.fromJsonTree(jsonElement9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter12.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter14.toJsonTree(date15);
        java.util.Date date17 = utcDateTypeAdapter0.fromJsonTree(jsonElement16);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter18 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter18.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter18.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = dateTypeAdapter21.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter21.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter23.nullSafe();
        java.util.Date date25 = null;
        java.lang.String str26 = dateTypeAdapter23.toJson(date25);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter27 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date28 = null;
        java.lang.String str29 = utcDateTypeAdapter27.toJson(date28);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = utcDateTypeAdapter27.nullSafe();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = utcDateTypeAdapter27.toJsonTree(date31);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter33 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date34 = null;
        java.lang.String str35 = utcDateTypeAdapter33.toJson(date34);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter33.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter37 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date38 = null;
        java.lang.String str39 = utcDateTypeAdapter37.toJson(date38);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = utcDateTypeAdapter37.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter41 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date42 = null;
        java.lang.String str43 = utcDateTypeAdapter41.toJson(date42);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter44 = utcDateTypeAdapter41.nullSafe();
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter41.toJsonTree(date45);
        java.util.Date date47 = utcDateTypeAdapter37.fromJsonTree(jsonElement46);
        java.util.Date date48 = dateTypeAdapter36.fromJsonTree(jsonElement46);
        java.util.Date date49 = utcDateTypeAdapter27.fromJsonTree(jsonElement46);
        java.util.Date date50 = dateTypeAdapter23.fromJsonTree(jsonElement46);
        java.util.Date date51 = utcDateTypeAdapter0.fromJsonTree(jsonElement46);
        java.util.Date date52 = null;
        com.google.gson.JsonElement jsonElement53 = utcDateTypeAdapter0.toJsonTree(date52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null" + "'", str29, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(jsonElement32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "null" + "'", str43, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNotNull(jsonElement53);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1004");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter36.nullSafe();
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter36.toJsonTree(date38);
        java.util.Date date40 = dateTypeAdapter31.fromJsonTree(jsonElement39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter31.nullSafe();
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter41.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter0.fromJsonTree(jsonElement43);
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter0.toJsonTree(date45);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = utcDateTypeAdapter0.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonElement39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1005");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter8.toJson(date10);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter12.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter12.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter15.nullSafe();
        java.util.Date date19 = dateTypeAdapter17.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter17.nullSafe();
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter20.toJson(date21);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = dateTypeAdapter28.toJsonTree(date29);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter31 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter31.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter32.nullSafe();
        java.util.Date date34 = null;
        java.lang.String str35 = dateTypeAdapter33.toJson(date34);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = utcDateTypeAdapter36.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = dateTypeAdapter37.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = utcDateTypeAdapter43.toJsonTree(date47);
        java.util.Date date49 = utcDateTypeAdapter39.fromJsonTree(jsonElement48);
        java.util.Date date50 = dateTypeAdapter37.fromJsonTree(jsonElement48);
        java.util.Date date51 = dateTypeAdapter33.fromJsonTree(jsonElement48);
        java.util.Date date52 = dateTypeAdapter28.fromJsonTree(jsonElement48);
        java.util.Date date53 = dateTypeAdapter20.fromJsonTree(jsonElement48);
        java.util.Date date54 = dateTypeAdapter8.fromJsonTree(jsonElement48);
        java.util.Date date55 = dateTypeAdapter2.fromJsonTree(jsonElement48);
        java.util.Date date56 = null;
        com.google.gson.JsonElement jsonElement57 = dateTypeAdapter2.toJsonTree(date56);
        java.util.Date date59 = dateTypeAdapter2.fromJson("null");
        java.io.Reader reader60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date61 = dateTypeAdapter2.fromJson(reader60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertNull(date54);
        org.junit.Assert.assertNull(date55);
        org.junit.Assert.assertNotNull(jsonElement57);
        org.junit.Assert.assertNull(date59);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1006");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = utcDateTypeAdapter0.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 1 column 1 path $?See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1007");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter3.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter3.toJson(date8);
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter3.toJson(date10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1008");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter9.fromJsonTree(jsonElement17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        java.io.Writer writer23 = null;
        java.util.Date date24 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.toJson(writer23, date24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1009");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        java.util.Date date10 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter12.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter12.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        java.lang.String str18 = dateTypeAdapter15.toJson(date17);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter19.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter27 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date28 = null;
        java.lang.String str29 = utcDateTypeAdapter27.toJson(date28);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = utcDateTypeAdapter27.nullSafe();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = utcDateTypeAdapter27.toJsonTree(date31);
        java.util.Date date33 = utcDateTypeAdapter23.fromJsonTree(jsonElement32);
        java.util.Date date34 = dateTypeAdapter22.fromJsonTree(jsonElement32);
        java.util.Date date35 = dateTypeAdapter15.fromJsonTree(jsonElement32);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter36.toJson(date37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter36.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = dateTypeAdapter41.nullSafe();
        java.util.Date date43 = null;
        java.lang.String str44 = dateTypeAdapter42.toJson(date43);
        java.util.Date date45 = null;
        java.lang.String str46 = dateTypeAdapter42.toJson(date45);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter42.nullSafe();
        java.util.Date date48 = null;
        com.google.gson.JsonElement jsonElement49 = dateTypeAdapter42.toJsonTree(date48);
        java.util.Date date50 = dateTypeAdapter15.fromJsonTree(jsonElement49);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date52 = null;
        java.lang.String str53 = utcDateTypeAdapter51.toJson(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = utcDateTypeAdapter51.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = dateTypeAdapter54.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = dateTypeAdapter54.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = dateTypeAdapter56.nullSafe();
        java.util.Date date58 = null;
        java.lang.String str59 = dateTypeAdapter56.toJson(date58);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter60 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date61 = null;
        java.lang.String str62 = utcDateTypeAdapter60.toJson(date61);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter63 = utcDateTypeAdapter60.nullSafe();
        java.util.Date date64 = null;
        com.google.gson.JsonElement jsonElement65 = utcDateTypeAdapter60.toJsonTree(date64);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter66 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date67 = null;
        java.lang.String str68 = utcDateTypeAdapter66.toJson(date67);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter69 = utcDateTypeAdapter66.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter70 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date71 = null;
        java.lang.String str72 = utcDateTypeAdapter70.toJson(date71);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter73 = utcDateTypeAdapter70.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter74 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date75 = null;
        java.lang.String str76 = utcDateTypeAdapter74.toJson(date75);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter77 = utcDateTypeAdapter74.nullSafe();
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = utcDateTypeAdapter74.toJsonTree(date78);
        java.util.Date date80 = utcDateTypeAdapter70.fromJsonTree(jsonElement79);
        java.util.Date date81 = dateTypeAdapter69.fromJsonTree(jsonElement79);
        java.util.Date date82 = utcDateTypeAdapter60.fromJsonTree(jsonElement79);
        java.util.Date date83 = dateTypeAdapter56.fromJsonTree(jsonElement79);
        java.util.Date date84 = dateTypeAdapter15.fromJsonTree(jsonElement79);
        java.util.Date date85 = dateTypeAdapter11.fromJsonTree(jsonElement79);
        java.io.Writer writer86 = null;
        java.util.Date date87 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter11.toJson(writer86, date87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null" + "'", str29, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(jsonElement32);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "null" + "'", str44, "null");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "null" + "'", str46, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(jsonElement49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null" + "'", str53, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter54);
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "null" + "'", str59, "null");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "null" + "'", str62, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter63);
        org.junit.Assert.assertNotNull(jsonElement65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "null" + "'", str68, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "null" + "'", str72, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "null" + "'", str76, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNull(date81);
        org.junit.Assert.assertNull(date82);
        org.junit.Assert.assertNull(date83);
        org.junit.Assert.assertNull(date84);
        org.junit.Assert.assertNull(date85);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1010");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter8.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter8.toJson(date13);
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter8.toJson(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter8.toJsonTree(date17);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter19.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter27.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter30 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date31 = null;
        java.lang.String str32 = utcDateTypeAdapter30.toJson(date31);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = utcDateTypeAdapter30.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = dateTypeAdapter33.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter34.nullSafe();
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = dateTypeAdapter35.toJsonTree(date36);
        java.util.Date date38 = dateTypeAdapter29.fromJsonTree(jsonElement37);
        java.util.Date date39 = dateTypeAdapter22.fromJsonTree(jsonElement37);
        java.util.Date date41 = dateTypeAdapter22.fromJson("null");
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter22.toJsonTree(date42);
        java.util.Date date44 = null;
        java.lang.String str45 = dateTypeAdapter22.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = dateTypeAdapter22.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = dateTypeAdapter22.toJsonTree(date47);
        java.util.Date date49 = dateTypeAdapter8.fromJsonTree(jsonElement48);
        java.util.Date date50 = null;
        com.google.gson.JsonElement jsonElement51 = dateTypeAdapter8.toJsonTree(date50);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter52 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date53 = null;
        java.lang.String str54 = utcDateTypeAdapter52.toJson(date53);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = utcDateTypeAdapter52.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter57.nullSafe();
        java.util.Date date59 = null;
        java.lang.String str60 = dateTypeAdapter57.toJson(date59);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter61 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = utcDateTypeAdapter61.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter63 = dateTypeAdapter62.nullSafe();
        java.util.Date date64 = null;
        com.google.gson.JsonElement jsonElement65 = dateTypeAdapter62.toJsonTree(date64);
        java.util.Date date66 = dateTypeAdapter57.fromJsonTree(jsonElement65);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter67 = dateTypeAdapter57.nullSafe();
        java.util.Date date68 = null;
        com.google.gson.JsonElement jsonElement69 = dateTypeAdapter67.toJsonTree(date68);
        java.util.Date date70 = dateTypeAdapter8.fromJsonTree(jsonElement69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNotNull(jsonElement51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "null" + "'", str54, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "null" + "'", str60, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertNotNull(dateTypeAdapter63);
        org.junit.Assert.assertNotNull(jsonElement65);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNotNull(dateTypeAdapter67);
        org.junit.Assert.assertNotNull(jsonElement69);
        org.junit.Assert.assertNull(date70);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1011");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter3.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter3.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter3.toJson(date9);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = dateTypeAdapter3.toJsonTree(date11);
        java.io.Writer writer13 = null;
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter3.toJson(writer13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1012");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter24.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter30 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date31 = null;
        java.lang.String str32 = utcDateTypeAdapter30.toJson(date31);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = utcDateTypeAdapter30.nullSafe();
        java.util.Date date34 = null;
        com.google.gson.JsonElement jsonElement35 = utcDateTypeAdapter30.toJsonTree(date34);
        java.util.Date date36 = utcDateTypeAdapter26.fromJsonTree(jsonElement35);
        java.util.Date date37 = dateTypeAdapter24.fromJsonTree(jsonElement35);
        java.util.Date date38 = utcDateTypeAdapter0.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter0.toJson(date40);
        com.google.gson.stream.JsonWriter jsonWriter42 = null;
        java.util.Date date43 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter42, date43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(jsonElement35);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1013");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter8.toJson(date10);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter12.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter12.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter15.nullSafe();
        java.util.Date date19 = dateTypeAdapter17.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter17.nullSafe();
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter20.toJson(date21);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = dateTypeAdapter28.toJsonTree(date29);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter31 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter31.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter32.nullSafe();
        java.util.Date date34 = null;
        java.lang.String str35 = dateTypeAdapter33.toJson(date34);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = utcDateTypeAdapter36.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = dateTypeAdapter37.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = utcDateTypeAdapter43.toJsonTree(date47);
        java.util.Date date49 = utcDateTypeAdapter39.fromJsonTree(jsonElement48);
        java.util.Date date50 = dateTypeAdapter37.fromJsonTree(jsonElement48);
        java.util.Date date51 = dateTypeAdapter33.fromJsonTree(jsonElement48);
        java.util.Date date52 = dateTypeAdapter28.fromJsonTree(jsonElement48);
        java.util.Date date53 = dateTypeAdapter20.fromJsonTree(jsonElement48);
        java.util.Date date54 = dateTypeAdapter8.fromJsonTree(jsonElement48);
        java.util.Date date55 = dateTypeAdapter2.fromJsonTree(jsonElement48);
        java.util.Date date56 = null;
        com.google.gson.JsonElement jsonElement57 = dateTypeAdapter2.toJsonTree(date56);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter59 = dateTypeAdapter2.nullSafe();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertNull(date54);
        org.junit.Assert.assertNull(date55);
        org.junit.Assert.assertNotNull(jsonElement57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertNotNull(dateTypeAdapter59);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1014");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter9.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter0.fromJsonTree(jsonElement13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter0.toJsonTree(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter19 = null;
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter19, date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1015");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter5.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter5.toJson(date10);
        java.util.Date date12 = null;
        java.lang.String str13 = dateTypeAdapter5.toJson(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = dateTypeAdapter5.toJsonTree(date14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = dateTypeAdapter5.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 1 column 1 path $?See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1016");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = utcDateTypeAdapter7.fromJsonTree(jsonElement16);
        java.util.Date date18 = utcDateTypeAdapter5.fromJsonTree(jsonElement16);
        java.util.Date date19 = dateTypeAdapter2.fromJsonTree(jsonElement16);
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter2.toJson(date20);
        java.util.Date date22 = null;
        java.lang.String str23 = dateTypeAdapter2.toJson(date22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter2.toJsonTree(date24);
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = dateTypeAdapter2.toJsonTree(date26);
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNotNull(jsonElement27);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1017");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateTypeAdapter8.fromJson(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1018");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        java.util.Date date10 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter12.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter13.toJsonTree(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter13.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter11.fromJsonTree(jsonElement18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1019");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter2.nullSafe();
        java.util.Date date9 = dateTypeAdapter7.fromJson("null");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter7.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 1 column 1 path $?See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1020");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter36.nullSafe();
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter36.toJsonTree(date38);
        java.util.Date date40 = dateTypeAdapter31.fromJsonTree(jsonElement39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter31.nullSafe();
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter41.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter0.fromJsonTree(jsonElement43);
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter0.toJsonTree(date45);
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = utcDateTypeAdapter0.toJsonTree(date47);
        java.util.Date date49 = null;
        java.lang.String str50 = utcDateTypeAdapter0.toJson(date49);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date52 = null;
        java.lang.String str53 = utcDateTypeAdapter51.toJson(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = utcDateTypeAdapter51.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = dateTypeAdapter54.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = dateTypeAdapter54.nullSafe();
        java.util.Date date58 = dateTypeAdapter56.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter59 = dateTypeAdapter56.nullSafe();
        java.util.Date date60 = null;
        com.google.gson.JsonElement jsonElement61 = dateTypeAdapter59.toJsonTree(date60);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = dateTypeAdapter59.nullSafe();
        java.util.Date date63 = null;
        com.google.gson.JsonElement jsonElement64 = dateTypeAdapter59.toJsonTree(date63);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter65 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter66 = utcDateTypeAdapter65.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter67 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date68 = null;
        java.lang.String str69 = utcDateTypeAdapter67.toJson(date68);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter70 = utcDateTypeAdapter67.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter71 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date72 = null;
        java.lang.String str73 = utcDateTypeAdapter71.toJson(date72);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter74 = utcDateTypeAdapter71.nullSafe();
        java.util.Date date75 = null;
        com.google.gson.JsonElement jsonElement76 = utcDateTypeAdapter71.toJsonTree(date75);
        java.util.Date date77 = utcDateTypeAdapter67.fromJsonTree(jsonElement76);
        java.util.Date date78 = utcDateTypeAdapter65.fromJsonTree(jsonElement76);
        java.util.Date date79 = dateTypeAdapter59.fromJsonTree(jsonElement76);
        java.util.Date date80 = utcDateTypeAdapter0.fromJsonTree(jsonElement76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonElement39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "null" + "'", str50, "null");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null" + "'", str53, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter54);
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertNotNull(dateTypeAdapter59);
        org.junit.Assert.assertNotNull(jsonElement61);
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertNotNull(jsonElement64);
        org.junit.Assert.assertNotNull(dateTypeAdapter66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "null" + "'", str69, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "null" + "'", str73, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter74);
        org.junit.Assert.assertNotNull(jsonElement76);
        org.junit.Assert.assertNull(date77);
        org.junit.Assert.assertNull(date78);
        org.junit.Assert.assertNull(date79);
        org.junit.Assert.assertNull(date80);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1021");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = dateTypeAdapter5.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter5.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = dateTypeAdapter11.nullSafe();
        java.util.Date date15 = dateTypeAdapter13.fromJson("null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1022");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = utcDateTypeAdapter7.toJsonTree(date11);
        java.util.Date date13 = utcDateTypeAdapter3.fromJsonTree(jsonElement12);
        java.util.Date date14 = dateTypeAdapter1.fromJsonTree(jsonElement12);
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter1.toJson(date15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = dateTypeAdapter1.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1023");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter8.toJsonTree(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter8.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter14.toJsonTree(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter14.nullSafe();
        java.io.Writer writer18 = null;
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter17.toJson(writer18, date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1024");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter6.toJson(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter6.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter6.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter6.toJsonTree(date12);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter18 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter18.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter18.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = utcDateTypeAdapter18.toJsonTree(date22);
        java.util.Date date24 = utcDateTypeAdapter14.fromJsonTree(jsonElement23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = dateTypeAdapter28.toJsonTree(date29);
        java.util.Date date31 = utcDateTypeAdapter14.fromJsonTree(jsonElement30);
        java.util.Date date32 = dateTypeAdapter6.fromJsonTree(jsonElement30);
        java.util.Date date34 = dateTypeAdapter6.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date36 = null;
        java.lang.String str37 = utcDateTypeAdapter35.toJson(date36);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter38.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter38.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter40.nullSafe();
        java.util.Date date42 = null;
        java.lang.String str43 = dateTypeAdapter41.toJson(date42);
        java.util.Date date44 = null;
        java.lang.String str45 = dateTypeAdapter41.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = dateTypeAdapter41.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = dateTypeAdapter41.toJsonTree(date47);
        java.util.Date date49 = dateTypeAdapter6.fromJsonTree(jsonElement48);
        java.util.Date date50 = null;
        java.lang.String str51 = dateTypeAdapter6.toJson(date50);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter52 = dateTypeAdapter6.nullSafe();
        java.lang.Class<?> wildcardClass53 = dateTypeAdapter52.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "null" + "'", str43, "null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1025");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter24.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter30 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date31 = null;
        java.lang.String str32 = utcDateTypeAdapter30.toJson(date31);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = utcDateTypeAdapter30.nullSafe();
        java.util.Date date34 = null;
        com.google.gson.JsonElement jsonElement35 = utcDateTypeAdapter30.toJsonTree(date34);
        java.util.Date date36 = utcDateTypeAdapter26.fromJsonTree(jsonElement35);
        java.util.Date date37 = dateTypeAdapter24.fromJsonTree(jsonElement35);
        java.util.Date date38 = utcDateTypeAdapter0.fromJsonTree(jsonElement35);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        java.util.Date date43 = null;
        com.google.gson.JsonElement jsonElement44 = utcDateTypeAdapter39.toJsonTree(date43);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter45 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date46 = null;
        java.lang.String str47 = utcDateTypeAdapter45.toJson(date46);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter45.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter49 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date50 = null;
        java.lang.String str51 = utcDateTypeAdapter49.toJson(date50);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter52 = utcDateTypeAdapter49.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter53 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date54 = null;
        java.lang.String str55 = utcDateTypeAdapter53.toJson(date54);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = utcDateTypeAdapter53.nullSafe();
        java.util.Date date57 = null;
        com.google.gson.JsonElement jsonElement58 = utcDateTypeAdapter53.toJsonTree(date57);
        java.util.Date date59 = utcDateTypeAdapter49.fromJsonTree(jsonElement58);
        java.util.Date date60 = dateTypeAdapter48.fromJsonTree(jsonElement58);
        java.util.Date date61 = utcDateTypeAdapter39.fromJsonTree(jsonElement58);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = utcDateTypeAdapter39.nullSafe();
        java.util.Date date63 = null;
        java.lang.String str64 = dateTypeAdapter62.toJson(date63);
        java.util.Date date65 = null;
        com.google.gson.JsonElement jsonElement66 = dateTypeAdapter62.toJsonTree(date65);
        java.util.Date date67 = utcDateTypeAdapter0.fromJsonTree(jsonElement66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(jsonElement35);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertNotNull(jsonElement44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "null" + "'", str47, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "null" + "'", str55, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNotNull(jsonElement58);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "null" + "'", str64, "null");
        org.junit.Assert.assertNotNull(jsonElement66);
        org.junit.Assert.assertNull(date67);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1026");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter8.toJsonTree(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter8.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = dateTypeAdapter14.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 1 column 1 path $?See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1027");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter0.toJson(date26);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter28 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date29 = null;
        java.lang.String str30 = utcDateTypeAdapter28.toJson(date29);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = utcDateTypeAdapter28.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date36 = null;
        java.lang.String str37 = utcDateTypeAdapter35.toJson(date36);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = utcDateTypeAdapter43.toJsonTree(date47);
        java.util.Date date49 = utcDateTypeAdapter39.fromJsonTree(jsonElement48);
        java.util.Date date50 = dateTypeAdapter38.fromJsonTree(jsonElement48);
        java.util.Date date51 = dateTypeAdapter31.fromJsonTree(jsonElement48);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter52 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date53 = null;
        java.lang.String str54 = utcDateTypeAdapter52.toJson(date53);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = utcDateTypeAdapter52.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter57.nullSafe();
        java.util.Date date59 = null;
        java.lang.String str60 = dateTypeAdapter58.toJson(date59);
        java.util.Date date61 = null;
        java.lang.String str62 = dateTypeAdapter58.toJson(date61);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter63 = dateTypeAdapter58.nullSafe();
        java.util.Date date64 = null;
        com.google.gson.JsonElement jsonElement65 = dateTypeAdapter58.toJsonTree(date64);
        java.util.Date date66 = dateTypeAdapter31.fromJsonTree(jsonElement65);
        java.util.Date date67 = null;
        com.google.gson.JsonElement jsonElement68 = dateTypeAdapter31.toJsonTree(date67);
        java.util.Date date69 = utcDateTypeAdapter0.fromJsonTree(jsonElement68);
        java.util.Date date70 = null;
        com.google.gson.JsonElement jsonElement71 = utcDateTypeAdapter0.toJsonTree(date70);
        com.google.gson.stream.JsonWriter jsonWriter72 = null;
        java.util.Date date73 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter72, date73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "null" + "'", str54, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "null" + "'", str60, "null");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "null" + "'", str62, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter63);
        org.junit.Assert.assertNotNull(jsonElement65);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNotNull(jsonElement68);
        org.junit.Assert.assertNull(date69);
        org.junit.Assert.assertNotNull(jsonElement71);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1028");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter10.fromJsonTree(jsonElement18);
        java.util.Date date20 = dateTypeAdapter3.fromJsonTree(jsonElement18);
        java.util.Date date22 = dateTypeAdapter3.fromJson("null");
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter3.toJsonTree(date23);
        java.util.Date date25 = null;
        java.lang.String str26 = dateTypeAdapter3.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter3.nullSafe();
        java.util.Date date28 = null;
        java.lang.String str29 = dateTypeAdapter27.toJson(date28);
        java.io.Writer writer30 = null;
        java.util.Date date31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter27.toJson(writer30, date31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null" + "'", str29, "null");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1029");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date14 = null;
        java.lang.String str15 = utcDateTypeAdapter13.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter16.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter16.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter18.nullSafe();
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter18.toJson(date20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter23.nullSafe();
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = dateTypeAdapter23.toJsonTree(date25);
        java.util.Date date27 = dateTypeAdapter18.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter18.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = dateTypeAdapter28.toJsonTree(date29);
        java.util.Date date31 = utcDateTypeAdapter10.fromJsonTree(jsonElement30);
        java.util.Date date32 = utcDateTypeAdapter0.fromJsonTree(jsonElement30);
        java.io.Writer writer33 = null;
        java.util.Date date34 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.toJson(writer33, date34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(jsonElement26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(date32);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1030");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = dateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = dateTypeAdapter6.fromJsonTree(jsonElement14);
        java.lang.Class<?> wildcardClass16 = dateTypeAdapter6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1031");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter9.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter0.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.stream.JsonReader jsonReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = utcDateTypeAdapter0.read(jsonReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1032");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = dateTypeAdapter27.toJsonTree(date29);
        java.io.Writer writer31 = null;
        java.util.Date date32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter27.toJson(writer31, date32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1033");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter9.fromJsonTree(jsonElement17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        java.util.Date date30 = null;
        java.lang.String str31 = dateTypeAdapter28.toJson(date30);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter32 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date33 = null;
        java.lang.String str34 = utcDateTypeAdapter32.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = utcDateTypeAdapter32.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = dateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter35.nullSafe();
        java.util.Date date39 = dateTypeAdapter37.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter37.nullSafe();
        java.util.Date date41 = null;
        java.lang.String str42 = dateTypeAdapter40.toJson(date41);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter46.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = dateTypeAdapter47.nullSafe();
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = dateTypeAdapter48.toJsonTree(date49);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter52 = utcDateTypeAdapter51.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter53 = dateTypeAdapter52.nullSafe();
        java.util.Date date54 = null;
        java.lang.String str55 = dateTypeAdapter53.toJson(date54);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter56 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = utcDateTypeAdapter56.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter57.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter59 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date60 = null;
        java.lang.String str61 = utcDateTypeAdapter59.toJson(date60);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = utcDateTypeAdapter59.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter63 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date64 = null;
        java.lang.String str65 = utcDateTypeAdapter63.toJson(date64);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter66 = utcDateTypeAdapter63.nullSafe();
        java.util.Date date67 = null;
        com.google.gson.JsonElement jsonElement68 = utcDateTypeAdapter63.toJsonTree(date67);
        java.util.Date date69 = utcDateTypeAdapter59.fromJsonTree(jsonElement68);
        java.util.Date date70 = dateTypeAdapter57.fromJsonTree(jsonElement68);
        java.util.Date date71 = dateTypeAdapter53.fromJsonTree(jsonElement68);
        java.util.Date date72 = dateTypeAdapter48.fromJsonTree(jsonElement68);
        java.util.Date date73 = dateTypeAdapter40.fromJsonTree(jsonElement68);
        java.util.Date date74 = dateTypeAdapter28.fromJsonTree(jsonElement68);
        java.util.Date date75 = dateTypeAdapter22.fromJsonTree(jsonElement68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "null" + "'", str42, "null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(jsonElement50);
        org.junit.Assert.assertNotNull(dateTypeAdapter52);
        org.junit.Assert.assertNotNull(dateTypeAdapter53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "null" + "'", str55, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "null" + "'", str61, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "null" + "'", str65, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter66);
        org.junit.Assert.assertNotNull(jsonElement68);
        org.junit.Assert.assertNull(date69);
        org.junit.Assert.assertNull(date70);
        org.junit.Assert.assertNull(date71);
        org.junit.Assert.assertNull(date72);
        org.junit.Assert.assertNull(date73);
        org.junit.Assert.assertNull(date74);
        org.junit.Assert.assertNull(date75);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1034");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter4.toJsonTree(date8);
        java.util.Date date10 = utcDateTypeAdapter0.fromJsonTree(jsonElement9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter0.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = utcDateTypeAdapter0.toJsonTree(date14);
        com.google.gson.stream.JsonReader jsonReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = utcDateTypeAdapter0.read(jsonReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1035");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter0.toJson(date26);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter28 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date29 = null;
        java.lang.String str30 = utcDateTypeAdapter28.toJson(date29);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = utcDateTypeAdapter28.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date36 = null;
        java.lang.String str37 = utcDateTypeAdapter35.toJson(date36);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = utcDateTypeAdapter43.toJsonTree(date47);
        java.util.Date date49 = utcDateTypeAdapter39.fromJsonTree(jsonElement48);
        java.util.Date date50 = dateTypeAdapter38.fromJsonTree(jsonElement48);
        java.util.Date date51 = dateTypeAdapter31.fromJsonTree(jsonElement48);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter52 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date53 = null;
        java.lang.String str54 = utcDateTypeAdapter52.toJson(date53);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = utcDateTypeAdapter52.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter57.nullSafe();
        java.util.Date date59 = null;
        java.lang.String str60 = dateTypeAdapter58.toJson(date59);
        java.util.Date date61 = null;
        java.lang.String str62 = dateTypeAdapter58.toJson(date61);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter63 = dateTypeAdapter58.nullSafe();
        java.util.Date date64 = null;
        com.google.gson.JsonElement jsonElement65 = dateTypeAdapter58.toJsonTree(date64);
        java.util.Date date66 = dateTypeAdapter31.fromJsonTree(jsonElement65);
        java.util.Date date67 = null;
        com.google.gson.JsonElement jsonElement68 = dateTypeAdapter31.toJsonTree(date67);
        java.util.Date date69 = utcDateTypeAdapter0.fromJsonTree(jsonElement68);
        java.util.Date date70 = null;
        com.google.gson.JsonElement jsonElement71 = utcDateTypeAdapter0.toJsonTree(date70);
        java.util.Date date72 = null;
        java.lang.String str73 = utcDateTypeAdapter0.toJson(date72);
        com.google.gson.stream.JsonReader jsonReader74 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date75 = utcDateTypeAdapter0.read(jsonReader74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "null" + "'", str54, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "null" + "'", str60, "null");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "null" + "'", str62, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter63);
        org.junit.Assert.assertNotNull(jsonElement65);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNotNull(jsonElement68);
        org.junit.Assert.assertNull(date69);
        org.junit.Assert.assertNotNull(jsonElement71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "null" + "'", str73, "null");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1036");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter2.toJson(date5);
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = dateTypeAdapter2.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter2.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter2.nullSafe();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1037");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateTypeAdapter5.fromJson(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1038");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter5.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1039");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter9.fromJsonTree(jsonElement17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter22.nullSafe();
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = dateTypeAdapter22.toJsonTree(date25);
        java.util.Date date27 = null;
        java.lang.String str28 = dateTypeAdapter22.toJson(date27);
        java.util.Date date29 = null;
        java.lang.String str30 = dateTypeAdapter22.toJson(date29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(jsonElement26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1040");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateTypeAdapter8.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 1 column 1 path $?See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1041");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter0.toJson(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter12.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter12.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter12.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter25 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter25.toJson(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter25.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter29 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date30 = null;
        java.lang.String str31 = utcDateTypeAdapter29.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter29.nullSafe();
        java.util.Date date33 = null;
        com.google.gson.JsonElement jsonElement34 = utcDateTypeAdapter29.toJsonTree(date33);
        java.util.Date date35 = utcDateTypeAdapter25.fromJsonTree(jsonElement34);
        java.util.Date date36 = utcDateTypeAdapter23.fromJsonTree(jsonElement34);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter37 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter37.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter38.nullSafe();
        java.util.Date date40 = null;
        com.google.gson.JsonElement jsonElement41 = dateTypeAdapter39.toJsonTree(date40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter39.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter23.fromJsonTree(jsonElement43);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter45 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date46 = null;
        java.lang.String str47 = utcDateTypeAdapter45.toJson(date46);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter45.nullSafe();
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = utcDateTypeAdapter45.toJsonTree(date49);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date52 = null;
        java.lang.String str53 = utcDateTypeAdapter51.toJson(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = utcDateTypeAdapter51.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter55 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date56 = null;
        java.lang.String str57 = utcDateTypeAdapter55.toJson(date56);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = utcDateTypeAdapter55.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter59 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date60 = null;
        java.lang.String str61 = utcDateTypeAdapter59.toJson(date60);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = utcDateTypeAdapter59.nullSafe();
        java.util.Date date63 = null;
        com.google.gson.JsonElement jsonElement64 = utcDateTypeAdapter59.toJsonTree(date63);
        java.util.Date date65 = utcDateTypeAdapter55.fromJsonTree(jsonElement64);
        java.util.Date date66 = dateTypeAdapter54.fromJsonTree(jsonElement64);
        java.util.Date date67 = utcDateTypeAdapter45.fromJsonTree(jsonElement64);
        java.util.Date date68 = utcDateTypeAdapter23.fromJsonTree(jsonElement64);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter69 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date70 = null;
        java.lang.String str71 = utcDateTypeAdapter69.toJson(date70);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter72 = utcDateTypeAdapter69.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter73 = dateTypeAdapter72.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter74 = dateTypeAdapter72.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter75 = dateTypeAdapter74.nullSafe();
        java.util.Date date76 = null;
        com.google.gson.JsonElement jsonElement77 = dateTypeAdapter74.toJsonTree(date76);
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = dateTypeAdapter74.toJsonTree(date78);
        java.util.Date date80 = utcDateTypeAdapter23.fromJsonTree(jsonElement79);
        java.util.Date date81 = dateTypeAdapter22.fromJsonTree(jsonElement79);
        java.util.Date date82 = null;
        com.google.gson.JsonElement jsonElement83 = dateTypeAdapter22.toJsonTree(date82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(jsonElement34);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(jsonElement41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "null" + "'", str47, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(jsonElement50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null" + "'", str53, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "null" + "'", str57, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "null" + "'", str61, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertNotNull(jsonElement64);
        org.junit.Assert.assertNull(date65);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNull(date67);
        org.junit.Assert.assertNull(date68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "null" + "'", str71, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter72);
        org.junit.Assert.assertNotNull(dateTypeAdapter73);
        org.junit.Assert.assertNotNull(dateTypeAdapter74);
        org.junit.Assert.assertNotNull(dateTypeAdapter75);
        org.junit.Assert.assertNotNull(jsonElement77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNull(date81);
        org.junit.Assert.assertNotNull(jsonElement83);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1042");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter0.toJson(date26);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter28 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date29 = null;
        java.lang.String str30 = utcDateTypeAdapter28.toJson(date29);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = utcDateTypeAdapter28.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date36 = null;
        java.lang.String str37 = utcDateTypeAdapter35.toJson(date36);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = utcDateTypeAdapter43.toJsonTree(date47);
        java.util.Date date49 = utcDateTypeAdapter39.fromJsonTree(jsonElement48);
        java.util.Date date50 = dateTypeAdapter38.fromJsonTree(jsonElement48);
        java.util.Date date51 = dateTypeAdapter31.fromJsonTree(jsonElement48);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter52 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date53 = null;
        java.lang.String str54 = utcDateTypeAdapter52.toJson(date53);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = utcDateTypeAdapter52.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = dateTypeAdapter55.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter57.nullSafe();
        java.util.Date date59 = null;
        java.lang.String str60 = dateTypeAdapter58.toJson(date59);
        java.util.Date date61 = null;
        java.lang.String str62 = dateTypeAdapter58.toJson(date61);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter63 = dateTypeAdapter58.nullSafe();
        java.util.Date date64 = null;
        com.google.gson.JsonElement jsonElement65 = dateTypeAdapter58.toJsonTree(date64);
        java.util.Date date66 = dateTypeAdapter31.fromJsonTree(jsonElement65);
        java.util.Date date67 = null;
        com.google.gson.JsonElement jsonElement68 = dateTypeAdapter31.toJsonTree(date67);
        java.util.Date date69 = utcDateTypeAdapter0.fromJsonTree(jsonElement68);
        java.util.Date date70 = null;
        java.lang.String str71 = utcDateTypeAdapter0.toJson(date70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "null" + "'", str54, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "null" + "'", str60, "null");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "null" + "'", str62, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter63);
        org.junit.Assert.assertNotNull(jsonElement65);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNotNull(jsonElement68);
        org.junit.Assert.assertNull(date69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "null" + "'", str71, "null");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1043");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = dateTypeAdapter1.toJsonTree(date3);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = dateTypeAdapter6.toJsonTree(date8);
        java.util.Date date10 = dateTypeAdapter1.fromJsonTree(jsonElement9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter1.nullSafe();
        java.util.Date date12 = null;
        java.lang.String str13 = dateTypeAdapter11.toJson(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = dateTypeAdapter11.toJsonTree(date14);
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter11.toJson(date16);
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1044");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1045");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.lang.Class<?> wildcardClass6 = dateTypeAdapter4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1046");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter0.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter10.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 1 column 1 path $?See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1047");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = dateTypeAdapter6.toJsonTree(date7);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date10 = null;
        java.lang.String str11 = utcDateTypeAdapter9.toJson(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date14 = null;
        java.lang.String str15 = utcDateTypeAdapter13.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter13.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = utcDateTypeAdapter13.toJsonTree(date17);
        java.util.Date date19 = utcDateTypeAdapter9.fromJsonTree(jsonElement18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter21 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter21.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter22.nullSafe();
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter23.toJsonTree(date24);
        java.util.Date date26 = utcDateTypeAdapter9.fromJsonTree(jsonElement25);
        java.util.Date date27 = dateTypeAdapter6.fromJsonTree(jsonElement25);
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = dateTypeAdapter6.toJsonTree(date28);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter6.nullSafe();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = dateTypeAdapter6.toJsonTree(date31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(jsonElement29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(jsonElement32);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1048");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter14.nullSafe();
        java.util.Date date18 = dateTypeAdapter16.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter16.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement21);
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter0.toJson(date23);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter25 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter25.toJson(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter28.nullSafe();
        java.util.Date date32 = dateTypeAdapter30.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter30.nullSafe();
        java.util.Date date35 = dateTypeAdapter30.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter36.toJson(date37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter36.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter39.nullSafe();
        java.util.Date date41 = null;
        java.lang.String str42 = dateTypeAdapter39.toJson(date41);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter47 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date48 = null;
        java.lang.String str49 = utcDateTypeAdapter47.toJson(date48);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = utcDateTypeAdapter47.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date52 = null;
        java.lang.String str53 = utcDateTypeAdapter51.toJson(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = utcDateTypeAdapter51.nullSafe();
        java.util.Date date55 = null;
        com.google.gson.JsonElement jsonElement56 = utcDateTypeAdapter51.toJsonTree(date55);
        java.util.Date date57 = utcDateTypeAdapter47.fromJsonTree(jsonElement56);
        java.util.Date date58 = dateTypeAdapter46.fromJsonTree(jsonElement56);
        java.util.Date date59 = dateTypeAdapter39.fromJsonTree(jsonElement56);
        java.util.Date date60 = dateTypeAdapter30.fromJsonTree(jsonElement56);
        java.util.Date date61 = utcDateTypeAdapter0.fromJsonTree(jsonElement56);
        java.util.Date date62 = null;
        com.google.gson.JsonElement jsonElement63 = utcDateTypeAdapter0.toJsonTree(date62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "null" + "'", str42, "null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "null" + "'", str49, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null" + "'", str53, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter54);
        org.junit.Assert.assertNotNull(jsonElement56);
        org.junit.Assert.assertNull(date57);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertNotNull(jsonElement63);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1049");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter8.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter8.toJson(date13);
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter8.toJson(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter8.toJsonTree(date17);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter19.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter27.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter30 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date31 = null;
        java.lang.String str32 = utcDateTypeAdapter30.toJson(date31);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = utcDateTypeAdapter30.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = dateTypeAdapter33.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter34.nullSafe();
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = dateTypeAdapter35.toJsonTree(date36);
        java.util.Date date38 = dateTypeAdapter29.fromJsonTree(jsonElement37);
        java.util.Date date39 = dateTypeAdapter22.fromJsonTree(jsonElement37);
        java.util.Date date41 = dateTypeAdapter22.fromJson("null");
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter22.toJsonTree(date42);
        java.util.Date date44 = null;
        java.lang.String str45 = dateTypeAdapter22.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = dateTypeAdapter22.nullSafe();
        java.util.Date date47 = null;
        com.google.gson.JsonElement jsonElement48 = dateTypeAdapter22.toJsonTree(date47);
        java.util.Date date49 = dateTypeAdapter8.fromJsonTree(jsonElement48);
        java.util.Date date50 = null;
        com.google.gson.JsonElement jsonElement51 = dateTypeAdapter8.toJsonTree(date50);
        java.util.Date date53 = dateTypeAdapter8.fromJson("null");
        java.util.Date date54 = null;
        com.google.gson.JsonElement jsonElement55 = dateTypeAdapter8.toJsonTree(date54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNotNull(jsonElement51);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertNotNull(jsonElement55);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1050");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date14 = null;
        java.lang.String str15 = utcDateTypeAdapter13.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter16.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter16.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter18.nullSafe();
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter18.toJson(date20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter23.nullSafe();
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = dateTypeAdapter23.toJsonTree(date25);
        java.util.Date date27 = dateTypeAdapter18.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter18.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = dateTypeAdapter28.toJsonTree(date29);
        java.util.Date date31 = utcDateTypeAdapter10.fromJsonTree(jsonElement30);
        java.util.Date date32 = utcDateTypeAdapter0.fromJsonTree(jsonElement30);
        com.google.gson.stream.JsonReader jsonReader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = utcDateTypeAdapter0.read(jsonReader33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(jsonElement26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(date32);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1051");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date10 = dateTypeAdapter5.fromJson("null");
        java.util.Date date11 = null;
        java.lang.String str12 = dateTypeAdapter5.toJson(date11);
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter5.toJson(date13);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = dateTypeAdapter5.fromJson(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1052");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter9.toJson(date10);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter12.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter18 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter18.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter18.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = utcDateTypeAdapter18.toJsonTree(date22);
        java.util.Date date24 = utcDateTypeAdapter14.fromJsonTree(jsonElement23);
        java.util.Date date25 = utcDateTypeAdapter12.fromJsonTree(jsonElement23);
        java.util.Date date26 = dateTypeAdapter9.fromJsonTree(jsonElement23);
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = dateTypeAdapter9.toJsonTree(date27);
        java.util.Date date29 = null;
        java.lang.String str30 = dateTypeAdapter9.toJson(date29);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter31 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date32 = null;
        java.lang.String str33 = utcDateTypeAdapter31.toJson(date32);
        java.util.Date date35 = utcDateTypeAdapter31.fromJson("null");
        java.util.Date date36 = null;
        java.lang.String str37 = utcDateTypeAdapter31.toJson(date36);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter31.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter38.nullSafe();
        java.util.Date date40 = null;
        java.lang.String str41 = dateTypeAdapter39.toJson(date40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter39.toJsonTree(date42);
        java.util.Date date44 = dateTypeAdapter9.fromJsonTree(jsonElement43);
        java.util.Date date45 = dateTypeAdapter6.fromJsonTree(jsonElement43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null" + "'", str33, "null");
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNull(date45);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1053");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter8.toJsonTree(date12);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter17.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter17.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter19.nullSafe();
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter19.toJson(date21);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter24.nullSafe();
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = dateTypeAdapter24.toJsonTree(date26);
        java.util.Date date28 = dateTypeAdapter19.fromJsonTree(jsonElement27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter19.nullSafe();
        java.util.Date date30 = null;
        java.lang.String str31 = dateTypeAdapter29.toJson(date30);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter32 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date33 = null;
        java.lang.String str34 = utcDateTypeAdapter32.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = utcDateTypeAdapter32.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter36.toJson(date37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter36.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter40.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = dateTypeAdapter40.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter46.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = dateTypeAdapter47.nullSafe();
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = dateTypeAdapter48.toJsonTree(date49);
        java.util.Date date51 = dateTypeAdapter42.fromJsonTree(jsonElement50);
        java.util.Date date52 = dateTypeAdapter35.fromJsonTree(jsonElement50);
        java.util.Date date53 = dateTypeAdapter29.fromJsonTree(jsonElement50);
        java.util.Date date54 = null;
        com.google.gson.JsonElement jsonElement55 = dateTypeAdapter29.toJsonTree(date54);
        java.util.Date date56 = dateTypeAdapter8.fromJsonTree(jsonElement55);
        java.util.Date date57 = null;
        java.lang.String str58 = dateTypeAdapter8.toJson(date57);
        java.util.Date date60 = dateTypeAdapter8.fromJson("null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(jsonElement50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertNotNull(jsonElement55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "null" + "'", str58, "null");
        org.junit.Assert.assertNull(date60);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1054");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter0.toJson(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter12.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter12.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter12.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = dateTypeAdapter21.nullSafe();
        java.lang.Class<?> wildcardClass23 = dateTypeAdapter22.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1055");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = utcDateTypeAdapter7.fromJsonTree(jsonElement16);
        java.util.Date date18 = utcDateTypeAdapter5.fromJsonTree(jsonElement16);
        java.util.Date date19 = dateTypeAdapter2.fromJsonTree(jsonElement16);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter2.toJsonTree(date20);
        java.util.Date date22 = null;
        java.lang.String str23 = dateTypeAdapter2.toJson(date22);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        java.util.Date date28 = utcDateTypeAdapter24.fromJson("null");
        java.util.Date date29 = null;
        java.lang.String str30 = utcDateTypeAdapter24.toJson(date29);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = utcDateTypeAdapter24.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter32.toJson(date33);
        java.util.Date date35 = null;
        com.google.gson.JsonElement jsonElement36 = dateTypeAdapter32.toJsonTree(date35);
        java.util.Date date37 = dateTypeAdapter2.fromJsonTree(jsonElement36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = date37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(jsonElement36);
        org.junit.Assert.assertNull(date37);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1056");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter0.toJson(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date10 = null;
        java.lang.String str11 = utcDateTypeAdapter9.toJson(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date14 = null;
        java.lang.String str15 = utcDateTypeAdapter13.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter13.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = utcDateTypeAdapter13.toJsonTree(date17);
        java.util.Date date19 = utcDateTypeAdapter9.fromJsonTree(jsonElement18);
        java.util.Date date20 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter7.toJsonTree(date21);
        java.util.Date date23 = utcDateTypeAdapter0.fromJsonTree(jsonElement22);
        java.io.Writer writer24 = null;
        java.util.Date date25 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.toJson(writer24, date25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1057");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter4.toJsonTree(date8);
        java.util.Date date10 = utcDateTypeAdapter0.fromJsonTree(jsonElement9);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = null;
        java.lang.String str20 = dateTypeAdapter16.toJson(date19);
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter16.toJson(date21);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        java.util.Date date30 = null;
        java.lang.String str31 = dateTypeAdapter28.toJson(date30);
        java.util.Date date32 = null;
        com.google.gson.JsonElement jsonElement33 = dateTypeAdapter28.toJsonTree(date32);
        java.util.Date date34 = dateTypeAdapter16.fromJsonTree(jsonElement33);
        java.util.Date date35 = null;
        com.google.gson.JsonElement jsonElement36 = dateTypeAdapter16.toJsonTree(date35);
        java.util.Date date37 = utcDateTypeAdapter0.fromJsonTree(jsonElement36);
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = utcDateTypeAdapter0.toJsonTree(date38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(jsonElement33);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertNotNull(jsonElement36);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNotNull(jsonElement39);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1058");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter8.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter4.fromJsonTree(jsonElement13);
        java.util.Date date15 = dateTypeAdapter3.fromJsonTree(jsonElement13);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter3.toJsonTree(date16);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter3.toJsonTree(date18);
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter3.toJson(date20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter25.nullSafe();
        java.util.Date date27 = null;
        java.lang.String str28 = dateTypeAdapter25.toJson(date27);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter29 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date30 = null;
        java.lang.String str31 = utcDateTypeAdapter29.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter29.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter33 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date34 = null;
        java.lang.String str35 = utcDateTypeAdapter33.toJson(date34);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter33.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter37 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date38 = null;
        java.lang.String str39 = utcDateTypeAdapter37.toJson(date38);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = utcDateTypeAdapter37.nullSafe();
        java.util.Date date41 = null;
        com.google.gson.JsonElement jsonElement42 = utcDateTypeAdapter37.toJsonTree(date41);
        java.util.Date date43 = utcDateTypeAdapter33.fromJsonTree(jsonElement42);
        java.util.Date date44 = dateTypeAdapter32.fromJsonTree(jsonElement42);
        java.util.Date date45 = dateTypeAdapter25.fromJsonTree(jsonElement42);
        java.util.Date date46 = null;
        com.google.gson.JsonElement jsonElement47 = dateTypeAdapter25.toJsonTree(date46);
        java.util.Date date48 = dateTypeAdapter3.fromJsonTree(jsonElement47);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = dateTypeAdapter3.nullSafe();
        java.io.Reader reader51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date52 = dateTypeAdapter50.fromJson(reader51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(jsonElement42);
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(jsonElement47);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1059");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter5.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter5.toJson(date10);
        java.util.Date date12 = null;
        java.lang.String str13 = dateTypeAdapter5.toJson(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = dateTypeAdapter5.toJsonTree(date14);
        java.io.Writer writer16 = null;
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter5.toJson(writer16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1060");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter1.toJson(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = dateTypeAdapter1.toJsonTree(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter1.toJson(date7);
        java.lang.Class<?> wildcardClass9 = dateTypeAdapter1.getClass();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1061");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter0.toJson(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter0.toJson(date24);
        com.google.gson.stream.JsonReader jsonReader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = utcDateTypeAdapter0.read(jsonReader26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1062");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = dateTypeAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter5.nullSafe();
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter15.toJson(date16);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter18 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter18.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter18.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        java.util.Date date30 = null;
        com.google.gson.JsonElement jsonElement31 = utcDateTypeAdapter26.toJsonTree(date30);
        java.util.Date date32 = utcDateTypeAdapter22.fromJsonTree(jsonElement31);
        java.util.Date date33 = dateTypeAdapter21.fromJsonTree(jsonElement31);
        java.util.Date date34 = dateTypeAdapter15.fromJsonTree(jsonElement31);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter37 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date38 = null;
        java.lang.String str39 = utcDateTypeAdapter37.toJson(date38);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = utcDateTypeAdapter37.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter41 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date42 = null;
        java.lang.String str43 = utcDateTypeAdapter41.toJson(date42);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter44 = utcDateTypeAdapter41.nullSafe();
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter41.toJsonTree(date45);
        java.util.Date date47 = utcDateTypeAdapter37.fromJsonTree(jsonElement46);
        java.util.Date date48 = utcDateTypeAdapter35.fromJsonTree(jsonElement46);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter49 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = utcDateTypeAdapter49.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter51 = dateTypeAdapter50.nullSafe();
        java.util.Date date52 = null;
        com.google.gson.JsonElement jsonElement53 = dateTypeAdapter51.toJsonTree(date52);
        java.util.Date date54 = null;
        com.google.gson.JsonElement jsonElement55 = dateTypeAdapter51.toJsonTree(date54);
        java.util.Date date56 = utcDateTypeAdapter35.fromJsonTree(jsonElement55);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter57 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = utcDateTypeAdapter57.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter59 = dateTypeAdapter58.nullSafe();
        java.util.Date date60 = null;
        java.lang.String str61 = dateTypeAdapter59.toJson(date60);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter62 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter63 = utcDateTypeAdapter62.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter64 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date65 = null;
        java.lang.String str66 = utcDateTypeAdapter64.toJson(date65);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter67 = utcDateTypeAdapter64.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter68 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date69 = null;
        java.lang.String str70 = utcDateTypeAdapter68.toJson(date69);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter71 = utcDateTypeAdapter68.nullSafe();
        java.util.Date date72 = null;
        com.google.gson.JsonElement jsonElement73 = utcDateTypeAdapter68.toJsonTree(date72);
        java.util.Date date74 = utcDateTypeAdapter64.fromJsonTree(jsonElement73);
        java.util.Date date75 = utcDateTypeAdapter62.fromJsonTree(jsonElement73);
        java.util.Date date76 = dateTypeAdapter59.fromJsonTree(jsonElement73);
        java.util.Date date77 = utcDateTypeAdapter35.fromJsonTree(jsonElement73);
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = utcDateTypeAdapter35.toJsonTree(date78);
        java.util.Date date80 = dateTypeAdapter15.fromJsonTree(jsonElement79);
        java.util.Date date81 = null;
        com.google.gson.JsonElement jsonElement82 = dateTypeAdapter15.toJsonTree(date81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(jsonElement31);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "null" + "'", str43, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
        org.junit.Assert.assertNotNull(dateTypeAdapter51);
        org.junit.Assert.assertNotNull(jsonElement53);
        org.junit.Assert.assertNotNull(jsonElement55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertNotNull(dateTypeAdapter59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "null" + "'", str61, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "null" + "'", str66, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "null" + "'", str70, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter71);
        org.junit.Assert.assertNotNull(jsonElement73);
        org.junit.Assert.assertNull(date74);
        org.junit.Assert.assertNull(date75);
        org.junit.Assert.assertNull(date76);
        org.junit.Assert.assertNull(date77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNotNull(jsonElement82);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1063");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = utcDateTypeAdapter0.toJsonTree(date23);
        com.google.gson.stream.JsonReader jsonReader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = utcDateTypeAdapter0.read(jsonReader25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement24);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1064");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date10 = dateTypeAdapter5.fromJson("null");
        java.util.Date date11 = null;
        java.lang.String str12 = dateTypeAdapter5.toJson(date11);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = dateTypeAdapter5.toJsonTree(date13);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter15 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter15.toJson(date16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter15.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter18.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter18.nullSafe();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter18.toJsonTree(date21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter18.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter24.nullSafe();
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = utcDateTypeAdapter24.toJsonTree(date28);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter30 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date31 = null;
        java.lang.String str32 = utcDateTypeAdapter30.toJson(date31);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = utcDateTypeAdapter30.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter34 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date35 = null;
        java.lang.String str36 = utcDateTypeAdapter34.toJson(date35);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = utcDateTypeAdapter34.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter38 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date39 = null;
        java.lang.String str40 = utcDateTypeAdapter38.toJson(date39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = utcDateTypeAdapter38.nullSafe();
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = utcDateTypeAdapter38.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter34.fromJsonTree(jsonElement43);
        java.util.Date date45 = dateTypeAdapter33.fromJsonTree(jsonElement43);
        java.util.Date date46 = utcDateTypeAdapter24.fromJsonTree(jsonElement43);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter47 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter47.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter48.nullSafe();
        java.util.Date date50 = null;
        java.lang.String str51 = dateTypeAdapter49.toJson(date50);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter52 = dateTypeAdapter49.nullSafe();
        java.util.Date date53 = null;
        com.google.gson.JsonElement jsonElement54 = dateTypeAdapter52.toJsonTree(date53);
        java.util.Date date55 = utcDateTypeAdapter24.fromJsonTree(jsonElement54);
        java.util.Date date56 = dateTypeAdapter23.fromJsonTree(jsonElement54);
        java.util.Date date57 = dateTypeAdapter5.fromJsonTree(jsonElement54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(jsonElement29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null" + "'", str36, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "null" + "'", str40, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNull(date46);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter52);
        org.junit.Assert.assertNotNull(jsonElement54);
        org.junit.Assert.assertNull(date55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertNull(date57);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1065");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = utcDateTypeAdapter0.nullSafe();
        java.lang.Class<?> wildcardClass3 = utcDateTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1066");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter9.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter0.fromJsonTree(jsonElement13);
        com.google.gson.stream.JsonWriter jsonWriter15 = null;
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1067");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter8.toJson(date9);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = dateTypeAdapter12.nullSafe();
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter13.toJson(date14);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter16 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter16.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter17.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter19.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = utcDateTypeAdapter23.toJsonTree(date27);
        java.util.Date date29 = utcDateTypeAdapter19.fromJsonTree(jsonElement28);
        java.util.Date date30 = dateTypeAdapter17.fromJsonTree(jsonElement28);
        java.util.Date date31 = dateTypeAdapter13.fromJsonTree(jsonElement28);
        java.util.Date date32 = null;
        com.google.gson.JsonElement jsonElement33 = dateTypeAdapter13.toJsonTree(date32);
        java.util.Date date34 = dateTypeAdapter8.fromJsonTree(jsonElement33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date36 = null;
        java.lang.String str37 = utcDateTypeAdapter35.toJson(date36);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter38 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date39 = null;
        java.lang.String str40 = utcDateTypeAdapter38.toJson(date39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = utcDateTypeAdapter38.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = dateTypeAdapter41.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter43 = dateTypeAdapter42.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter44 = dateTypeAdapter42.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter45 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date46 = null;
        java.lang.String str47 = utcDateTypeAdapter45.toJson(date46);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter45.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter48.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = dateTypeAdapter49.nullSafe();
        java.util.Date date51 = null;
        com.google.gson.JsonElement jsonElement52 = dateTypeAdapter50.toJsonTree(date51);
        java.util.Date date53 = dateTypeAdapter44.fromJsonTree(jsonElement52);
        java.util.Date date54 = utcDateTypeAdapter35.fromJsonTree(jsonElement52);
        java.util.Date date55 = null;
        com.google.gson.JsonElement jsonElement56 = utcDateTypeAdapter35.toJsonTree(date55);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter57.nullSafe();
        java.util.Date date59 = null;
        com.google.gson.JsonElement jsonElement60 = dateTypeAdapter58.toJsonTree(date59);
        java.util.Date date61 = dateTypeAdapter8.fromJsonTree(jsonElement60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNotNull(jsonElement33);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "null" + "'", str40, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertNotNull(dateTypeAdapter43);
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "null" + "'", str47, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
        org.junit.Assert.assertNotNull(jsonElement52);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertNull(date54);
        org.junit.Assert.assertNotNull(jsonElement56);
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertNotNull(jsonElement60);
        org.junit.Assert.assertNull(date61);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1068");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter1.toJson(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = dateTypeAdapter1.toJsonTree(date5);
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter1.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1069");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter3.toJson(date5);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter15 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter15.toJson(date16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter15.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = utcDateTypeAdapter15.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter11.fromJsonTree(jsonElement20);
        java.util.Date date22 = dateTypeAdapter10.fromJsonTree(jsonElement20);
        java.util.Date date23 = dateTypeAdapter3.fromJsonTree(jsonElement20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = dateTypeAdapter3.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1070");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter6.toJson(date7);
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter6.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1071");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = dateTypeAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter5.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1072");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter4.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter6.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = dateTypeAdapter6.toJsonTree(date10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1073");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter0.toJson(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date10 = null;
        java.lang.String str11 = utcDateTypeAdapter9.toJson(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date14 = null;
        java.lang.String str15 = utcDateTypeAdapter13.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter13.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = utcDateTypeAdapter13.toJsonTree(date17);
        java.util.Date date19 = utcDateTypeAdapter9.fromJsonTree(jsonElement18);
        java.util.Date date20 = dateTypeAdapter7.fromJsonTree(jsonElement18);
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter7.toJsonTree(date21);
        java.util.Date date23 = utcDateTypeAdapter0.fromJsonTree(jsonElement22);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter24.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        java.util.Date date30 = null;
        com.google.gson.JsonElement jsonElement31 = dateTypeAdapter29.toJsonTree(date30);
        java.util.Date date32 = null;
        java.lang.String str33 = dateTypeAdapter29.toJson(date32);
        java.util.Date date34 = null;
        java.lang.String str35 = dateTypeAdapter29.toJson(date34);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter36.toJson(date37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter36.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = dateTypeAdapter41.nullSafe();
        java.util.Date date43 = null;
        java.lang.String str44 = dateTypeAdapter41.toJson(date43);
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = dateTypeAdapter41.toJsonTree(date45);
        java.util.Date date47 = dateTypeAdapter29.fromJsonTree(jsonElement46);
        java.util.Date date48 = utcDateTypeAdapter0.fromJsonTree(jsonElement46);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = utcDateTypeAdapter0.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(jsonElement31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null" + "'", str33, "null");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "null" + "'", str44, "null");
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1074");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date4 = dateTypeAdapter1.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter1.nullSafe();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = dateTypeAdapter1.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1075");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter2 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date3 = null;
        java.lang.String str4 = utcDateTypeAdapter2.toJson(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = utcDateTypeAdapter2.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter6.toJsonTree(date10);
        java.util.Date date12 = utcDateTypeAdapter2.fromJsonTree(jsonElement11);
        java.util.Date date13 = utcDateTypeAdapter0.fromJsonTree(jsonElement11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter16.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter0.fromJsonTree(jsonElement20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = utcDateTypeAdapter22.toJsonTree(date26);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter28 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date29 = null;
        java.lang.String str30 = utcDateTypeAdapter28.toJson(date29);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = utcDateTypeAdapter28.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter32 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date33 = null;
        java.lang.String str34 = utcDateTypeAdapter32.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = utcDateTypeAdapter32.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter36.toJson(date37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter36.nullSafe();
        java.util.Date date40 = null;
        com.google.gson.JsonElement jsonElement41 = utcDateTypeAdapter36.toJsonTree(date40);
        java.util.Date date42 = utcDateTypeAdapter32.fromJsonTree(jsonElement41);
        java.util.Date date43 = dateTypeAdapter31.fromJsonTree(jsonElement41);
        java.util.Date date44 = utcDateTypeAdapter22.fromJsonTree(jsonElement41);
        java.util.Date date45 = utcDateTypeAdapter0.fromJsonTree(jsonElement41);
        java.util.Date date46 = null;
        com.google.gson.JsonElement jsonElement47 = utcDateTypeAdapter0.toJsonTree(date46);
        java.util.Date date48 = null;
        java.lang.String str49 = utcDateTypeAdapter0.toJson(date48);
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(jsonElement41);
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(jsonElement47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "null" + "'", str49, "null");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1076");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter0.toJson(date26);
        java.util.Date date28 = null;
        java.lang.String str29 = utcDateTypeAdapter0.toJson(date28);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter31 = null;
        java.util.Date date32 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter31, date32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null" + "'", str29, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1077");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = utcDateTypeAdapter0.nullSafe();
        java.io.Writer writer3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.toJson(writer3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1078");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter2.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter2.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1079");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter0.toJson(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.stream.JsonReader jsonReader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = utcDateTypeAdapter0.read(jsonReader23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1080");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter9.fromJsonTree(jsonElement17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date23 = null;
        java.lang.String str24 = dateTypeAdapter22.toJson(date23);
        java.util.Date date25 = null;
        java.lang.String str26 = dateTypeAdapter22.toJson(date25);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter27 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter30 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date31 = null;
        java.lang.String str32 = utcDateTypeAdapter30.toJson(date31);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = utcDateTypeAdapter30.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = dateTypeAdapter33.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter33.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = dateTypeAdapter35.nullSafe();
        java.util.Date date37 = null;
        java.lang.String str38 = dateTypeAdapter35.toJson(date37);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter43 = dateTypeAdapter42.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter44 = dateTypeAdapter42.nullSafe();
        java.util.Date date46 = dateTypeAdapter44.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter44.nullSafe();
        java.util.Date date48 = null;
        java.lang.String str49 = dateTypeAdapter47.toJson(date48);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter50 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date51 = null;
        java.lang.String str52 = utcDateTypeAdapter50.toJson(date51);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter53 = utcDateTypeAdapter50.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = dateTypeAdapter53.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = dateTypeAdapter54.nullSafe();
        java.util.Date date56 = null;
        com.google.gson.JsonElement jsonElement57 = dateTypeAdapter55.toJsonTree(date56);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter58 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter59 = utcDateTypeAdapter58.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter60 = dateTypeAdapter59.nullSafe();
        java.util.Date date61 = null;
        java.lang.String str62 = dateTypeAdapter60.toJson(date61);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter63 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter64 = utcDateTypeAdapter63.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter65 = dateTypeAdapter64.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter66 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date67 = null;
        java.lang.String str68 = utcDateTypeAdapter66.toJson(date67);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter69 = utcDateTypeAdapter66.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter70 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date71 = null;
        java.lang.String str72 = utcDateTypeAdapter70.toJson(date71);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter73 = utcDateTypeAdapter70.nullSafe();
        java.util.Date date74 = null;
        com.google.gson.JsonElement jsonElement75 = utcDateTypeAdapter70.toJsonTree(date74);
        java.util.Date date76 = utcDateTypeAdapter66.fromJsonTree(jsonElement75);
        java.util.Date date77 = dateTypeAdapter64.fromJsonTree(jsonElement75);
        java.util.Date date78 = dateTypeAdapter60.fromJsonTree(jsonElement75);
        java.util.Date date79 = dateTypeAdapter55.fromJsonTree(jsonElement75);
        java.util.Date date80 = dateTypeAdapter47.fromJsonTree(jsonElement75);
        java.util.Date date81 = dateTypeAdapter35.fromJsonTree(jsonElement75);
        java.util.Date date82 = dateTypeAdapter29.fromJsonTree(jsonElement75);
        java.util.Date date83 = dateTypeAdapter22.fromJsonTree(jsonElement75);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter84 = dateTypeAdapter22.nullSafe();
        java.lang.Class<?> wildcardClass85 = dateTypeAdapter22.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertNotNull(dateTypeAdapter43);
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertNull(date46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "null" + "'", str49, "null");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "null" + "'", str52, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter53);
        org.junit.Assert.assertNotNull(dateTypeAdapter54);
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(jsonElement57);
        org.junit.Assert.assertNotNull(dateTypeAdapter59);
        org.junit.Assert.assertNotNull(dateTypeAdapter60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "null" + "'", str62, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter64);
        org.junit.Assert.assertNotNull(dateTypeAdapter65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "null" + "'", str68, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "null" + "'", str72, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter73);
        org.junit.Assert.assertNotNull(jsonElement75);
        org.junit.Assert.assertNull(date76);
        org.junit.Assert.assertNull(date77);
        org.junit.Assert.assertNull(date78);
        org.junit.Assert.assertNull(date79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNull(date81);
        org.junit.Assert.assertNull(date82);
        org.junit.Assert.assertNull(date83);
        org.junit.Assert.assertNotNull(dateTypeAdapter84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1081");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter8.toJsonTree(date12);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter16 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date17 = null;
        java.lang.String str18 = utcDateTypeAdapter16.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = utcDateTypeAdapter16.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter20 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date21 = null;
        java.lang.String str22 = utcDateTypeAdapter20.toJson(date21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter20.nullSafe();
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = utcDateTypeAdapter20.toJsonTree(date24);
        java.util.Date date26 = utcDateTypeAdapter16.fromJsonTree(jsonElement25);
        java.util.Date date27 = utcDateTypeAdapter14.fromJsonTree(jsonElement25);
        java.util.Date date28 = dateTypeAdapter8.fromJsonTree(jsonElement25);
        java.io.Writer writer29 = null;
        java.util.Date date30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer29, date30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNull(date28);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1082");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter9.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter0.fromJsonTree(jsonElement13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter0.toJsonTree(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter0.toJson(date19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1083");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter3.toJson(date5);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter15 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter15.toJson(date16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter15.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = utcDateTypeAdapter15.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter11.fromJsonTree(jsonElement20);
        java.util.Date date22 = dateTypeAdapter10.fromJsonTree(jsonElement20);
        java.util.Date date23 = dateTypeAdapter3.fromJsonTree(jsonElement20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter24.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        java.util.Date date31 = null;
        java.lang.String str32 = dateTypeAdapter30.toJson(date31);
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter30.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter30.nullSafe();
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = dateTypeAdapter30.toJsonTree(date36);
        java.util.Date date38 = dateTypeAdapter3.fromJsonTree(jsonElement37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter39.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date42 = dateTypeAdapter40.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1084");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.stream.JsonReader jsonReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = utcDateTypeAdapter0.read(jsonReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1085");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date12 = dateTypeAdapter10.fromJson("null");
        java.lang.Class<?> wildcardClass13 = dateTypeAdapter10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1086");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter36.nullSafe();
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter36.toJsonTree(date38);
        java.util.Date date40 = dateTypeAdapter31.fromJsonTree(jsonElement39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter31.nullSafe();
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter41.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter0.fromJsonTree(jsonElement43);
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter0.toJsonTree(date45);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date48 = null;
        java.lang.String str49 = dateTypeAdapter47.toJson(date48);
        java.util.Date date50 = null;
        java.lang.String str51 = dateTypeAdapter47.toJson(date50);
        java.io.Reader reader52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date53 = dateTypeAdapter47.fromJson(reader52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonElement39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "null" + "'", str49, "null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1087");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = dateTypeAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter5.nullSafe();
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter15.toJson(date16);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter18 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter18.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter18.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        java.util.Date date30 = null;
        com.google.gson.JsonElement jsonElement31 = utcDateTypeAdapter26.toJsonTree(date30);
        java.util.Date date32 = utcDateTypeAdapter22.fromJsonTree(jsonElement31);
        java.util.Date date33 = dateTypeAdapter21.fromJsonTree(jsonElement31);
        java.util.Date date34 = dateTypeAdapter15.fromJsonTree(jsonElement31);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter37 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date38 = null;
        java.lang.String str39 = utcDateTypeAdapter37.toJson(date38);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = utcDateTypeAdapter37.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter41 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date42 = null;
        java.lang.String str43 = utcDateTypeAdapter41.toJson(date42);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter44 = utcDateTypeAdapter41.nullSafe();
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter41.toJsonTree(date45);
        java.util.Date date47 = utcDateTypeAdapter37.fromJsonTree(jsonElement46);
        java.util.Date date48 = utcDateTypeAdapter35.fromJsonTree(jsonElement46);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter49 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = utcDateTypeAdapter49.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter51 = dateTypeAdapter50.nullSafe();
        java.util.Date date52 = null;
        com.google.gson.JsonElement jsonElement53 = dateTypeAdapter51.toJsonTree(date52);
        java.util.Date date54 = null;
        com.google.gson.JsonElement jsonElement55 = dateTypeAdapter51.toJsonTree(date54);
        java.util.Date date56 = utcDateTypeAdapter35.fromJsonTree(jsonElement55);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter57 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = utcDateTypeAdapter57.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter59 = dateTypeAdapter58.nullSafe();
        java.util.Date date60 = null;
        java.lang.String str61 = dateTypeAdapter59.toJson(date60);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter62 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter63 = utcDateTypeAdapter62.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter64 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date65 = null;
        java.lang.String str66 = utcDateTypeAdapter64.toJson(date65);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter67 = utcDateTypeAdapter64.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter68 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date69 = null;
        java.lang.String str70 = utcDateTypeAdapter68.toJson(date69);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter71 = utcDateTypeAdapter68.nullSafe();
        java.util.Date date72 = null;
        com.google.gson.JsonElement jsonElement73 = utcDateTypeAdapter68.toJsonTree(date72);
        java.util.Date date74 = utcDateTypeAdapter64.fromJsonTree(jsonElement73);
        java.util.Date date75 = utcDateTypeAdapter62.fromJsonTree(jsonElement73);
        java.util.Date date76 = dateTypeAdapter59.fromJsonTree(jsonElement73);
        java.util.Date date77 = utcDateTypeAdapter35.fromJsonTree(jsonElement73);
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = utcDateTypeAdapter35.toJsonTree(date78);
        java.util.Date date80 = dateTypeAdapter15.fromJsonTree(jsonElement79);
        java.lang.Class<?> wildcardClass81 = jsonElement79.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(jsonElement31);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "null" + "'", str43, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
        org.junit.Assert.assertNotNull(dateTypeAdapter51);
        org.junit.Assert.assertNotNull(jsonElement53);
        org.junit.Assert.assertNotNull(jsonElement55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertNotNull(dateTypeAdapter59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "null" + "'", str61, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "null" + "'", str66, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "null" + "'", str70, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter71);
        org.junit.Assert.assertNotNull(jsonElement73);
        org.junit.Assert.assertNull(date74);
        org.junit.Assert.assertNull(date75);
        org.junit.Assert.assertNull(date76);
        org.junit.Assert.assertNull(date77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1088");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter8.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter4.fromJsonTree(jsonElement13);
        java.util.Date date15 = dateTypeAdapter3.fromJsonTree(jsonElement13);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter3.toJsonTree(date16);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter3.toJsonTree(date18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter3.nullSafe();
        java.io.Writer writer21 = null;
        java.util.Date date22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter3.toJson(writer21, date22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1089");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date5 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter0.toJson(date7);
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = utcDateTypeAdapter0.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1090");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = dateTypeAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter5.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = null;
        java.lang.String str19 = dateTypeAdapter15.toJson(date18);
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter15.toJson(date20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1091");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter0.toJson(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter12.toJson(date13);
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter12.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = dateTypeAdapter12.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter12.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter25 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter25.toJson(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter25.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter29 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date30 = null;
        java.lang.String str31 = utcDateTypeAdapter29.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter29.nullSafe();
        java.util.Date date33 = null;
        com.google.gson.JsonElement jsonElement34 = utcDateTypeAdapter29.toJsonTree(date33);
        java.util.Date date35 = utcDateTypeAdapter25.fromJsonTree(jsonElement34);
        java.util.Date date36 = utcDateTypeAdapter23.fromJsonTree(jsonElement34);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter37 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter37.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter38.nullSafe();
        java.util.Date date40 = null;
        com.google.gson.JsonElement jsonElement41 = dateTypeAdapter39.toJsonTree(date40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter39.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter23.fromJsonTree(jsonElement43);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter45 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date46 = null;
        java.lang.String str47 = utcDateTypeAdapter45.toJson(date46);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter45.nullSafe();
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = utcDateTypeAdapter45.toJsonTree(date49);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date52 = null;
        java.lang.String str53 = utcDateTypeAdapter51.toJson(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = utcDateTypeAdapter51.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter55 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date56 = null;
        java.lang.String str57 = utcDateTypeAdapter55.toJson(date56);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = utcDateTypeAdapter55.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter59 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date60 = null;
        java.lang.String str61 = utcDateTypeAdapter59.toJson(date60);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = utcDateTypeAdapter59.nullSafe();
        java.util.Date date63 = null;
        com.google.gson.JsonElement jsonElement64 = utcDateTypeAdapter59.toJsonTree(date63);
        java.util.Date date65 = utcDateTypeAdapter55.fromJsonTree(jsonElement64);
        java.util.Date date66 = dateTypeAdapter54.fromJsonTree(jsonElement64);
        java.util.Date date67 = utcDateTypeAdapter45.fromJsonTree(jsonElement64);
        java.util.Date date68 = utcDateTypeAdapter23.fromJsonTree(jsonElement64);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter69 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date70 = null;
        java.lang.String str71 = utcDateTypeAdapter69.toJson(date70);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter72 = utcDateTypeAdapter69.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter73 = dateTypeAdapter72.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter74 = dateTypeAdapter72.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter75 = dateTypeAdapter74.nullSafe();
        java.util.Date date76 = null;
        com.google.gson.JsonElement jsonElement77 = dateTypeAdapter74.toJsonTree(date76);
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = dateTypeAdapter74.toJsonTree(date78);
        java.util.Date date80 = utcDateTypeAdapter23.fromJsonTree(jsonElement79);
        java.util.Date date81 = dateTypeAdapter22.fromJsonTree(jsonElement79);
        java.lang.Class<?> wildcardClass82 = jsonElement79.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(jsonElement34);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(jsonElement41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "null" + "'", str47, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(jsonElement50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null" + "'", str53, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "null" + "'", str57, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "null" + "'", str61, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertNotNull(jsonElement64);
        org.junit.Assert.assertNull(date65);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNull(date67);
        org.junit.Assert.assertNull(date68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "null" + "'", str71, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter72);
        org.junit.Assert.assertNotNull(dateTypeAdapter73);
        org.junit.Assert.assertNotNull(dateTypeAdapter74);
        org.junit.Assert.assertNotNull(dateTypeAdapter75);
        org.junit.Assert.assertNotNull(jsonElement77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNull(date81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1092");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date5 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = utcDateTypeAdapter0.toJsonTree(date7);
        com.google.gson.stream.JsonReader jsonReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = utcDateTypeAdapter0.read(jsonReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonReader.peek()\" because \"in\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1093");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter4.toJsonTree(date8);
        java.util.Date date10 = utcDateTypeAdapter0.fromJsonTree(jsonElement9);
        java.util.Date date12 = utcDateTypeAdapter0.fromJson("null");
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter0.toJson(date13);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter15 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter15.toJson(date16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter15.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter18.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter19.nullSafe();
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter20.toJsonTree(date21);
        java.util.Date date23 = utcDateTypeAdapter0.fromJsonTree(jsonElement22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1094");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter8.toJsonTree(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter8.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter14.toJsonTree(date15);
        java.util.Date date17 = null;
        java.lang.String str18 = dateTypeAdapter14.toJson(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter14.toJsonTree(date19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(jsonElement20);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1095");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter9.fromJsonTree(jsonElement17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date23 = null;
        java.lang.String str24 = dateTypeAdapter22.toJson(date23);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter25 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = dateTypeAdapter26.toJsonTree(date28);
        java.util.Date date30 = dateTypeAdapter22.fromJsonTree(jsonElement29);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter31 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date32 = null;
        java.lang.String str33 = utcDateTypeAdapter31.toJson(date32);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = utcDateTypeAdapter31.nullSafe();
        java.util.Date date35 = null;
        com.google.gson.JsonElement jsonElement36 = utcDateTypeAdapter31.toJsonTree(date35);
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter31.toJson(date37);
        java.util.Date date39 = null;
        com.google.gson.JsonElement jsonElement40 = utcDateTypeAdapter31.toJsonTree(date39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = utcDateTypeAdapter31.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter42 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date43 = null;
        java.lang.String str44 = utcDateTypeAdapter42.toJson(date43);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter45 = utcDateTypeAdapter42.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = dateTypeAdapter45.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter45.nullSafe();
        java.util.Date date49 = dateTypeAdapter47.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = dateTypeAdapter47.nullSafe();
        java.util.Date date51 = null;
        com.google.gson.JsonElement jsonElement52 = dateTypeAdapter50.toJsonTree(date51);
        java.util.Date date53 = utcDateTypeAdapter31.fromJsonTree(jsonElement52);
        java.util.Date date54 = dateTypeAdapter22.fromJsonTree(jsonElement52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass55 = date54.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(jsonElement29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null" + "'", str33, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNotNull(jsonElement36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(jsonElement40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "null" + "'", str44, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter45);
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNull(date49);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
        org.junit.Assert.assertNotNull(jsonElement52);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertNull(date54);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1096");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter8.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter4.fromJsonTree(jsonElement13);
        java.util.Date date15 = dateTypeAdapter3.fromJsonTree(jsonElement13);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter3.toJsonTree(date16);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter3.toJsonTree(date18);
        java.util.Date date20 = null;
        java.lang.String str21 = dateTypeAdapter3.toJson(date20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter25.nullSafe();
        java.util.Date date27 = null;
        java.lang.String str28 = dateTypeAdapter25.toJson(date27);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter29 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date30 = null;
        java.lang.String str31 = utcDateTypeAdapter29.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter29.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter33 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date34 = null;
        java.lang.String str35 = utcDateTypeAdapter33.toJson(date34);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter33.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter37 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date38 = null;
        java.lang.String str39 = utcDateTypeAdapter37.toJson(date38);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = utcDateTypeAdapter37.nullSafe();
        java.util.Date date41 = null;
        com.google.gson.JsonElement jsonElement42 = utcDateTypeAdapter37.toJsonTree(date41);
        java.util.Date date43 = utcDateTypeAdapter33.fromJsonTree(jsonElement42);
        java.util.Date date44 = dateTypeAdapter32.fromJsonTree(jsonElement42);
        java.util.Date date45 = dateTypeAdapter25.fromJsonTree(jsonElement42);
        java.util.Date date46 = null;
        com.google.gson.JsonElement jsonElement47 = dateTypeAdapter25.toJsonTree(date46);
        java.util.Date date48 = dateTypeAdapter3.fromJsonTree(jsonElement47);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter3.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date51 = dateTypeAdapter49.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(jsonElement42);
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(jsonElement47);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1097");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter5.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter5.toJson(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = dateTypeAdapter12.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1098");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter1.toJson(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = dateTypeAdapter1.toJsonTree(date5);
        java.util.Date date8 = dateTypeAdapter1.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter1.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = dateTypeAdapter1.toJsonTree(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter1.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date14 = null;
        java.lang.String str15 = utcDateTypeAdapter13.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter13.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = utcDateTypeAdapter13.toJsonTree(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = utcDateTypeAdapter13.toJsonTree(date19);
        java.util.Date date21 = dateTypeAdapter1.fromJsonTree(jsonElement20);
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1099");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter5.nullSafe();
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter5.toJson(date10);
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateTypeAdapter5.fromJson(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1100");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = dateTypeAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter5.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = dateTypeAdapter15.toJsonTree(date18);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter20 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter20.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = dateTypeAdapter21.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        java.util.Date date30 = null;
        java.lang.String str31 = dateTypeAdapter28.toJson(date30);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter32 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date33 = null;
        java.lang.String str34 = utcDateTypeAdapter32.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = utcDateTypeAdapter32.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = dateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter35.nullSafe();
        java.util.Date date39 = dateTypeAdapter37.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter37.nullSafe();
        java.util.Date date41 = null;
        java.lang.String str42 = dateTypeAdapter40.toJson(date41);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter46.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = dateTypeAdapter47.nullSafe();
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = dateTypeAdapter48.toJsonTree(date49);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter52 = utcDateTypeAdapter51.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter53 = dateTypeAdapter52.nullSafe();
        java.util.Date date54 = null;
        java.lang.String str55 = dateTypeAdapter53.toJson(date54);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter56 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = utcDateTypeAdapter56.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter58 = dateTypeAdapter57.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter59 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date60 = null;
        java.lang.String str61 = utcDateTypeAdapter59.toJson(date60);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = utcDateTypeAdapter59.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter63 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date64 = null;
        java.lang.String str65 = utcDateTypeAdapter63.toJson(date64);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter66 = utcDateTypeAdapter63.nullSafe();
        java.util.Date date67 = null;
        com.google.gson.JsonElement jsonElement68 = utcDateTypeAdapter63.toJsonTree(date67);
        java.util.Date date69 = utcDateTypeAdapter59.fromJsonTree(jsonElement68);
        java.util.Date date70 = dateTypeAdapter57.fromJsonTree(jsonElement68);
        java.util.Date date71 = dateTypeAdapter53.fromJsonTree(jsonElement68);
        java.util.Date date72 = dateTypeAdapter48.fromJsonTree(jsonElement68);
        java.util.Date date73 = dateTypeAdapter40.fromJsonTree(jsonElement68);
        java.util.Date date74 = dateTypeAdapter28.fromJsonTree(jsonElement68);
        java.util.Date date75 = dateTypeAdapter22.fromJsonTree(jsonElement68);
        java.util.Date date76 = null;
        com.google.gson.JsonElement jsonElement77 = dateTypeAdapter22.toJsonTree(date76);
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = dateTypeAdapter22.toJsonTree(date78);
        java.util.Date date80 = dateTypeAdapter15.fromJsonTree(jsonElement79);
        java.util.Date date81 = null;
        com.google.gson.JsonElement jsonElement82 = dateTypeAdapter15.toJsonTree(date81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "null" + "'", str42, "null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(jsonElement50);
        org.junit.Assert.assertNotNull(dateTypeAdapter52);
        org.junit.Assert.assertNotNull(dateTypeAdapter53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "null" + "'", str55, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(dateTypeAdapter58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "null" + "'", str61, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "null" + "'", str65, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter66);
        org.junit.Assert.assertNotNull(jsonElement68);
        org.junit.Assert.assertNull(date69);
        org.junit.Assert.assertNull(date70);
        org.junit.Assert.assertNull(date71);
        org.junit.Assert.assertNull(date72);
        org.junit.Assert.assertNull(date73);
        org.junit.Assert.assertNull(date74);
        org.junit.Assert.assertNull(date75);
        org.junit.Assert.assertNotNull(jsonElement77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNotNull(jsonElement82);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1101");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter3.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter8.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1102");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter0.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter12.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter12.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = utcDateTypeAdapter12.toJsonTree(date16);
        java.util.Date date18 = utcDateTypeAdapter8.fromJsonTree(jsonElement17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = utcDateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter20 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter20.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = dateTypeAdapter21.nullSafe();
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter22.toJsonTree(date23);
        java.util.Date date25 = utcDateTypeAdapter8.fromJsonTree(jsonElement24);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date36 = null;
        java.lang.String str37 = utcDateTypeAdapter35.toJson(date36);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter38 = utcDateTypeAdapter35.nullSafe();
        java.util.Date date39 = null;
        com.google.gson.JsonElement jsonElement40 = utcDateTypeAdapter35.toJsonTree(date39);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter41 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date42 = null;
        java.lang.String str43 = utcDateTypeAdapter41.toJson(date42);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter44 = utcDateTypeAdapter41.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter45 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date46 = null;
        java.lang.String str47 = utcDateTypeAdapter45.toJson(date46);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter45.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter49 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date50 = null;
        java.lang.String str51 = utcDateTypeAdapter49.toJson(date50);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter52 = utcDateTypeAdapter49.nullSafe();
        java.util.Date date53 = null;
        com.google.gson.JsonElement jsonElement54 = utcDateTypeAdapter49.toJsonTree(date53);
        java.util.Date date55 = utcDateTypeAdapter45.fromJsonTree(jsonElement54);
        java.util.Date date56 = dateTypeAdapter44.fromJsonTree(jsonElement54);
        java.util.Date date57 = utcDateTypeAdapter35.fromJsonTree(jsonElement54);
        java.util.Date date58 = dateTypeAdapter31.fromJsonTree(jsonElement54);
        java.util.Date date59 = utcDateTypeAdapter8.fromJsonTree(jsonElement54);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter60 = utcDateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter61 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date62 = null;
        java.lang.String str63 = utcDateTypeAdapter61.toJson(date62);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter64 = utcDateTypeAdapter61.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter65 = dateTypeAdapter64.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter66 = dateTypeAdapter64.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter67 = dateTypeAdapter66.nullSafe();
        java.util.Date date68 = null;
        com.google.gson.JsonElement jsonElement69 = dateTypeAdapter66.toJsonTree(date68);
        java.util.Date date70 = null;
        com.google.gson.JsonElement jsonElement71 = dateTypeAdapter66.toJsonTree(date70);
        java.util.Date date72 = dateTypeAdapter60.fromJsonTree(jsonElement71);
        java.util.Date date73 = dateTypeAdapter7.fromJsonTree(jsonElement71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter38);
        org.junit.Assert.assertNotNull(jsonElement40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "null" + "'", str43, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "null" + "'", str47, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter52);
        org.junit.Assert.assertNotNull(jsonElement54);
        org.junit.Assert.assertNull(date55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertNull(date57);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertNotNull(dateTypeAdapter60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "null" + "'", str63, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter64);
        org.junit.Assert.assertNotNull(dateTypeAdapter65);
        org.junit.Assert.assertNotNull(dateTypeAdapter66);
        org.junit.Assert.assertNotNull(dateTypeAdapter67);
        org.junit.Assert.assertNotNull(jsonElement69);
        org.junit.Assert.assertNotNull(jsonElement71);
        org.junit.Assert.assertNull(date72);
        org.junit.Assert.assertNull(date73);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1103");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter2 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date3 = null;
        java.lang.String str4 = utcDateTypeAdapter2.toJson(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = utcDateTypeAdapter2.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter6.toJsonTree(date10);
        java.util.Date date12 = utcDateTypeAdapter2.fromJsonTree(jsonElement11);
        java.util.Date date13 = utcDateTypeAdapter0.fromJsonTree(jsonElement11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter15.toJsonTree(date17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement18);
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter0.toJson(date20);
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = utcDateTypeAdapter0.toJsonTree(date22);
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter0.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter0.nullSafe();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1104");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter0.toJsonTree(date10);
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter0.toJson(date12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = utcDateTypeAdapter0.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1105");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter5.toJsonTree(date6);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        java.util.Date date11 = null;
        java.lang.String str12 = dateTypeAdapter10.toJson(date11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter16 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date17 = null;
        java.lang.String str18 = utcDateTypeAdapter16.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = utcDateTypeAdapter16.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter20 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date21 = null;
        java.lang.String str22 = utcDateTypeAdapter20.toJson(date21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter20.nullSafe();
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = utcDateTypeAdapter20.toJsonTree(date24);
        java.util.Date date26 = utcDateTypeAdapter16.fromJsonTree(jsonElement25);
        java.util.Date date27 = dateTypeAdapter14.fromJsonTree(jsonElement25);
        java.util.Date date28 = dateTypeAdapter10.fromJsonTree(jsonElement25);
        java.util.Date date29 = dateTypeAdapter5.fromJsonTree(jsonElement25);
        java.util.Date date30 = null;
        java.lang.String str31 = dateTypeAdapter5.toJson(date30);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter32 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date33 = null;
        java.lang.String str34 = utcDateTypeAdapter32.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = utcDateTypeAdapter32.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = dateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter36.nullSafe();
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter37.toJsonTree(date38);
        java.util.Date date40 = null;
        java.lang.String str41 = dateTypeAdapter37.toJson(date40);
        java.util.Date date42 = null;
        java.lang.String str43 = dateTypeAdapter37.toJson(date42);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter44 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date45 = null;
        java.lang.String str46 = utcDateTypeAdapter44.toJson(date45);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = utcDateTypeAdapter44.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = dateTypeAdapter47.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter47.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = dateTypeAdapter49.nullSafe();
        java.util.Date date51 = null;
        java.lang.String str52 = dateTypeAdapter49.toJson(date51);
        java.util.Date date53 = null;
        com.google.gson.JsonElement jsonElement54 = dateTypeAdapter49.toJsonTree(date53);
        java.util.Date date55 = dateTypeAdapter37.fromJsonTree(jsonElement54);
        java.util.Date date56 = null;
        com.google.gson.JsonElement jsonElement57 = dateTypeAdapter37.toJsonTree(date56);
        java.util.Date date58 = dateTypeAdapter5.fromJsonTree(jsonElement57);
        java.util.Date date60 = dateTypeAdapter5.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter61 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter62 = utcDateTypeAdapter61.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter63 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date64 = null;
        java.lang.String str65 = utcDateTypeAdapter63.toJson(date64);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter66 = utcDateTypeAdapter63.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter67 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date68 = null;
        java.lang.String str69 = utcDateTypeAdapter67.toJson(date68);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter70 = utcDateTypeAdapter67.nullSafe();
        java.util.Date date71 = null;
        com.google.gson.JsonElement jsonElement72 = utcDateTypeAdapter67.toJsonTree(date71);
        java.util.Date date73 = utcDateTypeAdapter63.fromJsonTree(jsonElement72);
        java.util.Date date74 = utcDateTypeAdapter61.fromJsonTree(jsonElement72);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter75 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter76 = utcDateTypeAdapter75.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter77 = dateTypeAdapter76.nullSafe();
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = dateTypeAdapter77.toJsonTree(date78);
        java.util.Date date80 = null;
        com.google.gson.JsonElement jsonElement81 = dateTypeAdapter77.toJsonTree(date80);
        java.util.Date date82 = utcDateTypeAdapter61.fromJsonTree(jsonElement81);
        java.util.Date date83 = null;
        com.google.gson.JsonElement jsonElement84 = utcDateTypeAdapter61.toJsonTree(date83);
        java.util.Date date85 = dateTypeAdapter5.fromJsonTree(jsonElement84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonElement39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "null" + "'", str43, "null");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "null" + "'", str46, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "null" + "'", str52, "null");
        org.junit.Assert.assertNotNull(jsonElement54);
        org.junit.Assert.assertNull(date55);
        org.junit.Assert.assertNotNull(jsonElement57);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertNotNull(dateTypeAdapter62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "null" + "'", str65, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "null" + "'", str69, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter70);
        org.junit.Assert.assertNotNull(jsonElement72);
        org.junit.Assert.assertNull(date73);
        org.junit.Assert.assertNull(date74);
        org.junit.Assert.assertNotNull(dateTypeAdapter76);
        org.junit.Assert.assertNotNull(dateTypeAdapter77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNotNull(jsonElement81);
        org.junit.Assert.assertNull(date82);
        org.junit.Assert.assertNotNull(jsonElement84);
        org.junit.Assert.assertNull(date85);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1106");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = dateTypeAdapter9.fromJsonTree(jsonElement17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter22.nullSafe();
        java.util.Date date25 = null;
        java.lang.String str26 = dateTypeAdapter24.toJson(date25);
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = dateTypeAdapter24.fromJson(reader27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1107");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter4.toJsonTree(date8);
        java.util.Date date10 = utcDateTypeAdapter0.fromJsonTree(jsonElement9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter0.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = utcDateTypeAdapter0.toJsonTree(date14);
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter0.toJson(date16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1108");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter3.toJson(date5);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter15 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter15.toJson(date16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter15.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = utcDateTypeAdapter15.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter11.fromJsonTree(jsonElement20);
        java.util.Date date22 = dateTypeAdapter10.fromJsonTree(jsonElement20);
        java.util.Date date23 = dateTypeAdapter3.fromJsonTree(jsonElement20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter24.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        java.util.Date date31 = null;
        java.lang.String str32 = dateTypeAdapter30.toJson(date31);
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter30.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter30.nullSafe();
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = dateTypeAdapter30.toJsonTree(date36);
        java.util.Date date38 = dateTypeAdapter3.fromJsonTree(jsonElement37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter39.nullSafe();
        java.util.Date date41 = null;
        com.google.gson.JsonElement jsonElement42 = dateTypeAdapter40.toJsonTree(date41);
        java.util.Date date43 = null;
        com.google.gson.JsonElement jsonElement44 = dateTypeAdapter40.toJsonTree(date43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(jsonElement42);
        org.junit.Assert.assertNotNull(jsonElement44);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1109");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = dateTypeAdapter4.toJsonTree(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter4.toJson(date7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1110");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter4.toJsonTree(date8);
        java.util.Date date10 = utcDateTypeAdapter0.fromJsonTree(jsonElement9);
        java.util.Date date12 = utcDateTypeAdapter0.fromJson("null");
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter0.toJson(date13);
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter0.toJsonTree(date15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(jsonElement16);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1111");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter5.toJsonTree(date6);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = dateTypeAdapter12.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter12.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = dateTypeAdapter12.toJsonTree(date15);
        java.util.Date date17 = dateTypeAdapter5.fromJsonTree(jsonElement16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter19.toJson(date20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        java.util.Date date29 = null;
        java.lang.String str30 = dateTypeAdapter27.toJson(date29);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter31 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter31.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter32.nullSafe();
        java.util.Date date34 = null;
        com.google.gson.JsonElement jsonElement35 = dateTypeAdapter32.toJsonTree(date34);
        java.util.Date date36 = dateTypeAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter27.nullSafe();
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter37.toJsonTree(date38);
        java.util.Date date40 = utcDateTypeAdapter19.fromJsonTree(jsonElement39);
        java.util.Date date41 = dateTypeAdapter5.fromJsonTree(jsonElement39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(jsonElement35);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonElement39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNull(date41);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1112");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        java.util.Date date10 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter5.nullSafe();
        java.util.Date date12 = null;
        java.lang.String str13 = dateTypeAdapter5.toJson(date12);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = dateTypeAdapter5.fromJson(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1113");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.stream.JsonWriter jsonWriter10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1114");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date25 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date27 = null;
        java.lang.String str28 = utcDateTypeAdapter26.toJson(date27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = dateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter31.nullSafe();
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter31.toJson(date33);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter35 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter35.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter36.nullSafe();
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter36.toJsonTree(date38);
        java.util.Date date40 = dateTypeAdapter31.fromJsonTree(jsonElement39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter31.nullSafe();
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter41.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter0.fromJsonTree(jsonElement43);
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter0.toJsonTree(date45);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date50 = null;
        java.lang.String str51 = utcDateTypeAdapter0.toJson(date50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null" + "'", str28, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonElement39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1115");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = dateTypeAdapter12.toJsonTree(date13);
        java.util.Date date15 = dateTypeAdapter6.fromJsonTree(jsonElement14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter17 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter17.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter18.nullSafe();
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = dateTypeAdapter19.toJsonTree(date20);
        java.util.Date date22 = dateTypeAdapter16.fromJsonTree(jsonElement21);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter16.toJsonTree(date23);
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = dateTypeAdapter16.toJsonTree(date25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertNotNull(jsonElement26);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1116");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter6.toJson(date7);
        java.util.Date date9 = null;
        java.lang.String str10 = dateTypeAdapter6.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter6.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter6.toJsonTree(date12);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter18 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter18.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter18.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = utcDateTypeAdapter18.toJsonTree(date22);
        java.util.Date date24 = utcDateTypeAdapter14.fromJsonTree(jsonElement23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter26 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = dateTypeAdapter28.toJsonTree(date29);
        java.util.Date date31 = utcDateTypeAdapter14.fromJsonTree(jsonElement30);
        java.util.Date date32 = dateTypeAdapter6.fromJsonTree(jsonElement30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = dateTypeAdapter33.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1117");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter1.toJson(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = dateTypeAdapter1.toJsonTree(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter1.toJson(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter1.toJsonTree(date9);
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1118");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter10.fromJsonTree(jsonElement18);
        java.util.Date date20 = dateTypeAdapter3.fromJsonTree(jsonElement18);
        java.util.Date date22 = dateTypeAdapter3.fromJson("null");
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = dateTypeAdapter3.toJsonTree(date23);
        java.util.Date date25 = null;
        java.lang.String str26 = dateTypeAdapter3.toJson(date25);
        java.lang.Class<?> wildcardClass27 = dateTypeAdapter3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1119");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter5.toJsonTree(date6);
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter5.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter11.toJsonTree(date15);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter17 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date18 = null;
        java.lang.String str19 = utcDateTypeAdapter17.toJson(date18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = utcDateTypeAdapter17.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter21 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date22 = null;
        java.lang.String str23 = utcDateTypeAdapter21.toJson(date22);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter21.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter25 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter25.toJson(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter25.nullSafe();
        java.util.Date date29 = null;
        com.google.gson.JsonElement jsonElement30 = utcDateTypeAdapter25.toJsonTree(date29);
        java.util.Date date31 = utcDateTypeAdapter21.fromJsonTree(jsonElement30);
        java.util.Date date32 = dateTypeAdapter20.fromJsonTree(jsonElement30);
        java.util.Date date33 = utcDateTypeAdapter11.fromJsonTree(jsonElement30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = utcDateTypeAdapter11.nullSafe();
        java.util.Date date36 = utcDateTypeAdapter11.fromJson("null");
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter11.toJson(date37);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter39 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date40 = null;
        java.lang.String str41 = utcDateTypeAdapter39.toJson(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = utcDateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter43 = dateTypeAdapter42.nullSafe();
        java.util.Date date44 = null;
        java.lang.String str45 = dateTypeAdapter42.toJson(date44);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter46 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date47 = null;
        java.lang.String str48 = utcDateTypeAdapter46.toJson(date47);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = utcDateTypeAdapter46.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter50 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date51 = null;
        java.lang.String str52 = utcDateTypeAdapter50.toJson(date51);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter53 = utcDateTypeAdapter50.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter54 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date55 = null;
        java.lang.String str56 = utcDateTypeAdapter54.toJson(date55);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = utcDateTypeAdapter54.nullSafe();
        java.util.Date date58 = null;
        com.google.gson.JsonElement jsonElement59 = utcDateTypeAdapter54.toJsonTree(date58);
        java.util.Date date60 = utcDateTypeAdapter50.fromJsonTree(jsonElement59);
        java.util.Date date61 = dateTypeAdapter49.fromJsonTree(jsonElement59);
        java.util.Date date62 = dateTypeAdapter42.fromJsonTree(jsonElement59);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter63 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date64 = null;
        java.lang.String str65 = utcDateTypeAdapter63.toJson(date64);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter66 = utcDateTypeAdapter63.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter67 = dateTypeAdapter66.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter68 = dateTypeAdapter66.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter69 = dateTypeAdapter68.nullSafe();
        java.util.Date date70 = null;
        java.lang.String str71 = dateTypeAdapter69.toJson(date70);
        java.util.Date date72 = null;
        java.lang.String str73 = dateTypeAdapter69.toJson(date72);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter74 = dateTypeAdapter69.nullSafe();
        java.util.Date date75 = null;
        com.google.gson.JsonElement jsonElement76 = dateTypeAdapter69.toJsonTree(date75);
        java.util.Date date77 = dateTypeAdapter42.fromJsonTree(jsonElement76);
        java.util.Date date78 = null;
        com.google.gson.JsonElement jsonElement79 = dateTypeAdapter42.toJsonTree(date78);
        java.util.Date date80 = utcDateTypeAdapter11.fromJsonTree(jsonElement79);
        java.util.Date date81 = dateTypeAdapter10.fromJsonTree(jsonElement79);
        java.util.Date date82 = null;
        com.google.gson.JsonElement jsonElement83 = dateTypeAdapter10.toJsonTree(date82);
        java.util.Date date84 = null;
        java.lang.String str85 = dateTypeAdapter10.toJson(date84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertNotNull(dateTypeAdapter43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "null" + "'", str48, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "null" + "'", str52, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "null" + "'", str56, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNotNull(jsonElement59);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertNull(date62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "null" + "'", str65, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter66);
        org.junit.Assert.assertNotNull(dateTypeAdapter67);
        org.junit.Assert.assertNotNull(dateTypeAdapter68);
        org.junit.Assert.assertNotNull(dateTypeAdapter69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "null" + "'", str71, "null");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "null" + "'", str73, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter74);
        org.junit.Assert.assertNotNull(jsonElement76);
        org.junit.Assert.assertNull(date77);
        org.junit.Assert.assertNotNull(jsonElement79);
        org.junit.Assert.assertNull(date80);
        org.junit.Assert.assertNull(date81);
        org.junit.Assert.assertNotNull(jsonElement83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "null" + "'", str85, "null");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1120");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter12.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter12.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = utcDateTypeAdapter12.toJsonTree(date16);
        java.util.Date date18 = utcDateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = dateTypeAdapter6.fromJsonTree(jsonElement17);
        java.util.Date date20 = dateTypeAdapter2.fromJsonTree(jsonElement17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = dateTypeAdapter2.nullSafe();
        java.util.Date date23 = dateTypeAdapter21.fromJson("null");
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter21.toJsonTree(date24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = dateTypeAdapter21.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(jsonElement25);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1121");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter0.toJsonTree(date10);
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter0.toJson(date12);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter17.nullSafe();
        java.util.Date date19 = null;
        java.lang.String str20 = dateTypeAdapter17.toJson(date19);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter21 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date22 = null;
        java.lang.String str23 = utcDateTypeAdapter21.toJson(date22);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter21.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter25 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date26 = null;
        java.lang.String str27 = utcDateTypeAdapter25.toJson(date26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter25.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter29 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date30 = null;
        java.lang.String str31 = utcDateTypeAdapter29.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter29.nullSafe();
        java.util.Date date33 = null;
        com.google.gson.JsonElement jsonElement34 = utcDateTypeAdapter29.toJsonTree(date33);
        java.util.Date date35 = utcDateTypeAdapter25.fromJsonTree(jsonElement34);
        java.util.Date date36 = dateTypeAdapter24.fromJsonTree(jsonElement34);
        java.util.Date date37 = dateTypeAdapter17.fromJsonTree(jsonElement34);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter38 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date39 = null;
        java.lang.String str40 = utcDateTypeAdapter38.toJson(date39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = utcDateTypeAdapter38.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = dateTypeAdapter41.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter43 = dateTypeAdapter41.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter44 = dateTypeAdapter43.nullSafe();
        java.util.Date date45 = null;
        java.lang.String str46 = dateTypeAdapter44.toJson(date45);
        java.util.Date date47 = null;
        java.lang.String str48 = dateTypeAdapter44.toJson(date47);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter44.nullSafe();
        java.util.Date date50 = null;
        com.google.gson.JsonElement jsonElement51 = dateTypeAdapter44.toJsonTree(date50);
        java.util.Date date52 = dateTypeAdapter17.fromJsonTree(jsonElement51);
        java.util.Date date53 = null;
        com.google.gson.JsonElement jsonElement54 = dateTypeAdapter17.toJsonTree(date53);
        java.util.Date date55 = utcDateTypeAdapter0.fromJsonTree(jsonElement54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(jsonElement34);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "null" + "'", str40, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertNotNull(dateTypeAdapter43);
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "null" + "'", str46, "null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "null" + "'", str48, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertNotNull(jsonElement51);
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertNotNull(jsonElement54);
        org.junit.Assert.assertNull(date55);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1122");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter8.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter4.fromJsonTree(jsonElement13);
        java.util.Date date15 = dateTypeAdapter3.fromJsonTree(jsonElement13);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter3.toJsonTree(date16);
        java.util.Date date19 = dateTypeAdapter3.fromJson("null");
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = dateTypeAdapter3.fromJson(reader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1123");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter10.toJsonTree(date12);
        java.util.Date date14 = dateTypeAdapter5.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter5.nullSafe();
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter15.toJson(date16);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter18 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date19 = null;
        java.lang.String str20 = utcDateTypeAdapter18.toJson(date19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = utcDateTypeAdapter18.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter26.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter29 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date30 = null;
        java.lang.String str31 = utcDateTypeAdapter29.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter29.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter32.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = dateTypeAdapter33.nullSafe();
        java.util.Date date35 = null;
        com.google.gson.JsonElement jsonElement36 = dateTypeAdapter34.toJsonTree(date35);
        java.util.Date date37 = dateTypeAdapter28.fromJsonTree(jsonElement36);
        java.util.Date date38 = dateTypeAdapter21.fromJsonTree(jsonElement36);
        java.util.Date date39 = dateTypeAdapter15.fromJsonTree(jsonElement36);
        java.util.Date date40 = null;
        com.google.gson.JsonElement jsonElement41 = dateTypeAdapter15.toJsonTree(date40);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = dateTypeAdapter15.nullSafe();
        java.util.Date date43 = null;
        com.google.gson.JsonElement jsonElement44 = dateTypeAdapter42.toJsonTree(date43);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter45 = dateTypeAdapter42.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNotNull(jsonElement36);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNotNull(jsonElement41);
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertNotNull(jsonElement44);
        org.junit.Assert.assertNotNull(dateTypeAdapter45);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1124");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter3 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date4 = null;
        java.lang.String str5 = utcDateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter3.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = utcDateTypeAdapter7.toJsonTree(date11);
        java.util.Date date13 = utcDateTypeAdapter3.fromJsonTree(jsonElement12);
        java.util.Date date14 = dateTypeAdapter1.fromJsonTree(jsonElement12);
        java.util.Date date15 = null;
        java.lang.String str16 = dateTypeAdapter1.toJson(date15);
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter1.toJsonTree(date17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = dateTypeAdapter1.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(jsonElement18);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1125");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter5.toJsonTree(date9);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = dateTypeAdapter5.toJsonTree(date11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1126");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = dateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = dateTypeAdapter2.toJsonTree(date5);
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter2.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass10 = dateTypeAdapter9.getClass();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1127");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date5 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter10.nullSafe();
        java.util.Date date14 = dateTypeAdapter12.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter12.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = dateTypeAdapter15.toJsonTree(date16);
        java.util.Date date18 = utcDateTypeAdapter0.fromJsonTree(jsonElement17);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter19.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter24.nullSafe();
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = dateTypeAdapter24.toJsonTree(date26);
        java.util.Date date28 = utcDateTypeAdapter0.fromJsonTree(jsonElement27);
        com.google.gson.stream.JsonWriter jsonWriter29 = null;
        java.util.Date date30 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter29, date30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNull(date28);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1128");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter2 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date3 = null;
        java.lang.String str4 = utcDateTypeAdapter2.toJson(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = utcDateTypeAdapter2.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter6.toJsonTree(date10);
        java.util.Date date12 = utcDateTypeAdapter2.fromJsonTree(jsonElement11);
        java.util.Date date13 = utcDateTypeAdapter0.fromJsonTree(jsonElement11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter16.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter0.fromJsonTree(jsonElement20);
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = utcDateTypeAdapter0.toJsonTree(date22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = utcDateTypeAdapter0.toJsonTree(date24);
        com.google.gson.stream.JsonWriter jsonWriter26 = null;
        java.util.Date date27 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter26, date27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNotNull(jsonElement25);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1129");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter3.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter3.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = dateTypeAdapter3.toJsonTree(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter3.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1130");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        java.util.Date date23 = null;
        com.google.gson.JsonElement jsonElement24 = utcDateTypeAdapter0.toJsonTree(date23);
        com.google.gson.stream.JsonWriter jsonWriter25 = null;
        java.util.Date date26 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter25, date26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(jsonElement24);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1131");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter8.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter4.fromJsonTree(jsonElement13);
        java.util.Date date15 = dateTypeAdapter3.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter3.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter17 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date18 = null;
        java.lang.String str19 = utcDateTypeAdapter17.toJson(date18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = utcDateTypeAdapter17.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = dateTypeAdapter20.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = dateTypeAdapter21.toJsonTree(date22);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter24.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter28.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter31 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date32 = null;
        java.lang.String str33 = utcDateTypeAdapter31.toJson(date32);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = utcDateTypeAdapter31.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter34.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = dateTypeAdapter35.nullSafe();
        java.util.Date date37 = null;
        com.google.gson.JsonElement jsonElement38 = dateTypeAdapter36.toJsonTree(date37);
        java.util.Date date39 = dateTypeAdapter30.fromJsonTree(jsonElement38);
        java.util.Date date40 = dateTypeAdapter21.fromJsonTree(jsonElement38);
        java.util.Date date41 = dateTypeAdapter3.fromJsonTree(jsonElement38);
        java.io.Writer writer42 = null;
        java.util.Date date43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter3.toJson(writer42, date43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null" + "'", str33, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(jsonElement38);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNull(date41);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1132");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        java.lang.String str4 = dateTypeAdapter2.toJson(date3);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter8 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date9 = null;
        java.lang.String str10 = utcDateTypeAdapter8.toJson(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = utcDateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter12 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date13 = null;
        java.lang.String str14 = utcDateTypeAdapter12.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter12.nullSafe();
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = utcDateTypeAdapter12.toJsonTree(date16);
        java.util.Date date18 = utcDateTypeAdapter8.fromJsonTree(jsonElement17);
        java.util.Date date19 = dateTypeAdapter6.fromJsonTree(jsonElement17);
        java.util.Date date20 = dateTypeAdapter2.fromJsonTree(jsonElement17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = dateTypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = dateTypeAdapter21.nullSafe();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1133");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter2 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date3 = null;
        java.lang.String str4 = utcDateTypeAdapter2.toJson(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = utcDateTypeAdapter2.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter6.toJsonTree(date10);
        java.util.Date date12 = utcDateTypeAdapter2.fromJsonTree(jsonElement11);
        java.util.Date date13 = utcDateTypeAdapter0.fromJsonTree(jsonElement11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter16.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter0.fromJsonTree(jsonElement20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter23.nullSafe();
        java.util.Date date25 = null;
        java.lang.String str26 = dateTypeAdapter24.toJson(date25);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter27 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter27.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter29 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date30 = null;
        java.lang.String str31 = utcDateTypeAdapter29.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter29.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter33 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date34 = null;
        java.lang.String str35 = utcDateTypeAdapter33.toJson(date34);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter36 = utcDateTypeAdapter33.nullSafe();
        java.util.Date date37 = null;
        com.google.gson.JsonElement jsonElement38 = utcDateTypeAdapter33.toJsonTree(date37);
        java.util.Date date39 = utcDateTypeAdapter29.fromJsonTree(jsonElement38);
        java.util.Date date40 = utcDateTypeAdapter27.fromJsonTree(jsonElement38);
        java.util.Date date41 = dateTypeAdapter24.fromJsonTree(jsonElement38);
        java.util.Date date42 = utcDateTypeAdapter0.fromJsonTree(jsonElement38);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter46.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = dateTypeAdapter46.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter48.nullSafe();
        java.util.Date date50 = null;
        java.lang.String str51 = dateTypeAdapter48.toJson(date50);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter52 = dateTypeAdapter48.nullSafe();
        java.util.Date date53 = null;
        com.google.gson.JsonElement jsonElement54 = dateTypeAdapter52.toJsonTree(date53);
        java.util.Date date55 = utcDateTypeAdapter0.fromJsonTree(jsonElement54);
        com.google.gson.stream.JsonWriter jsonWriter56 = null;
        java.util.Date date57 = null;
        // The following exception was thrown during execution in test generation
        try {
            utcDateTypeAdapter0.write(jsonWriter56, date57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.google.gson.stream.JsonWriter.nullValue()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter36);
        org.junit.Assert.assertNotNull(jsonElement38);
        org.junit.Assert.assertNull(date39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNull(date41);
        org.junit.Assert.assertNull(date42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "null" + "'", str51, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter52);
        org.junit.Assert.assertNotNull(jsonElement54);
        org.junit.Assert.assertNull(date55);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1134");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter8.toJsonTree(date12);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = dateTypeAdapter17.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = dateTypeAdapter17.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter19.nullSafe();
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter19.toJson(date21);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = utcDateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = dateTypeAdapter24.nullSafe();
        java.util.Date date26 = null;
        com.google.gson.JsonElement jsonElement27 = dateTypeAdapter24.toJsonTree(date26);
        java.util.Date date28 = dateTypeAdapter19.fromJsonTree(jsonElement27);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter19.nullSafe();
        java.util.Date date30 = null;
        java.lang.String str31 = dateTypeAdapter29.toJson(date30);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter32 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date33 = null;
        java.lang.String str34 = utcDateTypeAdapter32.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = utcDateTypeAdapter32.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter36.toJson(date37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter36.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter40 = dateTypeAdapter39.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = dateTypeAdapter40.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter42 = dateTypeAdapter40.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter43 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date44 = null;
        java.lang.String str45 = utcDateTypeAdapter43.toJson(date44);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter46 = utcDateTypeAdapter43.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = dateTypeAdapter46.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = dateTypeAdapter47.nullSafe();
        java.util.Date date49 = null;
        com.google.gson.JsonElement jsonElement50 = dateTypeAdapter48.toJsonTree(date49);
        java.util.Date date51 = dateTypeAdapter42.fromJsonTree(jsonElement50);
        java.util.Date date52 = dateTypeAdapter35.fromJsonTree(jsonElement50);
        java.util.Date date53 = dateTypeAdapter29.fromJsonTree(jsonElement50);
        java.util.Date date54 = null;
        com.google.gson.JsonElement jsonElement55 = dateTypeAdapter29.toJsonTree(date54);
        java.util.Date date56 = dateTypeAdapter8.fromJsonTree(jsonElement55);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter57 = dateTypeAdapter8.nullSafe();
        java.util.Date date59 = dateTypeAdapter57.fromJson("null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(jsonElement27);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(dateTypeAdapter40);
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(dateTypeAdapter42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null" + "'", str45, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter46);
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(jsonElement50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertNull(date53);
        org.junit.Assert.assertNotNull(jsonElement55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertNotNull(dateTypeAdapter57);
        org.junit.Assert.assertNull(date59);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1135");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter3.toJsonTree(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter3.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date10 = null;
        java.lang.String str11 = utcDateTypeAdapter9.toJson(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = utcDateTypeAdapter9.nullSafe();
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = utcDateTypeAdapter9.toJsonTree(date13);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter15 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter15.toJson(date16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter15.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date20 = null;
        java.lang.String str21 = utcDateTypeAdapter19.toJson(date20);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter23 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date24 = null;
        java.lang.String str25 = utcDateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter23.nullSafe();
        java.util.Date date27 = null;
        com.google.gson.JsonElement jsonElement28 = utcDateTypeAdapter23.toJsonTree(date27);
        java.util.Date date29 = utcDateTypeAdapter19.fromJsonTree(jsonElement28);
        java.util.Date date30 = dateTypeAdapter18.fromJsonTree(jsonElement28);
        java.util.Date date31 = utcDateTypeAdapter9.fromJsonTree(jsonElement28);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter32 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = utcDateTypeAdapter32.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = dateTypeAdapter33.nullSafe();
        java.util.Date date35 = null;
        java.lang.String str36 = dateTypeAdapter34.toJson(date35);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter34.nullSafe();
        java.util.Date date38 = null;
        com.google.gson.JsonElement jsonElement39 = dateTypeAdapter37.toJsonTree(date38);
        java.util.Date date40 = utcDateTypeAdapter9.fromJsonTree(jsonElement39);
        java.util.Date date41 = dateTypeAdapter8.fromJsonTree(jsonElement39);
        java.io.Writer writer42 = null;
        java.util.Date date43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter8.toJson(writer42, date43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null" + "'", str21, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(jsonElement28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null" + "'", str36, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonElement39);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNull(date41);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1136");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter4.toJsonTree(date8);
        java.util.Date date10 = utcDateTypeAdapter0.fromJsonTree(jsonElement9);
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter0.toJson(date11);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = utcDateTypeAdapter0.fromJson(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1137");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter3.toJson(date5);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter15 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter15.toJson(date16);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter18 = utcDateTypeAdapter15.nullSafe();
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = utcDateTypeAdapter15.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter11.fromJsonTree(jsonElement20);
        java.util.Date date22 = dateTypeAdapter10.fromJsonTree(jsonElement20);
        java.util.Date date23 = dateTypeAdapter3.fromJsonTree(jsonElement20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter24.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        java.util.Date date31 = null;
        java.lang.String str32 = dateTypeAdapter30.toJson(date31);
        java.util.Date date33 = null;
        java.lang.String str34 = dateTypeAdapter30.toJson(date33);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter30.nullSafe();
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = dateTypeAdapter30.toJsonTree(date36);
        java.util.Date date38 = dateTypeAdapter3.fromJsonTree(jsonElement37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter3.nullSafe();
        java.util.Date date40 = null;
        java.lang.String str41 = dateTypeAdapter3.toJson(date40);
        java.util.Date date43 = dateTypeAdapter3.fromJson("null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "null" + "'", str34, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNull(date43);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1138");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = utcDateTypeAdapter7.fromJsonTree(jsonElement16);
        java.util.Date date18 = utcDateTypeAdapter5.fromJsonTree(jsonElement16);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = dateTypeAdapter20.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = dateTypeAdapter21.toJsonTree(date22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter21.toJsonTree(date24);
        java.util.Date date26 = utcDateTypeAdapter5.fromJsonTree(jsonElement25);
        java.util.Date date27 = utcDateTypeAdapter0.fromJsonTree(jsonElement25);
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = utcDateTypeAdapter0.fromJson(reader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1139");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date4 = dateTypeAdapter1.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter1.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter5.toJson(date7);
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter5.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1140");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date24 = null;
        java.lang.String str25 = dateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter23.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        java.util.Date date28 = null;
        java.lang.String str29 = dateTypeAdapter26.toJson(date28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null" + "'", str29, "null");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1141");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter2 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date3 = null;
        java.lang.String str4 = utcDateTypeAdapter2.toJson(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = utcDateTypeAdapter2.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter6.toJsonTree(date10);
        java.util.Date date12 = utcDateTypeAdapter2.fromJsonTree(jsonElement11);
        java.util.Date date13 = utcDateTypeAdapter0.fromJsonTree(jsonElement11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = null;
        com.google.gson.JsonElement jsonElement20 = dateTypeAdapter16.toJsonTree(date19);
        java.util.Date date21 = utcDateTypeAdapter0.fromJsonTree(jsonElement20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter23.nullSafe();
        java.util.Date date25 = null;
        com.google.gson.JsonElement jsonElement26 = dateTypeAdapter23.toJsonTree(date25);
        java.util.Date date27 = utcDateTypeAdapter0.fromJsonTree(jsonElement26);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = utcDateTypeAdapter0.nullSafe();
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(jsonElement26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1142");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        com.google.gson.JsonElement jsonElement8 = dateTypeAdapter5.toJsonTree(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter5.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter5.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter11.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = dateTypeAdapter11.toJsonTree(date14);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter16 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date17 = null;
        java.lang.String str18 = utcDateTypeAdapter16.toJson(date17);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter19 = utcDateTypeAdapter16.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = dateTypeAdapter19.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = dateTypeAdapter20.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = dateTypeAdapter21.toJsonTree(date22);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter24 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date25 = null;
        java.lang.String str26 = utcDateTypeAdapter24.toJson(date25);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = utcDateTypeAdapter24.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = dateTypeAdapter28.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter28.nullSafe();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = dateTypeAdapter28.toJsonTree(date31);
        java.util.Date date33 = dateTypeAdapter21.fromJsonTree(jsonElement32);
        java.util.Date date34 = dateTypeAdapter11.fromJsonTree(jsonElement32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = date34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null" + "'", str26, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(jsonElement32);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNull(date34);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1143");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter11.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter11.toJson(date13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1144");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter5.toJson(date6);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter9.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter9.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter9.toJsonTree(date12);
        java.util.Date date14 = utcDateTypeAdapter0.fromJsonTree(jsonElement13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date16 = null;
        java.lang.String str17 = utcDateTypeAdapter0.toJson(date16);
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = utcDateTypeAdapter0.fromJson(reader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1145");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        java.util.Date date4 = utcDateTypeAdapter0.fromJson("null");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter5 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = utcDateTypeAdapter5.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter7 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date8 = null;
        java.lang.String str9 = utcDateTypeAdapter7.toJson(date8);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = utcDateTypeAdapter7.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = utcDateTypeAdapter11.toJsonTree(date15);
        java.util.Date date17 = utcDateTypeAdapter7.fromJsonTree(jsonElement16);
        java.util.Date date18 = utcDateTypeAdapter5.fromJsonTree(jsonElement16);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter19 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = utcDateTypeAdapter19.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter21 = dateTypeAdapter20.nullSafe();
        java.util.Date date22 = null;
        com.google.gson.JsonElement jsonElement23 = dateTypeAdapter21.toJsonTree(date22);
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter21.toJsonTree(date24);
        java.util.Date date26 = utcDateTypeAdapter5.fromJsonTree(jsonElement25);
        java.util.Date date27 = utcDateTypeAdapter0.fromJsonTree(jsonElement25);
        java.util.Date date29 = utcDateTypeAdapter0.fromJson("null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(dateTypeAdapter21);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNull(date29);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1146");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter8.toJsonTree(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter8.nullSafe();
        java.util.Date date16 = null;
        java.lang.String str17 = dateTypeAdapter15.toJson(date16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1147");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date15 = null;
        java.lang.String str16 = utcDateTypeAdapter14.toJson(date15);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter17 = utcDateTypeAdapter14.nullSafe();
        java.util.Date date18 = null;
        com.google.gson.JsonElement jsonElement19 = utcDateTypeAdapter14.toJsonTree(date18);
        java.util.Date date20 = utcDateTypeAdapter10.fromJsonTree(jsonElement19);
        java.util.Date date21 = dateTypeAdapter9.fromJsonTree(jsonElement19);
        java.util.Date date22 = utcDateTypeAdapter0.fromJsonTree(jsonElement19);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date24 = null;
        java.lang.String str25 = dateTypeAdapter23.toJson(date24);
        java.util.Date date26 = null;
        java.lang.String str27 = dateTypeAdapter23.toJson(date26);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter28 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter29 = utcDateTypeAdapter28.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = dateTypeAdapter29.nullSafe();
        java.util.Date date31 = null;
        com.google.gson.JsonElement jsonElement32 = dateTypeAdapter29.toJsonTree(date31);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter33 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter34 = utcDateTypeAdapter33.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter35 = dateTypeAdapter34.nullSafe();
        java.util.Date date36 = null;
        com.google.gson.JsonElement jsonElement37 = dateTypeAdapter34.toJsonTree(date36);
        java.util.Date date38 = dateTypeAdapter29.fromJsonTree(jsonElement37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = dateTypeAdapter29.nullSafe();
        java.util.Date date40 = null;
        java.lang.String str41 = dateTypeAdapter39.toJson(date40);
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = dateTypeAdapter39.toJsonTree(date42);
        java.util.Date date44 = dateTypeAdapter23.fromJsonTree(jsonElement43);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter45 = dateTypeAdapter23.nullSafe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter17);
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null" + "'", str27, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter29);
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(jsonElement32);
        org.junit.Assert.assertNotNull(dateTypeAdapter34);
        org.junit.Assert.assertNotNull(dateTypeAdapter35);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "null" + "'", str41, "null");
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(dateTypeAdapter45);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1148");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        com.google.gson.JsonElement jsonElement5 = utcDateTypeAdapter0.toJsonTree(date4);
        java.util.Date date6 = null;
        java.lang.String str7 = utcDateTypeAdapter0.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = utcDateTypeAdapter0.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter0.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = utcDateTypeAdapter0.toJsonTree(date12);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = utcDateTypeAdapter0.toJsonTree(date14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1149");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter4 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date5 = null;
        java.lang.String str6 = utcDateTypeAdapter4.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = utcDateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter7.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter10 = dateTypeAdapter8.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter11 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = utcDateTypeAdapter11.toJson(date12);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = utcDateTypeAdapter11.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter16.toJsonTree(date17);
        java.util.Date date19 = dateTypeAdapter10.fromJsonTree(jsonElement18);
        java.util.Date date20 = dateTypeAdapter3.fromJsonTree(jsonElement18);
        java.util.Date date21 = null;
        java.lang.String str22 = dateTypeAdapter3.toJson(date21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter3.nullSafe();
        java.util.Date date24 = null;
        java.lang.String str25 = dateTypeAdapter23.toJson(date24);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter23.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = dateTypeAdapter26.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(dateTypeAdapter10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null" + "'", str22, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null" + "'", str25, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1150");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        java.util.Date date2 = null;
        java.lang.String str3 = dateTypeAdapter1.toJson(date2);
        java.util.Date date4 = null;
        java.lang.String str5 = dateTypeAdapter1.toJson(date4);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = dateTypeAdapter1.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1151");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter3.nullSafe();
        java.util.Date date7 = dateTypeAdapter5.fromJson("null");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter5.nullSafe();
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = dateTypeAdapter8.toJsonTree(date9);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter11 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = dateTypeAdapter8.nullSafe();
        java.util.Date date13 = null;
        java.lang.String str14 = dateTypeAdapter8.toJson(date13);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter8.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.io.Writer writer17 = null;
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter15.toJson(writer17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter11);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1152");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateTypeAdapter1.nullSafe();
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = dateTypeAdapter1.toJsonTree(date3);
        java.util.Date date5 = null;
        java.lang.String str6 = dateTypeAdapter1.toJson(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateTypeAdapter1.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter8 = dateTypeAdapter1.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter9 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date10 = null;
        java.lang.String str11 = utcDateTypeAdapter9.toJson(date10);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter12 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter13 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date14 = null;
        java.lang.String str15 = utcDateTypeAdapter13.toJson(date14);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = utcDateTypeAdapter13.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = utcDateTypeAdapter13.toJsonTree(date17);
        java.util.Date date19 = utcDateTypeAdapter9.fromJsonTree(jsonElement18);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter20 = utcDateTypeAdapter9.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter21 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter22 = utcDateTypeAdapter21.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter22.nullSafe();
        java.util.Date date24 = null;
        com.google.gson.JsonElement jsonElement25 = dateTypeAdapter23.toJsonTree(date24);
        java.util.Date date26 = utcDateTypeAdapter9.fromJsonTree(jsonElement25);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter27 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date28 = null;
        java.lang.String str29 = utcDateTypeAdapter27.toJson(date28);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter30 = utcDateTypeAdapter27.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter31 = dateTypeAdapter30.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter30.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter32.nullSafe();
        java.util.Date date34 = null;
        java.lang.String str35 = dateTypeAdapter32.toJson(date34);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter36 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date37 = null;
        java.lang.String str38 = utcDateTypeAdapter36.toJson(date37);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter39 = utcDateTypeAdapter36.nullSafe();
        java.util.Date date40 = null;
        com.google.gson.JsonElement jsonElement41 = utcDateTypeAdapter36.toJsonTree(date40);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter42 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date43 = null;
        java.lang.String str44 = utcDateTypeAdapter42.toJson(date43);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter45 = utcDateTypeAdapter42.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter46 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date47 = null;
        java.lang.String str48 = utcDateTypeAdapter46.toJson(date47);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = utcDateTypeAdapter46.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter50 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date51 = null;
        java.lang.String str52 = utcDateTypeAdapter50.toJson(date51);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter53 = utcDateTypeAdapter50.nullSafe();
        java.util.Date date54 = null;
        com.google.gson.JsonElement jsonElement55 = utcDateTypeAdapter50.toJsonTree(date54);
        java.util.Date date56 = utcDateTypeAdapter46.fromJsonTree(jsonElement55);
        java.util.Date date57 = dateTypeAdapter45.fromJsonTree(jsonElement55);
        java.util.Date date58 = utcDateTypeAdapter36.fromJsonTree(jsonElement55);
        java.util.Date date59 = dateTypeAdapter32.fromJsonTree(jsonElement55);
        java.util.Date date60 = utcDateTypeAdapter9.fromJsonTree(jsonElement55);
        java.util.Date date61 = dateTypeAdapter8.fromJsonTree(jsonElement55);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter62 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date63 = null;
        java.lang.String str64 = utcDateTypeAdapter62.toJson(date63);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter65 = utcDateTypeAdapter62.nullSafe();
        java.util.Date date66 = null;
        com.google.gson.JsonElement jsonElement67 = utcDateTypeAdapter62.toJsonTree(date66);
        java.util.Date date68 = null;
        java.lang.String str69 = utcDateTypeAdapter62.toJson(date68);
        java.util.Date date70 = null;
        com.google.gson.JsonElement jsonElement71 = utcDateTypeAdapter62.toJsonTree(date70);
        java.util.Date date72 = null;
        com.google.gson.JsonElement jsonElement73 = utcDateTypeAdapter62.toJsonTree(date72);
        java.util.Date date74 = null;
        java.lang.String str75 = utcDateTypeAdapter62.toJson(date74);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter76 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date77 = null;
        java.lang.String str78 = utcDateTypeAdapter76.toJson(date77);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter79 = utcDateTypeAdapter76.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter80 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date81 = null;
        java.lang.String str82 = utcDateTypeAdapter80.toJson(date81);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter83 = utcDateTypeAdapter80.nullSafe();
        java.util.Date date84 = null;
        com.google.gson.JsonElement jsonElement85 = utcDateTypeAdapter80.toJsonTree(date84);
        java.util.Date date86 = utcDateTypeAdapter76.fromJsonTree(jsonElement85);
        java.util.Date date87 = utcDateTypeAdapter62.fromJsonTree(jsonElement85);
        java.util.Date date88 = dateTypeAdapter8.fromJsonTree(jsonElement85);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date90 = dateTypeAdapter8.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(dateTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(dateTypeAdapter20);
        org.junit.Assert.assertNotNull(dateTypeAdapter22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null" + "'", str29, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter30);
        org.junit.Assert.assertNotNull(dateTypeAdapter31);
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null" + "'", str35, "null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null" + "'", str38, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter39);
        org.junit.Assert.assertNotNull(jsonElement41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "null" + "'", str44, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "null" + "'", str48, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "null" + "'", str52, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter53);
        org.junit.Assert.assertNotNull(jsonElement55);
        org.junit.Assert.assertNull(date56);
        org.junit.Assert.assertNull(date57);
        org.junit.Assert.assertNull(date58);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "null" + "'", str64, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter65);
        org.junit.Assert.assertNotNull(jsonElement67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "null" + "'", str69, "null");
        org.junit.Assert.assertNotNull(jsonElement71);
        org.junit.Assert.assertNotNull(jsonElement73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "null" + "'", str75, "null");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "null" + "'", str78, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter79);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "null" + "'", str82, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter83);
        org.junit.Assert.assertNotNull(jsonElement85);
        org.junit.Assert.assertNull(date86);
        org.junit.Assert.assertNull(date87);
        org.junit.Assert.assertNull(date88);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1153");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = utcDateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter4.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateTypeAdapter6.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter10 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date11 = null;
        java.lang.String str12 = utcDateTypeAdapter10.toJson(date11);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter13 = utcDateTypeAdapter10.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter14 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = dateTypeAdapter13.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        java.lang.String str18 = dateTypeAdapter15.toJson(date17);
        java.util.Date date20 = dateTypeAdapter15.fromJson("null");
        java.util.Date date21 = null;
        com.google.gson.JsonElement jsonElement22 = dateTypeAdapter15.toJsonTree(date21);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter23 = dateTypeAdapter15.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter24 = dateTypeAdapter23.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter25 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = utcDateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter26.nullSafe();
        java.util.Date date28 = null;
        com.google.gson.JsonElement jsonElement29 = dateTypeAdapter26.toJsonTree(date28);
        java.util.Date date30 = null;
        java.lang.String str31 = dateTypeAdapter26.toJson(date30);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = dateTypeAdapter26.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter26.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter34 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date35 = null;
        java.lang.String str36 = utcDateTypeAdapter34.toJson(date35);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = utcDateTypeAdapter34.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter38 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date39 = null;
        java.lang.String str40 = utcDateTypeAdapter38.toJson(date39);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter41 = utcDateTypeAdapter38.nullSafe();
        java.util.Date date42 = null;
        com.google.gson.JsonElement jsonElement43 = utcDateTypeAdapter38.toJsonTree(date42);
        java.util.Date date44 = utcDateTypeAdapter34.fromJsonTree(jsonElement43);
        java.util.Date date45 = null;
        com.google.gson.JsonElement jsonElement46 = utcDateTypeAdapter34.toJsonTree(date45);
        java.util.Date date47 = dateTypeAdapter33.fromJsonTree(jsonElement46);
        java.util.Date date48 = dateTypeAdapter24.fromJsonTree(jsonElement46);
        java.util.Date date49 = dateTypeAdapter6.fromJsonTree(jsonElement46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(dateTypeAdapter14);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(jsonElement22);
        org.junit.Assert.assertNotNull(dateTypeAdapter23);
        org.junit.Assert.assertNotNull(dateTypeAdapter24);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(jsonElement29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null" + "'", str36, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "null" + "'", str40, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter41);
        org.junit.Assert.assertNotNull(jsonElement43);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(jsonElement46);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertNull(date48);
        org.junit.Assert.assertNull(date49);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_016_Regression2.test1154");
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter0 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter1 = utcDateTypeAdapter0.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter2 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date3 = null;
        java.lang.String str4 = utcDateTypeAdapter2.toJson(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = utcDateTypeAdapter2.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter6 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date7 = null;
        java.lang.String str8 = utcDateTypeAdapter6.toJson(date7);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = utcDateTypeAdapter6.nullSafe();
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = utcDateTypeAdapter6.toJsonTree(date10);
        java.util.Date date12 = utcDateTypeAdapter2.fromJsonTree(jsonElement11);
        java.util.Date date13 = utcDateTypeAdapter0.fromJsonTree(jsonElement11);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter14 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter15 = utcDateTypeAdapter14.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter16 = dateTypeAdapter15.nullSafe();
        java.util.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = dateTypeAdapter15.toJsonTree(date17);
        java.util.Date date19 = utcDateTypeAdapter0.fromJsonTree(jsonElement18);
        java.util.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = utcDateTypeAdapter0.toJsonTree(date20);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter22 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date23 = null;
        java.lang.String str24 = utcDateTypeAdapter22.toJson(date23);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter25 = utcDateTypeAdapter22.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter26 = dateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter27 = dateTypeAdapter25.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter28 = dateTypeAdapter27.nullSafe();
        java.util.Date date29 = null;
        java.lang.String str30 = dateTypeAdapter27.toJson(date29);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter31 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter32 = utcDateTypeAdapter31.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter33 = dateTypeAdapter32.nullSafe();
        java.util.Date date34 = null;
        com.google.gson.JsonElement jsonElement35 = dateTypeAdapter32.toJsonTree(date34);
        java.util.Date date36 = dateTypeAdapter27.fromJsonTree(jsonElement35);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter37 = dateTypeAdapter27.nullSafe();
        java.util.Date date38 = null;
        java.lang.String str39 = dateTypeAdapter37.toJson(date38);
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter40 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date41 = null;
        java.lang.String str42 = utcDateTypeAdapter40.toJson(date41);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter43 = utcDateTypeAdapter40.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter44 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date45 = null;
        java.lang.String str46 = utcDateTypeAdapter44.toJson(date45);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter47 = utcDateTypeAdapter44.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter48 = dateTypeAdapter47.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter49 = dateTypeAdapter48.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter50 = dateTypeAdapter48.nullSafe();
        com.google.gson.typeadapters.UtcDateTypeAdapter utcDateTypeAdapter51 = new com.google.gson.typeadapters.UtcDateTypeAdapter();
        java.util.Date date52 = null;
        java.lang.String str53 = utcDateTypeAdapter51.toJson(date52);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter54 = utcDateTypeAdapter51.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter55 = dateTypeAdapter54.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter56 = dateTypeAdapter55.nullSafe();
        java.util.Date date57 = null;
        com.google.gson.JsonElement jsonElement58 = dateTypeAdapter56.toJsonTree(date57);
        java.util.Date date59 = dateTypeAdapter50.fromJsonTree(jsonElement58);
        java.util.Date date60 = dateTypeAdapter43.fromJsonTree(jsonElement58);
        java.util.Date date61 = dateTypeAdapter37.fromJsonTree(jsonElement58);
        java.util.Date date62 = null;
        com.google.gson.JsonElement jsonElement63 = dateTypeAdapter37.toJsonTree(date62);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter64 = dateTypeAdapter37.nullSafe();
        java.util.Date date65 = null;
        com.google.gson.JsonElement jsonElement66 = dateTypeAdapter64.toJsonTree(date65);
        java.util.Date date67 = utcDateTypeAdapter0.fromJsonTree(jsonElement66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date69 = utcDateTypeAdapter0.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(dateTypeAdapter15);
        org.junit.Assert.assertNotNull(dateTypeAdapter16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter25);
        org.junit.Assert.assertNotNull(dateTypeAdapter26);
        org.junit.Assert.assertNotNull(dateTypeAdapter27);
        org.junit.Assert.assertNotNull(dateTypeAdapter28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter32);
        org.junit.Assert.assertNotNull(dateTypeAdapter33);
        org.junit.Assert.assertNotNull(jsonElement35);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNotNull(dateTypeAdapter37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null" + "'", str39, "null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "null" + "'", str42, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "null" + "'", str46, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter47);
        org.junit.Assert.assertNotNull(dateTypeAdapter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter49);
        org.junit.Assert.assertNotNull(dateTypeAdapter50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null" + "'", str53, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter54);
        org.junit.Assert.assertNotNull(dateTypeAdapter55);
        org.junit.Assert.assertNotNull(dateTypeAdapter56);
        org.junit.Assert.assertNotNull(jsonElement58);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertNull(date61);
        org.junit.Assert.assertNotNull(jsonElement63);
        org.junit.Assert.assertNotNull(dateTypeAdapter64);
        org.junit.Assert.assertNotNull(jsonElement66);
        org.junit.Assert.assertNull(date67);
    }
}

