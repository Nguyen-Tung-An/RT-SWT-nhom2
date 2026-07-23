package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ElementRegressionTest1 {

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
            System.out.format("%n%s%n", "ElementRegressionTest1.test501");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Range range10 = element1.endSourceRange();
        org.jsoup.nodes.Element element12 = element1.removeClass("hi!");
        org.jsoup.parser.Tag tag13 = element1.tag;
        java.lang.String str14 = element1.cssSelector();
        element1.setBaseUri("[]");
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream17 = element1.nodeStream();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi\\!" + "'", str14, "hi\\!");
        org.junit.Assert.assertNotNull(nodeStream17);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test502");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        boolean boolean13 = element12.hasText();
        org.jsoup.nodes.Element element14 = element12.previousElementSibling();
        org.jsoup.nodes.Element element15 = element12.shallowClone();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test503");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        java.lang.String str3 = element1.wholeOwnText();
        org.jsoup.nodes.Element element5 = element1.removeAttr("");
        org.jsoup.nodes.Element element8 = element1.attr("", true);
        java.lang.String str9 = element8.text();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element8.siblingNodes();
        org.jsoup.nodes.Element element11 = element8.empty();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "<hi! class=\"hi!\"></hi!>", "<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element8.classNames((java.util.Set<java.lang.String>) strSet17);
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "<hi! class=\"hi!\"></hi!>", "<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test504");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.lang.String str12 = element1.nodeValue();
        org.jsoup.nodes.Node[] nodeArray13 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList14 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14, nodeArray13);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator16 = nodeList14.spliterator();
        org.jsoup.nodes.Node[] nodeArray17 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList18 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18, nodeArray17);
        boolean boolean20 = nodeList18.isEmpty();
        java.lang.Object[] objArray21 = nodeList18.toArray();
        boolean boolean22 = nodeList14.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18);
        org.jsoup.nodes.Node[] nodeArray23 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList24 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24, nodeArray23);
        boolean boolean26 = nodeList24.isEmpty();
        java.lang.Object[] objArray27 = nodeList24.toArray();
        boolean boolean29 = nodeList24.remove((java.lang.Object) "hi!");
        boolean boolean30 = nodeList14.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        org.jsoup.nodes.Element element31 = element1.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        boolean boolean33 = element1.hasSameValue((java.lang.Object) (short) 100);
        org.jsoup.nodes.Element element35 = element1.append("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator16);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test505");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator3 = nodeList1.spliterator();
        org.jsoup.nodes.Node[] nodeArray4 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList5 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5, nodeArray4);
        boolean boolean7 = nodeList5.isEmpty();
        java.lang.Object[] objArray8 = nodeList5.toArray();
        boolean boolean9 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5);
        java.lang.Object obj10 = null;
        boolean boolean11 = nodeList1.contains(obj10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = nodeList1.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test506");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = element1.children();
        org.jsoup.nodes.Element element14 = element1.closest("hi\\!");
        org.jsoup.nodes.Node node15 = element1.lastSibling();
        boolean boolean16 = org.jsoup.nodes.Element.preserveWhitespace(node15);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test507");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean8 = element7.hasChildNodes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test508");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean10 = element5.elementIs("", "hi!");
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValueMatching("<hi!></hi!>", pattern12);
        boolean boolean15 = element5.parentNameIs("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element5.append("");
        int int18 = element5.siblingIndex();
        org.jsoup.nodes.Element element20 = element5.tagName("hi\\!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test509");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator3 = nodeList1.spliterator();
        org.jsoup.nodes.Node[] nodeArray4 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList5 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5, nodeArray4);
        boolean boolean7 = nodeList5.isEmpty();
        java.lang.Object[] objArray8 = nodeList5.toArray();
        boolean boolean9 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5);
        org.jsoup.nodes.Node[] nodeArray10 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList11 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList11, nodeArray10);
        boolean boolean13 = nodeList11.isEmpty();
        java.lang.Object[] objArray14 = nodeList11.toArray();
        boolean boolean16 = nodeList11.remove((java.lang.Object) "hi!");
        boolean boolean17 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList11);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element19.dataset();
        boolean boolean21 = element19.hasChildNodes();
        org.jsoup.nodes.Element element23 = element19.appendText("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        int int26 = nodeList11.indexOf((java.lang.Object) element23);
        java.lang.String str27 = element23.wholeOwnText();
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertArrayEquals(nodeArray10, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test510");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        java.lang.String str3 = element1.wholeOwnText();
        org.jsoup.nodes.Element element5 = element1.removeAttr("");
        org.jsoup.nodes.Element element8 = element1.attr("", true);
        java.lang.String str9 = element8.nodeName();
        org.jsoup.select.Elements elements11 = element8.getElementsContainingText("/baseUri");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element8.childNodesCopy();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator13 = element8.spliterator();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(elementSpliterator13);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test511");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.lang.String str12 = element1.nodeValue();
        org.jsoup.nodes.Element element14 = element1.tagName("hi!");
        org.jsoup.select.Elements elements16 = element1.getElementsMatchingOwnText("<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test512");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        boolean boolean13 = element1.hasParent();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = element15.dataset();
        boolean boolean17 = element15.hasChildNodes();
        org.jsoup.nodes.Element element19 = element15.addClass("hi!");
        org.jsoup.parser.Tag tag20 = element15.tag;
        element1.tag = tag20;
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag20, "hi!");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = element26.dataset();
        boolean boolean28 = element26.hasChildNodes();
        org.jsoup.nodes.Element element30 = element26.appendText("");
        boolean boolean31 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList33 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList33, nodeArray32);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator35 = nodeList33.spliterator();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = element38.dataset();
        boolean boolean40 = element38.hasChildNodes();
        org.jsoup.nodes.Element element42 = element38.addClass("hi!");
        org.jsoup.nodes.Element element43 = element38.shallowClone();
        org.jsoup.select.Elements elements44 = element43.parents();
        nodeList33.add((int) (short) 0, (org.jsoup.nodes.Node) element43);
        org.jsoup.nodes.Attributes attributes46 = element43.attributes;
        element26.attributes = attributes46;
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag20, "hi!", attributes46);
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag20, "[]");
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag20, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator35);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test513");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean10 = element5.elementIs("", "hi!");
        java.lang.String str11 = element5.wholeOwnText();
        org.jsoup.select.Elements elements12 = element5.parents();
        org.jsoup.nodes.Node node13 = element5.lastSibling();
        boolean boolean14 = element5.hasValidChildren();
        org.jsoup.select.Nodes<org.jsoup.nodes.Node> nodeList16 = element5.selectNodes("hi\\!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test514");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element("", "");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test515");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        java.util.List<java.lang.String> strList13 = element12.classList();
        org.jsoup.select.Elements elements14 = element12.previousElementSiblings();
        org.jsoup.select.Elements elements15 = element12.previousElementSiblings();
        org.jsoup.nodes.Element.NodeList nodeList17 = new org.jsoup.nodes.Element.NodeList((int) (byte) 100);
        element12.childNodes = nodeList17;
        java.util.Iterator<org.jsoup.nodes.Node> nodeItor19 = nodeList17.iterator();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeItor19);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test516");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        org.jsoup.nodes.Document document3 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.attr("", false);
        org.jsoup.nodes.Element element7 = element6.lastElementChild();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.html("/baseUri");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test517");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("/baseUri");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test518");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        org.jsoup.nodes.Element element15 = element12.appendElement("hi!", "[]");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueNot("hi!", "/baseUri");
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test519");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        org.jsoup.nodes.Element element4 = element1.val("");
        org.jsoup.nodes.Element element5 = element4.root();
        org.jsoup.nodes.Element element8 = element4.tagName("hi\\!", "hi\\!");
        org.jsoup.nodes.Element element11 = element4.attr("hi!", false);
        int int12 = element11.childNodeSize();
        org.jsoup.nodes.Attributes attributes13 = element11.attributes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test520");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator3 = nodeList1.spliterator();
        org.jsoup.nodes.Node[] nodeArray4 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList5 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5, nodeArray4);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream7 = nodeList5.parallelStream();
        java.lang.Object obj8 = nodeList5.clone();
        boolean boolean9 = nodeList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5);
        int int11 = nodeList1.lastIndexOf((java.lang.Object) (-1L));
        nodeList1.ensureCapacity((int) (byte) 10);
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeStream7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test521");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = element1.children();
        org.jsoup.nodes.Element element14 = element1.closest("hi\\!");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueNot("<hi! class=\"hi!\"></hi!>", "");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        element19.remove();
        org.jsoup.nodes.Document document21 = element19.ownerDocument();
        org.jsoup.nodes.Element element24 = element19.attr("", false);
        org.jsoup.nodes.Element element25 = element24.lastElementChild();
        org.jsoup.select.Elements elements26 = element24.getAllElements();
        org.jsoup.nodes.Element element27 = element14.appendChild((org.jsoup.nodes.Node) element24);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test522");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str8 = element1.attr("");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueMatching("[]", pattern10);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test523");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        boolean boolean3 = nodeList1.isEmpty();
        java.lang.Object[] objArray4 = nodeList1.toArray();
        int int6 = nodeList1.lastIndexOf((java.lang.Object) 1L);
        org.jsoup.nodes.Node[] nodeArray7 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList8 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList8, nodeArray7);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator10 = nodeList8.spliterator();
        boolean boolean11 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList8);
        boolean boolean13 = nodeList1.equals((java.lang.Object) (-1));
        boolean boolean14 = nodeList1.isEmpty();
        java.lang.Object obj15 = nodeList1.clone();
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertArrayEquals(nodeArray7, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[]");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test524");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "");
        int int7 = element1.siblingIndex();
        java.lang.String str8 = element1.wholeText();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test525");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        org.jsoup.select.Evaluator evaluator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element12.closest(evaluator13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test526");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        java.util.List<java.lang.String> strList13 = element12.classList();
        org.jsoup.nodes.Element element14 = element12.clearAttributes();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor15 = element14.iterator();
        java.lang.String str16 = element14.data();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        boolean boolean20 = element18.hasChildNodes();
        org.jsoup.nodes.Element element22 = element18.addClass("hi!");
        boolean boolean24 = element18.hasClass("");
        boolean boolean25 = element18.hasText();
        org.jsoup.nodes.Element.NodeList nodeList26 = element18.childNodes;
        org.jsoup.nodes.Element element27 = element14.prependChild((org.jsoup.nodes.Node) element18);
        java.lang.String str28 = element27.data();
        org.jsoup.nodes.Element element29 = element27.clone();
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueMatching("", "hi\\!");
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test527");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingText("");
        java.lang.String str9 = element1.wholeText();
        org.jsoup.nodes.Element element11 = element1.prependText("/baseUri");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (byte) 100);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test528");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.select.Elements elements6 = element5.nextElementSiblings();
        java.lang.String str7 = element5.data();
        org.jsoup.nodes.Element element8 = element5.clearAttributes();
        boolean boolean9 = element5.hasChildNodes();
        boolean boolean10 = element5.hasText();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test529");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        org.jsoup.select.Elements elements7 = element6.parents();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        boolean boolean9 = element6.hasParent();
        org.jsoup.nodes.Element element11 = element6.append("hi!");
        boolean boolean13 = element6.parentNameIs("hi!");
        element6.reindexChildren();
        org.jsoup.select.Elements elements16 = element6.getElementsByAttributeStarting("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test530");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Node node6 = element1.lastChild();
        java.lang.String str7 = element1.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element1.childNodesCopy();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test531");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean10 = element5.elementIs("", "hi!");
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValueMatching("<hi!></hi!>", pattern12);
        org.jsoup.nodes.Element element15 = element5.getElementById("<hi!></hi!>");
        org.jsoup.nodes.Node[] nodeArray16 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList17 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList17, nodeArray16);
        boolean boolean19 = nodeList17.isEmpty();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = element21.dataset();
        boolean boolean23 = element21.hasChildNodes();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element21.classNames((java.util.Set<java.lang.String>) strSet26);
        boolean boolean29 = element21.isBlock();
        java.lang.String str31 = element21.absUrl("hi!");
        org.jsoup.select.Elements elements32 = element21.children();
        org.jsoup.nodes.Element element34 = element21.closest("hi\\!");
        boolean boolean35 = nodeList17.add((org.jsoup.nodes.Node) element34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = element15.hasSameValue((java.lang.Object) boolean35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test532");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.util.List<org.jsoup.nodes.Element> elementList4 = element1.cachedChildren();
        org.jsoup.nodes.Element element6 = element1.tagName("hi!");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element8.dataset();
        boolean boolean10 = element8.hasChildNodes();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = element8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element16 = element1.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element19 = element1.attr("hi!", "<hi! class=\"hi!\"></hi!>");
        element1.setBaseUri("hi\\!");
        org.jsoup.select.Elements elements22 = element1.parents();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test533");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.lang.String str12 = element1.nodeValue();
        org.jsoup.nodes.Element element14 = element1.tagName("hi!");
        element1.invalidateChildren();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test534");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.select.Elements elements6 = element5.nextElementSiblings();
        java.lang.String str7 = element5.data();
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.select.Elements elements10 = element5.parents();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element5.ensureChildNodes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test535");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Node[] nodeArray6 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList7 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList7, nodeArray6);
        boolean boolean9 = nodeList7.isEmpty();
        java.lang.Object[] objArray10 = nodeList7.toArray();
        org.jsoup.nodes.Element element11 = element5.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList7);
        java.lang.String str12 = element11.html();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = element11.textNodes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(textNodeList13);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test536");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.select.Elements elements6 = element5.nextElementSiblings();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        element8.remove();
        org.jsoup.select.Elements elements11 = element8.getElementsContainingOwnText("hi!");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList12 = element8.dataNodes();
        org.jsoup.nodes.Node[] nodeArray13 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList14 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14, nodeArray13);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator16 = nodeList14.spliterator();
        org.jsoup.nodes.Node[] nodeArray17 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList18 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18, nodeArray17);
        boolean boolean20 = nodeList18.isEmpty();
        java.lang.Object[] objArray21 = nodeList18.toArray();
        boolean boolean22 = nodeList14.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18);
        java.lang.Object obj23 = nodeList18.clone();
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator24 = nodeList18.spliterator();
        org.jsoup.nodes.Element.NodeList nodeList26 = new org.jsoup.nodes.Element.NodeList((int) (short) 10);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = element28.childNodes();
        boolean boolean30 = nodeList26.remove((java.lang.Object) element28);
        boolean boolean31 = nodeList18.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList26);
        element8.childNodes = nodeList26;
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        boolean boolean36 = element34.hasChildNodes();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = element34.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap44 = element43.dataset();
        boolean boolean45 = element43.hasChildNodes();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.jsoup.nodes.Element element50 = element43.classNames((java.util.Set<java.lang.String>) strSet48);
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap53 = element52.dataset();
        boolean boolean54 = element52.hasChildNodes();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.jsoup.nodes.Element element59 = element52.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = element61.dataset();
        boolean boolean63 = element61.hasChildNodes();
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        org.jsoup.nodes.Element element68 = element61.classNames((java.util.Set<java.lang.String>) strSet66);
        java.util.HashSet[] hashSetArray70 = new java.util.HashSet[4];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[] strSetArray71 = (java.util.HashSet<java.lang.String>[]) hashSetArray70;
        strSetArray71[0] = strSet39;
        strSetArray71[1] = strSet48;
        strSetArray71[2] = strSet57;
        strSetArray71[3] = strSet66;
        java.util.HashSet<java.lang.String>[] strSetArray80 = nodeList26.toArray(strSetArray71);
        org.jsoup.nodes.Element element82 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap83 = element82.dataset();
        boolean boolean84 = element82.hasChildNodes();
        org.jsoup.nodes.Element element86 = element82.appendText("");
        element86.doSetBaseUri("hi!");
        org.jsoup.nodes.Element.NodeList nodeList90 = new org.jsoup.nodes.Element.NodeList((int) (byte) 100);
        nodeList90.validChildren = false;
        nodeList90.clear();
        boolean boolean94 = element86.equals((java.lang.Object) nodeList90);
        boolean boolean95 = nodeList26.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList90);
        org.jsoup.nodes.Element element96 = element5.prependChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList90);
        java.lang.Object obj97 = nodeList90.clone();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(dataNodeList12);
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator16);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertNotNull(nodeSpliterator24);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(hashSetArray70);
        org.junit.Assert.assertNotNull(strSetArray71);
        org.junit.Assert.assertNotNull(strSetArray80);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(element96);
        org.junit.Assert.assertNotNull(obj97);
        org.junit.Assert.assertEquals(obj97.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj97), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj97), "[]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test537");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean10 = element5.elementIs("", "hi!");
        org.jsoup.select.Elements elements12 = element5.getElementsContainingText("hi!");
        java.lang.String str13 = element5.data();
        org.jsoup.nodes.Element element15 = element5.removeAttr("");
        boolean boolean17 = element5.nameIs("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element19 = element5.prependText("");
        org.jsoup.nodes.Element element21 = element5.val("<hi!></hi!>");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test538");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Range range10 = element1.endSourceRange();
        org.jsoup.nodes.Element element12 = element1.removeClass("hi!");
        org.jsoup.parser.Tag tag13 = element1.tag;
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = element16.dataset();
        boolean boolean18 = element16.hasChildNodes();
        org.jsoup.nodes.Element element20 = element16.appendText("");
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList23 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList23, nodeArray22);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator25 = nodeList23.spliterator();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = element28.dataset();
        boolean boolean30 = element28.hasChildNodes();
        org.jsoup.nodes.Element element32 = element28.addClass("hi!");
        org.jsoup.nodes.Element element33 = element28.shallowClone();
        org.jsoup.select.Elements elements34 = element33.parents();
        nodeList23.add((int) (short) 0, (org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Attributes attributes36 = element33.attributes;
        element16.attributes = attributes36;
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag13, "/baseUri", attributes36);
        org.jsoup.select.Elements elements40 = element38.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean41 = element38.hasChildNodes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator25);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test539");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator3 = nodeList1.spliterator();
        org.jsoup.nodes.Node[] nodeArray4 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList5 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5, nodeArray4);
        boolean boolean7 = nodeList5.isEmpty();
        java.lang.Object[] objArray8 = nodeList5.toArray();
        boolean boolean9 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5);
        org.jsoup.nodes.Node[] nodeArray10 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList11 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList11, nodeArray10);
        boolean boolean13 = nodeList11.isEmpty();
        java.lang.Object[] objArray14 = nodeList11.toArray();
        boolean boolean16 = nodeList11.remove((java.lang.Object) "hi!");
        boolean boolean17 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList11);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element19.dataset();
        boolean boolean21 = element19.hasChildNodes();
        org.jsoup.nodes.Element element23 = element19.appendText("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        int int26 = nodeList11.indexOf((java.lang.Object) element23);
        org.jsoup.nodes.Element element28 = element23.appendElement("hi!");
        boolean boolean31 = element28.elementIs("hi!", "");
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertArrayEquals(nodeArray10, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test540");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        org.jsoup.nodes.Element element7 = element1.clone();
        org.jsoup.select.Elements elements9 = element1.getElementsByIndexEquals((int) (byte) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element1.childNodes();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element12.dataset();
        boolean boolean14 = element12.hasChildNodes();
        org.jsoup.nodes.Element element16 = element12.addClass("hi!");
        org.jsoup.nodes.Element element17 = element12.shallowClone();
        org.jsoup.select.Elements elements18 = element17.parents();
        org.jsoup.select.Elements elements19 = element17.getAllElements();
        boolean boolean20 = element17.hasParent();
        org.jsoup.nodes.Element element22 = element17.append("hi!");
        org.jsoup.nodes.Element.NodeList nodeList24 = new org.jsoup.nodes.Element.NodeList((int) (byte) 100);
        nodeList24.validChildren = false;
        nodeList24.clear();
        boolean boolean28 = element22.equals((java.lang.Object) nodeList24);
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList30 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList30, nodeArray29);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator32 = nodeList30.spliterator();
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList34 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList34, nodeArray33);
        boolean boolean36 = nodeList34.isEmpty();
        java.lang.Object[] objArray37 = nodeList34.toArray();
        boolean boolean38 = nodeList30.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList34);
        java.lang.Object obj39 = nodeList34.clone();
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator40 = nodeList34.spliterator();
        java.lang.Object obj41 = null;
        int int42 = nodeList34.indexOf(obj41);
        org.jsoup.nodes.Element element43 = element22.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList34);
        org.jsoup.nodes.Element element45 = element43.tagName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element43);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "[]");
        org.junit.Assert.assertNotNull(nodeSpliterator40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test541");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        java.lang.String str11 = element1.absUrl("hi!");
        org.jsoup.select.Elements elements12 = element1.children();
        org.jsoup.nodes.Element element14 = element1.closest("hi\\!");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueNot("<hi! class=\"hi!\"></hi!>", "");
        element14.invalidateChildren();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test542");
        org.jsoup.nodes.Element.NodeList nodeList1 = new org.jsoup.nodes.Element.NodeList((int) '#');
        nodeList1.validChildren = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = nodeList1.remove(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test543");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        boolean boolean13 = element1.hasParent();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = element15.dataset();
        boolean boolean17 = element15.hasChildNodes();
        org.jsoup.nodes.Element element19 = element15.addClass("hi!");
        org.jsoup.parser.Tag tag20 = element15.tag;
        element1.tag = tag20;
        org.jsoup.select.Elements elements22 = element1.nextElementSiblings();
        boolean boolean23 = element1.hasValidChildren();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test544");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        element5.doSetBaseUri("hi!");
        org.jsoup.nodes.Element.NodeList nodeList9 = new org.jsoup.nodes.Element.NodeList((int) (byte) 100);
        nodeList9.validChildren = false;
        nodeList9.clear();
        boolean boolean13 = element5.equals((java.lang.Object) nodeList9);
        java.util.Iterator<org.jsoup.nodes.Node> nodeItor14 = nodeList9.iterator();
        nodeList9.validChildren = false;
        nodeList9.clear();
        int int18 = nodeList9.modCount();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeItor14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test545");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator3 = nodeList1.spliterator();
        org.jsoup.nodes.Node[] nodeArray4 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList5 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5, nodeArray4);
        boolean boolean7 = nodeList5.isEmpty();
        java.lang.Object[] objArray8 = nodeList5.toArray();
        boolean boolean9 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5);
        java.lang.Object obj10 = null;
        boolean boolean11 = nodeList1.contains(obj10);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream12 = nodeList1.parallelStream();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element14.childNodes();
        org.jsoup.nodes.Document document16 = element14.ownerDocument();
        org.jsoup.select.Elements elements17 = element14.getAllElements();
        java.lang.String str18 = element14.baseUri();
        boolean boolean19 = nodeList1.contains((java.lang.Object) element14);
        org.jsoup.nodes.Node[] nodeArray20 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList21 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList21, nodeArray20);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator23 = nodeList21.spliterator();
        org.jsoup.nodes.Node[] nodeArray24 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList25 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList25, nodeArray24);
        boolean boolean27 = nodeList25.isEmpty();
        java.lang.Object[] objArray28 = nodeList25.toArray();
        boolean boolean29 = nodeList21.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList25);
        java.lang.Object[] objArray30 = nodeList21.toArray();
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream31 = nodeList21.parallelStream();
        java.util.AbstractList[] abstractListArray33 = new java.util.AbstractList[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<org.jsoup.nodes.Node>[] nodeListArray34 = (java.util.AbstractList<org.jsoup.nodes.Node>[]) abstractListArray33;
        java.util.AbstractList<org.jsoup.nodes.Node>[] nodeListArray35 = nodeList21.toArray(nodeListArray34);
        int int37 = nodeList21.indexOf((java.lang.Object) 10L);
        boolean boolean38 = nodeList1.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList21);
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeStream12);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertArrayEquals(nodeArray20, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(nodeStream31);
        org.junit.Assert.assertNotNull(abstractListArray33);
        org.junit.Assert.assertArrayEquals(abstractListArray33, new java.util.AbstractList[] {});
        org.junit.Assert.assertNotNull(nodeListArray34);
        org.junit.Assert.assertArrayEquals(nodeListArray34, new java.util.AbstractList[] {});
        org.junit.Assert.assertNotNull(nodeListArray35);
        org.junit.Assert.assertArrayEquals(nodeListArray35, new java.util.AbstractList[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test546");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Node[] nodeArray6 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList7 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList7, nodeArray6);
        boolean boolean9 = nodeList7.isEmpty();
        java.lang.Object[] objArray10 = nodeList7.toArray();
        org.jsoup.nodes.Element element11 = element5.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList7);
        org.jsoup.nodes.Element element12 = element5.clone();
        java.lang.String str13 = element12.baseUri();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test547");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        boolean boolean3 = element1.hasText();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        boolean boolean7 = element5.hasChildNodes();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = element5.classNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = element5.isBlock();
        org.jsoup.nodes.Range range14 = element5.endSourceRange();
        org.jsoup.nodes.Element element16 = element5.removeClass("hi!");
        org.jsoup.parser.Tag tag17 = element5.tag;
        java.lang.String str18 = element5.cssSelector();
        element5.setBaseUri("[]");
        org.jsoup.nodes.Element element22 = element5.addClass("hi!");
        org.jsoup.select.Elements elements23 = element5.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element1.after((org.jsoup.nodes.Node) element5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi\\!" + "'", str18, "hi\\!");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test548");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.parser.Tag tag6 = element1.tag;
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag6, "", attributes8);
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        org.jsoup.nodes.Node node11 = element9.nextSibling();
        org.jsoup.select.Elements elements12 = element9.nextElementSiblings();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test549");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean10 = element5.elementIs("", "hi!");
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValueMatching("<hi!></hi!>", pattern12);
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.childNodes();
        boolean boolean17 = element15.isBlock();
        org.jsoup.nodes.Node[] nodeArray19 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList20 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList20, nodeArray19);
        boolean boolean22 = nodeList20.isEmpty();
        java.lang.Object[] objArray23 = nodeList20.toArray();
        boolean boolean25 = nodeList20.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element26 = element15.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList20);
        boolean boolean27 = element15.hasParent();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        boolean boolean31 = element29.hasChildNodes();
        org.jsoup.nodes.Element element33 = element29.addClass("hi!");
        org.jsoup.parser.Tag tag34 = element29.tag;
        element15.tag = tag34;
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag34, "hi!");
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = element40.dataset();
        boolean boolean42 = element40.hasChildNodes();
        org.jsoup.nodes.Element element44 = element40.appendText("");
        boolean boolean45 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element40);
        org.jsoup.nodes.Node[] nodeArray46 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList47 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList47, nodeArray46);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator49 = nodeList47.spliterator();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap53 = element52.dataset();
        boolean boolean54 = element52.hasChildNodes();
        org.jsoup.nodes.Element element56 = element52.addClass("hi!");
        org.jsoup.nodes.Element element57 = element52.shallowClone();
        org.jsoup.select.Elements elements58 = element57.parents();
        nodeList47.add((int) (short) 0, (org.jsoup.nodes.Node) element57);
        org.jsoup.nodes.Attributes attributes60 = element57.attributes;
        element40.attributes = attributes60;
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag34, "hi!", attributes60);
        org.jsoup.nodes.Element element63 = element5.tag(tag34);
        org.jsoup.nodes.Element element64 = element63.parentElement();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertArrayEquals(nodeArray46, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator49);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNull(element64);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test550");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean10 = element5.elementIs("", "hi!");
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element5.getElementsByAttributeValueMatching("<hi!></hi!>", pattern12);
        boolean boolean15 = element5.parentNameIs("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element5.append("");
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueMatching("<hi! class=\"hi!\"></hi!>", "/baseUri");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test551");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        org.jsoup.nodes.Document document3 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document3.prependElement("/baseUri");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test552");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.lang.String str12 = element1.nodeValue();
        org.jsoup.nodes.Element element14 = element1.tagName("hi!");
        org.jsoup.nodes.Element element16 = element1.closest("hi\\!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValue("<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>", "/baseUri");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test553");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        element7.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.childNodes();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = element7.iterator();
        org.jsoup.select.Elements elements12 = element7.getAllElements();
        org.jsoup.select.Elements elements15 = element7.getElementsByAttributeValue("/baseUri", "<hi!></hi!>");
        java.lang.String str16 = element7.ownText();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test554");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        element7.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.childNodes();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = element7.iterator();
        org.jsoup.select.Elements elements12 = element7.getAllElements();
        org.jsoup.nodes.Attributes attributes13 = element7.attributes;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test555");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        java.lang.String str3 = element1.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test556");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        element5.doSetBaseUri("hi!");
        org.jsoup.nodes.Element.NodeList nodeList9 = new org.jsoup.nodes.Element.NodeList((int) (byte) 100);
        nodeList9.validChildren = false;
        nodeList9.clear();
        boolean boolean13 = element5.equals((java.lang.Object) nodeList9);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream14 = nodeList9.parallelStream();
        int int15 = nodeList9.modCount();
        org.jsoup.nodes.Node[] nodeArray16 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList17 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList17, nodeArray16);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream19 = nodeList17.parallelStream();
        java.lang.Object obj20 = nodeList17.clone();
        boolean boolean21 = nodeList9.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList17);
        java.util.function.UnaryOperator<org.jsoup.nodes.Node> nodeUnaryOperator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeList17.replaceAll(nodeUnaryOperator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeStream19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test557");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        boolean boolean3 = nodeList1.isEmpty();
        java.lang.Object[] objArray4 = nodeList1.toArray();
        int int6 = nodeList1.lastIndexOf((java.lang.Object) 1L);
        org.jsoup.nodes.Node[] nodeArray7 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList8 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList8, nodeArray7);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator10 = nodeList8.spliterator();
        boolean boolean11 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList8);
        boolean boolean13 = nodeList1.equals((java.lang.Object) (-1));
        boolean boolean14 = nodeList1.isEmpty();
        org.jsoup.nodes.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeList1.add(4, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertArrayEquals(nodeArray7, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test558");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        org.jsoup.nodes.Document document3 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.attr("", false);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element8.dataset();
        boolean boolean10 = element8.hasChildNodes();
        org.jsoup.nodes.Element element12 = element8.appendText("");
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Node[] nodeArray14 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList15 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList15, nodeArray14);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator17 = nodeList15.spliterator();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        boolean boolean22 = element20.hasChildNodes();
        org.jsoup.nodes.Element element24 = element20.addClass("hi!");
        org.jsoup.nodes.Element element25 = element20.shallowClone();
        org.jsoup.select.Elements elements26 = element25.parents();
        nodeList15.add((int) (short) 0, (org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Attributes attributes28 = element25.attributes;
        element8.attributes = attributes28;
        element1.attributes = attributes28;
        boolean boolean32 = element1.hasClass("hi\\!");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator33 = element1.spliterator();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elementSpliterator33);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test559");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        org.jsoup.nodes.Node[] nodeArray12 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList13 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList13, nodeArray12);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator15 = nodeList13.spliterator();
        boolean boolean16 = element11.hasSameValue((java.lang.Object) nodeList13);
        org.jsoup.nodes.Element element18 = element11.prepend("hi!");
        java.lang.String str19 = element18.id();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test560");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.select.Elements elements10 = element1.getElementsByAttribute("hi!");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = element1.spliterator();
        element1.remove();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = element14.dataset();
        boolean boolean16 = element14.hasChildNodes();
        org.jsoup.nodes.Element element18 = element14.addClass("hi!");
        boolean boolean20 = element14.hasClass("");
        java.lang.String str21 = element14.id();
        org.jsoup.nodes.Element element22 = element14.empty();
        org.jsoup.nodes.Node[] nodeArray23 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList24 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24, nodeArray23);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator26 = nodeList24.spliterator();
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList28 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList28, nodeArray27);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator30 = nodeList28.spliterator();
        int int31 = nodeList24.indexOf((java.lang.Object) nodeSpliterator30);
        org.jsoup.nodes.Element element32 = element14.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        nodeList24.ensureCapacity((-1));
        org.jsoup.nodes.Element element35 = element1.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = element37.dataset();
        boolean boolean39 = element37.hasChildNodes();
        org.jsoup.nodes.Element element41 = element37.appendText("");
        org.jsoup.nodes.Element element43 = element41.removeClass("");
        boolean boolean46 = element41.elementIs("", "hi!");
        org.jsoup.select.Elements elements48 = element41.getElementsContainingText("hi!");
        java.lang.Class<?> wildcardClass49 = elements48.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class<?>[] wildcardClassArray55 = nodeList24.toArray(wildcardClassArray52);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator26);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { null });
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertArrayEquals(wildcardClassArray55, new java.lang.Class[] { null });
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test561");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str8 = element1.attr("");
        org.jsoup.nodes.Element element9 = element1.firstElementSibling();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodesCopy();
        org.jsoup.nodes.Element element14 = element1.appendChild((org.jsoup.nodes.Node) element12);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = element16.dataset();
        boolean boolean18 = element16.hasChildNodes();
        org.jsoup.nodes.Element element20 = element16.appendText("");
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        org.jsoup.select.Elements elements23 = element16.getElementsMatchingText("");
        java.lang.String str24 = element16.wholeText();
        org.jsoup.nodes.Element element26 = element16.prependText("/baseUri");
        element12.replaceWith((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element28 = element26.root();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = element30.dataset();
        boolean boolean32 = element30.hasChildNodes();
        org.jsoup.nodes.Element element34 = element30.addClass("hi!");
        org.jsoup.parser.Tag tag35 = element30.tag;
        element26.tag = tag35;
        java.util.List<org.jsoup.nodes.TextNode> textNodeList37 = element26.textNodes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(textNodeList37);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test562");
        org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element2.childNodesCopy();
        org.jsoup.nodes.Element element5 = element2.val("/baseUri");
        java.lang.String str7 = element5.attr("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Element> elementList8 = element5.cachedChildren();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(elementList8);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test563");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.lang.String str12 = element1.nodeValue();
        org.jsoup.nodes.Element element14 = element1.tagName("hi!");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList15 = element14.dataNodes();
        java.lang.String str17 = org.jsoup.nodes.Element.searchUpForAttribute(element14, "<hi! class=\"hi!\"></hi!>");
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element14.getElementsMatchingOwnText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.jdkPattern\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(dataNodeList15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test564");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Range range10 = element1.endSourceRange();
        org.jsoup.nodes.Element element12 = element1.removeClass("hi!");
        org.jsoup.select.Elements elements13 = element12.previousElementSiblings();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test565");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.siblingNodes();
        org.jsoup.nodes.Element element13 = element11.parent();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test566");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator3 = nodeList1.spliterator();
        org.jsoup.nodes.Node[] nodeArray4 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList5 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5, nodeArray4);
        boolean boolean7 = nodeList5.isEmpty();
        java.lang.Object[] objArray8 = nodeList5.toArray();
        boolean boolean9 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5);
        org.jsoup.nodes.Node[] nodeArray10 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList11 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList11, nodeArray10);
        boolean boolean13 = nodeList11.isEmpty();
        java.lang.Object[] objArray14 = nodeList11.toArray();
        boolean boolean16 = nodeList11.remove((java.lang.Object) "hi!");
        boolean boolean17 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList11);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = element19.dataset();
        boolean boolean21 = element19.hasChildNodes();
        org.jsoup.nodes.Element element23 = element19.appendText("");
        org.jsoup.nodes.Element element25 = element23.removeClass("");
        int int26 = nodeList11.indexOf((java.lang.Object) element23);
        org.jsoup.nodes.Element element28 = element23.appendElement("hi!");
        org.jsoup.nodes.Element element30 = element23.removeAttr("hi!");
        java.lang.String str31 = element23.wholeOwnText();
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertArrayEquals(nodeArray10, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test567");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        boolean boolean3 = element1.hasText();
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator8 = nodeList6.spliterator();
        org.jsoup.nodes.Node[] nodeArray9 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList10 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList10, nodeArray9);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator12 = nodeList10.spliterator();
        int int13 = nodeList6.indexOf((java.lang.Object) nodeSpliterator12);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream14 = nodeList6.stream();
        org.jsoup.nodes.Node[] nodeArray15 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList16 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList16, nodeArray15);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator18 = nodeList16.spliterator();
        org.jsoup.nodes.Node[] nodeArray19 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList20 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList20, nodeArray19);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream22 = nodeList20.parallelStream();
        java.lang.Object obj23 = nodeList20.clone();
        boolean boolean24 = nodeList16.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList20);
        boolean boolean25 = nodeList6.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList20);
        org.jsoup.nodes.Element element26 = element1.prependChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator8);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertArrayEquals(nodeArray9, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(nodeStream14);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator18);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeStream22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test568");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator3 = nodeList1.spliterator();
        org.jsoup.nodes.Node[] nodeArray4 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList5 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5, nodeArray4);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream7 = nodeList5.parallelStream();
        java.lang.Object obj8 = nodeList5.clone();
        boolean boolean9 = nodeList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList5);
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        element11.remove();
        org.jsoup.nodes.Document document13 = element11.ownerDocument();
        org.jsoup.nodes.Element element16 = element11.attr("", false);
        boolean boolean17 = nodeList5.remove((java.lang.Object) element16);
        nodeList5.clear();
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator3);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeStream7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test569");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Node node6 = element1.lastChild();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element1.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test570");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.select.Elements elements6 = element5.nextElementSiblings();
        java.lang.String str7 = element5.data();
        int int8 = element5.elementSiblingIndex();
        org.jsoup.nodes.Node node9 = element5.previousSibling();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.childNodes();
        boolean boolean13 = element11.isBlock();
        org.jsoup.nodes.Node[] nodeArray15 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList16 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList16, nodeArray15);
        boolean boolean18 = nodeList16.isEmpty();
        java.lang.Object[] objArray19 = nodeList16.toArray();
        boolean boolean21 = nodeList16.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element22 = element11.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList16);
        boolean boolean23 = element11.hasParent();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        boolean boolean27 = element25.hasChildNodes();
        org.jsoup.nodes.Element element29 = element25.addClass("hi!");
        org.jsoup.parser.Tag tag30 = element25.tag;
        element11.tag = tag30;
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag30, "hi!");
        element5.tag = tag30;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element5.siblingNodes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test571");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Node[] nodeArray6 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList7 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList7, nodeArray6);
        boolean boolean9 = nodeList7.isEmpty();
        java.lang.Object[] objArray10 = nodeList7.toArray();
        org.jsoup.nodes.Element element11 = element5.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList7);
        org.jsoup.nodes.Element element12 = element5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Nodes<org.jsoup.nodes.Node> nodeList14 = element12.selectNodes("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test572");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        java.lang.String str3 = element1.wholeOwnText();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator4 = element1.spliterator();
        org.jsoup.nodes.Node node5 = element1.firstChild();
        java.lang.String str6 = element1.ownText();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elementSpliterator4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test573");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        element7.setBaseUri("hi!");
        org.jsoup.select.Elements elements10 = element7.children();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodes();
        java.lang.String str14 = element12.wholeOwnText();
        org.jsoup.nodes.Element element16 = element12.removeAttr("");
        boolean boolean17 = element7.equals((java.lang.Object) "");
        org.jsoup.select.Evaluator evaluator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element7.closest(evaluator18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test574");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        boolean boolean3 = element1.hasText();
        java.lang.String str4 = element1.data();
        element1.remove();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test575");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        boolean boolean3 = nodeList1.isEmpty();
        java.lang.Object[] objArray4 = nodeList1.toArray();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream8 = nodeList6.parallelStream();
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream9 = nodeList6.parallelStream();
        boolean boolean10 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        int int11 = nodeList6.size();
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeStream8);
        org.junit.Assert.assertNotNull(nodeStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test576");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingText("");
        java.lang.String str9 = element1.wholeText();
        org.jsoup.nodes.Element element11 = element1.prependText("/baseUri");
        java.util.List<org.jsoup.nodes.Element> elementList12 = element11.childElementsList();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elementList12);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test577");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        boolean boolean13 = element1.hasParent();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = element15.dataset();
        boolean boolean17 = element15.hasChildNodes();
        org.jsoup.nodes.Element element19 = element15.addClass("hi!");
        org.jsoup.parser.Tag tag20 = element15.tag;
        element1.tag = tag20;
        org.jsoup.select.Elements elements22 = element1.nextElementSiblings();
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream23 = element1.nodeStream();
        org.jsoup.select.Elements elements26 = element1.getElementsByAttributeValueMatching("<hi!></hi!>", "");
        org.jsoup.nodes.Node node27 = element1.parentNode();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(nodeStream23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test578");
        org.jsoup.nodes.Node[] nodeArray0 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList1 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList1, nodeArray0);
        boolean boolean3 = nodeList1.isEmpty();
        java.lang.Object[] objArray4 = nodeList1.toArray();
        int int6 = nodeList1.lastIndexOf((java.lang.Object) 1L);
        org.jsoup.nodes.Node[] nodeArray7 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList8 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList8, nodeArray7);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator10 = nodeList8.spliterator();
        boolean boolean11 = nodeList1.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList8);
        boolean boolean13 = nodeList1.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = nodeList1.subList((int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray0);
        org.junit.Assert.assertArrayEquals(nodeArray0, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertArrayEquals(nodeArray7, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test579");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        java.util.List<java.lang.String> strList13 = element12.classList();
        org.jsoup.nodes.Element element14 = element12.clearAttributes();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor15 = element14.iterator();
        java.lang.String str16 = element14.data();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        boolean boolean20 = element18.hasChildNodes();
        org.jsoup.nodes.Element element22 = element18.addClass("hi!");
        boolean boolean24 = element18.hasClass("");
        boolean boolean25 = element18.hasText();
        org.jsoup.nodes.Element.NodeList nodeList26 = element18.childNodes;
        org.jsoup.nodes.Element element27 = element14.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Evaluator evaluator28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = element27.select(evaluator28);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test580");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        java.lang.String str8 = element7.id();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test581");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element1.siblingNodes();
        int int14 = element1.elementSiblingIndex();
        org.jsoup.nodes.Element element16 = element1.prependText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements18 = element16.getElementsMatchingText("<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test582");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str8 = element1.attr("");
        org.jsoup.nodes.Element element9 = element1.firstElementSibling();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodesCopy();
        org.jsoup.nodes.Element element14 = element1.appendChild((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements16 = element1.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element19 = element1.attr("<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>", false);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test583");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        boolean boolean6 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        org.jsoup.select.Elements elements7 = element1.parents();
        org.jsoup.select.Elements elements8 = element1.children();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        boolean boolean12 = element10.hasChildNodes();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = element10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element18 = element1.classNames((java.util.Set<java.lang.String>) strSet15);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test584");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        element5.doSetBaseUri("hi!");
        org.jsoup.nodes.Node[] nodeArray9 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList10 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList10, nodeArray9);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator12 = nodeList10.spliterator();
        org.jsoup.nodes.Node[] nodeArray13 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList14 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14, nodeArray13);
        boolean boolean16 = nodeList14.isEmpty();
        java.lang.Object[] objArray17 = nodeList14.toArray();
        boolean boolean18 = nodeList10.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14);
        java.lang.Object[] objArray19 = nodeList10.toArray();
        org.jsoup.nodes.Element element20 = element5.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Node>) nodeList10);
        org.jsoup.nodes.Element element22 = element20.appendText("<hi!></hi!>");
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element25.childNodes();
        boolean boolean27 = element25.isBlock();
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList30 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList30, nodeArray29);
        boolean boolean32 = nodeList30.isEmpty();
        java.lang.Object[] objArray33 = nodeList30.toArray();
        boolean boolean35 = nodeList30.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element36 = element25.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList30);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element25.siblingNodes();
        int int38 = element25.elementSiblingIndex();
        org.jsoup.nodes.Element element40 = element25.prependText("<hi! class=\"hi!\"></hi!>");
        boolean boolean41 = element22.equals((java.lang.Object) element25);
        org.jsoup.select.Elements elements42 = element22.nextElementSiblings();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertArrayEquals(nodeArray9, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test585");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.text("[]");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element8.childNodes();
        boolean boolean10 = element8.isBlock();
        org.jsoup.nodes.Node[] nodeArray12 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList13 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList13, nodeArray12);
        boolean boolean15 = nodeList13.isEmpty();
        java.lang.Object[] objArray16 = nodeList13.toArray();
        boolean boolean18 = nodeList13.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element19 = element8.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList13);
        boolean boolean20 = element8.hasParent();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = element22.dataset();
        boolean boolean24 = element22.hasChildNodes();
        org.jsoup.nodes.Element element26 = element22.addClass("hi!");
        org.jsoup.parser.Tag tag27 = element22.tag;
        element8.tag = tag27;
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag27, "hi!");
        element6.tag = tag27;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test586");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.select.Elements elements6 = element5.nextElementSiblings();
        java.lang.String str7 = element5.data();
        org.jsoup.nodes.Element element8 = element5.clearAttributes();
        boolean boolean9 = element5.hasChildNodes();
        boolean boolean10 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.nodes.Document document11 = element5.ownerDocument();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test587");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        org.jsoup.select.Elements elements7 = element6.parents();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        boolean boolean9 = element6.hasParent();
        org.jsoup.nodes.Element element11 = element6.append("hi!");
        org.jsoup.nodes.Element.NodeList nodeList13 = new org.jsoup.nodes.Element.NodeList((int) (byte) 100);
        nodeList13.validChildren = false;
        nodeList13.clear();
        boolean boolean17 = element11.equals((java.lang.Object) nodeList13);
        boolean boolean18 = element11.hasValidChildren();
        org.jsoup.nodes.Element element19 = element11.lastElementSibling();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test588");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.util.List<org.jsoup.nodes.Element> elementList4 = element1.cachedChildren();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueMatching("hi\\!", "<hi! class=\"hi!\"></hi!>");
        java.lang.String str8 = element1.baseUri();
        java.lang.String str9 = element1.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element1.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Index must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test589");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        boolean boolean7 = element1.hasClass("");
        boolean boolean8 = element1.hasText();
        org.jsoup.nodes.Element.NodeList nodeList9 = element1.childNodes;
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = element11.dataset();
        boolean boolean13 = element11.hasChildNodes();
        org.jsoup.nodes.Element element15 = element11.appendText("");
        org.jsoup.nodes.Element element17 = element15.removeClass("");
        int int18 = element17.attributesSize();
        org.jsoup.select.Elements elements19 = element17.children();
        boolean boolean20 = nodeList9.contains((java.lang.Object) elements19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Node> nodeItor22 = nodeList9.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test590");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        java.lang.String str3 = element1.nodeName();
        element1.reindexChildren();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = element6.dataset();
        boolean boolean8 = element6.hasChildNodes();
        org.jsoup.nodes.Element element10 = element6.appendText("");
        org.jsoup.nodes.Element element12 = element10.removeClass("");
        element12.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element12.childNodes();
        org.jsoup.nodes.Element element16 = element12.shallowClone();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        boolean boolean20 = element18.hasChildNodes();
        org.jsoup.nodes.Element element22 = element18.addClass("hi!");
        org.jsoup.nodes.Element element23 = element18.shallowClone();
        java.lang.String str25 = element18.attr("");
        org.jsoup.nodes.Element element26 = element18.firstElementSibling();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element29.childNodesCopy();
        org.jsoup.nodes.Element element31 = element18.appendChild((org.jsoup.nodes.Node) element29);
        org.jsoup.select.Elements elements33 = element18.getElementsContainingOwnText("");
        org.jsoup.parser.Tag tag34 = element18.tag();
        element16.tag = tag34;
        element1.tag = tag34;
        org.jsoup.nodes.Element element38 = element1.getElementById("<hi! class=\"hi!\"></hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNull(element38);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test591");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        org.jsoup.select.Elements elements7 = element6.parents();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        element9.remove();
        org.jsoup.select.Elements elements12 = element9.getElementsContainingOwnText("hi!");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList13 = element9.dataNodes();
        org.jsoup.nodes.Node[] nodeArray14 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList15 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList15, nodeArray14);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator17 = nodeList15.spliterator();
        org.jsoup.nodes.Node[] nodeArray18 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList19 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList19, nodeArray18);
        boolean boolean21 = nodeList19.isEmpty();
        java.lang.Object[] objArray22 = nodeList19.toArray();
        boolean boolean23 = nodeList15.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList19);
        java.lang.Object obj24 = nodeList19.clone();
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator25 = nodeList19.spliterator();
        org.jsoup.nodes.Element.NodeList nodeList27 = new org.jsoup.nodes.Element.NodeList((int) (short) 10);
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = element29.childNodes();
        boolean boolean31 = nodeList27.remove((java.lang.Object) element29);
        boolean boolean32 = nodeList19.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList27);
        element9.childNodes = nodeList27;
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = element35.dataset();
        boolean boolean37 = element35.hasChildNodes();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.jsoup.nodes.Element element42 = element35.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = element44.dataset();
        boolean boolean46 = element44.hasChildNodes();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.jsoup.nodes.Element element51 = element44.classNames((java.util.Set<java.lang.String>) strSet49);
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap54 = element53.dataset();
        boolean boolean55 = element53.hasChildNodes();
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        org.jsoup.nodes.Element element60 = element53.classNames((java.util.Set<java.lang.String>) strSet58);
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = element62.dataset();
        boolean boolean64 = element62.hasChildNodes();
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        org.jsoup.nodes.Element element69 = element62.classNames((java.util.Set<java.lang.String>) strSet67);
        java.util.HashSet[] hashSetArray71 = new java.util.HashSet[4];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[] strSetArray72 = (java.util.HashSet<java.lang.String>[]) hashSetArray71;
        strSetArray72[0] = strSet40;
        strSetArray72[1] = strSet49;
        strSetArray72[2] = strSet58;
        strSetArray72[3] = strSet67;
        java.util.HashSet<java.lang.String>[] strSetArray81 = nodeList27.toArray(strSetArray72);
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap84 = element83.dataset();
        boolean boolean85 = element83.hasChildNodes();
        org.jsoup.nodes.Element element87 = element83.appendText("");
        element87.doSetBaseUri("hi!");
        org.jsoup.nodes.Element.NodeList nodeList91 = new org.jsoup.nodes.Element.NodeList((int) (byte) 100);
        nodeList91.validChildren = false;
        nodeList91.clear();
        boolean boolean95 = element87.equals((java.lang.Object) nodeList91);
        boolean boolean96 = nodeList27.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList91);
        java.lang.Object[] objArray97 = nodeList91.toArray();
        element6.childNodes = nodeList91;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertArrayEquals(nodeArray18, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertNotNull(nodeSpliterator25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertNotNull(hashSetArray71);
        org.junit.Assert.assertNotNull(strSetArray72);
        org.junit.Assert.assertNotNull(strSetArray81);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertArrayEquals(objArray97, new java.lang.Object[] {});
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test592");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.lang.String str12 = element1.nodeValue();
        org.jsoup.nodes.Node[] nodeArray13 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList14 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14, nodeArray13);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator16 = nodeList14.spliterator();
        org.jsoup.nodes.Node[] nodeArray17 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList18 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18, nodeArray17);
        boolean boolean20 = nodeList18.isEmpty();
        java.lang.Object[] objArray21 = nodeList18.toArray();
        boolean boolean22 = nodeList14.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18);
        org.jsoup.nodes.Node[] nodeArray23 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList24 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24, nodeArray23);
        boolean boolean26 = nodeList24.isEmpty();
        java.lang.Object[] objArray27 = nodeList24.toArray();
        boolean boolean29 = nodeList24.remove((java.lang.Object) "hi!");
        boolean boolean30 = nodeList14.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        org.jsoup.nodes.Element element31 = element1.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList32 = element1.textNodes();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream33 = element1.stream();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator16);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(textNodeList32);
        org.junit.Assert.assertNotNull(elementStream33);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test593");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.util.List<org.jsoup.nodes.Element> elementList4 = element1.cachedChildren();
        int int5 = element1.childNodeSize();
        org.jsoup.select.Elements elements7 = element1.getElementsMatchingOwnText("/baseUri");
        element1.invalidateChildren();
        org.jsoup.nodes.Node node9 = element1.firstSibling();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test594");
        org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = element2.childNodesCopy();
        org.jsoup.nodes.Element element5 = element2.val("/baseUri");
        org.jsoup.nodes.Element element7 = element2.tagName("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test595");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        boolean boolean7 = element1.hasClass("");
        boolean boolean8 = element1.hasText();
        java.lang.String str10 = element1.absUrl("<hi!></hi!>");
        org.jsoup.nodes.Element element11 = element1.clone();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test596");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsMatchingText("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test597");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        element7.setBaseUri("hi!");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream10 = element7.stream();
        org.jsoup.nodes.Element element12 = element7.addClass("");
        org.jsoup.nodes.Element element13 = element7.shallowClone();
        boolean boolean14 = element13.hasText();
        org.jsoup.nodes.Element element16 = element13.prependText("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elementStream10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test598");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        java.lang.String str4 = element1.nodeName();
        org.jsoup.nodes.Element element6 = element1.removeAttr("");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueEnding("<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>", "<hi! class=\"hi!\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test599");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.select.Elements elements6 = element5.nextElementSiblings();
        java.lang.String str7 = element5.data();
        org.jsoup.nodes.Element element8 = element5.clearAttributes();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test600");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        java.util.List<java.lang.String> strList13 = element12.classList();
        org.jsoup.nodes.Element element14 = element12.clearAttributes();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor15 = element14.iterator();
        java.lang.String str16 = element14.data();
        java.lang.String str17 = element14.normalName();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test601");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        element7.setBaseUri("hi!");
        org.jsoup.select.Elements elements10 = element7.children();
        element7.remove();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test602");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        element5.doSetBaseUri("hi!");
        org.jsoup.nodes.Node[] nodeArray9 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList10 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList10, nodeArray9);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator12 = nodeList10.spliterator();
        org.jsoup.nodes.Node[] nodeArray13 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList14 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14, nodeArray13);
        boolean boolean16 = nodeList14.isEmpty();
        java.lang.Object[] objArray17 = nodeList14.toArray();
        boolean boolean18 = nodeList10.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14);
        java.lang.Object[] objArray19 = nodeList10.toArray();
        org.jsoup.nodes.Element element20 = element5.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Node>) nodeList10);
        org.jsoup.nodes.Element element22 = element20.appendText("<hi!></hi!>");
        element22.remove();
        org.jsoup.nodes.Element.NodeList nodeList25 = new org.jsoup.nodes.Element.NodeList((int) (short) 10);
        nodeList25.validChildren = true;
        element22.childNodes = nodeList25;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertArrayEquals(nodeArray9, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test603");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Element element11 = element1.text("hi!");
        java.lang.String str12 = element1.nodeValue();
        org.jsoup.nodes.Node[] nodeArray13 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList14 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList14, nodeArray13);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator16 = nodeList14.spliterator();
        org.jsoup.nodes.Node[] nodeArray17 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList18 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18, nodeArray17);
        boolean boolean20 = nodeList18.isEmpty();
        java.lang.Object[] objArray21 = nodeList18.toArray();
        boolean boolean22 = nodeList14.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList18);
        org.jsoup.nodes.Node[] nodeArray23 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList24 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24, nodeArray23);
        boolean boolean26 = nodeList24.isEmpty();
        java.lang.Object[] objArray27 = nodeList24.toArray();
        boolean boolean29 = nodeList24.remove((java.lang.Object) "hi!");
        boolean boolean30 = nodeList14.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        org.jsoup.nodes.Element element31 = element1.appendChildren((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        org.jsoup.nodes.Element element34 = element31.tagName("/baseUri", "/baseUri");
        org.jsoup.select.Evaluator evaluator35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = element34.is(evaluator35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.Evaluator.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)\" because \"evaluator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator16);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test604");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        boolean boolean10 = element5.elementIs("", "hi!");
        org.jsoup.select.Elements elements12 = element5.getElementsContainingText("hi!");
        java.lang.String str13 = element5.data();
        org.jsoup.nodes.Element element15 = element5.removeAttr("");
        boolean boolean17 = element5.nameIs("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element19 = element5.prependText("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList20 = element5.dataNodes();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(dataNodeList20);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test605");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = element1.classNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = element1.isBlock();
        org.jsoup.nodes.Range range10 = element1.endSourceRange();
        org.jsoup.nodes.Element element12 = element1.removeClass("hi!");
        org.jsoup.parser.Tag tag13 = element1.tag;
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = element16.dataset();
        boolean boolean18 = element16.hasChildNodes();
        org.jsoup.nodes.Element element20 = element16.appendText("");
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element16);
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList23 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList23, nodeArray22);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator25 = nodeList23.spliterator();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = element28.dataset();
        boolean boolean30 = element28.hasChildNodes();
        org.jsoup.nodes.Element element32 = element28.addClass("hi!");
        org.jsoup.nodes.Element element33 = element28.shallowClone();
        org.jsoup.select.Elements elements34 = element33.parents();
        nodeList23.add((int) (short) 0, (org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Attributes attributes36 = element33.attributes;
        element16.attributes = attributes36;
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag13, "/baseUri", attributes36);
        org.jsoup.select.Elements elements40 = element38.getElementsByIndexLessThan((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements42 = element38.selectXpath("<hi! class=\"hi!\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not evaluate XPath query [<hi! class=\"hi!\"></hi!>]: javax.xml.transform.TransformerException: A location path was expected, but the following token was encountered:  <");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator25);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test606");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        boolean boolean7 = element1.hasClass("");
        boolean boolean8 = element1.hasText();
        org.jsoup.nodes.Element.NodeList nodeList9 = element1.childNodes;
        nodeList9.validChildren = true;
        boolean boolean12 = nodeList9.validChildren;
        nodeList9.incrementMod();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test607");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        element1.remove();
        org.jsoup.nodes.Document document3 = element1.ownerDocument();
        org.jsoup.nodes.Element element6 = element1.attr("", false);
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element8.dataset();
        boolean boolean10 = element8.hasChildNodes();
        org.jsoup.nodes.Element element12 = element8.appendText("");
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element8);
        org.jsoup.nodes.Node[] nodeArray14 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList15 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList15, nodeArray14);
        java.util.Spliterator<org.jsoup.nodes.Node> nodeSpliterator17 = nodeList15.spliterator();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        boolean boolean22 = element20.hasChildNodes();
        org.jsoup.nodes.Element element24 = element20.addClass("hi!");
        org.jsoup.nodes.Element element25 = element20.shallowClone();
        org.jsoup.select.Elements elements26 = element25.parents();
        nodeList15.add((int) (short) 0, (org.jsoup.nodes.Node) element25);
        org.jsoup.nodes.Attributes attributes28 = element25.attributes;
        element8.attributes = attributes28;
        element1.attributes = attributes28;
        java.lang.String str32 = element1.attr("[]");
        element1.remove();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator17);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test608");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.select.Elements elements6 = element1.getElementsByAttributeValueEnding("hi!", "");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = element8.dataset();
        boolean boolean10 = element8.hasChildNodes();
        org.jsoup.nodes.Element element12 = element8.addClass("hi!");
        org.jsoup.nodes.Element element13 = element8.shallowClone();
        java.lang.String str15 = element8.attr("");
        org.jsoup.nodes.Element element16 = element8.firstElementSibling();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element19.childNodesCopy();
        org.jsoup.nodes.Element element21 = element8.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements23 = element8.getElementsContainingOwnText("");
        org.jsoup.parser.Tag tag24 = element8.tag();
        org.jsoup.nodes.Element element25 = element1.tag(tag24);
        org.jsoup.nodes.Attributes attributes26 = element25.attributes();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test609");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = element9.dataset();
        boolean boolean11 = element9.hasChildNodes();
        org.jsoup.nodes.Element element13 = element9.appendText("");
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.select.Elements elements15 = element9.parents();
        boolean boolean16 = element5.hasSameValue((java.lang.Object) element9);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test610");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        java.lang.String str3 = element1.wholeOwnText();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator4 = element1.spliterator();
        org.jsoup.nodes.Attributes attributes5 = element1.attributes;
        java.lang.Class<?> wildcardClass6 = element1.getClass();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elementSpliterator4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test611");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = element1.childNodes();
        boolean boolean3 = element1.isBlock();
        org.jsoup.nodes.Node[] nodeArray5 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList6 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList6, nodeArray5);
        boolean boolean8 = nodeList6.isEmpty();
        java.lang.Object[] objArray9 = nodeList6.toArray();
        boolean boolean11 = nodeList6.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element12 = element1.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList6);
        java.util.List<java.lang.String> strList13 = element12.classList();
        org.jsoup.nodes.Element element14 = element12.clearAttributes();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor15 = element14.iterator();
        java.lang.String str16 = element14.data();
        org.jsoup.nodes.Attributes attributes17 = element14.attributes;
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(attributes17);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test612");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str8 = element1.attr("");
        org.jsoup.nodes.Element element9 = element1.firstElementSibling();
        org.jsoup.nodes.Element element10 = element9.parentElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test613");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        org.jsoup.nodes.Element element4 = element1.val("");
        org.jsoup.nodes.Element element5 = element4.root();
        org.jsoup.select.Evaluator evaluator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Nodes<org.jsoup.nodes.Node> nodeList7 = element5.selectNodes(evaluator6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test614");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.addClass("hi!");
        org.jsoup.nodes.Element element6 = element1.shallowClone();
        java.lang.String str8 = element1.attr("");
        org.jsoup.nodes.Element element9 = element1.firstElementSibling();
        org.jsoup.nodes.Element element10 = element1.clone();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.jdkPattern\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ElementRegressionTest1.test615");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = element1.dataset();
        boolean boolean3 = element1.hasChildNodes();
        org.jsoup.nodes.Element element5 = element1.appendText("");
        org.jsoup.nodes.Element element7 = element5.removeClass("");
        element7.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element7.childNodes();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = element7.iterator();
        org.jsoup.select.Elements elements12 = element7.getAllElements();
        org.jsoup.select.Elements elements13 = element7.parents();
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element7.getElementsByAttributeValueMatching("hi\\!", pattern15);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
    }
}

