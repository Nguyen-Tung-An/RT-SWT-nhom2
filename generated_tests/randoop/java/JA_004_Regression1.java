import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_004_Regression1 {

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
            System.out.format("%n%s%n", "JA_004_Regression1.test501");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test502");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withTrim(false);
        java.lang.String[] strArray15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder21 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder21.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder21.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode28 = null;
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder21.setQuoteMode(quoteMode28);
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setRecordSeparator('a');
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder29.setHeaderComments(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat20.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder8.setHeaderComments(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test503");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test504");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim(false);
        java.lang.String[] strArray10 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        boolean boolean16 = cSVFormat3.equals((java.lang.Object) cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test505");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test506");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withDelimiter('a');
        boolean boolean5 = cSVFormat4.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode6 = cSVFormat4.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode6 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode6.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test507");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withDelimiter('a');
        boolean boolean13 = cSVFormat4.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withAutoFlush(false);
        boolean boolean18 = cSVFormat17.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test508");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(',');
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeader(resultSet5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test509");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.toString();
        java.lang.String str2 = cSVFormat0.getNullString();
        boolean boolean3 = cSVFormat0.isNullStringSet();
        java.lang.String str4 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test510");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat1.printer();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.String str5 = cSVFormat4.toString();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat4.println(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVPrinter2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false> EmptyLines:ignored SkipHeaderRecord:false" + "'", str5, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test511");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVPrinter3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test512");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<??> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test513");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str7 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat6.builder();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withHeader(resultSetMetaData18);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 10, objArray9, cSVFormat14, cSVFormat19 };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withHeaderComments(objArray20);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode22 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuote('4');
        boolean boolean27 = cSVFormat24.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, [], Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode22 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode22.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test514");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(true);
        boolean boolean12 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test515");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        boolean boolean7 = cSVFormat6.getTrim();
        boolean boolean8 = cSVFormat6.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test516");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder4.build();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder4.setMaxRows((long) 100);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrailingDelimiter();
        boolean boolean14 = cSVFormat13.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str16 = cSVFormat15.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder17 = cSVFormat15.builder();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setMaxRows((long) (short) 100);
        java.lang.String[] strArray27 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder19.setHeaderComments(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder4.setHeaderComments(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test517");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test518");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withDelimiter('a');
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat3.print((java.lang.Object) cSVFormat9, appendable12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(char)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test519");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test520");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter(',');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean5 = cSVFormat3.isNullStringSet();
        boolean boolean6 = cSVFormat3.getLenientEof();
        long long7 = cSVFormat3.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test521");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder4.build();
        boolean boolean8 = cSVFormat7.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test522");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test523");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test524");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(true);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrim();
        boolean boolean21 = cSVFormat20.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str23 = cSVFormat22.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder24 = cSVFormat22.builder();
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setMaxRows((long) (short) 100);
        java.lang.String[] strArray34 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder26.setHeaderComments(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat20.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder17.setHeaderComments(strArray34);
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder8.setHeaderComments(strArray34);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test525");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean7 = cSVFormat6.getAutoFlush();
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat6.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withHeader(resultSet13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test526");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker((java.lang.Character) 'a');
        java.lang.Appendable appendable11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('#');
        java.lang.Character char14 = cSVFormat13.getEscapeCharacter();
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withHeader(resultSet15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str18 = cSVFormat17.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder19 = cSVFormat17.builder();
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder26 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder26.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode33 = null;
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder26.setQuoteMode(quoteMode33);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder34.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = builder36.build();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode38 = cSVFormat37.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder25.setDuplicateHeaderMode(duplicateHeaderMode38);
        org.apache.commons.csv.CSVFormat.Builder builder40 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder40.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder40.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder40.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder50.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder50.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder55 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder55.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder57.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder57.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder57.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder64 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder66 = builder64.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder68 = builder64.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder70 = builder64.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder72 = builder64.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder73 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder75 = builder73.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder77 = builder73.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder79 = builder73.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode80 = null;
        org.apache.commons.csv.CSVFormat.Builder builder81 = builder73.setQuoteMode(quoteMode80);
        org.apache.commons.csv.CSVFormat.Builder builder83 = builder81.setRecordSeparator('a');
        java.lang.String[] strArray84 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder85 = builder81.setHeaderComments(strArray84);
        org.apache.commons.csv.CSVFormat.Builder builder86 = builder64.setHeaderComments(strArray84);
        org.apache.commons.csv.CSVFormat.Builder builder87 = builder63.setHeaderComments(strArray84);
        org.apache.commons.csv.CSVFormat.Builder builder88 = builder50.setHeader(strArray84);
        org.apache.commons.csv.CSVFormat.Builder builder89 = builder39.setHeaderComments(strArray84);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat16.withHeader(strArray84);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat10.printRecord(appendable11, (java.lang.Object[]) strArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode38 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode38.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(cSVFormat90);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test527");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        char char9 = cSVFormat8.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat8);
        java.lang.Character char11 = cSVFormat8.getQuoteCharacter();
        boolean boolean12 = cSVFormat8.getLenientEof();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test528");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowDuplicateHeaderNames();
        java.lang.Appendable appendable10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder31 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder33.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder33.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder33.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder40 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder40.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder40.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder40.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder40.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder49 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder49.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder49.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder55 = builder49.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode56 = null;
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder49.setQuoteMode(quoteMode56);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder57.setRecordSeparator('a');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder57.setHeaderComments(strArray60);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder40.setHeaderComments(strArray60);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder39.setHeaderComments(strArray60);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder30.setHeader(strArray60);
        org.apache.commons.csv.CSVFormat.Builder builder65 = builder15.setHeaderComments(strArray60);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat9.printRecord(appendable10, (java.lang.Object[]) strArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test529");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator(' ');
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSet7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setLenientEof(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test530");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str14 = cSVFormat13.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder15 = cSVFormat13.builder();
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setHeaderComments(objArray16);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder15.setIgnoreEmptyLines(false);
        java.sql.ResultSet resultSet22 = null;
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder15.setHeader(resultSet22);
        org.apache.commons.csv.CSVFormat.Builder builder24 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder26.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder33 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder33.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder33.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder33.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder33.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder42 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder42.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder42.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder42.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode49 = null;
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder42.setQuoteMode(quoteMode49);
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder50.setRecordSeparator('a');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder50.setHeaderComments(strArray53);
        org.apache.commons.csv.CSVFormat.Builder builder55 = builder33.setHeaderComments(strArray53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder32.setHeaderComments(strArray53);
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder23.setHeaderComments(strArray53);
        java.lang.String str58 = cSVFormat12.format((java.lang.Object[]) strArray53);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "," + "'", str58, ",");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test531");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat0.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test532");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setMaxRows((long) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test533");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        char char9 = cSVFormat8.getDelimiter();
        java.lang.String str10 = cSVFormat8.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test534");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str7 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat6.builder();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withHeader(resultSetMetaData18);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 10, objArray9, cSVFormat14, cSVFormat19 };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, [], Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test535");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test536");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test537");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        java.lang.String[] strArray5 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrim(false);
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.newEncoder()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test538");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('a');
        org.apache.commons.csv.CSVFormat.Builder builder14 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder14.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder14.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder14.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setAllowMissingColumnNames(false);
        boolean boolean25 = cSVFormat13.equals((java.lang.Object) builder22);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder22.setRecordSeparator('\"');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test539");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder13.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder24.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder24.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder24.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder33 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder33.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder33.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder33.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode40 = null;
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder33.setQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder41.setRecordSeparator('a');
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder41.setHeaderComments(strArray44);
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder24.setHeaderComments(strArray44);
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder23.setHeaderComments(strArray44);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder8.setHeaderComments(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test540");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setTrailingData(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test541");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder10.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder10.setQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setRecordSeparator('a');
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setHeaderComments(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withQuote((java.lang.Character) ' ');
        java.sql.ResultSet resultSet28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(resultSet28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat24.withRecordSeparator("");
        boolean boolean32 = cSVFormat9.equals((java.lang.Object) cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test542");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) 10);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(resultSet13);
        boolean boolean15 = cSVFormat12.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression1.test543");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat6 = predefined5.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withDelimiter('4');
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode12 = cSVFormat7.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder4.setDuplicateHeaderMode(duplicateHeaderMode12);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode12 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode12.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder13);
    }
}

