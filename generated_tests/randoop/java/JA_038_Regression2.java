import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_038_Regression2 {

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
            System.out.format("%n%s%n", "JA_038_Regression2.test1001");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.lang.String str5 = attributes4.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes4.asList();
        org.jsoup.nodes.Attributes attributes9 = attributes4.put("", false);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange13 = attributes11.sourceRange("hi!");
        boolean boolean15 = attributes11.hasKeyIgnoreCase("");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes4.userData("hi!", (java.lang.Object) boolean17);
        attributes4.normalize();
        org.jsoup.nodes.Attribute attribute21 = attributes4.attribute(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes24 = attributes4.put(" hi!=\"hi!\"", true);
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        java.lang.String str26 = attributes25.html();
        org.jsoup.nodes.Attributes attributes29 = attributes25.put("hi!", false);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange33 = attributes31.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes34 = attributes29.sourceRange("", attributeRange33);
        org.jsoup.nodes.Attributes attributes35 = attributes34.clone();
        org.jsoup.nodes.Attributes attributes38 = attributes35.add("", "");
        attributes35.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.lang.String str42 = attributes41.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList43 = attributes41.asList();
        org.jsoup.nodes.Attributes attributes46 = attributes41.put("", false);
        org.jsoup.nodes.Attributes attributes49 = attributes41.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange53 = attributes51.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes54 = attributes41.sourceRange("hi!", attributeRange53);
        org.jsoup.nodes.Attribute attribute56 = attributes54.attribute("hi!");
        org.jsoup.nodes.Attributes attributes57 = attributes35.put(attribute56);
        org.jsoup.nodes.Attributes attributes58 = attributes4.put(attribute56);
        org.jsoup.nodes.Attributes attributes59 = attributes0.put(attribute56);
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeRange13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(attribute21);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributeRange33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributeList43);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(attributeRange53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(attribute56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(attributes59);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1002");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.lang.String str7 = attributes6.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes6.asList();
        org.jsoup.nodes.Attributes attributes9 = attributes0.userData("", (java.lang.Object) attributeList8);
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("", false);
        org.jsoup.nodes.Attributes attributes15 = attributes9.put("", true);
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        int int19 = attributes17.deduplicate(parseSettings18);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange22 = attributes20.sourceRange("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        int int26 = attributes20.deduplicate(parseSettings25);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange32 = attributes28.sourceRange("");
        org.jsoup.nodes.Attributes attributes33 = attributes20.sourceRange("", attributeRange32);
        attributes17.addAll(attributes20);
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        int int36 = attributes20.deduplicate(parseSettings35);
        attributes20.remove("hi!");
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        int int41 = attributes39.deduplicate(parseSettings40);
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange44 = attributes42.sourceRange("hi!");
        boolean boolean46 = attributes42.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        int int48 = attributes42.deduplicate(parseSettings47);
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        boolean boolean52 = attributes50.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange54 = attributes50.sourceRange("");
        org.jsoup.nodes.Attributes attributes55 = attributes42.sourceRange("", attributeRange54);
        attributes39.addAll(attributes42);
        org.jsoup.nodes.Attributes attributes57 = new org.jsoup.nodes.Attributes();
        boolean boolean59 = attributes57.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator60 = attributes57.spliterator();
        attributes42.addAll(attributes57);
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        java.lang.String str63 = attributes62.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList64 = attributes62.asList();
        java.lang.String str66 = attributes62.getIgnoreCase("hi!");
        java.lang.String str68 = attributes62.get("hi!");
        attributes42.addAll(attributes62);
        org.jsoup.nodes.Attributes attributes70 = attributes62.clone();
        org.jsoup.nodes.Attributes attributes71 = new org.jsoup.nodes.Attributes();
        java.lang.String str72 = attributes71.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList73 = attributes71.asList();
        org.jsoup.nodes.Attributes attributes76 = attributes71.put("", false);
        org.jsoup.nodes.Attributes attributes79 = attributes71.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes81 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange83 = attributes81.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes84 = attributes71.sourceRange("hi!", attributeRange83);
        java.lang.String str85 = attributes71.html();
        attributes70.addAll(attributes71);
        boolean boolean87 = attributes20.equals((java.lang.Object) attributes71);
        org.jsoup.nodes.Attributes attributes88 = attributes15.userData(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", (java.lang.Object) boolean87);
        java.lang.String str89 = attributes88.html();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributeRange22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeRange32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(attributeRange44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributeRange54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(attributeList64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(attributeList73);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(attributeRange83);
        org.junit.Assert.assertNotNull(attributes84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + " hi!=\"hi!\"" + "'", str85, " hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1003");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes18.spliterator();
        attributes3.addAll(attributes18);
        org.jsoup.nodes.Attributes attributes25 = attributes3.put("", true);
        attributes25.removeIgnoreCase("");
        org.jsoup.nodes.Attributes attributes30 = attributes25.add(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", " hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes33 = attributes25.put(" hi!=\"hi!\" _hi!_hi!_=\"hi!\"", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1004");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.add("", "hi!");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        int int7 = attributes5.deduplicate(parseSettings6);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange10 = attributes8.sourceRange("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        int int14 = attributes8.deduplicate(parseSettings13);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange20 = attributes16.sourceRange("");
        org.jsoup.nodes.Attributes attributes21 = attributes8.sourceRange("", attributeRange20);
        attributes5.addAll(attributes8);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        boolean boolean25 = attributes23.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator26 = attributes23.spliterator();
        attributes8.addAll(attributes23);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.lang.String str29 = attributes28.html();
        org.jsoup.nodes.Attributes attributes32 = attributes28.put("hi!", false);
        attributes28.remove("");
        org.jsoup.nodes.Attributes attributes37 = attributes28.put("", "hi!");
        java.lang.String str38 = attributes28.toString();
        boolean boolean40 = attributes28.hasDeclaredValueForKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.lang.String str42 = attributes41.html();
        org.jsoup.nodes.Attributes attributes45 = attributes41.put("hi!", false);
        org.jsoup.nodes.Attributes attributes48 = attributes41.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator49 = attributes48.spliterator();
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        boolean boolean52 = attributes50.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange54 = attributes50.sourceRange("");
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        attributes50.addAll(attributes55);
        attributes48.addAll(attributes50);
        org.jsoup.nodes.Attributes attributes58 = new org.jsoup.nodes.Attributes();
        java.lang.String str59 = attributes58.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes58.asList();
        org.jsoup.nodes.Attributes attributes63 = attributes58.put("", false);
        org.jsoup.nodes.Attributes attributes66 = attributes58.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange70 = attributes68.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes71 = attributes58.sourceRange("hi!", attributeRange70);
        org.jsoup.nodes.Attribute attribute73 = attributes71.attribute("hi!");
        org.jsoup.nodes.Attributes attributes74 = attributes48.put(attribute73);
        org.jsoup.nodes.Attributes attributes75 = attributes28.put(attribute73);
        org.jsoup.nodes.Attributes attributes76 = attributes23.put(attribute73);
        org.jsoup.nodes.Attributes attributes77 = attributes4.put(attribute73);
        boolean boolean79 = attributes77.hasDeclaredValueForKeyIgnoreCase(" hi!=\"hi!\"");
        attributes77.removeIgnoreCase(" hi!=\"hi!\" _hi!_hi!__hi!_hi!__hi!_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributeRange10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeRange20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(attributeSpliterator49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(attributeRange54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(attributeList60);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(attributeRange70);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(attribute73);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1005");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes8 = attributes0.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes10.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("hi!", attributeRange12);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.lang.String str15 = attributes14.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes14.asList();
        org.jsoup.nodes.Attributes attributes19 = attributes14.put("", false);
        org.jsoup.nodes.Attributes attributes22 = attributes14.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange26 = attributes24.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes27 = attributes14.sourceRange("hi!", attributeRange26);
        org.jsoup.nodes.Attribute attribute29 = attributes27.attribute("hi!");
        org.jsoup.nodes.Attributes attributes30 = attributes13.put(attribute29);
        org.jsoup.nodes.Attribute attribute32 = attributes30.attribute("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributes30.spliterator();
        org.jsoup.nodes.Range.AttributeRange attributeRange35 = attributes30.sourceRange(" hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributeRange26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNull(attribute32);
        org.junit.Assert.assertNotNull(attributeSpliterator33);
        org.junit.Assert.assertNotNull(attributeRange35);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1006");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.lang.String str7 = attributes6.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes6.asList();
        org.jsoup.nodes.Attributes attributes11 = attributes6.put("", false);
        org.jsoup.nodes.Attribute attribute13 = attributes11.attribute("hi!");
        boolean boolean15 = attributes11.hasKeyIgnoreCase("");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("");
        attributes0.addAll(attributes11);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.lang.String str20 = attributes19.html();
        org.jsoup.nodes.Attributes attributes23 = attributes19.put("hi!", false);
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange27 = attributes25.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes28 = attributes23.sourceRange("", attributeRange27);
        org.jsoup.nodes.Attributes attributes31 = attributes23.put("hi!", "");
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        java.lang.String str34 = attributes33.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList35 = attributes33.asList();
        java.lang.String str37 = attributes33.getIgnoreCase("hi!");
        java.lang.String str39 = attributes33.get("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange41 = attributes33.sourceRange("");
        org.jsoup.nodes.Attributes attributes44 = attributes33.put(" hi!=\"hi!\"", false);
        attributes33.normalize();
        org.jsoup.nodes.Attributes attributes46 = attributes23.userData(" hi!=\"hi!\"", (java.lang.Object) attributes33);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        java.lang.String str48 = attributes47.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList49 = attributes47.asList();
        org.jsoup.nodes.Attributes attributes52 = attributes47.put("", false);
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange56 = attributes54.sourceRange("hi!");
        boolean boolean58 = attributes54.hasKeyIgnoreCase("");
        boolean boolean60 = attributes54.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes61 = attributes47.userData("hi!", (java.lang.Object) boolean60);
        org.jsoup.nodes.Attributes attributes62 = new org.jsoup.nodes.Attributes();
        java.lang.String str63 = attributes62.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList64 = attributes62.asList();
        org.jsoup.nodes.Attributes attributes67 = attributes62.put("", false);
        org.jsoup.nodes.Attributes attributes70 = attributes62.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes72 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange74 = attributes72.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes75 = attributes62.sourceRange("hi!", attributeRange74);
        org.jsoup.nodes.Attributes attributes76 = new org.jsoup.nodes.Attributes();
        java.lang.String str77 = attributes76.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList78 = attributes76.asList();
        org.jsoup.nodes.Attributes attributes81 = attributes76.put("", false);
        org.jsoup.nodes.Attributes attributes84 = attributes76.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes86 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange88 = attributes86.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes89 = attributes76.sourceRange("hi!", attributeRange88);
        org.jsoup.nodes.Attribute attribute91 = attributes89.attribute("hi!");
        org.jsoup.nodes.Attributes attributes92 = attributes75.put(attribute91);
        org.jsoup.nodes.Attributes attributes93 = attributes47.put(attribute91);
        org.jsoup.nodes.Attributes attributes94 = attributes46.put(attribute91);
        org.jsoup.nodes.Attributes attributes95 = attributes0.put(attribute91);
        org.jsoup.parser.ParseSettings parseSettings96 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int97 = attributes95.deduplicate(parseSettings96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.ParseSettings.preserveAttributeCase()\" because \"settings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeRange27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributeList35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeRange41);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(attributeList49);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(attributeRange56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(attributeList64);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(attributeRange74);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(attributeList78);
        org.junit.Assert.assertNotNull(attributes81);
        org.junit.Assert.assertNotNull(attributes84);
        org.junit.Assert.assertNotNull(attributeRange88);
        org.junit.Assert.assertNotNull(attributes89);
        org.junit.Assert.assertNotNull(attribute91);
        org.junit.Assert.assertNotNull(attributes92);
        org.junit.Assert.assertNotNull(attributes93);
        org.junit.Assert.assertNotNull(attributes94);
        org.junit.Assert.assertNotNull(attributes95);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1007");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes10 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes10.add("", "");
        attributes10.removeIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes10.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes10.spliterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1008");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes9 = attributes4.userData("hi!", (java.lang.Object) "");
        java.lang.String str11 = attributes4.get("hi!");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.lang.String str14 = attributes13.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes13.asList();
        org.jsoup.nodes.Attributes attributes18 = attributes13.put("", false);
        org.jsoup.nodes.Attributes attributes21 = attributes13.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes4.userData("hi!", (java.lang.Object) attributes21);
        boolean boolean23 = attributes22.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1009");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.lang.String str17 = attributes16.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes16.asList();
        org.jsoup.nodes.Attributes attributes21 = attributes16.put("", false);
        org.jsoup.nodes.Attribute attribute23 = attributes21.attribute("hi!");
        boolean boolean25 = attributes21.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        int int27 = attributes21.deduplicate(parseSettings26);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange31 = attributes29.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes32 = attributes21.sourceRange("", attributeRange31);
        org.jsoup.nodes.Attributes attributes33 = attributes13.sourceRange("", attributeRange31);
        org.jsoup.nodes.Attributes attributes36 = attributes13.put(" hi!=\"hi!\"", "hi!");
        java.lang.String str37 = attributes36.html();
        java.lang.String str38 = attributes36.toString();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(attribute23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributeRange31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " _hi!_hi!_=\"hi!\"" + "'", str37, " _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " _hi!_hi!_=\"hi!\"" + "'", str38, " _hi!_hi!_=\"hi!\"");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1010");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        boolean boolean7 = attributes0.hasKey("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1011");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        java.lang.String str5 = attributes4.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes4.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes4.iterator();
        java.lang.Object obj9 = attributes4.userData("");
        java.lang.String str10 = attributes4.html();
        boolean boolean12 = attributes4.hasDeclaredValueForKeyIgnoreCase(" hi!=\"hi!\" __hi!_hi!_hi!_hi!_&quot;hi!&quot;_=\" hi!=&quot;hi!&quot; hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1012");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        boolean boolean11 = attributes4.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes4.asList();
        org.jsoup.nodes.Range.AttributeRange attributeRange14 = attributes4.sourceRange("");
        attributes4.removeIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(attributeRange14);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1013");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        attributes9.normalize();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.lang.String str13 = attributes12.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes12.asList();
        org.jsoup.nodes.Attributes attributes17 = attributes12.put("", false);
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes12.asList();
        attributes9.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.lang.String str21 = attributes20.html();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        int int23 = attributes20.deduplicate(parseSettings22);
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        int int25 = attributes20.deduplicate(parseSettings24);
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.lang.String str28 = attributes27.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes27.asList();
        java.lang.String str31 = attributes27.getIgnoreCase("hi!");
        java.lang.String str33 = attributes27.get("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange35 = attributes27.sourceRange("");
        org.jsoup.nodes.Attributes attributes36 = attributes20.sourceRange("", attributeRange35);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.lang.String str38 = attributes37.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList39 = attributes37.asList();
        boolean boolean41 = attributes37.hasDeclaredValueForKeyIgnoreCase("");
        attributes37.remove("hi!");
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        boolean boolean46 = attributes44.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        java.lang.String str48 = attributes47.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList49 = attributes47.asList();
        org.jsoup.nodes.Attributes attributes52 = attributes47.put("", false);
        org.jsoup.nodes.Attributes attributes55 = attributes47.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes57 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange59 = attributes57.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes60 = attributes47.sourceRange("hi!", attributeRange59);
        org.jsoup.nodes.Attribute attribute62 = attributes60.attribute("hi!");
        org.jsoup.nodes.Attributes attributes63 = attributes44.put(attribute62);
        org.jsoup.nodes.Attributes attributes64 = attributes37.put(attribute62);
        org.jsoup.nodes.Attributes attributes65 = attributes36.put(attribute62);
        boolean boolean67 = attributes65.hasDeclaredValueForKey(" _hi!_hi!_=\"hi!\"");
        java.util.Map<java.lang.String, java.lang.String> strMap68 = attributes65.dataset();
        boolean boolean69 = attributes9.equals((java.lang.Object) strMap68);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributeRange35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(attributeList49);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(attributeRange59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(attribute62);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1014");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        int int3 = attributes0.size();
        org.jsoup.nodes.Attribute attribute5 = attributes0.attribute(" hi!=\"hi!\" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(attribute5);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1015");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange4 = attributes0.sourceRange(" hi!=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass6 = attributeSpliterator5.getClass();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertNotNull(attributeRange4);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1016");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.lang.String str4 = attributes3.html();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes3.deduplicate(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        int int8 = attributes3.deduplicate(parseSettings7);
        java.lang.String str10 = attributes3.get("hi!");
        org.jsoup.nodes.Attributes attributes11 = attributes0.userData("hi!", (java.lang.Object) str10);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes11.spliterator();
        org.jsoup.nodes.Attributes attributes15 = attributes11.put(" hi!=\"\"", " _hi!_hi!_=\"hi!\"");
        org.jsoup.nodes.Attributes attributes18 = attributes11.put("hi!", true);
        int int19 = attributes18.size();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1017");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes0.dataset();
        attributes0.normalize();
        int int16 = attributes0.size();
        int int17 = attributes0.size();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1018");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        java.lang.String str7 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes10 = attributes0.add("hi!", "");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.lang.String str12 = attributes11.html();
        org.jsoup.nodes.Attributes attributes15 = attributes11.put("hi!", false);
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange19 = attributes17.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes15.sourceRange("", attributeRange19);
        org.jsoup.nodes.Attributes attributes23 = attributes20.put("hi!", "");
        attributes0.addAll(attributes23);
        org.jsoup.nodes.Attributes attributes25 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes23.addAll(attributes25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.nodes.Attributes.size()\" because \"incoming\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeRange19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1019");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes8 = attributes0.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes11 = attributes0.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes14 = attributes0.put("hi!", " hi!=\"hi!\"");
        int int15 = attributes0.size();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" _hi!_hi!_=\"hi!\"");
        java.lang.String str18 = attributes0.html();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " hi!=\" hi!=&quot;hi!&quot;\" hi!=\"hi!\"" + "'", str18, " hi!=\" hi!=&quot;hi!&quot;\" hi!=\"hi!\"");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1020");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.lang.String str8 = attributes7.html();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("hi!", false);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes13.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes16 = attributes11.sourceRange("", attributeRange15);
        org.jsoup.nodes.Attributes attributes17 = attributes16.clone();
        org.jsoup.nodes.Attributes attributes20 = attributes17.add("", "");
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange24 = attributes22.sourceRange("hi!");
        boolean boolean26 = attributes22.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        int int28 = attributes22.deduplicate(parseSettings27);
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        boolean boolean32 = attributes30.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange34 = attributes30.sourceRange("");
        org.jsoup.nodes.Attributes attributes35 = attributes22.sourceRange("", attributeRange34);
        org.jsoup.nodes.Attributes attributes36 = attributes17.sourceRange("", attributeRange34);
        org.jsoup.nodes.Attributes attributes37 = attributes0.sourceRange(" hi!=\"\"", attributeRange34);
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        int int39 = attributes37.deduplicate(parseSettings38);
        org.jsoup.nodes.Attributes attributes40 = attributes37.clone();
        org.jsoup.nodes.Attributes attributes43 = attributes40.put(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", "");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributeRange24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributeRange34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributes43);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1021");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes10 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes10.add("", "");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange17 = attributes15.sourceRange("hi!");
        boolean boolean19 = attributes15.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        int int21 = attributes15.deduplicate(parseSettings20);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        boolean boolean25 = attributes23.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange27 = attributes23.sourceRange("");
        org.jsoup.nodes.Attributes attributes28 = attributes15.sourceRange("", attributeRange27);
        org.jsoup.nodes.Attributes attributes29 = attributes10.sourceRange("", attributeRange27);
        boolean boolean31 = attributes29.hasDeclaredValueForKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes34 = attributes29.put("", false);
        java.lang.String str36 = attributes34.getIgnoreCase(" _hi!_hi!_=\"hi!\"");
        org.jsoup.nodes.Attributes attributes39 = attributes34.put(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes34.iterator();
        java.lang.String str41 = attributes34.toString();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        java.lang.String str43 = attributes42.html();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        int int45 = attributes42.deduplicate(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        int int47 = attributes42.deduplicate(parseSettings46);
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        java.lang.String str50 = attributes49.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList51 = attributes49.asList();
        java.lang.String str53 = attributes49.getIgnoreCase("hi!");
        java.lang.String str55 = attributes49.get("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange57 = attributes49.sourceRange("");
        org.jsoup.nodes.Attributes attributes58 = attributes42.sourceRange("", attributeRange57);
        org.jsoup.nodes.Attributes attributes59 = new org.jsoup.nodes.Attributes();
        java.lang.String str60 = attributes59.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList61 = attributes59.asList();
        boolean boolean63 = attributes59.hasDeclaredValueForKeyIgnoreCase("");
        attributes59.remove("hi!");
        org.jsoup.nodes.Attributes attributes66 = new org.jsoup.nodes.Attributes();
        boolean boolean68 = attributes66.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes69 = new org.jsoup.nodes.Attributes();
        java.lang.String str70 = attributes69.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList71 = attributes69.asList();
        org.jsoup.nodes.Attributes attributes74 = attributes69.put("", false);
        org.jsoup.nodes.Attributes attributes77 = attributes69.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes79 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange81 = attributes79.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes82 = attributes69.sourceRange("hi!", attributeRange81);
        org.jsoup.nodes.Attribute attribute84 = attributes82.attribute("hi!");
        org.jsoup.nodes.Attributes attributes85 = attributes66.put(attribute84);
        org.jsoup.nodes.Attributes attributes86 = attributes59.put(attribute84);
        org.jsoup.nodes.Attributes attributes87 = attributes58.put(attribute84);
        boolean boolean89 = attributes87.hasDeclaredValueForKey(" _hi!_hi!_=\"hi!\"");
        org.jsoup.nodes.Range.AttributeRange attributeRange91 = attributes87.sourceRange("");
        boolean boolean92 = attributes34.equals((java.lang.Object) "");
        java.lang.String str93 = attributes34.html();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeRange17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeRange27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " _hi!_hi!_hi!_hi!_&quot;hi!&quot;_" + "'", str41, " _hi!_hi!_hi!_hi!_&quot;hi!&quot;_");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributeList51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(attributeRange57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(attributeList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(attributeList71);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertNotNull(attributeRange81);
        org.junit.Assert.assertNotNull(attributes82);
        org.junit.Assert.assertNotNull(attribute84);
        org.junit.Assert.assertNotNull(attributes85);
        org.junit.Assert.assertNotNull(attributes86);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(attributeRange91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + " _hi!_hi!_hi!_hi!_&quot;hi!&quot;_" + "'", str93, " _hi!_hi!_hi!_hi!_&quot;hi!&quot;_");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1022");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attribute attribute7 = attributes5.attribute("hi!");
        boolean boolean9 = attributes5.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        int int11 = attributes5.deduplicate(parseSettings10);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes13.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes16 = attributes5.sourceRange("", attributeRange15);
        java.lang.String str17 = attributes5.toString();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        boolean boolean21 = attributes19.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.lang.String str23 = attributes22.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes22.asList();
        org.jsoup.nodes.Attributes attributes27 = attributes22.put("", false);
        org.jsoup.nodes.Attributes attributes30 = attributes22.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange34 = attributes32.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes35 = attributes22.sourceRange("hi!", attributeRange34);
        org.jsoup.nodes.Attribute attribute37 = attributes35.attribute("hi!");
        org.jsoup.nodes.Attributes attributes38 = attributes19.put(attribute37);
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.lang.String str41 = attributes40.html();
        org.jsoup.nodes.Attributes attributes44 = attributes40.put("hi!", false);
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange48 = attributes46.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes49 = attributes44.sourceRange("", attributeRange48);
        boolean boolean51 = attributes44.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes44.asList();
        org.jsoup.nodes.Attributes attributes53 = attributes19.userData(" hi!=\"hi!\"", (java.lang.Object) attributes44);
        org.jsoup.nodes.Attributes attributes54 = attributes5.userData("", (java.lang.Object) attributes44);
        org.jsoup.nodes.Attributes attributes57 = attributes44.put(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", false);
        java.lang.String str59 = attributes44.getIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeRange34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attribute37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributeRange48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1023");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.lang.String str7 = attributes6.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList8 = attributes6.asList();
        org.jsoup.nodes.Attributes attributes9 = attributes0.userData("", (java.lang.Object) attributeList8);
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("", false);
        boolean boolean14 = attributes9.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes9.iterator();
        java.lang.String str16 = attributes9.html();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1024");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes13.sourceRange("hi!");
        boolean boolean17 = attributes13.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        int int19 = attributes13.deduplicate(parseSettings18);
        org.jsoup.nodes.Attribute attribute21 = attributes13.attribute("hi!");
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        int int23 = attributes13.deduplicate(parseSettings22);
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        int int25 = attributes13.deduplicate(parseSettings24);
        org.jsoup.nodes.Range.AttributeRange attributeRange27 = attributes13.sourceRange(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        int int30 = attributes28.deduplicate(parseSettings29);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange33 = attributes31.sourceRange("hi!");
        boolean boolean35 = attributes31.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        int int37 = attributes31.deduplicate(parseSettings36);
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        boolean boolean41 = attributes39.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange43 = attributes39.sourceRange("");
        org.jsoup.nodes.Attributes attributes44 = attributes31.sourceRange("", attributeRange43);
        attributes28.addAll(attributes31);
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        boolean boolean48 = attributes46.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator49 = attributes46.spliterator();
        attributes31.addAll(attributes46);
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        java.lang.String str52 = attributes51.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList53 = attributes51.asList();
        java.lang.String str55 = attributes51.getIgnoreCase("hi!");
        java.lang.String str57 = attributes51.get("hi!");
        attributes31.addAll(attributes51);
        attributes51.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap61 = attributes51.dataset();
        org.jsoup.nodes.Attribute attribute63 = attributes51.attribute("");
        boolean boolean64 = attributes13.equals((java.lang.Object) attribute63);
        attributes9.addAll(attributes13);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor66 = attributes13.iterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(attribute21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(attributeRange27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(attributeRange33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributeRange43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(attributeList53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNull(attribute63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(attributeItor66);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1025");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange9 = attributes7.sourceRange("hi!");
        boolean boolean11 = attributes7.hasKeyIgnoreCase("");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = attributes0.userData("hi!", (java.lang.Object) boolean13);
        attributes14.remove("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes14.add(" hi!=\"hi!\"", " hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes22 = attributes14.put(" hi!=\"hi!\" _hi!_hi!_=\"hi!\"", true);
        attributes22.removeIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeRange9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1026");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        java.lang.String str4 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute6 = attributes0.attribute("hi!");
        boolean boolean8 = attributes0.hasKey(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.lang.String str10 = attributes9.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes9.asList();
        java.lang.String str13 = attributes9.getIgnoreCase("hi!");
        java.lang.String str15 = attributes9.get("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange17 = attributes9.sourceRange("");
        org.jsoup.nodes.Attributes attributes20 = attributes9.put(" hi!=\"hi!\"", false);
        java.lang.String str21 = attributes9.toString();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.lang.String str23 = attributes22.html();
        org.jsoup.nodes.Attributes attributes26 = attributes22.put("hi!", false);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange30 = attributes28.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes31 = attributes26.sourceRange("", attributeRange30);
        boolean boolean32 = attributes31.isEmpty();
        attributes31.remove("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator35 = attributes31.spliterator();
        boolean boolean36 = attributes9.equals((java.lang.Object) attributeSpliterator35);
        boolean boolean37 = attributes0.equals((java.lang.Object) attributeSpliterator35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeRange17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributeRange30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(attributeSpliterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1027");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        attributes9.normalize();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes9.iterator();
        org.jsoup.nodes.Attributes attributes15 = attributes9.put("", " _hi!_hi!_hi!_hi!_&quot;hi!&quot;_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1028");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attribute attribute8 = attributes0.attribute("hi!");
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        int int10 = attributes0.deduplicate(parseSettings9);
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        int int12 = attributes0.deduplicate(parseSettings11);
        java.lang.String str14 = attributes0.getIgnoreCase(" _hi!_=\" _hi!_hi!_=&quot;hi!&quot;\" hi!");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(attribute8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1029");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        java.lang.String str5 = attributes4.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes4.asList();
        java.lang.Class<?> wildcardClass7 = attributes4.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1030");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange13 = attributes9.sourceRange("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes9.addAll(attributes14);
        attributes7.addAll(attributes9);
        java.lang.String str18 = attributes7.get("");
        org.jsoup.nodes.Attributes attributes21 = attributes7.put("hi!", false);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.html();
        org.jsoup.nodes.Attributes attributes27 = attributes23.put("hi!", false);
        org.jsoup.nodes.Attributes attributes30 = attributes23.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        boolean boolean33 = attributes30.hasDeclaredValueForKey("");
        java.lang.String str35 = attributes30.get("");
        org.jsoup.nodes.Attributes attributes36 = attributes7.userData(" hi!=\"hi!\"", (java.lang.Object) attributes30);
        attributes36.removeIgnoreCase(" hi!=\"hi!\"");
        boolean boolean40 = attributes36.hasKeyIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes43 = attributes36.put(" hi!=\"\"", true);
        org.jsoup.nodes.Attributes attributes44 = attributes43.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes44.iterator();
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        java.lang.String str47 = attributes46.html();
        org.jsoup.nodes.Attributes attributes50 = attributes46.put("hi!", false);
        org.jsoup.nodes.Attribute attribute52 = attributes50.attribute("");
        java.lang.String str54 = attributes50.getIgnoreCase(" hi!=\"hi!\"");
        boolean boolean56 = attributes50.hasKeyIgnoreCase(" _hi!_hi!_=\"hi!\"");
        boolean boolean57 = attributes44.equals((java.lang.Object) boolean56);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeRange13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNull(attribute52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1031");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.lang.String str17 = attributes16.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes16.asList();
        org.jsoup.nodes.Attributes attributes21 = attributes16.put("", false);
        org.jsoup.nodes.Attribute attribute23 = attributes21.attribute("hi!");
        boolean boolean25 = attributes21.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        int int27 = attributes21.deduplicate(parseSettings26);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange31 = attributes29.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes32 = attributes21.sourceRange("", attributeRange31);
        org.jsoup.nodes.Attributes attributes33 = attributes13.sourceRange("", attributeRange31);
        boolean boolean34 = attributes13.isEmpty();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(attribute23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributeRange31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1032");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attribute attribute7 = attributes5.attribute("hi!");
        boolean boolean9 = attributes5.hasDeclaredValueForKey("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange11 = attributes5.sourceRange(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.lang.String str13 = attributes12.html();
        org.jsoup.nodes.Attributes attributes16 = attributes12.put("hi!", false);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes21 = attributes16.userData("hi!", (java.lang.Object) "");
        attributes16.remove("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes16.asList();
        attributes5.addAll(attributes16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeRange11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributeList24);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1033");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        boolean boolean11 = attributes4.hasKeyIgnoreCase(" hi!=\"hi!\"");
        attributes4.remove(" hi!=\"hi!\"");
        java.lang.Object obj14 = null;
        boolean boolean15 = attributes4.equals(obj14);
        boolean boolean17 = attributes4.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.lang.String str19 = attributes18.html();
        org.jsoup.nodes.Attributes attributes22 = attributes18.put("hi!", false);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        boolean boolean26 = attributes24.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes27 = attributes22.userData("hi!", (java.lang.Object) "");
        attributes22.removeIgnoreCase("");
        java.lang.String str30 = attributes22.toString();
        boolean boolean31 = attributes4.equals((java.lang.Object) attributes22);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1034");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes18.spliterator();
        attributes3.addAll(attributes18);
        org.jsoup.nodes.Attributes attributes25 = attributes3.put("", true);
        attributes25.removeIgnoreCase("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes25.asList();
        org.jsoup.nodes.Attributes attributes29 = attributes25.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeList28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1035");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange13 = attributes9.sourceRange("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes9.addAll(attributes14);
        attributes7.addAll(attributes9);
        java.lang.String str18 = attributes7.get("");
        org.jsoup.nodes.Attributes attributes21 = attributes7.put("hi!", false);
        org.jsoup.nodes.Attributes attributes24 = attributes21.put("", true);
        java.lang.String str25 = attributes24.html();
        java.lang.String str26 = attributes24.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeRange13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1036");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        attributes0.remove("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.Object obj9 = attributes0.userData("hi!");
        java.lang.String str10 = attributes0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1037");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        java.lang.String str7 = attributes0.get("hi!");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes0.deduplicate(parseSettings8);
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes14 = attributes0.put(" hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.lang.String str16 = attributes15.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes15.asList();
        org.jsoup.nodes.Attributes attributes20 = attributes15.put("", false);
        org.jsoup.nodes.Attributes attributes23 = attributes15.add("hi!", "hi!");
        attributes14.addAll(attributes23);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange28 = attributes26.sourceRange("hi!");
        boolean boolean30 = attributes26.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        int int32 = attributes26.deduplicate(parseSettings31);
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        boolean boolean36 = attributes34.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange38 = attributes34.sourceRange("");
        org.jsoup.nodes.Attributes attributes39 = attributes26.sourceRange("", attributeRange38);
        attributes39.normalize();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        java.lang.String str43 = attributes42.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList44 = attributes42.asList();
        org.jsoup.nodes.Attributes attributes47 = attributes42.put("", false);
        org.jsoup.nodes.Attribute attribute49 = attributes47.attribute("hi!");
        boolean boolean51 = attributes47.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        int int53 = attributes47.deduplicate(parseSettings52);
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange57 = attributes55.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes58 = attributes47.sourceRange("", attributeRange57);
        org.jsoup.nodes.Attributes attributes59 = attributes39.sourceRange("", attributeRange57);
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes59.asList();
        java.lang.Object obj62 = attributes59.userData("hi!");
        java.lang.String str63 = attributes59.toString();
        org.jsoup.nodes.Attributes attributes65 = new org.jsoup.nodes.Attributes();
        java.lang.String str66 = attributes65.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList67 = attributes65.asList();
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        int int70 = attributes68.deduplicate(parseSettings69);
        attributes65.addAll(attributes68);
        org.jsoup.nodes.Range.AttributeRange attributeRange73 = attributes65.sourceRange(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes74 = attributes59.sourceRange("", attributeRange73);
        org.jsoup.nodes.Attributes attributes75 = attributes23.sourceRange("hi!", attributeRange73);
        org.jsoup.nodes.Attributes attributes77 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange79 = attributes77.sourceRange("hi!");
        java.lang.String str81 = attributes77.getIgnoreCase("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange83 = attributes77.sourceRange("");
        org.jsoup.nodes.Attributes attributes84 = attributes23.sourceRange(" hi!=\"hi!\"", attributeRange83);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor85 = attributes23.iterator();
        attributes23.remove("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeRange28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributeRange38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(attributeList44);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNull(attribute49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(attributeRange57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(attributeList60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(attributeList67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(attributeRange73);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertNotNull(attributeRange79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(attributeRange83);
        org.junit.Assert.assertNotNull(attributes84);
        org.junit.Assert.assertNotNull(attributeItor85);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1038");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange9 = attributes7.sourceRange("hi!");
        boolean boolean11 = attributes7.hasKeyIgnoreCase("");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = attributes0.userData("hi!", (java.lang.Object) boolean13);
        boolean boolean15 = attributes14.isEmpty();
        org.jsoup.nodes.Attributes attributes18 = attributes14.add("", " hi!=\"hi!\" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.lang.String str20 = attributes19.html();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        int int22 = attributes19.deduplicate(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        int int24 = attributes19.deduplicate(parseSettings23);
        org.jsoup.nodes.Attributes attributes27 = attributes19.add("", "");
        org.jsoup.nodes.Attributes attributes30 = attributes19.put(" hi!=\"hi!\"", false);
        boolean boolean31 = attributes18.equals((java.lang.Object) attributes19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeRange9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1039");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes18.spliterator();
        attributes3.addAll(attributes18);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes23.asList();
        java.lang.String str27 = attributes23.getIgnoreCase("hi!");
        java.lang.String str29 = attributes23.get("hi!");
        attributes3.addAll(attributes23);
        boolean boolean31 = attributes23.isEmpty();
        org.jsoup.nodes.Attributes attributes34 = attributes23.put("hi!", "hi!");
        boolean boolean35 = attributes23.isEmpty();
        java.lang.String str37 = attributes23.get(" _hi!_hi!_=\"hi!\"");
        java.lang.Object obj39 = attributes23.userData(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.lang.String str41 = attributes40.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes40.asList();
        org.jsoup.nodes.Attributes attributes45 = attributes40.put("", false);
        org.jsoup.nodes.Attribute attribute47 = attributes45.attribute("hi!");
        boolean boolean49 = attributes45.hasDeclaredValueForKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap50 = attributes45.dataset();
        boolean boolean52 = attributes45.hasDeclaredValueForKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        int int54 = attributes45.deduplicate(parseSettings53);
        attributes23.addAll(attributes45);
        org.jsoup.nodes.Attributes attributes58 = attributes23.add(" _hi!_hi!_=\"hi!\"", " hi!=\"hi!\" hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNull(attribute47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(attributes58);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1040");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes9 = attributes4.userData("hi!", (java.lang.Object) "");
        java.lang.String str11 = attributes4.get("hi!");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.lang.String str14 = attributes13.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes13.asList();
        org.jsoup.nodes.Attributes attributes18 = attributes13.put("", false);
        org.jsoup.nodes.Attributes attributes21 = attributes13.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes4.userData("hi!", (java.lang.Object) attributes21);
        int int23 = attributes21.size();
        java.lang.String str24 = attributes21.toString();
        java.lang.String str25 = attributes21.toString();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.lang.String str27 = attributes26.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes26.asList();
        org.jsoup.nodes.Attributes attributes31 = attributes26.put("", false);
        org.jsoup.nodes.Attributes attributes34 = attributes26.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange38 = attributes36.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes39 = attributes26.sourceRange("hi!", attributeRange38);
        boolean boolean40 = attributes21.equals((java.lang.Object) attributes39);
        java.lang.Object obj42 = attributes21.userData(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " hi!=\"hi!\"" + "'", str24, " hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " hi!=\"hi!\"" + "'", str25, " hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributeList28);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributeRange38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1041");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes8 = attributes0.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes10.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("hi!", attributeRange12);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.lang.String str15 = attributes14.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes14.asList();
        org.jsoup.nodes.Attributes attributes19 = attributes14.put("", false);
        org.jsoup.nodes.Attributes attributes22 = attributes14.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange26 = attributes24.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes27 = attributes14.sourceRange("hi!", attributeRange26);
        org.jsoup.nodes.Attribute attribute29 = attributes27.attribute("hi!");
        org.jsoup.nodes.Attributes attributes30 = attributes13.put(attribute29);
        java.util.List<org.jsoup.nodes.Attribute> attributeList31 = attributes13.asList();
        boolean boolean33 = attributes13.hasKeyIgnoreCase(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList34 = attributes13.asList();
        java.lang.String str36 = attributes13.getIgnoreCase(" hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributeRange26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1042");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        boolean boolean4 = attributes0.hasDeclaredValueForKeyIgnoreCase("");
        attributes0.remove("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.lang.String str11 = attributes10.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes10.asList();
        org.jsoup.nodes.Attributes attributes15 = attributes10.put("", false);
        org.jsoup.nodes.Attributes attributes18 = attributes10.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange22 = attributes20.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes23 = attributes10.sourceRange("hi!", attributeRange22);
        org.jsoup.nodes.Attribute attribute25 = attributes23.attribute("hi!");
        org.jsoup.nodes.Attributes attributes26 = attributes7.put(attribute25);
        org.jsoup.nodes.Attributes attributes27 = attributes0.put(attribute25);
        java.lang.Object obj29 = attributes27.userData(" hi!=\"hi!\"");
        java.lang.String str31 = attributes27.getIgnoreCase("hi!");
        java.lang.Object obj33 = attributes27.userData(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeRange22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1043");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange4 = attributes0.sourceRange("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes0.addAll(attributes5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.lang.String str9 = attributes8.html();
        org.jsoup.nodes.Attributes attributes12 = attributes8.put("hi!", false);
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange16 = attributes14.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.sourceRange("", attributeRange16);
        org.jsoup.nodes.Attributes attributes20 = attributes17.put("hi!", "");
        java.lang.String str21 = attributes20.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes20.iterator();
        attributes20.normalize();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes20.iterator();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.lang.String str27 = attributes26.html();
        org.jsoup.nodes.Attributes attributes30 = attributes26.put("hi!", false);
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange34 = attributes32.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes35 = attributes30.sourceRange("", attributeRange34);
        boolean boolean37 = attributes30.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList38 = attributes30.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor39 = attributes30.iterator();
        java.lang.String str40 = attributes30.html();
        org.jsoup.nodes.Range.AttributeRange attributeRange42 = attributes30.sourceRange(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes43 = attributes20.sourceRange(" _hi!_=\" _hi!_hi!_=&quot;hi!&quot;\" hi!", attributeRange42);
        org.jsoup.nodes.Attributes attributes44 = attributes0.userData(" hi!=\"\"", (java.lang.Object) attributes20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeRange4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeRange16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " hi!=\"\"" + "'", str21, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeRange34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributeList38);
        org.junit.Assert.assertNotNull(attributeItor39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(attributeRange42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(attributes44);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1044");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        boolean boolean6 = attributes0.isEmpty();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        boolean boolean9 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.lang.String str11 = attributes10.html();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        int int13 = attributes10.deduplicate(parseSettings12);
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        int int15 = attributes10.deduplicate(parseSettings14);
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.lang.String str18 = attributes17.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes17.asList();
        java.lang.String str21 = attributes17.getIgnoreCase("hi!");
        java.lang.String str23 = attributes17.get("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange25 = attributes17.sourceRange("");
        org.jsoup.nodes.Attributes attributes26 = attributes10.sourceRange("", attributeRange25);
        int int27 = attributes10.size();
        boolean boolean28 = attributes0.equals((java.lang.Object) attributes10);
        org.jsoup.nodes.Attributes attributes31 = attributes10.add(" hi!=\"hi!\" __hi!_hi!_hi!_hi!_&quot;hi!&quot;_=\" hi!=&quot;hi!&quot; hi!=&quot;hi!&quot;\"", " hi!=\"hi!\" hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes33 = attributes31.put(attribute32);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeRange25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1045");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes9 = attributes4.userData("hi!", (java.lang.Object) "");
        attributes4.remove("");
        org.jsoup.nodes.Attributes attributes14 = attributes4.put("hi!", false);
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.lang.String str16 = attributes15.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes15.asList();
        org.jsoup.nodes.Attributes attributes20 = attributes15.put("", false);
        org.jsoup.nodes.Attributes attributes23 = attributes15.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange27 = attributes25.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes28 = attributes15.sourceRange("hi!", attributeRange27);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.lang.String str30 = attributes29.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList31 = attributes29.asList();
        org.jsoup.nodes.Attributes attributes34 = attributes29.put("", false);
        org.jsoup.nodes.Attributes attributes37 = attributes29.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange41 = attributes39.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes42 = attributes29.sourceRange("hi!", attributeRange41);
        org.jsoup.nodes.Attribute attribute44 = attributes42.attribute("hi!");
        org.jsoup.nodes.Attributes attributes45 = attributes28.put(attribute44);
        org.jsoup.nodes.Attributes attributes46 = attributes14.put(attribute44);
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange49 = attributes47.sourceRange("hi!");
        boolean boolean51 = attributes47.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        int int53 = attributes47.deduplicate(parseSettings52);
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        boolean boolean57 = attributes55.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange59 = attributes55.sourceRange("");
        org.jsoup.nodes.Attributes attributes60 = attributes47.sourceRange("", attributeRange59);
        java.lang.String str62 = attributes47.getIgnoreCase("hi!");
        attributes47.removeIgnoreCase(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        boolean boolean65 = attributes46.equals((java.lang.Object) attributes47);
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        int int67 = attributes47.deduplicate(parseSettings66);
        attributes47.removeIgnoreCase(" hi!=\"hi!\" hi!=\"hi!\"");
        java.lang.String str71 = attributes47.get(" hi!=\"hi!\" hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeRange27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributeList31);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(attributeRange41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attribute44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributeRange49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(attributeRange59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1046");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange13 = attributes9.sourceRange("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes9.addAll(attributes14);
        attributes7.addAll(attributes9);
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.lang.String str18 = attributes17.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes17.asList();
        org.jsoup.nodes.Attributes attributes22 = attributes17.put("", false);
        org.jsoup.nodes.Attributes attributes25 = attributes17.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange29 = attributes27.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes30 = attributes17.sourceRange("hi!", attributeRange29);
        org.jsoup.nodes.Attribute attribute32 = attributes30.attribute("hi!");
        org.jsoup.nodes.Attributes attributes33 = attributes7.put(attribute32);
        boolean boolean35 = attributes33.hasDeclaredValueForKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes33.iterator();
        boolean boolean38 = attributes33.hasKeyIgnoreCase(" hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"");
        int int39 = attributes33.size();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeRange13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeRange29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attribute32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1047");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        boolean boolean10 = attributes9.isEmpty();
        attributes9.removeIgnoreCase("");
        org.jsoup.nodes.Attributes attributes15 = attributes9.add(" _hi!_=\" _hi!_hi!_=&quot;hi!&quot;\" hi!", " _hi!_hi!_hi!_hi!_&quot;hi!&quot;_");
        java.lang.String str16 = attributes15.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " __hi!___hi!_hi!__&quot;hi!&quot;_hi!=\" _hi!_hi!_hi!_hi!_&amp;quot;hi!&amp;quot;_\"" + "'", str16, " __hi!___hi!_hi!__&quot;hi!&quot;_hi!=\" _hi!_hi!_hi!_hi!_&amp;quot;hi!&amp;quot;_\"");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1048");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange9 = attributes7.sourceRange("hi!");
        boolean boolean11 = attributes7.hasKeyIgnoreCase("");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = attributes0.userData("hi!", (java.lang.Object) boolean13);
        boolean boolean16 = attributes0.hasDeclaredValueForKeyIgnoreCase("");
        boolean boolean18 = attributes0.hasDeclaredValueForKeyIgnoreCase("hi!");
        java.lang.Object obj20 = attributes0.userData("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeRange9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1049");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        boolean boolean6 = attributes4.hasKeyIgnoreCase(" hi!=\"hi!\" __hi!_hi!_hi!_hi!_&quot;hi!&quot;_=\" hi!=&quot;hi!&quot; hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1050");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes18.spliterator();
        attributes3.addAll(attributes18);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.lang.String str25 = attributes24.html();
        org.jsoup.nodes.Attributes attributes28 = attributes24.put("hi!", false);
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange32 = attributes30.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes33 = attributes28.sourceRange("", attributeRange32);
        boolean boolean35 = attributes28.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList36 = attributes28.asList();
        org.jsoup.nodes.Range.AttributeRange attributeRange38 = attributes28.sourceRange("");
        org.jsoup.nodes.Attributes attributes39 = attributes3.sourceRange(" hi!=\"hi!\"", attributeRange38);
        java.lang.String str41 = attributes3.get(" hi!=\"\"");
        boolean boolean43 = attributes3.hasDeclaredValueForKey(" hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributeRange32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributeList36);
        org.junit.Assert.assertNotNull(attributeRange38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1051");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        java.lang.String str5 = attributes0.getIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        java.lang.Object obj8 = attributes0.userData(" hi!=\"hi!\" _hi!_hi!__hi!_hi!__hi!_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1052");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange20 = attributes18.sourceRange("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes18.dataset();
        attributes3.addAll(attributes18);
        attributes3.removeIgnoreCase(" hi!=\" hi!=&quot;hi!&quot;\" hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributeRange20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1053");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange4 = attributes0.sourceRange("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes0.addAll(attributes5);
        attributes5.remove("hi!");
        boolean boolean10 = attributes5.hasKeyIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes13 = attributes5.add(" hi!=\"hi!\" _hi!_hi!__hi!_hi!__hi!_", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeRange4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1054");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes9 = attributes0.put("", "");
        boolean boolean11 = attributes0.hasDeclaredValueForKey("hi!");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.lang.String str14 = attributes13.html();
        org.jsoup.nodes.Attributes attributes17 = attributes13.put("hi!", false);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange21 = attributes19.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes17.sourceRange("", attributeRange21);
        org.jsoup.nodes.Attributes attributes25 = attributes17.put("hi!", "");
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.lang.String str28 = attributes27.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes27.asList();
        java.lang.String str31 = attributes27.getIgnoreCase("hi!");
        java.lang.String str33 = attributes27.get("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange35 = attributes27.sourceRange("");
        org.jsoup.nodes.Attributes attributes38 = attributes27.put(" hi!=\"hi!\"", false);
        attributes27.normalize();
        org.jsoup.nodes.Attributes attributes40 = attributes17.userData(" hi!=\"hi!\"", (java.lang.Object) attributes27);
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.lang.String str42 = attributes41.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList43 = attributes41.asList();
        org.jsoup.nodes.Attributes attributes46 = attributes41.put("", false);
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange50 = attributes48.sourceRange("hi!");
        boolean boolean52 = attributes48.hasKeyIgnoreCase("");
        boolean boolean54 = attributes48.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes55 = attributes41.userData("hi!", (java.lang.Object) boolean54);
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        java.lang.String str57 = attributes56.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList58 = attributes56.asList();
        org.jsoup.nodes.Attributes attributes61 = attributes56.put("", false);
        org.jsoup.nodes.Attributes attributes64 = attributes56.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes66 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange68 = attributes66.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes69 = attributes56.sourceRange("hi!", attributeRange68);
        org.jsoup.nodes.Attributes attributes70 = new org.jsoup.nodes.Attributes();
        java.lang.String str71 = attributes70.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList72 = attributes70.asList();
        org.jsoup.nodes.Attributes attributes75 = attributes70.put("", false);
        org.jsoup.nodes.Attributes attributes78 = attributes70.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes80 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange82 = attributes80.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes83 = attributes70.sourceRange("hi!", attributeRange82);
        org.jsoup.nodes.Attribute attribute85 = attributes83.attribute("hi!");
        org.jsoup.nodes.Attributes attributes86 = attributes69.put(attribute85);
        org.jsoup.nodes.Attributes attributes87 = attributes41.put(attribute85);
        org.jsoup.nodes.Attributes attributes88 = attributes40.put(attribute85);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor89 = attributes40.iterator();
        org.jsoup.nodes.Range.AttributeRange attributeRange91 = attributes40.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes92 = attributes0.sourceRange(" hi!=\"hi!\" __hi!_hi!_hi!_hi!_&quot;hi!&quot;_=\" hi!=&quot;hi!&quot; hi!=&quot;hi!&quot;\"", attributeRange91);
        boolean boolean93 = attributes0.isEmpty();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributeRange21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeList29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributeRange35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributeList43);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributeRange50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(attributeList58);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(attributeRange68);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(attributeList72);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(attributeRange82);
        org.junit.Assert.assertNotNull(attributes83);
        org.junit.Assert.assertNotNull(attribute85);
        org.junit.Assert.assertNotNull(attributes86);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertNotNull(attributeItor89);
        org.junit.Assert.assertNotNull(attributeRange91);
        org.junit.Assert.assertNotNull(attributes92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1055");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        org.jsoup.nodes.Attributes attributes8 = attributes0.add("", "");
        java.lang.String str10 = attributes8.get("hi!");
        boolean boolean12 = attributes8.hasDeclaredValueForKeyIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1056");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes8 = attributes0.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes10.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("hi!", attributeRange12);
        org.jsoup.nodes.Attribute attribute15 = attributes13.attribute("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes13.asList();
        org.jsoup.nodes.Attributes attributes19 = attributes13.put("", false);
        int int20 = attributes13.size();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.lang.String str23 = attributes22.html();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        int int25 = attributes22.deduplicate(parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        int int27 = attributes22.deduplicate(parseSettings26);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.lang.String str29 = attributes28.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList30 = attributes28.asList();
        org.jsoup.nodes.Attributes attributes33 = attributes28.put("", false);
        org.jsoup.nodes.Attribute attribute35 = attributes33.attribute("hi!");
        boolean boolean37 = attributes33.hasKeyIgnoreCase("");
        boolean boolean39 = attributes33.hasKeyIgnoreCase("");
        attributes22.addAll(attributes33);
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        java.lang.String str43 = attributes42.html();
        org.jsoup.nodes.Attributes attributes46 = attributes42.put("hi!", false);
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange50 = attributes48.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes51 = attributes46.sourceRange("", attributeRange50);
        boolean boolean53 = attributes46.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList54 = attributes46.asList();
        org.jsoup.nodes.Range.AttributeRange attributeRange56 = attributes46.sourceRange("");
        org.jsoup.nodes.Attributes attributes57 = attributes22.sourceRange("", attributeRange56);
        org.jsoup.nodes.Attributes attributes58 = attributes13.userData("", (java.lang.Object) "");
        boolean boolean59 = attributes13.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributeList30);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNull(attribute35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributeRange50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributeList54);
        org.junit.Assert.assertNotNull(attributeRange56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1057");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes0.dataset();
        attributes0.normalize();
        org.jsoup.nodes.Attribute attribute17 = attributes0.attribute(" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(attribute17);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1058");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        boolean boolean10 = attributes7.hasDeclaredValueForKey("");
        boolean boolean12 = attributes7.hasDeclaredValueForKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes15 = attributes7.put(" _hi!_hi!_=\"hi!\"", true);
        java.lang.String str17 = attributes7.get(" hi!=\"\"");
        attributes7.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes7.add("", " hi!=\"hi!\" hi!=\"hi!\"");
        java.lang.String str23 = attributes7.get("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1059");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        java.lang.String str7 = attributes0.get("hi!");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes0.deduplicate(parseSettings8);
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes14 = attributes0.put(" hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.lang.String str16 = attributes15.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes15.asList();
        org.jsoup.nodes.Attributes attributes20 = attributes15.put("", false);
        org.jsoup.nodes.Attributes attributes23 = attributes15.add("hi!", "hi!");
        attributes14.addAll(attributes23);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.lang.String str27 = attributes26.html();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        int int29 = attributes26.deduplicate(parseSettings28);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes26.spliterator();
        org.jsoup.nodes.Attributes attributes31 = attributes23.userData(" __hi!___hi!_hi!__&quot;hi!&quot;_hi!=\" _hi!_hi!_hi!_hi!_&amp;quot;hi!&amp;quot;_\"", (java.lang.Object) attributeSpliterator30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1060");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        boolean boolean4 = attributes0.hasDeclaredValueForKeyIgnoreCase("");
        boolean boolean5 = attributes0.isEmpty();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange9 = attributes7.sourceRange("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes7.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes12 = attributes0.userData("hi!", (java.lang.Object) attributeItor11);
        boolean boolean13 = attributes0.isEmpty();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes0.iterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(attributeRange9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(attributeItor15);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1061");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        boolean boolean15 = attributes13.hasDeclaredValueForKeyIgnoreCase("hi!");
        boolean boolean17 = attributes13.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes13.isEmpty();
        attributes13.remove("");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1062");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attribute attribute7 = attributes5.attribute("hi!");
        boolean boolean9 = attributes5.hasKeyIgnoreCase("");
        boolean boolean11 = attributes5.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange13 = attributes5.sourceRange("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes5.dataset();
        boolean boolean16 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str17 = attributes5.html();
        boolean boolean18 = attributes5.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeRange13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1063");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes9 = attributes0.put("", "");
        boolean boolean11 = attributes0.hasDeclaredValueForKey("hi!");
        boolean boolean13 = attributes0.hasKey("hi!");
        org.jsoup.nodes.Attributes attributes16 = attributes0.put(" hi!=\"\"", true);
        org.jsoup.nodes.Attribute attribute18 = attributes16.attribute(" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(attribute18);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1064");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange4 = attributes0.sourceRange("");
        int int5 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        boolean boolean8 = attributes0.hasKeyIgnoreCase(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeRange4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1065");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes9 = attributes4.userData("hi!", (java.lang.Object) "");
        attributes4.remove("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes4.spliterator();
        attributes4.removeIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange16 = attributes4.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.lang.String str18 = attributes17.html();
        org.jsoup.nodes.Attributes attributes21 = attributes17.put("hi!", false);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        boolean boolean25 = attributes23.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes26 = attributes21.userData("hi!", (java.lang.Object) "");
        attributes21.remove("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator29 = attributes21.spliterator();
        attributes21.removeIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange33 = attributes21.sourceRange("hi!");
        boolean boolean34 = attributes4.equals((java.lang.Object) attributeRange33);
        org.jsoup.nodes.Attributes attributes37 = attributes4.put(" hi!=\" hi!=&quot;hi!&quot;\" hi!=\"hi!\"", false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertNotNull(attributeRange16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributeSpliterator29);
        org.junit.Assert.assertNotNull(attributeRange33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1066");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes18.spliterator();
        attributes3.addAll(attributes18);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes23.asList();
        java.lang.String str27 = attributes23.getIgnoreCase("hi!");
        java.lang.String str29 = attributes23.get("hi!");
        attributes3.addAll(attributes23);
        boolean boolean31 = attributes23.isEmpty();
        org.jsoup.nodes.Attributes attributes34 = attributes23.put("hi!", false);
        java.lang.String str35 = attributes34.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList36 = attributes34.asList();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.lang.String str38 = attributes37.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList39 = attributes37.asList();
        org.jsoup.nodes.Attributes attributes42 = attributes37.put("", false);
        org.jsoup.nodes.Attributes attributes45 = attributes37.add("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = attributes45.dataset();
        boolean boolean47 = attributes34.equals((java.lang.Object) attributes45);
        org.jsoup.nodes.Attributes attributes50 = attributes45.put(" _hi!_hi!_=\"hi!\"", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributeList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(attributes50);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1067");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes18.spliterator();
        attributes3.addAll(attributes18);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes23.asList();
        java.lang.String str27 = attributes23.getIgnoreCase("hi!");
        java.lang.String str29 = attributes23.get("hi!");
        attributes3.addAll(attributes23);
        boolean boolean31 = attributes23.isEmpty();
        org.jsoup.nodes.Attributes attributes34 = attributes23.put("hi!", "hi!");
        int int35 = attributes34.size();
        org.jsoup.nodes.Attributes attributes36 = attributes34.clone();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.lang.String str38 = attributes37.html();
        org.jsoup.nodes.Attributes attributes41 = attributes37.put("hi!", false);
        org.jsoup.nodes.Attributes attributes44 = attributes37.put("", "");
        java.lang.String str45 = attributes44.toString();
        org.jsoup.nodes.Attributes attributes48 = attributes44.put("", " hi!=\"hi!\"");
        attributes44.remove(" hi!=\"hi!\"");
        java.lang.String str51 = attributes44.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes36.addAll(attributes44);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1068");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes12 = attributes9.put("hi!", "");
        java.lang.String str13 = attributes12.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes12.iterator();
        attributes12.normalize();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes12.iterator();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = attributes12.deduplicate(parseSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.ParseSettings.preserveAttributeCase()\" because \"settings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!=\"\"" + "'", str13, " hi!=\"\"");
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributeItor16);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1069");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        attributes0.remove("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes8 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes11 = attributes0.add("", "hi!");
        java.lang.String str12 = attributes11.html();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1070");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes3.deduplicate(parseSettings4);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes9 = attributes0.put("hi!", " hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        boolean boolean11 = attributes9.hasDeclaredValueForKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes9.iterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1071");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes9 = attributes0.put("", "");
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(" hi!=\"hi!\" _hi!_hi!__hi!_hi!__hi!_", " hi!=\" hi!=&quot;hi!&quot;\" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1072");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes10 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes10.add("", "");
        java.lang.String str14 = attributes13.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes13.iterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeItor15);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1073");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange9 = attributes7.sourceRange("hi!");
        boolean boolean11 = attributes7.hasKeyIgnoreCase("");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = attributes0.userData("hi!", (java.lang.Object) boolean13);
        boolean boolean16 = attributes0.hasDeclaredValueForKeyIgnoreCase("");
        boolean boolean18 = attributes0.hasDeclaredValueForKeyIgnoreCase("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange20 = attributes0.sourceRange(" hi!=\"hi!\"");
        org.jsoup.nodes.Range.AttributeRange attributeRange22 = attributes0.sourceRange(" hi!=\"hi!\" __hi!_hi!_hi!_hi!_&quot;hi!&quot;_=\" hi!=&quot;hi!&quot; hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeRange9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeRange20);
        org.junit.Assert.assertNotNull(attributeRange22);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1074");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        boolean boolean10 = attributes9.isEmpty();
        attributes9.removeIgnoreCase("");
        org.jsoup.nodes.Attributes attributes15 = attributes9.add(" _hi!_=\" _hi!_hi!_=&quot;hi!&quot;\" hi!", " _hi!_hi!_hi!_hi!_&quot;hi!&quot;_");
        org.jsoup.nodes.Attributes attributes18 = attributes9.put(" hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"", false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1075");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        java.lang.String str15 = attributes13.get("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes13.iterator();
        org.jsoup.nodes.Attributes attributes19 = attributes13.add(" hi!=\"hi!\"", "hi!");
        java.lang.Object obj21 = attributes19.userData(" hi!=\" hi!=&quot;hi!&quot;\" hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1076");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        java.lang.Object obj7 = attributes5.userData("");
        org.jsoup.nodes.Range.AttributeRange attributeRange9 = attributes5.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes12 = attributes5.put(" __hi!___hi!_hi!__&quot;hi!&quot;_hi!=\" _hi!_hi!_hi!_hi!_&amp;quot;hi!&amp;quot;_\"", "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(attributeRange9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1077");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes10 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes10.add("", "");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange17 = attributes15.sourceRange("hi!");
        boolean boolean19 = attributes15.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        int int21 = attributes15.deduplicate(parseSettings20);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        boolean boolean25 = attributes23.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange27 = attributes23.sourceRange("");
        org.jsoup.nodes.Attributes attributes28 = attributes15.sourceRange("", attributeRange27);
        org.jsoup.nodes.Attributes attributes29 = attributes10.sourceRange("", attributeRange27);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.lang.String str32 = attributes31.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList33 = attributes31.asList();
        org.jsoup.nodes.Attributes attributes36 = attributes31.put("", false);
        org.jsoup.nodes.Attribute attribute38 = attributes36.attribute("hi!");
        boolean boolean40 = attributes36.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        int int42 = attributes36.deduplicate(parseSettings41);
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange46 = attributes44.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes47 = attributes36.sourceRange("", attributeRange46);
        org.jsoup.nodes.Attributes attributes48 = attributes10.sourceRange("", attributeRange46);
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = attributes48.deduplicate(parseSettings49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.ParseSettings.preserveAttributeCase()\" because \"settings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeRange17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeRange27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributeList33);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNull(attribute38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(attributeRange46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1078");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        java.lang.String str7 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes10 = attributes0.add("hi!", "");
        boolean boolean12 = attributes0.hasKey("");
        attributes0.removeIgnoreCase(" hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1079");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes10 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes10.add("", "");
        attributes10.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.lang.String str17 = attributes16.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes16.asList();
        org.jsoup.nodes.Attributes attributes21 = attributes16.put("", false);
        org.jsoup.nodes.Attributes attributes24 = attributes16.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange28 = attributes26.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes29 = attributes16.sourceRange("hi!", attributeRange28);
        org.jsoup.nodes.Attribute attribute31 = attributes29.attribute("hi!");
        org.jsoup.nodes.Attributes attributes32 = attributes10.put(attribute31);
        boolean boolean33 = attributes32.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(attributeRange28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1080");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attribute attribute7 = attributes5.attribute("hi!");
        boolean boolean9 = attributes5.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        int int11 = attributes5.deduplicate(parseSettings10);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes13.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes16 = attributes5.sourceRange("", attributeRange15);
        java.lang.String str17 = attributes5.toString();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange20 = attributes18.sourceRange("hi!");
        boolean boolean22 = attributes18.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        int int24 = attributes18.deduplicate(parseSettings23);
        org.jsoup.nodes.Attributes attributes27 = attributes18.put("hi!", "");
        boolean boolean28 = attributes5.equals((java.lang.Object) attributes18);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.lang.String str30 = attributes29.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList31 = attributes29.asList();
        org.jsoup.nodes.Attributes attributes34 = attributes29.put("", false);
        org.jsoup.nodes.Attribute attribute36 = attributes34.attribute("hi!");
        boolean boolean38 = attributes34.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        int int40 = attributes34.deduplicate(parseSettings39);
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.lang.String str42 = attributes41.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList43 = attributes41.asList();
        org.jsoup.nodes.Attributes attributes46 = attributes41.put("", false);
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange50 = attributes48.sourceRange("hi!");
        boolean boolean52 = attributes48.hasKeyIgnoreCase("");
        boolean boolean54 = attributes48.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes55 = attributes41.userData("hi!", (java.lang.Object) boolean54);
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        java.lang.String str57 = attributes56.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList58 = attributes56.asList();
        org.jsoup.nodes.Attributes attributes61 = attributes56.put("", false);
        org.jsoup.nodes.Attributes attributes64 = attributes56.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes66 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange68 = attributes66.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes69 = attributes56.sourceRange("hi!", attributeRange68);
        org.jsoup.nodes.Attributes attributes70 = new org.jsoup.nodes.Attributes();
        java.lang.String str71 = attributes70.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList72 = attributes70.asList();
        org.jsoup.nodes.Attributes attributes75 = attributes70.put("", false);
        org.jsoup.nodes.Attributes attributes78 = attributes70.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes80 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange82 = attributes80.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes83 = attributes70.sourceRange("hi!", attributeRange82);
        org.jsoup.nodes.Attribute attribute85 = attributes83.attribute("hi!");
        org.jsoup.nodes.Attributes attributes86 = attributes69.put(attribute85);
        org.jsoup.nodes.Attributes attributes87 = attributes41.put(attribute85);
        org.jsoup.nodes.Attributes attributes88 = attributes34.put(attribute85);
        org.jsoup.nodes.Attributes attributes89 = attributes5.put(attribute85);
        org.jsoup.nodes.Range.AttributeRange attributeRange91 = attributes5.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes94 = attributes5.add(" hi!=\"hi!\"", "hi!");
        boolean boolean96 = attributes94.hasDeclaredValueForKeyIgnoreCase(" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeRange20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributeList31);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNull(attribute36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributeList43);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributeRange50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(attributeList58);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(attributeRange68);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(attributeList72);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(attributeRange82);
        org.junit.Assert.assertNotNull(attributes83);
        org.junit.Assert.assertNotNull(attribute85);
        org.junit.Assert.assertNotNull(attributes86);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertNotNull(attributes89);
        org.junit.Assert.assertNotNull(attributeRange91);
        org.junit.Assert.assertNotNull(attributes94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1081");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange4 = attributes0.sourceRange("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes0.addAll(attributes5);
        attributes5.remove("hi!");
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        int int10 = attributes5.deduplicate(parseSettings9);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange14 = attributes12.sourceRange("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        int int18 = attributes12.deduplicate(parseSettings17);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange24 = attributes20.sourceRange("");
        org.jsoup.nodes.Attributes attributes25 = attributes12.sourceRange("", attributeRange24);
        attributes25.normalize();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes25.spliterator();
        org.jsoup.nodes.Attributes attributes28 = attributes5.userData(" hi!=\"hi!\" hi!=\"hi!\"", (java.lang.Object) attributeSpliterator27);
        boolean boolean30 = attributes28.hasKey("");
        org.jsoup.nodes.Attributes attributes31 = attributes28.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeRange4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeRange14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeRange24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1082");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        java.lang.String str4 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute6 = attributes0.attribute("hi!");
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str9 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute11 = attributes0.attribute(" hi!=\"hi!\" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(attribute6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(attribute11);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1083");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        java.lang.String str7 = attributes0.get("hi!");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes0.deduplicate(parseSettings8);
        attributes0.removeIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes14 = attributes0.put(" hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes14.add("", " hi!=\"hi!\"");
        boolean boolean19 = attributes14.hasDeclaredValueForKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.lang.String str22 = attributes21.html();
        org.jsoup.nodes.Attributes attributes25 = attributes21.put("hi!", false);
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange29 = attributes27.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes30 = attributes25.sourceRange("", attributeRange29);
        org.jsoup.nodes.Attributes attributes31 = attributes30.clone();
        org.jsoup.nodes.Attributes attributes34 = attributes31.add("", "");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange38 = attributes36.sourceRange("hi!");
        boolean boolean40 = attributes36.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        int int42 = attributes36.deduplicate(parseSettings41);
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        boolean boolean46 = attributes44.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange48 = attributes44.sourceRange("");
        org.jsoup.nodes.Attributes attributes49 = attributes36.sourceRange("", attributeRange48);
        org.jsoup.nodes.Attributes attributes50 = attributes31.sourceRange("", attributeRange48);
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        java.lang.String str53 = attributes52.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList54 = attributes52.asList();
        org.jsoup.nodes.Attributes attributes57 = attributes52.put("", false);
        org.jsoup.nodes.Attribute attribute59 = attributes57.attribute("hi!");
        boolean boolean61 = attributes57.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        int int63 = attributes57.deduplicate(parseSettings62);
        org.jsoup.nodes.Attributes attributes65 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange67 = attributes65.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes68 = attributes57.sourceRange("", attributeRange67);
        org.jsoup.nodes.Attributes attributes69 = attributes31.sourceRange("", attributeRange67);
        org.jsoup.nodes.Attributes attributes70 = attributes14.userData(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", (java.lang.Object) attributes69);
        org.jsoup.nodes.Attributes attributes71 = attributes70.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeRange29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributeRange38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributeRange48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(attributeList54);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNull(attribute59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(attributeRange67);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(attributes71);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1084");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes18.spliterator();
        attributes3.addAll(attributes18);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes23.asList();
        java.lang.String str27 = attributes23.getIgnoreCase("hi!");
        java.lang.String str29 = attributes23.get("hi!");
        attributes3.addAll(attributes23);
        boolean boolean31 = attributes23.isEmpty();
        org.jsoup.nodes.Attributes attributes34 = attributes23.put("hi!", "hi!");
        int int35 = attributes34.size();
        attributes34.remove("hi!");
        boolean boolean39 = attributes34.hasDeclaredValueForKey(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1085");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange13 = attributes9.sourceRange("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes9.addAll(attributes14);
        attributes7.addAll(attributes9);
        java.lang.String str18 = attributes7.get("");
        org.jsoup.nodes.Attributes attributes21 = attributes7.put("hi!", false);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.html();
        org.jsoup.nodes.Attributes attributes27 = attributes23.put("hi!", false);
        org.jsoup.nodes.Attributes attributes30 = attributes23.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        boolean boolean33 = attributes30.hasDeclaredValueForKey("");
        java.lang.String str35 = attributes30.get("");
        org.jsoup.nodes.Attributes attributes36 = attributes7.userData(" hi!=\"hi!\"", (java.lang.Object) attributes30);
        attributes36.removeIgnoreCase(" hi!=\"hi!\"");
        boolean boolean40 = attributes36.hasKeyIgnoreCase(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes43 = attributes36.put(" hi!=\"\"", true);
        org.jsoup.nodes.Attributes attributes44 = attributes43.clone();
        org.jsoup.nodes.Attributes attributes45 = attributes43.clone();
        boolean boolean46 = attributes43.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeRange13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1086");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes10 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes10.add("", "");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.lang.String str16 = attributes15.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes15.asList();
        org.jsoup.nodes.Attributes attributes20 = attributes15.put("", false);
        org.jsoup.nodes.Attribute attribute22 = attributes20.attribute("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("");
        boolean boolean26 = attributes20.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange28 = attributes20.sourceRange("");
        org.jsoup.nodes.Attributes attributes29 = attributes13.sourceRange(" hi!=\"hi!\" hi!=\"hi!\"", attributeRange28);
        int int30 = attributes29.size();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(attribute22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeRange28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1087");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        attributes13.normalize();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.lang.String str17 = attributes16.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes16.asList();
        org.jsoup.nodes.Attributes attributes21 = attributes16.put("", false);
        org.jsoup.nodes.Attribute attribute23 = attributes21.attribute("hi!");
        boolean boolean25 = attributes21.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        int int27 = attributes21.deduplicate(parseSettings26);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange31 = attributes29.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes32 = attributes21.sourceRange("", attributeRange31);
        org.jsoup.nodes.Attributes attributes33 = attributes13.sourceRange("", attributeRange31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList34 = attributes33.asList();
        java.lang.Object obj36 = attributes33.userData("hi!");
        java.lang.String str37 = attributes33.toString();
        org.jsoup.nodes.Attributes attributes39 = new org.jsoup.nodes.Attributes();
        java.lang.String str40 = attributes39.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList41 = attributes39.asList();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        int int44 = attributes42.deduplicate(parseSettings43);
        attributes39.addAll(attributes42);
        org.jsoup.nodes.Range.AttributeRange attributeRange47 = attributes39.sourceRange(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes48 = attributes33.sourceRange("", attributeRange47);
        org.jsoup.nodes.Range.AttributeRange attributeRange50 = attributes33.sourceRange("hi!");
        int int51 = attributes33.size();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(attribute23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributeRange31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(attributeList41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(attributeRange47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(attributeRange50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1088");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.lang.String str7 = attributes6.html();
        org.jsoup.nodes.Attributes attributes10 = attributes6.put("hi!", false);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange14 = attributes12.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.sourceRange("", attributeRange14);
        org.jsoup.nodes.Attributes attributes16 = attributes15.clone();
        org.jsoup.nodes.Attributes attributes19 = attributes16.add("", "");
        java.lang.String str20 = attributes19.toString();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        java.lang.String str26 = attributes25.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes25.asList();
        org.jsoup.nodes.Attributes attributes30 = attributes25.put("", false);
        org.jsoup.nodes.Attributes attributes33 = attributes25.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange37 = attributes35.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes38 = attributes25.sourceRange("hi!", attributeRange37);
        org.jsoup.nodes.Attribute attribute40 = attributes38.attribute("hi!");
        org.jsoup.nodes.Attributes attributes41 = attributes22.put(attribute40);
        org.jsoup.nodes.Attributes attributes42 = attributes19.userData(" hi!=\"hi!\"", (java.lang.Object) attribute40);
        org.jsoup.nodes.Attributes attributes43 = attributes5.put(attribute40);
        org.jsoup.nodes.Attributes attributes44 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes47 = attributes44.add(" _hi!_=\" _hi!_hi!_=&quot;hi!&quot;\" hi!", " hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes50 = attributes44.put("", " hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributeRange14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributeList27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributeRange37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(attribute40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(attributes50);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1089");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        int int19 = attributes3.deduplicate(parseSettings18);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes3.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributeItor20);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1090");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes9 = attributes4.userData("hi!", (java.lang.Object) "");
        attributes4.remove("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes4.spliterator();
        attributes4.removeIgnoreCase(" hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1091");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes9 = attributes4.userData("hi!", (java.lang.Object) "");
        attributes4.remove("");
        org.jsoup.nodes.Attributes attributes14 = attributes4.put("hi!", false);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange18 = attributes16.sourceRange("hi!");
        boolean boolean20 = attributes16.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        int int22 = attributes16.deduplicate(parseSettings21);
        org.jsoup.nodes.Attributes attributes25 = attributes16.put("", "");
        boolean boolean27 = attributes16.hasDeclaredValueForKey("hi!");
        int int28 = attributes16.size();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.lang.String str31 = attributes30.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList32 = attributes30.asList();
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        int int35 = attributes33.deduplicate(parseSettings34);
        attributes30.addAll(attributes33);
        org.jsoup.nodes.Range.AttributeRange attributeRange38 = attributes30.sourceRange(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes39 = attributes16.sourceRange(" hi!=\"\"", attributeRange38);
        org.jsoup.nodes.Attributes attributes40 = attributes14.sourceRange(" hi! __hi!_hi!__hi!_=\" _hi!_hi!_=&quot;hi!&quot;\"", attributeRange38);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributeRange18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributeList32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(attributeRange38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributes40);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1092");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes10 = attributes0.add(" hi!=\"hi!\"", " hi!=\"hi!\"");
        java.lang.String str12 = attributes0.get("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        java.lang.String str14 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " _hi!_hi!_=\" hi!=&quot;hi!&quot;\"" + "'", str14, " _hi!_hi!_=\" hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1093");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.lang.String str8 = attributes7.html();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("hi!", false);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes13.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes16 = attributes11.sourceRange("", attributeRange15);
        org.jsoup.nodes.Attributes attributes17 = attributes16.clone();
        org.jsoup.nodes.Attributes attributes20 = attributes17.add("", "");
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange24 = attributes22.sourceRange("hi!");
        boolean boolean26 = attributes22.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        int int28 = attributes22.deduplicate(parseSettings27);
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        boolean boolean32 = attributes30.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange34 = attributes30.sourceRange("");
        org.jsoup.nodes.Attributes attributes35 = attributes22.sourceRange("", attributeRange34);
        org.jsoup.nodes.Attributes attributes36 = attributes17.sourceRange("", attributeRange34);
        org.jsoup.nodes.Attributes attributes37 = attributes0.sourceRange(" hi!=\"\"", attributeRange34);
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        int int39 = attributes37.deduplicate(parseSettings38);
        int int40 = attributes37.size();
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributeRange24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributeRange34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1094");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes4 = attributes0.add(" hi!=\" hi!=&quot;hi!&quot;\" hi!=\"hi!\"", " _hi!_hi!_=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1095");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.lang.String str3 = attributes2.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes2.asList();
        org.jsoup.nodes.Attributes attributes7 = attributes2.put("", false);
        java.lang.Object obj9 = attributes7.userData("");
        org.jsoup.nodes.Attributes attributes10 = attributes0.userData("hi!", (java.lang.Object) attributes7);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes0.iterator();
        attributes0.normalize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributeItor11);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1096");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange9 = attributes7.sourceRange("hi!");
        boolean boolean11 = attributes7.hasKeyIgnoreCase("");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = attributes0.userData("hi!", (java.lang.Object) boolean13);
        boolean boolean15 = attributes14.isEmpty();
        org.jsoup.nodes.Attributes attributes18 = attributes14.add("", " hi!=\"hi!\" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes18.addAll(attributes19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.nodes.Attributes.size()\" because \"incoming\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeRange9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1097");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange2 = attributes0.sourceRange("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        int int6 = attributes0.deduplicate(parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes8.sourceRange("");
        org.jsoup.nodes.Attributes attributes13 = attributes0.sourceRange("", attributeRange12);
        boolean boolean15 = attributes13.hasDeclaredValueForKeyIgnoreCase("hi!");
        boolean boolean17 = attributes13.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes13.put("hi!", false);
        org.jsoup.nodes.Attribute attribute22 = attributes13.attribute(" _hi!_hi!_=\"hi!\"");
        org.jsoup.nodes.Range.AttributeRange attributeRange24 = attributes13.sourceRange(" _hi!_hi!_hi!_hi!_&quot;hi!&quot;_");
        org.jsoup.nodes.Attribute attribute26 = attributes13.attribute(" hi!=\"hi!\" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeRange2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(attribute22);
        org.junit.Assert.assertNotNull(attributeRange24);
        org.junit.Assert.assertNull(attribute26);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1098");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes9 = attributes0.put("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", " _hi!_hi!_=\" hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1099");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes7 = attributes0.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes7.spliterator();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange13 = attributes9.sourceRange("");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes9.addAll(attributes14);
        attributes7.addAll(attributes9);
        java.lang.String str18 = attributes7.get("");
        org.jsoup.nodes.Attributes attributes21 = attributes7.put("hi!", false);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str24 = attributes23.html();
        org.jsoup.nodes.Attributes attributes27 = attributes23.put("hi!", false);
        org.jsoup.nodes.Attributes attributes30 = attributes23.put("", "");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes30.spliterator();
        boolean boolean33 = attributes30.hasDeclaredValueForKey("");
        java.lang.String str35 = attributes30.get("");
        org.jsoup.nodes.Attributes attributes36 = attributes7.userData(" hi!=\"hi!\"", (java.lang.Object) attributes30);
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.lang.String str39 = attributes38.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList40 = attributes38.asList();
        org.jsoup.nodes.Attributes attributes43 = attributes38.put("", false);
        org.jsoup.nodes.Attribute attribute45 = attributes43.attribute("hi!");
        boolean boolean47 = attributes43.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        int int49 = attributes43.deduplicate(parseSettings48);
        org.jsoup.nodes.Attributes attributes51 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange53 = attributes51.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes54 = attributes43.sourceRange("", attributeRange53);
        java.lang.String str55 = attributes43.toString();
        org.jsoup.nodes.Attributes attributes56 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange58 = attributes56.sourceRange("hi!");
        boolean boolean60 = attributes56.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        int int62 = attributes56.deduplicate(parseSettings61);
        org.jsoup.nodes.Attributes attributes65 = attributes56.put("hi!", "");
        boolean boolean66 = attributes43.equals((java.lang.Object) attributes56);
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        int int70 = attributes68.deduplicate(parseSettings69);
        org.jsoup.nodes.Attributes attributes71 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange73 = attributes71.sourceRange("hi!");
        boolean boolean75 = attributes71.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        int int77 = attributes71.deduplicate(parseSettings76);
        org.jsoup.nodes.Attributes attributes79 = new org.jsoup.nodes.Attributes();
        boolean boolean81 = attributes79.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange83 = attributes79.sourceRange("");
        org.jsoup.nodes.Attributes attributes84 = attributes71.sourceRange("", attributeRange83);
        attributes68.addAll(attributes71);
        org.jsoup.nodes.Attributes attributes86 = new org.jsoup.nodes.Attributes();
        boolean boolean88 = attributes86.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator89 = attributes86.spliterator();
        attributes71.addAll(attributes86);
        java.lang.Object obj92 = attributes86.userData(" hi!=\"\"");
        org.jsoup.nodes.Range.AttributeRange attributeRange94 = attributes86.sourceRange(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes95 = attributes56.sourceRange(" _hi!_hi!_=\"hi!\"", attributeRange94);
        org.jsoup.nodes.Attributes attributes96 = attributes7.sourceRange("", attributeRange94);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeRange13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeList40);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNull(attribute45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(attributeRange53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(attributeRange58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(attributeRange73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(attributeRange83);
        org.junit.Assert.assertNotNull(attributes84);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator89);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(attributeRange94);
        org.junit.Assert.assertNotNull(attributes95);
        org.junit.Assert.assertNotNull(attributes96);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1100");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        org.jsoup.nodes.Attributes attributes10 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes10.add("", "");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange17 = attributes15.sourceRange("hi!");
        boolean boolean19 = attributes15.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        int int21 = attributes15.deduplicate(parseSettings20);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        boolean boolean25 = attributes23.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange27 = attributes23.sourceRange("");
        org.jsoup.nodes.Attributes attributes28 = attributes15.sourceRange("", attributeRange27);
        org.jsoup.nodes.Attributes attributes29 = attributes10.sourceRange("", attributeRange27);
        boolean boolean31 = attributes29.hasDeclaredValueForKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes34 = attributes29.put("", false);
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.lang.String str36 = attributes35.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes35.asList();
        org.jsoup.nodes.Attributes attributes40 = attributes35.put("", false);
        org.jsoup.nodes.Attributes attributes43 = attributes35.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange47 = attributes45.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes48 = attributes35.sourceRange("hi!", attributeRange47);
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        java.lang.String str50 = attributes49.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList51 = attributes49.asList();
        org.jsoup.nodes.Attributes attributes54 = attributes49.put("", false);
        org.jsoup.nodes.Attributes attributes57 = attributes49.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes59 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange61 = attributes59.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes62 = attributes49.sourceRange("hi!", attributeRange61);
        org.jsoup.nodes.Attribute attribute64 = attributes62.attribute("hi!");
        org.jsoup.nodes.Attributes attributes65 = attributes48.put(attribute64);
        org.jsoup.nodes.Attributes attributes66 = attributes34.put(attribute64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeRange17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeRange27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(attributeRange47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributeList51);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(attributeRange61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(attribute64);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(attributes66);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1101");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes9 = attributes4.userData("hi!", (java.lang.Object) "");
        attributes4.remove("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes4.spliterator();
        attributes4.removeIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange16 = attributes4.sourceRange("hi!");
        boolean boolean18 = attributes4.hasKeyIgnoreCase("hi!");
        attributes4.normalize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertNotNull(attributeRange16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1102");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        int int3 = attributes0.deduplicate(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        int int5 = attributes0.deduplicate(parseSettings4);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.lang.String str8 = attributes7.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes7.asList();
        java.lang.String str11 = attributes7.getIgnoreCase("hi!");
        java.lang.String str13 = attributes7.get("hi!");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes7.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes0.sourceRange("", attributeRange15);
        int int17 = attributes16.size();
        boolean boolean19 = attributes16.hasDeclaredValueForKeyIgnoreCase("hi!");
        boolean boolean21 = attributes16.hasKey(" hi!=\"\"");
        java.lang.Object obj23 = attributes16.userData(" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1103");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange4 = attributes0.sourceRange("");
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes0.addAll(attributes5);
        boolean boolean7 = attributes5.isEmpty();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.lang.String str9 = attributes8.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes8.asList();
        org.jsoup.nodes.Attributes attributes13 = attributes8.put("", false);
        org.jsoup.nodes.Attributes attributes16 = attributes8.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange20 = attributes18.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes21 = attributes8.sourceRange("hi!", attributeRange20);
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.lang.String str23 = attributes22.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes22.asList();
        org.jsoup.nodes.Attributes attributes27 = attributes22.put("", false);
        org.jsoup.nodes.Attributes attributes30 = attributes22.add("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange34 = attributes32.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes35 = attributes22.sourceRange("hi!", attributeRange34);
        org.jsoup.nodes.Attribute attribute37 = attributes35.attribute("hi!");
        org.jsoup.nodes.Attributes attributes38 = attributes21.put(attribute37);
        org.jsoup.nodes.Attribute attribute40 = attributes38.attribute("");
        attributes5.addAll(attributes38);
        org.jsoup.nodes.Attributes attributes44 = attributes38.add(" hi!=\"hi!\" _hi!_hi!_=\"hi!\"", " _hi!_hi!_=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator45 = attributes44.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeRange4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributeRange20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeRange34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attribute37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNull(attribute40);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributeSpliterator45);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1104");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        int int2 = attributes0.deduplicate(parseSettings1);
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange5 = attributes3.sourceRange("hi!");
        boolean boolean7 = attributes3.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        int int9 = attributes3.deduplicate(parseSettings8);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange15 = attributes11.sourceRange("");
        org.jsoup.nodes.Attributes attributes16 = attributes3.sourceRange("", attributeRange15);
        attributes0.addAll(attributes3);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        int int19 = attributes3.deduplicate(parseSettings18);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange22 = attributes20.sourceRange("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.lang.String str27 = attributes26.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes26.asList();
        org.jsoup.nodes.Attributes attributes29 = attributes20.userData("", (java.lang.Object) attributeList28);
        boolean boolean30 = attributes3.equals((java.lang.Object) attributeList28);
        java.lang.String str32 = attributes3.get(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes33 = attributes3.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeRange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeRange15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributeRange22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributeList28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1105");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange8 = attributes6.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes4.sourceRange("", attributeRange8);
        attributes9.removeIgnoreCase("hi!");
        java.lang.String str12 = attributes9.html();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeRange8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1106");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", true);
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("", true);
        java.lang.String str10 = attributes8.get("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange14 = attributes12.sourceRange("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes19 = attributes12.put("", false);
        attributes19.removeIgnoreCase(" hi!=\"\"");
        org.jsoup.nodes.Attributes attributes22 = attributes8.userData(" hi!=\"hi!\" hi!=\" hi!=&quot;hi!&quot;\"", (java.lang.Object) attributes19);
        boolean boolean24 = attributes8.hasKey(" hi!=\"hi!\" _hi!_hi!_=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeRange14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1107");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", false);
        org.jsoup.nodes.Attribute attribute7 = attributes5.attribute("hi!");
        boolean boolean9 = attributes5.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        int int11 = attributes5.deduplicate(parseSettings10);
        boolean boolean13 = attributes5.hasDeclaredValueForKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes16 = attributes5.put(" hi!=\"hi!\"", true);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.lang.String str19 = attributes18.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes18.asList();
        org.jsoup.nodes.Attributes attributes23 = attributes18.put("", false);
        org.jsoup.nodes.Attribute attribute25 = attributes23.attribute("hi!");
        boolean boolean26 = attributes23.isEmpty();
        org.jsoup.nodes.Attributes attributes27 = attributes16.userData(" hi!=\"\"", (java.lang.Object) attributes23);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.lang.String str29 = attributes28.html();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.lang.String str32 = attributes31.html();
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        int int34 = attributes31.deduplicate(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        int int36 = attributes31.deduplicate(parseSettings35);
        java.lang.String str38 = attributes31.get("hi!");
        org.jsoup.nodes.Attributes attributes39 = attributes28.userData("hi!", (java.lang.Object) str38);
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.lang.String str41 = attributes40.html();
        org.jsoup.nodes.Attributes attributes44 = attributes40.put("hi!", false);
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        boolean boolean48 = attributes46.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes49 = attributes44.userData("hi!", (java.lang.Object) "");
        boolean boolean51 = attributes49.hasKey(" hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        java.lang.String str53 = attributes52.html();
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        int int55 = attributes52.deduplicate(parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        int int57 = attributes52.deduplicate(parseSettings56);
        java.lang.String str59 = attributes52.get("hi!");
        org.jsoup.nodes.Attributes attributes62 = attributes52.add("hi!", "");
        attributes49.addAll(attributes52);
        boolean boolean64 = attributes39.equals((java.lang.Object) attributes49);
        attributes27.addAll(attributes39);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNull(attribute25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_038_Regression2.test1108");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str1 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList2 = attributes0.asList();
        java.lang.String str4 = attributes0.getIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        boolean boolean6 = attributes0.isEmpty();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        int int8 = attributes0.deduplicate(parseSettings7);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange12 = attributes10.sourceRange("hi!");
        java.lang.String str14 = attributes10.getIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes10.dataset();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.lang.String str18 = attributes17.html();
        org.jsoup.nodes.Attributes attributes21 = attributes17.put("hi!", false);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange25 = attributes23.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes26 = attributes21.sourceRange("", attributeRange25);
        org.jsoup.nodes.Attributes attributes27 = attributes26.clone();
        org.jsoup.nodes.Attributes attributes30 = attributes27.add("", "");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange34 = attributes32.sourceRange("hi!");
        boolean boolean36 = attributes32.hasKeyIgnoreCase("");
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        int int38 = attributes32.deduplicate(parseSettings37);
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        boolean boolean42 = attributes40.hasKeyIgnoreCase("");
        org.jsoup.nodes.Range.AttributeRange attributeRange44 = attributes40.sourceRange("");
        org.jsoup.nodes.Attributes attributes45 = attributes32.sourceRange("", attributeRange44);
        org.jsoup.nodes.Attributes attributes46 = attributes27.sourceRange("", attributeRange44);
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        java.lang.String str49 = attributes48.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList50 = attributes48.asList();
        org.jsoup.nodes.Attributes attributes53 = attributes48.put("", false);
        org.jsoup.nodes.Attribute attribute55 = attributes53.attribute("hi!");
        boolean boolean57 = attributes53.hasDeclaredValueForKey("hi!");
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        int int59 = attributes53.deduplicate(parseSettings58);
        org.jsoup.nodes.Attributes attributes61 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Range.AttributeRange attributeRange63 = attributes61.sourceRange("hi!");
        org.jsoup.nodes.Attributes attributes64 = attributes53.sourceRange("", attributeRange63);
        org.jsoup.nodes.Attributes attributes65 = attributes27.sourceRange("", attributeRange63);
        org.jsoup.nodes.Attributes attributes66 = attributes10.sourceRange("", attributeRange63);
        java.lang.String str67 = attributes66.toString();
        org.jsoup.nodes.Attributes attributes68 = attributes0.userData(" hi!=\"\"", (java.lang.Object) attributes66);
        boolean boolean69 = attributes66.isEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(attributeList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(attributeRange12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(attributeRange25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributeRange34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributeRange44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributeList50);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNull(attribute55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(attributeRange63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }
}

